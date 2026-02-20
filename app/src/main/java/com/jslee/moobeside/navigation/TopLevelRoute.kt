package com.jslee.moobeside.navigation

import androidx.compose.ui.graphics.vector.ImageVector
import com.jslee.core.designsystem.foundation.icons.MooBesideIconPack
import com.jslee.core.designsystem.foundation.icons.iconpack.Bookmark
import com.jslee.core.designsystem.foundation.icons.iconpack.Crown
import com.jslee.core.designsystem.foundation.icons.iconpack.Ticket
import com.moobeside.feature.bookmark.navigation.BookMark
import com.moobeside.feature.boxoffice.navigation.BoxOffice
import com.moobeside.feature.showing.navigation.Showing

val TOP_LEVEL_ROUTES = mapOf(
    BoxOffice to NavigationBarItem(label = "박스오피스", icon = MooBesideIconPack.Crown),
    Showing to NavigationBarItem(label = "상영정보", icon = MooBesideIconPack.Ticket),
    BookMark to NavigationBarItem(label = "즐겨찾기", icon = MooBesideIconPack.Bookmark)
)

data class NavigationBarItem(
    val label: String,
    val icon: ImageVector,
)