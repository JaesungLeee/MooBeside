package com.jslee.presentation.feature.boxoffice

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
