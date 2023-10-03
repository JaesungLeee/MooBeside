package com.jslee.domain.model

/**
 * MooBeside
 * @author jaesung
 * @created 2023/08/09
 */
data class Movie(
    val kobisMovieCode: String? = null,
    val tmdbMovieId: Long? = null,
    val localizedMovieName: String? = null,
    val tagline: String? = null,
    val overview: String? = null,
    val runtime: String? = null,
    val movieStatus: String? = null,  // enum 분리
    val genres: List<String>? = null,
    val originalReleaseDate: String? = null,
    val localizedReleaseDate: String? = null,
    val spokenLanguage: List<String>? = null,
    val posterImageUrl: String? = null,
    val backdropImageUrl: String? = null,
    val certification: String? = null,
    val isAdultMovie: Boolean? = null,
    val rateInfo: Rate? = null,
    val boxOffice: BoxOffice? = null,
    val productionCompanies: List<Company>? = null,
    val casts: List<Cast>? = null,
    val staffs: List<Staff>? = null,
)

