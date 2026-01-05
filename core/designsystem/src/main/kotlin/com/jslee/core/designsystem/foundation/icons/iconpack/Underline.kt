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

public val MooBesideIconPack.Underline: ImageVector
    get() {
        if (_underline != null) {
            return _underline!!
        }
        _underline = Builder(name = "Underline", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.998f, 17.829f)
                curveTo(8.1f, 17.829f, 5.517f, 14.964f, 5.517f, 10.69f)
                verticalLineTo(4.033f)
                curveTo(5.517f, 3.463f, 5.98f, 3.0f, 6.551f, 3.0f)
                curveTo(7.121f, 3.0f, 7.584f, 3.463f, 7.584f, 4.033f)
                verticalLineTo(10.69f)
                curveTo(7.584f, 13.79f, 9.345f, 15.856f, 11.998f, 15.856f)
                curveTo(14.652f, 15.856f, 16.413f, 13.79f, 16.413f, 10.69f)
                verticalLineTo(4.033f)
                curveTo(16.413f, 3.463f, 16.876f, 3.0f, 17.446f, 3.0f)
                curveTo(18.017f, 3.0f, 18.479f, 3.463f, 18.479f, 4.033f)
                verticalLineTo(10.69f)
                curveTo(18.479f, 14.964f, 15.896f, 17.829f, 11.998f, 17.829f)
                close()
            }
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 20.1f)
                curveTo(4.503f, 20.1f, 4.1f, 20.503f, 4.1f, 21.0f)
                curveTo(4.1f, 21.497f, 4.503f, 21.9f, 5.0f, 21.9f)
                horizontalLineTo(19.0f)
                curveTo(19.497f, 21.9f, 19.9f, 21.497f, 19.9f, 21.0f)
                curveTo(19.9f, 20.503f, 19.497f, 20.1f, 19.0f, 20.1f)
                horizontalLineTo(5.0f)
                close()
            }
        }
        .build()
        return _underline!!
    }

private var _underline: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Underline, contentDescription = "")
    }
}
