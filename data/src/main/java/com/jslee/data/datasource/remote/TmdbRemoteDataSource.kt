package com.jslee.data.datasource.remote

import com.jslee.data.UNKNOWN_EXCEPTION
import com.jslee.data.network.dto.response.tmdb.toDataModel
import com.jslee.data.network.service.TmdbService
import com.jslee.data.model.MovieCreditsModel
import com.jslee.data.model.MovieImagesModel
import com.jslee.data.model.MovieReleaseInfoModel
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

    suspend fun getMovieReleaseInfo(movieId: Long): List<MovieReleaseInfoModel> {
        val response = runCatching {
            tmdbService.getMovieReleaseInfo(movieId = movieId)
        }.onSuccess { tmdbResponse ->
            if (tmdbResponse.isSuccess == false) {
                throw Exception(tmdbResponse.statusMessage ?: UNKNOWN_EXCEPTION)
            }
        }.getOrElse {
            throw Exception(it)
        }

        return response.pagingResult?.map { it.toDataModel() } ?: emptyList()
    }

    suspend fun getMovieCredits(movieId: Long): MovieCreditsModel {
        val response = runCatching {
            tmdbService.getMovieCredits(movieId = movieId)
        }.getOrElse {
            throw Exception(it)
        }

        return response.toDataModel()
    }

    suspend fun getMovieDetail(movieId: Long): TmdbCommonMovieModel {
        val response = runCatching {
            tmdbService.getMovieDetail(movieId = movieId)
        }.getOrElse {
            throw Exception(it)
        }

        return response.toDataModel()
    }

    suspend fun getMovieImages(movieId: Long): MovieImagesModel {
        val response = runCatching {
            tmdbService.getMovieImages(movieId = movieId)
        }.getOrElse {
            throw Exception(it)
        }

        return response.toDataModel()
    }
}

fun <T> List<T>?.orThrow(message: String?): List<T> = this ?: throw Exception(message)