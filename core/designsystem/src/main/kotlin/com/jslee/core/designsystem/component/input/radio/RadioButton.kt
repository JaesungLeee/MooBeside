package com.jslee.core.designsystem.component.input.radio

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import com.jslee.core.designsystem.foundation.icons.MooBesideIconPack
import com.jslee.core.designsystem.foundation.icons.iconpack.Dot
import com.jslee.core.designsystem.theme.MooBesideAppTheme
import com.jslee.core.designsystem.util.extension.singleClickable

@Composable
fun RadioButton(
    label: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    size: RadioButtonSize = RadioButtonSize.Medium,
    status: RadioButtonStatus = RadioButtonStatus.Unchecked,
    enabled: Boolean = true,
) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(RadioButtonDefaults.iconDescriptionGap)
    ) {
        RadioButtonIconContent(
            modifier = Modifier.padding(RadioButtonDefaults.radioButtonPadding),
            status = status,
            size = size,
            onClick = onClick,
            enabled = enabled,
        )
        Text(
            text = label,
            style = RadioButtonDefaults.labelTextStyle(size, enabled),
            maxLines = 2,
            overflow = TextOverflow.Ellipsis,
        )
    }
}

@Composable
private fun RadioButtonIconContent(
    status: RadioButtonStatus,
    size: RadioButtonSize,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
) {
    Box(
        modifier = modifier
            .size(RadioButtonDefaults.containerSize(size))
            .clip(RadioButtonDefaults.shape)
            .singleClickable(
                enabled = enabled,
                onClick = onClick,
            )
            .border(RadioButtonDefaults.borderStroke(status), RadioButtonDefaults.shape)
            .background(RadioButtonDefaults.backgroundColor(status)),
        contentAlignment = Alignment.Center,
    ) {
        when (status) {
            RadioButtonStatus.Checked -> {
                Icon(
                    modifier = Modifier.size(RadioButtonDefaults.iconSize(size)),
                    painter = rememberVectorPainter(MooBesideIconPack.Dot),
                    tint = RadioButtonDefaults.iconColor,
                    contentDescription = null,
                )
            }

            else -> {}
        }
    }
}

@Preview
@Composable
private fun RadioButtonPreview() {
    var selectedOption by remember { mutableIntStateOf(0) }

    MooBesideAppTheme {
        Column(modifier = Modifier.background(color = Color.White)) {
            RadioButton(
                status = if (selectedOption == 0) RadioButtonStatus.Checked else RadioButtonStatus.Unchecked,
                size = RadioButtonSize.Medium,
                label = "텍스트텍스트텍스트텍스트텍스트텍스트텍스트텍스트텍스트텍스트텍스트텍스트",
                onClick = { selectedOption = 0 }
            )

            RadioButton(
                status = if (selectedOption == 1) RadioButtonStatus.Checked else RadioButtonStatus.Unchecked,
                size = RadioButtonSize.Medium,
                label = "텍스트텍스트텍스트텍스트텍스트텍스트텍스트텍스트텍스트텍스트텍스트텍스트",
                onClick = { selectedOption = 1 }
            )
        }
    }
}

enum class RadioButtonSize {
    Small,
    Medium,
    ;
}

enum class RadioButtonStatus {
    Unchecked,
    Checked,
    ;
}