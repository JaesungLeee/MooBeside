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

public val MooBesideIconPack.Phonefill: ImageVector
    get() {
        if (_phonefill != null) {
            return _phonefill!!
        }
        _phonefill = Builder(name = "Phonefill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.182f, 15.822f)
                curveTo(11.491f, 19.131f, 14.824f, 20.354f, 17.008f, 20.796f)
                curveTo(18.821f, 21.163f, 20.491f, 20.341f, 21.655f, 19.177f)
                lineTo(21.927f, 18.905f)
                curveTo(23.194f, 17.638f, 23.02f, 15.537f, 21.562f, 14.495f)
                lineTo(19.568f, 13.07f)
                curveTo(18.613f, 12.388f, 17.305f, 12.497f, 16.476f, 13.326f)
                lineTo(15.646f, 14.155f)
                curveTo(15.04f, 13.903f, 13.822f, 13.259f, 12.283f, 11.721f)
                curveTo(10.744f, 10.182f, 10.1f, 8.963f, 9.848f, 8.357f)
                lineTo(10.677f, 7.528f)
                curveTo(11.507f, 6.698f, 11.615f, 5.391f, 10.933f, 4.436f)
                lineTo(9.509f, 2.441f)
                curveTo(8.467f, 0.983f, 6.365f, 0.809f, 5.098f, 2.076f)
                lineTo(4.826f, 2.348f)
                curveTo(3.662f, 3.512f, 2.84f, 5.182f, 3.208f, 6.995f)
                curveTo(3.65f, 9.179f, 4.873f, 12.513f, 8.182f, 15.822f)
                close()
            }
        }
        .build()
        return _phonefill!!
    }

private var _phonefill: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Phonefill, contentDescription = "")
    }
}
