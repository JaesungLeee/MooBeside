package com.moobeside.core.local.di

import android.content.Context
import androidx.room.Room
import com.moobeside.core.local.database.BookmarkDataBase
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

internal const val MOOBESIDE_DATABASE = "moo_beside.db"

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
        .addTypeConverter(com.moobeside.core.local.database.converter.StringListTypeConverter())
        .build()

    @Provides
    @Singleton
    fun providesBookmarkDao(
        database: BookmarkDataBase,
    ): com.moobeside.core.local.database.dao.BookmarkDao = database.bookmarkDao()
}