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

public val MooBesideIconPack.Chevrondoublerightthicksmall: ImageVector
    get() {
        if (_chevrondoublerightthicksmall != null) {
            return _chevrondoublerightthicksmall!!
        }
        _chevrondoublerightthicksmall = Builder(name = "Chevrondoublerightthicksmall", defaultWidth
                = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.081f, 6.423f)
                curveTo(3.573f, 5.916f, 3.573f, 5.093f, 4.081f, 4.585f)
                curveTo(4.588f, 4.077f, 5.412f, 4.077f, 5.919f, 4.585f)
                lineTo(12.419f, 11.085f)
                curveTo(12.663f, 11.329f, 12.8f, 11.659f, 12.8f, 12.004f)
                curveTo(12.8f, 12.349f, 12.663f, 12.679f, 12.419f, 12.923f)
                lineTo(5.919f, 19.423f)
                curveTo(5.412f, 19.931f, 4.588f, 19.931f, 4.081f, 19.423f)
                curveTo(3.573f, 18.916f, 3.573f, 18.093f, 4.081f, 17.585f)
                lineTo(9.661f, 12.004f)
                lineTo(4.081f, 6.423f)
                close()
                moveTo(12.081f, 6.423f)
                curveTo(11.573f, 5.916f, 11.573f, 5.093f, 12.081f, 4.585f)
                curveTo(12.589f, 4.077f, 13.412f, 4.077f, 13.919f, 4.585f)
                lineTo(20.419f, 11.085f)
                curveTo(20.663f, 11.329f, 20.8f, 11.659f, 20.8f, 12.004f)
                curveTo(20.8f, 12.349f, 20.663f, 12.679f, 20.419f, 12.923f)
                lineTo(13.919f, 19.423f)
                curveTo(13.412f, 19.931f, 12.589f, 19.931f, 12.081f, 19.423f)
                curveTo(11.573f, 18.916f, 11.573f, 18.093f, 12.081f, 17.585f)
                lineTo(17.662f, 12.004f)
                lineTo(12.081f, 6.423f)
                close()
            }
        }
        .build()
        return _chevrondoublerightthicksmall!!
    }

private var _chevrondoublerightthicksmall: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Chevrondoublerightthicksmall, contentDescription = "")
    }
}
