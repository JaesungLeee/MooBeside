package com.jslee.data.datasource.remote.dto.response.kobis

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * MooBeside
 * @author jaesung
 * @created 2023/08/09
 */
@Serializable
internal data class KobisBoxOfficeResponse(
    @SerialName("boxOfficeResult")
    val boxOfficeResponse: BoxOfficeResponse? = null,
    @SerialName("faultInfo")
    val errorResponse: KobisErrorResponse? = null
)

@Serializable
internal data class KobisErrorResponse(
    val message: String,
    val errorCode: String
)