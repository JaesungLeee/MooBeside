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

@Composable
fun RadioButton(
    label: String,
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
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier
            .size(RadioButtonDefaults.containerSize(size))
            .clip(RadioButtonDefaults.shape)
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
    MooBesideAppTheme {
        Column(modifier = Modifier.background(color = Color.White)) {
            RadioButton(
                status = RadioButtonStatus.Checked,
                size = RadioButtonSize.Medium,
                label = "텍스트텍스트텍스트텍스트텍스트텍스트텍스트텍스트텍스트텍스트텍스트텍스트",
            )

            RadioButton(
                status = RadioButtonStatus.Unchecked,
                size = RadioButtonSize.Medium,
                label = "텍스트텍스트텍스트텍스트텍스트텍스트텍스트텍스트텍스트텍스트텍스트텍스트",
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