package com.jslee.data.datasource.remote.dto.response.tmdb

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * MooBeside
 * @author jaesung
 * @created 2023/10/02
 */
@Serializable
data class TmdbReleaseDateResponse(
    @SerialName("iso_3166_1") val regionCode: String,
    @SerialName("release_dates") val releaseDate: List<ReleaseDateResponse>,
)

@Serializable
data class ReleaseDateResponse(
    @SerialName("certification") val certification: String,
    @SerialName("descriptors") val descriptors: List<String>,
    @SerialName("iso_639_1") val languageCode: String,
    @SerialName("note") val note: String,
    @SerialName("release_date") val releaseDate: String,
    @SerialName("type") val releaseType: Int,
)
