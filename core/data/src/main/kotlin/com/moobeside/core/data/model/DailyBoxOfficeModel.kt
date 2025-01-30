package com.moobeside.core.data.model

import com.moobeside.core.model.movie.BoxOffice
import com.moobeside.core.model.movie.Movie
import com.moobeside.core.remote.network.dto.response.kobis.DailyBoxOfficeResponse

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

internal fun DailyBoxOfficeResponse.toDataModel() = DailyBoxOfficeModel(
    rankId = rankId,
    rank = rank,
    rankIncrement = rankIncrement,
    rankEntryStatus = rankEntryStatus,
    movieCode = movieCode,
    movieName = movieName,
    openDate = openDate,
    salesAmount = salesAmount,
    salesRatio = salesRatio,
    salesIncrement = salesIncrement,
    salesIncrementRatio = salesIncrementRatio,
    cumulativeSales = cumulativeSales,
    audienceCount = audienceCount,
    audienceIncrement = audienceIncrement,
    audienceIncrementRatio = audienceIncrementRatio,
    cumulativeAudience = cumulativeAudience,
    screeningCount = screeningCount,
    showCount = showCount,
)
