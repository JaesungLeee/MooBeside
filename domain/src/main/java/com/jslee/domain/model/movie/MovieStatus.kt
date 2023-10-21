package com.jslee.domain.model.movie

import java.lang.IllegalArgumentException

/**
 * Canceled, In Production, Planned, Post Production, Released, Rumored
 */
enum class MovieStatus(val status: String, val description: String) {
    CANCELED("Canceled", "개봉취소"),
    IN_PRODUCTION("In Production", "제작중"),
    PLANNED("Planned", "사전작업"),
    POST_PRODUCTION("Post Production", "후반작업"),
    RELEASED("Released", "개봉"),
    RUMORED("Rumored", "촬영논의중");

    companion object {
        fun fromStatus(status: String): MovieStatus {
            return when (status) {
                CANCELED.status -> CANCELED
                IN_PRODUCTION.status -> IN_PRODUCTION
                PLANNED.status -> PLANNED
                POST_PRODUCTION.status -> POST_PRODUCTION
                RELEASED.status -> RELEASED
                RUMORED.status -> RUMORED
                else -> throw IllegalArgumentException()
            }
        }

        fun getDescription(status: MovieStatus?): String {
            return when (status) {
                CANCELED -> CANCELED.description
                IN_PRODUCTION -> IN_PRODUCTION.description
                PLANNED -> PLANNED.description
                POST_PRODUCTION -> POST_PRODUCTION.description
                RELEASED -> RELEASED.description
                RUMORED -> RUMORED.description
                else -> throw IllegalArgumentException()
            }
        }
    }
}