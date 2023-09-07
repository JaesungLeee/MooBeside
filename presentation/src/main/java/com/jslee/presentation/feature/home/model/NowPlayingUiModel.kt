package com.jslee.presentation.feature.home.model

import com.jslee.domain.model.Movie
import com.jslee.presentation.feature.home.model.item.HomeListItem

/**
 * MooBeside
 * @author jaesung
 * @created 2023/09/01
 */
data class NowPlayingUiModel(
    val movieId: Long,
    val movieName: String,
    val posterImageUrl: String,
)

fun Movie.toNowPlayingUiModel() = NowPlayingUiModel(
    movieId = tmdbMovieId ?: -1,
    movieName = movieName.orEmpty(),
    posterImageUrl = posterImageUrl.orEmpty(),
)

fun List<Movie>.mapToNowPlayingUiModel() = listOf(
    HomeListItem.Header(
        id = 3,
        title = "현재 상영작"
    ),
    HomeListItem.NowPlayingContent(
        id = 4,
        nowPlayingData = this.map { it.toNowPlayingUiModel() }
    ),
    HomeListItem.Divider(
        id = 5,
    )
)
