package com.jslee.domain.usecase

import kotlinx.coroutines.flow.flow
import com.jslee.domain.model.movie.Movie
import com.jslee.domain.repository.MovieRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

/**
 * MooBeside
 * @author jaesung
 * @created 2023/08/11
 */
class GetDailyBoxOfficeUseCase @Inject constructor(
    private val movieRepository: MovieRepository
) {
    operator fun invoke(targetDate: String): Flow<List<Movie>> = flow {
        movieRepository.getDailyBoxOffice(targetDate).collect { result ->
            result.onSuccess {
                emit(it)
            }.onFailure {
                throw Exception(it.message)
            }
        }
    }
}
