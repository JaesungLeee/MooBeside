package com.moobeside.core.domain.repository

import com.moobeside.core.model.Person
import kotlinx.coroutines.flow.Flow

/**
 * MooBeside
 * @author jaesung
 * @created 2024/01/11
 */
interface PersonRepository {
    fun getPerson(personId: Long): Flow<Person>
    fun getParticipateMovie(personId: Long): Flow<Person>
}