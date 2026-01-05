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

public val MooBesideIconPack.Chevrondown: ImageVector
    get() {
        if (_chevrondown != null) {
            return _chevrondown!!
        }
        _chevrondown = Builder(name = "Chevrondown", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.364f, 7.363f)
                curveTo(3.715f, 7.012f, 4.285f, 7.012f, 4.636f, 7.363f)
                lineTo(12.0f, 14.727f)
                lineTo(19.364f, 7.363f)
                curveTo(19.715f, 7.012f, 20.285f, 7.012f, 20.636f, 7.363f)
                curveTo(20.988f, 7.715f, 20.988f, 8.285f, 20.636f, 8.636f)
                lineTo(12.636f, 16.636f)
                curveTo(12.285f, 16.988f, 11.715f, 16.988f, 11.364f, 16.636f)
                lineTo(3.364f, 8.636f)
                curveTo(3.012f, 8.285f, 3.012f, 7.715f, 3.364f, 7.363f)
                close()
            }
        }
        .build()
        return _chevrondown!!
    }

private var _chevrondown: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Chevrondown, contentDescription = "")
    }
}
