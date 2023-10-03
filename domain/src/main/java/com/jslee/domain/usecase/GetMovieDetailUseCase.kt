package com.jslee.domain.usecase

import com.jslee.domain.model.Movie
import com.jslee.domain.repository.MovieRepository
import kotlinx.coroutines.flow.combine
import javax.inject.Inject

/**
 * MooBeside
 * @author jaesung
 * @created 2023/10/03
 */
class GetMovieDetailUseCase @Inject constructor(
    private val movieRepository: MovieRepository,
) {

    private fun getMovieReleaseDate(movieId: Long) = movieRepository.getMovieReleaseDate(movieId)
    private fun getMovieCredits(movieId: Long) = movieRepository.getMovieCredits(movieId)

    operator fun invoke(movieId: Long) =
        combine(getMovieReleaseDate(movieId), getMovieCredits(movieId)) { releaseDates, credits ->
            Movie(
                releaseDate = releaseDates.releaseDate,
                certification = releaseDates.certification,
                casts = credits.casts,
                staffs = credits.staffs
            )
        }
}
