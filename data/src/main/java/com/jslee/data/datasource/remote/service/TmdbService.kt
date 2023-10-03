package com.jslee.data.datasource.remote.service

import com.jslee.data.BuildConfig
import com.jslee.data.Country
import com.jslee.data.SINGLE_PAGE
import com.jslee.data.datasource.remote.dto.response.tmdb.CreditsResponse
import com.jslee.data.datasource.remote.dto.response.tmdb.TmdbCommonMovieResponse
import com.jslee.data.datasource.remote.dto.response.tmdb.TmdbCommonResponse
import com.jslee.data.datasource.remote.dto.response.tmdb.TmdbReleaseDateResponse
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

/**
 * MooBeside
 * @author jaesung
 * @created 2023/08/07
 */
internal interface TmdbService {

    @GET("search/movie")
    suspend fun getSearchMovie(
        @Query("api_key") apiKey: String = BuildConfig.TMDB_API_KEY,
        @Query("query") query: String,
        @Query("page") page: Int,
        @Query("include_adult") includeAdultMovie: Boolean = false,
        @Query("language") language: String = Country.KOREA.languageCode,
        @Query("region") region: String = Country.KOREA.regionCode,
    ): TmdbCommonResponse<TmdbCommonMovieResponse>

    @GET("movie/popular")
    suspend fun getPopularMovie(
        @Query("api_key") apiKey: String = BuildConfig.TMDB_API_KEY,
        @Query("language") language: String = Country.KOREA.languageCode,
        @Query("page") page: Int = SINGLE_PAGE,
        @Query("region") region: String = Country.KOREA.regionCode,
    ): TmdbCommonResponse<TmdbCommonMovieResponse>

    @GET("movie/now_playing")
    suspend fun getNowPlayingMovie(
        @Query("api_key") apiKey: String = BuildConfig.TMDB_API_KEY,
        @Query("language") language: String = Country.KOREA.languageCode,
        @Query("region") region: String = Country.KOREA.regionCode,
        @Query("page") page: Int,
    ): TmdbCommonResponse<TmdbCommonMovieResponse>

    @GET("movie/upcoming")
    suspend fun getUpcomingMovie(
        @Query("api_key") apiKey: String = BuildConfig.TMDB_API_KEY,
        @Query("language") language: String = Country.KOREA.languageCode,
        @Query("region") region: String = Country.KOREA.regionCode,
        @Query("page") page: Int,
    ): TmdbCommonResponse<TmdbCommonMovieResponse>

    @GET("movie/{movieId}/release_dates")
    suspend fun getMovieReleaseDate(
        @Path("movieId") movieId: Long,
        @Query("api_key") apiKey: String = BuildConfig.TMDB_API_KEY,
    ): TmdbCommonResponse<TmdbReleaseDateResponse>

    @GET("movie/{movieId}/credits")
    suspend fun getMovieCredits(
        @Path("movieId") movieId: Long,
        @Query("api_key") apiKey: String = BuildConfig.TMDB_API_KEY,
    ): CreditsResponse
}