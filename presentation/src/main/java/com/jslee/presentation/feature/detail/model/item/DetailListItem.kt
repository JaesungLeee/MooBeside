package com.jslee.presentation.feature.detail.model.item

import com.jslee.core.ui.model.ListItem
import com.jslee.presentation.feature.detail.model.CastInfoUiModel
import com.jslee.presentation.feature.detail.model.GalleryUiModel
import com.jslee.presentation.feature.detail.model.MovieInfoUiModel

/**
 * MooBeside
 * @author jaesung
 * @created 2023/10/17
 */
sealed class DetailListItem(override val viewType: DetailViewType) : ListItem {

    enum class DetailViewType {
        MOVIE_INFO, CAST, GALLERY;
    }

    data class MovieInfo(
        override val id: Long = 0,
        val movieInfoData: MovieInfoUiModel,
    ) : DetailListItem(DetailViewType.MOVIE_INFO)

    data class Cast(
        override val id: Long = 1,
        val castInfoData: List<CastInfoUiModel>,
    ) : DetailListItem(DetailViewType.CAST)

    data class Gallery(
        override val id: Long = 2,
        val galleryData: List<GalleryUiModel>
    ) : DetailListItem(DetailViewType.GALLERY)
}
