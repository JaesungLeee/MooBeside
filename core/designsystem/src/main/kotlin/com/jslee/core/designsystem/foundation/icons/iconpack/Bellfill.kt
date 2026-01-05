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

public val MooBesideIconPack.Bellfill: ImageVector
    get() {
        if (_bellfill != null) {
            return _bellfill!!
        }
        _bellfill = Builder(name = "Bellfill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.688f, 4.374f)
                curveTo(7.945f, 2.888f, 9.775f, 2.1f, 12.0f, 2.1f)
                curveTo(14.225f, 2.1f, 16.055f, 2.888f, 17.312f, 4.374f)
                curveTo(18.552f, 5.84f, 19.15f, 7.883f, 19.15f, 10.25f)
                lineTo(19.15f, 11.0f)
                curveTo(19.15f, 13.465f, 19.833f, 14.925f, 20.806f, 15.868f)
                curveTo(21.188f, 16.238f, 21.227f, 16.75f, 21.091f, 17.126f)
                curveTo(20.952f, 17.509f, 20.572f, 17.9f, 20.0f, 17.9f)
                horizontalLineTo(3.999f)
                curveTo(3.428f, 17.9f, 3.047f, 17.509f, 2.909f, 17.126f)
                curveTo(2.772f, 16.75f, 2.812f, 16.238f, 3.194f, 15.868f)
                curveTo(4.167f, 14.925f, 4.85f, 13.465f, 4.85f, 11.0f)
                lineTo(4.85f, 10.25f)
                curveTo(4.85f, 7.883f, 5.448f, 5.84f, 6.688f, 4.374f)
                close()
            }
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.1f, 21.0f)
                curveTo(9.1f, 20.503f, 9.503f, 20.1f, 10.0f, 20.1f)
                horizontalLineTo(14.0f)
                curveTo(14.497f, 20.1f, 14.9f, 20.503f, 14.9f, 21.0f)
                curveTo(14.9f, 21.497f, 14.497f, 21.9f, 14.0f, 21.9f)
                horizontalLineTo(10.0f)
                curveTo(9.503f, 21.9f, 9.1f, 21.497f, 9.1f, 21.0f)
                close()
            }
        }
        .build()
        return _bellfill!!
    }

private var _bellfill: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Bellfill, contentDescription = "")
    }
}
