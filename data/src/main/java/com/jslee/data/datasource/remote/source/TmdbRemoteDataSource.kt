package com.jslee.data.datasource.remote.source

import com.jslee.data.UNKNOWN_EXCEPTION
import com.jslee.data.UNKNOWN_FIELD
import com.jslee.data.datasource.remote.dto.response.tmdb.toDataModel
import com.jslee.data.datasource.remote.service.TmdbService
import com.jslee.data.model.ReleaseDateMovieModel
import com.jslee.data.model.TmdbCommonMovieModel
import javax.inject.Inject
import javax.inject.Singleton

/**
 * MooBeside
 * @author jaesung
 * @created 2023/08/14
 */
@Singleton
internal class TmdbRemoteDataSource @Inject constructor(
    private val tmdbService: TmdbService,
) {

    suspend fun getSearchMovie(query: String, page: Int): List<TmdbCommonMovieModel> {
        val response = tmdbService.getSearchMovie(query = query, page = page)
        return response.pagingResult?.map { it.toDataModel() }.orThrow(response.statusMessage)
    }

    suspend fun getPopularMovie(): List<TmdbCommonMovieModel> {
        val response = tmdbService.getPopularMovie()
        return response.pagingResult?.map { it.toDataModel() }.orThrow(response.statusMessage)
    }

    suspend fun getNowPlayingMovie(page: Int): List<TmdbCommonMovieModel> {
        val response = tmdbService.getNowPlayingMovie(page = page)
        return response.pagingResult?.map { it.toDataModel() }.orThrow(response.statusMessage)
    }

    suspend fun getUpcomingMovie(page: Int): List<TmdbCommonMovieModel> {
        val response = tmdbService.getUpcomingMovie(page = page)
        return response.pagingResult?.map { it.toDataModel() }.orThrow(response.statusMessage)
    }

    suspend fun getMovieReleaseDate(movieId: Long): List<ReleaseDateMovieModel> {
        val response = runCatching {
            tmdbService.getMovieReleaseDate(movieId = movieId)
        }.onSuccess { tmdbResponse ->
            if (tmdbResponse.isSuccess == false) {
                throw Exception(tmdbResponse.statusMessage ?: UNKNOWN_EXCEPTION)
            }
        }.getOrElse {
            throw Exception(it)
        }

        return response.pagingResult?.map {
            ReleaseDateMovieModel(
                regionCode = it.regionCode,
                certification = it.releaseDate.map { it.certification }.firstOrNull()
                    ?: UNKNOWN_FIELD,
                releaseDate = it.releaseDate.map { it.releaseDate }.firstOrNull() ?: UNKNOWN_FIELD
            )
        } ?: emptyList()
    }
}

fun <T> List<T>?.orThrow(message: String?): List<T> = this ?: throw Exception(message)