package com.jslee.core.designsystem.foundation.color

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf

@Immutable
class ColorScheme() {
}

fun lightColorScheme() = ColorScheme()

internal val LocalColorScheme = staticCompositionLocalOf { lightColorScheme() }