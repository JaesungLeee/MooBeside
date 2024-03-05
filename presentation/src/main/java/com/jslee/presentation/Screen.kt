package com.jslee.presentation

/**
 * MooBeside
 * @author jaesung
 * @created 2024/03/05
 */
enum class Screen(val label: String, val isNavigationBarVisible: Boolean) {
    HOME("HomeScreen", true),
    BOX_OFFICE("BoxOfficeScreen", true),
    BOOKMARK("BookmarkScreen", true),
    UP_COMING("UpComingScreen", false),
    NOW_PLAYING("NowPlayingScreen", false),
    MOVIE_DETAIL("MovieDetailScreen", false),
    CAST("CastScreen", false),
    CAST_DETAIL("CastDetailScreen", false),
    SEARCH("SearchScreen", false),
    SETTINGS("SettingsScreen", false),
    SETTINGS_DETAIL("SettingsDetailScreen", false),
    SETTINGS_WEB_VIEW("SettingsWebViewScreen", false);

    companion object {
        fun getNavigationBarVisibility(screen: Screen): Boolean {
            return when (screen) {
                HOME -> HOME.isNavigationBarVisible
                BOX_OFFICE -> BOX_OFFICE.isNavigationBarVisible
                BOOKMARK -> BOOKMARK.isNavigationBarVisible
                UP_COMING -> UP_COMING.isNavigationBarVisible
                NOW_PLAYING -> NOW_PLAYING.isNavigationBarVisible
                MOVIE_DETAIL -> MOVIE_DETAIL.isNavigationBarVisible
                CAST -> CAST.isNavigationBarVisible
                CAST_DETAIL -> CAST_DETAIL.isNavigationBarVisible
                SEARCH -> SEARCH.isNavigationBarVisible
                SETTINGS -> SETTINGS.isNavigationBarVisible
                SETTINGS_DETAIL -> SETTINGS_DETAIL.isNavigationBarVisible
                SETTINGS_WEB_VIEW -> SETTINGS_WEB_VIEW.isNavigationBarVisible
            }
        }

        fun fromLabel(label: String): Screen? {
            return when (label) {
                HOME.label -> HOME
                BOX_OFFICE.label -> BOX_OFFICE
                BOOKMARK.label -> BOOKMARK
                UP_COMING.label -> UP_COMING
                NOW_PLAYING.label -> NOW_PLAYING
                MOVIE_DETAIL.label -> MOVIE_DETAIL
                CAST.label -> CAST
                CAST_DETAIL.label -> CAST_DETAIL
                SEARCH.label -> SEARCH
                SETTINGS.label -> SETTINGS
                SETTINGS_DETAIL.label -> SETTINGS_DETAIL
                SETTINGS_WEB_VIEW.label -> SETTINGS_WEB_VIEW
                else -> null
            }
        }
    }
}