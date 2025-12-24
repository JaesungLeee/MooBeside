package com.jslee.core.designsystem.token

import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.ui.graphics.Shape
import com.jslee.core.designsystem.foundation.shape.fromToken
import com.jslee.core.designsystem.theme.MooBesideTheme

internal enum class ShapeTokenKey {
    CornerExtraLarge,
    CornerLarge,
    CornerMedium,
    CornerSmall,
    CornerExtraSmall,
    CornerFull,
    CornerNone,
}

internal val ShapeTokenKey.value: Shape
    @Composable
    @ReadOnlyComposable
    get() = MooBesideTheme.shapes.fromToken(this)