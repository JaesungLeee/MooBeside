package com.jslee.domain.model

/**
 * MooBeside
 * @author jaesung
 * @created 2024/01/11
 */
data class Person(
    val personId: Long? = null,
    val name: String? = null,
    val profileUrl: String? = null,
    val gender: Gender? = null,
    val dateOfBirth: String? = null,
    val dateOfDeath: String? = null,
    val biography: String? = null,
    val participateMovieAsCast: List<ParticipateMovie>? = null,
    val participateMovieAsCrew: List<ParticipateMovie>? = null,
)

data class ParticipateMovie(
    val movieId: Long,
    val localizedMovieName: String,
    val releaseDate: String,
    val posterUrl: String?,
    val voteAverage: Double,
    val character: String? = null,
    val job: String? = null,
)
