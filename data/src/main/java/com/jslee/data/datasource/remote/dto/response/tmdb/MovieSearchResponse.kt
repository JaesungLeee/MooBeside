package com.jslee.data.datasource.remote.dto.response.tmdb

import com.jslee.data.model.MovieSearchModel
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * MooBeside
 * @author jaesung
 * @created 2023/08/14
 */
@Serializable
data class TmdbCommonMovieResponse(
    @SerialName("adult")
    val isAdultMovie: Boolean,
    @SerialName("backdrop_path")
    val backDropImagePath: String?,
    @SerialName("genre_ids")
    val genreIdList: List<Int>,
    @SerialName("id")
    val tmdbMovieId: Long,
    @SerialName("original_language")
    val language: String,
    @SerialName("original_title")
    val originalMovieTitle: String,
    @SerialName("overview")
    val overview: String,
    @SerialName("popularity")
    val popularity: Double,
    @SerialName("poster_path")
    val posterImagePath: String,
    @SerialName("release_date")
    val releaseDate: String,
    @SerialName("title")
    val movieTitle: String,
    @SerialName("video")
    val isIncludeVideo: Boolean,
    @SerialName("vote_average")
    val averageVoteRate: Double,
    @SerialName("vote_count")
    val voteCount: Int,
)


internal fun TmdbCommonMovieResponse.toDataModel() = MovieSearchModel(
    isAdultMovie = isAdultMovie,
    backDropImagePath = backDropImagePath.orEmpty(),
    genreIdList = genreIdList,
    tmdbMovieId = tmdbMovieId,
    language = language,
    originalMovieTitle = originalMovieTitle,
    overview = overview,
    popularity = popularity,
    posterImagePath = posterImagePath,
    releaseDate = releaseDate,
    movieTitle = movieTitle,
    isIncludeVideo = isIncludeVideo,
    averageVoteRate = averageVoteRate,
    voteCount = voteCount,
)