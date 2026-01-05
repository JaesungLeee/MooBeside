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

public val MooBesideIconPack.Link: ImageVector
    get() {
        if (_link != null) {
            return _link!!
        }
        _link = Builder(name = "Link", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.071f, 2.767f)
                curveTo(17.41f, 2.774f, 18.754f, 3.339f, 19.707f, 4.292f)
                curveTo(20.666f, 5.251f, 21.226f, 6.577f, 21.233f, 7.929f)
                lineTo(21.233f, 7.934f)
                curveTo(21.233f, 9.082f, 20.837f, 10.08f, 20.094f, 11.057f)
                lineTo(20.086f, 11.068f)
                curveTo(19.744f, 11.504f, 19.273f, 12.01f, 18.505f, 12.778f)
                lineTo(17.763f, 13.52f)
                curveTo(17.411f, 13.872f, 16.841f, 13.872f, 16.49f, 13.52f)
                curveTo(16.139f, 13.169f, 16.139f, 12.599f, 16.49f, 12.247f)
                lineTo(17.233f, 11.505f)
                curveTo(17.988f, 10.749f, 18.394f, 10.307f, 18.665f, 9.962f)
                curveTo(19.217f, 9.236f, 19.433f, 8.613f, 19.433f, 7.936f)
                curveTo(19.428f, 7.065f, 19.062f, 6.193f, 18.435f, 5.565f)
                curveTo(17.813f, 4.944f, 16.923f, 4.572f, 16.063f, 4.567f)
                curveTo(15.387f, 4.567f, 14.788f, 4.771f, 14.042f, 5.341f)
                curveTo(13.663f, 5.635f, 13.216f, 6.046f, 12.495f, 6.767f)
                lineTo(11.752f, 7.51f)
                curveTo(11.401f, 7.861f, 10.831f, 7.861f, 10.479f, 7.51f)
                curveTo(10.128f, 7.158f, 10.128f, 6.588f, 10.48f, 6.237f)
                lineTo(11.222f, 5.494f)
                curveTo(11.955f, 4.762f, 12.468f, 4.284f, 12.942f, 3.917f)
                lineTo(12.946f, 3.914f)
                curveTo(13.942f, 3.151f, 14.917f, 2.767f, 16.066f, 2.767f)
                lineTo(16.071f, 2.767f)
                close()
            }
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.5f, 8.5f)
                curveTo(15.852f, 8.851f, 15.852f, 9.421f, 15.5f, 9.772f)
                lineTo(9.773f, 15.5f)
                curveTo(9.421f, 15.852f, 8.851f, 15.852f, 8.5f, 15.5f)
                curveTo(8.148f, 15.149f, 8.148f, 14.579f, 8.5f, 14.227f)
                lineTo(14.227f, 8.5f)
                curveTo(14.579f, 8.148f, 15.149f, 8.148f, 15.5f, 8.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.51f, 10.479f)
                curveTo(7.861f, 10.831f, 7.861f, 11.401f, 7.51f, 11.752f)
                lineTo(6.767f, 12.495f)
                curveTo(6.047f, 13.216f, 5.635f, 13.663f, 5.342f, 14.042f)
                curveTo(4.771f, 14.788f, 4.567f, 15.387f, 4.567f, 16.063f)
                curveTo(4.572f, 16.923f, 4.944f, 17.813f, 5.565f, 18.435f)
                curveTo(6.193f, 19.062f, 7.066f, 19.428f, 7.937f, 19.433f)
                curveTo(8.613f, 19.433f, 9.236f, 19.217f, 9.962f, 18.665f)
                curveTo(10.307f, 18.394f, 10.75f, 17.988f, 11.505f, 17.233f)
                lineTo(12.248f, 16.49f)
                curveTo(12.599f, 16.139f, 13.169f, 16.139f, 13.52f, 16.49f)
                curveTo(13.872f, 16.841f, 13.872f, 17.411f, 13.52f, 17.763f)
                lineTo(12.778f, 18.505f)
                curveTo(12.01f, 19.273f, 11.504f, 19.744f, 11.068f, 20.086f)
                lineTo(11.057f, 20.094f)
                curveTo(10.08f, 20.837f, 9.082f, 21.233f, 7.934f, 21.233f)
                lineTo(7.929f, 21.233f)
                curveTo(6.577f, 21.226f, 5.251f, 20.666f, 4.293f, 19.707f)
                curveTo(3.34f, 18.754f, 2.774f, 17.41f, 2.767f, 16.071f)
                lineTo(2.767f, 16.066f)
                curveTo(2.767f, 14.917f, 3.151f, 13.942f, 3.914f, 12.946f)
                lineTo(3.917f, 12.942f)
                curveTo(4.284f, 12.468f, 4.762f, 11.955f, 5.495f, 11.222f)
                lineTo(6.237f, 10.48f)
                curveTo(6.588f, 10.128f, 7.158f, 10.128f, 7.51f, 10.479f)
                close()
            }
        }
        .build()
        return _link!!
    }

private var _link: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Link, contentDescription = "")
    }
}
