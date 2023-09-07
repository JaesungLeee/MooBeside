package com.jslee.presentation.feature.home.viewholder.divider

import com.jslee.core.ui.base.BaseViewHolder
import com.jslee.presentation.databinding.ItemDividerBinding
import com.jslee.presentation.feature.home.model.item.HomeListItem

/**
 * MooBeside
 * @author jaesung
 * @created 2023/09/01
 */
class DividerViewHolder(private val binding: ItemDividerBinding) :
    BaseViewHolder<HomeListItem.Divider>(binding) {
    override fun bindItems(item: HomeListItem.Divider) {}
}