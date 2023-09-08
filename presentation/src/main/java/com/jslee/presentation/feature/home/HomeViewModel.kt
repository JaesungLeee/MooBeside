package com.jslee.presentation.feature.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.jslee.domain.usecase.GetNowPlayingMovieUseCase
import com.jslee.domain.usecase.GetPopularMovieUseCase
import com.jslee.presentation.feature.home.model.BannerUiModel
import com.jslee.domain.usecase.GetUpComingMovieUseCase
import com.jslee.presentation.feature.home.model.item.HomeListItem
import com.jslee.presentation.feature.home.model.mapToBannerUiModel
import com.jslee.presentation.feature.home.model.mapToNowPlayingUiModel
import com.jslee.presentation.feature.home.model.mapToUpComingUiModel
import com.jslee.presentation.feature.home.model.toBannerUiModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch
import javax.inject.Inject

/**
 * MooBeside
 * @author jaesung
 * @created 2023/08/19
 */
@HiltViewModel
class HomeViewModel @Inject constructor(
    getPopularMovieUseCase: GetPopularMovieUseCase,
    getNowPlayingMovieUseCase: GetNowPlayingMovieUseCase,
    getUpcomingMovieUseCase: GetUpComingMovieUseCase,
) : ViewModel() {

    private val _homeUiState: MutableStateFlow<HomeUiState> = MutableStateFlow(HomeUiState.Loading)
    val homeUiState = _homeUiState.asStateFlow()

    private val _errorFlow: MutableSharedFlow<Throwable> = MutableSharedFlow<Throwable>()
    val errorFlow = _errorFlow.asSharedFlow()

    val banner = getPopularMovieUseCase.invoke().map { movieList ->
        movieList.map { it.toBannerUiModel() }
    }.stateIn(
        viewModelScope,
        SharingStarted.WhileSubscribed(5000L),
        List(BANNER_COUNT) { BannerUiModel.default() }
    )

    private val popularMoviesFlow: Flow<List<HomeListItem>> =
        getPopularMovieUseCase().map { it.mapToBannerUiModel() }

    private val nowPlayingMoviesFlow: Flow<List<HomeListItem>> =
        getNowPlayingMovieUseCase.getSnapshot().map { it.mapToNowPlayingUiModel() }

    private val upComingMoviesFlow: Flow<List<HomeListItem>> =
        getUpcomingMovieUseCase.getSnapshot().map { it.mapToUpComingUiModel() }


//    val nowPlayingMovies = getNowPlayingMovieUseCase.getSnapshot().map { movieList ->
//        movieList.map { it.toNowPlayingUiModel() }
//    }.stateIn(
//        viewModelScope,
//        SharingStarted.WhileSubscribed(5000L),
//        emptyList()
//    )

//    val upComingMovies = getUpcomingMovieUseCase.getSnapshot().map { movieList ->
//        movieList.map { it.toUpComingUiModel() }
//    }.stateIn(
//        viewModelScope,
//        SharingStarted.WhileSubscribed(5000L),
//        emptyList()
//    )

    init {
        viewModelScope.launch {
            combine(
                popularMoviesFlow,
                nowPlayingMoviesFlow,
                upComingMoviesFlow,
            ) { bannerList, nowPlayingList, upComingList ->
                HomeUiState.Success(bannerList + nowPlayingList + upComingList)
            }.catch {
                _errorFlow.emit(it)
            }.collect {
                _homeUiState.value = it
            }
        }
    }
}

sealed class HomeUiState {
    object Loading : HomeUiState()
    data class Success(val data: List<HomeListItem>) : HomeUiState()
}