package com.jslee.presentation.feature.settings.model.navigation

/**
 * MooBeside
 * @author jaesung
 * @created 2024/01/08
 */
enum class NavigationType(private val description: String) {
    NOTIFICATION("알림설정"),
    NOTICE("공지사항"),
    TERMS_OF_SERVICE("서비스 이용약관"),
    CONTACT("개발자 문의하기"),
    OPEN_SOURCE("오픈소스");

    companion object {
        fun getDescription(navType: NavigationType): String {
            return when (navType) {
                NOTIFICATION -> NOTIFICATION.description
                NOTICE -> NOTICE.description
                TERMS_OF_SERVICE -> TERMS_OF_SERVICE.description
                CONTACT -> CONTACT.description
                OPEN_SOURCE -> OPEN_SOURCE.description
            }
        }
    }
}