package com.jslee.data.repository

import com.jslee.data.datasource.remote.TmdbRemoteDataSource
import com.jslee.data.model.toDomain
import com.jslee.data.suspendRunCatching
import com.jslee.domain.model.Person
import com.jslee.domain.repository.PersonRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

/**
 * MooBeside
 * @author jaesung
 * @created 2024/01/11
 */
internal class PersonRepositoryImpl @Inject constructor(
    private val tmdbRemoteDataSource: TmdbRemoteDataSource,
) : PersonRepository {

    override fun getPerson(personId: Long): Flow<Person> = flow {
        val person = suspendRunCatching {
            tmdbRemoteDataSource.getPerson(personId).toDomain()
        }.getOrThrow()

        emit(person)
    }

    override fun getParticipateMovie(personId: Long): Flow<Person> = flow {
        val movies = suspendRunCatching {
            tmdbRemoteDataSource.getParticipateMovie(personId).toDomain()
        }.getOrThrow()

        emit(movies)
    }
}