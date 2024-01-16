package com.jslee.data.model

import com.jslee.data.TMDB_IMAGE_PREFIX
import com.jslee.domain.model.ParticipateMovie
import com.jslee.domain.model.Person

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

internal fun ParticipateCreditsModel.toDomain() = Person(
    participateMovieAsCast = casts.map {
        ParticipateMovie(
            movieId = it.movieId,
            localizedMovieName = it.localizedMovieName,
            releaseDate = it.releaseDate,
            posterUrl = it.posterPath?.let { path -> TMDB_IMAGE_PREFIX + path },
            voteAverage = it.voteAverage,
            character = it.character,
        )
    },
    participateMovieAsCrew = crews.map {
        ParticipateMovie(
            movieId = it.movieId,
            localizedMovieName = it.localizedMovieName,
            releaseDate = it.releaseDate,
            posterUrl = it.posterPath?.let { path -> TMDB_IMAGE_PREFIX + path },
            voteAverage = it.voteAverage,
            job = it.job
        )
    }
)
