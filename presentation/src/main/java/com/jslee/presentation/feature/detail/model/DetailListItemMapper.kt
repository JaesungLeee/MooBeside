package com.jslee.presentation.feature.detail.model

import com.jslee.core.ui.extension.makeSummaryInfo
import com.jslee.domain.model.movie.Movie
import com.jslee.domain.model.movie.MovieStatus
import com.jslee.presentation.feature.detail.model.item.DetailListItem

/**
 * MooBeside
 * @author jaesung
 * @created 2023/10/17
 */

fun Movie.toListItem(): List<DetailListItem> = listOf(
    DetailListItem.MovieInfo(
        id = 0,
        movieInfoData = toMovieInfoUiModel()
    ),
)

fun Movie.toMovieDetailUiModel() = MovieDetailUiModel(
    movieName = localizedMovieName.orEmpty(),
    posterImageUrl = posterImageUrl,
    summaryInfo = makeSummaryInfo(
        localizedReleaseDate,
        MovieStatus.getDescription(movieStatus),
        genres
    ),
    detailData = toListItem()
)
