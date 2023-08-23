package com.jslee.presentation.feature.home

import com.jslee.domain.model.Movie

/**
 * MooBeside
 * @author jaesung
 * @created 2023/08/17
 */
data class BannerUiModel(
    val id: Long,
    val movieTitle: String,
    val backdropImageUrl: String,
) {
    companion object {
        fun default() = BannerUiModel(
            id = 0,
            movieTitle = "",
            backdropImageUrl = ""
        )
    }
}

fun Movie.toBannerUiModel() = BannerUiModel(
    id = tmdbMovieId ?: -1,
    movieTitle = movieName.orEmpty(),
    backdropImageUrl = backdropImageUrl.orEmpty()
)
