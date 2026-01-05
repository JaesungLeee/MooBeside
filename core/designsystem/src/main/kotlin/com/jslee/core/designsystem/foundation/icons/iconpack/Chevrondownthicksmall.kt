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

public val MooBesideIconPack.Chevrondownthicksmall: ImageVector
    get() {
        if (_chevrondownthicksmall != null) {
            return _chevrondownthicksmall!!
        }
        _chevrondownthicksmall = Builder(name = "Chevrondownthicksmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.081f, 8.081f)
                curveTo(4.588f, 7.573f, 5.411f, 7.573f, 5.919f, 8.081f)
                lineTo(12.0f, 14.161f)
                lineTo(18.081f, 8.081f)
                curveTo(18.588f, 7.573f, 19.411f, 7.573f, 19.919f, 8.081f)
                curveTo(20.427f, 8.588f, 20.427f, 9.412f, 19.919f, 9.919f)
                lineTo(12.919f, 16.919f)
                curveTo(12.411f, 17.427f, 11.588f, 17.427f, 11.081f, 16.919f)
                lineTo(4.081f, 9.919f)
                curveTo(3.573f, 9.412f, 3.573f, 8.588f, 4.081f, 8.081f)
                close()
            }
        }
        .build()
        return _chevrondownthicksmall!!
    }

private var _chevrondownthicksmall: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Chevrondownthicksmall, contentDescription = "")
    }
}
