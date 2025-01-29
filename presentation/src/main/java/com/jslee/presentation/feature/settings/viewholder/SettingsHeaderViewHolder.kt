package com.jslee.presentation.feature.settings.viewholder

import com.moobeside.core.common.ui.recyclerview.base.BaseViewHolder
import com.jslee.presentation.databinding.ItemSettingsHeaderBinding
import com.jslee.presentation.feature.settings.model.SettingsListItem

/**
 * MooBeside
 * @author jaesung
 * @created 2024/01/08
 */
class SettingsHeaderViewHolder(
    private val binding: ItemSettingsHeaderBinding,
) : BaseViewHolder<SettingsListItem.Header>(binding) {

    override fun bindItems(item: SettingsListItem.Header) {
        binding.tvOptionHeader.text = item.description
    }
}