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

public val MooBesideIconPack.Chevrondoublerightsmall: ImageVector
    get() {
        if (_chevrondoublerightsmall != null) {
            return _chevrondoublerightsmall!!
        }
        _chevrondoublerightsmall = Builder(name = "Chevrondoublerightsmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.364f, 6.14f)
                curveTo(4.012f, 5.788f, 4.012f, 5.219f, 4.364f, 4.867f)
                curveTo(4.715f, 4.516f, 5.285f, 4.516f, 5.636f, 4.867f)
                lineTo(12.136f, 11.367f)
                curveTo(12.305f, 11.536f, 12.4f, 11.765f, 12.4f, 12.003f)
                curveTo(12.4f, 12.242f, 12.305f, 12.471f, 12.136f, 12.64f)
                lineTo(5.636f, 19.14f)
                curveTo(5.285f, 19.491f, 4.715f, 19.491f, 4.364f, 19.14f)
                curveTo(4.012f, 18.788f, 4.012f, 18.219f, 4.364f, 17.867f)
                lineTo(10.227f, 12.003f)
                lineTo(4.364f, 6.14f)
                close()
                moveTo(12.364f, 6.14f)
                curveTo(12.012f, 5.788f, 12.012f, 5.219f, 12.364f, 4.867f)
                curveTo(12.715f, 4.516f, 13.285f, 4.516f, 13.637f, 4.867f)
                lineTo(20.137f, 11.367f)
                curveTo(20.305f, 11.536f, 20.4f, 11.765f, 20.4f, 12.003f)
                curveTo(20.4f, 12.242f, 20.305f, 12.471f, 20.137f, 12.64f)
                lineTo(13.637f, 19.14f)
                curveTo(13.285f, 19.491f, 12.715f, 19.491f, 12.364f, 19.14f)
                curveTo(12.012f, 18.788f, 12.012f, 18.219f, 12.364f, 17.867f)
                lineTo(18.227f, 12.003f)
                lineTo(12.364f, 6.14f)
                close()
            }
        }
        .build()
        return _chevrondoublerightsmall!!
    }

private var _chevrondoublerightsmall: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Chevrondoublerightsmall, contentDescription = "")
    }
}
