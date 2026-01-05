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

public val MooBesideIconPack.Full: ImageVector
    get() {
        if (_full != null) {
            return _full!!
        }
        _full = Builder(name = "Full", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.339f, 9.89f)
                curveTo(13.002f, 10.255f, 13.024f, 10.824f, 13.389f, 11.161f)
                curveTo(13.755f, 11.499f, 14.324f, 11.476f, 14.661f, 11.111f)
                lineTo(19.1f, 6.302f)
                verticalLineTo(10.0f)
                curveTo(19.1f, 10.497f, 19.503f, 10.9f, 20.0f, 10.9f)
                curveTo(20.497f, 10.9f, 20.9f, 10.497f, 20.9f, 10.0f)
                verticalLineTo(4.0f)
                curveTo(20.9f, 3.503f, 20.497f, 3.1f, 20.0f, 3.1f)
                horizontalLineTo(14.5f)
                curveTo(14.003f, 3.1f, 13.6f, 3.503f, 13.6f, 4.0f)
                curveTo(13.6f, 4.497f, 14.003f, 4.9f, 14.5f, 4.9f)
                lineTo(17.944f, 4.9f)
                lineTo(13.339f, 9.89f)
                close()
            }
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.9f, 14.0f)
                curveTo(4.9f, 13.503f, 4.497f, 13.1f, 4.0f, 13.1f)
                curveTo(3.503f, 13.1f, 3.1f, 13.503f, 3.1f, 14.0f)
                verticalLineTo(20.0f)
                curveTo(3.1f, 20.497f, 3.503f, 20.9f, 4.0f, 20.9f)
                horizontalLineTo(9.5f)
                curveTo(9.997f, 20.9f, 10.4f, 20.497f, 10.4f, 20.0f)
                curveTo(10.4f, 19.503f, 9.997f, 19.1f, 9.5f, 19.1f)
                horizontalLineTo(6.173f)
                lineTo(10.636f, 14.637f)
                curveTo(10.988f, 14.285f, 10.988f, 13.715f, 10.636f, 13.364f)
                curveTo(10.285f, 13.012f, 9.715f, 13.012f, 9.364f, 13.364f)
                lineTo(4.9f, 17.827f)
                verticalLineTo(14.0f)
                close()
            }
        }
        .build()
        return _full!!
    }

private var _full: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Full, contentDescription = "")
    }
}
