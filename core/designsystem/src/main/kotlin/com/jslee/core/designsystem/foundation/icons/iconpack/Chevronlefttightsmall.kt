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

public val MooBesideIconPack.Chevronlefttightsmall: ImageVector
    get() {
        if (_chevronlefttightsmall != null) {
            return _chevronlefttightsmall!!
        }
        _chevronlefttightsmall = Builder(name = "Chevronlefttightsmall", defaultWidth = 12.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 12.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.136f, 4.864f)
                curveTo(9.488f, 5.215f, 9.488f, 5.785f, 9.136f, 6.136f)
                lineTo(3.272f, 12.0f)
                lineTo(9.136f, 17.864f)
                curveTo(9.488f, 18.215f, 9.488f, 18.785f, 9.136f, 19.136f)
                curveTo(8.785f, 19.488f, 8.215f, 19.488f, 7.863f, 19.136f)
                lineTo(1.363f, 12.636f)
                curveTo(1.012f, 12.285f, 1.012f, 11.715f, 1.363f, 11.364f)
                lineTo(7.863f, 4.864f)
                curveTo(8.215f, 4.512f, 8.785f, 4.512f, 9.136f, 4.864f)
                close()
            }
        }
        .build()
        return _chevronlefttightsmall!!
    }

private var _chevronlefttightsmall: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Chevronlefttightsmall, contentDescription = "")
    }
}
