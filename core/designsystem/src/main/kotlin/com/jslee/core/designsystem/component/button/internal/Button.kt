package com.jslee.core.designsystem.component.button.internal


import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.LocalMinimumInteractiveComponentSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.role
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
internal fun Button(
    shape: Shape,
    colors: ButtonColors,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    border: BorderStroke? = null,
    interactionSource: MutableInteractionSource? = null,
    content: @Composable () -> Unit,
) {
    val interactionSource: MutableInteractionSource =
        interactionSource ?: remember { MutableInteractionSource() }
    val containerColor: Color = colors.containerColor(enabled)
    val contentColor: Color = colors.labelColor(enabled)

    // Material에서 기본적으로 지원되는 48x48 권장 크기를 disable 하는 옵션
    // @see https://cs.android.com/androidx/platform/frameworks/support/+/androidx-main:compose/material3/material3/src/commonMain/kotlin/androidx/compose/material3/Surface.kt;drc=c3ba9dfaf0032eac456715234459f111c7fb2b4c;l=221
    CompositionLocalProvider(
        LocalMinimumInteractiveComponentSize providesDefault Dp.Unspecified,
    ) {
        Surface(
            onClick = onClick,
            modifier = modifier.semantics { role = Role.Button },
            enabled = enabled,
            shape = shape,
            color = containerColor,
            shadowElevation = 0.dp,
            border = border,
            interactionSource = interactionSource,
        ) {
            CompositionLocalProvider(
                LocalContentColor provides contentColor
            ) {
                content()
            }
        }
    }
}
