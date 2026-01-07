package com.jslee.core.designsystem.component.chip.action.token

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.jslee.core.designsystem.foundation.color.token.AtomicColorToken
import com.jslee.core.designsystem.foundation.color.token.ColorAccessKeyToken
import com.jslee.core.designsystem.foundation.shape.token.ShapeAccessKeyToken
import com.jslee.core.designsystem.foundation.typography.token.TypographyAccessKeyToken

internal object ActionChipTokens {
    val ContainerShape = ShapeAccessKeyToken.CornerExtraSmall
    val SolidDisabledContainerColor = ColorAccessKeyToken.SemanticInteractionDisable
    val SolidDisabledLabelColor = ColorAccessKeyToken.SemanticLabelDisable
    val SolidDisabledIconColor = ColorAccessKeyToken.SemanticLabelDisable
    val SolidNormalContainerColor = ColorAccessKeyToken.ComponentFillAlternative
    val SolidNormalLabelColor = ColorAccessKeyToken.SemanticLabelAlternative
    val SolidNormalIconColor = ColorAccessKeyToken.SemanticLabelAlternative
    val SolidNormalSelectedContainerColor = ColorAccessKeyToken.SemanticLabelStrong
    val SolidNormalSelectedLabelColor = ColorAccessKeyToken.SemanticInverseLabel
    val SolidNormalSelectedIconColor = ColorAccessKeyToken.SemanticInverseLabel
    val BorderWidth = 1.dp
    val OutlinedDisabledBorderColor = ColorAccessKeyToken.SemanticLineNormalNeutral
    val OutlinedDisabledContainerColor = Color.Transparent
    val OutlinedDisabledLabelColor = ColorAccessKeyToken.SemanticLabelDisable
    val OutlinedDisabledIconColor = ColorAccessKeyToken.SemanticLabelDisable
    val OutlinedNormalBorderColor = ColorAccessKeyToken.SemanticLineNormalNeutral
    val OutlinedNormalContainerColor = Color.Transparent
    val OutlinedNormalLabelColor = ColorAccessKeyToken.SemanticLabelAlternative
    val OutlinedNormalIconColor = ColorAccessKeyToken.SemanticLabelAlternative
    val OutlinedNormalSelectedBorderColor = ColorAccessKeyToken.SemanticPrimaryNormal  // opacity 0.43
    val OutlinedNormalSelectedBorderOpacity = AtomicColorToken.Opacity43
    val OutlinedNormalSelectedContainerColor = ColorAccessKeyToken.SemanticPrimaryNormal  // opacity 0.05
    val OutlinedNormalSelectedContainerOpacity = AtomicColorToken.Opacity5
    val OutlinedNormalSelectedLabelColor = ColorAccessKeyToken.SemanticPrimaryNormal
    val OutlinedNormalSelectedIconColor = ColorAccessKeyToken.SemanticPrimaryNormal
    val XSmallContainerHeight = 24.dp
    val XSmallContainerHorizontalPadding = 7.dp
    val XSmallContainerVerticalPadding = 4.dp
    val XSmallLabelTextStyle = TypographyAccessKeyToken.Caption1Medium
    val XSmallIconSize = 12.dp
    val XSmallIconSpacing = 2.dp
    val SmallContainerHeight = 32.dp
    val SmallContainerHorizontalPadding = 8.dp
    val SmallContainerVerticalPadding = 6.dp
    val SmallLabelTextStyle = TypographyAccessKeyToken.Label1NormalMedium
    val SmallIconSize = 14.dp
    val SmallIconSpacing = 2.dp
    val MediumContainerHeight = 36.dp
    val MediumContainerHorizontalPadding = 11.dp
    val MediumContainerVerticalPadding = 7.dp
    val MediumLabelTextStyle = TypographyAccessKeyToken.Body2NormalMedium
    val MediumIconSize = 14.dp
    val MediumIconSpacing = 3.dp
    val LargeContainerHeight = 40.dp
    val LargeContainerHorizontalPadding = 12.dp
    val LargeContainerVerticalPadding = 9.dp
    val LargeLabelTextStyle = TypographyAccessKeyToken.Body2NormalMedium
    val LargeIconSize = 16.dp
    val LargeIconSpacing = 3.dp
}