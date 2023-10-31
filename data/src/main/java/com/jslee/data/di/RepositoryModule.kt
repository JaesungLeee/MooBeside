package com.jslee.data.di

import com.jslee.data.repository.MovieRepositoryImpl
import com.jslee.data.repository.TrailerRepositoryImpl
import com.jslee.domain.repository.MovieRepository
import com.jslee.domain.repository.TrailerRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

/**
 * MooBeside
 * @author jaesung
 * @created 2023/08/07
 */
@Module
@InstallIn(SingletonComponent::class)
internal abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindMovieRepository(movieRepositoryImpl: MovieRepositoryImpl): MovieRepository

    @Binds
    @Singleton
    abstract fun bindTrailerRepository(trailerRepositoryImpl: TrailerRepositoryImpl): TrailerRepository
}