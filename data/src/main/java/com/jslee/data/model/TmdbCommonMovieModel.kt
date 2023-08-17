package com.jslee.data.model

import com.jslee.data.TMDB_IMAGE_PREFIX
import com.jslee.domain.model.Movie

/**
 * MooBeside
 * @author jaesung
 * @created 2023/08/14
 */

internal data class TmdbCommonMovieModel(
    val isAdultMovie: Boolean,
    val backDropImagePath: String,
    val genreIdList: List<Int>,
    val tmdbMovieId: Long,
    val language: String,
    val originalMovieTitle: String,
    val overview: String,
    val popularity: Double,
    val posterImagePath: String,
    val releaseDate: String,
    val movieTitle: String,
    val isIncludeVideo: Boolean,
    val averageVoteRate: Double,
    val voteCount: Int,
)

internal fun TmdbCommonMovieModel.toDomain() = Movie(
    tmdbMovieId = tmdbMovieId,
    language = language,
    overview = overview,
    releaseDate = releaseDate,
    genreIdList = genreIdList,
    tmdbAverageVoteRate = averageVoteRate,
    tmdbVoteCount = voteCount,
    isAdultMovie = isAdultMovie,
    posterImageUrl = TMDB_IMAGE_PREFIX + posterImagePath
)