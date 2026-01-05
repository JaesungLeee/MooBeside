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

public val MooBesideIconPack.Businessbag: ImageVector
    get() {
        if (_businessbag != null) {
            return _businessbag!!
        }
        _businessbag = Builder(name = "Businessbag", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 10.1f)
                curveTo(8.503f, 10.1f, 8.1f, 10.503f, 8.1f, 11.0f)
                curveTo(8.1f, 11.497f, 8.503f, 11.9f, 9.0f, 11.9f)
                horizontalLineTo(15.0f)
                curveTo(15.497f, 11.9f, 15.9f, 11.497f, 15.9f, 11.0f)
                curveTo(15.9f, 10.503f, 15.497f, 10.1f, 15.0f, 10.1f)
                horizontalLineTo(9.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(9.57f, 2.1f)
                horizontalLineTo(14.43f)
                curveTo(14.684f, 2.1f, 14.926f, 2.1f, 15.13f, 2.117f)
                curveTo(15.352f, 2.135f, 15.608f, 2.177f, 15.863f, 2.307f)
                curveTo(16.22f, 2.489f, 16.511f, 2.78f, 16.693f, 3.137f)
                curveTo(16.823f, 3.392f, 16.865f, 3.647f, 16.883f, 3.87f)
                curveTo(16.9f, 4.074f, 16.9f, 4.316f, 16.9f, 4.57f)
                lineTo(16.9f, 5.6f)
                lineTo(17.835f, 5.6f)
                curveTo(18.365f, 5.6f, 18.816f, 5.6f, 19.187f, 5.63f)
                curveTo(19.576f, 5.662f, 19.955f, 5.732f, 20.316f, 5.916f)
                curveTo(20.862f, 6.194f, 21.306f, 6.638f, 21.584f, 7.183f)
                curveTo(21.768f, 7.545f, 21.838f, 7.924f, 21.87f, 8.313f)
                curveTo(21.9f, 8.684f, 21.9f, 9.135f, 21.9f, 9.665f)
                verticalLineTo(16.835f)
                curveTo(21.9f, 17.365f, 21.9f, 17.816f, 21.87f, 18.187f)
                curveTo(21.838f, 18.576f, 21.768f, 18.955f, 21.584f, 19.317f)
                curveTo(21.306f, 19.862f, 20.862f, 20.306f, 20.316f, 20.584f)
                curveTo(19.955f, 20.768f, 19.576f, 20.838f, 19.187f, 20.87f)
                curveTo(18.816f, 20.9f, 18.365f, 20.9f, 17.835f, 20.9f)
                horizontalLineTo(6.165f)
                curveTo(5.635f, 20.9f, 5.184f, 20.9f, 4.813f, 20.87f)
                curveTo(4.424f, 20.838f, 4.045f, 20.768f, 3.683f, 20.584f)
                curveTo(3.138f, 20.306f, 2.694f, 19.862f, 2.416f, 19.317f)
                curveTo(2.232f, 18.955f, 2.162f, 18.576f, 2.13f, 18.187f)
                curveTo(2.1f, 17.816f, 2.1f, 17.365f, 2.1f, 16.836f)
                verticalLineTo(9.665f)
                curveTo(2.1f, 9.135f, 2.1f, 8.684f, 2.13f, 8.313f)
                curveTo(2.162f, 7.924f, 2.232f, 7.545f, 2.416f, 7.183f)
                curveTo(2.694f, 6.638f, 3.138f, 6.194f, 3.683f, 5.916f)
                curveTo(4.045f, 5.732f, 4.424f, 5.662f, 4.813f, 5.63f)
                curveTo(5.184f, 5.6f, 5.635f, 5.6f, 6.165f, 5.6f)
                lineTo(7.1f, 5.6f)
                lineTo(7.1f, 4.57f)
                curveTo(7.1f, 4.316f, 7.1f, 4.074f, 7.117f, 3.87f)
                curveTo(7.135f, 3.647f, 7.177f, 3.392f, 7.307f, 3.137f)
                curveTo(7.489f, 2.78f, 7.78f, 2.489f, 8.137f, 2.307f)
                curveTo(8.392f, 2.177f, 8.648f, 2.135f, 8.87f, 2.117f)
                curveTo(9.074f, 2.1f, 9.316f, 2.1f, 9.57f, 2.1f)
                close()
                moveTo(15.1f, 4.0f)
                verticalLineTo(5.6f)
                horizontalLineTo(8.9f)
                verticalLineTo(4.0f)
                curveTo(8.9f, 3.945f, 8.945f, 3.9f, 9.0f, 3.9f)
                horizontalLineTo(15.0f)
                curveTo(15.055f, 3.9f, 15.1f, 3.945f, 15.1f, 4.0f)
                close()
                moveTo(5.8f, 7.4f)
                curveTo(4.985f, 7.4f, 4.792f, 7.411f, 4.66f, 7.454f)
                curveTo(4.325f, 7.563f, 4.063f, 7.825f, 3.954f, 8.16f)
                curveTo(3.911f, 8.292f, 3.9f, 8.485f, 3.9f, 9.3f)
                verticalLineTo(17.2f)
                curveTo(3.9f, 18.015f, 3.911f, 18.208f, 3.954f, 18.34f)
                curveTo(4.063f, 18.675f, 4.325f, 18.937f, 4.66f, 19.046f)
                curveTo(4.792f, 19.089f, 4.985f, 19.1f, 5.8f, 19.1f)
                horizontalLineTo(18.2f)
                curveTo(19.014f, 19.1f, 19.208f, 19.089f, 19.34f, 19.046f)
                curveTo(19.675f, 18.937f, 19.937f, 18.675f, 20.046f, 18.34f)
                curveTo(20.089f, 18.208f, 20.1f, 18.015f, 20.1f, 17.2f)
                verticalLineTo(9.3f)
                curveTo(20.1f, 8.485f, 20.089f, 8.292f, 20.046f, 8.16f)
                curveTo(19.937f, 7.825f, 19.675f, 7.563f, 19.34f, 7.454f)
                curveTo(19.208f, 7.411f, 19.014f, 7.4f, 18.2f, 7.4f)
                horizontalLineTo(5.8f)
                close()
            }
        }
        .build()
        return _businessbag!!
    }

private var _businessbag: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Businessbag, contentDescription = "")
    }
}
