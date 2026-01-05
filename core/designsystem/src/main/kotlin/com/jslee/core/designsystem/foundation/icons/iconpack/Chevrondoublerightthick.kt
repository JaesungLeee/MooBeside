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

public val MooBesideIconPack.Chevrondoublerightthick: ImageVector
    get() {
        if (_chevrondoublerightthick != null) {
            return _chevrondoublerightthick!!
        }
        _chevrondoublerightthick = Builder(name = "Chevrondoublerightthick", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.581f, 4.917f)
                curveTo(2.073f, 4.41f, 2.073f, 3.587f, 2.581f, 3.079f)
                curveTo(3.089f, 2.571f, 3.912f, 2.571f, 4.419f, 3.079f)
                lineTo(12.419f, 11.079f)
                curveTo(12.927f, 11.587f, 12.927f, 12.41f, 12.419f, 12.917f)
                lineTo(4.419f, 20.917f)
                curveTo(3.912f, 21.425f, 3.089f, 21.425f, 2.581f, 20.917f)
                curveTo(2.073f, 20.41f, 2.073f, 19.587f, 2.581f, 19.079f)
                lineTo(9.662f, 11.998f)
                lineTo(2.581f, 4.917f)
                close()
                moveTo(12.081f, 4.917f)
                curveTo(11.573f, 4.41f, 11.573f, 3.587f, 12.081f, 3.079f)
                curveTo(12.589f, 2.571f, 13.412f, 2.571f, 13.919f, 3.079f)
                lineTo(21.919f, 11.079f)
                curveTo(22.427f, 11.587f, 22.427f, 12.41f, 21.919f, 12.917f)
                lineTo(13.919f, 20.917f)
                curveTo(13.412f, 21.425f, 12.589f, 21.425f, 12.081f, 20.917f)
                curveTo(11.573f, 20.41f, 11.573f, 19.587f, 12.081f, 19.079f)
                lineTo(19.162f, 11.998f)
                lineTo(12.081f, 4.917f)
                close()
            }
        }
        .build()
        return _chevrondoublerightthick!!
    }

private var _chevrondoublerightthick: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Chevrondoublerightthick, contentDescription = "")
    }
}
