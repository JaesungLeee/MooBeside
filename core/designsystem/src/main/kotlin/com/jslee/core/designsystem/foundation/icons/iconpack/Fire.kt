package com.jslee.core.designsystem.foundation.icons.iconpack

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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

public val MooBesideIconPack.Fire: ImageVector
    get() {
        if (_fire != null) {
            return _fire!!
        }
        _fire = Builder(name = "Fire", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.499f, 15.1f)
                curveTo(8.499f, 17.0f, 10.049f, 18.5f, 11.999f, 18.5f)
                curveTo(13.949f, 18.5f, 15.499f, 17.0f, 15.499f, 15.1f)
                curveTo(15.499f, 13.2f, 13.949f, 11.7f, 11.999f, 10.0f)
                curveTo(10.049f, 11.7f, 8.499f, 13.2f, 8.499f, 15.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(14.264f, 1.832f)
                curveTo(13.505f, 1.133f, 12.311f, 1.306f, 11.766f, 2.163f)
                lineTo(8.81f, 6.82f)
                lineTo(8.111f, 6.19f)
                curveTo(7.488f, 5.629f, 6.488f, 5.601f, 5.859f, 6.263f)
                curveTo(3.961f, 8.263f, 2.849f, 10.875f, 2.849f, 13.601f)
                curveTo(2.849f, 16.131f, 3.789f, 18.345f, 5.432f, 19.924f)
                curveTo(7.073f, 21.502f, 9.367f, 22.401f, 11.999f, 22.401f)
                curveTo(17.328f, 22.401f, 21.149f, 18.516f, 21.149f, 13.601f)
                curveTo(21.149f, 9.438f, 18.49f, 5.721f, 14.264f, 1.832f)
                close()
                moveTo(9.759f, 8.683f)
                lineTo(13.186f, 3.286f)
                curveTo(17.258f, 7.063f, 19.349f, 10.284f, 19.349f, 13.601f)
                curveTo(19.349f, 17.485f, 16.371f, 20.601f, 11.999f, 20.601f)
                curveTo(9.782f, 20.601f, 7.951f, 19.849f, 6.679f, 18.627f)
                curveTo(5.41f, 17.406f, 4.649f, 15.671f, 4.649f, 13.601f)
                curveTo(4.649f, 11.431f, 5.511f, 9.313f, 7.034f, 7.643f)
                lineTo(8.397f, 8.87f)
                curveTo(8.594f, 9.047f, 8.859f, 9.128f, 9.121f, 9.092f)
                curveTo(9.384f, 9.056f, 9.617f, 8.907f, 9.759f, 8.683f)
                close()
            }
        }
        .build()
        return _fire!!
    }

private var _fire: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Fire, contentDescription = "")
    }
}
