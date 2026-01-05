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

public val MooBesideIconPack.Phone: ImageVector
    get() {
        if (_phone != null) {
            return _phone!!
        }
        _phone = Builder(name = "Phone", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(17.008f, 20.796f)
                curveTo(14.825f, 20.354f, 11.491f, 19.131f, 8.182f, 15.822f)
                curveTo(4.873f, 12.513f, 3.65f, 9.179f, 3.208f, 6.995f)
                curveTo(2.84f, 5.182f, 3.662f, 3.512f, 4.826f, 2.348f)
                lineTo(5.098f, 2.076f)
                curveTo(6.365f, 0.809f, 8.467f, 0.983f, 9.509f, 2.441f)
                lineTo(10.933f, 4.436f)
                curveTo(11.615f, 5.391f, 11.507f, 6.698f, 10.677f, 7.528f)
                lineTo(9.848f, 8.357f)
                curveTo(10.1f, 8.963f, 10.745f, 10.182f, 12.283f, 11.721f)
                curveTo(13.822f, 13.259f, 15.041f, 13.903f, 15.647f, 14.155f)
                lineTo(16.476f, 13.326f)
                curveTo(17.305f, 12.497f, 18.613f, 12.388f, 19.568f, 13.07f)
                lineTo(21.562f, 14.495f)
                curveTo(23.021f, 15.537f, 23.194f, 17.638f, 21.927f, 18.905f)
                lineTo(21.655f, 19.177f)
                curveTo(20.491f, 20.341f, 18.821f, 21.163f, 17.008f, 20.796f)
                close()
                moveTo(9.455f, 14.549f)
                curveTo(12.477f, 17.571f, 15.474f, 18.649f, 17.366f, 19.032f)
                curveTo(18.402f, 19.242f, 19.491f, 18.796f, 20.382f, 17.905f)
                lineTo(20.654f, 17.633f)
                curveTo(21.135f, 17.152f, 21.069f, 16.355f, 20.516f, 15.96f)
                lineTo(18.521f, 14.535f)
                curveTo(18.283f, 14.365f, 17.956f, 14.392f, 17.749f, 14.599f)
                lineTo(16.904f, 15.443f)
                curveTo(16.462f, 15.886f, 15.753f, 16.136f, 15.049f, 15.856f)
                curveTo(14.238f, 15.533f, 12.779f, 14.762f, 11.01f, 12.993f)
                curveTo(9.242f, 11.225f, 8.471f, 9.765f, 8.148f, 8.954f)
                curveTo(7.868f, 8.251f, 8.118f, 7.542f, 8.56f, 7.1f)
                lineTo(9.405f, 6.255f)
                curveTo(9.612f, 6.048f, 9.639f, 5.721f, 9.469f, 5.482f)
                lineTo(8.044f, 3.488f)
                curveTo(7.649f, 2.934f, 6.852f, 2.868f, 6.371f, 3.349f)
                lineTo(6.099f, 3.621f)
                curveTo(5.208f, 4.512f, 4.762f, 5.602f, 4.972f, 6.638f)
                curveTo(5.355f, 8.529f, 6.432f, 11.527f, 9.455f, 14.549f)
                close()
            }
        }
        .build()
        return _phone!!
    }

private var _phone: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Phone, contentDescription = "")
    }
}
