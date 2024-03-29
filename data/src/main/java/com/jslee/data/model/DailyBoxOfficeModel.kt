package com.jslee.data.model

import com.jslee.domain.model.movie.BoxOffice
import com.jslee.domain.model.movie.Movie

/**
 * MooBeside
 * @author jaesung
 * @created 2023/08/09
 */
internal data class DailyBoxOfficeModel(
    val rankId: String,
    val rank: String,
    val rankIncrement: String,
    val rankEntryStatus: String,
    val movieCode: String,
    val movieName: String,
    val openDate: String,
    val salesAmount: String,
    val salesRatio: String,
    val salesIncrement: String,
    val salesIncrementRatio: String,
    val cumulativeSales: String,
    val audienceCount: String,
    val audienceIncrement: String,
    val audienceIncrementRatio: String,
    val cumulativeAudience: String,
    val screeningCount: String,
    val showCount: String,
)

internal fun DailyBoxOfficeModel.toDomain() = Movie(
    kobisMovieCode = movieCode,
    localizedMovieName = movieName,
    localizedReleaseDate = openDate,
    boxOffice = BoxOffice(
        rank = rank,
        rankIncrement = rankIncrement,
        rankEntryStatus = rankEntryStatus,
        dailyAudienceCount = audienceCount,
        dailyAudienceIncrement = audienceIncrement,
        dailyAudienceIncrementRatio = audienceIncrementRatio,
        cumulativeAudience = cumulativeAudience,
    )
)

