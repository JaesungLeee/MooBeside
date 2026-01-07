package com.jslee.core.designsystem.component.button.solid

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.res.vectorResource
import com.jslee.core.designsystem.component.button.internal.Button
import com.jslee.core.designsystem.component.button.internal.ButtonColors
import com.jslee.core.designsystem.component.button.internal.SolidButtonColors
import com.jslee.core.designsystem.component.button.solid.internal.SolidButtonDefaults

@Composable
fun SolidButton(
    label: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    variant: SolidButtonVariant = SolidButtonVariant.Primary,
    size: SolidButtonSize = SolidButtonSize.Large,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource? = null,
    leadingIcon: Int? = null,
    trailingIcon: Int? = null,
) {
    val colors: SolidButtonColors = SolidButtonDefaults.colors(variant)
    Button(
        modifier = modifier
            .heightIn(min = SolidButtonDefaults.minHeight(size)),
        shape = SolidButtonDefaults.shape,
        colors = colors,
        onClick = onClick,
        enabled = enabled,
        interactionSource = interactionSource,
    ) {
        Row(
            modifier = Modifier.padding(SolidButtonDefaults.contentPadding(size)),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,
        ) {
            leadingIcon?.let { iconVector ->
                Icon(
                    modifier = Modifier.size(SolidButtonDefaults.iconSize(size)),
                    painter = rememberVectorPainter(ImageVector.vectorResource(id = iconVector)),
                    contentDescription = null,
                    tint = colors.iconColor(enabled),
                )
                Spacer(modifier = Modifier.size(SolidButtonDefaults.iconSpacing))
            }
            Text(
                modifier = Modifier,
                text = label,
                style = SolidButtonDefaults.labelTextStyle(variant),
            )
            trailingIcon?.let { iconVector ->
                Spacer(modifier = Modifier.size(SolidButtonDefaults.iconSpacing))
                Icon(
                    modifier = Modifier.size(SolidButtonDefaults.iconSize(size)),
                    painter = rememberVectorPainter(ImageVector.vectorResource(id = iconVector)),
                    contentDescription = null,
                    tint = colors.iconColor(enabled),
                )
            }
        }
    }
}

@Composable
fun SolidIconButton(
    icon: ImageVector,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    variant: SolidButtonVariant = SolidButtonVariant.Primary,
    size: SolidButtonSize = SolidButtonSize.Large,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource? = null,
) {
    val colors: ButtonColors = SolidButtonDefaults.colors(variant)
    Button(
        modifier = modifier.size(SolidButtonDefaults.minHeight(size)),
        shape = SolidButtonDefaults.iconButtonShape,
        colors = colors,
        onClick = onClick,
        enabled = enabled,
        interactionSource = interactionSource,
    ) {
        Icon(
            modifier = Modifier
                .padding(SolidButtonDefaults.iconButtonContentPadding(size))
                .size(SolidButtonDefaults.iconSize(size)),
            painter = rememberVectorPainter(icon),
            contentDescription = null,
            tint = colors.iconColor(enabled),
        )
    }
}

enum class SolidButtonVariant {
    Primary,
    Assistive,
}

enum class SolidButtonSize {
    Small,
    Medium,
    Large,
}
