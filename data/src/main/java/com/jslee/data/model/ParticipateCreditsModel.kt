package com.jslee.data.model

/**
 * MooBeside
 * @author jaesung
 * @created 2024/01/11
 */
internal data class ParticipateCreditsModel(
    val casts: List<ParticipateAsCastModel>,
    val crews: List<ParticipateAsCrewModel>,
)

internal data class ParticipateAsCastModel(
    val movieId: Long,
    val localizedMovieName: String,
    val releaseDate: String,
    val posterPath: String?,
    val voteAverage: Double,
    val character: String,
)

internal data class ParticipateAsCrewModel(
    val movieId: Long,
    val localizedMovieName: String,
    val releaseDate: String,
    val posterPath: String?,
    val voteAverage: Double,
    val job: String,
)

