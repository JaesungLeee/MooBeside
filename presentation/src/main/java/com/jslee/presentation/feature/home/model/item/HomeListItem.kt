package com.jslee.presentation.feature.home.model.item

import com.jslee.core.ui.model.ListItem
import com.jslee.presentation.feature.home.model.BannerUiModel
import com.jslee.presentation.feature.home.model.NowPlayingUiModel
import com.jslee.presentation.feature.home.model.UpComingUiModel

/**
 * MooBeside
 * @author jaesung
 * @created 2023/08/31
 */
sealed class HomeListItem(override val viewType: HomeViewType) : ListItem {
    enum class HomeViewType {
        HEADER,
        BANNER_CONTENT,
        NOW_PLAYING_CONTENT,
        UP_COMING_CONTENT,
        DIVIDER,
    }

    data class Header(
        override val id: Long,
        val title: String,
    ) : HomeListItem(HomeViewType.HEADER)

    data class BannerContent(
        override val id: Long,
        val bannerData: List<BannerUiModel>
    ) : HomeListItem(HomeViewType.BANNER_CONTENT)

    data class NowPlayingContent(
        override val id: Long,
        val nowPlayingData: List<NowPlayingUiModel>
    ) : HomeListItem(HomeViewType.NOW_PLAYING_CONTENT)

    data class UpComingContent(
        override val id: Long,
        val upComingData: List<UpComingUiModel>
    ) : HomeListItem(HomeViewType.UP_COMING_CONTENT)

    data class Divider(
        override val id: Long
    ) : HomeListItem(HomeViewType.DIVIDER)
}