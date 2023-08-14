package com.jslee.domain.model

/**
 * MooBeside
 * @author jaesung
 * @created 2023/08/14
 */
data class BoxOffice(
    val rank: String,
    val rankIncrement: String,
    val rankEntryStatus: String,
    val dailyAudienceCount: String,
    val dailyAudienceIncrement: String,
    val dailyAudienceIncrementRatio: String,
    val cumulativeAudience: String,
)
