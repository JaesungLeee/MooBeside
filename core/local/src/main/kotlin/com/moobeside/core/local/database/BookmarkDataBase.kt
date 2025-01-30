package com.moobeside.core.local.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.moobeside.core.local.database.converter.StringListTypeConverter
import com.moobeside.core.local.database.dao.BookmarkDao
import com.moobeside.core.local.database.entity.BookmarkEntity

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
@TypeConverters(StringListTypeConverter::class)
internal abstract class BookmarkDataBase : RoomDatabase() {
    abstract fun bookmarkDao(): BookmarkDao
}