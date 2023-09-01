package com.jslee.presentation.feature.home.model

import com.jslee.core.ui.model.ListItem

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
        UP_COMING_CONTENT
    }

    data class Header(
        override val id: Long,
        val title: String,
    ) : HomeListItem(HomeViewType.HEADER)

    data class BannerContent(
        override val id: Long,
//        val bannerData: List<BannerUiModel>
    ) : HomeListItem(HomeViewType.BANNER_CONTENT)

    data class NowPlayingContent(
        override val id: Long,
//        val nowPlayingData: List<NowPlayingUiModel>
    ) : HomeListItem(HomeViewType.NOW_PLAYING_CONTENT)

    data class UpComingContent(
        override val id: Long,
//        val upComingData: List<UpComingUiModel>
    ) : HomeListItem(HomeViewType.UP_COMING_CONTENT)
}