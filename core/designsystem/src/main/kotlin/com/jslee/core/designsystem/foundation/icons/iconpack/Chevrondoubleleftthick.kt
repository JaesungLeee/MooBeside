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

public val MooBesideIconPack.Chevrondoubleleftthick: ImageVector
    get() {
        if (_chevrondoubleleftthick != null) {
            return _chevrondoubleleftthick!!
        }
        _chevrondoubleleftthick = Builder(name = "Chevrondoubleleftthick", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(21.419f, 4.917f)
                curveTo(21.927f, 4.41f, 21.927f, 3.587f, 21.419f, 3.079f)
                curveTo(20.912f, 2.571f, 20.088f, 2.571f, 19.581f, 3.079f)
                lineTo(11.581f, 11.079f)
                curveTo(11.073f, 11.587f, 11.073f, 12.41f, 11.581f, 12.917f)
                lineTo(19.581f, 20.917f)
                curveTo(20.088f, 21.425f, 20.912f, 21.425f, 21.419f, 20.917f)
                curveTo(21.927f, 20.41f, 21.927f, 19.587f, 21.419f, 19.079f)
                lineTo(14.338f, 11.998f)
                lineTo(21.419f, 4.917f)
                close()
                moveTo(11.919f, 4.918f)
                curveTo(12.427f, 4.41f, 12.427f, 3.587f, 11.919f, 3.079f)
                curveTo(11.411f, 2.572f, 10.588f, 2.572f, 10.081f, 3.079f)
                lineTo(2.081f, 11.079f)
                curveTo(1.573f, 11.587f, 1.573f, 12.41f, 2.081f, 12.918f)
                lineTo(10.081f, 20.918f)
                curveTo(10.588f, 21.425f, 11.411f, 21.425f, 11.919f, 20.918f)
                curveTo(12.427f, 20.41f, 12.427f, 19.587f, 11.919f, 19.079f)
                lineTo(4.838f, 11.998f)
                lineTo(11.919f, 4.918f)
                close()
            }
        }
        .build()
        return _chevrondoubleleftthick!!
    }

private var _chevrondoubleleftthick: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Chevrondoubleleftthick, contentDescription = "")
    }
}
