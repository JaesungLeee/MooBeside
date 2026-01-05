package com.jslee.core.designsystem.foundation.icons.iconpack

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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

public val MooBesideIconPack.Arrowup: ImageVector
    get() {
        if (_arrowup != null) {
            return _arrowup!!
        }
        _arrowup = Builder(name = "Arrowup", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.637f, 2.863f)
                curveTo(12.285f, 2.512f, 11.715f, 2.512f, 11.364f, 2.863f)
                lineTo(4.364f, 9.863f)
                curveTo(4.012f, 10.215f, 4.012f, 10.785f, 4.364f, 11.136f)
                curveTo(4.715f, 11.488f, 5.285f, 11.488f, 5.637f, 11.136f)
                lineTo(11.1f, 5.673f)
                verticalLineTo(20.5f)
                curveTo(11.1f, 20.997f, 11.503f, 21.4f, 12.0f, 21.4f)
                curveTo(12.497f, 21.4f, 12.9f, 20.997f, 12.9f, 20.5f)
                verticalLineTo(5.673f)
                lineTo(18.364f, 11.136f)
                curveTo(18.715f, 11.488f, 19.285f, 11.488f, 19.636f, 11.136f)
                curveTo(19.988f, 10.785f, 19.988f, 10.215f, 19.636f, 9.863f)
                lineTo(12.637f, 2.863f)
                close()
            }
        }
        .build()
        return _arrowup!!
    }

private var _arrowup: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Arrowup, contentDescription = "")
    }
}
