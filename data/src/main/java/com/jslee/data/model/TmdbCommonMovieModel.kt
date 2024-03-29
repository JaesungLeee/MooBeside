package com.jslee.data.model

import com.jslee.data.TMDB_IMAGE_PREFIX
import com.jslee.domain.model.movie.Movie
import com.jslee.domain.model.movie.MovieStatus
import com.jslee.domain.model.movie.ProductionCompany
import com.jslee.domain.model.movie.Rate
import com.jslee.domain.model.movie.TmdbRate

/**
 * MooBeside
 * @author jaesung
 * @created 2023/08/14
 */

internal data class TmdbCommonMovieModel(
    val isAdultMovie: Boolean,
    val backdropPath: String?,
    val belongsToCollection: MovieCollectionModel?,
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
    val posterPath: String?,
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

internal data class MovieCollectionModel(
    val collectionId: Long,
    val collectionName: String,
    val posterPath: String?,
    val backdropPath: String?,
)

internal data class ProductionCompanyModel(
    val companyLogoPath: String?,
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
    movieStatus = movieStatus?.let { MovieStatus.fromStatus(it) },
    genres = genreList,
    productionCompanies = productionCompanies?.map {
        ProductionCompany(
            companyLogoImageUrl = TMDB_IMAGE_PREFIX + it.companyLogoPath,
            companyName = it.companyName
        )
    },
)