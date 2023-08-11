package com.jslee.data.datasource.remote.source

import android.util.Log
import com.jslee.data.datasource.remote.dto.response.kobis.toDataModel
import com.jslee.data.datasource.remote.service.KobisService
import com.jslee.data.model.DailyBoxOfficeModel
import javax.inject.Inject
import javax.inject.Singleton

/**
 * MooBeside
 * @author jaesung
 * @created 2023/08/09
 */
@Singleton
internal class KobisRemoteDataSource @Inject constructor(
    private val kobisService: KobisService
) {
    suspend fun getDailyBoxOffice(targetDate: String): List<DailyBoxOfficeModel> {
        val response = kobisService.getDailyBoxOffice(targetDate = targetDate)
        Log.e("CHECK", "$response")
        return response.boxOfficeResponse?.dailyBoxOfficeList?.map { dailyBoxOfficeResponse ->
            dailyBoxOfficeResponse.toDataModel()
        } ?: emptyList()
    }
}