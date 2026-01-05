package com.jslee.core.designsystem.component.chip.internal

import androidx.compose.runtime.Stable
import androidx.compose.ui.graphics.Color

internal sealed interface ChipColors {
    @Stable
    fun containerColor(enabled: Boolean, selected: Boolean): Color

    @Stable
    fun labelColor(enabled: Boolean, selected: Boolean): Color

    @Stable
    fun iconColor(enabled: Boolean, selected: Boolean): Color
}

internal interface ActionChipColors : ChipColors