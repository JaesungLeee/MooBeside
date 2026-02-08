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
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
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
import com.jslee.core.designsystem.util.extension.singleClickable

@Composable
fun CheckBox(
    label: String,
    onClick: () -> Unit,
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
            onClick = onClick,
            enabled = enabled,
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
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
) {
    Box(
        modifier = modifier
            .size(CheckBoxDefaults.iconContainerSize(size))
            .clip(CheckBoxDefaults.shape)
            .singleClickable(
                enabled = enabled,
                onClick = onClick,
            )
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
    var status by remember { mutableStateOf(CheckBoxStatus.Unchecked) }

    MooBesideAppTheme {
        Box(modifier = Modifier.background(color = Color.White)) {
            CheckBox(
                size = CheckBoxSize.Medium,
                status = status,
                label = "텍스트텍스트텍스트텍스트텍스트텍스트텍스트텍스트텍스트텍스트텍스트텍스트",
                onClick = {
                    status = when (status) {
                        CheckBoxStatus.Unchecked -> CheckBoxStatus.Checked
                        CheckBoxStatus.Checked -> CheckBoxStatus.Unchecked
                        CheckBoxStatus.Indeterminate -> CheckBoxStatus.Unchecked
                    }
                }
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
