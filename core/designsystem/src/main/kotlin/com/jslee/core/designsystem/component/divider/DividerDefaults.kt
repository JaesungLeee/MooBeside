package com.jslee.core.designsystem.component.divider

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import com.jslee.core.designsystem.foundation.color.value
import com.jslee.core.designsystem.token.DividerToken

internal object DividerDefaults {
    val color: Color
        @Composable
        get() = DividerToken.DividerColor.value

    fun getThickness(variant: DividerVariant): Dp {
        return when (variant) {
            DividerVariant.Normal -> DividerToken.NormalThickness
            DividerVariant.Thick -> DividerToken.ThickThickness
        }
    }
}
