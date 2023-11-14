package com.jslee.domain.usecase.bookmark

import com.jslee.domain.model.movie.Movie
import com.jslee.domain.repository.BookmarkRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

/**
 * MooBeside
 * @author jaesung
 * @created 2023/11/14
 */
class GetBookmarkUseCase @Inject constructor(
    private val bookmarkRepository: BookmarkRepository,
) {
    operator fun invoke(): Flow<List<Movie>> {
        return bookmarkRepository.getAllBookmarks()
    }
}