package com.jslee.presentation.feature.settings.model

import android.content.Context
import android.content.pm.PackageManager
import android.os.Build
import com.jslee.presentation.feature.settings.model.navigation.NavigationOption
import com.jslee.presentation.feature.settings.model.navigation.NavigationPath
import com.jslee.presentation.feature.settings.model.navigation.NavigationType

/**
 * MooBeside
 * @author jaesung
 * @created 2024/01/08
 */
class Settings(private val context: Context) {

    fun provideOptions(): List<SettingsListItem> {
        val options = mutableListOf<SettingsListItem>().apply {
            add(
                SettingsListItem.Header(
                    id = 3,
                    description = "정보"
                )
            )
            add(
                SettingsListItem.Option(
                    id = 4,
                    navigationOption = NavigationOption(
                        navigationType = NavigationType.NOTICE,
                        navigationPath = NavigationPath.DETAIL,
                    )
                )
            )
            add(
                SettingsListItem.Option(
                    id = 5,
                    navigationOption = NavigationOption(
                        navigationType = NavigationType.TERMS_OF_SERVICE,
                        navigationPath = NavigationPath.WEB_VIEW,
                    )
                )
            )
            add(
                SettingsListItem.Option(
                    id = 6,
                    navigationOption = NavigationOption(
                        navigationType = NavigationType.CONTACT,
                        navigationPath = NavigationPath.WEB_VIEW,
                    )
                )
            )
            add(
                SettingsListItem.Option(
                    id = 7,
                    navigationOption = NavigationOption(
                        navigationType = NavigationType.OPEN_SOURCE,
                        navigationPath = NavigationPath.DETAIL,
                    )
                )
            )
            add(
                SettingsListItem.AppVersion(
                    id = 8,
                    description = "버전정보",
                    appVersion = getVersionName()
                )
            )
        }
        return options
    }

    private fun getVersionName(): String {
        return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            context.applicationContext.packageManager.getPackageInfo(
                context.packageName, PackageManager.PackageInfoFlags.of(0L)
            ).versionName
        } else {
            context.applicationContext.packageManager.getPackageInfo(
                context.packageName, 0
            ).versionName
        }
    }
}