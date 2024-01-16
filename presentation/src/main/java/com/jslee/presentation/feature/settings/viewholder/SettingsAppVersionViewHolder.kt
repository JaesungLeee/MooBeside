package com.jslee.presentation.feature.settings.viewholder

import com.jslee.core.ui.base.BaseViewHolder
import com.jslee.presentation.databinding.ItemSettingsHeaderBinding
import com.jslee.presentation.databinding.ItemSettingsVersionBinding
import com.jslee.presentation.feature.settings.model.SettingsListItem

/**
 * MooBeside
 * @author jaesung
 * @created 2024/01/08
 */
class SettingsAppVersionViewHolder(
    private val binding: ItemSettingsVersionBinding,
) : BaseViewHolder<SettingsListItem.AppVersion>(binding) {

    override fun bindItems(item: SettingsListItem.AppVersion) {
        binding.tvOptionContent.text = item.description
        binding.tvVersion.text = item.appVersion
    }
}