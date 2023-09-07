package com.jslee.presentation.feature.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.jslee.domain.usecase.GetPopularMovieUseCase
import com.jslee.presentation.feature.home.model.BannerUiModel
import com.jslee.presentation.feature.home.model.toBannerUiModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn
import javax.inject.Inject

/**
 * MooBeside
 * @author jaesung
 * @created 2023/08/19
 */
@HiltViewModel
class HomeViewModel @Inject constructor(
    getPopularMovieUseCase: GetPopularMovieUseCase
) : ViewModel() {

    val banner = getPopularMovieUseCase.invoke().map { movieList ->
        movieList.map { it.toBannerUiModel() }
    }.stateIn(
        viewModelScope,
        SharingStarted.Eagerly,
        List(BANNER_COUNT) { BannerUiModel.default() }
    )
}