package com.jslee.core.designsystem.component.chip.internal

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.LocalMinimumInteractiveComponentSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.role
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.unit.Dp

@Composable
internal fun Chip(
    selected: Boolean,
    shape: Shape,
    colors: ChipColors,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    border: BorderStroke? = null,
    interactionSource: MutableInteractionSource? = null,
    content: @Composable () -> Unit,
) {
    val interactionSource: MutableInteractionSource =
        interactionSource ?: remember { MutableInteractionSource() }

    // Material에서 기본적으로 지원되는 48x48 권장 크기를 disable 하는 옵션
    // @see https://cs.android.com/androidx/platform/frameworks/support/+/androidx-main:compose/material3/material3/src/commonMain/kotlin/androidx/compose/material3/Surface.kt;drc=c3ba9dfaf0032eac456715234459f111c7fb2b4c;l=221
    CompositionLocalProvider(
        LocalMinimumInteractiveComponentSize providesDefault Dp.Unspecified,
    ) {
        Surface(
            modifier = modifier.semantics { role = Role.Checkbox },
            onClick = onClick,
            enabled = enabled,
            shape = shape,
            color = colors.containerColor(enabled, selected),
            border = border,
            interactionSource = interactionSource,
        ) {
            CompositionLocalProvider(
                LocalContentColor provides colors.labelColor(enabled, selected),
            ) {
                content()
            }
        }
    }
}