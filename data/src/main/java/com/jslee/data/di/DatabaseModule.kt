package com.jslee.data.di

import android.content.Context
import androidx.room.Room
import com.jslee.data.database.MOOBESIDE_DATABASE
import com.jslee.data.database.converter.StringListTypeConverter
import com.jslee.data.database.dao.BookmarkDao
import com.jslee.data.database.db.BookmarkDataBase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

/**
 * MooBeside
 * @author jaesung
 * @created 2023/11/03
 */
@Module
@InstallIn(SingletonComponent::class)
internal class DatabaseModule {

    @Provides
    @Singleton
    fun provideBookmarkDatabase(
        @ApplicationContext context: Context,
    ): BookmarkDataBase = Room
        .databaseBuilder(
            context,
            BookmarkDataBase::class.java,
            MOOBESIDE_DATABASE
        )
        .addTypeConverter(StringListTypeConverter())
        .build()

    @Provides
    @Singleton
    fun providesBookmarkDao(
        database: BookmarkDataBase,
    ): BookmarkDao = database.bookmarkDao()
}