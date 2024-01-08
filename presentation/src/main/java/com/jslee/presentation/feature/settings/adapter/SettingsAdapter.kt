package com.jslee.presentation.feature.settings.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import com.jslee.core.ui.adapter.MultiViewTypeListAdapter
import com.jslee.core.ui.base.BaseViewHolder
import com.jslee.presentation.databinding.ItemDividerBinding
import com.jslee.presentation.databinding.ItemSettingsHeaderBinding
import com.jslee.presentation.databinding.ItemSettingsOptionBinding
import com.jslee.presentation.databinding.ItemSettingsVersionBinding
import com.jslee.presentation.feature.home.viewholder.divider.DividerViewHolder
import com.jslee.presentation.feature.settings.model.navigation.NavigationOption
import com.jslee.presentation.feature.settings.model.SettingsListItem
import com.jslee.presentation.feature.settings.viewholder.SettingsAppVersionViewHolder
import com.jslee.presentation.feature.settings.viewholder.SettingsHeaderViewHolder
import com.jslee.presentation.feature.settings.viewholder.SettingsOptionViewHolder

/**
 * MooBeside
 * @author jaesung
 * @created 2024/01/08
 */
class SettingsAdapter(
    private val onOptionClick: (NavigationOption) -> Unit,
) : MultiViewTypeListAdapter<SettingsListItem, SettingsListItem.SettingsViewType>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: SettingsListItem.SettingsViewType,
    ): BaseViewHolder<SettingsListItem> {
        val inflater = LayoutInflater.from(parent.context)

        return when (viewType) {
            SettingsListItem.SettingsViewType.HEADER -> {
                val binding = ItemSettingsHeaderBinding.inflate(inflater, parent, false)
                SettingsHeaderViewHolder(binding)
            }

            SettingsListItem.SettingsViewType.OPTION -> {
                val binding = ItemSettingsOptionBinding.inflate(inflater, parent, false)
                SettingsOptionViewHolder(binding, onOptionClick)
            }

            SettingsListItem.SettingsViewType.APP_VERSION -> {
                val binding = ItemSettingsVersionBinding.inflate(inflater, parent, false)
                SettingsAppVersionViewHolder(binding)
            }

            SettingsListItem.SettingsViewType.DIVIDER -> {
                val binding = ItemDividerBinding.inflate(inflater, parent, false)
                DividerViewHolder(binding)
            }
        }
    }
}