package com.jslee.presentation.feature.bookmark.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import com.moobeside.core.common.ui.recyclerview.adapter.SingleViewTypeListAdapter
import com.moobeside.core.common.ui.recyclerview.base.BaseViewHolder
import com.jslee.presentation.databinding.ItemBookmarkBinding
import com.jslee.presentation.feature.bookmark.model.BookmarkUiModel
import com.jslee.presentation.feature.bookmark.viewholder.BookmarkItemViewHolder

class BookmarkListAdapter(
    private val onBookmarkClick: (Long) -> Unit,
) : SingleViewTypeListAdapter<BookmarkUiModel>({ it.movieId }) {
    override fun onCreateViewHolder(parent: ViewGroup): BaseViewHolder<BookmarkUiModel> {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemBookmarkBinding.inflate(inflater, parent, false)
        return BookmarkItemViewHolder(binding, onBookmarkClick)
    }
}