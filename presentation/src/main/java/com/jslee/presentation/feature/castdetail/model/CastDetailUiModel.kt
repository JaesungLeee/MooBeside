package com.jslee.presentation.feature.castdetail.model

import com.jslee.domain.model.Gender
import com.jslee.domain.model.Person

/**
 * MooBeside
 * @author jaesung
 * @created 2024/01/12
 */
data class CastDetailUiModel(
    val personInfo: PersonInfoUiModel,
    val participateAsCast: List<ParticipateMovieUiModel>,
    val participateAsCrew: List<ParticipateMovieUiModel>,
)

data class PersonInfoUiModel(
    val personId: Long,
    val name: String,
    val profileUrl: String?,
    val gender: String,
)

data class ParticipateMovieUiModel(
    val movieId: Long,
    val localizedMovieName: String,
    val releaseDate: String,
    val posterUrl: String?,
    val voteAverage: String,
    val role: String,
)

fun Person.toUiModel() = CastDetailUiModel(
    personInfo = PersonInfoUiModel(
        personId = personId ?: -1,
        name = name.orEmpty(),
        profileUrl = profileUrl,
        gender = Gender.getDescription(gender)
    ),
    participateAsCast = participateMovieAsCast?.map {
        ParticipateMovieUiModel(
            movieId = it.movieId,
            localizedMovieName = it.localizedMovieName,
            releaseDate = it.releaseDate,
            posterUrl = it.posterUrl,
            voteAverage = it.voteAverage.toString(),
            role = it.character.orEmpty()
        )
    }.orEmpty(),
    participateAsCrew = participateMovieAsCrew?.map {
        ParticipateMovieUiModel(
            movieId = it.movieId,
            localizedMovieName = it.localizedMovieName,
            releaseDate = it.releaseDate,
            posterUrl = it.posterUrl,
            voteAverage = it.voteAverage.toString(),
            role = it.job.orEmpty()
        )
    }.orEmpty()

)
