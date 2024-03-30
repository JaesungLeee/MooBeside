package com.jslee.data.datasource.remote

import com.jslee.data.exception.BadRequestException
import com.jslee.data.model.DailyBoxOfficeModel
import com.jslee.data.network.dto.response.kobis.toDataModel
import com.jslee.data.network.service.KobisService
import javax.inject.Inject
import javax.inject.Singleton

/**
 * MooBeside
 * @author jaesung
 * @created 2023/08/09
 */
@Singleton
internal class KobisRemoteDataSource @Inject constructor(
    private val kobisService: KobisService,
) {
    suspend fun getDailyBoxOffice(targetDate: String): List<DailyBoxOfficeModel> {
        val response = kobisService.getDailyBoxOffice(targetDate = targetDate).getOrNull()

        if (response?.errorResponse != null) {
            throw BadRequestException(originMessage = response.errorResponse.message)
        }

        return response?.boxOfficeResponse?.dailyBoxOfficeList?.map { boxOfficeResponse ->
            boxOfficeResponse.toDataModel()
        }.orEmpty()
    }
}