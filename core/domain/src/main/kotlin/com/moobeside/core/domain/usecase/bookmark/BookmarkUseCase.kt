package com.moobeside.core.domain.usecase.bookmark

import com.moobeside.core.domain.repository.BookmarkRepository
import com.moobeside.core.model.movie.Movie
import javax.inject.Inject

/**
 * MooBeside
 * @author jaesung
 * @created 2023/11/14
 */
class BookmarkUseCase @Inject constructor(
    private val bookmarkRepository: BookmarkRepository,
) {
    suspend operator fun invoke(movie: Movie, bookmark: Boolean) {
        return bookmarkRepository.bookmarkMovie(movie, bookmark)
    }
}