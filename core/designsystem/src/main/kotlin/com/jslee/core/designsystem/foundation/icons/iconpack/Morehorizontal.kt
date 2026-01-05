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

public val MooBesideIconPack.Morehorizontal: ImageVector
    get() {
        if (_morehorizontal != null) {
            return _morehorizontal!!
        }
        _morehorizontal = Builder(name = "Morehorizontal", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.25f, 13.75f)
                curveTo(6.216f, 13.75f, 7.0f, 12.967f, 7.0f, 12.0f)
                curveTo(7.0f, 11.033f, 6.216f, 10.25f, 5.25f, 10.25f)
                curveTo(4.283f, 10.25f, 3.5f, 11.033f, 3.5f, 12.0f)
                curveTo(3.5f, 12.967f, 4.283f, 13.75f, 5.25f, 13.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.75f, 12.0f)
                curveTo(13.75f, 12.967f, 12.966f, 13.75f, 12.0f, 13.75f)
                curveTo(11.033f, 13.75f, 10.25f, 12.967f, 10.25f, 12.0f)
                curveTo(10.25f, 11.033f, 11.033f, 10.25f, 12.0f, 10.25f)
                curveTo(12.966f, 10.25f, 13.75f, 11.033f, 13.75f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.5f, 12.0f)
                curveTo(20.5f, 12.967f, 19.716f, 13.75f, 18.75f, 13.75f)
                curveTo(17.783f, 13.75f, 17.0f, 12.967f, 17.0f, 12.0f)
                curveTo(17.0f, 11.033f, 17.783f, 10.25f, 18.75f, 10.25f)
                curveTo(19.716f, 10.25f, 20.5f, 11.033f, 20.5f, 12.0f)
                close()
            }
        }
        .build()
        return _morehorizontal!!
    }

private var _morehorizontal: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Morehorizontal, contentDescription = "")
    }
}
