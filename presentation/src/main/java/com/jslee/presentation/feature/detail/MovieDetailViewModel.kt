package com.jslee.presentation.feature.detail

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.jslee.domain.usecase.GetMovieDetailUseCase
import com.jslee.presentation.feature.detail.model.MovieDetailUiModel
import com.jslee.presentation.feature.detail.model.toMovieDetailUiModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.launch
import timber.log.Timber
import javax.inject.Inject

/**
 * MooBeside
 * @author jaesung
 * @created 2023/10/03
 */
@HiltViewModel
class MovieDetailViewModel @Inject constructor(
    private val getMovieDetailUseCase: GetMovieDetailUseCase,
) : ViewModel() {

    private val _movieName: MutableStateFlow<String> = MutableStateFlow("")
    val movieName = _movieName.asStateFlow()

    private val _detailUiState: MutableStateFlow<MovieDetailUiState> = MutableStateFlow(MovieDetailUiState.Loading)
    val detailUiState = _detailUiState.asStateFlow()

    fun getMovieDetails(movieId: Long) {
        viewModelScope.launch {
            getMovieDetailUseCase.invoke(movieId)
                .catch {
                    Timber.e(it.message)
                }.collect {
                    _movieName.value = it.localizedMovieName.orEmpty()
                    _detailUiState.value = MovieDetailUiState.Success(it.toMovieDetailUiModel())
                }
        }
    }
}

sealed class MovieDetailUiState {
    object Loading : MovieDetailUiState()
    data class Success(val data: MovieDetailUiModel) : MovieDetailUiState()
}