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

public val MooBesideIconPack.Bulb: ImageVector
    get() {
        if (_bulb != null) {
            return _bulb!!
        }
        _bulb = Builder(name = "Bulb", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 2.101f)
                curveTo(7.913f, 2.101f, 4.6f, 5.414f, 4.6f, 9.501f)
                curveTo(4.6f, 12.262f, 6.112f, 14.668f, 8.35f, 15.939f)
                lineTo(8.35f, 16.134f)
                curveTo(8.35f, 16.526f, 8.35f, 16.872f, 8.374f, 17.16f)
                curveTo(8.399f, 17.465f, 8.455f, 17.782f, 8.612f, 18.091f)
                curveTo(8.842f, 18.542f, 9.209f, 18.909f, 9.661f, 19.139f)
                curveTo(9.969f, 19.297f, 10.286f, 19.353f, 10.592f, 19.378f)
                curveTo(10.879f, 19.401f, 11.225f, 19.401f, 11.617f, 19.401f)
                horizontalLineTo(12.383f)
                curveTo(12.775f, 19.401f, 13.121f, 19.401f, 13.409f, 19.378f)
                curveTo(13.714f, 19.353f, 14.031f, 19.297f, 14.34f, 19.139f)
                curveTo(14.791f, 18.909f, 15.158f, 18.542f, 15.389f, 18.091f)
                curveTo(15.546f, 17.782f, 15.602f, 17.465f, 15.627f, 17.16f)
                curveTo(15.65f, 16.872f, 15.65f, 16.526f, 15.65f, 16.135f)
                lineTo(15.65f, 15.939f)
                curveTo(17.888f, 14.668f, 19.4f, 12.262f, 19.4f, 9.501f)
                curveTo(19.4f, 5.414f, 16.087f, 2.101f, 12.0f, 2.101f)
                close()
                moveTo(6.4f, 9.501f)
                curveTo(6.4f, 6.408f, 8.907f, 3.901f, 12.0f, 3.901f)
                curveTo(15.093f, 3.901f, 17.6f, 6.408f, 17.6f, 9.501f)
                curveTo(17.6f, 11.745f, 16.279f, 13.684f, 14.369f, 14.577f)
                curveTo(14.052f, 14.725f, 13.85f, 15.043f, 13.85f, 15.392f)
                verticalLineTo(16.401f)
                curveTo(13.85f, 17.029f, 13.839f, 17.13f, 13.821f, 17.186f)
                curveTo(13.761f, 17.369f, 13.618f, 17.512f, 13.436f, 17.572f)
                curveTo(13.379f, 17.59f, 13.279f, 17.601f, 12.65f, 17.601f)
                horizontalLineTo(11.35f)
                curveTo(10.722f, 17.601f, 10.621f, 17.59f, 10.565f, 17.572f)
                curveTo(10.382f, 17.512f, 10.239f, 17.369f, 10.179f, 17.186f)
                curveTo(10.161f, 17.13f, 10.15f, 17.029f, 10.15f, 16.401f)
                verticalLineTo(15.392f)
                curveTo(10.15f, 15.043f, 9.948f, 14.725f, 9.631f, 14.577f)
                curveTo(7.721f, 13.684f, 6.4f, 11.745f, 6.4f, 9.501f)
                close()
            }
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.75f, 21.101f)
                curveTo(9.253f, 21.101f, 8.85f, 21.504f, 8.85f, 22.001f)
                curveTo(8.85f, 22.499f, 9.253f, 22.902f, 9.75f, 22.902f)
                horizontalLineTo(14.25f)
                curveTo(14.747f, 22.902f, 15.15f, 22.499f, 15.15f, 22.001f)
                curveTo(15.15f, 21.504f, 14.747f, 21.101f, 14.25f, 21.101f)
                horizontalLineTo(9.75f)
                close()
            }
        }
        .build()
        return _bulb!!
    }

private var _bulb: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Bulb, contentDescription = "")
    }
}
