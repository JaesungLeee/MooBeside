package com.jslee.presentation.feature.bookmark.adapter.filter

import android.view.LayoutInflater
import android.view.ViewGroup
import com.jslee.core.ui.adapter.MultiViewTypeListAdapter
import com.jslee.core.ui.base.BaseViewHolder
import com.jslee.presentation.databinding.ItemFilterOptionTextBinding
import com.jslee.presentation.feature.bookmark.model.item.FilterOptionsListItem

/**
 * MooBeside
 * @author jaesung
 * @created 2023/11/10
 */
class FilterOptionsAdapter(
    private val onChangeFilter: (Long) -> Unit,
) : MultiViewTypeListAdapter<FilterOptionsListItem, FilterOptionsListItem.FilterOptionsViewType>() {

    private var selectedTextFilterPosition: Int = -1

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: FilterOptionsListItem.FilterOptionsViewType,
    ): BaseViewHolder<FilterOptionsListItem> {
        val inflater = LayoutInflater.from(parent.context)

        return when (viewType) {
            FilterOptionsListItem.FilterOptionsViewType.TEXT_OPTION -> {
                val binding = ItemFilterOptionTextBinding.inflate(inflater)
                TextFilterOptionViewHolder(binding, onChangeFilter)
            }
        }
    }

    private fun selectTextFilter(position: Long) {
        if (position.toInt() != selectedTextFilterPosition) {
            val previousPosition = selectedTextFilterPosition
            selectedTextFilterPosition = position.toInt()
            notifyItemChanged(previousPosition)
            notifyItemChanged(selectedTextFilterPosition)
        }
    }

    inner class TextFilterOptionViewHolder(
        private val binding: ItemFilterOptionTextBinding,
        onChangeFilter: (Long) -> Unit,
    ) : BaseViewHolder<FilterOptionsListItem.TextOption>(binding) {

        init {
            binding.tvOption.setOnClickListener {
                getItem { textOption ->
                    onChangeFilter(textOption.id)
                    selectTextFilter(textOption.id)
                }
            }
        }

        override fun bindItems(item: FilterOptionsListItem.TextOption) = with(binding) {
            tvOption.text = item.description
            tvOption.isSelected = bindingAdapterPosition == selectedTextFilterPosition
            executePendingBindings()
        }
    }
}