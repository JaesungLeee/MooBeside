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

public val MooBesideIconPack.Documentfill: ImageVector
    get() {
        if (_documentfill != null) {
            return _documentfill!!
        }
        _documentfill = Builder(name = "Documentfill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.65f, 2.1f)
                curveTo(12.646f, 2.1f, 12.642f, 2.1f, 12.637f, 2.1f)
                lineTo(12.587f, 2.1f)
                lineTo(7.915f, 2.1f)
                curveTo(7.385f, 2.1f, 6.933f, 2.1f, 6.563f, 2.13f)
                curveTo(6.174f, 2.162f, 5.795f, 2.232f, 5.433f, 2.416f)
                curveTo(4.888f, 2.694f, 4.444f, 3.138f, 4.166f, 3.684f)
                curveTo(3.982f, 4.046f, 3.912f, 4.424f, 3.88f, 4.813f)
                curveTo(3.85f, 5.184f, 3.85f, 5.635f, 3.85f, 6.165f)
                verticalLineTo(17.836f)
                curveTo(3.85f, 18.365f, 3.85f, 18.817f, 3.88f, 19.187f)
                curveTo(3.912f, 19.576f, 3.982f, 19.955f, 4.166f, 20.317f)
                curveTo(4.444f, 20.862f, 4.888f, 21.306f, 5.433f, 21.584f)
                curveTo(5.795f, 21.768f, 6.174f, 21.838f, 6.563f, 21.87f)
                curveTo(6.933f, 21.9f, 7.385f, 21.9f, 7.915f, 21.9f)
                horizontalLineTo(16.085f)
                curveTo(16.615f, 21.9f, 17.066f, 21.9f, 17.437f, 21.87f)
                curveTo(17.826f, 21.838f, 18.205f, 21.768f, 18.566f, 21.584f)
                curveTo(19.112f, 21.306f, 19.556f, 20.862f, 19.834f, 20.317f)
                curveTo(20.018f, 19.955f, 20.088f, 19.576f, 20.12f, 19.187f)
                curveTo(20.15f, 18.817f, 20.15f, 18.365f, 20.15f, 17.836f)
                verticalLineTo(9.85f)
                lineTo(15.072f, 9.85f)
                curveTo(14.816f, 9.85f, 14.576f, 9.85f, 14.374f, 9.834f)
                curveTo(14.155f, 9.816f, 13.907f, 9.774f, 13.66f, 9.648f)
                curveTo(13.312f, 9.471f, 13.029f, 9.188f, 12.852f, 8.84f)
                curveTo(12.726f, 8.593f, 12.685f, 8.345f, 12.667f, 8.126f)
                curveTo(12.65f, 7.924f, 12.65f, 7.684f, 12.65f, 7.429f)
                lineTo(12.65f, 2.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.35f, 2.828f)
                lineTo(14.355f, 2.832f)
                lineTo(19.665f, 8.15f)
                horizontalLineTo(14.5f)
                curveTo(14.417f, 8.15f, 14.35f, 8.083f, 14.35f, 8.0f)
                verticalLineTo(2.828f)
                close()
            }
        }
        .build()
        return _documentfill!!
    }

private var _documentfill: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Documentfill, contentDescription = "")
    }
}
