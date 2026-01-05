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

public val MooBesideIconPack.Dislikefill: ImageVector
    get() {
        if (_dislikefill != null) {
            return _dislikefill!!
        }
        _dislikefill = Builder(name = "Dislikefill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.216f, 20.164f)
                curveTo(13.846f, 21.062f, 12.971f, 21.649f, 12.0f, 21.649f)
                curveTo(10.675f, 21.649f, 9.602f, 20.575f, 9.602f, 19.251f)
                verticalLineTo(14.899f)
                lineTo(6.399f, 14.899f)
                curveTo(5.782f, 14.899f, 5.261f, 14.899f, 4.839f, 14.862f)
                curveTo(4.4f, 14.824f, 3.972f, 14.741f, 3.576f, 14.514f)
                curveTo(2.988f, 14.176f, 2.536f, 13.642f, 2.301f, 13.006f)
                curveTo(2.142f, 12.579f, 2.131f, 12.143f, 2.166f, 11.703f)
                curveTo(2.2f, 11.281f, 2.286f, 10.767f, 2.388f, 10.158f)
                lineTo(3.172f, 5.489f)
                curveTo(3.247f, 5.041f, 3.311f, 4.657f, 3.389f, 4.342f)
                curveTo(3.471f, 4.008f, 3.582f, 3.69f, 3.781f, 3.391f)
                curveTo(4.084f, 2.936f, 4.51f, 2.576f, 5.009f, 2.352f)
                curveTo(5.336f, 2.206f, 5.669f, 2.149f, 6.011f, 2.123f)
                curveTo(6.335f, 2.099f, 6.724f, 2.099f, 7.178f, 2.099f)
                horizontalLineTo(17.102f)
                verticalLineTo(13.155f)
                lineTo(14.216f, 20.164f)
                close()
            }
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.902f, 13.149f)
                lineTo(20.224f, 13.149f)
                curveTo(20.344f, 13.149f, 20.483f, 13.149f, 20.604f, 13.139f)
                curveTo(20.743f, 13.127f, 20.936f, 13.099f, 21.138f, 12.996f)
                curveTo(21.401f, 12.862f, 21.615f, 12.648f, 21.75f, 12.384f)
                curveTo(21.852f, 12.183f, 21.881f, 11.989f, 21.892f, 11.85f)
                curveTo(21.902f, 11.729f, 21.902f, 11.591f, 21.902f, 11.471f)
                verticalLineTo(3.777f)
                curveTo(21.902f, 3.656f, 21.902f, 3.518f, 21.892f, 3.397f)
                curveTo(21.881f, 3.258f, 21.852f, 3.065f, 21.75f, 2.863f)
                curveTo(21.615f, 2.6f, 21.401f, 2.385f, 21.138f, 2.251f)
                curveTo(20.936f, 2.149f, 20.743f, 2.12f, 20.604f, 2.108f)
                curveTo(20.483f, 2.099f, 20.345f, 2.099f, 20.224f, 2.099f)
                lineTo(18.902f, 2.099f)
                verticalLineTo(13.149f)
                close()
            }
        }
        .build()
        return _dislikefill!!
    }

private var _dislikefill: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Dislikefill, contentDescription = "")
    }
}
