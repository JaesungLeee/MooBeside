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

public val MooBesideIconPack.Camera: ImageVector
    get() {
        if (_camera != null) {
            return _camera!!
        }
        _camera = Builder(name = "Camera", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 7.6f)
                curveTo(9.294f, 7.6f, 7.1f, 9.794f, 7.1f, 12.5f)
                curveTo(7.1f, 15.206f, 9.294f, 17.4f, 12.0f, 17.4f)
                curveTo(14.706f, 17.4f, 16.9f, 15.206f, 16.9f, 12.5f)
                curveTo(16.9f, 9.794f, 14.706f, 7.6f, 12.0f, 7.6f)
                close()
                moveTo(8.9f, 12.5f)
                curveTo(8.9f, 10.788f, 10.288f, 9.4f, 12.0f, 9.4f)
                curveTo(13.712f, 9.4f, 15.1f, 10.788f, 15.1f, 12.5f)
                curveTo(15.1f, 14.212f, 13.712f, 15.6f, 12.0f, 15.6f)
                curveTo(10.288f, 15.6f, 8.9f, 14.212f, 8.9f, 12.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(10.659f, 2.35f)
                curveTo(10.197f, 2.35f, 9.807f, 2.349f, 9.434f, 2.45f)
                curveTo(9.106f, 2.538f, 8.796f, 2.683f, 8.518f, 2.879f)
                curveTo(8.202f, 3.101f, 7.952f, 3.401f, 7.657f, 3.757f)
                lineTo(6.329f, 5.35f)
                lineTo(5.665f, 5.35f)
                curveTo(5.135f, 5.35f, 4.684f, 5.35f, 4.313f, 5.38f)
                curveTo(3.924f, 5.412f, 3.546f, 5.482f, 3.184f, 5.666f)
                curveTo(2.638f, 5.944f, 2.194f, 6.388f, 1.916f, 6.934f)
                curveTo(1.732f, 7.296f, 1.662f, 7.674f, 1.63f, 8.063f)
                curveTo(1.6f, 8.434f, 1.6f, 8.885f, 1.6f, 9.415f)
                verticalLineTo(17.086f)
                curveTo(1.6f, 17.615f, 1.6f, 18.067f, 1.63f, 18.437f)
                curveTo(1.662f, 18.826f, 1.732f, 19.205f, 1.916f, 19.567f)
                curveTo(2.194f, 20.112f, 2.638f, 20.556f, 3.184f, 20.834f)
                curveTo(3.546f, 21.018f, 3.924f, 21.088f, 4.313f, 21.12f)
                curveTo(4.684f, 21.15f, 5.135f, 21.15f, 5.665f, 21.15f)
                horizontalLineTo(18.336f)
                curveTo(18.865f, 21.15f, 19.317f, 21.15f, 19.687f, 21.12f)
                curveTo(20.076f, 21.088f, 20.455f, 21.018f, 20.817f, 20.834f)
                curveTo(21.362f, 20.556f, 21.806f, 20.112f, 22.084f, 19.567f)
                curveTo(22.268f, 19.205f, 22.338f, 18.826f, 22.37f, 18.437f)
                curveTo(22.4f, 18.067f, 22.4f, 17.615f, 22.4f, 17.086f)
                verticalLineTo(9.415f)
                curveTo(22.4f, 8.885f, 22.4f, 8.434f, 22.37f, 8.063f)
                curveTo(22.338f, 7.674f, 22.268f, 7.296f, 22.084f, 6.934f)
                curveTo(21.806f, 6.388f, 21.362f, 5.944f, 20.817f, 5.666f)
                curveTo(20.455f, 5.482f, 20.076f, 5.412f, 19.687f, 5.38f)
                curveTo(19.317f, 5.35f, 18.865f, 5.35f, 18.336f, 5.35f)
                lineTo(17.672f, 5.35f)
                lineTo(16.344f, 3.756f)
                curveTo(16.048f, 3.401f, 15.798f, 3.101f, 15.482f, 2.879f)
                curveTo(15.205f, 2.683f, 14.895f, 2.538f, 14.567f, 2.45f)
                curveTo(14.194f, 2.349f, 13.804f, 2.35f, 13.341f, 2.35f)
                lineTo(10.659f, 2.35f)
                close()
                moveTo(9.995f, 4.167f)
                curveTo(10.072f, 4.154f, 10.163f, 4.15f, 10.562f, 4.15f)
                horizontalLineTo(13.439f)
                curveTo(13.838f, 4.15f, 13.928f, 4.153f, 14.005f, 4.167f)
                curveTo(14.196f, 4.201f, 14.375f, 4.285f, 14.523f, 4.409f)
                curveTo(14.583f, 4.46f, 14.643f, 4.527f, 14.898f, 4.834f)
                lineTo(16.349f, 6.575f)
                lineTo(16.361f, 6.589f)
                curveTo(16.404f, 6.641f, 16.484f, 6.738f, 16.582f, 6.82f)
                curveTo(16.771f, 6.979f, 16.998f, 7.086f, 17.241f, 7.129f)
                curveTo(17.367f, 7.151f, 17.493f, 7.151f, 17.56f, 7.15f)
                lineTo(17.579f, 7.15f)
                horizontalLineTo(18.7f)
                curveTo(19.515f, 7.15f, 19.709f, 7.161f, 19.84f, 7.204f)
                curveTo(20.175f, 7.313f, 20.438f, 7.575f, 20.546f, 7.91f)
                curveTo(20.589f, 8.042f, 20.6f, 8.236f, 20.6f, 9.05f)
                verticalLineTo(17.45f)
                curveTo(20.6f, 18.265f, 20.589f, 18.459f, 20.546f, 18.59f)
                curveTo(20.438f, 18.925f, 20.175f, 19.188f, 19.84f, 19.296f)
                curveTo(19.709f, 19.339f, 19.515f, 19.35f, 18.7f, 19.35f)
                horizontalLineTo(5.3f)
                curveTo(4.486f, 19.35f, 4.292f, 19.339f, 4.16f, 19.296f)
                curveTo(3.825f, 19.188f, 3.563f, 18.925f, 3.454f, 18.59f)
                curveTo(3.411f, 18.459f, 3.4f, 18.265f, 3.4f, 17.45f)
                verticalLineTo(9.05f)
                curveTo(3.4f, 8.236f, 3.411f, 8.042f, 3.454f, 7.91f)
                curveTo(3.563f, 7.575f, 3.825f, 7.313f, 4.16f, 7.204f)
                curveTo(4.292f, 7.161f, 4.486f, 7.15f, 5.3f, 7.15f)
                horizontalLineTo(6.423f)
                lineTo(6.441f, 7.15f)
                curveTo(6.508f, 7.151f, 6.634f, 7.151f, 6.761f, 7.129f)
                curveTo(7.004f, 7.086f, 7.231f, 6.979f, 7.419f, 6.82f)
                curveTo(7.517f, 6.737f, 7.598f, 6.64f, 7.64f, 6.589f)
                lineTo(7.652f, 6.574f)
                lineTo(9.102f, 4.834f)
                curveTo(9.358f, 4.527f, 9.418f, 4.46f, 9.478f, 4.41f)
                curveTo(9.626f, 4.285f, 9.804f, 4.201f, 9.995f, 4.167f)
                close()
            }
        }
        .build()
        return _camera!!
    }

private var _camera: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Camera, contentDescription = "")
    }
}
