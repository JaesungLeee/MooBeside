package com.jslee.domain.model

/**
 * MooBeside
 * @author jaesung
 * @created 2023/08/09
 */
data class Movie(
    val kobisMovieCode: String? = null,
    val tmdbMovieId: Long? = null,
    val movieName: String? = null,
    val language: String? = null,
    val overview: String? = null,
    val openDate: String? = null,
    val releaseDate: String? = null,
    val genreIdList: List<Int>? = null,
    val posterImageUrl: String? = null,
    val backdropImageUrl: String? = null,
    val tmdbAverageVoteRate: Double? = null,
    val tmdbVoteCount: Int? = null,
    val boxOffice: BoxOffice? = null,
    val isAdultMovie: Boolean? = null,
    val certification: String? = null,
    val casts: List<Cast>? = null,
    val staffs: List<Staff>? = null,
)
