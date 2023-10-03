package com.jslee.data.datasource.remote.dto.response.tmdb

import com.jslee.data.UNKNOWN_FIELD
import com.jslee.data.model.MovieReleaseInfoModel
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * MooBeside
 * @author jaesung
 * @created 2023/10/02
 */
@Serializable
data class TmdbReleaseInfoResponse(
    @SerialName("iso_3166_1") val regionCode: String,
    @SerialName("release_dates") val releaseInfo: List<ReleaseInfoResponse>,
)

@Serializable
data class ReleaseInfoResponse(
    @SerialName("certification") val certification: String,
    @SerialName("descriptors") val descriptors: List<String>,
    @SerialName("iso_639_1") val languageCode: String,
    @SerialName("note") val note: String,
    @SerialName("release_date") val localizedReleaseDate: String,
    @SerialName("type") val releaseType: Int,
)

internal fun TmdbReleaseInfoResponse.toDataModel() = MovieReleaseInfoModel(
    regionCode = regionCode,
    certification = releaseInfo.map { it.certification }.firstOrNull() ?: UNKNOWN_FIELD,
    localizedReleaseDate = releaseInfo.map { it.localizedReleaseDate }.firstOrNull() ?: UNKNOWN_FIELD
)
