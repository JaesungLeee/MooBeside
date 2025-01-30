package com.moobeside.core.local.di

import com.moobeside.core.local.source.BookmarkLocalDataSource
import com.moobeside.core.local.source.impl.BookmarkLocalDataSourceImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
internal abstract class DataSourceModule {

    @Binds
    @Singleton
    abstract fun bindBookmarkDataSource(impl: BookmarkLocalDataSourceImpl): BookmarkLocalDataSource
}