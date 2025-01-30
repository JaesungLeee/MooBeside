package com.moobeside.core.data.repository

import com.moobeside.core.data.model.toDataModel
import com.moobeside.core.data.model.toDomain
import com.moobeside.core.data.suspendRunCatching
import com.moobeside.core.domain.repository.PersonRepository
import com.moobeside.core.model.Person
import com.moobeside.core.remote.source.TmdbRemoteDataSource
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
            tmdbRemoteDataSource.getPerson(personId).toDataModel().toDomain()
        }.getOrThrow()
        emit(person)
    }

    override fun getParticipateMovie(personId: Long): Flow<Person> = flow {
        val movies = suspendRunCatching {
            tmdbRemoteDataSource.getParticipateMovie(personId).toDataModel().toDomain()
        }.getOrThrow()
        emit(movies)
    }
}