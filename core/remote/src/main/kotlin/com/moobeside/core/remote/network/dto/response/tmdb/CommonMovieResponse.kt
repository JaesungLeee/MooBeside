package com.moobeside.core.remote.network.dto.response.tmdb

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * MooBeside
 * @author jaesung
 * @created 2023/08/14
 */
@Serializable
data class CommonMovieResponse(
    @SerialName("adult") val isAdultMovie: Boolean,
    @SerialName("backdrop_path") val backdropPath: String?,
    @SerialName("belongs_to_collection") val belongsToCollection: MovieCollection? = null,
    @SerialName("budget") val budget: Long? = null,
    @SerialName("genre_ids") val genreIdList: List<Int>? = null,
    @SerialName("genres") val genres: List<GenreResponse>? = null,
    @SerialName("homepage") val homepage: String? = null,
    @SerialName("id") val tmdbMovieId: Long,
    @SerialName("imdb_id") val imdbMovieId: String? = null,
    @SerialName("original_language") val originalLanguage: String,
    @SerialName("original_title") val originalMovieName: String,
    @SerialName("overview") val overview: String,
    @SerialName("popularity") val popularity: Double,
    @SerialName("poster_path") val posterPath: String? = null,
    @SerialName("production_companies") val productionCompanies: List<ProductionCompanyResponse>? = null,
    @SerialName("production_countries") val productionCountries: List<ProductionCountryResponse>? = null,
    @SerialName("release_date") val originalReleaseDate: String,
    @SerialName("revenue") val revenue: Long? = null,
    @SerialName("runtime") val runtime: Int? = null,
    @SerialName("spoken_languages") val spokenLanguages: List<SpokenLanguageResponse>? = null,
    @SerialName("status") val movieStatus: String? = null,
    @SerialName("tagline") val tagline: String? = null,
    @SerialName("title") val localizedMovieName: String,
    @SerialName("video") val isIncludeVideo: Boolean,
    @SerialName("vote_average") val averageVoteRate: Double,
    @SerialName("vote_count") val voteCount: Int,
)

@Serializable
data class MovieCollection(
    @SerialName("id") val collectionId: Long,
    @SerialName("name") val collectionName: String,
    @SerialName("poster_path") val posterPath: String? = null,
    @SerialName("backdrop_path") val backdropPath: String? = null,
)

@Serializable
data class GenreResponse(
    @SerialName("id") val genreId: Long,
    @SerialName("name") val genre: String,
)

@Serializable
data class SpokenLanguageResponse(
    @SerialName("english_name") val englishName: String,
    @SerialName("iso_639_1") val languageCode: String,
    @SerialName("name") val languageName: String,
)

@Serializable
data class ProductionCompanyResponse(
    @SerialName("id") val companyId: Long,
    @SerialName("logo_path") val companyLogoPath: String? = null,
    @SerialName("name") val companyName: String,
    @SerialName("origin_country") val locatedRegionCode: String,
)

@Serializable
data class ProductionCountryResponse(
    @SerialName("iso_3166_1") val regionCode: String,
    @SerialName("name") val countryName: String,
)