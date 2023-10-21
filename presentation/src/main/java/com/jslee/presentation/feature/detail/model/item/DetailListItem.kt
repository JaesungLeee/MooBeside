package com.jslee.presentation.feature.detail.model.item

import com.jslee.core.ui.model.ListItem
import com.jslee.presentation.feature.detail.model.MovieInfoUiModel

/**
 * MooBeside
 * @author jaesung
 * @created 2023/10/17
 */
sealed class DetailListItem(override val viewType: DetailViewType) : ListItem {

    enum class DetailViewType {
        MOVIE_INFO,
    }

    data class MovieInfo(
        override val id: Long,
        val movieInfoData: MovieInfoUiModel
    ) : DetailListItem(DetailViewType.MOVIE_INFO)

}
