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

enum class Gender(val code: Int) {
    NOT_SPECIFIED(0),
    FEMALE(1),
    MALE(2);

    companion object {
        fun fromCode(code: Int): Gender {
            return when (code) {
                NOT_SPECIFIED.code -> NOT_SPECIFIED
                FEMALE.code -> FEMALE
                MALE.code -> MALE
                else -> NOT_SPECIFIED
            }
        }
    }
}