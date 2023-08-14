package com.jslee.data.datasource.remote.service

import com.jslee.data.datasource.remote.dto.response.tmdb.MovieSearchResponse
import com.jslee.data.datasource.remote.dto.response.tmdb.TmdbPagingResponse
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * MooBeside
 * @author jaesung
 * @created 2023/08/07
 */
internal interface TmdbService {

    @GET("search/movie")
    suspend fun getSearchMovie(
        @Query("query") query: String,
        @Query("include_adult") includeAdultMovie: Boolean = false,
        @Query("language") language: String = "ko",
        @Query("region") region: String = "KR",
    ): TmdbPagingResponse<MovieSearchResponse>
}