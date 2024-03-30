package com.jslee.data.datasource.remote

import com.jslee.data.model.MovieCreditsModel
import com.jslee.data.model.MovieImagesModel
import com.jslee.data.model.MovieReleaseInfoModel
import com.jslee.data.model.ParticipateCreditsModel
import com.jslee.data.model.PersonInfoModel
import com.jslee.data.model.TmdbCommonMovieModel
import com.jslee.data.network.dto.response.tmdb.toDataModel
import com.jslee.data.network.service.TmdbService
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
        val response = tmdbService.getSearchMovie(query = query, page = page).getOrThrow()
        return response.pagingResult?.map { it.toDataModel() }.orEmpty()
    }

    suspend fun getPopularMovie(): List<TmdbCommonMovieModel> {
        val response = tmdbService.getPopularMovie().getOrThrow()
        return response.pagingResult?.map { it.toDataModel() }.orEmpty()
    }

    suspend fun getNowPlayingMovie(page: Int): List<TmdbCommonMovieModel> {
        val response = tmdbService.getNowPlayingMovie(page = page).getOrThrow()
        return response.pagingResult?.map { it.toDataModel() }.orEmpty()
    }

    suspend fun getUpcomingMovie(page: Int): List<TmdbCommonMovieModel> {
        val response = tmdbService.getUpcomingMovie(page = page).getOrThrow()
        return response.pagingResult?.map { it.toDataModel() }.orEmpty()
    }

    suspend fun getMovieReleaseInfo(movieId: Long): List<MovieReleaseInfoModel> {
        val response = tmdbService.getMovieReleaseInfo(movieId).getOrThrow()
        return response.pagingResult?.map { it.toDataModel() }.orEmpty()
    }

    suspend fun getMovieCredits(movieId: Long): MovieCreditsModel {
        val response = tmdbService.getMovieCredits(movieId).getOrThrow()
        return response.toDataModel()
    }

    suspend fun getMovieDetail(movieId: Long): TmdbCommonMovieModel {
        val response = tmdbService.getMovieDetail(movieId).getOrThrow()
        return response.toDataModel()
    }

    suspend fun getMovieImages(movieId: Long): MovieImagesModel {
        val response = tmdbService.getMovieImages(movieId).getOrThrow()
        return response.toDataModel()
    }

    suspend fun getPerson(personId: Long): PersonInfoModel {
        val response = tmdbService.getPerson(personId).getOrThrow()
        return response.toDataModel()
    }

    suspend fun getParticipateMovie(personId: Long): ParticipateCreditsModel {
        val response = tmdbService.getParticipateMovie(personId).getOrThrow()
        return response.toDataModel()
    }
}