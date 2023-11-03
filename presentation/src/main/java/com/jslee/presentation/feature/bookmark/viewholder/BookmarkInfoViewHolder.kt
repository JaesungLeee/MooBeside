package com.jslee.presentation.feature.bookmark.viewholder

import com.jslee.core.ui.base.BaseViewHolder
import com.jslee.presentation.databinding.ItemBookmarkListBinding
import com.jslee.presentation.feature.bookmark.adapter.BookmarkListAdapter
import com.jslee.presentation.feature.bookmark.model.item.BookmarkListItem

/**
 * MooBeside
 * @author jaesung
 * @created 2023/11/03
 */
class BookmarkInfoViewHolder(
    private val binding: ItemBookmarkListBinding,
    onBookmarkClick: (Long) -> Unit,
) : BaseViewHolder<BookmarkListItem.Bookmark>(binding) {
    private val bookmarkListAdapter by lazy { BookmarkListAdapter(onBookmarkClick) }

    init {
        initBookmarkListAdapter()
    }

    private fun initBookmarkListAdapter() = with(binding) {
        rvBookmarkList.adapter = bookmarkListAdapter
    }

    override fun bindItems(item: BookmarkListItem.Bookmark) = with(binding) {
        bookmarkListAdapter.submitList(item.bookmarkData)
        executePendingBindings()
    }
}