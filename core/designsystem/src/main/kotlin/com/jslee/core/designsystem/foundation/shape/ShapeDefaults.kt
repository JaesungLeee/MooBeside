package com.jslee.core.designsystem.foundation.shape

import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.ui.graphics.Shape
import com.jslee.core.designsystem.foundation.shape.token.ShapeTokens

object ShapeDefaults {
    val ExtraSmall: CornerBasedShape = ShapeTokens.CornerExtraSmall
    val Small: CornerBasedShape = ShapeTokens.CornerSmall
    val Medium: CornerBasedShape = ShapeTokens.CornerMedium
    val Large: CornerBasedShape = ShapeTokens.CornerLarge
    val ExtraLarge: CornerBasedShape = ShapeTokens.CornerExtraLarge
    val Full: CornerBasedShape = ShapeTokens.CornerFull
    val None: Shape = ShapeTokens.CornerNone
}