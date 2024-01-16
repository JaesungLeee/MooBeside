package com.jslee.domain.repository

import com.jslee.domain.model.BookmarkFilter
import com.jslee.domain.model.movie.Movie
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
