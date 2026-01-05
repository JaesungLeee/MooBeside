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

public val MooBesideIconPack.Circlequestion: ImageVector
    get() {
        if (_circlequestion != null) {
            return _circlequestion!!
        }
        _circlequestion = Builder(name = "Circlequestion", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.19f, 13.015f)
                curveTo(11.103f, 13.492f, 11.509f, 13.891f, 11.994f, 13.891f)
                curveTo(12.478f, 13.891f, 12.845f, 13.484f, 13.007f, 13.028f)
                curveTo(13.22f, 12.426f, 13.653f, 12.065f, 14.084f, 11.705f)
                curveTo(14.681f, 11.205f, 15.275f, 10.709f, 15.275f, 9.579f)
                curveTo(15.275f, 7.831f, 13.859f, 6.802f, 12.055f, 6.802f)
                curveTo(10.417f, 6.802f, 9.181f, 7.666f, 8.819f, 9.068f)
                curveTo(8.698f, 9.538f, 9.105f, 9.939f, 9.59f, 9.939f)
                curveTo(10.074f, 9.939f, 10.429f, 9.52f, 10.654f, 9.092f)
                curveTo(10.895f, 8.631f, 11.358f, 8.368f, 11.986f, 8.363f)
                curveTo(12.85f, 8.37f, 13.451f, 8.868f, 13.451f, 9.649f)
                curveTo(13.451f, 10.281f, 13.055f, 10.582f, 12.59f, 10.936f)
                curveTo(12.045f, 11.351f, 11.404f, 11.838f, 11.19f, 13.015f)
                close()
            }
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.881f, 16.06f)
                curveTo(10.874f, 16.682f, 11.344f, 17.138f, 12.0f, 17.138f)
                curveTo(12.643f, 17.138f, 13.112f, 16.682f, 13.119f, 16.06f)
                curveTo(13.112f, 15.438f, 12.643f, 14.982f, 12.0f, 14.982f)
                curveTo(11.344f, 14.982f, 10.874f, 15.438f, 10.881f, 16.06f)
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
        return _circlequestion!!
    }

private var _circlequestion: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Circlequestion, contentDescription = "")
    }
}
