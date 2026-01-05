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

public val MooBesideIconPack.Chevronupthicksmall: ImageVector
    get() {
        if (_chevronupthicksmall != null) {
            return _chevronupthicksmall!!
        }
        _chevronupthicksmall = Builder(name = "Chevronupthicksmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.081f, 15.919f)
                curveTo(4.588f, 16.427f, 5.411f, 16.427f, 5.919f, 15.919f)
                lineTo(12.0f, 9.838f)
                lineTo(18.081f, 15.919f)
                curveTo(18.588f, 16.427f, 19.411f, 16.427f, 19.919f, 15.919f)
                curveTo(20.427f, 15.412f, 20.427f, 14.589f, 19.919f, 14.081f)
                lineTo(12.919f, 7.081f)
                curveTo(12.411f, 6.573f, 11.588f, 6.573f, 11.081f, 7.081f)
                lineTo(4.081f, 14.081f)
                curveTo(3.573f, 14.589f, 3.573f, 15.412f, 4.081f, 15.919f)
                close()
            }
        }
        .build()
        return _chevronupthicksmall!!
    }

private var _chevronupthicksmall: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Chevronupthicksmall, contentDescription = "")
    }
}
