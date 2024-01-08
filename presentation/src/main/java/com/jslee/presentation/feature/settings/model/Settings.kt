package com.jslee.presentation.feature.settings.model

import android.content.Context
import android.content.pm.PackageManager
import android.os.Build

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
                    id = 0,
                    description = "서비스 이용"
                )
            )
            add(
                SettingsListItem.Option(
                    id = 1,
                    description = "알림설정",
                    action = 0,
                )
            )
            add(
                SettingsListItem.Divider(
                    id = 2,
                )
            )
            add(
                SettingsListItem.Header(
                    id = 3,
                    description = "정보"
                )
            )
            add(
                SettingsListItem.Option(
                    id = 4,
                    description = "공지사항",
                    action = 1,
                )
            )
            add(
                SettingsListItem.Option(
                    id = 5,
                    description = "서비스 이용약관",
                    action = 2,
                )
            )
            add(
                SettingsListItem.Option(
                    id = 6,
                    description = "개발자 문의하기",
                    action = 3,
                )
            )
            add(
                SettingsListItem.Option(
                    id = 7,
                    description = "오픈소스",
                    action = 4,
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