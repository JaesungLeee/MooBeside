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

public val MooBesideIconPack.Chevronleftsmall: ImageVector
    get() {
        if (_chevronleftsmall != null) {
            return _chevronleftsmall!!
        }
        _chevronleftsmall = Builder(name = "Chevronleftsmall", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.137f, 4.864f)
                curveTo(15.488f, 5.215f, 15.488f, 5.785f, 15.137f, 6.136f)
                lineTo(9.273f, 12.0f)
                lineTo(15.137f, 17.864f)
                curveTo(15.488f, 18.215f, 15.488f, 18.785f, 15.137f, 19.136f)
                curveTo(14.785f, 19.488f, 14.215f, 19.488f, 13.864f, 19.136f)
                lineTo(7.364f, 12.637f)
                curveTo(7.012f, 12.285f, 7.012f, 11.715f, 7.364f, 11.364f)
                lineTo(13.864f, 4.864f)
                curveTo(14.215f, 4.512f, 14.785f, 4.512f, 15.137f, 4.864f)
                close()
            }
        }
        .build()
        return _chevronleftsmall!!
    }

private var _chevronleftsmall: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Chevronleftsmall, contentDescription = "")
    }
}
