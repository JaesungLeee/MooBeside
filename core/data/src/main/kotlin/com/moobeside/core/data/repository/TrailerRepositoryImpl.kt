package com.moobeside.core.data.repository

import com.moobeside.core.data.model.toDataModel
import com.moobeside.core.data.model.toDomain
import com.moobeside.core.data.suspendRunCatching
import com.moobeside.core.domain.repository.TrailerRepository
import com.moobeside.core.model.Trailer
import com.moobeside.core.remote.source.YoutubeRemoteDataSource
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
            youtubeRemoteDataSource.getRelatedVideo(query).map { it.toDataModel().toDomain() }
        }.getOrThrow()
        emit(trailers)
    }
}