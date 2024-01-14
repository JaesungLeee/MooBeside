package com.jslee.presentation.feature.bookmark.model

import com.jslee.core.date.DateFormat
import com.jslee.core.date.toDisplayDate
import com.jslee.core.ui.UNKNOWN_FIELD
import com.jslee.core.ui.extension.getSummaryInfo
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
) {
    private val displayYear =
        localizedReleaseDate.toDisplayDate(DateFormat.DISP_YEAR_MONTH_DAY, DateFormat.DISP_YEAR)
    val movieSummary = getSummaryInfo(displayYear, movieStatus, genres)
}

fun Movie.toBookmarkUiModel() = BookmarkUiModel(
    movieId = tmdbMovieId ?: -1,
    movieName = localizedMovieName.orEmpty(),
    posterImageUrl = posterImageUrl,
    localizedReleaseDate = localizedReleaseDate.toDisplayDate(
        DateFormat.YEAR_MONTH_DAY_MILLIS,
        DateFormat.DISP_YEAR_MONTH_DAY
    ),
    movieStatus = MovieStatus.getDescription(movieStatus),
    genres = genres.orEmpty(),
    runtime = runtime?.toDisplayRunTime() ?: UNKNOWN_FIELD,
)