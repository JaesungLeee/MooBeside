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

public val MooBesideIconPack.Setting: ImageVector
    get() {
        if (_setting != null) {
            return _setting!!
        }
        _setting = Builder(name = "Setting", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.05f, 12.0f)
                curveTo(8.05f, 9.818f, 9.818f, 8.05f, 12.0f, 8.05f)
                curveTo(14.181f, 8.05f, 15.95f, 9.818f, 15.95f, 12.0f)
                curveTo(15.95f, 14.182f, 14.181f, 15.95f, 12.0f, 15.95f)
                curveTo(9.818f, 15.95f, 8.05f, 14.182f, 8.05f, 12.0f)
                close()
                moveTo(12.0f, 9.95f)
                curveTo(10.868f, 9.95f, 9.95f, 10.868f, 9.95f, 12.0f)
                curveTo(9.95f, 13.132f, 10.868f, 14.05f, 12.0f, 14.05f)
                curveTo(13.132f, 14.05f, 14.05f, 13.132f, 14.05f, 12.0f)
                curveTo(14.05f, 10.868f, 13.132f, 9.95f, 12.0f, 9.95f)
                close()
            }
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(10.131f, 1.971f)
                curveTo(10.738f, 1.858f, 11.362f, 1.8f, 12.0f, 1.8f)
                curveTo(12.637f, 1.8f, 13.262f, 1.858f, 13.868f, 1.971f)
                curveTo(14.91f, 2.164f, 15.35f, 3.113f, 15.493f, 3.704f)
                curveTo(15.589f, 4.105f, 15.841f, 4.463f, 16.225f, 4.684f)
                curveTo(16.607f, 4.905f, 17.044f, 4.945f, 17.438f, 4.829f)
                curveTo(18.021f, 4.657f, 19.061f, 4.564f, 19.749f, 5.367f)
                curveTo(20.559f, 6.313f, 21.199f, 7.409f, 21.622f, 8.609f)
                curveTo(21.974f, 9.606f, 21.372f, 10.46f, 20.932f, 10.878f)
                curveTo(20.634f, 11.162f, 20.45f, 11.56f, 20.45f, 12.002f)
                curveTo(20.45f, 12.444f, 20.633f, 12.842f, 20.932f, 13.126f)
                curveTo(21.372f, 13.544f, 21.972f, 14.399f, 21.621f, 15.396f)
                curveTo(21.196f, 16.597f, 20.554f, 17.695f, 19.742f, 18.641f)
                curveTo(19.055f, 19.441f, 18.018f, 19.35f, 17.436f, 19.18f)
                curveTo(17.042f, 19.064f, 16.607f, 19.104f, 16.225f, 19.324f)
                curveTo(15.843f, 19.545f, 15.591f, 19.902f, 15.494f, 20.301f)
                curveTo(15.35f, 20.89f, 14.91f, 21.836f, 13.871f, 22.028f)
                curveTo(13.264f, 22.141f, 12.638f, 22.2f, 12.0f, 22.2f)
                curveTo(11.361f, 22.2f, 10.736f, 22.141f, 10.129f, 22.028f)
                curveTo(9.09f, 21.836f, 8.649f, 20.89f, 8.506f, 20.3f)
                curveTo(8.409f, 19.901f, 8.157f, 19.544f, 7.775f, 19.323f)
                curveTo(7.393f, 19.103f, 6.957f, 19.063f, 6.563f, 19.179f)
                curveTo(5.981f, 19.349f, 4.944f, 19.44f, 4.257f, 18.64f)
                curveTo(3.446f, 17.695f, 2.804f, 16.598f, 2.38f, 15.398f)
                curveTo(2.028f, 14.401f, 2.628f, 13.546f, 3.068f, 13.128f)
                curveTo(3.366f, 12.844f, 3.55f, 12.447f, 3.55f, 12.005f)
                curveTo(3.55f, 11.562f, 3.366f, 11.164f, 3.067f, 10.88f)
                curveTo(2.627f, 10.462f, 2.025f, 9.608f, 2.376f, 8.611f)
                curveTo(2.799f, 7.411f, 3.439f, 6.314f, 4.249f, 5.369f)
                curveTo(4.937f, 4.566f, 5.977f, 4.658f, 6.561f, 4.83f)
                curveTo(6.955f, 4.946f, 7.392f, 4.907f, 7.775f, 4.686f)
                curveTo(8.158f, 4.464f, 8.411f, 4.106f, 8.507f, 3.705f)
                curveTo(8.649f, 3.114f, 9.089f, 2.164f, 10.131f, 1.971f)
                close()
                moveTo(10.499f, 3.835f)
                curveTo(10.494f, 3.839f, 10.488f, 3.846f, 10.48f, 3.856f)
                curveTo(10.439f, 3.91f, 10.388f, 4.01f, 10.354f, 4.149f)
                curveTo(10.141f, 5.035f, 9.578f, 5.839f, 8.725f, 6.331f)
                curveTo(7.873f, 6.823f, 6.896f, 6.91f, 6.023f, 6.652f)
                curveTo(5.886f, 6.612f, 5.774f, 6.606f, 5.707f, 6.615f)
                curveTo(5.694f, 6.617f, 5.685f, 6.619f, 5.678f, 6.621f)
                curveTo(5.03f, 7.382f, 4.517f, 8.262f, 4.176f, 9.222f)
                curveTo(4.178f, 9.227f, 4.18f, 9.236f, 4.185f, 9.248f)
                curveTo(4.211f, 9.311f, 4.272f, 9.405f, 4.375f, 9.503f)
                curveTo(5.036f, 10.13f, 5.45f, 11.02f, 5.45f, 12.005f)
                curveTo(5.45f, 12.988f, 5.037f, 13.877f, 4.378f, 14.504f)
                curveTo(4.274f, 14.602f, 4.213f, 14.696f, 4.188f, 14.759f)
                curveTo(4.183f, 14.771f, 4.18f, 14.78f, 4.179f, 14.786f)
                curveTo(4.521f, 15.746f, 5.035f, 16.625f, 5.685f, 17.387f)
                curveTo(5.691f, 17.388f, 5.7f, 17.39f, 5.713f, 17.392f)
                curveTo(5.78f, 17.401f, 5.892f, 17.395f, 6.029f, 17.355f)
                curveTo(6.9f, 17.1f, 7.874f, 17.187f, 8.725f, 17.678f)
                curveTo(9.575f, 18.169f, 10.138f, 18.969f, 10.352f, 19.851f)
                curveTo(10.386f, 19.99f, 10.437f, 20.09f, 10.479f, 20.143f)
                curveTo(10.486f, 20.153f, 10.493f, 20.16f, 10.497f, 20.164f)
                curveTo(10.984f, 20.253f, 11.486f, 20.3f, 12.0f, 20.3f)
                curveTo(12.514f, 20.3f, 13.016f, 20.253f, 13.503f, 20.164f)
                curveTo(13.507f, 20.16f, 13.514f, 20.153f, 13.521f, 20.143f)
                curveTo(13.563f, 20.09f, 13.614f, 19.99f, 13.648f, 19.851f)
                curveTo(13.862f, 18.969f, 14.425f, 18.17f, 15.275f, 17.679f)
                curveTo(16.125f, 17.188f, 17.099f, 17.101f, 17.971f, 17.356f)
                curveTo(18.107f, 17.396f, 18.219f, 17.402f, 18.286f, 17.393f)
                curveTo(18.299f, 17.391f, 18.308f, 17.389f, 18.314f, 17.387f)
                curveTo(18.965f, 16.625f, 19.479f, 15.745f, 19.822f, 14.784f)
                curveTo(19.82f, 14.778f, 19.817f, 14.769f, 19.812f, 14.758f)
                curveTo(19.787f, 14.695f, 19.726f, 14.601f, 19.622f, 14.502f)
                curveTo(18.963f, 13.875f, 18.55f, 12.986f, 18.55f, 12.002f)
                curveTo(18.55f, 11.018f, 18.963f, 10.128f, 19.623f, 9.501f)
                curveTo(19.727f, 9.403f, 19.788f, 9.309f, 19.814f, 9.246f)
                curveTo(19.818f, 9.234f, 19.821f, 9.225f, 19.823f, 9.219f)
                curveTo(19.482f, 8.26f, 18.969f, 7.381f, 18.32f, 6.62f)
                curveTo(18.314f, 6.618f, 18.305f, 6.616f, 18.292f, 6.614f)
                curveTo(18.225f, 6.605f, 18.112f, 6.611f, 17.975f, 6.651f)
                curveTo(17.103f, 6.908f, 16.126f, 6.822f, 15.275f, 6.33f)
                curveTo(14.422f, 5.838f, 13.859f, 5.035f, 13.645f, 4.149f)
                curveTo(13.612f, 4.01f, 13.561f, 3.91f, 13.519f, 3.856f)
                curveTo(13.511f, 3.846f, 13.505f, 3.839f, 13.501f, 3.835f)
                curveTo(13.015f, 3.746f, 12.513f, 3.7f, 12.0f, 3.7f)
                curveTo(11.486f, 3.7f, 10.985f, 3.746f, 10.499f, 3.835f)
                close()
                moveTo(19.825f, 9.209f)
                lineTo(19.825f, 9.211f)
                close()
                moveTo(19.824f, 14.795f)
                lineTo(19.824f, 14.792f)
                close()
                moveTo(4.176f, 14.796f)
                lineTo(4.177f, 14.794f)
                close()
                moveTo(4.174f, 9.211f)
                lineTo(4.174f, 9.213f)
                close()
            }
        }
        .build()
        return _setting!!
    }

private var _setting: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Setting, contentDescription = "")
    }
}
