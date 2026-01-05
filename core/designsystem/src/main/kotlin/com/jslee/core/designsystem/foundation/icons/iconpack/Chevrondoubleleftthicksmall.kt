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

public val MooBesideIconPack.Chevrondoubleleftthicksmall: ImageVector
    get() {
        if (_chevrondoubleleftthicksmall != null) {
            return _chevrondoubleleftthicksmall!!
        }
        _chevrondoubleleftthicksmall = Builder(name = "Chevrondoubleleftthicksmall", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(19.92f, 6.417f)
                curveTo(20.427f, 5.91f, 20.427f, 5.087f, 19.92f, 4.579f)
                curveTo(19.412f, 4.071f, 18.589f, 4.071f, 18.081f, 4.579f)
                lineTo(11.581f, 11.079f)
                curveTo(11.074f, 11.587f, 11.074f, 12.41f, 11.581f, 12.917f)
                lineTo(18.081f, 19.417f)
                curveTo(18.589f, 19.925f, 19.412f, 19.925f, 19.92f, 19.417f)
                curveTo(20.427f, 18.91f, 20.427f, 18.087f, 19.92f, 17.579f)
                lineTo(14.339f, 11.998f)
                lineTo(19.92f, 6.417f)
                close()
                moveTo(11.919f, 6.418f)
                curveTo(12.427f, 5.91f, 12.427f, 5.087f, 11.919f, 4.579f)
                curveTo(11.412f, 4.072f, 10.589f, 4.072f, 10.081f, 4.579f)
                lineTo(3.581f, 11.079f)
                curveTo(3.073f, 11.587f, 3.073f, 12.41f, 3.581f, 12.918f)
                lineTo(10.081f, 19.418f)
                curveTo(10.589f, 19.925f, 11.412f, 19.925f, 11.919f, 19.418f)
                curveTo(12.427f, 18.91f, 12.427f, 18.087f, 11.919f, 17.579f)
                lineTo(6.339f, 11.998f)
                lineTo(11.919f, 6.418f)
                close()
            }
        }
        .build()
        return _chevrondoubleleftthicksmall!!
    }

private var _chevrondoubleleftthicksmall: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Chevrondoubleleftthicksmall, contentDescription = "")
    }
}
