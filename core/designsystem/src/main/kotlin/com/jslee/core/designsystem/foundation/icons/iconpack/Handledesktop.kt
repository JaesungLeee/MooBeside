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

public val MooBesideIconPack.Handledesktop: ImageVector
    get() {
        if (_handledesktop != null) {
            return _handledesktop!!
        }
        _handledesktop = Builder(name = "Handledesktop", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.375f, 5.25f)
                curveTo(10.375f, 4.284f, 9.592f, 3.5f, 8.625f, 3.5f)
                curveTo(7.659f, 3.5f, 6.875f, 4.284f, 6.875f, 5.25f)
                curveTo(6.875f, 6.216f, 7.659f, 7.0f, 8.625f, 7.0f)
                curveTo(9.592f, 7.0f, 10.375f, 6.216f, 10.375f, 5.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.375f, 17.0f)
                curveTo(16.342f, 17.0f, 17.125f, 17.784f, 17.125f, 18.75f)
                curveTo(17.125f, 19.716f, 16.342f, 20.5f, 15.375f, 20.5f)
                curveTo(14.409f, 20.5f, 13.625f, 19.716f, 13.625f, 18.75f)
                curveTo(13.625f, 17.784f, 14.409f, 17.0f, 15.375f, 17.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.125f, 12.0f)
                curveTo(17.125f, 11.033f, 16.342f, 10.25f, 15.375f, 10.25f)
                curveTo(14.409f, 10.25f, 13.625f, 11.033f, 13.625f, 12.0f)
                curveTo(13.625f, 12.967f, 14.409f, 13.75f, 15.375f, 13.75f)
                curveTo(16.342f, 13.75f, 17.125f, 12.967f, 17.125f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.125f, 5.25f)
                curveTo(17.125f, 4.284f, 16.342f, 3.5f, 15.375f, 3.5f)
                curveTo(14.409f, 3.5f, 13.625f, 4.284f, 13.625f, 5.25f)
                curveTo(13.625f, 6.216f, 14.409f, 7.0f, 15.375f, 7.0f)
                curveTo(16.342f, 7.0f, 17.125f, 6.216f, 17.125f, 5.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.625f, 10.25f)
                curveTo(9.592f, 10.25f, 10.375f, 11.033f, 10.375f, 12.0f)
                curveTo(10.375f, 12.967f, 9.592f, 13.75f, 8.625f, 13.75f)
                curveTo(7.659f, 13.75f, 6.875f, 12.967f, 6.875f, 12.0f)
                curveTo(6.875f, 11.033f, 7.659f, 10.25f, 8.625f, 10.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.375f, 18.75f)
                curveTo(10.375f, 17.784f, 9.592f, 17.0f, 8.625f, 17.0f)
                curveTo(7.659f, 17.0f, 6.875f, 17.784f, 6.875f, 18.75f)
                curveTo(6.875f, 19.716f, 7.659f, 20.5f, 8.625f, 20.5f)
                curveTo(9.592f, 20.5f, 10.375f, 19.716f, 10.375f, 18.75f)
                close()
            }
        }
        .build()
        return _handledesktop!!
    }

private var _handledesktop: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Handledesktop, contentDescription = "")
    }
}
