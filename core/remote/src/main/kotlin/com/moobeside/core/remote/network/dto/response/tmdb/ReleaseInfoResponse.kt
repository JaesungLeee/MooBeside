package com.moobeside.core.remote.network.dto.response.tmdb

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
