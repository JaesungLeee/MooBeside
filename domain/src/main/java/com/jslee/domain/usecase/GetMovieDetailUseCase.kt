package com.jslee.domain.usecase

import com.jslee.domain.repository.MovieRepository
import javax.inject.Inject

/**
 * MooBeside
 * @author jaesung
 * @created 2023/10/03
 */
class GetMovieDetailUseCase @Inject constructor(
    private val movieRepository: MovieRepository
) {

    private fun getMovieReleaseDate(movieId: Long) = movieRepository.getMovieReleaseDate(movieId)

    operator fun invoke(movieId: Long) = getMovieReleaseDate(movieId)
}