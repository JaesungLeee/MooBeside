package com.moobeside.core.data.repository

import androidx.paging.PagingData
import com.moobeside.core.common.kotlin.TMDB_IMAGE_PREFIX
import com.moobeside.core.data.model.toDataModel
import com.moobeside.core.data.model.toDomain
import com.moobeside.core.data.paging.extension.createPager
import com.moobeside.core.data.suspendRunCatching
import com.moobeside.core.domain.repository.MovieRepository
import com.moobeside.core.model.Country
import com.moobeside.core.model.movie.Movie
import com.moobeside.core.remote.source.KobisRemoteDataSource
import com.moobeside.core.remote.source.TmdbRemoteDataSource
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
    private val tmdbRemoteDataSource: TmdbRemoteDataSource,
) : MovieRepository {

    override fun getDailyBoxOffice(targetDate: String): Flow<List<Movie>> = flow {
        val dailyBoxOfficeData = suspendRunCatching {
            kobisRemoteDataSource.getDailyBoxOffice(targetDate).map { it.toDataModel().toDomain() }
        }.getOrThrow()
        emit(dailyBoxOfficeData)
    }

    override fun getSearchMovie(query: String): Flow<PagingData<Movie>> {
        return createPager { page ->
            tmdbRemoteDataSource.getSearchMovie(
                query = query,
                page = page,
            ).map { it.toDataModel().toDomain() }
        }.flow
    }

    override fun getSearchMovieSnapshot(query: String): Flow<List<Movie>> = flow {
        val searchResultSnapshot = suspendRunCatching {
            tmdbRemoteDataSource.getSearchMovie(
                query = query,
                page = 1,
            ).map { it.toDataModel().toDomain() }
        }.getOrThrow()
        emit(searchResultSnapshot)
    }

    override fun getPopularMovie(): Flow<List<Movie>> = flow {
        val popularMovies = suspendRunCatching {
            tmdbRemoteDataSource.getPopularMovie().map { it.toDataModel().toDomain() }
        }.getOrThrow()
        emit(popularMovies)
    }

    override fun getNowPlayingMovie(): Flow<PagingData<Movie>> {
        return createPager { page ->
            tmdbRemoteDataSource.getNowPlayingMovie(page = page).map { it.toDataModel().toDomain() }
        }.flow
    }

    override fun getNowPlayingMovieSnapshot(): Flow<List<Movie>> = flow {
        val nowPlayingSnapshot = suspendRunCatching {
            tmdbRemoteDataSource.getNowPlayingMovie(page = 1).map { it.toDataModel().toDomain() }
        }.getOrThrow()
        emit(nowPlayingSnapshot)
    }

    override fun getUpcomingMovie(): Flow<PagingData<Movie>> {
        return createPager { page ->
            tmdbRemoteDataSource.getUpcomingMovie(page = page).map { it.toDataModel().toDomain() }
        }.flow
    }

    override fun getUpcomingMovieSnapshot(): Flow<List<Movie>> = flow {
        val upcomingSnapshot = suspendRunCatching {
            tmdbRemoteDataSource.getUpcomingMovie(page = 1).map { it.toDataModel().toDomain() }
        }.getOrThrow()
        emit(upcomingSnapshot)
    }

    override fun getMovieReleaseInfo(movieId: Long): Flow<Movie> = flow {
        val releaseDate = suspendRunCatching {
            tmdbRemoteDataSource.getMovieReleaseInfo(movieId)
                .find { it.regionCode == Country.KOREA.regionCode }
                ?.toDataModel()?.toDomain()
                ?: Movie(
                    localizedReleaseDate = null,
                    certification = null
                )
        }.getOrThrow()
        emit(releaseDate)
    }

    override fun getMovieCredits(movieId: Long): Flow<Movie> = flow {
        val credits = suspendRunCatching {
            tmdbRemoteDataSource.getMovieCredits(movieId).toDataModel().toDomain()
        }.getOrThrow()
        emit(credits)
    }

    override fun getMovieDetail(movieId: Long): Flow<Movie> = flow {
        val movieDetailInfo = suspendRunCatching {
            tmdbRemoteDataSource.getMovieDetail(movieId).toDataModel().toDomain()
        }.getOrThrow()
        emit(movieDetailInfo)
    }

    override fun getMovieImages(movieId: Long): Flow<List<String?>> = flow {
        val posterImages = suspendRunCatching {
            tmdbRemoteDataSource.getMovieImages(movieId).posterImages.map {
                it.toDataModel().imageFilePath?.let { path -> TMDB_IMAGE_PREFIX + path }
            }
        }.getOrThrow()
        emit(posterImages)
    }
}