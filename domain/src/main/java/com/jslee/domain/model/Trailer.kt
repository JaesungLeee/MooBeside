package com.jslee.domain.model

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
)
