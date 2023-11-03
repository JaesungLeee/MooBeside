package com.jslee.presentation.feature.bookmark.viewholder

import com.jslee.core.ui.base.BaseViewHolder
import com.jslee.presentation.databinding.ItemBookmarkBinding
import com.jslee.presentation.feature.bookmark.model.BookmarkUiModel

/**
 * MooBeside
 * @author jaesung
 * @created 2023/11/03
 */
class BookmarkItemViewHolder(
    private val binding: ItemBookmarkBinding,
    onBookmarkClick: (Long) -> Unit,
) : BaseViewHolder<BookmarkUiModel>(binding) {

    init {
        binding.root.setOnClickListener {
            getItem {
                onBookmarkClick(it.movieId)
            }
        }
    }

    override fun bindItems(item: BookmarkUiModel) = with(binding) {
        bookmark = item
        executePendingBindings()
    }
}
