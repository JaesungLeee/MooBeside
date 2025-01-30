package com.moobeside.core.remote.di

import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import com.moobeside.core.common.kotlin.extension.isJsonArray
import com.moobeside.core.common.kotlin.extension.isJsonObject
import com.moobeside.core.remote.network.interceptor.TmdbAuthorizationInterceptor
import com.moobeside.core.remote.network.adapter.NetworkCallAdapterFactory
import com.moobeside.core.remote.di.qualifier.DefaultOkHttpClient
import com.moobeside.core.remote.di.qualifier.KobisQualifer
import com.moobeside.core.remote.di.qualifier.TmdbOkHttpClient
import com.moobeside.core.remote.di.qualifier.TmdbQualifier
import com.moobeside.core.remote.di.qualifier.YoutubeQualifier
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Converter
import retrofit2.Retrofit
import timber.log.Timber
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

/**
 * MooBeside
 * @author jaesung
 * @created 2023/08/07
 */

@Module
@InstallIn(SingletonComponent::class)
internal class NetworkModule {

    @Provides
    @Singleton
    fun provideJson(): Json {
        return Json {
            prettyPrint = true
            ignoreUnknownKeys = true
            coerceInputValues = true
        }
    }

    @Provides
    @Singleton
    fun provideHttpLoggingInterceptor(
        json: Json,
    ): HttpLoggingInterceptor {
        val loggingInterceptor = HttpLoggingInterceptor { message ->
            when {
                !message.isJsonObject() && !message.isJsonArray() ->
                    Timber.tag(RETROFIT_DEBUG_TAG).d("CONNECTION INFO => $message")

                else -> runCatching {
                    json.encodeToString(Json.parseToJsonElement(message))
                }.onSuccess {
                    Timber.tag(RETROFIT_DEBUG_TAG).d(it)
                }.onFailure {
                    Timber.tag(RETROFIT_DEBUG_TAG).d(message)
                }
            }
        }
        loggingInterceptor.level = HttpLoggingInterceptor.Level.BODY
        return loggingInterceptor
    }

    @OptIn(ExperimentalSerializationApi::class)
    @Provides
    @Singleton
    fun provideJsonConverterFactory(
        json: Json,
    ): Converter.Factory {
        return json.asConverterFactory("application/json".toMediaType())
    }

    @Provides
    @Singleton
    @DefaultOkHttpClient
    fun provideDefaultOkHttpClient(
        httpLoggingInterceptor: HttpLoggingInterceptor,
    ): OkHttpClient = OkHttpClient.Builder()
        .addNetworkInterceptor(httpLoggingInterceptor)
        .readTimeout(5, TimeUnit.SECONDS)
        .connectTimeout(5, TimeUnit.SECONDS)
        .build()

    @Provides
    @Singleton
    @TmdbOkHttpClient
    fun provideTmdbOkHttpClient(
        httpLoggingInterceptor: HttpLoggingInterceptor,
        authInterceptor: TmdbAuthorizationInterceptor,
    ): OkHttpClient = OkHttpClient.Builder()
        .addInterceptor(authInterceptor)
        .addNetworkInterceptor(httpLoggingInterceptor)
        .readTimeout(5, TimeUnit.SECONDS)
        .connectTimeout(5, TimeUnit.SECONDS)
        .build()

    @Provides
    @Singleton
    @KobisQualifer
    fun provideKobisRetrofit(
        @DefaultOkHttpClient okHttpClient: OkHttpClient,
        converterFactory: Converter.Factory,
    ): Retrofit = Retrofit.Builder()
        .baseUrl(KOBIS_BASE_URL)
        .client(okHttpClient)
        .addCallAdapterFactory(NetworkCallAdapterFactory())
        .addConverterFactory(converterFactory)
        .build()

    @Provides
    @Singleton
    @TmdbQualifier
    fun provideTmdbRetrofit(
        @DefaultOkHttpClient okHttpClient: OkHttpClient,
        converterFactory: Converter.Factory,
    ): Retrofit = Retrofit.Builder()
        .baseUrl(TMDB_BASE_URL)
        .client(okHttpClient)
        .addCallAdapterFactory(NetworkCallAdapterFactory())
        .addConverterFactory(converterFactory)
        .build()

    @Provides
    @Singleton
    @YoutubeQualifier
    fun provideYoutubeRetrofit(
        @DefaultOkHttpClient okHttpClient: OkHttpClient,
        converterFactory: Converter.Factory,
    ): Retrofit = Retrofit.Builder()
        .baseUrl(YOUTUBE_BASE_URL)
        .client(okHttpClient)
        .addCallAdapterFactory(NetworkCallAdapterFactory())
        .addConverterFactory(converterFactory)
        .build()

    companion object {
        private const val RETROFIT_DEBUG_TAG = "Retrofit2"
        private const val KOBIS_BASE_URL = "http://www.kobis.or.kr/kobisopenapi/webservice/rest/"
        private const val TMDB_BASE_URL = "https://api.themoviedb.org/3/"
        private const val YOUTUBE_BASE_URL = "https://www.googleapis.com/youtube/v3/"
    }
}