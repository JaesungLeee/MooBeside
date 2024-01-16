package com.jslee.data.repository

import com.jslee.data.database.entity.toBookmarkEntity
import com.jslee.data.database.entity.toDomain
import com.jslee.data.datasource.local.BookmarkLocalDataSource
import com.jslee.data.suspendRunCatching
import com.jslee.domain.model.BookmarkFilter
import com.jslee.domain.model.movie.Movie
import com.jslee.domain.repository.BookmarkRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

/**
 * MooBeside
 * @author jaesung
 * @created 2023/11/13
 */
internal class BookmarkRepositoryImpl @Inject constructor(
    private val bookmarkLocalDataSource: BookmarkLocalDataSource,
) : BookmarkRepository {
    override fun getAllBookmarks(): Flow<List<Movie>> = flow {
        suspendRunCatching {
            bookmarkLocalDataSource.getAllBookmarks()
                .map { cachedBookmark ->
                    cachedBookmark.map { it.toDomain() }
                }
        }.getOrThrow().collect {
            emit(it)
        }
    }

    override fun getBookmarksByOrder(filter: BookmarkFilter): Flow<List<Movie>> = flow {
        suspendRunCatching {
            bookmarkLocalDataSource.getBookmarksByOrder(filter)
                .map { cachedBookmark ->
                    cachedBookmark.map { it.toDomain() }
                }
        }.getOrThrow().collect {
            emit(it)
        }
    }

    override suspend fun bookmarkMovie(movie: Movie, bookmark: Boolean) {
        if (bookmark) {
            saveBookmark(movie)
        } else {
            movie.tmdbMovieId?.let {
                deleteBookmark(it)
            } ?: return
        }
    }

    override fun isBookmarked(movieId: Long): Flow<Boolean> = flow {
        suspendRunCatching {
            bookmarkLocalDataSource.isBookmarked(movieId)
        }.getOrThrow().collect {
            emit(it)
        }
    }

    private suspend fun saveBookmark(movie: Movie) {
        suspendRunCatching {
            val entity = movie.toBookmarkEntity(System.currentTimeMillis())
            bookmarkLocalDataSource.saveBookmark(entity)
        }.getOrThrow()
    }

    private suspend fun deleteBookmark(movieId: Long) {
        suspendRunCatching {
            bookmarkLocalDataSource.deleteBookmark(movieId)
        }.getOrThrow()
    }
}
