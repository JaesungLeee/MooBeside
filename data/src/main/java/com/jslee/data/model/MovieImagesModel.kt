package com.jslee.data.model

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
    val imageFilePath: String,
    val averageVoteRate: Double,
    val voteCount: Int,
)
