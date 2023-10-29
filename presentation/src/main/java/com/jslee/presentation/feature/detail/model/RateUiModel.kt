package com.jslee.presentation.feature.detail.model

import com.jslee.domain.model.movie.Movie

/**
 * MooBeside
 * @author jaesung
 * @created 2023/10/29
 */
data class RateUiModel(
    val tmdbRate: String,
    val naverRate: String,
)

fun Movie.toRateUiModel() = RateUiModel(
    tmdbRate = roundWithSingleDecimal(rateInfo?.tmdbRate?.averageVoteRate),
    naverRate = "0.0"
)

fun roundWithSingleDecimal(value: Double?): String {
    requireNotNull(value) {
        "Value cannot be null"
    }
    return String.format("%.1f", value)
}
