package com.jslee.presentation

import androidx.annotation.LayoutRes

/**
 * MooBeside
 * @author jaesung
 * @created 2024/03/05
 */
enum class Screen(@LayoutRes layoutId: Int, isNavigationBarVisible: Boolean) {
    HOME(R.layout.fragment_home, true),
    BOX_OFFICE(R.layout.fragment_box_office, true),
    BOOKMARK(R.layout.fragment_bookmark, true),
    UP_COMING(R.layout.fragment_up_coming, false),
    NOW_PLAYING(R.layout.fragment_now_playing, false),
    MOVIE_DETAIL(R.layout.fragment_movie_detail, false),
    CAST(R.layout.fragment_cast, false),
    CAST_DETAIL(R.layout.fragment_cast_detail, false),
    SEARCH(R.layout.fragment_search, false),
    SETTINGS(R.layout.fragment_settings, false),
    SETTINGS_DETAIL(R.layout.fragment_settings_detail, false),
    SETTINGS_WEB_VIEW(R.layout.fragment_settings_web_view, false),
    SHARE_BOTTOM_SHEET(R.layout.dialog_share_bottom_sheet, false),
    FILTER_BOTTOM_SHEET(R.layout.dialog_filter_bottom_sheet, false);
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
}