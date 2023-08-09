package com.jslee.data.di

import com.jslee.data.datasource.remote.service.KobisService
import com.jslee.data.datasource.remote.service.TmdbService
import com.jslee.data.datasource.remote.service.YoutubeService
import com.jslee.data.di.qualifier.KobisQualifer
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
        @KobisQualifer retrofit: Retrofit
    ): TmdbService = retrofit.create()

    @Provides
    @Singleton
    fun provideYoutubeService(
        @KobisQualifer retrofit: Retrofit
    ): YoutubeService = retrofit.create()
}