package com.moobeside.core.local.source.impl

import com.moobeside.core.local.database.dao.BookmarkDao
import com.moobeside.core.local.database.entity.BookmarkEntity
import com.moobeside.core.local.source.BookmarkLocalDataSource
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

internal class BookmarkLocalDataSourceImpl @Inject constructor(
    private val bookmarkDao: BookmarkDao,
) : BookmarkLocalDataSource {
    override fun getAllBookmarks(): Flow<List<BookmarkEntity>> = bookmarkDao.getAllBookmarks()

    override fun getBookmarksByOrder(filterOrder: Int): Flow<List<BookmarkEntity>> =
        bookmarkDao.getBookmarksByOrder(filterOrder)

    override suspend fun deleteBookmark(movieId: Long) = bookmarkDao.deleteBookmark(movieId)

    override suspend fun saveBookmark(bookmark: BookmarkEntity) = bookmarkDao.saveBookmark(bookmark)

    override fun isBookmarked(movieId: Long): Flow<Boolean> = bookmarkDao.isBookmarked(movieId)
}