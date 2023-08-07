package com.jslee.data.di.qualifier

import javax.inject.Qualifier

/**
 * MooBeside
 * @author jaesung
 * @created 2023/08/07
 */

@Qualifier
@Retention(AnnotationRetention.RUNTIME)
annotation class KobisQualifer

@Qualifier
@Retention(AnnotationRetention.RUNTIME)
annotation class TmdbQualifier

@Qualifier
@Retention(AnnotationRetention.RUNTIME)
annotation class YoutubeQualifier
