package com.jslee.core.designsystem.component.navigation.token

import androidx.compose.ui.unit.dp
import com.jslee.core.designsystem.foundation.color.token.ColorAccessKeyToken
import com.jslee.core.designsystem.foundation.shape.token.ShapeAccessKeyToken
import com.jslee.core.designsystem.foundation.typography.token.TypographyAccessKeyToken

internal object NavigationBarTokens {
    val ActiveIconColor = ColorAccessKeyToken.SemanticPrimaryNormal
    val ActiveLabelTextColor = ColorAccessKeyToken.SemanticPrimaryNormal
    val InactiveIconColor = ColorAccessKeyToken.SemanticInteractionInactive
    val InactiveLabelTextColor = ColorAccessKeyToken.SemanticInteractionInactive
    val ContainerColor = ColorAccessKeyToken.SemanticBackgroundNormalNormal
    val ContainerElevation = 3.dp
    val ContainerHeight = 56.dp
    val ContainerShape = ShapeAccessKeyToken.CornerNone
    val IconSize = 24.dp
    val LabelTextTypography = TypographyAccessKeyToken.Caption2Medium
    val DividerColor = ColorAccessKeyToken.SemanticLineNormalNeutral
    val DividerThickness = 1.dp
    val ItemContentVerticalPadding = 8.dp
    val IconLabelGap = 6.dp
}