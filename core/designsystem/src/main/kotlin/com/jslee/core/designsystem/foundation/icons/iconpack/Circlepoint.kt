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

public val MooBesideIconPack.Circlepoint: ImageVector
    get() {
        if (_circlepoint != null) {
            return _circlepoint!!
        }
        _circlepoint = Builder(name = "Circlepoint", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(9.319f, 15.381f)
                curveTo(9.319f, 15.861f, 9.709f, 16.25f, 10.189f, 16.25f)
                curveTo(10.669f, 16.25f, 11.058f, 15.861f, 11.058f, 15.381f)
                verticalLineTo(13.372f)
                horizontalLineTo(12.232f)
                curveTo(14.17f, 13.372f, 15.498f, 12.227f, 15.498f, 10.553f)
                curveTo(15.498f, 8.891f, 14.17f, 7.746f, 12.232f, 7.746f)
                horizontalLineTo(10.919f)
                curveTo(10.359f, 7.746f, 10.079f, 7.746f, 9.865f, 7.855f)
                curveTo(9.677f, 7.951f, 9.524f, 8.104f, 9.428f, 8.292f)
                curveTo(9.319f, 8.506f, 9.319f, 8.786f, 9.319f, 9.346f)
                verticalLineTo(15.381f)
                close()
                moveTo(12.256f, 11.786f)
                horizontalLineTo(11.058f)
                verticalLineTo(9.332f)
                horizontalLineTo(12.256f)
                curveTo(13.19f, 9.332f, 13.748f, 9.79f, 13.748f, 10.553f)
                curveTo(13.748f, 11.323f, 13.19f, 11.786f, 12.256f, 11.786f)
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
        return _circlepoint!!
    }

private var _circlepoint: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Circlepoint, contentDescription = "")
    }
}
