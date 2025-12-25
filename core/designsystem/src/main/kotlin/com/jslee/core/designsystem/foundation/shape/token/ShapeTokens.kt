package com.jslee.core.designsystem.foundation.shape.token

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.unit.dp

internal object ShapeTokens {
    val CornerExtraLarge = RoundedCornerShape(20.dp)
    val CornerLarge = androidx.compose.foundation.shape.RoundedCornerShape(16.dp)
    val CornerMedium = androidx.compose.foundation.shape.RoundedCornerShape(12.dp)
    val CornerSmall = androidx.compose.foundation.shape.RoundedCornerShape(8.dp)
    val CornerExtraSmall = androidx.compose.foundation.shape.RoundedCornerShape(4.dp)
    val CornerFull = androidx.compose.foundation.shape.RoundedCornerShape(50)
    val CornerNone = RectangleShape
}