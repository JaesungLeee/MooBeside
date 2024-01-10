package com.jslee.domain.model

/**
 * MooBeside
 * @author jaesung
 * @created 2024/01/11
 */
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