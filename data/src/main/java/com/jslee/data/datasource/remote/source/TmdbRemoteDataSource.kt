package com.jslee.data.datasource.remote.source

import com.jslee.data.datasource.remote.dto.response.tmdb.toDataModel
import com.jslee.data.datasource.remote.service.TmdbService
import com.jslee.data.model.TmdbCommonMovieModel
import retrofit2.HttpException
import javax.inject.Inject
import javax.inject.Singleton

/**
 * MooBeside
 * @author jaesung
 * @created 2023/08/14
 */
@Singleton
internal class TmdbRemoteDataSource @Inject constructor(
    private val tmdbService: TmdbService
) {

    suspend fun getSearchMovie(query: String): List<TmdbCommonMovieModel> {
        val response = tmdbService.getSearchMovie(query = query)
        return response.pagingResult?.map { it.toDataModel() } ?: emptyList()
    }

    suspend fun getPopularMovie(): List<TmdbCommonMovieModel> {
        val response = tmdbService.getPopularMovie()
        return response.pagingResult?.map { it.toDataModel() }.orThrow(response.statusMessage)
    }
}

fun <T> List<T>?.orThrow(message: String?): List<T> = this ?: throw Exception(message)