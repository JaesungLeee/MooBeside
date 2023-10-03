package com.jslee.data.datasource.remote.dto.response.tmdb

import com.jslee.data.UNKNOWN_FIELD
import com.jslee.data.model.ReleaseDateMovieModel
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

internal fun TmdbReleaseDateResponse.toDataModel() = ReleaseDateMovieModel(
    regionCode = regionCode,
    certification = releaseDate.map { it.certification }.firstOrNull() ?: UNKNOWN_FIELD,
    releaseDate = releaseDate.map { it.releaseDate }.firstOrNull() ?: UNKNOWN_FIELD
)
