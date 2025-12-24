package com.jslee.core.designsystem.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.ProvideTextStyle
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.ui.text.TextStyle
import com.jslee.core.designsystem.foundation.color.ColorScheme
import com.jslee.core.designsystem.foundation.color.LocalColorScheme
import com.jslee.core.designsystem.foundation.color.darkColorScheme
import com.jslee.core.designsystem.foundation.color.lightColorScheme
import com.jslee.core.designsystem.foundation.shape.LocalShapes
import com.jslee.core.designsystem.foundation.shape.Shapes

@Composable
fun MooBesideAppTheme(
    content: @Composable () -> Unit,
) {
    val colorScheme: ColorScheme = provideColorScheme()
    MooBesideTheme(
        colors = colorScheme,
        content = content,
    )
}

@Composable
private fun MooBesideTheme(
    colors: ColorScheme = MooBesideTheme.colors,
    shapes: Shapes = MooBesideTheme.shapes,
    content: @Composable () -> Unit,
) {
    CompositionLocalProvider(
        LocalColorScheme provides colors,
        LocalShapes provides shapes
    ) {
        ProvideTextStyle(value = TextStyle(), content = content)
    }
}

object MooBesideTheme {
    // TODO : Should be update
    val colors: ColorScheme
        @Composable
        @ReadOnlyComposable
        get() = LocalColorScheme.current

    val shapes: Shapes
        @Composable
        @ReadOnlyComposable
        get() = LocalShapes.current
}


@Composable
private fun provideColorScheme(): ColorScheme {
    return when {
        isSystemInDarkTheme() -> darkColorScheme()
        else -> lightColorScheme()
    }
}