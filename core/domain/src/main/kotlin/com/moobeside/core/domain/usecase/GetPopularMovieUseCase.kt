package com.moobeside.core.domain.usecase

import com.moobeside.core.domain.repository.MovieRepository
import com.moobeside.core.model.movie.Movie
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

/**
 * MooBeside
 * @author jaesung
 * @created 2023/08/17
 */
class GetPopularMovieUseCase @Inject constructor(
    private val movieRepository: MovieRepository
) {

    operator fun invoke(): Flow<List<Movie>> {
        return movieRepository.getPopularMovie()
    }
}