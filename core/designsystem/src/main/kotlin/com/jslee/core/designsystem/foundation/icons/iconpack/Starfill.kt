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

public val MooBesideIconPack.Starfill: ImageVector
    get() {
        if (_starfill != null) {
            return _starfill!!
        }
        _starfill = Builder(name = "Starfill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.861f, 1.408f)
                curveTo(12.32f, 1.133f, 11.679f, 1.133f, 11.138f, 1.408f)
                curveTo(10.704f, 1.629f, 10.454f, 2.039f, 10.288f, 2.357f)
                curveTo(10.112f, 2.692f, 9.926f, 3.141f, 9.708f, 3.665f)
                lineTo(8.502f, 6.563f)
                curveTo(8.43f, 6.737f, 8.391f, 6.83f, 8.358f, 6.897f)
                curveTo(8.348f, 6.917f, 8.341f, 6.929f, 8.337f, 6.936f)
                curveTo(8.331f, 6.942f, 8.325f, 6.947f, 8.318f, 6.951f)
                curveTo(8.31f, 6.952f, 8.296f, 6.955f, 8.274f, 6.958f)
                curveTo(8.2f, 6.969f, 8.1f, 6.977f, 7.912f, 6.992f)
                lineTo(4.783f, 7.243f)
                curveTo(4.217f, 7.288f, 3.733f, 7.327f, 3.36f, 7.39f)
                curveTo(3.006f, 7.451f, 2.539f, 7.561f, 2.195f, 7.906f)
                curveTo(1.766f, 8.336f, 1.568f, 8.945f, 1.662f, 9.545f)
                curveTo(1.738f, 10.026f, 2.051f, 10.39f, 2.302f, 10.647f)
                curveTo(2.566f, 10.917f, 2.935f, 11.233f, 3.367f, 11.603f)
                lineTo(5.75f, 13.645f)
                curveTo(5.893f, 13.767f, 5.97f, 13.833f, 6.023f, 13.885f)
                curveTo(6.039f, 13.9f, 6.049f, 13.911f, 6.054f, 13.917f)
                curveTo(6.058f, 13.924f, 6.06f, 13.932f, 6.062f, 13.94f)
                curveTo(6.061f, 13.948f, 6.059f, 13.962f, 6.055f, 13.984f)
                curveTo(6.043f, 14.057f, 6.019f, 14.156f, 5.976f, 14.339f)
                lineTo(5.248f, 17.392f)
                curveTo(5.116f, 17.944f, 5.003f, 18.417f, 4.948f, 18.791f)
                curveTo(4.896f, 19.146f, 4.857f, 19.624f, 5.078f, 20.058f)
                curveTo(5.354f, 20.599f, 5.873f, 20.976f, 6.472f, 21.071f)
                curveTo(6.954f, 21.148f, 7.397f, 20.962f, 7.718f, 20.803f)
                curveTo(8.057f, 20.635f, 8.472f, 20.382f, 8.956f, 20.086f)
                lineTo(11.635f, 18.45f)
                curveTo(11.795f, 18.352f, 11.882f, 18.3f, 11.948f, 18.265f)
                curveTo(11.967f, 18.254f, 11.98f, 18.248f, 11.987f, 18.245f)
                curveTo(11.996f, 18.244f, 12.004f, 18.244f, 12.012f, 18.245f)
                curveTo(12.019f, 18.248f, 12.032f, 18.254f, 12.052f, 18.265f)
                curveTo(12.118f, 18.3f, 12.204f, 18.352f, 12.365f, 18.45f)
                lineTo(15.043f, 20.086f)
                curveTo(15.528f, 20.382f, 15.942f, 20.635f, 16.281f, 20.803f)
                curveTo(16.603f, 20.962f, 17.046f, 21.148f, 17.527f, 21.071f)
                curveTo(18.127f, 20.976f, 18.645f, 20.599f, 18.921f, 20.058f)
                curveTo(19.143f, 19.624f, 19.103f, 19.146f, 19.051f, 18.791f)
                curveTo(18.996f, 18.417f, 18.884f, 17.944f, 18.752f, 17.392f)
                lineTo(18.024f, 14.339f)
                curveTo(17.98f, 14.156f, 17.957f, 14.057f, 17.944f, 13.984f)
                curveTo(17.94f, 13.962f, 17.938f, 13.948f, 17.938f, 13.94f)
                curveTo(17.939f, 13.932f, 17.942f, 13.924f, 17.945f, 13.917f)
                curveTo(17.951f, 13.911f, 17.96f, 13.9f, 17.976f, 13.885f)
                curveTo(18.03f, 13.833f, 18.106f, 13.767f, 18.249f, 13.645f)
                lineTo(20.633f, 11.603f)
                curveTo(21.064f, 11.233f, 21.433f, 10.917f, 21.698f, 10.647f)
                curveTo(21.948f, 10.39f, 22.261f, 10.026f, 22.337f, 9.545f)
                curveTo(22.432f, 8.945f, 22.234f, 8.336f, 21.805f, 7.906f)
                curveTo(21.46f, 7.561f, 20.993f, 7.451f, 20.64f, 7.39f)
                curveTo(20.267f, 7.327f, 19.782f, 7.288f, 19.216f, 7.243f)
                lineTo(16.087f, 6.992f)
                curveTo(15.9f, 6.977f, 15.799f, 6.969f, 15.726f, 6.958f)
                curveTo(15.703f, 6.955f, 15.69f, 6.952f, 15.682f, 6.951f)
                curveTo(15.675f, 6.947f, 15.668f, 6.942f, 15.662f, 6.936f)
                curveTo(15.658f, 6.929f, 15.651f, 6.917f, 15.641f, 6.897f)
                curveTo(15.609f, 6.83f, 15.569f, 6.737f, 15.497f, 6.563f)
                lineTo(14.292f, 3.665f)
                curveTo(14.074f, 3.141f, 13.887f, 2.692f, 13.712f, 2.357f)
                curveTo(13.545f, 2.039f, 13.296f, 1.629f, 12.861f, 1.408f)
                close()
            }
        }
        .build()
        return _starfill!!
    }

private var _starfill: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Starfill, contentDescription = "")
    }
}
