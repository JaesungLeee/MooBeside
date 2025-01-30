package com.moobeside.core.local.source

import com.moobeside.core.local.database.entity.BookmarkEntity
import kotlinx.coroutines.flow.Flow

interface BookmarkLocalDataSource {
    fun getAllBookmarks(): Flow<List<BookmarkEntity>>
    fun getBookmarksByOrder(filterOrder: Int): Flow<List<BookmarkEntity>>
    suspend fun deleteBookmark(movieId: Long)
    suspend fun saveBookmark(bookmark: BookmarkEntity)
    fun isBookmarked(movieId: Long): Flow<Boolean>
}