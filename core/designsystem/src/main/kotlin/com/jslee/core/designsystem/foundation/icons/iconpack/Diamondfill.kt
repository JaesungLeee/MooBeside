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

public val MooBesideIconPack.Diamondfill: ImageVector
    get() {
        if (_diamondfill != null) {
            return _diamondfill!!
        }
        _diamondfill = Builder(name = "Diamondfill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.829f, 4.0f)
                curveTo(5.808f, 4.024f, 5.789f, 4.048f, 5.769f, 4.072f)
                lineTo(5.709f, 4.144f)
                lineTo(2.394f, 8.122f)
                curveTo(2.154f, 8.41f, 1.923f, 8.688f, 1.76f, 8.942f)
                curveTo(1.727f, 8.993f, 1.696f, 9.046f, 1.666f, 9.101f)
                horizontalLineTo(10.079f)
                lineTo(5.829f, 4.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.696f, 10.901f)
                curveTo(1.731f, 10.959f, 1.768f, 11.015f, 1.806f, 11.068f)
                curveTo(1.979f, 11.316f, 2.222f, 11.583f, 2.474f, 11.86f)
                lineTo(9.891f, 20.018f)
                curveTo(10.205f, 20.364f, 10.501f, 20.689f, 10.778f, 20.92f)
                curveTo(10.876f, 21.002f, 10.983f, 21.082f, 11.1f, 21.153f)
                verticalLineTo(10.901f)
                horizontalLineTo(1.696f)
                close()
            }
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.9f, 21.153f)
                curveTo(13.018f, 21.082f, 13.125f, 21.002f, 13.223f, 20.92f)
                curveTo(13.5f, 20.689f, 13.795f, 20.364f, 14.11f, 20.018f)
                lineTo(21.526f, 11.86f)
                curveTo(21.778f, 11.583f, 22.021f, 11.316f, 22.195f, 11.068f)
                curveTo(22.232f, 11.015f, 22.269f, 10.959f, 22.304f, 10.901f)
                horizontalLineTo(12.9f)
                verticalLineTo(21.153f)
                close()
            }
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.335f, 9.101f)
                curveTo(22.305f, 9.046f, 22.273f, 8.993f, 22.241f, 8.942f)
                curveTo(22.078f, 8.688f, 21.847f, 8.41f, 21.607f, 8.122f)
                lineTo(18.291f, 4.144f)
                lineTo(18.231f, 4.072f)
                curveTo(18.212f, 4.048f, 18.192f, 4.024f, 18.172f, 4.0f)
                lineTo(13.921f, 9.101f)
                horizontalLineTo(22.335f)
                close()
            }
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.573f, 3.108f)
                curveTo(16.428f, 3.099f, 16.288f, 3.1f, 16.158f, 3.1f)
                lineTo(16.063f, 3.101f)
                horizontalLineTo(7.937f)
                lineTo(7.843f, 3.1f)
                curveTo(7.712f, 3.1f, 7.572f, 3.099f, 7.428f, 3.108f)
                lineTo(12.0f, 8.594f)
                lineTo(16.573f, 3.108f)
                close()
            }
        }
        .build()
        return _diamondfill!!
    }

private var _diamondfill: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Diamondfill, contentDescription = "")
    }
}
