package com.jslee.core.designsystem.theme

import androidx.compose.material3.ProvideTextStyle
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.ui.text.TextStyle
import com.jslee.core.designsystem.foundation.color.ColorScheme
import com.jslee.core.designsystem.foundation.color.LocalColorScheme
import com.jslee.core.designsystem.foundation.shape.LocalShapes
import com.jslee.core.designsystem.foundation.shape.Shapes

@Composable
fun MooBesideTheme(
    shapes: Shapes = MooBesideTheme.shapes,
    content: @Composable () -> Unit,
) {
    CompositionLocalProvider(
        LocalShapes provides shapes
    ) {
        ProvideTextStyle(value = TextStyle(), content = content)
    }
}

object MooBesideTheme {

    val shapes: Shapes
        @Composable
        @ReadOnlyComposable
        get() = LocalShapes.current

    // TODO : Should be update
    val colorScheme: ColorScheme
        @Composable
        @ReadOnlyComposable
        get() = LocalColorScheme.current
}