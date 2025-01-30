package com.moobeside.core.domain.usecase

import androidx.paging.PagingData
import com.moobeside.core.domain.repository.MovieRepository
import com.moobeside.core.model.movie.Movie
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

/**
 * MooBeside
 * @author jaesung
 * @created 2023/08/14
 */
class SearchMovieUseCase @Inject constructor(
    private val movieRepository: MovieRepository
) {

    operator fun invoke(query: String): Flow<PagingData<Movie>> =
        fetchSearchMovieResult(query)

//        val movieSearchResult = fetchSearchMovieResult(query)
//        val movieDetailResult = fetchMovieDetailResult()
    private fun fetchSearchMovieResult(query: String) =
        movieRepository.getSearchMovie(query = query)

}