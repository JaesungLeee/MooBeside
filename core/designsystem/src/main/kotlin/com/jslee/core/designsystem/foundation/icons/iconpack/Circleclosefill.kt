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

public val MooBesideIconPack.Circleclosefill: ImageVector
    get() {
        if (_circleclosefill != null) {
            return _circleclosefill!!
        }
        _circleclosefill = Builder(name = "Circleclosefill", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(9.136f, 7.864f)
                curveTo(8.785f, 7.512f, 8.215f, 7.512f, 7.864f, 7.864f)
                curveTo(7.512f, 8.215f, 7.512f, 8.785f, 7.864f, 9.137f)
                lineTo(10.727f, 12.0f)
                lineTo(7.864f, 14.864f)
                curveTo(7.512f, 15.215f, 7.512f, 15.785f, 7.864f, 16.136f)
                curveTo(8.215f, 16.488f, 8.785f, 16.488f, 9.136f, 16.136f)
                lineTo(12.0f, 13.273f)
                lineTo(14.863f, 16.136f)
                curveTo(15.215f, 16.488f, 15.785f, 16.488f, 16.136f, 16.136f)
                curveTo(16.488f, 15.785f, 16.488f, 15.215f, 16.136f, 14.864f)
                lineTo(13.273f, 12.0f)
                lineTo(16.136f, 9.137f)
                curveTo(16.488f, 8.785f, 16.488f, 8.215f, 16.136f, 7.864f)
                curveTo(15.785f, 7.512f, 15.215f, 7.512f, 14.863f, 7.864f)
                lineTo(12.0f, 10.727f)
                lineTo(9.136f, 7.864f)
                close()
            }
        }
        .build()
        return _circleclosefill!!
    }

private var _circleclosefill: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Circleclosefill, contentDescription = "")
    }
}
