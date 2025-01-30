package com.jslee.presentation.feature.bookmark.model

import com.moobeside.core.model.movie.Movie
import com.moobeside.core.model.movie.MovieStatus
import com.moobeside.core.common.kotlin.UNKNOWN_FIELD
import com.moobeside.core.common.kotlin.extension.DateFormat
import com.moobeside.core.common.kotlin.extension.getMovieSummaryInfo
import com.moobeside.core.common.kotlin.extension.toDisplayRunTime
import com.moobeside.core.common.kotlin.extension.transformDate

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
        localizedReleaseDate.transformDate(DateFormat.DISP_YEAR_MONTH_DAY, DateFormat.DISP_YEAR)
    val movieSummary = getMovieSummaryInfo(displayYear, movieStatus, genres)
}

fun Movie.toBookmarkUiModel() = BookmarkUiModel(
    movieId = tmdbMovieId ?: -1,
    movieName = localizedMovieName.orEmpty(),
    posterImageUrl = posterImageUrl,
    localizedReleaseDate = localizedReleaseDate.transformDate(
        DateFormat.YEAR_MONTH_DAY_MILLIS,
        DateFormat.DISP_YEAR_MONTH_DAY
    ),
    movieStatus = MovieStatus.getDescription(movieStatus),
    genres = genres.orEmpty(),
    runtime = runtime?.toDisplayRunTime() ?: UNKNOWN_FIELD,
)