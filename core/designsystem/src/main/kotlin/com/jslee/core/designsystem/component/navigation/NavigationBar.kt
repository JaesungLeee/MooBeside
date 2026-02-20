package com.jslee.core.designsystem.component.navigation

import android.content.res.Configuration
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.foundation.selection.selectable
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.ripple
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.compose.dropUnlessResumed
import com.jslee.core.designsystem.foundation.icons.MooBesideIconPack
import com.jslee.core.designsystem.foundation.icons.iconpack.List
import com.jslee.core.designsystem.foundation.icons.iconpack.Person
import com.jslee.core.designsystem.theme.MooBesideAppTheme
import com.jslee.core.designsystem.theme.MooBesideTheme

@Composable
fun NavigationBar(
    modifier: Modifier = Modifier,
    content: @Composable RowScope.() -> Unit,
) {
    Surface(
        modifier = modifier,
        color = NavigationBarDefaults.containerColor,
        shape = NavigationBarDefaults.containerShape,
        tonalElevation = NavigationBarDefaults.Elevation,
    ) {
        val dividerColor = NavigationBarDefaults.dividerColor
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .drawBehind {
                    drawLine(
                        color = dividerColor,
                        start = Offset(0f, 0f),
                        end = Offset(size.width, 0f),
                        strokeWidth = NavigationBarDefaults.DividerThickness.toPx(),
                    )
                }
                .windowInsetsPadding(NavigationBarDefaults.windowInsets)
                .defaultMinSize(minHeight = NavigationBarDefaults.containerHeight),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically,
            content = content
        )
    }
}

private const val ItemAnimationDurationMillis: Int = 100

@Composable
fun RowScope.NavigationBarItem(
    selected: Boolean,
    icon: ImageVector,
    label: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    val interactionSource = remember { MutableInteractionSource() }
    Column(
        modifier = modifier
            .selectable(
                selected = selected,
                onClick = dropUnlessResumed { onClick() },
                role = Role.Tab,
                interactionSource = interactionSource,
                indication = ripple(),
            )
            .defaultMinSize(minHeight = NavigationBarDefaults.containerHeight)
            .weight(1f)
            .padding(vertical = NavigationBarDefaults.contentVerticalPadding),
        verticalArrangement = Arrangement.spacedBy(NavigationBarDefaults.IconLabelGap),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        val iconColor by animateColorAsState(
            targetValue = NavigationBarDefaults.colors().iconColor(selected),
            animationSpec = tween(ItemAnimationDurationMillis)
        )

        val textColor by animateColorAsState(
            targetValue = NavigationBarDefaults.colors().labelColor(selected),
            animationSpec = tween(ItemAnimationDurationMillis)
        )

        val styledLabelTextStyle = NavigationBarDefaults.labelTextStyle().copy(color = textColor)

        Icon(
            modifier = Modifier.size(NavigationBarDefaults.iconSize),
            imageVector = icon,
            contentDescription = label,
            tint = iconColor
        )
        Text(
            text = label,
            style = styledLabelTextStyle,
        )
    }
}

@Preview
@Composable
private fun BottomNavigationBarPreview() {
    MooBesideAppTheme {
        NavigationBar(
            content = {
                NavigationBarItem(
                    selected = true,
                    icon = MooBesideIconPack.Person,
                    label = "Label1",
                    onClick = {},
                )
            }
        )
    }
}

@Preview(
    name = "DarkMode - NavigationBarItemPreview",
    uiMode = Configuration.UI_MODE_NIGHT_YES,
    showBackground = true
)
@Preview(
    name = "LightMode - NavigationBarItemPreview",
    uiMode = Configuration.UI_MODE_NIGHT_NO,
    showBackground = true
)
@Composable
private fun NavigationBarItemPreview() {
    MooBesideAppTheme {
        Row(
            modifier = Modifier.background(MooBesideTheme.colors.semantic.background.normal.normal)
        ) {
            NavigationBarItem(
                selected = true,
                icon = MooBesideIconPack.Person,
                label = "Label1",
                onClick = {},
            )
            NavigationBarItem(
                selected = false,
                icon = MooBesideIconPack.List,
                label = "Label2",
                onClick = {},
            )
        }
    }
}
