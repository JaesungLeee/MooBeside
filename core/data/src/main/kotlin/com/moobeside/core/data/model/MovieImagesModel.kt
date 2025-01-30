package com.moobeside.core.data.model

import com.moobeside.core.remote.network.dto.response.tmdb.ImageInfoResponse
import com.moobeside.core.remote.network.dto.response.tmdb.ImagesResponse

/**
 * MooBeside
 * @author jaesung
 * @created 2023/10/04
 */
internal data class MovieImagesModel(
    val movieId: Long,
    val backdropImages: List<ImageInfoModel>,
    val logoImages: List<ImageInfoModel>,
    val posterImages: List<ImageInfoModel>,
)

internal data class ImageInfoModel(
    val aspectRatio: Double,
    val height: Int,
    val width: Int,
    val languageCode: String,
    val imageFilePath: String?,
    val averageVoteRate: Double,
    val voteCount: Int,
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
