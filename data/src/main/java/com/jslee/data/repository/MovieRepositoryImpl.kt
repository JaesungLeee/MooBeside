package com.jslee.data.repository

import androidx.paging.PagingData
import com.jslee.data.datasource.remote.source.KobisRemoteDataSource
import com.jslee.data.datasource.remote.source.TmdbRemoteDataSource
import com.jslee.data.model.toDomain
import com.jslee.data.paging.extension.createPager
import com.jslee.data.suspendRunCatching
import com.jslee.domain.model.Movie
import com.jslee.domain.repository.MovieRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

/**
 * MooBeside
 * @author jaesung
 * @created 2023/08/09
 */
internal class MovieRepositoryImpl @Inject constructor(
    private val kobisRemoteDataSource: KobisRemoteDataSource,
    private val tmdbRemoteDataSource: TmdbRemoteDataSource
) : MovieRepository {
    override fun getDailyBoxOffice(targetDate: String): Flow<Result<List<Movie>>> = flow {
        emit(
            suspendRunCatching {
                kobisRemoteDataSource.getDailyBoxOffice(targetDate = targetDate)
                    .map { it.toDomain() }
            }
        )
    }

    override fun getSearchMovie(query: String): Flow<PagingData<Movie>> {
        return createPager { page ->
            tmdbRemoteDataSource.getSearchMovie(query = query, page = page).map { it.toDomain() }
        }.flow
    }

    override fun getPopularMovie(): Flow<List<Movie>> = flow {
        val popularMovies = suspendRunCatching {
            tmdbRemoteDataSource.getPopularMovie().map { it.toDomain() }
        }.getOrThrow()
        emit(popularMovies)
    }

    override fun getNowPlayingMovie(): Flow<PagingData<Movie>> {
        return createPager { page ->
            tmdbRemoteDataSource.getNowPlayingMovie(page = page).map { it.toDomain() }
        }.flow
    }

    override fun getNowPlayingMovieSnapshot(): Flow<List<Movie>> = flow {
        val nowPlayingSnapshot = suspendRunCatching {
            tmdbRemoteDataSource.getNowPlayingMovie(page = 1).map { it.toDomain() }
        }.getOrThrow()
        emit(nowPlayingSnapshot)
    }

    override fun getUpcomingMovie(): Flow<PagingData<Movie>> {
        return createPager { page ->
            tmdbRemoteDataSource.getUpcomingMovie(page = page).map { it.toDomain() }
        }.flow
    }

    override fun getUpcomingMovieSnapshot(): Flow<List<Movie>> = flow {
        val upcomingSnapshot = suspendRunCatching {
            tmdbRemoteDataSource.getUpcomingMovie(page = 1).map { it.toDomain() }
        }.getOrThrow()
        emit(upcomingSnapshot)
    }
}