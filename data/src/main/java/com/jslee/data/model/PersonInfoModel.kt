package com.jslee.data.model

import com.jslee.data.TMDB_IMAGE_PREFIX
import com.jslee.domain.model.Gender
import com.jslee.domain.model.Person

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