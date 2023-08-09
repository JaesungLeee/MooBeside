package com.jslee.data.datasource.remote.service

import com.jslee.data.BuildConfig
import com.jslee.data.datasource.remote.dto.response.kobis.KobisBoxOfficeResponse
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * MooBeside
 * @author jaesung
 * @created 2023/08/07
 */

/**
 * 모든 응답은 200
 */
internal interface KobisService {

    @GET("boxoffice/searchDailyBoxOfficeList.json")
    suspend fun getDailyBoxOffice(
        @Query("key") apiKey: String = BuildConfig.KOBIS_API_KEY,
        @Query("targetDt") targetDateTime: String
    ): KobisBoxOfficeResponse
}