package com.jslee.domain.usecase

import com.jslee.domain.model.movie.Movie
import com.jslee.domain.repository.BookmarkRepository
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