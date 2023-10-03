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

    private fun getMovieReleaseInfo(movieId: Long) = movieRepository.getMovieReleaseInfo(movieId)
    private fun getMovieCredits(movieId: Long) = movieRepository.getMovieCredits(movieId)
    private fun getMovieDetail(movieId: Long) = movieRepository.getMovieDetail(movieId)

    operator fun invoke(movieId: Long) =
        combine(
            getMovieDetail(movieId),
            getMovieReleaseInfo(movieId),
            getMovieCredits(movieId)
        ) { movieDetail, releaseInfo, credits ->
            Movie(
                kobisMovieCode = null,
                tmdbMovieId = movieDetail.tmdbMovieId,
                localizedMovieName = movieDetail.localizedMovieName,
                tagline = movieDetail.tagline,
                overview = movieDetail.overview,
                runtime = movieDetail.runtime,
                movieStatus = movieDetail.movieStatus,
                genres = movieDetail.genres,
                originalReleaseDate = movieDetail.originalReleaseDate,
                localizedReleaseDate = releaseInfo.localizedReleaseDate,
                spokenLanguage = movieDetail.spokenLanguage,
                posterImageUrl = movieDetail.posterImageUrl,
                backdropImageUrl = movieDetail.backdropImageUrl,
                certification = releaseInfo.certification,
                isAdultMovie = movieDetail.isAdultMovie,
                rateInfo = movieDetail.rateInfo,
                boxOffice = null,
                productionCompanies = movieDetail.productionCompanies,
                casts = credits.casts,
                staffs = credits.staffs
            )
        }
}
