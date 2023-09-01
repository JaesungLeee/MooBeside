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
)

fun Movie.toBannerUiModel() = BannerUiModel(
    movieId = tmdbMovieId ?: -1,
    movieName = movieName.orEmpty(),
    backdropImageUrl = backdropImageUrl.orEmpty(),
)
