package com.jslee.data.datasource.remote.service

import com.jslee.data.BuildConfig
import com.jslee.data.datasource.remote.dto.response.youtube.YoutubeSearchResponse
import com.jslee.domain.model.Country
import retrofit2.Response
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
    ): Response<YoutubeSearchResponse>

    companion object {
        private const val RESPONSE_PART = "snippet"
        private const val MAX_COUNT = 10u
    }
}