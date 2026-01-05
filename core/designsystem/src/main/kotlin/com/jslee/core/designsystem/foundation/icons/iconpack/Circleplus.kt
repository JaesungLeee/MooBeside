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

public val MooBesideIconPack.Circleplus: ImageVector
    get() {
        if (_circleplus != null) {
            return _circleplus!!
        }
        _circleplus = Builder(name = "Circleplus", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.9f, 8.0f)
                curveTo(12.9f, 7.503f, 12.497f, 7.1f, 12.0f, 7.1f)
                curveTo(11.503f, 7.1f, 11.1f, 7.503f, 11.1f, 8.0f)
                verticalLineTo(11.1f)
                horizontalLineTo(8.0f)
                curveTo(7.503f, 11.1f, 7.1f, 11.503f, 7.1f, 12.0f)
                curveTo(7.1f, 12.497f, 7.503f, 12.9f, 8.0f, 12.9f)
                horizontalLineTo(11.1f)
                verticalLineTo(16.0f)
                curveTo(11.1f, 16.497f, 11.503f, 16.9f, 12.0f, 16.9f)
                curveTo(12.497f, 16.9f, 12.9f, 16.497f, 12.9f, 16.0f)
                verticalLineTo(12.9f)
                horizontalLineTo(16.0f)
                curveTo(16.497f, 12.9f, 16.9f, 12.497f, 16.9f, 12.0f)
                curveTo(16.9f, 11.503f, 16.497f, 11.1f, 16.0f, 11.1f)
                horizontalLineTo(12.9f)
                verticalLineTo(8.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 2.1f)
                curveTo(6.532f, 2.1f, 2.1f, 6.532f, 2.1f, 12.0f)
                curveTo(2.1f, 17.468f, 6.532f, 21.9f, 12.0f, 21.9f)
                curveTo(17.468f, 21.9f, 21.9f, 17.468f, 21.9f, 12.0f)
                curveTo(21.9f, 6.532f, 17.468f, 2.1f, 12.0f, 2.1f)
                close()
                moveTo(3.9f, 12.0f)
                curveTo(3.9f, 7.526f, 7.526f, 3.9f, 12.0f, 3.9f)
                curveTo(16.473f, 3.9f, 20.1f, 7.526f, 20.1f, 12.0f)
                curveTo(20.1f, 16.473f, 16.473f, 20.1f, 12.0f, 20.1f)
                curveTo(7.526f, 20.1f, 3.9f, 16.473f, 3.9f, 12.0f)
                close()
            }
        }
        .build()
        return _circleplus!!
    }

private var _circleplus: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Circleplus, contentDescription = "")
    }
}
