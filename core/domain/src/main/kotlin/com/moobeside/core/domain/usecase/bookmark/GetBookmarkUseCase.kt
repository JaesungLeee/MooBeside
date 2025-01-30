package com.moobeside.core.domain.usecase.bookmark

import com.moobeside.core.domain.repository.BookmarkRepository
import com.moobeside.core.model.BookmarkFilter
import com.moobeside.core.model.movie.Movie
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

    fun byOrder(filter: BookmarkFilter): Flow<List<Movie>> {
        return bookmarkRepository.getBookmarksByOrder(filter)
    }
}