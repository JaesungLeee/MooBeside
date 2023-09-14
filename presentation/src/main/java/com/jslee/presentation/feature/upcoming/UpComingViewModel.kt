package com.jslee.presentation.feature.upcoming

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.PagingData
import androidx.paging.cachedIn
import androidx.paging.map
import com.jslee.domain.usecase.GetUpComingMovieUseCase
import com.jslee.presentation.feature.home.model.UpComingUiModel
import com.jslee.presentation.feature.home.model.toUpComingUiModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.launch
import javax.inject.Inject

/**
 * MooBeside
 * @author jaesung
 * @created 2023/09/10
 */
@HiltViewModel
class UpComingViewModel @Inject constructor(
    private val getUpComingMovieUseCase: GetUpComingMovieUseCase
) : ViewModel() {
    
    init {
        getUpComingMovies()
    }

    private val _eventFlow: MutableSharedFlow<Throwable> = MutableSharedFlow<Throwable>()
    val eventFlow = _eventFlow.asSharedFlow()

    private val _upComingUiState: MutableStateFlow<UpComingMovieUiState> = MutableStateFlow(Idle)
    val upComingUiState = _upComingUiState.asStateFlow()

    private fun getUpComingMovies() {
        viewModelScope.launch {
            getUpComingMovieUseCase().cachedIn(viewModelScope)
                .catch {
                    _eventFlow.emit(it)
                }.map { pagingData ->
                    pagingData.map {
                        it.toUpComingUiModel()
                    }
                }.collect {
                    _upComingUiState.value = Success(it)
                }
        }
    }
}

sealed interface UpComingMovieUiState
object Idle : UpComingMovieUiState
data class Success(val data: PagingData<UpComingUiModel>) : UpComingMovieUiState
