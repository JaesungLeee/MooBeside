package com.jslee.data.repository

import com.jslee.data.datasource.remote.source.YoutubeRemoteDataSource
import com.jslee.data.model.toDomain
import com.jslee.data.suspendRunCatching
import com.jslee.domain.model.Trailer
import com.jslee.domain.repository.TrailerRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

/**
 * MooBeside
 * @author jaesung
 * @created 2023/10/31
 */
internal class TrailerRepositoryImpl @Inject constructor(
    private val youtubeRemoteDataSource: YoutubeRemoteDataSource,
) : TrailerRepository {
    override fun getMovieTrailers(query: String): Flow<List<Trailer>> = flow {
        val trailers = suspendRunCatching {
            youtubeRemoteDataSource.getRelatedVideo(query).map { it.toDomain() }
        }.getOrThrow()
        emit(trailers)
    }
}