package com.jslee.core.designsystem.foundation.shape.token

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.unit.dp

internal object ShapeTokens {
    val CornerExtraLarge = RoundedCornerShape(20.dp)
    val CornerLarge = RoundedCornerShape(16.dp)
    val CornerMedium = RoundedCornerShape(12.dp)
    val CornerSmall = RoundedCornerShape(8.dp)
    val CornerExtraSmall = RoundedCornerShape(4.dp)
    val CornerFull = RoundedCornerShape(50)
    val CornerNone = RectangleShape
}