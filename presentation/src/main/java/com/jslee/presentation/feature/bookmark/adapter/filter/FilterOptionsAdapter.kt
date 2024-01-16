package com.jslee.presentation.feature.bookmark.adapter.filter

import android.view.LayoutInflater
import android.view.ViewGroup
import com.jslee.core.ui.adapter.MultiViewTypeListAdapter
import com.jslee.core.ui.base.BaseViewHolder
import com.jslee.presentation.databinding.ItemFilterOptionTextBinding
import com.jslee.domain.model.BookmarkFilter
import com.jslee.presentation.feature.bookmark.model.item.FilterOptionsListItem

/**
 * MooBeside
 * @author jaesung
 * @created 2023/11/10
 */
class FilterOptionsAdapter(
    private val onFilterClick: (BookmarkFilter) -> Unit,
) : MultiViewTypeListAdapter<FilterOptionsListItem, FilterOptionsListItem.FilterOptionsViewType>() {

    private var selectedFilter: BookmarkFilter = BookmarkFilter.LATEST_RELEASE

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: FilterOptionsListItem.FilterOptionsViewType,
    ): BaseViewHolder<FilterOptionsListItem> {
        val inflater = LayoutInflater.from(parent.context)

        return when (viewType) {
            FilterOptionsListItem.FilterOptionsViewType.TEXT_OPTION -> {
                val binding = ItemFilterOptionTextBinding.inflate(inflater)
                TextFilterOptionViewHolder(binding, onFilterClick)
            }
        }
    }

    private fun updateFilter(filter: BookmarkFilter) {
        if (filter.ordinal != selectedFilter.ordinal) {
            val previousFilter = selectedFilter
            selectedFilter = filter
            notifyItemChanged(previousFilter.ordinal)
            notifyItemChanged(selectedFilter.ordinal)
        }
    }

    inner class TextFilterOptionViewHolder(
        private val binding: ItemFilterOptionTextBinding,
        onFilterClick: (BookmarkFilter) -> Unit,
    ) : BaseViewHolder<FilterOptionsListItem.TextOption>(binding) {

        init {
            binding.tvOption.setOnClickListener {
                getItem { textOption ->
                    updateFilter(textOption.filter)
                    onFilterClick(textOption.filter)
                }
            }
        }

        override fun bindItems(item: FilterOptionsListItem.TextOption) = with(binding) {
            tvOption.text = item.filter.description
            tvOption.isSelected = bindingAdapterPosition == selectedFilter.ordinal
            executePendingBindings()
        }
    }
}