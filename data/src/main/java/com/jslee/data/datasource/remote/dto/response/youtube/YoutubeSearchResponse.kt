package com.jslee.data.datasource.remote.dto.response.youtube

import com.jslee.data.model.MovieTrailerModel
import com.jslee.data.model.MovieTrailerThumbnailModel
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * MooBeside
 * @author jaesung
 * @created 2023/10/30
 */
@Serializable
internal data class YoutubeSearchResponse(
    @SerialName("kind") val responseKind: String,
    @SerialName("etag") val eTag: String,
    @SerialName("nextPageToken") val nextPageToken: String,
    @SerialName("regionCode") val regionCode: String,
    @SerialName("pageInfo") val pageInfo: YoutubePageInfoResponse,
    @SerialName("items") val responseItem: List<YoutubeSearchItemsResponse>,
)

@Serializable
internal data class YoutubePageInfoResponse(
    @SerialName("totalResults") val totalCount: Int,
    @SerialName("resultsPerPage") val countPerPage: Int,
)

@Serializable
internal data class YoutubeSearchItemsResponse(
    @SerialName("kind") val responseKind: String,
    @SerialName("etag") val eTag: String,
    @SerialName("id") val itemId: YoutubeSearchItemIdResponse,
    @SerialName("snippet") val item: YoutubeSearchContentResponse,
)

@Serializable
internal data class YoutubeSearchItemIdResponse(
    @SerialName("kind") val responseKind: String,
    @SerialName("videoId") val videoId: String? = null,
    @SerialName("channelId") val channelId: String? = null,
)

@Serializable
internal data class YoutubeSearchContentResponse(
    @SerialName("publishedAt") val publishedDate: String,
    @SerialName("channelId") val channelId: String,
    @SerialName("title") val contentTitle: String,
    @SerialName("description") val description: String,
    @SerialName("thumbnails") val thumbnails: YoutubeThumbnailResponse,
    @SerialName("channelTitle") val channelTitle: String,
    @SerialName("liveBroadcastContent") val liveBroadcastContent: String,
    @SerialName("publishTime") val publishTime: String,
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
        width = item.thumbnails.highSize.width.orEmpty(),
        height = item.thumbnails.highSize.height.orEmpty(),
    ),
)
