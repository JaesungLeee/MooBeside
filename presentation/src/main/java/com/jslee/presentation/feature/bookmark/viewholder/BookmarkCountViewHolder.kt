package com.jslee.presentation.feature.bookmark.viewholder

import com.jslee.core.ui.base.BaseViewHolder
import com.jslee.presentation.databinding.ItemListCountBinding
import com.jslee.presentation.feature.bookmark.model.item.BookmarkListItem

/**
 * MooBeside
 * @author jaesung
 * @created 2023/11/03
 */
class BookmarkCountViewHolder(
    private val binding: ItemListCountBinding,
) : BaseViewHolder<BookmarkListItem.TotalCount>(binding) {
    override fun bindItems(item: BookmarkListItem.TotalCount) = with(binding) {
        totalCount = item.count
        executePendingBindings()
    }
}