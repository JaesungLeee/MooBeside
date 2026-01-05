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

public val MooBesideIconPack.Graduation: ImageVector
    get() {
        if (_graduation != null) {
            return _graduation!!
        }
        _graduation = Builder(name = "Graduation", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.597f, 2.695f)
                curveTo(11.851f, 2.568f, 12.149f, 2.568f, 12.402f, 2.695f)
                lineTo(22.001f, 7.494f)
                curveTo(22.205f, 7.596f, 22.41f, 7.699f, 22.57f, 7.798f)
                curveTo(22.726f, 7.895f, 22.993f, 8.077f, 23.147f, 8.4f)
                curveTo(23.248f, 8.613f, 23.292f, 8.845f, 23.28f, 9.074f)
                verticalLineTo(15.0f)
                curveTo(23.28f, 15.497f, 22.877f, 15.9f, 22.38f, 15.9f)
                curveTo(21.883f, 15.9f, 21.48f, 15.497f, 21.48f, 15.0f)
                verticalLineTo(10.766f)
                lineTo(19.4f, 11.806f)
                lineTo(19.4f, 16.391f)
                curveTo(19.401f, 16.991f, 19.401f, 17.496f, 19.241f, 17.959f)
                curveTo(19.101f, 18.366f, 18.872f, 18.736f, 18.572f, 19.043f)
                curveTo(18.229f, 19.393f, 17.777f, 19.619f, 17.24f, 19.886f)
                lineTo(13.748f, 21.632f)
                curveTo(13.308f, 21.853f, 12.937f, 22.039f, 12.535f, 22.114f)
                curveTo(12.181f, 22.181f, 11.819f, 22.181f, 11.465f, 22.114f)
                curveTo(11.063f, 22.039f, 10.692f, 21.853f, 10.252f, 21.632f)
                lineTo(6.76f, 19.886f)
                curveTo(6.223f, 19.619f, 5.771f, 19.393f, 5.428f, 19.043f)
                curveTo(5.127f, 18.736f, 4.899f, 18.366f, 4.758f, 17.959f)
                curveTo(4.599f, 17.496f, 4.599f, 16.991f, 4.6f, 16.391f)
                lineTo(4.6f, 11.806f)
                lineTo(1.999f, 10.506f)
                curveTo(1.795f, 10.404f, 1.59f, 10.301f, 1.43f, 10.202f)
                curveTo(1.274f, 10.106f, 1.007f, 9.924f, 0.853f, 9.6f)
                curveTo(0.673f, 9.22f, 0.673f, 8.78f, 0.853f, 8.4f)
                curveTo(1.007f, 8.077f, 1.274f, 7.895f, 1.43f, 7.798f)
                curveTo(1.59f, 7.699f, 1.795f, 7.597f, 1.999f, 7.494f)
                lineTo(11.597f, 2.695f)
                close()
                moveTo(12.402f, 15.305f)
                lineTo(17.6f, 12.706f)
                verticalLineTo(16.272f)
                curveTo(17.6f, 17.056f, 17.588f, 17.232f, 17.54f, 17.373f)
                curveTo(17.487f, 17.527f, 17.4f, 17.667f, 17.286f, 17.784f)
                curveTo(17.182f, 17.89f, 17.029f, 17.979f, 16.329f, 18.33f)
                lineTo(13.029f, 19.979f)
                curveTo(12.457f, 20.265f, 12.325f, 20.322f, 12.203f, 20.345f)
                curveTo(12.069f, 20.37f, 11.931f, 20.37f, 11.797f, 20.345f)
                curveTo(11.675f, 20.322f, 11.543f, 20.265f, 10.971f, 19.979f)
                lineTo(7.671f, 18.33f)
                curveTo(6.971f, 17.979f, 6.818f, 17.89f, 6.714f, 17.784f)
                curveTo(6.6f, 17.667f, 6.513f, 17.527f, 6.46f, 17.373f)
                curveTo(6.412f, 17.232f, 6.4f, 17.056f, 6.4f, 16.272f)
                verticalLineTo(12.706f)
                lineTo(11.597f, 15.305f)
                curveTo(11.851f, 15.432f, 12.149f, 15.432f, 12.402f, 15.305f)
                close()
                moveTo(3.012f, 9.0f)
                lineTo(12.0f, 13.494f)
                lineTo(20.987f, 9.0f)
                lineTo(12.0f, 4.506f)
                lineTo(3.012f, 9.0f)
                close()
            }
        }
        .build()
        return _graduation!!
    }

private var _graduation: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Graduation, contentDescription = "")
    }
}
