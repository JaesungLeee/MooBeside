package com.jslee.presentation.feature.boxoffice

import com.jslee.domain.model.Movie

/**
 * MooBeside
 * @author jaesung
 * @created 2023/08/09
 */
data class BoxOfficeUiModel(
    val rank: String,
    val movieTitle: String,
    val openingDate: String,
    val audienceAmount: String,
    val averageAudienceGrowth: String
)

fun Movie.toPresentation() = BoxOfficeUiModel(
    rank = rank,
    movieTitle = movieName,
    openingDate = openDate,
    audienceAmount = cumulativeAudience,
    averageAudienceGrowth = audienceIncrementRatio
)
