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

public val MooBesideIconPack.Eyefill: ImageVector
    get() {
        if (_eyefill != null) {
            return _eyefill!!
        }
        _eyefill = Builder(name = "Eyefill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.9f, 12.0f)
                curveTo(9.9f, 10.84f, 10.84f, 9.9f, 12.0f, 9.9f)
                curveTo(13.16f, 9.9f, 14.1f, 10.84f, 14.1f, 12.0f)
                curveTo(14.1f, 13.16f, 13.16f, 14.1f, 12.0f, 14.1f)
                curveTo(10.84f, 14.1f, 9.9f, 13.16f, 9.9f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(22.094f, 12.634f)
                curveTo(22.261f, 12.227f, 22.261f, 11.771f, 22.094f, 11.364f)
                curveTo(20.465f, 7.395f, 16.562f, 4.6f, 12.005f, 4.6f)
                curveTo(7.449f, 4.6f, 3.546f, 7.395f, 1.917f, 11.364f)
                curveTo(1.75f, 11.771f, 1.75f, 12.227f, 1.917f, 12.634f)
                curveTo(3.546f, 16.604f, 7.449f, 19.399f, 12.005f, 19.399f)
                curveTo(16.562f, 19.399f, 20.465f, 16.604f, 22.094f, 12.634f)
                close()
                moveTo(12.0f, 8.1f)
                curveTo(9.846f, 8.1f, 8.1f, 9.846f, 8.1f, 12.0f)
                curveTo(8.1f, 14.154f, 9.846f, 15.9f, 12.0f, 15.9f)
                curveTo(14.154f, 15.9f, 15.9f, 14.154f, 15.9f, 12.0f)
                curveTo(15.9f, 9.846f, 14.154f, 8.1f, 12.0f, 8.1f)
                close()
            }
        }
        .build()
        return _eyefill!!
    }

private var _eyefill: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Eyefill, contentDescription = "")
    }
}
