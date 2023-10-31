package com.jslee.data.datasource.remote.dto.response.youtube

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * MooBeside
 * @author jaesung
 * @created 2023/10/30
 */

@Serializable
internal data class YoutubeThumbnailResponse(
    @SerialName("default") val defaultSize: YoutubeThumbnailSizeResponse,
    @SerialName("medium") val mediumSize: YoutubeThumbnailSizeResponse,
    @SerialName("high") val highSize: YoutubeThumbnailSizeResponse,
)

@Serializable
internal data class YoutubeThumbnailSizeResponse(
    @SerialName("url") val thumbnailUrl: String,
    @SerialName("width") val width: String,
    @SerialName("height") val height: String,
)
