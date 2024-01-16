package com.jslee.data.network.dto.response.kobis

import com.jslee.data.model.DailyBoxOfficeModel
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * MooBeside
 * @author jaesung
 * @created 2023/08/09
 */

@Serializable
internal data class BoxOfficeResponse(
    @SerialName("boxofficeType")
    val boxOfficeType: String,
    @SerialName("showRange")
    val showRange: String,
    @SerialName("dailyBoxOfficeList")
    val dailyBoxOfficeList: List<DailyBoxOfficeResponse>
)

@Serializable
internal data class DailyBoxOfficeResponse(
    @SerialName("rnum")
    val rankId: String,
    @SerialName("rank")
    val rank: String,
    @SerialName("rankInten")
    val rankIncrement: String,
    @SerialName("rankOldAndNew")
    val rankEntryStatus: String,
    @SerialName("movieCd")
    val movieCode: String,
    @SerialName("movieNm")
    val movieName: String,
    @SerialName("openDt")
    val openDate: String,
    @SerialName("salesAmt")
    val salesAmount: String,
    @SerialName("salesShare")
    val salesRatio: String,
    @SerialName("salesInten")
    val salesIncrement: String,
    @SerialName("salesChange")
    val salesIncrementRatio: String,
    @SerialName("salesAcc")
    val cumulativeSales: String,
    @SerialName("audiCnt")
    val audienceCount: String,
    @SerialName("audiInten")
    val audienceIncrement: String,
    @SerialName("audiChange")
    val audienceIncrementRatio: String,
    @SerialName("audiAcc")
    val cumulativeAudience: String,
    @SerialName("scrnCnt")
    val screeningCount: String,
    @SerialName("showCnt")
    val showCount: String,
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
