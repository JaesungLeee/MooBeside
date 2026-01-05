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

public val MooBesideIconPack.Crown: ImageVector
    get() {
        if (_crown != null) {
            return _crown!!
        }
        _crown = Builder(name = "Crown", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.734f, 2.979f)
                curveTo(12.566f, 2.741f, 12.292f, 2.599f, 12.0f, 2.599f)
                curveTo(11.708f, 2.599f, 11.434f, 2.741f, 11.266f, 2.979f)
                lineTo(8.862f, 6.372f)
                curveTo(8.53f, 6.84f, 8.312f, 7.147f, 8.127f, 7.369f)
                curveTo(7.948f, 7.582f, 7.849f, 7.653f, 7.784f, 7.687f)
                curveTo(7.578f, 7.795f, 7.344f, 7.836f, 7.114f, 7.802f)
                curveTo(7.041f, 7.792f, 6.924f, 7.757f, 6.685f, 7.616f)
                curveTo(6.436f, 7.469f, 6.128f, 7.253f, 5.659f, 6.921f)
                lineTo(4.019f, 5.764f)
                curveTo(3.73f, 5.56f, 3.348f, 5.544f, 3.044f, 5.723f)
                curveTo(2.739f, 5.903f, 2.567f, 6.244f, 2.605f, 6.596f)
                lineTo(3.605f, 15.846f)
                curveTo(3.655f, 16.303f, 4.04f, 16.649f, 4.5f, 16.649f)
                horizontalLineTo(19.5f)
                curveTo(19.959f, 16.649f, 20.345f, 16.303f, 20.395f, 15.846f)
                lineTo(21.395f, 6.596f)
                curveTo(21.433f, 6.244f, 21.261f, 5.903f, 20.956f, 5.723f)
                curveTo(20.652f, 5.544f, 20.27f, 5.56f, 19.981f, 5.764f)
                lineTo(18.341f, 6.921f)
                curveTo(17.872f, 7.253f, 17.564f, 7.469f, 17.315f, 7.616f)
                curveTo(17.076f, 7.757f, 16.959f, 7.792f, 16.886f, 7.802f)
                curveTo(16.656f, 7.836f, 16.422f, 7.795f, 16.216f, 7.687f)
                curveTo(16.151f, 7.653f, 16.052f, 7.582f, 15.873f, 7.369f)
                curveTo(15.688f, 7.147f, 15.47f, 6.84f, 15.138f, 6.372f)
                lineTo(12.734f, 2.979f)
                close()
                moveTo(12.0f, 5.056f)
                lineTo(13.974f, 7.843f)
                curveTo(14.329f, 8.345f, 14.623f, 8.762f, 14.994f, 9.039f)
                curveTo(15.738f, 9.593f, 16.701f, 9.758f, 17.587f, 9.483f)
                curveTo(18.029f, 9.346f, 18.446f, 9.052f, 18.948f, 8.696f)
                lineTo(19.391f, 8.384f)
                lineTo(18.692f, 14.849f)
                horizontalLineTo(5.308f)
                lineTo(4.609f, 8.384f)
                lineTo(5.052f, 8.696f)
                curveTo(5.554f, 9.052f, 5.971f, 9.346f, 6.413f, 9.483f)
                curveTo(7.298f, 9.758f, 8.262f, 9.593f, 9.005f, 9.039f)
                curveTo(9.377f, 8.762f, 9.671f, 8.345f, 10.026f, 7.843f)
                lineTo(12.0f, 5.056f)
                close()
            }
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 19.099f)
                curveTo(4.503f, 19.099f, 4.1f, 19.502f, 4.1f, 19.999f)
                curveTo(4.1f, 20.496f, 4.503f, 20.899f, 5.0f, 20.899f)
                horizontalLineTo(19.0f)
                curveTo(19.497f, 20.899f, 19.9f, 20.496f, 19.9f, 19.999f)
                curveTo(19.9f, 19.502f, 19.497f, 19.099f, 19.0f, 19.099f)
                horizontalLineTo(5.0f)
                close()
            }
        }
        .build()
        return _crown!!
    }

private var _crown: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Crown, contentDescription = "")
    }
}
