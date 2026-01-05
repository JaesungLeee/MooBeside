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

public val MooBesideIconPack.Code: ImageVector
    get() {
        if (_code != null) {
            return _code!!
        }
        _code = Builder(name = "Code", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.218f, 3.127f)
                curveTo(14.7f, 3.247f, 14.994f, 3.736f, 14.873f, 4.218f)
                lineTo(10.873f, 20.218f)
                curveTo(10.752f, 20.7f, 10.264f, 20.993f, 9.782f, 20.873f)
                curveTo(9.299f, 20.752f, 9.006f, 20.264f, 9.127f, 19.781f)
                lineTo(13.127f, 3.782f)
                curveTo(13.247f, 3.299f, 13.736f, 3.006f, 14.218f, 3.127f)
                close()
            }
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.364f, 6.363f)
                curveTo(16.012f, 6.715f, 16.012f, 7.285f, 16.364f, 7.636f)
                lineTo(20.727f, 12.0f)
                lineTo(16.364f, 16.363f)
                curveTo(16.012f, 16.715f, 16.012f, 17.285f, 16.364f, 17.636f)
                curveTo(16.715f, 17.988f, 17.285f, 17.988f, 17.636f, 17.636f)
                lineTo(22.636f, 12.636f)
                curveTo(22.988f, 12.285f, 22.988f, 11.715f, 22.636f, 11.363f)
                lineTo(17.636f, 6.363f)
                curveTo(17.285f, 6.012f, 16.715f, 6.012f, 16.364f, 6.363f)
                close()
            }
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.636f, 7.636f)
                curveTo(7.988f, 7.285f, 7.988f, 6.715f, 7.636f, 6.363f)
                curveTo(7.285f, 6.012f, 6.715f, 6.012f, 6.364f, 6.363f)
                lineTo(1.364f, 11.363f)
                curveTo(1.012f, 11.715f, 1.012f, 12.285f, 1.364f, 12.636f)
                lineTo(6.364f, 17.636f)
                curveTo(6.715f, 17.988f, 7.285f, 17.988f, 7.636f, 17.636f)
                curveTo(7.988f, 17.285f, 7.988f, 16.715f, 7.636f, 16.363f)
                lineTo(3.273f, 12.0f)
                lineTo(7.636f, 7.636f)
                close()
            }
        }
        .build()
        return _code!!
    }

private var _code: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Code, contentDescription = "")
    }
}
