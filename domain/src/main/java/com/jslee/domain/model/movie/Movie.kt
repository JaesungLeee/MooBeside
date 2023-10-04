package com.jslee.domain.model.movie

/**
 * MooBeside
 * @author jaesung
 * @created 2023/08/09
 */
data class Movie(
    val kobisMovieCode: String? = null,
    val tmdbMovieId: Long? = null,
    val localizedMovieName: String? = null,
    val overview: String? = null,
    val tagline: String? = null,
    val runtime: Int? = null,
    val movieStatus: MovieStatus? = null,
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
    val images: List<String>? = null,
    val productionCompanies: List<ProductionCompany>? = null,
    val casts: List<Cast>? = null,
    val staffs: List<Staff>? = null,
)
