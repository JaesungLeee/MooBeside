package com.jslee.presentation.feature.home.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import com.jslee.core.ui.adapter.MultiViewTypeListAdapter
import com.jslee.core.ui.base.BaseViewHolder
import com.jslee.presentation.databinding.ItemHomeBannerBinding
import com.jslee.presentation.databinding.ItemHomeHeaderBinding
import com.jslee.presentation.databinding.ItemMovieThumbnailBinding
import com.jslee.presentation.feature.home.model.HomeListItem
import com.jslee.presentation.feature.home.viewholder.banner.BannerViewHolder
import com.jslee.presentation.feature.home.viewholder.header.HeaderViewHolder
import com.jslee.presentation.feature.home.viewholder.movie.NowPlayingMovieViewHolder
import com.jslee.presentation.feature.home.viewholder.movie.UpComingMovieViewHolder

/**
 * MooBeside
 * @author jaesung
 * @created 2023/08/31
 */
class HomeAdapter : MultiViewTypeListAdapter<HomeListItem, HomeListItem.HomeViewType>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: HomeListItem.HomeViewType
    ): BaseViewHolder<HomeListItem> {
        val layoutInflater = LayoutInflater.from(parent.context)
        return when (viewType) {
            HomeListItem.HomeViewType.HEADER -> HeaderViewHolder(
                ItemHomeHeaderBinding.inflate(layoutInflater, parent, false)
            )

            HomeListItem.HomeViewType.BANNER_CONTENT -> BannerViewHolder(
                ItemHomeBannerBinding.inflate(layoutInflater, parent, false)
            )

            HomeListItem.HomeViewType.NOW_PLAYING_CONTENT -> NowPlayingMovieViewHolder(
                ItemMovieThumbnailBinding.inflate(layoutInflater, parent, false)
            )

            HomeListItem.HomeViewType.UP_COMING_CONTENT -> UpComingMovieViewHolder(
                ItemMovieThumbnailBinding.inflate(layoutInflater, parent, false)
            )
        }
    }
}