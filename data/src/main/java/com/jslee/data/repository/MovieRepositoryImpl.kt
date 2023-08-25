package com.jslee.data.repository

import com.jslee.data.datasource.remote.source.KobisRemoteDataSource
import com.jslee.data.datasource.remote.source.TmdbRemoteDataSource
import com.jslee.data.model.toDomain
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

    override fun getSearchMovie(query: String): Flow<List<Movie>> = flow {
        val movieList = suspendRunCatching {
            tmdbRemoteDataSource.getSearchMovie(query = query).map { it.toDomain() }
        }.getOrThrow()
        emit(movieList)
    }

    override fun getPopularMovie(): Flow<List<Movie>> = flow {
        val popularMovies = suspendRunCatching {
            tmdbRemoteDataSource.getPopularMovie().map { it.toDomain() }
        }.getOrThrow()
        emit(popularMovies)
    }

    override fun getNowPlayingMovie(): Flow<List<Movie>> = flow {
        val nowPlayingMovies = suspendRunCatching {
            tmdbRemoteDataSource.getNowPlayingMovie().map { it.toDomain() }
        }.getOrThrow()
        emit(nowPlayingMovies)
    }
}