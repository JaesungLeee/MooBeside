package com.jslee.data.datasource.remote.source

import com.jslee.data.datasource.remote.dto.response.tmdb.toDataModel
import com.jslee.data.datasource.remote.service.TmdbService
import com.jslee.data.model.MovieSearchModel
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

    suspend fun getSearchMovie(query: String): List<MovieSearchModel> {
        val response = tmdbService.getSearchMovie(query = query)
        return response.pagingResult?.map { it.toDataModel() } ?: emptyList()
    }
}