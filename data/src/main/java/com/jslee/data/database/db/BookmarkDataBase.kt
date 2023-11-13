package com.jslee.data.database.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.jslee.data.database.dao.BookmarkDao
import com.jslee.data.database.entity.BookmarkEntity

/**
 * MooBeside
 * @author jaesung
 * @created 2023/11/03
 */
@Database(
    entities = [BookmarkEntity::class],
    version = 1,
    exportSchema = false,
)
internal abstract class BookmarkDataBase : RoomDatabase() {
    abstract fun bookmarkDao(): BookmarkDao
}