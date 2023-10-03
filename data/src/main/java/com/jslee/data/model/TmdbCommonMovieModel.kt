package com.jslee.data.model

import com.jslee.data.TMDB_IMAGE_PREFIX
import com.jslee.domain.model.Company
import com.jslee.domain.model.Movie
import com.jslee.domain.model.Rate
import com.jslee.domain.model.TmdbRate

/**
 * MooBeside
 * @author jaesung
 * @created 2023/08/14
 */

internal data class TmdbCommonMovieModel(
    val isAdultMovie: Boolean,
    val backdropPath: String?,
    val belongsToCollection: String?,
    val budget: Long?,
    val genreIdList: List<Int>?,
    val genreList: List<String>?,
    val homepage: String?,
    val tmdbMovieId: Long,
    val imdbMovieId: String?,
    val originalLanguage: String,
    val originalMovieName: String,
    val overview: String,
    val popularity: Double,
    val posterPath: String,
    val productionCompanies: List<ProductionCompanyModel>?,
    val productionCountries: List<String>?,
    val originalReleaseDate: String,
    val revenue: Long?,
    val runtime: Int?,
    val spokenLanguages: List<String>?,
    val movieStatus: String?,
    val tagline: String?,
    val localizedMovieName: String,
    val isIncludeVideo: Boolean,
    val averageVoteRate: Double,
    val voteCount: Int,
)

internal data class ProductionCompanyModel(
    val companyLogoPath: String,
    val companyName: String,
)

internal fun TmdbCommonMovieModel.toDomain() = Movie(
    tmdbMovieId = tmdbMovieId,
    localizedMovieName = localizedMovieName,
    spokenLanguage = spokenLanguages,
    overview = overview,
    originalReleaseDate = originalReleaseDate,
    rateInfo = Rate(
        tmdbRate = TmdbRate(
            averageVoteRate = averageVoteRate,
            voteCount = voteCount
        )
    ),
    isAdultMovie = isAdultMovie,
    posterImageUrl = TMDB_IMAGE_PREFIX + posterPath,
    backdropImageUrl = backdropPath?.let { TMDB_IMAGE_PREFIX + it },
    kobisMovieCode = null,
    tagline = tagline,
    runtime = runtime,
    movieStatus = movieStatus,
    genres = genreList,
    localizedReleaseDate = null,
    certification = null,
    boxOffice = null,
    productionCompanies = productionCompanies?.map {
        Company(
            companyLogoImageUrl = TMDB_IMAGE_PREFIX + it.companyLogoPath,
            companyName = it.companyName
        )
    },
    casts = null,
    staffs = null,
)