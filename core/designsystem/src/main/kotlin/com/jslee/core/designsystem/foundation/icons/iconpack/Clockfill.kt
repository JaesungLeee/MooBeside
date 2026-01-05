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

public val MooBesideIconPack.Clockfill: ImageVector
    get() {
        if (_clockfill != null) {
            return _clockfill!!
        }
        _clockfill = Builder(name = "Clockfill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 2.1f)
                curveTo(6.532f, 2.1f, 2.1f, 6.532f, 2.1f, 12.0f)
                curveTo(2.1f, 17.468f, 6.532f, 21.9f, 12.0f, 21.9f)
                curveTo(17.468f, 21.9f, 21.9f, 17.468f, 21.9f, 12.0f)
                curveTo(21.9f, 6.532f, 17.468f, 2.1f, 12.0f, 2.1f)
                close()
                moveTo(11.5f, 6.1f)
                curveTo(11.997f, 6.1f, 12.4f, 6.502f, 12.4f, 7.0f)
                verticalLineTo(12.127f)
                lineTo(14.715f, 14.441f)
                curveTo(15.066f, 14.793f, 15.066f, 15.363f, 14.715f, 15.714f)
                curveTo(14.363f, 16.066f, 13.793f, 16.066f, 13.442f, 15.714f)
                lineTo(10.863f, 13.136f)
                curveTo(10.684f, 12.956f, 10.596f, 12.72f, 10.6f, 12.485f)
                verticalLineTo(7.0f)
                curveTo(10.6f, 6.502f, 11.003f, 6.1f, 11.5f, 6.1f)
                close()
            }
        }
        .build()
        return _clockfill!!
    }

private var _clockfill: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Clockfill, contentDescription = "")
    }
}
