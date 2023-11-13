package com.jslee.data.network.dto.response.tmdb

import com.jslee.data.model.MovieCastModel
import com.jslee.data.model.MovieCreditsModel
import com.jslee.data.model.MovieStaffModel
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * MooBeside
 * @author jaesung
 * @created 2023/10/03
 */
@Serializable
internal data class CreditsResponse(
    @SerialName("id") val movieId: Long,
    @SerialName("cast") val castData: List<CastResponse>,
    @SerialName("crew") val staffData: List<StaffResponse>,
)

@Serializable
internal data class CastResponse(
    @SerialName("adult") val isAdult: Boolean,
    @SerialName("gender") val genderCode: Int,
    @SerialName("id") val personId: Long,
    @SerialName("known_for_department") val department: String,
    @SerialName("name") val name: String,
    @SerialName("original_name") val originalName: String,
    @SerialName("popularity") val popularity: Double,
    @SerialName("profile_path") val profilePath: String?,
    @SerialName("cast_id") val castId: Long,
    @SerialName("character") val character: String,
    @SerialName("credit_id") val creditId: String,
    @SerialName("order") val order: Int,
)

@Serializable
internal data class StaffResponse(
    @SerialName("adult") val isAdult: Boolean,
    @SerialName("gender") val genderCode: Int,
    @SerialName("id") val personId: Long,
    @SerialName("known_for_department") val department: String,
    @SerialName("name") val name: String,
    @SerialName("original_name") val originalName: String,
    @SerialName("popularity") val popularity: Double,
    @SerialName("profile_path") val profilePath: String?,
    @SerialName("credit_id") val creditId: String,
    @SerialName("department") val role: String,
    @SerialName("job") val job: String,
)

internal fun CreditsResponse.toDataModel() = MovieCreditsModel(
    casts = castData.map { castResponse ->
        MovieCastModel(
            personId = castResponse.personId,
            genderCode = castResponse.genderCode,
            originalName = castResponse.originalName,
            profilePath = castResponse.profilePath,
            character = castResponse.character,
        )
    },
    staffs = staffData.map { staffResponse ->
        MovieStaffModel(
            personId = staffResponse.personId,
            genderCode = staffResponse.genderCode,
            originalName = staffResponse.originalName,
            profilePath = staffResponse.profilePath,
            job = staffResponse.job,
        )
    }
)
