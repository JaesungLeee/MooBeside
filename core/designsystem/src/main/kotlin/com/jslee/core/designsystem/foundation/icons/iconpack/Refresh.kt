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

public val MooBesideIconPack.Refresh: ImageVector
    get() {
        if (_refresh != null) {
            return _refresh!!
        }
        _refresh = Builder(name = "Refresh", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.6f, 11.998f)
                curveTo(2.6f, 6.807f, 6.809f, 2.598f, 12.0f, 2.598f)
                curveTo(13.818f, 2.598f, 15.515f, 3.114f, 16.953f, 4.007f)
                lineTo(17.902f, 3.058f)
                curveTo(18.16f, 2.801f, 18.547f, 2.724f, 18.883f, 2.863f)
                curveTo(19.219f, 3.002f, 19.439f, 3.33f, 19.439f, 3.694f)
                verticalLineTo(6.876f)
                curveTo(19.439f, 7.115f, 19.344f, 7.344f, 19.175f, 7.513f)
                curveTo(19.006f, 7.682f, 18.778f, 7.776f, 18.539f, 7.776f)
                horizontalLineTo(15.357f)
                curveTo(14.993f, 7.776f, 14.665f, 7.557f, 14.525f, 7.221f)
                curveTo(14.386f, 6.884f, 14.463f, 6.497f, 14.72f, 6.24f)
                lineTo(15.637f, 5.323f)
                curveTo(14.557f, 4.733f, 13.318f, 4.398f, 12.0f, 4.398f)
                curveTo(7.803f, 4.398f, 4.4f, 7.801f, 4.4f, 11.998f)
                curveTo(4.4f, 12.508f, 4.45f, 13.005f, 4.545f, 13.485f)
                curveTo(4.642f, 13.972f, 4.325f, 14.446f, 3.838f, 14.542f)
                curveTo(3.35f, 14.639f, 2.876f, 14.322f, 2.78f, 13.834f)
                curveTo(2.662f, 13.24f, 2.6f, 12.626f, 2.6f, 11.998f)
                close()
            }
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.163f, 9.457f)
                curveTo(20.651f, 9.361f, 21.124f, 9.678f, 21.221f, 10.165f)
                curveTo(21.339f, 10.76f, 21.4f, 11.374f, 21.4f, 12.001f)
                curveTo(21.4f, 17.192f, 17.192f, 21.401f, 12.0f, 21.401f)
                curveTo(10.184f, 21.401f, 8.487f, 20.885f, 7.049f, 19.993f)
                lineTo(6.096f, 20.946f)
                curveTo(5.838f, 21.203f, 5.451f, 21.28f, 5.115f, 21.141f)
                curveTo(4.779f, 21.001f, 4.559f, 20.673f, 4.559f, 20.309f)
                lineTo(4.559f, 17.127f)
                curveTo(4.559f, 16.889f, 4.654f, 16.66f, 4.823f, 16.491f)
                curveTo(4.992f, 16.322f, 5.221f, 16.227f, 5.459f, 16.227f)
                horizontalLineTo(8.641f)
                curveTo(9.005f, 16.227f, 9.334f, 16.447f, 9.473f, 16.783f)
                curveTo(9.612f, 17.119f, 9.535f, 17.506f, 9.278f, 17.764f)
                lineTo(8.365f, 18.677f)
                curveTo(9.445f, 19.266f, 10.683f, 19.601f, 12.0f, 19.601f)
                curveTo(16.198f, 19.601f, 19.6f, 16.198f, 19.6f, 12.001f)
                curveTo(19.6f, 11.492f, 19.55f, 10.995f, 19.455f, 10.515f)
                curveTo(19.359f, 10.027f, 19.676f, 9.554f, 20.163f, 9.457f)
                close()
            }
        }
        .build()
        return _refresh!!
    }

private var _refresh: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Refresh, contentDescription = "")
    }
}
