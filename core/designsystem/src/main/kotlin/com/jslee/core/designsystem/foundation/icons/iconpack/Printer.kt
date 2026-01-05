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

public val MooBesideIconPack.Printer: ImageVector
    get() {
        if (_printer != null) {
            return _printer!!
        }
        _printer = Builder(name = "Printer", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.25f, 9.85f)
                curveTo(14.753f, 9.85f, 14.35f, 10.253f, 14.35f, 10.75f)
                curveTo(14.35f, 11.247f, 14.753f, 11.65f, 15.25f, 11.65f)
                horizontalLineTo(17.25f)
                curveTo(17.747f, 11.65f, 18.15f, 11.247f, 18.15f, 10.75f)
                curveTo(18.15f, 10.253f, 17.747f, 9.85f, 17.25f, 9.85f)
                horizontalLineTo(15.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(19.771f, 6.525f)
                curveTo(19.346f, 6.309f, 18.894f, 6.209f, 18.4f, 6.158f)
                curveTo(18.4f, 5.631f, 18.4f, 5.182f, 18.37f, 4.813f)
                curveTo(18.338f, 4.424f, 18.268f, 4.045f, 18.084f, 3.684f)
                curveTo(17.806f, 3.138f, 17.362f, 2.694f, 16.817f, 2.416f)
                curveTo(16.455f, 2.232f, 16.076f, 2.162f, 15.687f, 2.13f)
                curveTo(15.317f, 2.1f, 14.866f, 2.1f, 14.336f, 2.1f)
                horizontalLineTo(9.665f)
                curveTo(9.135f, 2.1f, 8.684f, 2.1f, 8.313f, 2.13f)
                curveTo(7.924f, 2.162f, 7.546f, 2.232f, 7.184f, 2.416f)
                curveTo(6.638f, 2.694f, 6.194f, 3.138f, 5.916f, 3.684f)
                curveTo(5.732f, 4.045f, 5.662f, 4.424f, 5.63f, 4.813f)
                curveTo(5.6f, 5.182f, 5.6f, 5.631f, 5.6f, 6.158f)
                curveTo(5.106f, 6.209f, 4.654f, 6.309f, 4.23f, 6.525f)
                curveTo(3.496f, 6.899f, 2.899f, 7.496f, 2.525f, 8.229f)
                curveTo(2.286f, 8.698f, 2.189f, 9.2f, 2.144f, 9.756f)
                curveTo(2.1f, 10.293f, 2.1f, 10.954f, 2.1f, 11.762f)
                verticalLineTo(12.988f)
                curveTo(2.1f, 13.796f, 2.1f, 14.457f, 2.144f, 14.994f)
                curveTo(2.189f, 15.55f, 2.286f, 16.052f, 2.525f, 16.521f)
                curveTo(2.899f, 17.254f, 3.496f, 17.851f, 4.23f, 18.225f)
                curveTo(4.655f, 18.442f, 5.108f, 18.542f, 5.604f, 18.592f)
                curveTo(5.608f, 18.809f, 5.616f, 19.007f, 5.63f, 19.186f)
                curveTo(5.662f, 19.576f, 5.732f, 19.954f, 5.916f, 20.316f)
                curveTo(6.194f, 20.862f, 6.638f, 21.305f, 7.184f, 21.583f)
                curveTo(7.546f, 21.768f, 7.924f, 21.837f, 8.313f, 21.869f)
                curveTo(8.684f, 21.899f, 9.135f, 21.899f, 9.665f, 21.899f)
                horizontalLineTo(14.336f)
                curveTo(14.865f, 21.899f, 15.317f, 21.899f, 15.687f, 21.869f)
                curveTo(16.076f, 21.837f, 16.455f, 21.768f, 16.817f, 21.583f)
                curveTo(17.362f, 21.305f, 17.806f, 20.862f, 18.084f, 20.316f)
                curveTo(18.268f, 19.954f, 18.338f, 19.576f, 18.37f, 19.186f)
                curveTo(18.385f, 19.007f, 18.392f, 18.809f, 18.396f, 18.592f)
                curveTo(18.892f, 18.542f, 19.345f, 18.442f, 19.771f, 18.225f)
                curveTo(20.504f, 17.851f, 21.101f, 17.254f, 21.475f, 16.521f)
                curveTo(21.714f, 16.052f, 21.811f, 15.55f, 21.856f, 14.994f)
                curveTo(21.9f, 14.457f, 21.9f, 13.796f, 21.9f, 12.988f)
                verticalLineTo(11.762f)
                curveTo(21.9f, 10.954f, 21.9f, 10.293f, 21.856f, 9.756f)
                curveTo(21.811f, 9.2f, 21.714f, 8.698f, 21.475f, 8.229f)
                curveTo(21.101f, 7.496f, 20.504f, 6.899f, 19.771f, 6.525f)
                close()
                moveTo(7.4f, 5.8f)
                verticalLineTo(6.1f)
                curveTo(7.518f, 6.1f, 7.638f, 6.1f, 7.762f, 6.1f)
                horizontalLineTo(16.238f)
                curveTo(16.362f, 6.1f, 16.483f, 6.1f, 16.6f, 6.1f)
                verticalLineTo(5.8f)
                curveTo(16.6f, 4.986f, 16.589f, 4.792f, 16.546f, 4.66f)
                curveTo(16.438f, 4.325f, 16.175f, 4.063f, 15.84f, 3.954f)
                curveTo(15.709f, 3.911f, 15.515f, 3.9f, 14.7f, 3.9f)
                horizontalLineTo(9.3f)
                curveTo(8.486f, 3.9f, 8.292f, 3.911f, 8.16f, 3.954f)
                curveTo(7.825f, 4.063f, 7.563f, 4.325f, 7.454f, 4.66f)
                curveTo(7.411f, 4.792f, 7.4f, 4.986f, 7.4f, 5.8f)
                close()
                moveTo(18.393f, 16.779f)
                curveTo(18.657f, 16.741f, 18.824f, 16.687f, 18.954f, 16.621f)
                curveTo(19.349f, 16.42f, 19.67f, 16.098f, 19.871f, 15.703f)
                curveTo(19.959f, 15.53f, 20.026f, 15.292f, 20.062f, 14.847f)
                curveTo(20.099f, 14.392f, 20.1f, 13.805f, 20.1f, 12.95f)
                verticalLineTo(11.8f)
                curveTo(20.1f, 10.945f, 20.099f, 10.358f, 20.062f, 9.903f)
                curveTo(20.026f, 9.458f, 19.959f, 9.219f, 19.871f, 9.047f)
                curveTo(19.67f, 8.651f, 19.349f, 8.33f, 18.954f, 8.129f)
                curveTo(18.781f, 8.041f, 18.542f, 7.974f, 18.097f, 7.938f)
                curveTo(17.642f, 7.901f, 17.055f, 7.9f, 16.2f, 7.9f)
                horizontalLineTo(7.8f)
                curveTo(6.945f, 7.9f, 6.358f, 7.901f, 5.903f, 7.938f)
                curveTo(5.458f, 7.974f, 5.22f, 8.041f, 5.047f, 8.129f)
                curveTo(4.652f, 8.33f, 4.33f, 8.651f, 4.129f, 9.047f)
                curveTo(4.041f, 9.219f, 3.974f, 9.458f, 3.938f, 9.903f)
                curveTo(3.901f, 10.358f, 3.9f, 10.945f, 3.9f, 11.8f)
                verticalLineTo(12.95f)
                curveTo(3.9f, 13.805f, 3.901f, 14.392f, 3.938f, 14.847f)
                curveTo(3.974f, 15.292f, 4.041f, 15.53f, 4.129f, 15.703f)
                curveTo(4.33f, 16.098f, 4.652f, 16.42f, 5.047f, 16.621f)
                curveTo(5.177f, 16.687f, 5.344f, 16.741f, 5.607f, 16.779f)
                curveTo(5.611f, 16.612f, 5.619f, 16.456f, 5.63f, 16.313f)
                curveTo(5.662f, 15.924f, 5.732f, 15.545f, 5.916f, 15.183f)
                curveTo(6.194f, 14.637f, 6.638f, 14.194f, 7.184f, 13.916f)
                curveTo(7.546f, 13.731f, 7.924f, 13.661f, 8.313f, 13.63f)
                curveTo(8.684f, 13.599f, 9.135f, 13.599f, 9.665f, 13.599f)
                horizontalLineTo(14.336f)
                curveTo(14.865f, 13.599f, 15.317f, 13.599f, 15.687f, 13.63f)
                curveTo(16.076f, 13.661f, 16.455f, 13.731f, 16.817f, 13.916f)
                curveTo(17.362f, 14.194f, 17.806f, 14.637f, 18.084f, 15.183f)
                curveTo(18.268f, 15.545f, 18.338f, 15.924f, 18.37f, 16.313f)
                curveTo(18.382f, 16.456f, 18.389f, 16.612f, 18.393f, 16.779f)
                close()
                moveTo(8.16f, 15.455f)
                curveTo(8.292f, 15.412f, 8.486f, 15.401f, 9.3f, 15.401f)
                horizontalLineTo(14.7f)
                curveTo(15.515f, 15.401f, 15.709f, 15.412f, 15.84f, 15.455f)
                curveTo(16.175f, 15.563f, 16.438f, 15.826f, 16.546f, 16.161f)
                curveTo(16.589f, 16.292f, 16.6f, 16.486f, 16.6f, 17.301f)
                verticalLineTo(18.201f)
                curveTo(16.6f, 19.015f, 16.589f, 19.209f, 16.546f, 19.34f)
                curveTo(16.438f, 19.675f, 16.175f, 19.938f, 15.84f, 20.047f)
                curveTo(15.709f, 20.09f, 15.515f, 20.101f, 14.7f, 20.101f)
                horizontalLineTo(9.3f)
                curveTo(8.486f, 20.101f, 8.292f, 20.09f, 8.16f, 20.047f)
                curveTo(7.825f, 19.938f, 7.563f, 19.675f, 7.454f, 19.34f)
                curveTo(7.411f, 19.209f, 7.4f, 19.015f, 7.4f, 18.201f)
                verticalLineTo(17.301f)
                curveTo(7.4f, 16.486f, 7.411f, 16.292f, 7.454f, 16.161f)
                curveTo(7.563f, 15.826f, 7.825f, 15.563f, 8.16f, 15.455f)
                close()
            }
        }
        .build()
        return _printer!!
    }

private var _printer: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Printer, contentDescription = "")
    }
}
