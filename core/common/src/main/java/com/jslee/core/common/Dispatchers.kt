package com.jslee.core.common

import javax.inject.Qualifier

/**
 * MooBeside
 * @author jaesung
 * @created 2023/08/28
 */
@Qualifier
@Retention(AnnotationRetention.RUNTIME)
annotation class MainDispatcher

@Qualifier
@Retention(AnnotationRetention.RUNTIME)
annotation class DefaultDispatcher

@Qualifier
@Retention(AnnotationRetention.RUNTIME)
annotation class IoDispatcher
