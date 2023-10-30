package com.jslee.presentation.feature.detail.model.item

import com.jslee.core.ui.model.ListItem
import com.jslee.presentation.feature.detail.model.CastInfoUiModel
import com.jslee.presentation.feature.detail.model.GalleryUiModel
import com.jslee.presentation.feature.detail.model.MovieInfoUiModel
import com.jslee.presentation.feature.detail.model.RateUiModel
import com.jslee.presentation.feature.home.model.item.HomeListItem

/**
 * MooBeside
 * @author jaesung
 * @created 2023/10/17
 */
sealed class DetailListItem(override val viewType: DetailViewType) : ListItem {

    enum class DetailViewType {
        MOVIE_INFO, CAST, GALLERY, RATE, DIVIDER;
    }

    data class MovieInfo(
        override val id: Long,
        val movieInfoData: MovieInfoUiModel,
    ) : DetailListItem(DetailViewType.MOVIE_INFO)

    data class Cast(
        override val id: Long,
        val castInfoData: List<CastInfoUiModel>,
    ) : DetailListItem(DetailViewType.CAST)

    data class Gallery(
        override val id: Long,
        val galleryData: List<GalleryUiModel>,
    ) : DetailListItem(DetailViewType.GALLERY)

    data class Rate(
        override val id: Long,
        val rateData: RateUiModel,
    ) : DetailListItem(DetailViewType.RATE)

    data class Divider(
        override val id: Long,
    ) : DetailListItem(DetailViewType.DIVIDER)
}
