package com.jslee.data.network

import com.jslee.data.BuildConfig
import okhttp3.Interceptor
import okhttp3.Response
import javax.inject.Inject
import javax.inject.Singleton

/**
 * MooBeside
 * @author jaesung
 * @created 2023/08/14
 */
@Singleton
class TmdbAuthorizationInterceptor @Inject constructor(): Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain.request()
        val requestBuilder = request.newBuilder().apply {
            addHeader(AUTHORIZATION_KEY, "Bearer ${BuildConfig.TMDB_API_KEY}")
        }
        return chain.proceed(requestBuilder.build())
    }

    companion object {
        private const val AUTHORIZATION_KEY = "Authorization"
    }
}