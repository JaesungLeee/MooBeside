package com.jslee.presentation.feature.now

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.PagingData
import androidx.paging.cachedIn
import androidx.paging.map
import com.jslee.domain.usecase.GetNowPlayingMovieUseCase
import com.jslee.presentation.feature.home.model.NowPlayingUiModel
import com.jslee.presentation.feature.home.model.toNowPlayingUiModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.onStart
import kotlinx.coroutines.launch
import javax.inject.Inject

/**
 * MooBeside
 * @author jaesung
 * @created 2023/09/15
 */
@HiltViewModel
class NowPlayingViewModel @Inject constructor(
    private val getNowPlayingMovieUseCase: GetNowPlayingMovieUseCase
) : ViewModel() {

    private val _eventFlow: MutableSharedFlow<Throwable> = MutableSharedFlow<Throwable>()
    val eventFlow = _eventFlow.asSharedFlow()

    private val _nowPlayingUiState: MutableStateFlow<NowPlayingUiState> = MutableStateFlow(Loading)
    val nowPlayingUiState = _nowPlayingUiState.asStateFlow()

    init {
        getNowPlayingMovies()
    }

    private fun getNowPlayingMovies() {
        viewModelScope.launch {
            getNowPlayingMovieUseCase().cachedIn(viewModelScope)
                .catch {
                    _eventFlow.emit(it)
                }
                .map { pagingData ->
                    pagingData.map { it.toNowPlayingUiModel() }
                }.collect {
                    _nowPlayingUiState.value = Success(it)
                }
        }
    }
}

sealed interface NowPlayingUiState
object Loading : NowPlayingUiState
data class Success(val data: PagingData<NowPlayingUiModel>) : NowPlayingUiState