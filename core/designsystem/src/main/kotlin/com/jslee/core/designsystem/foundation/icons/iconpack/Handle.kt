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

public val MooBesideIconPack.Handle: ImageVector
    get() {
        if (_handle != null) {
            return _handle!!
        }
        _handle = Builder(name = "Handle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 8.6f)
                curveTo(3.503f, 8.6f, 3.1f, 9.003f, 3.1f, 9.5f)
                curveTo(3.1f, 9.997f, 3.503f, 10.4f, 4.0f, 10.4f)
                horizontalLineTo(20.0f)
                curveTo(20.497f, 10.4f, 20.9f, 9.997f, 20.9f, 9.5f)
                curveTo(20.9f, 9.003f, 20.497f, 8.6f, 20.0f, 8.6f)
                horizontalLineTo(4.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 13.6f)
                curveTo(3.503f, 13.6f, 3.1f, 14.003f, 3.1f, 14.5f)
                curveTo(3.1f, 14.997f, 3.503f, 15.4f, 4.0f, 15.4f)
                horizontalLineTo(20.0f)
                curveTo(20.497f, 15.4f, 20.9f, 14.997f, 20.9f, 14.5f)
                curveTo(20.9f, 14.003f, 20.497f, 13.6f, 20.0f, 13.6f)
                horizontalLineTo(4.0f)
                close()
            }
        }
        .build()
        return _handle!!
    }

private var _handle: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Handle, contentDescription = "")
    }
}
