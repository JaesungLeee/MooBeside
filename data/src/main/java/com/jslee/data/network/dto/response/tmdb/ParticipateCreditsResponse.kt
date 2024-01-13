package com.jslee.data.network.dto.response.tmdb

import com.jslee.data.model.ParticipateAsCastModel
import com.jslee.data.model.ParticipateAsCrewModel
import com.jslee.data.model.ParticipateCreditsModel
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * MooBeside
 * @author jaesung
 * @created 2024/01/11
 */

@Serializable
internal data class ParticipateCreditsResponse(
    @SerialName("id") val personId: Long,
    @SerialName("cast") val castData: List<ParticipateAsCastResponse>,
    @SerialName("crew") val staffData: List<ParticipateAsCrewResponse>,
)

@Serializable
internal data class ParticipateAsCastResponse(
    @SerialName("adult") val isAdult: Boolean,
    @SerialName("backdrop_path") val backdropPath: String? = null,
    @SerialName("genre_ids") val genreIdList: List<Int>,
    @SerialName("id") val movieId: Long,
    @SerialName("original_language") val originalLanguage: String,
    @SerialName("original_title") val originalMovieName: String,
    @SerialName("overview") val overview: String,
    @SerialName("popularity") val popularity: Double,
    @SerialName("poster_path") val posterPath: String?,
    @SerialName("release_date") val originalReleaseDate: String,
    @SerialName("title") val localizedMovieName: String,
    @SerialName("video") val isIncludeVideo: Boolean,
    @SerialName("vote_average") val voteAverage: Double,
    @SerialName("vote_count") val voteCount: Int,
    @SerialName("character") val characterName: String,
    @SerialName("credit_id") val creditId: String,
    @SerialName("order") val order: Int,
)

@Serializable
internal data class ParticipateAsCrewResponse(
    @SerialName("adult") val isAdult: Boolean,
    @SerialName("backdrop_path") val backdropPath: String? = null,
    @SerialName("genre_ids") val genreIdList: List<Int>,
    @SerialName("id") val movieId: Long,
    @SerialName("original_language") val originalLanguage: String,
    @SerialName("original_title") val originalMovieName: String,
    @SerialName("overview") val overview: String,
    @SerialName("popularity") val popularity: Double,
    @SerialName("poster_path") val posterPath: String?,
    @SerialName("release_date") val originalReleaseDate: String,
    @SerialName("title") val localizedMovieName: String,
    @SerialName("video") val isIncludeVideo: Boolean,
    @SerialName("vote_average") val voteAverage: Double,
    @SerialName("vote_count") val voteCount: Int,
    @SerialName("credit_id") val creditId: String,
    @SerialName("department") val department: String,
    @SerialName("job") val job: String,
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