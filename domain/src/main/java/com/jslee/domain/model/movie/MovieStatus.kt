package com.jslee.domain.model.movie

enum class MovieStatus(val status: String) {
    UNKNOWN("Unknown"),
    RELEASED("Released"),
    RUMORED("Rumored"),
    POST_PRODUCTION("Post Production"),
    PLANNED("Planned"),
    IN_PRODUCTION("In Production"),
    CANCELED("Canceled");

    companion object {
        fun fromStatus(status: String): MovieStatus {
            return when (status) {
                RELEASED.status -> RELEASED
                RUMORED.status -> RUMORED
                POST_PRODUCTION.status -> POST_PRODUCTION
                PLANNED.status -> PLANNED
                IN_PRODUCTION.status -> IN_PRODUCTION
                CANCELED.status -> CANCELED
                else -> UNKNOWN
            }
        }
    }
}