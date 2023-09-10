package com.jslee.presentation.feature.home.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import com.jslee.core.ui.adapter.MultiViewTypeListAdapter
import com.jslee.core.ui.base.BaseViewHolder
import com.jslee.presentation.databinding.ItemDividerBinding
import com.jslee.presentation.databinding.ItemHomeBannerBinding
import com.jslee.presentation.databinding.ItemHomeHeaderBinding
import com.jslee.presentation.databinding.ItemHomeMovieBinding
import com.jslee.presentation.feature.home.model.item.HomeListItem
import com.jslee.presentation.feature.home.viewholder.banner.BannerViewHolder
import com.jslee.presentation.feature.home.viewholder.divider.DividerViewHolder
import com.jslee.presentation.feature.home.viewholder.header.HeaderViewHolder
import com.jslee.presentation.feature.home.viewholder.nowplaying.NowPlayingMovieViewHolder
import com.jslee.presentation.feature.home.viewholder.upcoming.UpComingMovieViewHolder

/**
 * MooBeside
 * @author jaesung
 * @created 2023/08/31
 */
class HomeAdapter(
    private val onLoadMoreClick: (Int) -> Unit
) : MultiViewTypeListAdapter<HomeListItem, HomeListItem.HomeViewType>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: HomeListItem.HomeViewType
    ): BaseViewHolder<HomeListItem> {
        val layoutInflater = LayoutInflater.from(parent.context)
        return when (viewType) {
            HomeListItem.HomeViewType.HEADER -> HeaderViewHolder(
                onLoadMoreClick = { onLoadMoreClick(it) },
                ItemHomeHeaderBinding.inflate(layoutInflater, parent, false)
            )

            HomeListItem.HomeViewType.BANNER_CONTENT -> BannerViewHolder(
                ItemHomeBannerBinding.inflate(layoutInflater, parent, false)
            )

            HomeListItem.HomeViewType.NOW_PLAYING_CONTENT -> NowPlayingMovieViewHolder(
                ItemHomeMovieBinding.inflate(layoutInflater, parent, false)
            )

            HomeListItem.HomeViewType.UP_COMING_CONTENT -> UpComingMovieViewHolder(
                ItemHomeMovieBinding.inflate(layoutInflater, parent, false)
            )

            HomeListItem.HomeViewType.DIVIDER -> DividerViewHolder(
                ItemDividerBinding.inflate(layoutInflater, parent, false)
            )
        }
    }
}