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

public val MooBesideIconPack.Clock: ImageVector
    get() {
        if (_clock != null) {
            return _clock!!
        }
        _clock = Builder(name = "Clock", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.5f, 6.6f)
                curveTo(11.997f, 6.6f, 12.4f, 7.003f, 12.4f, 7.5f)
                verticalLineTo(12.127f)
                lineTo(14.611f, 14.338f)
                curveTo(14.962f, 14.69f, 14.962f, 15.259f, 14.611f, 15.611f)
                curveTo(14.259f, 15.962f, 13.69f, 15.962f, 13.338f, 15.611f)
                lineTo(10.863f, 13.136f)
                curveTo(10.684f, 12.957f, 10.596f, 12.72f, 10.6f, 12.485f)
                verticalLineTo(7.5f)
                curveTo(10.6f, 7.003f, 11.003f, 6.6f, 11.5f, 6.6f)
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
                curveTo(3.9f, 7.527f, 7.527f, 3.9f, 12.0f, 3.9f)
                curveTo(16.473f, 3.9f, 20.1f, 7.527f, 20.1f, 12.0f)
                curveTo(20.1f, 16.474f, 16.473f, 20.1f, 12.0f, 20.1f)
                curveTo(7.527f, 20.1f, 3.9f, 16.474f, 3.9f, 12.0f)
                close()
            }
        }
        .build()
        return _clock!!
    }

private var _clock: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Clock, contentDescription = "")
    }
}
