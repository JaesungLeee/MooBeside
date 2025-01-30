package com.moobeside.core.remote.di

import com.moobeside.core.remote.source.KobisRemoteDataSource
import com.moobeside.core.remote.source.TmdbRemoteDataSource
import com.moobeside.core.remote.source.YoutubeRemoteDataSource
import com.moobeside.core.remote.source.impl.KobisRemoteDataSourceImpl
import com.moobeside.core.remote.source.impl.TmdbRemoteDataSourceImpl
import com.moobeside.core.remote.source.impl.YoutubeRemoteDataSourceImpl
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
    abstract fun bindKobisRemoteDataSource(impl: KobisRemoteDataSourceImpl): KobisRemoteDataSource

    @Binds
    @Singleton
    abstract fun bindTmdbRemoteDataSource(impl: TmdbRemoteDataSourceImpl): TmdbRemoteDataSource

    @Binds
    @Singleton
    abstract fun bindYoutubeRemoteDataSource(impl: YoutubeRemoteDataSourceImpl): YoutubeRemoteDataSource
}