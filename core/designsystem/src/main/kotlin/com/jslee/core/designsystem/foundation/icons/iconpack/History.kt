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

public val MooBesideIconPack.History: ImageVector
    get() {
        if (_history != null) {
            return _history!!
        }
        _history = Builder(name = "History", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.1f)
                curveTo(11.503f, 2.1f, 11.1f, 2.503f, 11.1f, 3.0f)
                curveTo(11.1f, 3.497f, 11.503f, 3.9f, 12.0f, 3.9f)
                curveTo(16.473f, 3.9f, 20.1f, 7.527f, 20.1f, 12.0f)
                curveTo(20.1f, 16.474f, 16.473f, 20.1f, 12.0f, 20.1f)
                curveTo(7.526f, 20.1f, 3.9f, 16.474f, 3.9f, 12.0f)
                curveTo(3.9f, 11.503f, 3.497f, 11.1f, 3.0f, 11.1f)
                curveTo(2.503f, 11.1f, 2.1f, 11.503f, 2.1f, 12.0f)
                curveTo(2.1f, 17.468f, 6.532f, 21.9f, 12.0f, 21.9f)
                curveTo(17.467f, 21.9f, 21.9f, 17.468f, 21.9f, 12.0f)
                curveTo(21.9f, 6.532f, 17.467f, 2.1f, 12.0f, 2.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.478f, 3.3f)
                curveTo(9.69f, 3.81f, 9.448f, 4.395f, 8.938f, 4.607f)
                curveTo(8.428f, 4.818f, 7.842f, 4.576f, 7.631f, 4.066f)
                curveTo(7.419f, 3.556f, 7.661f, 2.971f, 8.172f, 2.759f)
                curveTo(8.682f, 2.548f, 9.267f, 2.79f, 9.478f, 3.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.343f, 4.929f)
                curveTo(6.733f, 5.32f, 6.733f, 5.953f, 6.343f, 6.343f)
                curveTo(5.952f, 6.734f, 5.319f, 6.734f, 4.929f, 6.343f)
                curveTo(4.538f, 5.953f, 4.538f, 5.32f, 4.929f, 4.929f)
                curveTo(5.319f, 4.538f, 5.952f, 4.538f, 6.343f, 4.929f)
                close()
            }
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.066f, 7.631f)
                curveTo(4.576f, 7.843f, 4.818f, 8.428f, 4.606f, 8.938f)
                curveTo(4.395f, 9.448f, 3.81f, 9.69f, 3.3f, 9.479f)
                curveTo(2.789f, 9.267f, 2.547f, 8.682f, 2.759f, 8.172f)
                curveTo(2.971f, 7.662f, 3.556f, 7.42f, 4.066f, 7.631f)
                close()
            }
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.5f, 6.6f)
                curveTo(11.997f, 6.6f, 12.4f, 7.003f, 12.4f, 7.5f)
                verticalLineTo(12.127f)
                lineTo(14.611f, 14.339f)
                curveTo(14.962f, 14.69f, 14.962f, 15.26f, 14.611f, 15.611f)
                curveTo(14.259f, 15.963f, 13.69f, 15.963f, 13.338f, 15.611f)
                lineTo(10.863f, 13.137f)
                curveTo(10.684f, 12.957f, 10.596f, 12.72f, 10.6f, 12.485f)
                verticalLineTo(7.5f)
                curveTo(10.6f, 7.003f, 11.003f, 6.6f, 11.5f, 6.6f)
                close()
            }
        }
        .build()
        return _history!!
    }

private var _history: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.History, contentDescription = "")
    }
}
