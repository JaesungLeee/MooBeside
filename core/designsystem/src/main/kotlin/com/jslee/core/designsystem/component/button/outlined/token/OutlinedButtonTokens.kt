package com.jslee.core.designsystem.component.button.outlined.token

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.jslee.core.designsystem.foundation.color.token.ColorAccessKeyToken
import com.jslee.core.designsystem.foundation.shape.token.ShapeAccessKeyToken
import com.jslee.core.designsystem.foundation.typography.token.TypographyAccessKeyToken

internal object OutlinedButtonTokens {
    val ContainerShape = ShapeAccessKeyToken.CornerMedium
    val ContainerColor = Color.Transparent
    val ContainerDisabledColor = Color.Transparent
    val PrimaryLabelColor = ColorAccessKeyToken.SemanticPrimaryNormal
    val PrimaryDisabledLabelColor = ColorAccessKeyToken.SemanticLabelDisable
    val SecondaryLabelColor = ColorAccessKeyToken.SemanticPrimaryNormal
    val SecondaryDisabledLabelColor = ColorAccessKeyToken.SemanticLabelDisable
    val AssistiveLabelColor = ColorAccessKeyToken.SemanticLabelNormal
    val AssistiveDisabledLabelColor = ColorAccessKeyToken.SemanticLabelDisable
    val PrimaryIconColor = ColorAccessKeyToken.SemanticPrimaryNormal
    val PrimaryDisabledIconColor = ColorAccessKeyToken.SemanticLabelDisable
    val SecondaryIconColor = ColorAccessKeyToken.SemanticPrimaryNormal
    val SecondaryDisabledIconColor = ColorAccessKeyToken.SemanticLabelDisable
    val AssistiveIconColor = ColorAccessKeyToken.SemanticLabelNormal
    val AssistiveDisabledIconColor = ColorAccessKeyToken.SemanticLabelDisable
    val PrimaryBorderColor = ColorAccessKeyToken.SemanticPrimaryNormal
    val PrimaryDisabledBorderColor = ColorAccessKeyToken.SemanticLineNormalNeutral
    val SecondaryBorderColor = ColorAccessKeyToken.SemanticLineNormalNeutral
    val SecondaryDisabledBorderColor = ColorAccessKeyToken.SemanticLineNormalNeutral
    val AssistiveBorderColor = ColorAccessKeyToken.SemanticLineNormalNeutral
    val AssistiveDisabledBorderColor = ColorAccessKeyToken.SemanticLineNormalNeutral
    val LargeContainerHeight = 48.dp
    val LargeContainerHorizontalPadding = 28.dp
    val LargeContainerVerticalPadding = 12.dp
    val MediumContainerHeight = 40.dp
    val MediumContainerHorizontalPadding = 20.dp
    val MediumContainerVerticalPadding = 9.dp
    val SmallContainerHeight = 32.dp
    val SmallContainerHorizontalPadding = 14.dp
    val SmallContainerVerticalPadding = 7.dp
    val BorderWidth = 1.dp
    val SmallIconSize = 16.dp
    val MediumIconSize = 18.dp
    val LargeIconSize = 20.dp
    val DefaultLabelTextStyle = TypographyAccessKeyToken.Body1NormalBold
    val AssistiveLabelTextStyle = TypographyAccessKeyToken.Body1NormalMedium
    val IconSpacing = 8.dp
    val IconButtonContainerShape = ShapeAccessKeyToken.CornerSmall
    val SmallIconContainerPadding = 7.dp
    val MediumIconContainerPadding = 10.dp
    val LargeIconContainerPadding = 12.dp
}