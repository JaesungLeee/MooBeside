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

public val MooBesideIconPack.Circleinfofill: ImageVector
    get() {
        if (_circleinfofill != null) {
            return _circleinfofill!!
        }
        _circleinfofill = Builder(name = "Circleinfofill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.1f, 12.0f)
                curveTo(2.1f, 6.532f, 6.532f, 2.1f, 12.0f, 2.1f)
                curveTo(17.468f, 2.1f, 21.9f, 6.532f, 21.9f, 12.0f)
                curveTo(21.9f, 17.468f, 17.468f, 21.9f, 12.0f, 21.9f)
                curveTo(6.532f, 21.9f, 2.1f, 17.468f, 2.1f, 12.0f)
                close()
                moveTo(13.0f, 8.0f)
                curveTo(13.0f, 8.552f, 12.552f, 9.0f, 12.0f, 9.0f)
                curveTo(11.448f, 9.0f, 11.0f, 8.552f, 11.0f, 8.0f)
                curveTo(11.0f, 7.448f, 11.448f, 7.0f, 12.0f, 7.0f)
                curveTo(12.552f, 7.0f, 13.0f, 7.448f, 13.0f, 8.0f)
                close()
                moveTo(12.0f, 10.6f)
                curveTo(12.497f, 10.6f, 12.9f, 11.003f, 12.9f, 11.5f)
                verticalLineTo(16.0f)
                curveTo(12.9f, 16.497f, 12.497f, 16.9f, 12.0f, 16.9f)
                curveTo(11.503f, 16.9f, 11.1f, 16.497f, 11.1f, 16.0f)
                verticalLineTo(11.5f)
                curveTo(11.1f, 11.003f, 11.503f, 10.6f, 12.0f, 10.6f)
                close()
            }
        }
        .build()
        return _circleinfofill!!
    }

private var _circleinfofill: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Circleinfofill, contentDescription = "")
    }
}
