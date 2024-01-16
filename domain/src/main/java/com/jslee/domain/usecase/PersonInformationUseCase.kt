package com.jslee.domain.usecase

import com.jslee.domain.model.Person
import com.jslee.domain.repository.PersonRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

/**
 * MooBeside
 * @author jaesung
 * @created 2024/01/11
 */
class PersonInformationUseCase @Inject constructor(
    private val repository: PersonRepository,
) {

    private fun getPerson(personId: Long): Flow<Person> = repository.getPerson(personId)

    private fun getParticipateMovies(personId: Long): Flow<Person> =
        repository.getParticipateMovie(personId)

    fun loadPersonInfo(personId: Long): Flow<Person> = flow {
        combine(getPerson(personId), getParticipateMovies(personId)) { person, movies ->
            Person(
                personId = person.personId,
                name = person.name,
                profileUrl = person.profileUrl,
                gender = person.gender,
                dateOfBirth = person.dateOfBirth,
                dateOfDeath = person.dateOfDeath,
                biography = person.biography,
                participateMovieAsCast = movies.participateMovieAsCast,
                participateMovieAsCrew = movies.participateMovieAsCrew
            )
        }.collect {
            emit(it)
        }
    }
}