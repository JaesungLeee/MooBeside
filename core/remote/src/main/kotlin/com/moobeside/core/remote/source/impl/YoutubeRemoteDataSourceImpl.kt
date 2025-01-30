package com.moobeside.core.remote.source.impl

import com.moobeside.core.remote.network.dto.response.youtube.YoutubeSearchItemsResponse
import com.moobeside.core.remote.network.service.YoutubeService
import com.moobeside.core.remote.source.YoutubeRemoteDataSource
import javax.inject.Inject
import javax.inject.Singleton

/**
 * MooBeside
 * @author jaesung
 * @created 2023/10/30
 */

@Singleton
internal class YoutubeRemoteDataSourceImpl @Inject constructor(
    private val youtubeService: YoutubeService,
) : YoutubeRemoteDataSource {

    override suspend fun getRelatedVideo(query: String): List<YoutubeSearchItemsResponse> {
        val response = youtubeService.getVideoList(query = query).getOrThrow()
        return response.responseItem
//        return response.responseItem.map { it.toDataModel() }
    }
}