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

public val MooBesideIconPack.Desktop: ImageVector
    get() {
        if (_desktop != null) {
            return _desktop!!
        }
        _desktop = Builder(name = "Desktop", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.117f, 3.1f)
                curveTo(4.725f, 3.1f, 4.379f, 3.1f, 4.092f, 3.124f)
                curveTo(3.786f, 3.149f, 3.469f, 3.205f, 3.161f, 3.362f)
                curveTo(2.709f, 3.592f, 2.342f, 3.959f, 2.112f, 4.411f)
                curveTo(1.955f, 4.719f, 1.899f, 5.036f, 1.874f, 5.342f)
                curveTo(1.85f, 5.629f, 1.85f, 5.975f, 1.85f, 6.367f)
                verticalLineTo(14.133f)
                curveTo(1.85f, 14.525f, 1.85f, 14.872f, 1.874f, 15.159f)
                curveTo(1.899f, 15.464f, 1.955f, 15.781f, 2.112f, 16.09f)
                curveTo(2.342f, 16.541f, 2.709f, 16.908f, 3.161f, 17.139f)
                curveTo(3.469f, 17.296f, 3.786f, 17.352f, 4.092f, 17.377f)
                curveTo(4.379f, 17.4f, 4.725f, 17.4f, 5.117f, 17.4f)
                lineTo(11.1f, 17.4f)
                verticalLineTo(19.6f)
                horizontalLineTo(7.0f)
                curveTo(6.503f, 19.6f, 6.1f, 20.003f, 6.1f, 20.5f)
                curveTo(6.1f, 20.997f, 6.503f, 21.4f, 7.0f, 21.4f)
                horizontalLineTo(17.0f)
                curveTo(17.497f, 21.4f, 17.9f, 20.997f, 17.9f, 20.5f)
                curveTo(17.9f, 20.003f, 17.497f, 19.6f, 17.0f, 19.6f)
                horizontalLineTo(12.9f)
                verticalLineTo(17.4f)
                lineTo(18.883f, 17.4f)
                curveTo(19.275f, 17.4f, 19.622f, 17.4f, 19.909f, 17.377f)
                curveTo(20.215f, 17.352f, 20.531f, 17.296f, 20.84f, 17.139f)
                curveTo(21.291f, 16.908f, 21.659f, 16.541f, 21.889f, 16.09f)
                curveTo(22.046f, 15.781f, 22.102f, 15.464f, 22.127f, 15.159f)
                curveTo(22.15f, 14.871f, 22.15f, 14.525f, 22.15f, 14.134f)
                verticalLineTo(6.367f)
                curveTo(22.15f, 5.975f, 22.15f, 5.629f, 22.127f, 5.342f)
                curveTo(22.102f, 5.036f, 22.046f, 4.719f, 21.889f, 4.411f)
                curveTo(21.659f, 3.959f, 21.291f, 3.592f, 20.84f, 3.362f)
                curveTo(20.531f, 3.205f, 20.215f, 3.149f, 19.909f, 3.124f)
                curveTo(19.622f, 3.1f, 19.275f, 3.1f, 18.884f, 3.1f)
                horizontalLineTo(5.117f)
                close()
                moveTo(4.065f, 4.93f)
                curveTo(4.121f, 4.911f, 4.222f, 4.9f, 4.85f, 4.9f)
                horizontalLineTo(19.15f)
                curveTo(19.778f, 4.9f, 19.879f, 4.911f, 19.935f, 4.93f)
                curveTo(20.118f, 4.989f, 20.261f, 5.132f, 20.321f, 5.315f)
                curveTo(20.339f, 5.371f, 20.35f, 5.472f, 20.35f, 6.1f)
                verticalLineTo(14.4f)
                curveTo(20.35f, 15.029f, 20.339f, 15.13f, 20.321f, 15.186f)
                curveTo(20.261f, 15.368f, 20.118f, 15.512f, 19.935f, 15.571f)
                curveTo(19.879f, 15.589f, 19.778f, 15.6f, 19.15f, 15.6f)
                horizontalLineTo(4.85f)
                curveTo(4.222f, 15.6f, 4.121f, 15.589f, 4.065f, 15.571f)
                curveTo(3.882f, 15.512f, 3.739f, 15.368f, 3.679f, 15.186f)
                curveTo(3.661f, 15.13f, 3.65f, 15.029f, 3.65f, 14.4f)
                verticalLineTo(6.1f)
                curveTo(3.65f, 5.472f, 3.661f, 5.371f, 3.679f, 5.315f)
                curveTo(3.739f, 5.132f, 3.882f, 4.989f, 4.065f, 4.93f)
                close()
            }
        }
        .build()
        return _desktop!!
    }

private var _desktop: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Desktop, contentDescription = "")
    }
}
