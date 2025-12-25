package com.jslee.core.designsystem.component.divider

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp

@Composable
fun Divider(
    modifier: Modifier = Modifier,
    variant: DividerVariant = DividerVariant.Normal,
    color: Color = DividerDefaults.color
) {
    val thickness: Dp = DividerDefaults.getThickness(variant)
    Canvas(modifier = modifier.height(thickness)) {
        drawLine(
            color = color,
            strokeWidth = thickness.toPx(),
            start = Offset(0f, thickness.toPx() / 2),
            end = Offset(size.width, thickness.toPx() / 2)
        )
    }
}

enum class DividerVariant {
    Normal,
    Thick,
    ;
}

