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

public val MooBesideIconPack.Star: ImageVector
    get() {
        if (_star != null) {
            return _star!!
        }
        _star = Builder(name = "Star", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.138f, 1.408f)
                curveTo(11.68f, 1.133f, 12.32f, 1.133f, 12.861f, 1.408f)
                curveTo(13.296f, 1.629f, 13.545f, 2.039f, 13.712f, 2.357f)
                curveTo(13.887f, 2.692f, 14.074f, 3.141f, 14.292f, 3.665f)
                lineTo(15.497f, 6.563f)
                curveTo(15.569f, 6.737f, 15.609f, 6.83f, 15.641f, 6.897f)
                curveTo(15.651f, 6.917f, 15.658f, 6.929f, 15.662f, 6.936f)
                curveTo(15.668f, 6.942f, 15.675f, 6.947f, 15.682f, 6.951f)
                curveTo(15.69f, 6.952f, 15.704f, 6.955f, 15.726f, 6.958f)
                curveTo(15.799f, 6.969f, 15.9f, 6.977f, 16.088f, 6.992f)
                lineTo(19.216f, 7.243f)
                curveTo(19.782f, 7.288f, 20.267f, 7.327f, 20.64f, 7.39f)
                curveTo(20.993f, 7.451f, 21.46f, 7.561f, 21.805f, 7.906f)
                curveTo(22.234f, 8.336f, 22.432f, 8.945f, 22.337f, 9.545f)
                curveTo(22.261f, 10.026f, 21.948f, 10.39f, 21.698f, 10.647f)
                curveTo(21.433f, 10.917f, 21.064f, 11.233f, 20.633f, 11.603f)
                lineTo(18.249f, 13.645f)
                curveTo(18.106f, 13.767f, 18.03f, 13.833f, 17.976f, 13.885f)
                curveTo(17.96f, 13.9f, 17.951f, 13.911f, 17.945f, 13.917f)
                curveTo(17.942f, 13.924f, 17.939f, 13.932f, 17.938f, 13.94f)
                curveTo(17.938f, 13.948f, 17.94f, 13.962f, 17.944f, 13.984f)
                curveTo(17.957f, 14.057f, 17.98f, 14.156f, 18.024f, 14.339f)
                lineTo(18.752f, 17.392f)
                curveTo(18.884f, 17.944f, 18.996f, 18.417f, 19.051f, 18.791f)
                curveTo(19.103f, 19.146f, 19.143f, 19.624f, 18.921f, 20.058f)
                curveTo(18.645f, 20.599f, 18.127f, 20.976f, 17.527f, 21.071f)
                curveTo(17.046f, 21.148f, 16.603f, 20.962f, 16.281f, 20.803f)
                curveTo(15.942f, 20.635f, 15.528f, 20.382f, 15.043f, 20.086f)
                lineTo(12.365f, 18.45f)
                curveTo(12.204f, 18.352f, 12.118f, 18.3f, 12.052f, 18.265f)
                curveTo(12.032f, 18.254f, 12.019f, 18.248f, 12.012f, 18.245f)
                curveTo(12.004f, 18.244f, 11.996f, 18.244f, 11.988f, 18.245f)
                curveTo(11.98f, 18.248f, 11.967f, 18.254f, 11.948f, 18.265f)
                curveTo(11.882f, 18.3f, 11.796f, 18.352f, 11.635f, 18.45f)
                lineTo(8.957f, 20.086f)
                curveTo(8.472f, 20.382f, 8.057f, 20.635f, 7.718f, 20.803f)
                curveTo(7.397f, 20.962f, 6.954f, 21.148f, 6.473f, 21.071f)
                curveTo(5.873f, 20.976f, 5.355f, 20.599f, 5.078f, 20.058f)
                curveTo(4.857f, 19.624f, 4.896f, 19.146f, 4.948f, 18.791f)
                curveTo(5.003f, 18.417f, 5.116f, 17.944f, 5.248f, 17.392f)
                lineTo(5.976f, 14.339f)
                curveTo(6.02f, 14.156f, 6.043f, 14.057f, 6.055f, 13.984f)
                curveTo(6.059f, 13.962f, 6.061f, 13.948f, 6.062f, 13.94f)
                curveTo(6.06f, 13.932f, 6.058f, 13.924f, 6.054f, 13.917f)
                curveTo(6.049f, 13.911f, 6.039f, 13.9f, 6.023f, 13.885f)
                curveTo(5.97f, 13.833f, 5.893f, 13.767f, 5.75f, 13.645f)
                lineTo(3.367f, 11.603f)
                curveTo(2.936f, 11.233f, 2.566f, 10.917f, 2.302f, 10.647f)
                curveTo(2.051f, 10.39f, 1.738f, 10.026f, 1.662f, 9.545f)
                curveTo(1.568f, 8.945f, 1.766f, 8.336f, 2.195f, 7.906f)
                curveTo(2.539f, 7.561f, 3.007f, 7.451f, 3.36f, 7.39f)
                curveTo(3.733f, 7.327f, 4.217f, 7.288f, 4.783f, 7.243f)
                lineTo(7.912f, 6.992f)
                curveTo(8.1f, 6.977f, 8.2f, 6.969f, 8.274f, 6.958f)
                curveTo(8.296f, 6.955f, 8.31f, 6.952f, 8.318f, 6.951f)
                curveTo(8.325f, 6.947f, 8.332f, 6.942f, 8.338f, 6.936f)
                curveTo(8.341f, 6.929f, 8.348f, 6.917f, 8.358f, 6.897f)
                curveTo(8.391f, 6.83f, 8.43f, 6.737f, 8.502f, 6.563f)
                lineTo(9.708f, 3.665f)
                curveTo(9.926f, 3.141f, 10.112f, 2.692f, 10.288f, 2.357f)
                curveTo(10.454f, 2.039f, 10.704f, 1.629f, 11.138f, 1.408f)
                close()
                moveTo(11.942f, 3.018f)
                curveTo(11.934f, 3.023f, 11.921f, 3.033f, 11.907f, 3.065f)
                lineTo(10.024f, 7.594f)
                curveTo(9.75f, 8.252f, 9.131f, 8.702f, 8.421f, 8.759f)
                lineTo(3.531f, 9.151f)
                curveTo(3.496f, 9.153f, 3.483f, 9.163f, 3.476f, 9.169f)
                curveTo(3.465f, 9.178f, 3.452f, 9.194f, 3.444f, 9.219f)
                curveTo(3.436f, 9.244f, 3.437f, 9.265f, 3.44f, 9.279f)
                curveTo(3.442f, 9.288f, 3.448f, 9.304f, 3.474f, 9.326f)
                lineTo(7.2f, 12.518f)
                curveTo(7.741f, 12.981f, 7.977f, 13.708f, 7.812f, 14.401f)
                lineTo(6.674f, 19.173f)
                curveTo(6.665f, 19.207f, 6.671f, 19.223f, 6.674f, 19.231f)
                curveTo(6.679f, 19.244f, 6.691f, 19.262f, 6.712f, 19.277f)
                curveTo(6.733f, 19.293f, 6.754f, 19.298f, 6.768f, 19.299f)
                curveTo(6.777f, 19.3f, 6.793f, 19.3f, 6.823f, 19.282f)
                lineTo(11.009f, 16.725f)
                curveTo(11.617f, 16.353f, 12.382f, 16.353f, 12.99f, 16.725f)
                lineTo(17.177f, 19.282f)
                curveTo(17.206f, 19.3f, 17.223f, 19.3f, 17.232f, 19.299f)
                curveTo(17.246f, 19.298f, 17.266f, 19.293f, 17.288f, 19.277f)
                curveTo(17.309f, 19.262f, 17.32f, 19.244f, 17.326f, 19.231f)
                curveTo(17.329f, 19.223f, 17.334f, 19.207f, 17.326f, 19.173f)
                lineTo(16.188f, 14.401f)
                curveTo(16.022f, 13.708f, 16.259f, 12.981f, 16.8f, 12.518f)
                lineTo(20.525f, 9.326f)
                curveTo(20.552f, 9.304f, 20.557f, 9.288f, 20.559f, 9.279f)
                curveTo(20.563f, 9.265f, 20.563f, 9.244f, 20.556f, 9.219f)
                curveTo(20.547f, 9.194f, 20.534f, 9.178f, 20.524f, 9.169f)
                curveTo(20.517f, 9.163f, 20.503f, 9.153f, 20.468f, 9.151f)
                lineTo(15.578f, 8.759f)
                curveTo(14.868f, 8.702f, 14.25f, 8.252f, 13.976f, 7.594f)
                lineTo(12.092f, 3.065f)
                curveTo(12.079f, 3.033f, 12.065f, 3.023f, 12.058f, 3.018f)
                curveTo(12.046f, 3.011f, 12.026f, 3.003f, 12.0f, 3.003f)
                curveTo(11.974f, 3.003f, 11.954f, 3.011f, 11.942f, 3.018f)
                close()
            }
        }
        .build()
        return _star!!
    }

private var _star: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Star, contentDescription = "")
    }
}
