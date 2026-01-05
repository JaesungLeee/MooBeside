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

public val MooBesideIconPack.Circleexclamationfill: ImageVector
    get() {
        if (_circleexclamationfill != null) {
            return _circleexclamationfill!!
        }
        _circleexclamationfill = Builder(name = "Circleexclamationfill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.1f, 12.0f)
                curveTo(2.1f, 6.532f, 6.532f, 2.1f, 12.0f, 2.1f)
                curveTo(17.468f, 2.1f, 21.9f, 6.532f, 21.9f, 12.0f)
                curveTo(21.9f, 17.468f, 17.468f, 21.9f, 12.0f, 21.9f)
                curveTo(6.532f, 21.9f, 2.1f, 17.468f, 2.1f, 12.0f)
                close()
                moveTo(12.0f, 7.1f)
                curveTo(12.497f, 7.1f, 12.9f, 7.503f, 12.9f, 8.0f)
                verticalLineTo(12.5f)
                curveTo(12.9f, 12.997f, 12.497f, 13.4f, 12.0f, 13.4f)
                curveTo(11.503f, 13.4f, 11.1f, 12.997f, 11.1f, 12.5f)
                verticalLineTo(8.0f)
                curveTo(11.1f, 7.503f, 11.503f, 7.1f, 12.0f, 7.1f)
                close()
                moveTo(13.0f, 16.0f)
                curveTo(13.0f, 16.552f, 12.552f, 17.0f, 12.0f, 17.0f)
                curveTo(11.448f, 17.0f, 11.0f, 16.552f, 11.0f, 16.0f)
                curveTo(11.0f, 15.448f, 11.448f, 15.0f, 12.0f, 15.0f)
                curveTo(12.552f, 15.0f, 13.0f, 15.448f, 13.0f, 16.0f)
                close()
            }
        }
        .build()
        return _circleexclamationfill!!
    }

private var _circleexclamationfill: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Circleexclamationfill, contentDescription = "")
    }
}
