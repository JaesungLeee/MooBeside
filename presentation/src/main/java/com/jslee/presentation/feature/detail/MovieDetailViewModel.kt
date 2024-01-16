package com.jslee.presentation.feature.detail

import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.jslee.core.deeplink.DeepLinkLauncher
import com.jslee.core.deeplink.di.Firebase
import com.jslee.core.deeplink.di.Kakao
import com.jslee.domain.usecase.GetMovieDetailUseCase
import com.jslee.domain.usecase.bookmark.BookmarkUseCase
import com.jslee.domain.usecase.bookmark.GetBookmarkUseCase
import com.jslee.presentation.feature.detail.model.CastInfoUiModel
import com.jslee.presentation.feature.detail.model.MovieDetailUiModel
import com.jslee.presentation.feature.detail.model.item.DetailListItem
import com.jslee.presentation.feature.detail.model.toDomain
import com.jslee.presentation.feature.detail.model.toMovieDetailUiModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.combine
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
    private val bookmarkUseCase: BookmarkUseCase,
    private val getAllBookmarkUseCase: GetBookmarkUseCase,
    @Kakao private val kakaoLinkLauncher: DeepLinkLauncher,
    @Firebase private val firebaseLinkLauncher: DeepLinkLauncher,
) : ViewModel() {

    private val _movieName: MutableStateFlow<String> = MutableStateFlow("")
    val movieName = _movieName.asStateFlow()

    private val _movieId: MutableStateFlow<Long> = MutableStateFlow(0)
    val movieId = _movieId.asStateFlow()

    private val _detailUiState: MutableStateFlow<MovieDetailUiState> =
        MutableStateFlow(MovieDetailUiState.Loading)
    val detailUiState = _detailUiState.asStateFlow()

    init {
        viewModelScope.launch {
            combine(
                detailUiState,
                getAllBookmarkUseCase()
            ) { movieDetailUiState, bookmarks ->
                when (movieDetailUiState) {
                    is MovieDetailUiState.Loading -> movieDetailUiState
                    is MovieDetailUiState.Success -> {
                        val bookmarkIds = bookmarks.map { it.tmdbMovieId }
                        val isBookmarked = bookmarkIds.contains(movieDetailUiState.data.movieId)
                        movieDetailUiState.copy(isBookmarked = isBookmarked)
                    }
                }
            }.collect {
                _detailUiState.value = it
            }
        }
    }

    fun setMovieId(movieId: Long) {
        _movieId.value = movieId
    }

    fun getMovieDetails(movieId: Long) {
        viewModelScope.launch {
            getMovieDetailUseCase.invoke(movieId)
                .catch {
                    Timber.e(it)
                }.collect {
                    _movieName.value = it.localizedMovieName.orEmpty()
                    _detailUiState.value =
                        MovieDetailUiState.Success(it.toMovieDetailUiModel(it.localizedMovieName.orEmpty()))
                }
        }
    }

    fun getMovieCasts(): List<CastInfoUiModel> {
        val uiState = _detailUiState.value
        if (uiState !is MovieDetailUiState.Success) return emptyList()

        val casts = uiState.data.detailData.find {
            it.viewType == DetailListItem.DetailViewType.CAST
        } as? DetailListItem.Cast

        return casts?.castInfoData.orEmpty()
    }

    fun toggleBookmark(movieId: Long) {
        val uiState = _detailUiState.value
        if (uiState !is MovieDetailUiState.Success) return

        val uiModel = uiState.data

        viewModelScope.launch {
            val bookmark = uiState.isBookmarked
            runCatching {
                bookmarkUseCase.invoke(uiModel.toDomain(movieId), !bookmark)
            }.onFailure {
                Timber.e("$it")
            }
        }
    }

    fun createDynamicLink(
        movieId: Long,
        onSuccess: (Uri) -> Unit,
    ) {
        val uiState = _detailUiState.value
        if (uiState !is MovieDetailUiState.Success) return

        val movieName = uiState.data.appBarModel.movieName
        val movieImageUrl = uiState.data.appBarModel.posterImageUrl
        val genres = uiState.data.appBarModel.genres.joinToString(", ")

        Timber.e("Click")
        firebaseLinkLauncher.createDetailFirebaseLink(
            movieId = movieId.toString(),
            metaTagImageUrl = movieImageUrl.orEmpty(),
            metaTagTitle = movieName,
            metaTagDescription = genres,
            onSuccess = onSuccess,
            onFailure = {
                Timber.e(it)
            }
        )
    }

    fun shareKakaoLink(
        context: Context,
        movieId: Long,
        onSuccess: (Intent) -> Unit,
        onFailure: (String?) -> Unit,
    ) {
        val uiState = _detailUiState.value
        if (uiState !is MovieDetailUiState.Success) return

        val movieName = uiState.data.appBarModel.movieName
        val movieImageUrl = uiState.data.appBarModel.posterImageUrl
        val genres = uiState.data.appBarModel.genres.joinToString(", ")

        kakaoLinkLauncher.shareDetailKakaoLink(
            context = context,
            movieId = movieId.toString(),
            movieTitle = movieName,
            movieImageUrl = movieImageUrl.orEmpty(),
            movieDescription = genres,
            onSuccess = onSuccess,
            onFailure = onFailure
        )
    }
}

sealed class MovieDetailUiState {
    object Loading : MovieDetailUiState()
    data class Success(
        val data: MovieDetailUiModel,
        val isBookmarked: Boolean = false,
    ) : MovieDetailUiState()
}