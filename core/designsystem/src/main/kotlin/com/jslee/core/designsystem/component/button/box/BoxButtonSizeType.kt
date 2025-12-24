package com.jslee.core.designsystem.component.button.box

import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

enum class BoxButtonSizeType(
    val horizontalPadding: Dp,
    val verticalPadding: Dp,
) {
    ExtraLarge(16.dp, 16.dp),
    Large(16.dp, 14.dp),
    Medium(16.dp, 10.dp),
    Small(8.dp, 10.dp),
    ExtraSmall(8.dp, 7.dp)
}