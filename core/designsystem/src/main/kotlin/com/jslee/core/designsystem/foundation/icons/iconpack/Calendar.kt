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

public val MooBesideIconPack.Calendar: ImageVector
    get() {
        if (_calendar != null) {
            return _calendar!!
        }
        _calendar = Builder(name = "Calendar", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(9.4f, 1.75f)
                curveTo(9.4f, 1.253f, 8.997f, 0.85f, 8.5f, 0.85f)
                curveTo(8.003f, 0.85f, 7.6f, 1.253f, 7.6f, 1.75f)
                verticalLineTo(2.85f)
                horizontalLineTo(6.915f)
                curveTo(6.385f, 2.85f, 5.934f, 2.85f, 5.563f, 2.88f)
                curveTo(5.174f, 2.912f, 4.796f, 2.982f, 4.434f, 3.166f)
                curveTo(3.888f, 3.444f, 3.444f, 3.888f, 3.166f, 4.433f)
                curveTo(2.982f, 4.795f, 2.912f, 5.174f, 2.88f, 5.563f)
                curveTo(2.85f, 5.933f, 2.85f, 6.385f, 2.85f, 6.914f)
                verticalLineTo(17.085f)
                curveTo(2.85f, 17.615f, 2.85f, 18.066f, 2.88f, 18.437f)
                curveTo(2.912f, 18.826f, 2.982f, 19.205f, 3.166f, 19.566f)
                curveTo(3.444f, 20.112f, 3.888f, 20.556f, 4.434f, 20.834f)
                curveTo(4.796f, 21.018f, 5.174f, 21.088f, 5.563f, 21.12f)
                curveTo(5.934f, 21.15f, 6.385f, 21.15f, 6.915f, 21.15f)
                horizontalLineTo(17.086f)
                curveTo(17.615f, 21.15f, 18.067f, 21.15f, 18.437f, 21.12f)
                curveTo(18.826f, 21.088f, 19.205f, 21.018f, 19.567f, 20.834f)
                curveTo(20.112f, 20.556f, 20.556f, 20.112f, 20.834f, 19.566f)
                curveTo(21.018f, 19.205f, 21.088f, 18.826f, 21.12f, 18.437f)
                curveTo(21.15f, 18.066f, 21.15f, 17.615f, 21.15f, 17.085f)
                verticalLineTo(6.914f)
                curveTo(21.15f, 6.385f, 21.15f, 5.933f, 21.12f, 5.563f)
                curveTo(21.088f, 5.174f, 21.018f, 4.795f, 20.834f, 4.433f)
                curveTo(20.556f, 3.888f, 20.112f, 3.444f, 19.567f, 3.166f)
                curveTo(19.205f, 2.982f, 18.826f, 2.912f, 18.437f, 2.88f)
                curveTo(18.067f, 2.85f, 17.615f, 2.85f, 17.086f, 2.85f)
                horizontalLineTo(16.4f)
                verticalLineTo(1.75f)
                curveTo(16.4f, 1.253f, 15.997f, 0.85f, 15.5f, 0.85f)
                curveTo(15.003f, 0.85f, 14.6f, 1.253f, 14.6f, 1.75f)
                verticalLineTo(2.85f)
                horizontalLineTo(9.4f)
                verticalLineTo(1.75f)
                close()
                moveTo(14.6f, 5.75f)
                verticalLineTo(4.65f)
                horizontalLineTo(9.4f)
                verticalLineTo(5.75f)
                curveTo(9.4f, 6.247f, 8.997f, 6.65f, 8.5f, 6.65f)
                curveTo(8.003f, 6.65f, 7.6f, 6.247f, 7.6f, 5.75f)
                verticalLineTo(4.65f)
                horizontalLineTo(6.55f)
                curveTo(5.736f, 4.65f, 5.542f, 4.661f, 5.41f, 4.704f)
                curveTo(5.075f, 4.813f, 4.813f, 5.075f, 4.704f, 5.41f)
                curveTo(4.661f, 5.541f, 4.65f, 5.735f, 4.65f, 6.55f)
                verticalLineTo(8.6f)
                horizontalLineTo(19.35f)
                verticalLineTo(6.55f)
                curveTo(19.35f, 5.735f, 19.339f, 5.541f, 19.296f, 5.41f)
                curveTo(19.188f, 5.075f, 18.925f, 4.813f, 18.59f, 4.704f)
                curveTo(18.459f, 4.661f, 18.265f, 4.65f, 17.45f, 4.65f)
                horizontalLineTo(16.4f)
                verticalLineTo(5.75f)
                curveTo(16.4f, 6.247f, 15.997f, 6.65f, 15.5f, 6.65f)
                curveTo(15.003f, 6.65f, 14.6f, 6.247f, 14.6f, 5.75f)
                close()
                moveTo(19.35f, 10.4f)
                horizontalLineTo(4.65f)
                verticalLineTo(17.45f)
                curveTo(4.65f, 18.264f, 4.661f, 18.458f, 4.704f, 18.59f)
                curveTo(4.813f, 18.925f, 5.075f, 19.187f, 5.41f, 19.296f)
                curveTo(5.542f, 19.339f, 5.736f, 19.35f, 6.55f, 19.35f)
                horizontalLineTo(17.45f)
                curveTo(18.265f, 19.35f, 18.459f, 19.339f, 18.59f, 19.296f)
                curveTo(18.925f, 19.187f, 19.188f, 18.925f, 19.296f, 18.59f)
                curveTo(19.339f, 18.458f, 19.35f, 18.264f, 19.35f, 17.45f)
                verticalLineTo(10.4f)
                close()
            }
        }
        .build()
        return _calendar!!
    }

private var _calendar: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Calendar, contentDescription = "")
    }
}
