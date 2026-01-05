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

public val MooBesideIconPack.Chevronupsmall: ImageVector
    get() {
        if (_chevronupsmall != null) {
            return _chevronupsmall!!
        }
        _chevronupsmall = Builder(name = "Chevronupsmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.363f, 15.636f)
                curveTo(4.715f, 15.988f, 5.285f, 15.988f, 5.636f, 15.636f)
                lineTo(12.0f, 9.273f)
                lineTo(18.363f, 15.636f)
                curveTo(18.715f, 15.988f, 19.285f, 15.988f, 19.636f, 15.636f)
                curveTo(19.988f, 15.285f, 19.988f, 14.715f, 19.636f, 14.364f)
                lineTo(12.636f, 7.364f)
                curveTo(12.285f, 7.012f, 11.715f, 7.012f, 11.363f, 7.364f)
                lineTo(4.363f, 14.364f)
                curveTo(4.012f, 14.715f, 4.012f, 15.285f, 4.363f, 15.636f)
                close()
            }
        }
        .build()
        return _chevronupsmall!!
    }

private var _chevronupsmall: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Chevronupsmall, contentDescription = "")
    }
}
