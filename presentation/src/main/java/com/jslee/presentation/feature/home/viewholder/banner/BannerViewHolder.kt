package com.jslee.presentation.feature.home.viewholder.banner

import com.jslee.core.ui.base.BaseViewHolder
import com.jslee.presentation.databinding.ItemHomeBannerBinding
import com.jslee.presentation.feature.home.model.item.HomeListItem

/**
 * MooBeside
 * @author jaesung
 * @created 2023/09/01
 */
class BannerViewHolder(private val binding: ItemHomeBannerBinding) :
    BaseViewHolder<HomeListItem.BannerContent>(binding) {
    override fun bindItems(item: HomeListItem.BannerContent) = with(binding) {
        executePendingBindings()
    }
}