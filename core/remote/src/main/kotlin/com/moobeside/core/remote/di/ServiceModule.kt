package com.moobeside.core.remote.di

import com.moobeside.core.remote.di.qualifier.KobisQualifer
import com.moobeside.core.remote.di.qualifier.TmdbQualifier
import com.moobeside.core.remote.di.qualifier.YoutubeQualifier
import com.moobeside.core.remote.network.service.KobisService
import com.moobeside.core.remote.network.service.TmdbService
import com.moobeside.core.remote.network.service.YoutubeService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.create
import javax.inject.Singleton

/**
 * MooBeside
 * @author jaesung
 * @created 2023/08/07
 */
@Module
@InstallIn(SingletonComponent::class)
internal class ServiceModule {

    @Provides
    @Singleton
    fun provideKobisService(
        @KobisQualifer retrofit: Retrofit
    ): KobisService = retrofit.create()

    @Provides
    @Singleton
    fun provideTmdbService(
        @TmdbQualifier retrofit: Retrofit
    ): TmdbService = retrofit.create()

    @Provides
    @Singleton
    fun provideYoutubeService(
        @YoutubeQualifier retrofit: Retrofit
    ): YoutubeService = retrofit.create()
}