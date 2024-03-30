package com.jslee.data.datasource.remote

import com.jslee.data.model.MovieTrailerModel
import com.jslee.data.network.dto.response.youtube.toDataModel
import com.jslee.data.network.service.YoutubeService
import javax.inject.Inject
import javax.inject.Singleton

/**
 * MooBeside
 * @author jaesung
 * @created 2023/10/30
 */

@Singleton
internal class YoutubeRemoteDataSource @Inject constructor(
    private val youtubeService: YoutubeService,
) {

    suspend fun getRelatedVideo(query: String): List<MovieTrailerModel> {
        val response = youtubeService.getVideoList(query = query).getOrThrow()
        return response.responseItem.map { it.toDataModel() }
    }
}