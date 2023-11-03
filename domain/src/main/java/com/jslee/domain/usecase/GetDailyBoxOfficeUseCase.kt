package com.jslee.domain.usecase

import com.jslee.domain.model.movie.BoxOffice
import com.jslee.domain.model.movie.Movie
import com.jslee.domain.repository.MovieRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

/**
 * MooBeside
 * @author jaesung
 * @created 2023/08/11
 */
class GetDailyBoxOfficeUseCase @Inject constructor(
    private val movieRepository: MovieRepository,
) {
    private fun getDailyBoxOffice(targetDate: String): Flow<List<Movie>> =
        movieRepository.getDailyBoxOffice(targetDate)

    private fun getSearchMovieSnapshot(movieName: String): Flow<List<Movie>> =
        movieRepository.getSearchMovieSnapshot(movieName)

    operator fun invoke(targetDate: String): Flow<List<Movie>> = flow {
        val movieList = mutableListOf<Movie>()
        getDailyBoxOffice(targetDate).collect { boxOffices ->
            boxOffices.forEach { boxOfficeMovie ->
                getSearchMovieSnapshot(boxOfficeMovie.localizedMovieName.orEmpty()).collect { snapshotList ->
                    snapshotList.forEach { searchResult ->
                        if (boxOfficeMovie.localizedMovieName == searchResult.localizedMovieName && boxOfficeMovie.localizedReleaseDate == searchResult.originalReleaseDate) {
                            movieList.add(
                                Movie(
                                    tmdbMovieId = searchResult.tmdbMovieId,
                                    localizedMovieName = boxOfficeMovie.localizedMovieName,
                                    localizedReleaseDate = boxOfficeMovie.localizedReleaseDate,
                                    boxOffice = BoxOffice(
                                        rank = boxOfficeMovie.boxOffice?.rank.orEmpty(),
                                        rankIncrement = boxOfficeMovie.boxOffice?.rankIncrement.orEmpty(),
                                        rankEntryStatus = boxOfficeMovie.boxOffice?.rankEntryStatus.orEmpty(),
                                        dailyAudienceCount = boxOfficeMovie.boxOffice?.dailyAudienceCount.orEmpty(),
                                        dailyAudienceIncrement = boxOfficeMovie.boxOffice?.dailyAudienceIncrement.orEmpty(),
                                        dailyAudienceIncrementRatio = boxOfficeMovie.boxOffice?.dailyAudienceIncrementRatio.orEmpty(),
                                        cumulativeAudience = boxOfficeMovie.boxOffice?.cumulativeAudience.orEmpty(),
                                    )
                                )
                            )
                        }
                    }
                }
            }
            emit(movieList)
        }
    }
}
