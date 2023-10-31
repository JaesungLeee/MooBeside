package com.jslee.data.model

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
