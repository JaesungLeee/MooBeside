package com.jslee.presentation.feature.home.viewholder.header

import androidx.core.view.isVisible
import com.jslee.core.ui.base.BaseViewHolder
import com.jslee.presentation.databinding.ItemHomeHeaderBinding
import com.jslee.presentation.feature.home.model.item.HomeListItem
import timber.log.Timber

/**
 * MooBeside
 * @author jaesung
 * @created 2023/09/01
 */
class HeaderViewHolder(
    onLoadMoreClick: (Int) -> Unit,
    private val binding: ItemHomeHeaderBinding
) : BaseViewHolder<HomeListItem.Header>(binding) {
    init {
        binding.tvLoadMore.setOnClickListener {
            onLoadMoreClick(adapterPosition)
        }
    }

    override fun bindItems(item: HomeListItem.Header) = with(binding) {
        header = item.also {
            if (it.isLoadMoreEnabled) {
                tvLoadMore.isVisible = true
            }
        }
        executePendingBindings()
    }
}