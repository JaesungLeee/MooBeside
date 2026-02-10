package com.jslee.moobeside.component.navigation

import android.content.res.Configuration
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.jslee.core.designsystem.component.navigation.NavigationBar
import com.jslee.core.designsystem.component.navigation.NavigationBarItem
import com.jslee.core.designsystem.theme.MooBesideAppTheme
import com.jslee.core.designsystem.theme.MooBesideTheme
import com.jslee.core.navigation.BoxOffice
import com.jslee.core.navigation.RouteKey
import com.jslee.moobeside.navigation.TOP_LEVEL_ROUTES

@Composable
fun BottomNavigationBar(
    currentTab: RouteKey,
    onTabSelected: (RouteKey) -> Unit,
    modifier: Modifier = Modifier,
) {
    NavigationBar(
        modifier = modifier,
    ) {
        for ((key, value) in TOP_LEVEL_ROUTES) {
            NavigationBarItem(
                label = value.label,
                icon = value.icon,
                selected = currentTab == key,
                onClick = { onTabSelected(key) }
            )
        }
    }
}

@Preview(
    name = "DarkMode - BottomNavigationBarPreview",
    showSystemUi = true,
    uiMode = Configuration.UI_MODE_NIGHT_YES,
    showBackground = true
)
@Preview(
    name = "LightMode - BottomNavigationBarPreview",
    showSystemUi = true,
    uiMode = Configuration.UI_MODE_NIGHT_NO,
    showBackground = true
)
@Composable
private fun BottomNavigationBarPreview() {
    MooBesideAppTheme {
        Scaffold(
            modifier = Modifier.fillMaxSize(),
            containerColor = MooBesideTheme.colors.semantic.background.normal.normal,
            bottomBar = {
                BottomNavigationBar(
                    currentTab = BoxOffice,
                    onTabSelected = {},
                )
            },
            content = { a -> a }
        )
    }
}
