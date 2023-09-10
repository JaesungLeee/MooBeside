package com.jslee.presentation.feature.home.viewholder.banner

import com.jslee.core.ui.base.BaseViewHolder
import com.jslee.presentation.databinding.ItemHomeBannerBinding
import com.jslee.presentation.feature.home.adapter.PopularMovieBannerAdapter
import com.jslee.presentation.feature.home.model.item.HomeListItem

/**
 * MooBeside
 * @author jaesung
 * @created 2023/09/01
 */
class BannerViewHolder(private val binding: ItemHomeBannerBinding) :
    BaseViewHolder<HomeListItem.BannerContent>(binding) {

    private val bannerAdapter: PopularMovieBannerAdapter by lazy { PopularMovieBannerAdapter() }

    init {
        binding.vpPopularBanner.adapter = bannerAdapter
    }

    override fun bindItems(item: HomeListItem.BannerContent) {
        bannerAdapter.submitList(item.bannerData)
    }
}