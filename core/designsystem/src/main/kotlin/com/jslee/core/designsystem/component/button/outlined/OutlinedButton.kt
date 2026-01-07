package com.jslee.core.designsystem.component.button.outlined

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
import com.jslee.core.designsystem.component.button.internal.OutlinedButtonColors
import com.jslee.core.designsystem.component.button.outlined.internal.OutlinedButtonDefaults

@Composable
fun OutlinedButton(
    label: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    variant: OutlinedButtonVariant = OutlinedButtonVariant.Primary,
    size: OutlinedButtonSize = OutlinedButtonSize.Large,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource? = null,
    leadingIcon: Int? = null,
    trailingIcon: Int? = null,
) {
    val colors: OutlinedButtonColors = OutlinedButtonDefaults.colors(variant)
    Button(
        modifier = modifier.heightIn(min = OutlinedButtonDefaults.minHeight(size)),
        shape = OutlinedButtonDefaults.shape,
        colors = colors,
        onClick = onClick,
        enabled = enabled,
        border = OutlinedButtonDefaults.borderStroke(variant, enabled),
        interactionSource = interactionSource,
    ) {
        Row(
            modifier = Modifier.padding(OutlinedButtonDefaults.contentPadding(size)),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,
        ) {
            leadingIcon?.let { iconVector ->
                Icon(
                    modifier = Modifier.size(OutlinedButtonDefaults.iconSize(size)),
                    painter = rememberVectorPainter(ImageVector.vectorResource(id = iconVector)),
                    contentDescription = null,
                    tint = colors.iconColor(enabled),
                )
                Spacer(modifier = Modifier.size(OutlinedButtonDefaults.iconSpacing))
            }
            Text(
                modifier = Modifier,
                text = label,
                style = OutlinedButtonDefaults.labelTextStyle(variant),
            )
            trailingIcon?.let { iconVector ->
                Spacer(modifier = Modifier.size(OutlinedButtonDefaults.iconSpacing))
                Icon(
                    modifier = Modifier.size(OutlinedButtonDefaults.iconSize(size)),
                    painter = rememberVectorPainter(ImageVector.vectorResource(id = iconVector)),
                    contentDescription = null,
                    tint = colors.iconColor(enabled),
                )
            }
        }
    }
}

@Composable
fun OutlinedIconButton(
    icon: ImageVector,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    variant: OutlinedButtonVariant = OutlinedButtonVariant.Primary,
    size: OutlinedButtonSize = OutlinedButtonSize.Large,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource? = null,
) {
    val colors: ButtonColors = OutlinedButtonDefaults.colors(variant)
    Button(
        modifier = modifier.size(OutlinedButtonDefaults.minHeight(size)),
        shape = OutlinedButtonDefaults.iconButtonShape,
        colors = colors,
        onClick = onClick,
        border = OutlinedButtonDefaults.borderStroke(variant, enabled),
        enabled = enabled,
        interactionSource = interactionSource,
    ) {
        Icon(
            modifier = Modifier
                .padding(OutlinedButtonDefaults.iconButtonContentPadding(size))
                .size(OutlinedButtonDefaults.iconSize(size)),
            painter = rememberVectorPainter(icon),
            contentDescription = null,
            tint = colors.iconColor(enabled),
        )
    }
}

enum class OutlinedButtonVariant {
    Primary,
    Secondary,
    Assistive,
    ;
}

enum class OutlinedButtonSize {
    Large,
    Medium,
    Small,
    ;
}