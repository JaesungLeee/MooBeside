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

public val MooBesideIconPack.Thunder: ImageVector
    get() {
        if (_thunder != null) {
            return _thunder!!
        }
        _thunder = Builder(name = "Thunder", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(13.337f, 1.166f)
                curveTo(13.715f, 1.319f, 13.944f, 1.707f, 13.893f, 2.112f)
                lineTo(13.019f, 9.101f)
                lineTo(16.841f, 9.101f)
                curveTo(17.321f, 9.101f, 17.742f, 9.101f, 18.074f, 9.131f)
                curveTo(18.403f, 9.161f, 18.822f, 9.231f, 19.171f, 9.505f)
                curveTo(19.62f, 9.856f, 19.888f, 10.391f, 19.899f, 10.961f)
                curveTo(19.909f, 11.405f, 19.713f, 11.782f, 19.54f, 12.063f)
                curveTo(19.365f, 12.347f, 19.112f, 12.684f, 18.824f, 13.068f)
                lineTo(11.72f, 22.541f)
                curveTo(11.475f, 22.867f, 11.041f, 22.988f, 10.663f, 22.835f)
                curveTo(10.285f, 22.682f, 10.056f, 22.294f, 10.107f, 21.889f)
                lineTo(10.98f, 14.901f)
                lineTo(7.159f, 14.901f)
                curveTo(6.679f, 14.901f, 6.258f, 14.901f, 5.926f, 14.87f)
                curveTo(5.597f, 14.84f, 5.178f, 14.771f, 4.829f, 14.497f)
                curveTo(4.38f, 14.145f, 4.112f, 13.61f, 4.1f, 13.04f)
                curveTo(4.091f, 12.596f, 4.286f, 12.219f, 4.46f, 11.938f)
                curveTo(4.635f, 11.654f, 4.887f, 11.317f, 5.176f, 10.933f)
                lineTo(12.28f, 1.461f)
                curveTo(12.525f, 1.134f, 12.959f, 1.013f, 13.337f, 1.166f)
                close()
                moveTo(11.686f, 5.252f)
                lineTo(5.92f, 12.941f)
                curveTo(5.902f, 12.965f, 5.899f, 12.981f, 5.898f, 12.991f)
                curveTo(5.897f, 13.005f, 5.9f, 13.025f, 5.911f, 13.045f)
                curveTo(5.921f, 13.066f, 5.935f, 13.08f, 5.947f, 13.088f)
                curveTo(5.956f, 13.094f, 5.97f, 13.101f, 6.0f, 13.101f)
                horizontalLineTo(12.0f)
                curveTo(12.258f, 13.101f, 12.504f, 13.212f, 12.675f, 13.405f)
                curveTo(12.845f, 13.599f, 12.925f, 13.856f, 12.893f, 14.112f)
                lineTo(12.313f, 18.75f)
                lineTo(18.08f, 11.061f)
                curveTo(18.098f, 11.037f, 18.101f, 11.021f, 18.102f, 11.01f)
                curveTo(18.103f, 10.996f, 18.1f, 10.977f, 18.089f, 10.956f)
                curveTo(18.079f, 10.935f, 18.065f, 10.921f, 18.053f, 10.914f)
                curveTo(18.044f, 10.908f, 18.03f, 10.901f, 18.0f, 10.901f)
                horizontalLineTo(12.0f)
                curveTo(11.742f, 10.901f, 11.496f, 10.79f, 11.325f, 10.596f)
                curveTo(11.154f, 10.403f, 11.075f, 10.145f, 11.107f, 9.889f)
                lineTo(11.686f, 5.252f)
                close()
            }
        }
        .build()
        return _thunder!!
    }

private var _thunder: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Thunder, contentDescription = "")
    }
}
