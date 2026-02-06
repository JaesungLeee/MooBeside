package com.jslee.core.designsystem.component.input.checkbox.token

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.jslee.core.designsystem.foundation.color.token.ColorAccessKeyToken
import com.jslee.core.designsystem.foundation.shape.token.ShapeAccessKeyToken
import com.jslee.core.designsystem.foundation.typography.token.TypographyAccessKeyToken

internal object CheckBoxTokens {
    val CheckBoxIconContainerShape = ShapeAccessKeyToken.CornerExtraSmall
    val CheckBoxIconDescriptionGap = 8.dp
    val CheckBoxIconColor = ColorAccessKeyToken.SemanticStaticWhite
    val SmallCheckBoxIconSize = 14.dp
    val SmallCheckBoxIconContainerSize = 13.dp  // border : 1.5.dp
    val SmallCheckBoxIconPadding = 2.dp
    val SmallCheckBoxDescriptionTextStyle = TypographyAccessKeyToken.Label1NormalRegular
    val SmallCheckBoxDescriptionTextStyleBold = TypographyAccessKeyToken.Label1NormalBold
    val MediumCheckBoxIconSize = 16.dp
    val MediumCheckBoxIconContainerSize = 15.dp  // border : 1.5.dp
    val MediumCheckBoxIconPadding = 3.dp
    val MediumCheckBoxDescriptionTextStyle = TypographyAccessKeyToken.Body2NormalRegular
    val MediumCheckBoxDescriptionTextStyleBold = TypographyAccessKeyToken.Body2NormalBold
    val BorderWidth = 1.5.dp
    val UncheckedBorderColor = ColorAccessKeyToken.SemanticLineNormalNormal
    val UncheckedBackgroundColor = Color.Transparent
    val CheckedBorderColor = ColorAccessKeyToken.SemanticPrimaryNormal
    val CheckedBackgroundColor = ColorAccessKeyToken.SemanticPrimaryNormal
    val IndeterminateBorderColor = ColorAccessKeyToken.SemanticPrimaryNormal
    val IndeterminateBackgroundColor = ColorAccessKeyToken.SemanticPrimaryNormal
    val DisabledDescriptionColor = ColorAccessKeyToken.SemanticLabelDisable
}