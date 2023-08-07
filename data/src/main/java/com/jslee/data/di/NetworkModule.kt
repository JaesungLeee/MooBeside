package com.jslee.data.di

import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import com.jslee.data.di.qualifier.KobisQualifer
import com.jslee.data.di.qualifier.TmdbQualifier
import com.jslee.data.di.qualifier.YoutubeQualifier
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Converter
import retrofit2.Retrofit
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

/**
 * MooBeside
 * @author jaesung
 * @created 2023/08/07
 */
@Module
@InstallIn(SingletonComponent::class)
class NetworkModule {
    @Provides
    @Singleton
    fun provideLoggingInterceptor(): HttpLoggingInterceptor = HttpLoggingInterceptor().apply {
        level = HttpLoggingInterceptor.Level.BODY
    }

    @OptIn(ExperimentalSerializationApi::class)
    @Provides
    @Singleton
    fun provideJsonConverterFactory(): Converter.Factory {
        val json = Json {
            isLenient = true
            ignoreUnknownKeys = true
            coerceInputValues = true
        }
        return json.asConverterFactory("application/json".toMediaType())
    }

    @Provides
    @Singleton
    fun provideOkHttpClient(
        httpLoggingInterceptor: HttpLoggingInterceptor,
    ): OkHttpClient = OkHttpClient.Builder()
        .addNetworkInterceptor(httpLoggingInterceptor)
        .readTimeout(5, TimeUnit.SECONDS)
        .connectTimeout(5, TimeUnit.SECONDS)
        .build()

    @Provides
    @Singleton
    @KobisQualifer
    fun provideKOBISRetrofit(
        okHttpClient: OkHttpClient,
        converterFactory: Converter.Factory,
    ): Retrofit = Retrofit.Builder()
        .baseUrl(KOBIS_BASE_URL)
        .client(okHttpClient)
        .addConverterFactory(converterFactory)
        .build()

    @Provides
    @Singleton
    @TmdbQualifier
    fun provideTMDBRetrofit(
        okHttpClient: OkHttpClient,
        converterFactory: Converter.Factory,
    ): Retrofit = Retrofit.Builder()
        .baseUrl(TMDB_BASE_URL)
        .client(okHttpClient)
        .addConverterFactory(converterFactory)
        .build()

    @Provides
    @Singleton
    @YoutubeQualifier
    fun provideYoutubeRetrofit(
        okHttpClient: OkHttpClient,
        converterFactory: Converter.Factory,
    ): Retrofit = Retrofit.Builder()
        .baseUrl(YOUTUBE_BASE_URL)
        .client(okHttpClient)
        .addConverterFactory(converterFactory)
        .build()

    companion object {
        private const val KOBIS_BASE_URL = "http://www.kobis.or.kr/kobisopenapi/webservice/rest/"
        private const val TMDB_BASE_URL = "https://api.themoviedb.org/3/"
        private const val YOUTUBE_BASE_URL = "https://www.googleapis.com/youtube/v3/"
    }
}