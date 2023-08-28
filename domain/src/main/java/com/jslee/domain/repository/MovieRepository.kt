package com.jslee.domain.repository

import androidx.paging.PagingData
import com.jslee.domain.model.Movie
import kotlinx.coroutines.flow.Flow

/**
 * MooBeside
 * @author jaesung
 * @created 2023/08/09
 */
interface MovieRepository {

    fun getDailyBoxOffice(targetDate: String): Flow<Result<List<Movie>>>
    fun getSearchMovie(query: String): Flow<PagingData<Movie>>
    fun getPopularMovie(): Flow<List<Movie>>
    fun getNowPlayingMovie(): Flow<PagingData<Movie>>
}