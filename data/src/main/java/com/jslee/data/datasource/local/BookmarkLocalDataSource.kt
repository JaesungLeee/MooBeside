package com.jslee.data.datasource.local

import com.jslee.data.database.dao.BookmarkDao
import com.jslee.data.database.entity.BookmarkEntity
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject
import javax.inject.Singleton

/**
 * MooBeside
 * @author jaesung
 * @created 2023/11/13
 */
@Singleton
internal class BookmarkLocalDataSource @Inject constructor(
    private val bookmarkDao: BookmarkDao,
) {
    fun getAllBookmarks(): Flow<List<BookmarkEntity>> = bookmarkDao.getAllBookmarks()

    suspend fun deleteBookmark(movieId: Long) = bookmarkDao.deleteBookmark(movieId)

    suspend fun saveBookmark(bookmark: BookmarkEntity) = bookmarkDao.saveBookmark(bookmark)

    fun isBookmarked(movieId: Long): Flow<Boolean> = bookmarkDao.isBookmarked(movieId)

}
