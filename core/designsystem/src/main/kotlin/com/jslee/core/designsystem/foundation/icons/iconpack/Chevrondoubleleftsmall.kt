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

public val MooBesideIconPack.Chevrondoubleleftsmall: ImageVector
    get() {
        if (_chevrondoubleleftsmall != null) {
            return _chevrondoubleleftsmall!!
        }
        _chevrondoubleleftsmall = Builder(name = "Chevrondoubleleftsmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.636f, 6.14f)
                curveTo(11.988f, 5.788f, 11.988f, 5.219f, 11.636f, 4.867f)
                curveTo(11.285f, 4.516f, 10.715f, 4.516f, 10.364f, 4.867f)
                lineTo(3.864f, 11.367f)
                curveTo(3.695f, 11.536f, 3.6f, 11.765f, 3.6f, 12.003f)
                curveTo(3.6f, 12.242f, 3.695f, 12.471f, 3.864f, 12.64f)
                lineTo(10.364f, 19.14f)
                curveTo(10.715f, 19.491f, 11.285f, 19.491f, 11.636f, 19.14f)
                curveTo(11.988f, 18.788f, 11.988f, 18.219f, 11.636f, 17.867f)
                lineTo(5.773f, 12.003f)
                lineTo(11.636f, 6.14f)
                close()
                moveTo(19.637f, 6.14f)
                curveTo(19.988f, 5.788f, 19.988f, 5.219f, 19.637f, 4.867f)
                curveTo(19.285f, 4.516f, 18.715f, 4.516f, 18.364f, 4.867f)
                lineTo(11.864f, 11.367f)
                curveTo(11.695f, 11.536f, 11.6f, 11.765f, 11.6f, 12.003f)
                curveTo(11.6f, 12.242f, 11.695f, 12.471f, 11.864f, 12.64f)
                lineTo(18.364f, 19.14f)
                curveTo(18.715f, 19.491f, 19.285f, 19.491f, 19.637f, 19.14f)
                curveTo(19.988f, 18.788f, 19.988f, 18.219f, 19.637f, 17.867f)
                lineTo(13.773f, 12.003f)
                lineTo(19.637f, 6.14f)
                close()
            }
        }
        .build()
        return _chevrondoubleleftsmall!!
    }

private var _chevrondoubleleftsmall: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Chevrondoubleleftsmall, contentDescription = "")
    }
}
