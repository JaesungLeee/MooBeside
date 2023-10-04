package com.jslee.domain.usecase

import com.jslee.domain.model.movie.Movie
import com.jslee.domain.repository.MovieRepository
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