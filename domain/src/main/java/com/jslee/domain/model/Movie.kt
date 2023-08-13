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
    val boxOffice: BoxOfficeMovie? = null,
)

data class BoxOfficeMovie(
    val rank: String,
    val rankIncrement: String,
    val rankEntryStatus: String,
    val dailyAudienceCount: String,
    val dailyAudienceIncrement: String,
    val dailyAudienceIncrementRatio: String,
    val cumulativeAudience: String,
)
