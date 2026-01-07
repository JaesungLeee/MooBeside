package com.jslee.core.designsystem.component.chip.action

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
import com.jslee.core.designsystem.component.chip.action.internal.ActionChipDefaults
import com.jslee.core.designsystem.component.chip.internal.ActionChipColors
import com.jslee.core.designsystem.component.chip.internal.Chip

@Composable
fun ActionChip(
    label: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    size: ActionChipSize = ActionChipSize.Medium,
    variant: ActionChipVariant = ActionChipVariant.Solid,
    selected: Boolean = false,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource? = null,
    leadingIcon: ImageVector? = null,
    trailingIcon: ImageVector? = null,
) {
    val colors: ActionChipColors = ActionChipDefaults.colors(variant)
    Chip(
        modifier = modifier.heightIn(min = ActionChipDefaults.minHeight(size)),
        colors = colors,
        onClick = onClick,
        enabled = enabled,
        border = ActionChipDefaults.borderStroke(variant, enabled, selected),
        selected = selected,
        shape = ActionChipDefaults.shape,
        interactionSource = interactionSource,
    ) {
        Row(
            modifier = Modifier.padding(ActionChipDefaults.contentPadding(size)),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,
        ) {
            leadingIcon?.let { iconVector ->
                Icon(
                    modifier = Modifier.size(ActionChipDefaults.iconSize(size)),
                    painter = rememberVectorPainter(iconVector),
                    contentDescription = null,
                    tint = colors.iconColor(enabled, selected),
                )
                Spacer(modifier = Modifier.size(ActionChipDefaults.iconSpacing(size)))
            }
            Text(
                modifier = Modifier,
                text = label,
                style = ActionChipDefaults.labelTextStyle(size),
            )
            trailingIcon?.let { iconVector ->
                Spacer(modifier = Modifier.size(ActionChipDefaults.iconSpacing(size)))
                Icon(
                    modifier = Modifier.size(ActionChipDefaults.iconSize(size)),
                    painter = rememberVectorPainter(iconVector),
                    contentDescription = null,
                    tint = colors.iconColor(enabled, selected),
                )
            }
        }
    }
}

enum class ActionChipVariant {
    Solid,
    Outlined,
    ;
}

enum class ActionChipSize {
    XSmall,
    Small,
    Medium,
    Large,
    ;
}