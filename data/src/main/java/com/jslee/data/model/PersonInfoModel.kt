package com.jslee.data.model


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

