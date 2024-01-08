package com.jslee.presentation.feature.settings.model

/**
 * MooBeside
 * @author jaesung
 * @created 2024/01/08
 */
object Settings {

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
                    description = "알림설정"
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
                    description = "공지사항"
                )
            )
            add(
                SettingsListItem.Option(
                    id = 5,
                    description = "서비스 이용약관"
                )
            )
            add(
                SettingsListItem.Option(
                    id = 6,
                    description = "개발자 문의하기"
                )
            )
            add(
                SettingsListItem.Option(
                    id = 7,
                    description = "오픈소스"
                )
            )
            add(
                SettingsListItem.Option(
                    id = 8,
                    description = "버전정보"
                )
            )
        }
        return options
    }
}