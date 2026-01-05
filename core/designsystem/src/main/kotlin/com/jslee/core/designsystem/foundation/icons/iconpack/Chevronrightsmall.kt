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

public val MooBesideIconPack.Chevronrightsmall: ImageVector
    get() {
        if (_chevronrightsmall != null) {
            return _chevronrightsmall!!
        }
        _chevronrightsmall = Builder(name = "Chevronrightsmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.864f, 4.863f)
                curveTo(8.512f, 5.215f, 8.512f, 5.785f, 8.864f, 6.136f)
                lineTo(14.727f, 12.0f)
                lineTo(8.864f, 17.864f)
                curveTo(8.512f, 18.215f, 8.512f, 18.785f, 8.864f, 19.136f)
                curveTo(9.215f, 19.488f, 9.785f, 19.488f, 10.137f, 19.136f)
                lineTo(16.637f, 12.636f)
                curveTo(16.988f, 12.285f, 16.988f, 11.715f, 16.637f, 11.363f)
                lineTo(10.137f, 4.863f)
                curveTo(9.785f, 4.512f, 9.215f, 4.512f, 8.864f, 4.863f)
                close()
            }
        }
        .build()
        return _chevronrightsmall!!
    }

private var _chevronrightsmall: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Chevronrightsmall, contentDescription = "")
    }
}
