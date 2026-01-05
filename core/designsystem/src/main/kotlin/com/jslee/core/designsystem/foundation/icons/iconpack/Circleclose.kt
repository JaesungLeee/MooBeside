package com.jslee.core.designsystem.foundation.icons.iconpack

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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

public val MooBesideIconPack.Circleclose: ImageVector
    get() {
        if (_circleclose != null) {
            return _circleclose!!
        }
        _circleclose = Builder(name = "Circleclose", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.636f, 8.364f)
                curveTo(9.285f, 8.013f, 8.715f, 8.013f, 8.364f, 8.364f)
                curveTo(8.012f, 8.716f, 8.012f, 9.285f, 8.364f, 9.637f)
                lineTo(10.727f, 12.0f)
                lineTo(8.364f, 14.364f)
                curveTo(8.012f, 14.716f, 8.012f, 15.285f, 8.364f, 15.637f)
                curveTo(8.715f, 15.988f, 9.285f, 15.988f, 9.636f, 15.637f)
                lineTo(12.0f, 13.273f)
                lineTo(14.363f, 15.637f)
                curveTo(14.715f, 15.988f, 15.285f, 15.988f, 15.636f, 15.637f)
                curveTo(15.988f, 15.285f, 15.988f, 14.716f, 15.636f, 14.364f)
                lineTo(13.273f, 12.0f)
                lineTo(15.636f, 9.637f)
                curveTo(15.988f, 9.285f, 15.988f, 8.716f, 15.636f, 8.364f)
                curveTo(15.285f, 8.013f, 14.715f, 8.013f, 14.363f, 8.364f)
                lineTo(12.0f, 10.728f)
                lineTo(9.636f, 8.364f)
                close()
            }
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 2.1f)
                curveTo(6.532f, 2.1f, 2.1f, 6.532f, 2.1f, 12.0f)
                curveTo(2.1f, 17.468f, 6.532f, 21.9f, 12.0f, 21.9f)
                curveTo(17.468f, 21.9f, 21.9f, 17.468f, 21.9f, 12.0f)
                curveTo(21.9f, 6.532f, 17.468f, 2.1f, 12.0f, 2.1f)
                close()
                moveTo(3.9f, 12.0f)
                curveTo(3.9f, 7.527f, 7.526f, 3.9f, 12.0f, 3.9f)
                curveTo(16.473f, 3.9f, 20.1f, 7.527f, 20.1f, 12.0f)
                curveTo(20.1f, 16.474f, 16.473f, 20.1f, 12.0f, 20.1f)
                curveTo(7.526f, 20.1f, 3.9f, 16.474f, 3.9f, 12.0f)
                close()
            }
        }
        .build()
        return _circleclose!!
    }

private var _circleclose: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Circleclose, contentDescription = "")
    }
}
