package com.jslee.presentation.feature.detail.model

import com.jslee.domain.model.movie.Movie

/**
 * MooBeside
 * @author jaesung
 * @created 2023/10/29
 */
data class GalleryUiModel(
    val id: Long,
    val galleryImageUrl: String?,
)

fun Movie.mapToGalleryUiModel(): List<GalleryUiModel> {
    return images?.map {
        GalleryUiModel(
            id = System.currentTimeMillis() / 1000,
            galleryImageUrl = it
        )
    }.orEmpty()
}
