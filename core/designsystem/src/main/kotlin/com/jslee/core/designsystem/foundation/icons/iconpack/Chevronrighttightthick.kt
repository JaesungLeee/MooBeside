package com.jslee.core.designsystem.foundation.icons.iconpack

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.jslee.core.designsystem.foundation.icons.MooBesideIconPack
import kotlin.Unit

public val MooBesideIconPack.Chevronrighttightthick: ImageVector
    get() {
        if (_chevronrighttightthick != null) {
            return _chevronrighttightthick!!
        }
        _chevronrighttightthick = Builder(name = "Chevronrighttightthick", defaultWidth = 12.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 12.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.581f, 3.08f)
                curveTo(1.073f, 3.588f, 1.073f, 4.411f, 1.581f, 4.918f)
                lineTo(8.661f, 11.999f)
                lineTo(1.581f, 19.08f)
                curveTo(1.073f, 19.588f, 1.073f, 20.411f, 1.581f, 20.919f)
                curveTo(2.088f, 21.426f, 2.911f, 21.426f, 3.419f, 20.919f)
                lineTo(11.419f, 12.918f)
                curveTo(11.927f, 12.411f, 11.927f, 11.588f, 11.419f, 11.08f)
                lineTo(3.419f, 3.08f)
                curveTo(2.911f, 2.572f, 2.088f, 2.572f, 1.581f, 3.08f)
                close()
            }
        }
        .build()
        return _chevronrighttightthick!!
    }

private var _chevronrighttightthick: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Chevronrighttightthick, contentDescription = "")
    }
}
