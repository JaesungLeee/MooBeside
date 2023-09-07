package com.jslee.domain.usecase

import androidx.paging.PagingData
import com.jslee.domain.model.Movie
import com.jslee.domain.repository.MovieRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

/**
 * MooBeside
 * @author jaesung
 * @created 2023/08/28
 */
class GetUpComingMovieUseCase @Inject constructor(
    private val movieRepository: MovieRepository
) {
    operator fun invoke(): Flow<PagingData<Movie>> {
        return movieRepository.getUpcomingMovie()
    }

    fun getSnapshot(): Flow<List<Movie>> {
        return movieRepository.getUpcomingMovieSnapshot()
    }
}