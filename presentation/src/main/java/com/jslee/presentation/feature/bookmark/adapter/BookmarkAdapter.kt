package com.jslee.presentation.feature.bookmark.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import com.jslee.core.ui.adapter.MultiViewTypeListAdapter
import com.jslee.core.ui.base.BaseViewHolder
import com.jslee.presentation.databinding.ItemBookmarkListBinding
import com.jslee.presentation.databinding.ItemListCountBinding
import com.jslee.presentation.feature.bookmark.model.item.BookmarkListItem
import com.jslee.presentation.feature.bookmark.viewholder.BookmarkCountViewHolder
import com.jslee.presentation.feature.bookmark.viewholder.BookmarkInfoViewHolder

/**
 * MooBeside
 * @author jaesung
 * @created 2023/11/03
 */
class BookmarkAdapter(
    private val onBookmarkClick: (Long) -> Unit,
) : MultiViewTypeListAdapter<BookmarkListItem, BookmarkListItem.BookmarkViewType>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: BookmarkListItem.BookmarkViewType,
    ): BaseViewHolder<BookmarkListItem> {
        val inflater = LayoutInflater.from(parent.context)

        return when (viewType) {
            BookmarkListItem.BookmarkViewType.TOTAL_COUNT -> BookmarkCountViewHolder(
                ItemListCountBinding.inflate(inflater, parent, false)
            )

            BookmarkListItem.BookmarkViewType.BOOKMARK -> BookmarkInfoViewHolder(
                ItemBookmarkListBinding.inflate(inflater, parent, false),
                onBookmarkClick = onBookmarkClick
            )
        }
    }
}