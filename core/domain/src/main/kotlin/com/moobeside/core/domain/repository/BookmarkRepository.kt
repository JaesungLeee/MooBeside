package com.moobeside.core.domain.repository

import com.moobeside.core.model.BookmarkFilter
import com.moobeside.core.model.movie.Movie
import kotlinx.coroutines.flow.Flow

/**
 * MooBeside
 * @author jaesung
 * @created 2023/11/13
 */
interface BookmarkRepository {
    fun getAllBookmarks(): Flow<List<Movie>>

    fun getBookmarksByOrder(filter: BookmarkFilter): Flow<List<Movie>>

    suspend fun bookmarkMovie(movie: Movie, bookmark: Boolean)

    fun isBookmarked(movieId: Long): Flow<Boolean>

}
