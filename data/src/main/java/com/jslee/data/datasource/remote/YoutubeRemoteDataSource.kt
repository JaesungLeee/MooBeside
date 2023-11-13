package com.jslee.data.datasource.remote

import com.jslee.data.network.dto.response.youtube.toDataModel
import com.jslee.data.network.service.YoutubeService
import com.jslee.data.model.MovieTrailerModel
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
        val responseData = runCatching {
            youtubeService.getVideoList(query = query)
        }.onSuccess { response ->
            if (!response.isSuccessful) {
                throw Exception(response.errorBody()?.string())
            }
        }.getOrElse {
            throw Exception(it.message)
        }

        return responseData.body()?.responseItem?.map { it.toDataModel() }.orEmpty()
    }
}