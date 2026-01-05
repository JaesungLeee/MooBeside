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

public val MooBesideIconPack.Coffee: ImageVector
    get() {
        if (_coffee != null) {
            return _coffee!!
        }
        _coffee = Builder(name = "Coffee", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(6.665f, 3.095f)
                curveTo(6.136f, 3.095f, 5.684f, 3.095f, 5.314f, 3.125f)
                curveTo(4.925f, 3.157f, 4.546f, 3.227f, 4.184f, 3.411f)
                curveTo(3.639f, 3.689f, 3.195f, 4.133f, 2.917f, 4.679f)
                curveTo(2.733f, 5.041f, 2.663f, 5.419f, 2.631f, 5.808f)
                curveTo(2.601f, 6.179f, 2.601f, 6.63f, 2.601f, 7.16f)
                verticalLineTo(9.495f)
                curveTo(2.601f, 14.134f, 6.362f, 17.896f, 11.001f, 17.896f)
                curveTo(14.43f, 17.896f, 17.379f, 15.841f, 18.684f, 12.895f)
                horizontalLineTo(20.001f)
                curveTo(22.155f, 12.895f, 23.901f, 11.149f, 23.901f, 8.995f)
                curveTo(23.901f, 6.841f, 22.155f, 5.095f, 20.001f, 5.095f)
                lineTo(19.249f, 5.096f)
                curveTo(19.208f, 4.955f, 19.155f, 4.816f, 19.085f, 4.679f)
                curveTo(18.807f, 4.133f, 18.363f, 3.689f, 17.817f, 3.411f)
                curveTo(17.455f, 3.227f, 17.077f, 3.157f, 16.688f, 3.125f)
                curveTo(16.317f, 3.095f, 15.866f, 3.095f, 15.336f, 3.095f)
                horizontalLineTo(6.665f)
                close()
                moveTo(19.401f, 6.896f)
                curveTo(19.401f, 6.982f, 19.401f, 7.07f, 19.401f, 7.16f)
                verticalLineTo(9.495f)
                curveTo(19.401f, 10.042f, 19.348f, 10.577f, 19.249f, 11.095f)
                horizontalLineTo(20.001f)
                curveTo(21.16f, 11.095f, 22.101f, 10.155f, 22.101f, 8.995f)
                curveTo(22.101f, 7.836f, 21.161f, 6.896f, 20.001f, 6.895f)
                lineTo(19.401f, 6.896f)
                close()
                moveTo(5.161f, 4.949f)
                curveTo(5.292f, 4.906f, 5.486f, 4.895f, 6.301f, 4.895f)
                horizontalLineTo(15.701f)
                curveTo(16.515f, 4.895f, 16.709f, 4.906f, 16.841f, 4.949f)
                curveTo(17.176f, 5.058f, 17.438f, 5.32f, 17.547f, 5.655f)
                curveTo(17.59f, 5.787f, 17.601f, 5.98f, 17.601f, 6.795f)
                verticalLineTo(9.495f)
                curveTo(17.601f, 13.14f, 14.646f, 16.096f, 11.001f, 16.096f)
                curveTo(7.356f, 16.096f, 4.401f, 13.14f, 4.401f, 9.495f)
                verticalLineTo(6.795f)
                curveTo(4.401f, 5.98f, 4.412f, 5.787f, 4.455f, 5.655f)
                curveTo(4.564f, 5.32f, 4.826f, 5.058f, 5.161f, 4.949f)
                close()
            }
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.851f, 21.0f)
                curveTo(3.851f, 20.503f, 4.254f, 20.1f, 4.751f, 20.1f)
                horizontalLineTo(17.751f)
                curveTo(18.248f, 20.1f, 18.651f, 20.503f, 18.651f, 21.0f)
                curveTo(18.651f, 21.497f, 18.248f, 21.899f, 17.751f, 21.899f)
                horizontalLineTo(4.751f)
                curveTo(4.254f, 21.899f, 3.851f, 21.497f, 3.851f, 21.0f)
                close()
            }
        }
        .build()
        return _coffee!!
    }

private var _coffee: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Coffee, contentDescription = "")
    }
}
