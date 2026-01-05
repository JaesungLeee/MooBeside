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

public val MooBesideIconPack.Home: ImageVector
    get() {
        if (_home != null) {
            return _home!!
        }
        _home = Builder(name = "Home", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.362f, 2.276f)
                curveTo(12.125f, 2.213f, 11.875f, 2.213f, 11.639f, 2.276f)
                curveTo(11.358f, 2.352f, 11.125f, 2.533f, 11.002f, 2.629f)
                lineTo(10.967f, 2.656f)
                lineTo(4.134f, 7.882f)
                curveTo(3.747f, 8.177f, 3.421f, 8.426f, 3.179f, 8.75f)
                curveTo(2.965f, 9.035f, 2.806f, 9.357f, 2.709f, 9.699f)
                curveTo(2.599f, 10.089f, 2.6f, 10.5f, 2.6f, 10.986f)
                lineTo(2.6f, 17.335f)
                curveTo(2.6f, 17.865f, 2.6f, 18.316f, 2.63f, 18.687f)
                curveTo(2.662f, 19.076f, 2.732f, 19.454f, 2.916f, 19.816f)
                curveTo(3.194f, 20.362f, 3.638f, 20.806f, 4.184f, 21.083f)
                curveTo(4.545f, 21.268f, 4.924f, 21.337f, 5.313f, 21.369f)
                curveTo(5.684f, 21.4f, 6.135f, 21.4f, 6.665f, 21.4f)
                horizontalLineTo(11.99f)
                curveTo(11.993f, 21.4f, 11.997f, 21.4f, 12.0f, 21.4f)
                curveTo(12.004f, 21.4f, 12.007f, 21.4f, 12.011f, 21.4f)
                horizontalLineTo(17.336f)
                curveTo(17.865f, 21.4f, 18.317f, 21.4f, 18.687f, 21.369f)
                curveTo(19.076f, 21.337f, 19.455f, 21.268f, 19.817f, 21.083f)
                curveTo(20.362f, 20.806f, 20.806f, 20.362f, 21.084f, 19.816f)
                curveTo(21.268f, 19.454f, 21.338f, 19.076f, 21.37f, 18.687f)
                curveTo(21.4f, 18.316f, 21.4f, 17.865f, 21.4f, 17.335f)
                lineTo(21.4f, 10.986f)
                curveTo(21.401f, 10.499f, 21.401f, 10.089f, 21.291f, 9.699f)
                curveTo(21.194f, 9.357f, 21.035f, 9.035f, 20.822f, 8.75f)
                curveTo(20.579f, 8.426f, 20.253f, 8.177f, 19.866f, 7.882f)
                lineTo(13.033f, 2.656f)
                lineTo(12.998f, 2.629f)
                curveTo(12.875f, 2.533f, 12.642f, 2.352f, 12.362f, 2.276f)
                close()
                moveTo(12.9f, 19.599f)
                horizontalLineTo(17.7f)
                curveTo(18.515f, 19.599f, 18.708f, 19.588f, 18.84f, 19.546f)
                curveTo(19.175f, 19.437f, 19.437f, 19.174f, 19.546f, 18.839f)
                curveTo(19.589f, 18.708f, 19.6f, 18.514f, 19.6f, 17.699f)
                verticalLineTo(10.883f)
                curveTo(19.6f, 10.463f, 19.597f, 10.367f, 19.582f, 10.287f)
                curveTo(19.545f, 10.087f, 19.453f, 9.901f, 19.317f, 9.751f)
                curveTo(19.262f, 9.69f, 19.188f, 9.629f, 18.854f, 9.374f)
                lineTo(12.0f, 4.132f)
                lineTo(5.146f, 9.374f)
                curveTo(4.812f, 9.629f, 4.738f, 9.69f, 4.684f, 9.751f)
                curveTo(4.547f, 9.901f, 4.456f, 10.087f, 4.419f, 10.287f)
                curveTo(4.404f, 10.367f, 4.4f, 10.463f, 4.4f, 10.883f)
                verticalLineTo(17.699f)
                curveTo(4.4f, 18.514f, 4.411f, 18.708f, 4.454f, 18.839f)
                curveTo(4.563f, 19.174f, 4.825f, 19.437f, 5.16f, 19.546f)
                curveTo(5.292f, 19.588f, 5.486f, 19.599f, 6.3f, 19.599f)
                horizontalLineTo(11.1f)
                verticalLineTo(14.0f)
                curveTo(11.1f, 13.503f, 11.503f, 13.1f, 12.0f, 13.1f)
                curveTo(12.498f, 13.1f, 12.9f, 13.503f, 12.9f, 14.0f)
                verticalLineTo(19.599f)
                close()
            }
        }
        .build()
        return _home!!
    }

private var _home: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Home, contentDescription = "")
    }
}
