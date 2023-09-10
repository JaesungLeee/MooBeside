package com.jslee.presentation.feature.home.viewholder.banner

import com.jslee.core.ui.base.BaseViewHolder
import com.jslee.presentation.databinding.ItemPopularPosterBinding
import com.jslee.presentation.feature.home.model.BannerUiModel

/**
 * MooBeside
 * @author jaesung
 * @created 2023/09/10
 */
class BannerPosterViewHolder(private val binding: ItemPopularPosterBinding) :
    BaseViewHolder<BannerUiModel>(binding) {

    override fun bindItems(item: BannerUiModel) = with(binding) {
        banner = item
        executePendingBindings()
    }
}