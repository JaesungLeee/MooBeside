package com.jslee.presentation.feature.home

import com.jslee.presentation.feature.home.model.BannerUiModel
import com.jslee.presentation.feature.home.model.NowPlayingUiModel
import com.jslee.presentation.feature.home.model.UpComingUiModel

/**
 * MooBeside
 * @author jaesung
 * @created 2023/09/26
 */
interface HomeClickListener {
    fun onLoadMoreClick(position: Int)
    fun onBannerClick(item: BannerUiModel)
    fun onNowPlayingPosterClick(item: NowPlayingUiModel)
    fun onUpComingPosterClick(item: UpComingUiModel)
}