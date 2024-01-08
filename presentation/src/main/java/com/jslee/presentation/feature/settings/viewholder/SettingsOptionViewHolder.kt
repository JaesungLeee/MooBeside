package com.jslee.presentation.feature.settings.viewholder

import com.jslee.core.ui.base.BaseViewHolder
import com.jslee.presentation.databinding.ItemSettingsOptionBinding
import com.jslee.presentation.feature.settings.model.SettingsListItem

/**
 * MooBeside
 * @author jaesung
 * @created 2024/01/08
 */
class SettingsOptionViewHolder(
    private val binding: ItemSettingsOptionBinding,
    private val onOptionClick: (action: Int) -> Unit,
) : BaseViewHolder<SettingsListItem.Option>(binding) {

    init {
        binding.root.setOnClickListener {
            getItem { item ->
                onOptionClick(item.action)
            }
        }
    }

    override fun bindItems(item: SettingsListItem.Option) {
        binding.tvOptionContent.text = item.description
    }
}