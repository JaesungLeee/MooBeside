package com.moobeside.core.remote.network.dto.response.tmdb

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * MooBeside
 * @author jaesung
 * @created 2023/10/04
 */
@Serializable
data class ImagesResponse(
    @SerialName("id") val movieId: Long,
    @SerialName("backdrops") val backdropImages: List<ImageInfoResponse>,
    @SerialName("logos") val logoImages: List<ImageInfoResponse>,
    @SerialName("posters") val posterImages: List<ImageInfoResponse>,
)

@Serializable
data class ImageInfoResponse(
    @SerialName("aspect_ratio") val aspectRatio: Double,
    @SerialName("height") val height: Int,
    @SerialName("iso_639_1") val languageCode: String,
    @SerialName("file_path") val imageFilePath: String,
    @SerialName("vote_average") val averageVoteRate: Double,
    @SerialName("vote_count") val voteCount: Int,
    @SerialName("width") val width: Int,
)

