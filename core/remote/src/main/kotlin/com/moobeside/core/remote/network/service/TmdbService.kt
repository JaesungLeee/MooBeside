package com.moobeside.core.remote.network.service

import com.moobeside.core.common.kotlin.SINGLE_PAGE
import com.moobeside.core.model.Country
import com.moobeside.core.remote.network.ApiResult
import com.moobeside.core.remote.BuildConfig
import com.moobeside.core.remote.network.dto.response.tmdb.CommonMovieResponse
import com.moobeside.core.remote.network.dto.response.tmdb.CreditsResponse
import com.moobeside.core.remote.network.dto.response.tmdb.ImagesResponse
import com.moobeside.core.remote.network.dto.response.tmdb.ParticipateCreditsResponse
import com.moobeside.core.remote.network.dto.response.tmdb.PersonResponse
import com.moobeside.core.remote.network.dto.response.tmdb.TmdbCommonResponse
import com.moobeside.core.remote.network.dto.response.tmdb.TmdbReleaseInfoResponse
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
    ): ApiResult<TmdbCommonResponse<CommonMovieResponse>>

    @GET("movie/popular")
    suspend fun getPopularMovie(
        @Query("api_key") apiKey: String = BuildConfig.TMDB_API_KEY,
        @Query("language") language: String = Country.KOREA.languageCode,
        @Query("page") page: Int = SINGLE_PAGE,
        @Query("region") region: String = Country.KOREA.regionCode,
    ): ApiResult<TmdbCommonResponse<CommonMovieResponse>>

    @GET("movie/now_playing")
    suspend fun getNowPlayingMovie(
        @Query("api_key") apiKey: String = BuildConfig.TMDB_API_KEY,
        @Query("language") language: String = Country.KOREA.languageCode,
        @Query("region") region: String = Country.KOREA.regionCode,
        @Query("page") page: Int,
    ): ApiResult<TmdbCommonResponse<CommonMovieResponse>>

    @GET("movie/upcoming")
    suspend fun getUpcomingMovie(
        @Query("api_key") apiKey: String = BuildConfig.TMDB_API_KEY,
        @Query("language") language: String = Country.KOREA.languageCode,
        @Query("region") region: String = Country.KOREA.regionCode,
        @Query("page") page: Int,
    ): ApiResult<TmdbCommonResponse<CommonMovieResponse>>

    @GET("movie/{movieId}/release_dates")
    suspend fun getMovieReleaseInfo(
        @Path("movieId") movieId: Long,
        @Query("api_key") apiKey: String = BuildConfig.TMDB_API_KEY,
    ): ApiResult<TmdbCommonResponse<TmdbReleaseInfoResponse>>

    @GET("movie/{movieId}/credits")
    suspend fun getMovieCredits(
        @Path("movieId") movieId: Long,
        @Query("api_key") apiKey: String = BuildConfig.TMDB_API_KEY,
    ): ApiResult<CreditsResponse>

    @GET("movie/{movieId}")
    suspend fun getMovieDetail(
        @Path("movieId") movieId: Long,
        @Query("api_key") apiKey: String = BuildConfig.TMDB_API_KEY,
        @Query("language") language: String = Country.KOREA.languageCode,
    ): ApiResult<CommonMovieResponse>

    @GET("movie/{movieId}/images")
    suspend fun getMovieImages(
        @Path("movieId") movieId: Long,
        @Query("api_key") apiKey: String = BuildConfig.TMDB_API_KEY,
        @Query("language") language: String = Country.KOREA.languageCode,
    ): ApiResult<ImagesResponse>

    @GET("person/{personId}")
    suspend fun getPerson(
        @Path("personId") personId: Long,
        @Query("api_key") apiKey: String = BuildConfig.TMDB_API_KEY,
        @Query("language") language: String = Country.KOREA.languageCode,
    ): ApiResult<PersonResponse>

    @GET("person/{personId}/movie_credits")
    suspend fun getParticipateMovie(
        @Path("personId") personId: Long,
        @Query("api_key") apiKey: String = BuildConfig.TMDB_API_KEY,
        @Query("language") language: String = Country.KOREA.languageCode,
    ): ApiResult<ParticipateCreditsResponse>
}