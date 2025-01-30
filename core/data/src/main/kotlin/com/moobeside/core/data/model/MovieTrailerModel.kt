package com.moobeside.core.data.model

import com.moobeside.core.model.Trailer
import com.moobeside.core.remote.network.dto.response.youtube.YoutubeSearchItemsResponse

/**
 * MooBeside
 * @author jaesung
 * @created 2023/10/31
 */
internal data class MovieTrailerModel(
    val publishedDate: String,
    val publishTime: String,
    val channelId: String,
    val channelTitle: String,
    val videoId: String,
    val contentTitle: String,
    val description: String,
    val thumbnail: MovieTrailerThumbnailModel,
)

internal data class MovieTrailerThumbnailModel(
    val thumbnailUrl: String,
    val width: String,
    val height: String,
)

internal fun MovieTrailerModel.toDomain() = Trailer(
    videoId = videoId,
    channelId = channelId,
    channelTitle = channelTitle,
    contentTitle = contentTitle,
    description = description,
    publishedDate = publishedDate,
    thumbnailUrl = thumbnail.thumbnailUrl,
)

internal fun YoutubeSearchItemsResponse.toDataModel() = MovieTrailerModel(
    publishedDate = item.publishedDate,
    publishTime = item.publishTime,
    channelId = item.channelId,
    channelTitle = item.channelTitle,
    videoId = itemId.videoId.orEmpty(),
    contentTitle = item.contentTitle,
    description = item.description,
    thumbnail = MovieTrailerThumbnailModel(
        thumbnailUrl = item.thumbnails.highSize.thumbnailUrl,
        width = item.thumbnails.highSize.width.toString(),
        height = item.thumbnails.highSize.height.toString(),
    ),
)
