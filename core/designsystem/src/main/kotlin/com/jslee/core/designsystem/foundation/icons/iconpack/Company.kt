package com.jslee.core.designsystem.foundation.icons.iconpack

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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

public val MooBesideIconPack.Company: ImageVector
    get() {
        if (_company != null) {
            return _company!!
        }
        _company = Builder(name = "Company", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.1f, 11.0f)
                curveTo(6.1f, 10.503f, 6.503f, 10.1f, 7.0f, 10.1f)
                horizontalLineTo(11.0f)
                curveTo(11.497f, 10.1f, 11.9f, 10.503f, 11.9f, 11.0f)
                curveTo(11.9f, 11.497f, 11.497f, 11.9f, 11.0f, 11.9f)
                horizontalLineTo(7.0f)
                curveTo(6.503f, 11.9f, 6.1f, 11.497f, 6.1f, 11.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.1f, 7.0f)
                curveTo(6.1f, 6.503f, 6.503f, 6.1f, 7.0f, 6.1f)
                horizontalLineTo(11.0f)
                curveTo(11.497f, 6.1f, 11.9f, 6.503f, 11.9f, 7.0f)
                curveTo(11.9f, 7.497f, 11.497f, 7.9f, 11.0f, 7.9f)
                horizontalLineTo(7.0f)
                curveTo(6.503f, 7.9f, 6.1f, 7.497f, 6.1f, 7.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.867f, 2.1f)
                curveTo(5.475f, 2.1f, 5.129f, 2.1f, 4.842f, 2.123f)
                curveTo(4.536f, 2.148f, 4.219f, 2.204f, 3.911f, 2.361f)
                curveTo(3.459f, 2.591f, 3.092f, 2.958f, 2.862f, 3.41f)
                curveTo(2.705f, 3.718f, 2.649f, 4.035f, 2.624f, 4.341f)
                curveTo(2.6f, 4.628f, 2.6f, 4.975f, 2.6f, 5.366f)
                lineTo(2.6f, 21.9f)
                horizontalLineTo(8.987f)
                curveTo(8.991f, 21.9f, 8.996f, 21.9f, 9.0f, 21.9f)
                curveTo(9.005f, 21.9f, 9.009f, 21.9f, 9.014f, 21.9f)
                horizontalLineTo(14.479f)
                lineTo(14.5f, 21.9f)
                lineTo(14.521f, 21.9f)
                horizontalLineTo(21.4f)
                verticalLineTo(13.366f)
                curveTo(21.4f, 12.975f, 21.4f, 12.628f, 21.377f, 12.341f)
                curveTo(21.352f, 12.035f, 21.296f, 11.719f, 21.139f, 11.41f)
                curveTo(20.908f, 10.958f, 20.541f, 10.591f, 20.09f, 10.361f)
                curveTo(19.781f, 10.204f, 19.464f, 10.148f, 19.159f, 10.123f)
                curveTo(18.871f, 10.1f, 18.525f, 10.1f, 18.133f, 10.1f)
                lineTo(15.4f, 10.1f)
                lineTo(15.4f, 5.366f)
                curveTo(15.4f, 4.975f, 15.4f, 4.628f, 15.377f, 4.341f)
                curveTo(15.352f, 4.035f, 15.296f, 3.718f, 15.139f, 3.41f)
                curveTo(14.908f, 2.958f, 14.541f, 2.591f, 14.09f, 2.361f)
                curveTo(13.781f, 2.204f, 13.464f, 2.148f, 13.159f, 2.123f)
                curveTo(12.872f, 2.1f, 12.525f, 2.1f, 12.134f, 2.1f)
                horizontalLineTo(5.867f)
                close()
                moveTo(9.9f, 20.1f)
                horizontalLineTo(13.6f)
                verticalLineTo(5.1f)
                curveTo(13.6f, 4.471f, 13.589f, 4.37f, 13.571f, 4.314f)
                curveTo(13.511f, 4.131f, 13.368f, 3.988f, 13.186f, 3.929f)
                curveTo(13.129f, 3.911f, 13.029f, 3.9f, 12.4f, 3.9f)
                horizontalLineTo(5.6f)
                curveTo(4.972f, 3.9f, 4.871f, 3.911f, 4.815f, 3.929f)
                curveTo(4.632f, 3.988f, 4.489f, 4.131f, 4.43f, 4.314f)
                curveTo(4.411f, 4.37f, 4.4f, 4.471f, 4.4f, 5.1f)
                verticalLineTo(20.1f)
                horizontalLineTo(8.1f)
                verticalLineTo(17.0f)
                curveTo(8.1f, 16.503f, 8.503f, 16.1f, 9.0f, 16.1f)
                curveTo(9.497f, 16.1f, 9.9f, 16.503f, 9.9f, 17.0f)
                verticalLineTo(20.1f)
                close()
                moveTo(19.6f, 20.1f)
                horizontalLineTo(15.4f)
                verticalLineTo(11.9f)
                horizontalLineTo(18.4f)
                curveTo(19.029f, 11.9f, 19.129f, 11.911f, 19.186f, 11.929f)
                curveTo(19.368f, 11.988f, 19.511f, 12.132f, 19.571f, 12.314f)
                curveTo(19.589f, 12.37f, 19.6f, 12.471f, 19.6f, 13.1f)
                verticalLineTo(20.1f)
                close()
            }
        }
        .build()
        return _company!!
    }

private var _company: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Company, contentDescription = "")
    }
}
