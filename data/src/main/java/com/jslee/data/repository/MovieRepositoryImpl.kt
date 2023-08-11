package com.jslee.data.repository

import com.jslee.data.datasource.remote.source.KobisRemoteDataSource
import com.jslee.data.model.toDomain
import com.jslee.data.suspendRunCatching
import com.jslee.domain.model.Movie
import com.jslee.domain.repository.MovieRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

/**
 * MooBeside
 * @author jaesung
 * @created 2023/08/09
 */
internal class MovieRepositoryImpl @Inject constructor(
    private val kobisRemoteDataSource: KobisRemoteDataSource
) : MovieRepository {
    override fun getDailyBoxOffice(targetDate: String): Flow<Result<List<Movie>>> = flow {
        emit(
            suspendRunCatching {
                kobisRemoteDataSource.getDailyBoxOffice(targetDate = targetDate)
                    .map { it.toDomain() }
            }
        )
    }
}