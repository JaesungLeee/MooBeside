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

public val MooBesideIconPack.Chevronlefttightthick: ImageVector
    get() {
        if (_chevronlefttightthick != null) {
            return _chevronlefttightthick!!
        }
        _chevronlefttightthick = Builder(name = "Chevronlefttightthick", defaultWidth = 12.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 12.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.419f, 3.08f)
                curveTo(10.927f, 3.588f, 10.927f, 4.411f, 10.419f, 4.918f)
                lineTo(3.338f, 11.999f)
                lineTo(10.419f, 19.08f)
                curveTo(10.927f, 19.588f, 10.927f, 20.411f, 10.419f, 20.919f)
                curveTo(9.911f, 21.426f, 9.088f, 21.426f, 8.581f, 20.919f)
                lineTo(0.581f, 12.918f)
                curveTo(0.073f, 12.411f, 0.073f, 11.588f, 0.581f, 11.08f)
                lineTo(8.581f, 3.08f)
                curveTo(9.088f, 2.572f, 9.911f, 2.572f, 10.419f, 3.08f)
                close()
            }
        }
        .build()
        return _chevronlefttightthick!!
    }

private var _chevronlefttightthick: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Chevronlefttightthick, contentDescription = "")
    }
}
