package com.jslee.presentation.feature.castdetail.model

import com.jslee.core.date.DateFormat
import com.jslee.core.date.transformDate
import com.jslee.core.ui.extension.roundVoteRate
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
) {
    private val displayYear =
        releaseDate.transformDate(DateFormat.DISP_YEAR_MONTH_DAY, DateFormat.DISP_YEAR)
    val movieSummary = "$displayYear  · ${role}역"
}

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
            releaseDate = it.releaseDate.transformDate(
                DateFormat.YEAR_MONTH_DAY_HYPHEN,
                DateFormat.DISP_YEAR_MONTH_DAY
            ),
            posterUrl = it.posterUrl,
            voteAverage = roundVoteRate(it.voteAverage),
            role = it.character.orEmpty()
        )
    }.orEmpty(),
    participateAsCrew = participateMovieAsCrew?.map {
        ParticipateMovieUiModel(
            movieId = it.movieId,
            localizedMovieName = it.localizedMovieName,
            releaseDate = it.releaseDate.transformDate(
                DateFormat.YEAR_MONTH_DAY_HYPHEN,
                DateFormat.DISP_YEAR_MONTH_DAY
            ),
            posterUrl = it.posterUrl,
            voteAverage = roundVoteRate(it.voteAverage),
            role = it.job.orEmpty()
        )
    }.orEmpty()

)
