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

public val MooBesideIconPack.Chevrondownthick: ImageVector
    get() {
        if (_chevrondownthick != null) {
            return _chevrondownthick!!
        }
        _chevrondownthick = Builder(name = "Chevrondownthick", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.081f, 7.581f)
                curveTo(3.589f, 7.073f, 4.412f, 7.073f, 4.919f, 7.581f)
                lineTo(12.0f, 14.661f)
                lineTo(19.081f, 7.581f)
                curveTo(19.589f, 7.073f, 20.412f, 7.073f, 20.919f, 7.581f)
                curveTo(21.427f, 8.088f, 21.427f, 8.912f, 20.919f, 9.419f)
                lineTo(12.919f, 17.419f)
                curveTo(12.412f, 17.927f, 11.589f, 17.927f, 11.081f, 17.419f)
                lineTo(3.081f, 9.419f)
                curveTo(2.573f, 8.912f, 2.573f, 8.088f, 3.081f, 7.581f)
                close()
            }
        }
        .build()
        return _chevrondownthick!!
    }

private var _chevrondownthick: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Chevrondownthick, contentDescription = "")
    }
}
