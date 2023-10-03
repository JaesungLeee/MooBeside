package com.jslee.presentation.feature.detail

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.jslee.domain.usecase.GetMovieDetailUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
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

    fun getMovieDetails(movieId: Long) {
        viewModelScope.launch {
            getMovieDetailUseCase.invoke(movieId)
                .catch {
                    Timber.e(it.message)
                }.collect {
                    Timber.e("$it")
                }
        }
    }
}