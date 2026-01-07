package com.jslee.core.designsystem.component.chip.filter

import androidx.compose.animation.Crossfade
import androidx.compose.foundation.background
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.jslee.core.designsystem.component.chip.internal.Chip
import com.jslee.core.designsystem.component.chip.internal.FilterChipColors
import com.jslee.core.designsystem.foundation.icons.MooBesideIconPack
import com.jslee.core.designsystem.foundation.icons.iconpack.Caretdown
import com.jslee.core.designsystem.foundation.icons.iconpack.Caretup
import com.jslee.core.designsystem.theme.MooBesideAppTheme

@Composable
fun FilterChip(
    label: String,
    onClick: () -> Unit,
    status: FilterStatus,
    selected: Boolean,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    size: FilterChipSize = FilterChipSize.Medium,
    variant: FilterChipVariant = FilterChipVariant.Solid,
    interactionSource: MutableInteractionSource? = null,
) {
    val colors: FilterChipColors = FilterChipDefaults.colors(variant)
    Chip(
        modifier = modifier.heightIn(min = FilterChipDefaults.minHeight(size)),
        colors = colors,
        onClick = onClick,
        enabled = enabled,
        border = FilterChipDefaults.borderStroke(variant, enabled, selected),
        selected = selected,
        shape = FilterChipDefaults.shape,
        interactionSource = interactionSource,
    ) {
        Row(
            modifier = Modifier.padding(FilterChipDefaults.contentPadding(size)),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Text(
                modifier = Modifier.padding(horizontal = 2.dp),
                text = label,
                style = FilterChipDefaults.labelTextStyle(size),
            )
            Spacer(modifier = Modifier.size(FilterChipDefaults.iconSpacing(size)))
            Crossfade(
                targetState = status,
                label = "FilterChipIcon"
            ) { status ->
                Icon(
                    modifier = Modifier.size(FilterChipDefaults.iconSize(size)),
                    painter = rememberVectorPainter(
                        if (status == FilterStatus.Expanded) MooBesideIconPack.Caretup
                        else MooBesideIconPack.Caretdown
                    ),
                    contentDescription = null,
                    tint = colors.iconColor(enabled, selected),
                )
            }
        }
    }
}

enum class FilterChipVariant {
    Solid,
    Outlined,
    ;
}

enum class FilterChipSize {
    XSmall,
    Small,
    Medium,
    Large,
    ;
}

enum class FilterStatus {
    Normal,
    Expanded,
    ;
}

@Preview
@Composable
private fun FilterChipPreview() {
    MooBesideAppTheme {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White)
        ) {
            var status by remember { mutableStateOf(FilterStatus.Normal) }

            FilterChip(
                label = "텍스트",
                onClick = {
                    status = if (status == FilterStatus.Normal) {
                        FilterStatus.Expanded
                    } else FilterStatus.Normal
                },
//                selected = status == FilterStatus.Expanded,
                selected = true,
                enabled = true,
                status = status,
                size = FilterChipSize.Medium,
                variant = FilterChipVariant.Solid,
            )
        }
    }
}

