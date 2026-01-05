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

public val MooBesideIconPack.Ticket: ImageVector
    get() {
        if (_ticket != null) {
            return _ticket!!
        }
        _ticket = Builder(name = "Ticket", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.364f, 7.12f)
                curveTo(11.715f, 6.768f, 12.285f, 6.768f, 12.637f, 7.12f)
                lineTo(13.52f, 8.004f)
                curveTo(13.872f, 8.355f, 13.872f, 8.925f, 13.52f, 9.277f)
                curveTo(13.169f, 9.628f, 12.599f, 9.628f, 12.248f, 9.277f)
                lineTo(11.364f, 8.393f)
                curveTo(11.012f, 8.041f, 11.012f, 7.471f, 11.364f, 7.12f)
                close()
            }
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.722f, 10.479f)
                curveTo(15.074f, 10.127f, 15.644f, 10.127f, 15.995f, 10.479f)
                lineTo(16.879f, 11.363f)
                curveTo(17.231f, 11.714f, 17.231f, 12.284f, 16.879f, 12.635f)
                curveTo(16.528f, 12.987f, 15.958f, 12.987f, 15.606f, 12.635f)
                lineTo(14.722f, 11.751f)
                curveTo(14.371f, 11.4f, 14.371f, 10.83f, 14.722f, 10.479f)
                close()
            }
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.948f, 9.586f)
                curveTo(3.377f, 10.157f, 2.909f, 10.625f, 2.56f, 11.035f)
                curveTo(2.199f, 11.461f, 1.913f, 11.884f, 1.75f, 12.385f)
                curveTo(1.496f, 13.168f, 1.496f, 14.012f, 1.75f, 14.795f)
                curveTo(2.018f, 15.62f, 2.653f, 16.289f, 3.488f, 17.132f)
                curveTo(3.765f, 17.412f, 4.193f, 17.479f, 4.543f, 17.297f)
                curveTo(5.147f, 16.982f, 5.909f, 17.08f, 6.414f, 17.585f)
                curveTo(6.919f, 18.09f, 7.017f, 18.852f, 6.702f, 19.456f)
                curveTo(6.52f, 19.806f, 6.587f, 20.234f, 6.867f, 20.511f)
                curveTo(7.71f, 21.347f, 8.379f, 21.981f, 9.204f, 22.249f)
                curveTo(9.987f, 22.503f, 10.831f, 22.503f, 11.614f, 22.249f)
                curveTo(12.115f, 22.086f, 12.538f, 21.8f, 12.964f, 21.439f)
                curveTo(13.374f, 21.09f, 13.842f, 20.623f, 14.413f, 20.051f)
                lineTo(20.052f, 14.412f)
                curveTo(20.624f, 13.84f, 21.091f, 13.373f, 21.44f, 12.962f)
                curveTo(21.801f, 12.537f, 22.087f, 12.113f, 22.25f, 11.613f)
                curveTo(22.505f, 10.83f, 22.505f, 9.986f, 22.25f, 9.203f)
                curveTo(21.982f, 8.378f, 21.348f, 7.709f, 20.513f, 6.866f)
                curveTo(20.235f, 6.585f, 19.807f, 6.519f, 19.457f, 6.701f)
                curveTo(18.853f, 7.016f, 18.092f, 6.918f, 17.586f, 6.413f)
                curveTo(17.081f, 5.907f, 16.983f, 5.146f, 17.298f, 4.542f)
                curveTo(17.48f, 4.192f, 17.414f, 3.764f, 17.133f, 3.486f)
                curveTo(16.29f, 2.651f, 15.621f, 2.017f, 14.796f, 1.749f)
                curveTo(14.013f, 1.494f, 13.169f, 1.494f, 12.386f, 1.749f)
                curveTo(11.885f, 1.912f, 11.462f, 2.198f, 11.037f, 2.559f)
                curveTo(10.626f, 2.908f, 10.159f, 3.375f, 9.587f, 3.946f)
                lineTo(3.948f, 9.586f)
                close()
                moveTo(3.588f, 12.636f)
                curveTo(3.723f, 12.372f, 3.984f, 12.095f, 4.823f, 11.256f)
                lineTo(11.258f, 4.822f)
                curveTo(12.097f, 3.982f, 12.373f, 3.722f, 12.638f, 3.587f)
                curveTo(13.237f, 3.282f, 13.946f, 3.282f, 14.545f, 3.587f)
                curveTo(14.748f, 3.691f, 14.963f, 3.872f, 15.448f, 4.348f)
                curveTo(15.121f, 5.495f, 15.409f, 6.781f, 16.313f, 7.686f)
                curveTo(17.218f, 8.59f, 18.504f, 8.878f, 19.651f, 8.551f)
                curveTo(20.127f, 9.036f, 20.308f, 9.25f, 20.412f, 9.454f)
                curveTo(20.717f, 10.053f, 20.717f, 10.762f, 20.412f, 11.361f)
                curveTo(20.277f, 11.625f, 20.017f, 11.902f, 19.177f, 12.741f)
                lineTo(12.743f, 19.176f)
                curveTo(11.903f, 20.015f, 11.627f, 20.276f, 11.363f, 20.411f)
                curveTo(10.764f, 20.716f, 10.055f, 20.716f, 9.456f, 20.411f)
                curveTo(9.252f, 20.307f, 9.038f, 20.125f, 8.552f, 19.649f)
                curveTo(8.879f, 18.502f, 8.591f, 17.217f, 7.687f, 16.312f)
                curveTo(6.782f, 15.408f, 5.497f, 15.12f, 4.349f, 15.447f)
                curveTo(3.874f, 14.961f, 3.692f, 14.747f, 3.588f, 14.543f)
                curveTo(3.283f, 13.944f, 3.283f, 13.235f, 3.588f, 12.636f)
                close()
            }
        }
        .build()
        return _ticket!!
    }

private var _ticket: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Ticket, contentDescription = "")
    }
}
