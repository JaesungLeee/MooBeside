package com.jslee.data.datasource.remote.dto.response.tmdb

import com.jslee.data.model.ImageInfoModel
import com.jslee.data.model.MovieImagesModel
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * MooBeside
 * @author jaesung
 * @created 2023/10/04
 */
@Serializable
internal data class ImagesResponse(
    @SerialName("id") val movieId: Long,
    @SerialName("backdrops") val backdropImages: List<ImageInfoResponse>,
    @SerialName("logos") val logoImages: List<ImageInfoResponse>,
    @SerialName("posters") val posterImages: List<ImageInfoResponse>,
)

@Serializable
internal data class ImageInfoResponse(
    @SerialName("aspect_ratio") val aspectRatio: Double,
    @SerialName("height") val height: Int,
    @SerialName("iso_639_1") val languageCode: String,
    @SerialName("file_path") val imageFilePath: String,
    @SerialName("vote_average") val averageVoteRate: Double,
    @SerialName("vote_count") val voteCount: Int,
    @SerialName("width") val width: Int,
)

internal fun ImagesResponse.toDataModel() = MovieImagesModel(
    movieId = movieId,
    backdropImages = backdropImages.map { it.toDataModel() },
    logoImages = logoImages.map { it.toDataModel() },
    posterImages = posterImages.map { it.toDataModel() },
)

internal fun ImageInfoResponse.toDataModel() = ImageInfoModel(
    aspectRatio = aspectRatio,
    height = height,
    width = width,
    languageCode = languageCode,
    imageFilePath = imageFilePath,
    averageVoteRate = averageVoteRate,
    voteCount = voteCount
)
