package com.moobeside.core.data.model

import com.moobeside.core.common.kotlin.TMDB_IMAGE_PREFIX
import com.moobeside.core.model.movie.Movie
import com.moobeside.core.model.movie.MovieStatus
import com.moobeside.core.model.movie.ProductionCompany
import com.moobeside.core.model.movie.Rate
import com.moobeside.core.remote.network.dto.response.tmdb.CommonMovieResponse
import com.moobeside.core.remote.network.dto.response.tmdb.MovieCollection
import com.moobeside.core.remote.network.dto.response.tmdb.ProductionCompanyResponse

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
        averageVoteRate = averageVoteRate,
        voteCount = voteCount
    ),
    isAdultMovie = isAdultMovie,
    posterImageUrl = posterPath?.let { TMDB_IMAGE_PREFIX + it },
    backdropImageUrl = backdropPath?.let { TMDB_IMAGE_PREFIX + it },
    kobisMovieCode = null,
    tagline = tagline,
    runtime = runtime,
    movieStatus = movieStatus?.let { MovieStatus.fromStatus(it) },
    genres = genreList,
    productionCompanies = productionCompanies?.map {
        ProductionCompany(
            companyLogoImageUrl = it.companyLogoPath?.let { path -> TMDB_IMAGE_PREFIX + path },
            companyName = it.companyName
        )
    },
)

internal fun MovieCollection.toDataModel() = MovieCollectionModel(
    collectionId = collectionId,
    collectionName = collectionName,
    posterPath = posterPath,
    backdropPath = backdropPath,
)

internal fun ProductionCompanyResponse.toDataModel() = ProductionCompanyModel(
    companyLogoPath = companyLogoPath,
    companyName = companyName,
)

internal fun CommonMovieResponse.toDataModel() = TmdbCommonMovieModel(
    isAdultMovie = isAdultMovie,
    backdropPath = backdropPath,
    belongsToCollection = belongsToCollection?.toDataModel(),
    budget = budget,
    genreIdList = genreIdList,
    genreList = genres?.map { it.genre },
    homepage = homepage,
    tmdbMovieId = tmdbMovieId,
    imdbMovieId = imdbMovieId,
    originalLanguage = originalLanguage,
    originalMovieName = originalMovieName,
    overview = overview,
    popularity = popularity,
    posterPath = posterPath,
    productionCompanies = productionCompanies?.map { it.toDataModel() },
    productionCountries = productionCountries?.map { it.countryName },
    originalReleaseDate = originalReleaseDate,
    revenue = revenue,
    runtime = runtime,
    spokenLanguages = spokenLanguages?.map { it.languageName },
    movieStatus = movieStatus,
    tagline = tagline,
    localizedMovieName = localizedMovieName,
    isIncludeVideo = isIncludeVideo,
    averageVoteRate = averageVoteRate,
    voteCount = voteCount
)
