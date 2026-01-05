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

public val MooBesideIconPack.Exclamation: ImageVector
    get() {
        if (_exclamation != null) {
            return _exclamation!!
        }
        _exclamation = Builder(name = "Exclamation", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.9f, 5.0f)
                curveTo(12.9f, 4.503f, 12.497f, 4.1f, 12.0f, 4.1f)
                curveTo(11.503f, 4.1f, 11.1f, 4.503f, 11.1f, 5.0f)
                verticalLineTo(14.5f)
                curveTo(11.1f, 14.997f, 11.503f, 15.4f, 12.0f, 15.4f)
                curveTo(12.497f, 15.4f, 12.9f, 14.997f, 12.9f, 14.5f)
                verticalLineTo(5.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 20.25f)
                curveTo(12.69f, 20.25f, 13.25f, 19.691f, 13.25f, 19.0f)
                curveTo(13.25f, 18.31f, 12.69f, 17.75f, 12.0f, 17.75f)
                curveTo(11.309f, 17.75f, 10.75f, 18.31f, 10.75f, 19.0f)
                curveTo(10.75f, 19.691f, 11.309f, 20.25f, 12.0f, 20.25f)
                close()
            }
        }
        .build()
        return _exclamation!!
    }

private var _exclamation: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Exclamation, contentDescription = "")
    }
}
