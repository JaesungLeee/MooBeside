package com.jslee.presentation.feature.home.model

import com.jslee.domain.model.Movie

/**
 * MooBeside
 * @author jaesung
 * @created 2023/09/01
 */
data class UpComingUiModel(
    val movieId: Long,
    val movieName: String,
    val posterImageUrl: String,
)

fun Movie.toUpComingUiModel() = UpComingUiModel(
    movieId = tmdbMovieId ?: -1,
    movieName = movieName.orEmpty(),
    posterImageUrl = posterImageUrl.orEmpty()
)

fun List<Movie>.mapToUpComingUiModel() = listOf<HomeListItem>(
    HomeListItem.Header(
        id = 6,
        title = "개봉 예정작",
    ),
    HomeListItem.UpComingContent(
        id = 7,
        upComingData = this.map { it.toUpComingUiModel() },
    )
)