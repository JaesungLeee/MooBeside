package com.jslee.data.network.dto.response.tmdb

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * MooBeside
 * @author jaesung
 * @created 2023/08/14
 */

/**
 * Error 응답과 Success 응답 공통으로 처리
 */
@Serializable
data class TmdbCommonResponse<T>(
    @SerialName("status_code")
    val statusCode: Int? = null,
    @SerialName("status_message")
    val statusMessage: String? = null,
    @SerialName("success")
    val isSuccess: Boolean? = null,
    @SerialName("dates")
    val dateRange: DateRange? = null,
    @SerialName("page")
    val page: Int? = null,
    @SerialName("results")
    val pagingResult: List<T>? = emptyList(),
    @SerialName("total_pages")
    val totalPages: Int? = null,
    @SerialName("total_results")
    val totalItemCount: Int? = null,
    @SerialName("id")
    val movieId: Long? = null,
)

@Serializable
data class DateRange(
    @SerialName("maximum")
    val maximumDate: String,
    @SerialName("minimum")
    val minimumDate: String,
)

