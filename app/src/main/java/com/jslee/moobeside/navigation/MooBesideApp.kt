package com.jslee.moobeside.navigation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.navigation3.runtime.entryProvider
import com.jslee.core.designsystem.theme.MooBesideTheme
import com.jslee.core.navigation.MooBesideNavDisplay
import com.jslee.core.navigation.Navigator
import com.jslee.core.navigation.rememberNavigationState
import com.jslee.core.navigation.toDecoratedEntries
import com.jslee.moobeside.component.navigation.BottomNavigationBar
import com.moobeside.feature.bookmark.navigation.bookmarkEntry
import com.moobeside.feature.boxoffice.navigation.boxOfficeEntry
import com.moobeside.feature.showing.navigation.Showing
import com.moobeside.feature.showing.navigation.showingEntry

@Composable
fun MooBesideApp(
    modifier: Modifier = Modifier,
) {
    val navigationState = rememberNavigationState(
        startRoute = Showing,
        topLevelRoutes = TOP_LEVEL_ROUTES.keys,
    )

    val navigator = remember { Navigator(navigationState) }
    val entryProvider = entryProvider {
        boxOfficeEntry()
        showingEntry()
        bookmarkEntry()
    }

    Scaffold(
        modifier = modifier.fillMaxSize(),
        containerColor = MooBesideTheme.colors.semantic.background.normal.normal,
        bottomBar = {
            BottomNavigationBar(
                currentTab = navigationState.currentTopLevelRoute,
                onTabSelected = { key -> navigator.navigate(key) },
            )
        }
    ) {
        MooBesideNavDisplay(
            modifier = Modifier
                .fillMaxSize()
                .padding(it),
            onBack = navigator::navigateBack,
            entries = navigationState.toDecoratedEntries(entryProvider),
        )
    }
}