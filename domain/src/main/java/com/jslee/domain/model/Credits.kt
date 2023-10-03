package com.jslee.domain.model

/**
 * MooBeside
 * @author jaesung
 * @created 2023/10/03
 */
data class Cast(
    val personId: Long,
    val gender: Gender,
    val originalName: String,
    val profileImageUrl: String?,
    val character: String,
)

data class Staff(
    val personId: Long,
    val gender: Gender,
    val originalName: String,
    val profileImageUrl: String?,
    val job: String,
)