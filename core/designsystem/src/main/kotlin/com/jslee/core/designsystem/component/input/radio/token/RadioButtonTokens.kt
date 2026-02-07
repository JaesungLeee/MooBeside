package com.jslee.core.designsystem.component.input.radio.token

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.jslee.core.designsystem.foundation.color.token.ColorAccessKeyToken
import com.jslee.core.designsystem.foundation.shape.token.ShapeAccessKeyToken
import com.jslee.core.designsystem.foundation.typography.token.TypographyAccessKeyToken

internal object RadioButtonTokens {
    val RadioButtonIconContainerShape = ShapeAccessKeyToken.CornerFull
    val RadioButtonIconContainerGap = 8.dp
    val RadioButtonIconColor = ColorAccessKeyToken.SemanticStaticWhite
    val SmallRadioButtonIconSize = 14.dp
    val SmallRadioButtonIconContainerSize = 13.dp  // border = 1.5.dp
    val SmallRadioButtonDescriptionTextStyle = TypographyAccessKeyToken.Label1NormalRegular
    val MediumRadioButtonIconSize = 16.dp
    val MediumRadioButtonIconContainerSize = 15.dp  // border = 1.5.dp
    val MediumRadioButtonDescriptionTextStyle = TypographyAccessKeyToken.Body2NormalRegular
    val BorderWidth = 1.5.dp
    val UncheckedBorderColor = ColorAccessKeyToken.SemanticLineNormalNormal
    val UncheckedBackgroundColor = Color.Transparent
    val CheckedBorderColor = ColorAccessKeyToken.SemanticPrimaryNormal
    val CheckedBackgroundColor = ColorAccessKeyToken.SemanticPrimaryNormal
    val DisabledDescriptionColor = ColorAccessKeyToken.SemanticLabelDisable
}