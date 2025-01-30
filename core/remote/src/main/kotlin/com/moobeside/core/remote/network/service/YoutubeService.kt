package com.moobeside.core.remote.network.service

import com.moobeside.core.model.Country
import com.moobeside.core.remote.network.ApiResult
import com.moobeside.core.remote.BuildConfig
import com.moobeside.core.remote.network.dto.response.youtube.YoutubeSearchResponse
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * MooBeside
 * @author jaesung
 * @created 2023/08/07
 */
internal interface YoutubeService {
    @GET("search")
    suspend fun getVideoList(
        @Query("key") key: String = BuildConfig.YOUTUBE_API_KEY,
        @Query("part") part: String = RESPONSE_PART,
        @Query("maxResults") result: UInt = MAX_COUNT,
        @Query("q") query: String,
        @Query("regionCode") regionCode: String = Country.KOREA.regionCode,
    ): ApiResult<YoutubeSearchResponse>

    companion object {
        private const val RESPONSE_PART = "snippet"
        private const val MAX_COUNT = 5u
    }
}