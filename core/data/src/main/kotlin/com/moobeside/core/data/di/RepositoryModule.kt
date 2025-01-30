package com.moobeside.core.data.di

import com.moobeside.core.data.repository.BookmarkRepositoryImpl
import com.moobeside.core.data.repository.MovieRepositoryImpl
import com.moobeside.core.data.repository.PersonRepositoryImpl
import com.moobeside.core.data.repository.TrailerRepositoryImpl
import com.moobeside.core.domain.repository.BookmarkRepository
import com.moobeside.core.domain.repository.MovieRepository
import com.moobeside.core.domain.repository.PersonRepository
import com.moobeside.core.domain.repository.TrailerRepository
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
    abstract fun bindMovieRepository(impl: MovieRepositoryImpl): MovieRepository

    @Binds
    @Singleton
    abstract fun bindTrailerRepository(impl: TrailerRepositoryImpl): TrailerRepository


    @Binds
    @Singleton
    abstract fun bindBookmarkRepository(impl: BookmarkRepositoryImpl): BookmarkRepository

    @Binds
    @Singleton
    abstract fun bindPersonRepository(impl: PersonRepositoryImpl): PersonRepository
}