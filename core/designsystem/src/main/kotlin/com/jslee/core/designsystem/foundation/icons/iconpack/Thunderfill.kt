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

public val MooBesideIconPack.Thunderfill: ImageVector
    get() {
        if (_thunderfill != null) {
            return _thunderfill!!
        }
        _thunderfill = Builder(name = "Thunderfill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.893f, 2.112f)
                curveTo(13.944f, 1.707f, 13.715f, 1.319f, 13.337f, 1.166f)
                curveTo(12.959f, 1.013f, 12.525f, 1.134f, 12.28f, 1.461f)
                lineTo(5.176f, 10.933f)
                curveTo(4.887f, 11.317f, 4.635f, 11.654f, 4.46f, 11.938f)
                curveTo(4.286f, 12.219f, 4.091f, 12.596f, 4.1f, 13.04f)
                curveTo(4.112f, 13.61f, 4.38f, 14.145f, 4.829f, 14.497f)
                curveTo(5.178f, 14.771f, 5.597f, 14.84f, 5.926f, 14.87f)
                curveTo(6.258f, 14.901f, 6.679f, 14.901f, 7.159f, 14.901f)
                lineTo(10.98f, 14.901f)
                lineTo(10.107f, 21.889f)
                curveTo(10.056f, 22.294f, 10.284f, 22.682f, 10.663f, 22.835f)
                curveTo(11.041f, 22.988f, 11.475f, 22.867f, 11.72f, 22.541f)
                lineTo(18.824f, 13.068f)
                curveTo(19.112f, 12.684f, 19.365f, 12.347f, 19.54f, 12.063f)
                curveTo(19.713f, 11.782f, 19.909f, 11.405f, 19.899f, 10.961f)
                curveTo(19.888f, 10.391f, 19.62f, 9.856f, 19.171f, 9.505f)
                curveTo(18.821f, 9.231f, 18.403f, 9.161f, 18.074f, 9.131f)
                curveTo(17.742f, 9.101f, 17.321f, 9.101f, 16.841f, 9.101f)
                lineTo(13.019f, 9.101f)
                lineTo(13.893f, 2.112f)
                close()
            }
        }
        .build()
        return _thunderfill!!
    }

private var _thunderfill: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Thunderfill, contentDescription = "")
    }
}
