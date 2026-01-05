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

public val MooBesideIconPack.Companyfill: ImageVector
    get() {
        if (_companyfill != null) {
            return _companyfill!!
        }
        _companyfill = Builder(name = "Companyfill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.867f, 2.1f)
                horizontalLineTo(12.133f)
                curveTo(12.525f, 2.1f, 12.871f, 2.1f, 13.158f, 2.123f)
                curveTo(13.464f, 2.148f, 13.781f, 2.204f, 14.09f, 2.361f)
                curveTo(14.541f, 2.591f, 14.908f, 2.958f, 15.139f, 3.41f)
                curveTo(15.296f, 3.718f, 15.352f, 4.035f, 15.377f, 4.341f)
                curveTo(15.4f, 4.628f, 15.4f, 4.975f, 15.4f, 5.366f)
                lineTo(15.4f, 10.1f)
                lineTo(18.133f, 10.1f)
                curveTo(18.525f, 10.1f, 18.871f, 10.1f, 19.159f, 10.123f)
                curveTo(19.464f, 10.148f, 19.781f, 10.204f, 20.09f, 10.361f)
                curveTo(20.541f, 10.591f, 20.908f, 10.958f, 21.138f, 11.41f)
                curveTo(21.296f, 11.719f, 21.352f, 12.035f, 21.377f, 12.341f)
                curveTo(21.4f, 12.628f, 21.4f, 12.975f, 21.4f, 13.366f)
                verticalLineTo(21.9f)
                horizontalLineTo(16.4f)
                verticalLineTo(17.75f)
                curveTo(16.4f, 17.253f, 15.997f, 16.85f, 15.5f, 16.85f)
                curveTo(15.003f, 16.85f, 14.6f, 17.253f, 14.6f, 17.75f)
                verticalLineTo(21.9f)
                horizontalLineTo(14.521f)
                lineTo(14.5f, 21.9f)
                lineTo(14.479f, 21.9f)
                horizontalLineTo(2.6f)
                lineTo(2.6f, 5.366f)
                curveTo(2.6f, 4.975f, 2.6f, 4.628f, 2.624f, 4.341f)
                curveTo(2.649f, 4.035f, 2.705f, 3.718f, 2.862f, 3.41f)
                curveTo(3.092f, 2.958f, 3.459f, 2.591f, 3.911f, 2.361f)
                curveTo(4.219f, 2.204f, 4.536f, 2.148f, 4.842f, 2.123f)
                curveTo(5.129f, 2.1f, 5.475f, 2.1f, 5.867f, 2.1f)
                close()
                moveTo(6.1f, 11.0f)
                curveTo(6.1f, 10.503f, 6.503f, 10.1f, 7.0f, 10.1f)
                horizontalLineTo(11.0f)
                curveTo(11.497f, 10.1f, 11.9f, 10.503f, 11.9f, 11.0f)
                curveTo(11.9f, 11.497f, 11.497f, 11.9f, 11.0f, 11.9f)
                horizontalLineTo(7.0f)
                curveTo(6.503f, 11.9f, 6.1f, 11.497f, 6.1f, 11.0f)
                close()
                moveTo(6.1f, 7.0f)
                curveTo(6.1f, 6.503f, 6.503f, 6.1f, 7.0f, 6.1f)
                horizontalLineTo(11.0f)
                curveTo(11.497f, 6.1f, 11.9f, 6.503f, 11.9f, 7.0f)
                curveTo(11.9f, 7.497f, 11.497f, 7.9f, 11.0f, 7.9f)
                horizontalLineTo(7.0f)
                curveTo(6.503f, 7.9f, 6.1f, 7.497f, 6.1f, 7.0f)
                close()
            }
        }
        .build()
        return _companyfill!!
    }

private var _companyfill: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Companyfill, contentDescription = "")
    }
}
