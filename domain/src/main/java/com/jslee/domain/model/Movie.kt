package com.jslee.domain.model

/**
 * MooBeside
 * @author jaesung
 * @created 2023/08/09
 */
data class Movie(
    val kobisMovieCode: String,
    val movieName: String,
    val openDate: String,
    val cumulativeAudience: String,
    val audienceIncrement: String,
    val audienceIncrementRatio: String,
    val rank: String,
    val rankIncrement: String,
    val rankEntryStatus: String,
)
