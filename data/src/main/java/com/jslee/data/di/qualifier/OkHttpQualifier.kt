package com.jslee.data.di.qualifier

import javax.inject.Qualifier

/**
 * MooBeside
 * @author jaesung
 * @created 2023/08/14
 */
@Qualifier
@Retention(AnnotationRetention.RUNTIME)
annotation class DefaultOkHttpClient

@Qualifier
@Retention(AnnotationRetention.RUNTIME)
annotation class TmdbOkHttpClient