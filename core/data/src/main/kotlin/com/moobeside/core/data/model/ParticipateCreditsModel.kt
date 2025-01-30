package com.moobeside.core.data.model

import com.moobeside.core.common.kotlin.TMDB_IMAGE_PREFIX
import com.moobeside.core.model.ParticipateMovie
import com.moobeside.core.model.Person
import com.moobeside.core.remote.network.dto.response.tmdb.ParticipateCreditsResponse

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

internal fun ParticipateCreditsResponse.toDataModel() = ParticipateCreditsModel(
    casts = castData.map {
        ParticipateAsCastModel(
            movieId = it.movieId,
            localizedMovieName = it.localizedMovieName,
            releaseDate = it.originalReleaseDate,
            posterPath = it.posterPath,
            voteAverage = it.voteAverage,
            character = it.characterName
        )
    },
    crews = staffData.map {
        ParticipateAsCrewModel(
            movieId = it.movieId,
            localizedMovieName = it.localizedMovieName,
            releaseDate = it.originalReleaseDate,
            posterPath = it.posterPath,
            voteAverage = it.voteAverage,
            job = it.job
        )
    }
)
