package com.jslee.domain.model

/**
 * MooBeside
 * @author jaesung
 * @created 2024/01/11
 */
enum class Gender(val code: Int, val description: String) {
    NOT_SPECIFIED(0, "알수없음"),
    FEMALE(1, "여자"),
    MALE(2, "남자");

    companion object {
        fun fromCode(code: Int): Gender {
            return when (code) {
                NOT_SPECIFIED.code -> NOT_SPECIFIED
                FEMALE.code -> FEMALE
                MALE.code -> MALE
                else -> NOT_SPECIFIED
            }
        }

        fun getDescription(gender: Gender?): String {
            if (gender == null) return NOT_SPECIFIED.description
            return when (gender) {
                NOT_SPECIFIED -> NOT_SPECIFIED.description
                FEMALE -> FEMALE.description
                MALE -> MALE.description
            }
        }
    }
}