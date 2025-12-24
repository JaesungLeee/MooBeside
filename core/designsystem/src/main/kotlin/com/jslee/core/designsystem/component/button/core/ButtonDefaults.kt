package com.jslee.core.designsystem.component.button.core

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import com.jslee.core.designsystem.token.DefaultButtonTokens
import com.jslee.core.designsystem.token.value
import com.jslee.core.designsystem.foundation.color.ColorScheme
import com.jslee.core.designsystem.theme.MooBesideTheme

internal object ButtonDefaults {
    val shape: Shape
        @Composable get() = DefaultButtonTokens.ContainerShape.value

    @Composable
    fun buttonColors(
        containerColor: Color = Color.Unspecified,
        contentColor: Color = Color.Unspecified,
        disabledContainerColor: Color = Color.Unspecified,
        disabledContentColor: Color = Color.Unspecified,
    ): ButtonColors = MooBesideTheme.colors.defaultButtonColors.copy(
        containerColor = containerColor,
        contentColor = contentColor,
        disabledContainerColor = disabledContainerColor,
        disabledContentColor = disabledContentColor,
    )

    internal val ColorScheme.defaultButtonColors: ButtonColors
        get() {
            return ButtonColors(
                containerColor = Color.White,
                contentColor = Color.Black,
                disabledContainerColor = Color.Gray,
                disabledContentColor = Color.White
            )
        }

}