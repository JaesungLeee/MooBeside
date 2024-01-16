package com.jslee.presentation.feature.settings.viewholder

import com.jslee.core.ui.base.BaseViewHolder
import com.jslee.presentation.databinding.ItemSettingsOptionBinding
import com.jslee.presentation.feature.settings.model.SettingsListItem
import com.jslee.presentation.feature.settings.model.navigation.NavigationOption
import com.jslee.presentation.feature.settings.model.navigation.NavigationType

/**
 * MooBeside
 * @author jaesung
 * @created 2024/01/08
 */
class SettingsOptionViewHolder(
    private val binding: ItemSettingsOptionBinding,
    private val onOptionClick: (NavigationOption) -> Unit,
) : BaseViewHolder<SettingsListItem.Option>(binding) {

    init {
        binding.root.setOnClickListener {
            getItem { item ->
                onOptionClick(item.navigationOption)
            }
        }
    }

    override fun bindItems(item: SettingsListItem.Option) {
        val description = NavigationType.getDescription(item.navigationOption.navigationType)
        binding.tvOptionContent.text = description
    }
}