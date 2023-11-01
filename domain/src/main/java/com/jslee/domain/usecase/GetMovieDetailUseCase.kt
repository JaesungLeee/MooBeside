package com.jslee.domain.usecase

import com.jslee.domain.model.Trailer
import com.jslee.domain.model.movie.Movie
import com.jslee.domain.repository.MovieRepository
import com.jslee.domain.repository.TrailerRepository
import kotlinx.coroutines.flow.combine
import javax.inject.Inject

/**
 * MooBeside
 * @author jaesung
 * @created 2023/10/03
 */
class GetMovieDetailUseCase @Inject constructor(
    private val movieRepository: MovieRepository,
    private val trailerRepository: TrailerRepository,
) {
    private fun getMovieReleaseInfo(movieId: Long) = movieRepository.getMovieReleaseInfo(movieId)
    private fun getMovieCredits(movieId: Long) = movieRepository.getMovieCredits(movieId)
    private fun getMovieDetail(movieId: Long) = movieRepository.getMovieDetail(movieId)
    private fun getMovieImages(movieId: Long) = movieRepository.getMovieImages(movieId)
    private fun getMovieTrailers(query: String) = trailerRepository.getMovieTrailers(query)

    /**
     *  movie trailer 병렬 처리 가능하도록 수정 필요
     */
    operator fun invoke(movieId: Long) = combine(
        getMovieDetail(movieId),
        getMovieReleaseInfo(movieId),
        getMovieCredits(movieId),
        getMovieImages(movieId)
    ) { movieDetail, releaseInfo, credits, posters ->
        val trailers = mutableListOf<Trailer>()
        getMovieTrailers("${movieDetail.localizedMovieName} 예고편").collect { remoteTrailers ->
            remoteTrailers.filter { it.isVideoIdEmpty }
            trailers.addAll(remoteTrailers)
        }
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
            images = posters,
            productionCompanies = movieDetail.productionCompanies,
            casts = credits.casts,
            staffs = credits.staffs,
            trailers = trailers
        )
    }
}
