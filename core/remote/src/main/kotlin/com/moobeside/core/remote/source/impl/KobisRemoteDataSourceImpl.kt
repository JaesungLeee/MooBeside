package com.moobeside.core.remote.source.impl

import com.moobeside.core.exception.BadRequestException
import com.moobeside.core.remote.network.dto.response.kobis.DailyBoxOfficeResponse
import com.moobeside.core.remote.network.service.KobisService
import com.moobeside.core.remote.source.KobisRemoteDataSource
import javax.inject.Inject
import javax.inject.Singleton

/**
 * MooBeside
 * @author jaesung
 * @created 2023/08/09
 */
@Singleton
internal class KobisRemoteDataSourceImpl @Inject constructor(
    private val kobisService: KobisService,
) : KobisRemoteDataSource {
    override suspend fun getDailyBoxOffice(targetDate: String): List<DailyBoxOfficeResponse> {
        val response = kobisService.getDailyBoxOffice(targetDate = targetDate).getOrNull()

        if (response?.errorResponse != null) {
            throw BadRequestException(originMessage = response.errorResponse.message)
        }

//        return response?.boxOfficeResponse?.dailyBoxOfficeList?.map { boxOfficeResponse ->
//            boxOfficeResponse.toDataModel()
//        }.orEmpty()
        return response?.boxOfficeResponse?.dailyBoxOfficeList.orEmpty()
    }
}