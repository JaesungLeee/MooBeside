package com.jslee.core.designsystem.component.navigation

import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.WindowInsetsSides
import androidx.compose.foundation.layout.only
import androidx.compose.foundation.layout.systemBars
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import com.jslee.core.designsystem.component.navigation.token.NavigationBarTokens
import com.jslee.core.designsystem.foundation.color.value
import com.jslee.core.designsystem.foundation.shape.token.value
import com.jslee.core.designsystem.foundation.typography.value

internal object NavigationBarDefaults {
    val Elevation: Dp = NavigationBarTokens.ContainerElevation
    val IconLabelGap: Dp = NavigationBarTokens.IconLabelGap
    val contentVerticalPadding: Dp = NavigationBarTokens.ItemContentVerticalPadding
    val DividerThickness: Dp = NavigationBarTokens.DividerThickness

    val containerColor: Color
        @Composable
        get() = NavigationBarTokens.ContainerColor.value

    val containerShape: Shape
        @Composable
        get() = NavigationBarTokens.ContainerShape.value

    val containerHeight: Dp
        @Composable
        get() = NavigationBarTokens.ContainerHeight

    val iconSize: Dp
        @Composable
        get() = NavigationBarTokens.IconSize

    val dividerColor: Color
        @Composable
        get() = NavigationBarTokens.DividerColor.value

    val windowInsets: WindowInsets
        @Composable
        get() =
            WindowInsets.systemBars.only(
                WindowInsetsSides.Horizontal + WindowInsetsSides.Bottom
            )

    @Composable
    fun colors(
        selectedIconColor: Color = NavigationBarTokens.ActiveIconColor.value,
        selectedLabelColor: Color = NavigationBarTokens.ActiveLabelTextColor.value,
        unselectedIconColor: Color = NavigationBarTokens.InactiveIconColor.value,
        unselectedLabelColor: Color = NavigationBarTokens.InactiveLabelTextColor.value,
    ): NavigationBarItemColors = NavigationBarItemColors(
        selectedIconColor = selectedIconColor,
        unselectedIconColor = unselectedIconColor,
        selectedLabelColor = selectedLabelColor,
        unselectedLabelColor = unselectedLabelColor,
    )

    @Composable
    fun labelTextStyle(): TextStyle {
        return NavigationBarTokens.LabelTextTypography.value
    }
}