package com.moobeside.core.remote.source.impl

import com.moobeside.core.remote.network.dto.response.tmdb.CommonMovieResponse
import com.moobeside.core.remote.network.dto.response.tmdb.CreditsResponse
import com.moobeside.core.remote.network.dto.response.tmdb.ImagesResponse
import com.moobeside.core.remote.network.dto.response.tmdb.ParticipateCreditsResponse
import com.moobeside.core.remote.network.dto.response.tmdb.PersonResponse
import com.moobeside.core.remote.network.dto.response.tmdb.TmdbReleaseInfoResponse
import com.moobeside.core.remote.network.service.TmdbService
import com.moobeside.core.remote.source.TmdbRemoteDataSource
import javax.inject.Inject
import javax.inject.Singleton

/**
 * MooBeside
 * @author jaesung
 * @created 2023/08/14
 */
@Singleton
internal class TmdbRemoteDataSourceImpl @Inject constructor(
    private val tmdbService: TmdbService,
) : TmdbRemoteDataSource {

    override suspend fun getSearchMovie(query: String, page: Int): List<CommonMovieResponse> {
        val response = tmdbService.getSearchMovie(query = query, page = page).getOrThrow()
        return response.pagingResult.orEmpty()
//        return response.pagingResult?.map { it.toDataModel() }.orEmpty()
    }

    override suspend fun getPopularMovie(): List<CommonMovieResponse> {
        val response = tmdbService.getPopularMovie().getOrThrow()
//        return response.pagingResult?.map { it.toDataModel() }.orEmpty()
        return response.pagingResult.orEmpty()
    }

    override suspend fun getNowPlayingMovie(page: Int): List<CommonMovieResponse> {
        val response = tmdbService.getNowPlayingMovie(page = page).getOrThrow()
//        return response.pagingResult?.map { it.toDataModel() }.orEmpty()
        return response.pagingResult.orEmpty()
    }

    override suspend fun getUpcomingMovie(page: Int): List<CommonMovieResponse> {
        val response = tmdbService.getUpcomingMovie(page = page).getOrThrow()
//        return response.pagingResult?.map { it.toDataModel() }.orEmpty()
        return response.pagingResult.orEmpty()
    }

    override suspend fun getMovieReleaseInfo(movieId: Long): List<TmdbReleaseInfoResponse> {
        val response = tmdbService.getMovieReleaseInfo(movieId).getOrThrow()
//        return response.pagingResult?.map { it.toDataModel() }.orEmpty()
        return response.pagingResult.orEmpty()
    }

    override suspend fun getMovieCredits(movieId: Long): CreditsResponse {
        return tmdbService.getMovieCredits(movieId).getOrThrow()
//        return response.toDataModel()
    }

    override suspend fun getMovieDetail(movieId: Long): CommonMovieResponse {
        return tmdbService.getMovieDetail(movieId).getOrThrow()
//        return response.toDataModel()
    }

    override suspend fun getMovieImages(movieId: Long): ImagesResponse {
        return tmdbService.getMovieImages(movieId).getOrThrow()
//        return response.toDataModel()
    }

    override suspend fun getPerson(personId: Long): PersonResponse {
        return tmdbService.getPerson(personId).getOrThrow()
//        return response.toDataModel()
    }

    override suspend fun getParticipateMovie(personId: Long): ParticipateCreditsResponse {
        return tmdbService.getParticipateMovie(personId).getOrThrow()
//        return response.toDataModel()
    }
}