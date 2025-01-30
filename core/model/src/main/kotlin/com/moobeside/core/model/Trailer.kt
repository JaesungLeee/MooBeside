package com.moobeside.core.model

/**
 * MooBeside
 * @author jaesung
 * @created 2023/10/31
 */
data class Trailer(
    val videoId: String,
    val channelId: String,
    val channelTitle: String,
    val contentTitle: String,
    val description: String,
    val publishedDate: String,
    val thumbnailUrl: String,
) {
    val isVideoIdEmpty = videoId.isEmpty()
}
