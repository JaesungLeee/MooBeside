package com.moobeside.core.data.model

import com.moobeside.core.common.kotlin.TMDB_IMAGE_PREFIX
import com.moobeside.core.model.Gender
import com.moobeside.core.model.Person
import com.moobeside.core.remote.network.dto.response.tmdb.PersonResponse

/**
 * MooBeside
 * @author jaesung
 * @created 2024/01/11
 */
internal data class PersonInfoModel(
    val biography: String,
    val dateOfBirth: String?,
    val dateOfDeath: String?,
    val gender: Int,
    val personId: Long,
    val name: String,
    val profilePath: String?,
)

internal fun PersonInfoModel.toDomain() = Person(
    personId = personId,
    name = name,
    profileUrl = profilePath?.let { TMDB_IMAGE_PREFIX + it },
    gender = Gender.fromCode(gender),
    dateOfBirth = dateOfBirth,
    dateOfDeath = dateOfDeath,
    biography = biography
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
