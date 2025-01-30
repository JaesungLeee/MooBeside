package com.moobeside.core.remote.source

import com.moobeside.core.remote.network.dto.response.youtube.YoutubeSearchItemsResponse

interface YoutubeRemoteDataSource {
    suspend fun getRelatedVideo(query: String): List<YoutubeSearchItemsResponse>
}