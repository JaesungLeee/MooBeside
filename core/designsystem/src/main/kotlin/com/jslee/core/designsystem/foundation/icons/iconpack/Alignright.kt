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

public val MooBesideIconPack.Alignright: ImageVector
    get() {
        if (_alignright != null) {
            return _alignright!!
        }
        _alignright = Builder(name = "Alignright", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.5f, 4.601f)
                curveTo(4.003f, 4.601f, 3.6f, 5.004f, 3.6f, 5.501f)
                curveTo(3.6f, 5.998f, 4.003f, 6.401f, 4.5f, 6.401f)
                horizontalLineTo(19.5f)
                curveTo(19.997f, 6.401f, 20.4f, 5.998f, 20.4f, 5.501f)
                curveTo(20.4f, 5.004f, 19.997f, 4.601f, 19.5f, 4.601f)
                horizontalLineTo(4.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.5f, 8.934f)
                curveTo(9.003f, 8.934f, 8.6f, 9.337f, 8.6f, 9.834f)
                curveTo(8.6f, 10.331f, 9.003f, 10.734f, 9.5f, 10.734f)
                horizontalLineTo(19.5f)
                curveTo(19.997f, 10.734f, 20.4f, 10.331f, 20.4f, 9.834f)
                curveTo(20.4f, 9.337f, 19.997f, 8.934f, 19.5f, 8.934f)
                horizontalLineTo(9.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.6f, 14.167f)
                curveTo(3.6f, 13.67f, 4.003f, 13.267f, 4.5f, 13.267f)
                horizontalLineTo(19.5f)
                curveTo(19.997f, 13.267f, 20.4f, 13.67f, 20.4f, 14.167f)
                curveTo(20.4f, 14.664f, 19.997f, 15.067f, 19.5f, 15.067f)
                horizontalLineTo(4.5f)
                curveTo(4.003f, 15.067f, 3.6f, 14.664f, 3.6f, 14.167f)
                close()
            }
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.5f, 17.601f)
                curveTo(9.003f, 17.601f, 8.6f, 18.003f, 8.6f, 18.5f)
                curveTo(8.6f, 18.998f, 9.003f, 19.4f, 9.5f, 19.4f)
                horizontalLineTo(19.5f)
                curveTo(19.997f, 19.4f, 20.4f, 18.998f, 20.4f, 18.5f)
                curveTo(20.4f, 18.003f, 19.997f, 17.601f, 19.5f, 17.601f)
                horizontalLineTo(9.5f)
                close()
            }
        }
        .build()
        return _alignright!!
    }

private var _alignright: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Alignright, contentDescription = "")
    }
}
