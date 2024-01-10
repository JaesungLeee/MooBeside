package com.jslee.domain.model

/**
 * MooBeside
 * @author jaesung
 * @created 2024/01/11
 */
data class Person(
    val personId: Long,
    val name: String,
    val profileUrl: String?,
    val gender: Gender,
    val dateOfBirth: String?,
    val dateOfDeath: String?,
    val biography: String,
)
