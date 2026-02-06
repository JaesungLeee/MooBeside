package com.jslee.core.designsystem.component.input.checkbox

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import com.jslee.core.designsystem.foundation.icons.MooBesideIconPack
import com.jslee.core.designsystem.foundation.icons.iconpack.Checkthick
import com.jslee.core.designsystem.foundation.icons.iconpack.Linehorizontalthick
import com.jslee.core.designsystem.theme.MooBesideAppTheme

@Composable
fun CheckBox(
    label: String,
    modifier: Modifier = Modifier,
    size: CheckBoxSize = CheckBoxSize.Medium,
    status: CheckBoxStatus = CheckBoxStatus.Unchecked,
    isBoldDescription: Boolean = false,
    enabled: Boolean = true,
) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(CheckBoxDefaults.iconDescriptionGap)
    ) {
        CheckBoxIconContent(
            modifier = Modifier.padding(CheckBoxDefaults.iconContentPadding(size)),
            status = status,
            size = size,
        )
        Text(
            text = label,
            style = CheckBoxDefaults.descriptionTextStyle(size, isBoldDescription, enabled),
            maxLines = 2,
            overflow = TextOverflow.Ellipsis,
        )
    }
}

@Composable
private fun CheckBoxIconContent(
    status: CheckBoxStatus,
    size: CheckBoxSize,
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier
            .size(CheckBoxDefaults.iconContainerSize(size))
            .clip(CheckBoxDefaults.shape)
            .border(CheckBoxDefaults.borderStroke(status), CheckBoxDefaults.shape)
            .background(CheckBoxDefaults.iconBackgroundColor(status))
    ) {
        when (status) {
            CheckBoxStatus.Checked -> {
                Icon(
                    modifier = Modifier.size(CheckBoxDefaults.iconSize(size)),
                    painter = rememberVectorPainter(MooBesideIconPack.Checkthick),
                    tint = CheckBoxDefaults.iconColor,
                    contentDescription = null,
                )
            }

            CheckBoxStatus.Indeterminate -> {
                Icon(
                    modifier = Modifier.size(CheckBoxDefaults.iconSize(size)),
                    painter = rememberVectorPainter(MooBesideIconPack.Linehorizontalthick),
                    tint = CheckBoxDefaults.iconColor,
                    contentDescription = null,
                )
            }

            else -> {}
        }
    }
}

@Preview
@Composable
private fun CheckBoxIconPreview() {
    MooBesideAppTheme {
        Box(modifier = Modifier.background(color = Color.White)) {
            CheckBox(
                size = CheckBoxSize.Medium,
                status = CheckBoxStatus.Checked,
                label = "텍스트텍스트텍스트텍스트텍스트텍스트텍스트텍스트텍스트텍스트텍스트텍스트",
            )
        }
    }
}

enum class CheckBoxSize {
    Small,
    Medium,
    ;
}

enum class CheckBoxStatus {
    Unchecked,
    Checked,
    Indeterminate,
}
