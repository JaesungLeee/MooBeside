package com.jslee.presentation.feature.home.viewholder.header

import com.jslee.core.ui.base.BaseViewHolder
import com.jslee.presentation.databinding.ItemHomeHeaderBinding
import com.jslee.presentation.feature.home.model.HomeListItem

/**
 * MooBeside
 * @author jaesung
 * @created 2023/09/01
 */
class HeaderViewHolder(private val binding: ItemHomeHeaderBinding) :
    BaseViewHolder<HomeListItem.Header>(binding) {
    override fun bindItems(item: HomeListItem.Header) = with(binding) {
        tvTitlePopularMovie.text = item.title
        executePendingBindings()
    }
}