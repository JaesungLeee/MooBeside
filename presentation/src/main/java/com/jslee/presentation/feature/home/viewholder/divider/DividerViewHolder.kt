package com.jslee.presentation.feature.home.viewholder.divider

import com.moobeside.core.common.ui.recyclerview.base.BaseViewHolder
import com.moobeside.core.common.ui.recyclerview.model.ListItem
import com.jslee.presentation.databinding.ItemDividerBinding
import com.jslee.presentation.feature.home.model.item.HomeListItem

/**
 * MooBeside
 * @author jaesung
 * @created 2023/09/01
 */
class DividerViewHolder<T: ListItem>(private val binding: ItemDividerBinding) :
    BaseViewHolder<T>(binding) {
    override fun bindItems(item: T) {}
}