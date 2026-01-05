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

public val MooBesideIconPack.Trophy: ImageVector
    get() {
        if (_trophy != null) {
            return _trophy!!
        }
        _trophy = Builder(name = "Trophy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(6.5f, 3.1f)
                curveTo(6.003f, 3.1f, 5.6f, 3.503f, 5.6f, 4.0f)
                lineTo(5.6f, 6.6f)
                horizontalLineTo(2.0f)
                curveTo(1.503f, 6.6f, 1.1f, 7.003f, 1.1f, 7.5f)
                curveTo(1.1f, 13.109f, 5.542f, 17.682f, 11.1f, 17.892f)
                verticalLineTo(20.1f)
                horizontalLineTo(6.5f)
                curveTo(6.003f, 20.1f, 5.6f, 20.503f, 5.6f, 21.0f)
                curveTo(5.6f, 21.497f, 6.003f, 21.9f, 6.5f, 21.9f)
                horizontalLineTo(17.5f)
                curveTo(17.997f, 21.9f, 18.4f, 21.497f, 18.4f, 21.0f)
                curveTo(18.4f, 20.503f, 17.997f, 20.1f, 17.5f, 20.1f)
                horizontalLineTo(12.9f)
                verticalLineTo(17.892f)
                curveTo(18.458f, 17.682f, 22.9f, 13.109f, 22.9f, 7.5f)
                curveTo(22.9f, 7.003f, 22.497f, 6.6f, 22.0f, 6.6f)
                horizontalLineTo(18.4f)
                lineTo(18.4f, 4.0f)
                curveTo(18.4f, 3.761f, 18.305f, 3.532f, 18.136f, 3.363f)
                curveTo(17.968f, 3.194f, 17.739f, 3.1f, 17.5f, 3.1f)
                horizontalLineTo(6.5f)
                close()
                moveTo(18.4f, 8.4f)
                lineTo(18.4f, 9.299f)
                curveTo(18.4f, 10.702f, 18.367f, 11.583f, 18.283f, 12.278f)
                lineTo(18.282f, 12.292f)
                curveTo(18.18f, 13.043f, 17.999f, 13.719f, 17.724f, 14.332f)
                curveTo(19.552f, 12.932f, 20.802f, 10.814f, 21.053f, 8.4f)
                horizontalLineTo(18.4f)
                close()
                moveTo(6.276f, 14.332f)
                curveTo(6.006f, 13.726f, 5.83f, 13.052f, 5.729f, 12.289f)
                lineTo(5.728f, 12.284f)
                curveTo(5.633f, 11.532f, 5.6f, 10.638f, 5.6f, 9.299f)
                lineTo(5.6f, 8.4f)
                horizontalLineTo(2.947f)
                curveTo(3.198f, 10.814f, 4.448f, 12.932f, 6.276f, 14.332f)
                close()
                moveTo(7.4f, 9.299f)
                lineTo(7.4f, 4.9f)
                horizontalLineTo(16.6f)
                lineTo(16.6f, 9.299f)
                curveTo(16.6f, 10.685f, 16.567f, 11.475f, 16.497f, 12.056f)
                curveTo(16.331f, 13.272f, 15.938f, 14.098f, 15.27f, 14.766f)
                curveTo(14.418f, 15.608f, 13.217f, 16.099f, 12.0f, 16.099f)
                curveTo(10.794f, 16.099f, 9.571f, 15.598f, 8.73f, 14.766f)
                curveTo(8.062f, 14.097f, 7.68f, 13.305f, 7.513f, 12.054f)
                curveTo(7.433f, 11.421f, 7.4f, 10.621f, 7.4f, 9.299f)
                close()
            }
        }
        .build()
        return _trophy!!
    }

private var _trophy: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Trophy, contentDescription = "")
    }
}
