package com.jslee.core.common.di

import com.jslee.core.common.DefaultDispatcher
import com.jslee.core.common.IoDispatcher
import com.jslee.core.common.MainDispatcher
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import javax.inject.Singleton

/**
 * MooBeside
 * @author jaesung
 * @created 2023/08/28
 */
@Module
@InstallIn(SingletonComponent::class)
class DispatcherModule {

    @Provides
    @Singleton
    @MainDispatcher
    fun provideMainDispatcher(): CoroutineDispatcher = Dispatchers.Main

    @Provides
    @Singleton
    @IoDispatcher
    fun provideIoDispatcher(): CoroutineDispatcher = Dispatchers.IO

    @Provides
    @Singleton
    @DefaultDispatcher
    fun provideDefaultDispatcher(): CoroutineDispatcher = Dispatchers.Default
}
