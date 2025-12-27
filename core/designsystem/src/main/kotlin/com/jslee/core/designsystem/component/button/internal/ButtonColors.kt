package com.jslee.core.designsystem.component.button.internal

import androidx.compose.runtime.Stable
import androidx.compose.ui.graphics.Color

internal sealed interface ButtonColors {
    @Stable
    fun containerColor(enabled: Boolean): Color

    @Stable
    fun labelColor(enabled: Boolean): Color

    @Stable
    fun iconColor(enabled: Boolean): Color
}

internal interface SolidButtonColors : ButtonColors
internal interface OutlinedButtonColors : ButtonColors {
    @Stable
    fun borderColor(enabled: Boolean): Color
}