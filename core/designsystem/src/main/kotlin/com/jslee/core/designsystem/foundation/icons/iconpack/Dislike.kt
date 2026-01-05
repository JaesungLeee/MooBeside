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

public val MooBesideIconPack.Dislike: ImageVector
    get() {
        if (_dislike != null) {
            return _dislike!!
        }
        _dislike = Builder(name = "Dislike", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 21.65f)
                curveTo(12.971f, 21.65f, 13.847f, 21.063f, 14.216f, 20.165f)
                lineTo(17.105f, 13.15f)
                lineTo(20.225f, 13.15f)
                curveTo(20.345f, 13.15f, 20.483f, 13.15f, 20.604f, 13.14f)
                curveTo(20.743f, 13.128f, 20.937f, 13.1f, 21.138f, 12.997f)
                curveTo(21.401f, 12.863f, 21.616f, 12.649f, 21.75f, 12.385f)
                curveTo(21.852f, 12.184f, 21.881f, 11.99f, 21.893f, 11.851f)
                curveTo(21.903f, 11.73f, 21.902f, 11.592f, 21.902f, 11.472f)
                verticalLineTo(3.778f)
                curveTo(21.902f, 3.657f, 21.903f, 3.519f, 21.893f, 3.398f)
                curveTo(21.881f, 3.259f, 21.852f, 3.066f, 21.75f, 2.864f)
                curveTo(21.616f, 2.601f, 21.401f, 2.386f, 21.138f, 2.252f)
                curveTo(20.937f, 2.15f, 20.743f, 2.121f, 20.604f, 2.109f)
                curveTo(20.483f, 2.1f, 20.345f, 2.1f, 20.225f, 2.1f)
                lineTo(7.178f, 2.1f)
                curveTo(6.724f, 2.1f, 6.335f, 2.1f, 6.011f, 2.124f)
                curveTo(5.669f, 2.15f, 5.336f, 2.207f, 5.009f, 2.353f)
                curveTo(4.51f, 2.577f, 4.084f, 2.937f, 3.781f, 3.392f)
                curveTo(3.582f, 3.691f, 3.471f, 4.009f, 3.389f, 4.343f)
                curveTo(3.312f, 4.658f, 3.247f, 5.042f, 3.172f, 5.49f)
                lineTo(2.388f, 10.159f)
                curveTo(2.286f, 10.768f, 2.2f, 11.282f, 2.166f, 11.704f)
                curveTo(2.131f, 12.144f, 2.143f, 12.58f, 2.301f, 13.007f)
                curveTo(2.537f, 13.644f, 2.988f, 14.177f, 3.576f, 14.515f)
                curveTo(3.972f, 14.742f, 4.4f, 14.825f, 4.839f, 14.863f)
                curveTo(5.261f, 14.9f, 5.782f, 14.9f, 6.4f, 14.9f)
                lineTo(9.602f, 14.9f)
                verticalLineTo(19.252f)
                curveTo(9.602f, 20.576f, 10.676f, 21.65f, 12.0f, 21.65f)
                close()
                moveTo(12.552f, 19.481f)
                curveTo(12.46f, 19.705f, 12.242f, 19.851f, 12.0f, 19.851f)
                curveTo(11.67f, 19.851f, 11.403f, 19.584f, 11.403f, 19.254f)
                verticalLineTo(14.001f)
                curveTo(11.403f, 13.504f, 11.0f, 13.101f, 10.503f, 13.101f)
                horizontalLineTo(5.966f)
                curveTo(5.523f, 13.101f, 5.23f, 13.101f, 5.004f, 13.088f)
                curveTo(4.784f, 13.075f, 4.692f, 13.052f, 4.646f, 13.035f)
                curveTo(4.278f, 12.902f, 4.009f, 12.584f, 3.938f, 12.199f)
                curveTo(3.93f, 12.151f, 3.922f, 12.057f, 3.946f, 11.837f)
                curveTo(3.971f, 11.613f, 4.019f, 11.323f, 4.092f, 10.887f)
                lineTo(4.998f, 5.487f)
                curveTo(5.114f, 4.797f, 5.149f, 4.637f, 5.203f, 4.525f)
                curveTo(5.339f, 4.243f, 5.589f, 4.031f, 5.89f, 3.944f)
                curveTo(6.009f, 3.91f, 6.173f, 3.901f, 6.872f, 3.901f)
                horizontalLineTo(15.602f)
                verticalLineTo(12.073f)
                lineTo(12.552f, 19.481f)
                close()
                moveTo(17.402f, 11.351f)
                horizontalLineTo(20.103f)
                verticalLineTo(3.901f)
                horizontalLineTo(17.402f)
                verticalLineTo(11.351f)
                close()
            }
        }
        .build()
        return _dislike!!
    }

private var _dislike: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Dislike, contentDescription = "")
    }
}
