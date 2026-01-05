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

public val MooBesideIconPack.Bellplus: ImageVector
    get() {
        if (_bellplus != null) {
            return _bellplus!!
        }
        _bellplus = Builder(name = "Bellplus", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.688f, 4.374f)
                curveTo(7.945f, 2.888f, 9.775f, 2.1f, 12.0f, 2.1f)
                curveTo(12.284f, 2.1f, 12.562f, 2.113f, 12.834f, 2.138f)
                curveTo(13.329f, 2.185f, 13.693f, 2.624f, 13.646f, 3.119f)
                curveTo(13.599f, 3.614f, 13.16f, 3.977f, 12.665f, 3.931f)
                curveTo(12.452f, 3.91f, 12.23f, 3.9f, 12.0f, 3.9f)
                curveTo(10.225f, 3.9f, 8.929f, 4.511f, 8.062f, 5.537f)
                curveTo(7.177f, 6.583f, 6.65f, 8.165f, 6.65f, 10.25f)
                lineTo(6.65f, 11.0f)
                curveTo(6.65f, 13.163f, 6.182f, 14.827f, 5.331f, 16.1f)
                horizontalLineTo(18.669f)
                curveTo(17.928f, 14.991f, 17.475f, 13.582f, 17.372f, 11.802f)
                curveTo(17.344f, 11.306f, 17.723f, 10.88f, 18.219f, 10.851f)
                curveTo(18.715f, 10.823f, 19.141f, 11.202f, 19.169f, 11.698f)
                curveTo(19.287f, 13.743f, 19.925f, 15.014f, 20.806f, 15.868f)
                curveTo(21.188f, 16.238f, 21.227f, 16.75f, 21.091f, 17.126f)
                curveTo(20.952f, 17.509f, 20.572f, 17.9f, 20.0f, 17.9f)
                horizontalLineTo(3.999f)
                curveTo(3.428f, 17.9f, 3.047f, 17.509f, 2.909f, 17.126f)
                curveTo(2.772f, 16.75f, 2.812f, 16.238f, 3.193f, 15.868f)
                curveTo(4.167f, 14.925f, 4.85f, 13.465f, 4.85f, 11.0f)
                lineTo(4.85f, 10.25f)
                curveTo(4.85f, 7.883f, 5.448f, 5.84f, 6.688f, 4.374f)
                close()
            }
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.1f, 21.0f)
                curveTo(9.1f, 20.503f, 9.503f, 20.1f, 10.0f, 20.1f)
                horizontalLineTo(14.0f)
                curveTo(14.497f, 20.1f, 14.9f, 20.503f, 14.9f, 21.0f)
                curveTo(14.9f, 21.497f, 14.497f, 21.9f, 14.0f, 21.9f)
                horizontalLineTo(10.0f)
                curveTo(9.503f, 21.9f, 9.1f, 21.497f, 9.1f, 21.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.15f, 3.0f)
                curveTo(19.15f, 2.503f, 18.747f, 2.1f, 18.25f, 2.1f)
                curveTo(17.753f, 2.1f, 17.35f, 2.503f, 17.35f, 3.0f)
                verticalLineTo(4.6f)
                horizontalLineTo(15.75f)
                curveTo(15.253f, 4.6f, 14.85f, 5.003f, 14.85f, 5.5f)
                curveTo(14.85f, 5.997f, 15.253f, 6.4f, 15.75f, 6.4f)
                horizontalLineTo(17.35f)
                verticalLineTo(8.0f)
                curveTo(17.35f, 8.497f, 17.753f, 8.9f, 18.25f, 8.9f)
                curveTo(18.747f, 8.9f, 19.15f, 8.497f, 19.15f, 8.0f)
                verticalLineTo(6.4f)
                horizontalLineTo(20.75f)
                curveTo(21.247f, 6.4f, 21.65f, 5.997f, 21.65f, 5.5f)
                curveTo(21.65f, 5.003f, 21.247f, 4.6f, 20.75f, 4.6f)
                horizontalLineTo(19.15f)
                verticalLineTo(3.0f)
                close()
            }
        }
        .build()
        return _bellplus!!
    }

private var _bellplus: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Bellplus, contentDescription = "")
    }
}
