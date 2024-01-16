package com.jslee.data.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.jslee.data.database.entity.BookmarkEntity
import kotlinx.coroutines.flow.Flow

/**
 * MooBeside
 * @author jaesung
 * @created 2023/11/03
 */
@Dao
internal interface BookmarkDao {

    @Query("SELECT * FROM `moobeside_bookmark.db`")
    fun getAllBookmarks(): Flow<List<BookmarkEntity>>

    @Query(
        """SELECT * FROM `moobeside_bookmark.db` ORDER BY
        CASE WHEN :filter = 0 THEN released_date END DESC,
        CASE WHEN :filter = 1 THEN bookmarked_at END DESC,
        CASE WHEN :filter = 2 THEN runtime END ASC
    """
    )
    fun getBookmarksByOrder(filter: Int): Flow<List<BookmarkEntity>>

    @Query("DELETE FROM `moobeside_bookmark.db` WHERE movie_id = :movieId")
    suspend fun deleteBookmark(movieId: Long)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveBookmark(bookmark: BookmarkEntity)

    @Query("SELECT EXISTS(SELECT * FROM `moobeside_bookmark.db` WHERE movie_id = :movieId)")
    fun isBookmarked(movieId: Long): Flow<Boolean>
}