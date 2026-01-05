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

public val MooBesideIconPack.Eye: ImageVector
    get() {
        if (_eye != null) {
            return _eye!!
        }
        _eye = Builder(name = "Eye", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 8.099f)
                curveTo(9.846f, 8.099f, 8.1f, 9.846f, 8.1f, 12.0f)
                curveTo(8.1f, 14.153f, 9.846f, 15.899f, 12.0f, 15.899f)
                curveTo(14.154f, 15.899f, 15.9f, 14.153f, 15.9f, 12.0f)
                curveTo(15.9f, 9.846f, 14.154f, 8.099f, 12.0f, 8.099f)
                close()
                moveTo(9.9f, 12.0f)
                curveTo(9.9f, 10.84f, 10.84f, 9.899f, 12.0f, 9.899f)
                curveTo(13.16f, 9.899f, 14.1f, 10.84f, 14.1f, 12.0f)
                curveTo(14.1f, 13.159f, 13.16f, 14.099f, 12.0f, 14.099f)
                curveTo(10.84f, 14.099f, 9.9f, 13.159f, 9.9f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 19.399f)
                curveTo(16.556f, 19.399f, 20.459f, 16.604f, 22.088f, 12.634f)
                curveTo(22.255f, 12.227f, 22.255f, 11.771f, 22.088f, 11.364f)
                curveTo(20.459f, 7.395f, 16.556f, 4.6f, 12.0f, 4.6f)
                curveTo(7.444f, 4.6f, 3.54f, 7.395f, 1.912f, 11.364f)
                curveTo(1.745f, 11.771f, 1.745f, 12.227f, 1.912f, 12.634f)
                curveTo(3.54f, 16.604f, 7.444f, 19.399f, 12.0f, 19.399f)
                close()
                moveTo(3.597f, 11.999f)
                curveTo(4.969f, 8.711f, 8.215f, 6.4f, 12.0f, 6.4f)
                curveTo(15.785f, 6.4f, 19.031f, 8.711f, 20.402f, 11.999f)
                curveTo(19.031f, 15.288f, 15.785f, 17.599f, 12.0f, 17.599f)
                curveTo(8.215f, 17.599f, 4.969f, 15.288f, 3.597f, 11.999f)
                close()
            }
        }
        .build()
        return _eye!!
    }

private var _eye: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Eye, contentDescription = "")
    }
}
