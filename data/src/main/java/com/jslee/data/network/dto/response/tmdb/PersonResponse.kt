package com.jslee.data.network.dto.response.tmdb

import com.jslee.data.model.PersonInfoModel
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * MooBeside
 * @author jaesung
 * @created 2024/01/10
 */

@Serializable
internal data class PersonResponse(
    @SerialName("adult") val isAdult: Boolean,
    @SerialName("also_known_as") val localizedNames: List<String>,
    @SerialName("biography") val biography: String,
    @SerialName("birthday") val dateOfBirth: String?,
    @SerialName("deathday") val dateOfDeath: String?,
    @SerialName("gender") val gender: Int,
    @SerialName("homepage") val homepage: String?,
    @SerialName("id") val personId: Long,
    @SerialName("imdb_id") val imdbId: String,
    @SerialName("known_for_department") val knownForDepartment: String,
    @SerialName("name") val name: String,
    @SerialName("place_of_birth") val placeOfBirth: String?,
    @SerialName("popularity") val popularity: Double,
    @SerialName("profile_path") val profilePath: String?,
)

internal fun PersonResponse.toDataModel() = PersonInfoModel(
    biography = biography,
    dateOfBirth = dateOfBirth,
    dateOfDeath = dateOfDeath,
    gender = gender,
    personId = personId,
    name = name,
    profilePath = profilePath,
)
