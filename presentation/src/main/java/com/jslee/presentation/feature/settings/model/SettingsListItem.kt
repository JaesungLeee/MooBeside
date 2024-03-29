package com.jslee.presentation.feature.settings.model

import com.jslee.core.ui.model.ListItem
import com.jslee.presentation.feature.settings.model.navigation.NavigationOption

/**
 * MooBeside
 * @author jaesung
 * @created 2024/01/08
 */
sealed class SettingsListItem(override val viewType: SettingsViewType) : ListItem {

    enum class SettingsViewType {
        HEADER,
        OPTION,
        APP_VERSION,
        DIVIDER;
    }

    data class Header(
        override val id: Long,
        val description: String,
    ) : SettingsListItem(SettingsViewType.HEADER)

    data class Option(
        override val id: Long,
        val navigationOption: NavigationOption,
    ) : SettingsListItem(SettingsViewType.OPTION)

    data class AppVersion(
        override val id: Long,
        val description: String,
        val appVersion: String,
    ) : SettingsListItem(SettingsViewType.APP_VERSION)

    data class Divider(
        override val id: Long,
    ) : SettingsListItem(SettingsViewType.DIVIDER)
}