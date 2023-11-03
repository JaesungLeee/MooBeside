package com.jslee.domain.repository

import androidx.paging.PagingData
import com.jslee.domain.model.movie.Movie
import kotlinx.coroutines.flow.Flow

/**
 * MooBeside
 * @author jaesung
 * @created 2023/08/09
 */
interface MovieRepository {

    fun getDailyBoxOffice(targetDate: String): Flow<List<Movie>>
    fun getSearchMovie(query: String): Flow<PagingData<Movie>>
    fun getSearchMovieSnapshot(query: String): Flow<List<Movie>>
    fun getPopularMovie(): Flow<List<Movie>>
    fun getNowPlayingMovie(): Flow<PagingData<Movie>>
    fun getNowPlayingMovieSnapshot(): Flow<List<Movie>>
    fun getUpcomingMovie(): Flow<PagingData<Movie>>
    fun getUpcomingMovieSnapshot(): Flow<List<Movie>>
    fun getMovieReleaseInfo(movieId: Long): Flow<Movie>
    fun getMovieCredits(movieId: Long): Flow<Movie>
    fun getMovieDetail(movieId: Long): Flow<Movie>
    fun getMovieImages(movieId: Long): Flow<List<String>>
}