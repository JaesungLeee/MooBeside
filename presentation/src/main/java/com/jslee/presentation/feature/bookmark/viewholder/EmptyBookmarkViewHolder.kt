package com.jslee.presentation.feature.bookmark.viewholder

import com.jslee.core.ui.base.BaseViewHolder
import com.jslee.presentation.databinding.ItemBookmarkEmptyBinding
import com.jslee.presentation.feature.bookmark.model.item.BookmarkListItem

/**
 * MooBeside
 * @author jaesung
 * @created 2023/12/21
 */
class EmptyBookmarkViewHolder(
    private val binding: ItemBookmarkEmptyBinding,
    onNavigateHome: () -> Unit,
) : BaseViewHolder<BookmarkListItem.EmptyBookmark>(binding) {

    init {
        binding.btnNavigateHome.setOnClickListener {
            onNavigateHome()
        }
    }
}