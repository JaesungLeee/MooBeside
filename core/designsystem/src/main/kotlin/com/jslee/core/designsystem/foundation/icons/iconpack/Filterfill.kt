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

public val MooBesideIconPack.Filterfill: ImageVector
    get() {
        if (_filterfill != null) {
            return _filterfill!!
        }
        _filterfill = Builder(name = "Filterfill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.916f, 3.098f)
                curveTo(5.367f, 3.098f, 4.894f, 3.098f, 4.527f, 3.131f)
                curveTo(4.176f, 3.162f, 3.713f, 3.235f, 3.346f, 3.542f)
                curveTo(2.886f, 3.928f, 2.636f, 4.509f, 2.67f, 5.108f)
                curveTo(2.698f, 5.586f, 2.963f, 5.972f, 3.181f, 6.25f)
                curveTo(3.409f, 6.54f, 3.733f, 6.883f, 4.11f, 7.283f)
                lineTo(9.6f, 13.105f)
                lineTo(9.6f, 20.496f)
                curveTo(9.6f, 20.604f, 9.6f, 20.738f, 9.61f, 20.854f)
                curveTo(9.622f, 20.978f, 9.654f, 21.219f, 9.816f, 21.452f)
                curveTo(10.006f, 21.723f, 10.298f, 21.903f, 10.624f, 21.952f)
                curveTo(10.906f, 21.993f, 11.136f, 21.914f, 11.252f, 21.868f)
                curveTo(11.36f, 21.826f, 11.48f, 21.766f, 11.577f, 21.718f)
                lineTo(13.637f, 20.688f)
                lineTo(13.651f, 20.681f)
                curveTo(13.712f, 20.652f, 13.906f, 20.559f, 14.057f, 20.404f)
                curveTo(14.182f, 20.277f, 14.276f, 20.124f, 14.334f, 19.956f)
                curveTo(14.405f, 19.751f, 14.401f, 19.536f, 14.4f, 19.468f)
                lineTo(14.4f, 19.453f)
                verticalLineTo(13.105f)
                lineTo(19.89f, 7.283f)
                curveTo(20.267f, 6.883f, 20.59f, 6.54f, 20.819f, 6.25f)
                curveTo(21.037f, 5.972f, 21.302f, 5.586f, 21.329f, 5.108f)
                curveTo(21.364f, 4.509f, 21.114f, 3.928f, 20.654f, 3.542f)
                curveTo(20.287f, 3.235f, 19.824f, 3.162f, 19.473f, 3.131f)
                curveTo(19.105f, 3.098f, 18.633f, 3.098f, 18.084f, 3.098f)
                horizontalLineTo(5.916f)
                close()
            }
        }
        .build()
        return _filterfill!!
    }

private var _filterfill: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Filterfill, contentDescription = "")
    }
}
