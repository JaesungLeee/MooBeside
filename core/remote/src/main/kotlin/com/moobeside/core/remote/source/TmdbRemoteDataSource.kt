package com.moobeside.core.remote.source

import com.moobeside.core.remote.network.dto.response.tmdb.CommonMovieResponse
import com.moobeside.core.remote.network.dto.response.tmdb.CreditsResponse
import com.moobeside.core.remote.network.dto.response.tmdb.ImagesResponse
import com.moobeside.core.remote.network.dto.response.tmdb.ParticipateCreditsResponse
import com.moobeside.core.remote.network.dto.response.tmdb.PersonResponse
import com.moobeside.core.remote.network.dto.response.tmdb.TmdbReleaseInfoResponse

interface TmdbRemoteDataSource {
    suspend fun getSearchMovie(
        query: String,
        page: Int,
    ): List<CommonMovieResponse>

    suspend fun getPopularMovie(): List<CommonMovieResponse>
    suspend fun getNowPlayingMovie(page: Int): List<CommonMovieResponse>
    suspend fun getUpcomingMovie(page: Int): List<CommonMovieResponse>
    suspend fun getMovieReleaseInfo(movieId: Long): List<TmdbReleaseInfoResponse>
    suspend fun getMovieCredits(movieId: Long): CreditsResponse
    suspend fun getMovieDetail(movieId: Long): CommonMovieResponse
    suspend fun getMovieImages(movieId: Long): ImagesResponse
    suspend fun getPerson(personId: Long): PersonResponse
    suspend fun getParticipateMovie(personId: Long): ParticipateCreditsResponse
}