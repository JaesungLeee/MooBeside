package com.jslee.core.designsystem.component.button.box

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.RowScope
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.jslee.core.designsystem.component.button.core.Button
import com.jslee.core.designsystem.component.button.core.ButtonColors
import com.jslee.core.designsystem.component.button.core.ButtonDefaults
import com.jslee.core.designsystem.component.button.core.ButtonDefaults.defaultButtonColors
import com.jslee.core.designsystem.theme.MooBesideTheme

@Composable
internal fun MooBesideBoxButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    boxButtonSizeType: BoxButtonSizeType,
    boxButtonColorType: ButtonColors = ButtonColors(
        containerColor = MooBesideTheme.colors.defaultButtonColors.containerColor,
        contentColor = Color.Black,
        disabledContainerColor = Color.Gray,
        disabledContentColor = Color.Black
    ),
    interactionSource: MutableInteractionSource? = null,
    content: @Composable RowScope.() -> Unit,
) = Button(
    modifier = modifier,
    onClick = onClick,
    contentPadding = PaddingValues(
        horizontal = boxButtonSizeType.horizontalPadding,
        vertical = boxButtonSizeType.verticalPadding
    ),
    enabled = enabled,
    shape = ButtonDefaults.shape,
    colors = boxButtonColorType,
    border = null,
    interactionSource = interactionSource,
    content = content,
)


@Preview
@Composable
private fun MooBesideBoxButtonPreview() {
    MooBesideBoxButton(
        boxButtonSizeType = BoxButtonSizeType.Small,
        onClick = { /*TODO*/ }
    ) {
        Text(text = "BUTTON")
    }
}
