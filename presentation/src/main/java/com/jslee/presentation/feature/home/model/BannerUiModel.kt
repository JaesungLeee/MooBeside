package com.jslee.presentation.feature.home.model

import com.jslee.domain.model.Movie

/**
 * MooBeside
 * @author jaesung
 * @created 2023/09/01
 */
data class BannerUiModel(
    val movieId: Long,
    val movieName: String,
    val backdropImageUrl: String,
) {
    companion object {
        fun default() = BannerUiModel(
            movieId = -1, movieName = "", backdropImageUrl = ""
        )
    }
}

fun Movie.toBannerUiModel() = BannerUiModel(
    movieId = tmdbMovieId ?: -1,
    movieName = movieName.orEmpty(),
    backdropImageUrl = backdropImageUrl.orEmpty(),
)

fun List<Movie>.mapToBannerUiModel() = listOf(
    HomeListItem.Header(
        id = 0,
        title = "인기 영화",
    ),
    HomeListItem.BannerContent(
        id = 1,
        bannerData = this.map { it.toBannerUiModel() },
    ),
    HomeListItem.Divider(
        id = 2,
    )
)
