package com.jslee.presentation.feature.detail.viewholder.rate

import com.jslee.core.ui.base.BaseViewHolder
import com.jslee.presentation.databinding.ItemDetailRateBinding
import com.jslee.presentation.feature.detail.model.item.DetailListItem

/**
 * MooBeside
 * @author jaesung
 * @created 2023/10/30
 */
class RateInfoViewHolder(
    private val binding: ItemDetailRateBinding,
) : BaseViewHolder<DetailListItem.Rate>(binding) {
    override fun bindItems(item: DetailListItem.Rate) = with(binding) {
        rateInfo = item.rateData
        executePendingBindings()
    }
}