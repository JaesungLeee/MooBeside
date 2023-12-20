package com.jslee.presentation.feature.bookmark.model

import com.jslee.core.ui.UNKNOWN_FIELD
import com.jslee.core.ui.extension.toDisplayRunTime
import com.jslee.domain.model.movie.Movie
import com.jslee.domain.model.movie.MovieStatus

/**
 * MooBeside
 * @author jaesung
 * @created 2023/11/03
 */
data class BookmarkUiModel(
    val movieId: Long,
    val movieName: String,
    val posterImageUrl: String?,
    val localizedReleaseDate: String,
    val movieStatus: String,
    val genres: List<String>,
    val runtime: String,
)

fun Movie.toBookmarkUiModel() = BookmarkUiModel(
    movieId = tmdbMovieId ?: -1,
    movieName = localizedMovieName.orEmpty(),
    posterImageUrl = posterImageUrl,
    localizedReleaseDate = localizedReleaseDate.orEmpty(),
    movieStatus = MovieStatus.getDescription(movieStatus),
    genres = genres.orEmpty(),
    runtime = runtime?.toDisplayRunTime() ?: UNKNOWN_FIELD
)