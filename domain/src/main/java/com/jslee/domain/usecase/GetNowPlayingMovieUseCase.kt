package com.jslee.domain.usecase

import androidx.paging.PagingData
import androidx.paging.map
import com.jslee.domain.model.Movie
import com.jslee.domain.repository.MovieRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

/**
 * MooBeside
 * @author jaesung
 * @created 2023/08/25
 */
class GetNowPlayingMovieUseCase @Inject constructor(
    private val movieRepository: MovieRepository
) {

    operator fun invoke(): Flow<PagingData<Movie>> {
        return movieRepository.getNowPlayingMovie()
    }

    fun getSnapshot(): Flow<List<Movie>> {
        return movieRepository.getNowPlayingMovieSnapshot()
    }
}