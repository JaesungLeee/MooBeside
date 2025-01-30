package com.moobeside.core.remote.di.qualifier

import javax.inject.Qualifier

/**
 * MooBeside
 * @author jaesung
 * @created 2023/08/14
 */
@Qualifier
@Retention(AnnotationRetention.RUNTIME)
internal annotation class DefaultOkHttpClient

@Qualifier
@Retention(AnnotationRetention.RUNTIME)
internal annotation class TmdbOkHttpClient