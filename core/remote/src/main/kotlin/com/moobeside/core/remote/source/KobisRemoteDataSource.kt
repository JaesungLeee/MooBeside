package com.moobeside.core.remote.source

import com.moobeside.core.remote.network.dto.response.kobis.DailyBoxOfficeResponse

interface KobisRemoteDataSource {
    suspend fun getDailyBoxOffice(targetDate: String): List<DailyBoxOfficeResponse>
}