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

public val MooBesideIconPack.Magicwand: ImageVector
    get() {
        if (_magicwand != null) {
            return _magicwand!!
        }
        _magicwand = Builder(name = "Magicwand", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.1f, 2.5f)
                curveTo(4.1f, 2.003f, 4.503f, 1.6f, 5.0f, 1.6f)
                curveTo(5.497f, 1.6f, 5.9f, 2.003f, 5.9f, 2.5f)
                curveTo(5.9f, 3.387f, 6.059f, 3.693f, 6.183f, 3.816f)
                curveTo(6.307f, 3.94f, 6.612f, 4.1f, 7.5f, 4.1f)
                curveTo(7.997f, 4.1f, 8.4f, 4.503f, 8.4f, 5.0f)
                curveTo(8.4f, 5.497f, 7.997f, 5.9f, 7.5f, 5.9f)
                curveTo(6.612f, 5.9f, 6.307f, 6.059f, 6.183f, 6.183f)
                curveTo(6.059f, 6.307f, 5.9f, 6.612f, 5.9f, 7.5f)
                curveTo(5.9f, 7.997f, 5.497f, 8.4f, 5.0f, 8.4f)
                curveTo(4.503f, 8.4f, 4.1f, 7.997f, 4.1f, 7.5f)
                curveTo(4.1f, 6.612f, 3.94f, 6.307f, 3.817f, 6.183f)
                curveTo(3.693f, 6.059f, 3.387f, 5.9f, 2.5f, 5.9f)
                curveTo(2.003f, 5.9f, 1.6f, 5.497f, 1.6f, 5.0f)
                curveTo(1.6f, 4.503f, 2.003f, 4.1f, 2.5f, 4.1f)
                curveTo(3.387f, 4.1f, 3.693f, 3.94f, 3.817f, 3.816f)
                curveTo(3.94f, 3.693f, 4.1f, 3.387f, 4.1f, 2.5f)
                close()
                moveTo(17.5f, 3.6f)
                curveTo(17.003f, 3.6f, 16.6f, 4.003f, 16.6f, 4.5f)
                curveTo(16.6f, 5.2f, 16.472f, 5.38f, 16.426f, 5.426f)
                curveTo(16.381f, 5.471f, 16.2f, 5.6f, 15.5f, 5.6f)
                curveTo(15.003f, 5.6f, 14.6f, 6.003f, 14.6f, 6.5f)
                curveTo(14.6f, 6.997f, 15.003f, 7.4f, 15.5f, 7.4f)
                curveTo(16.2f, 7.4f, 16.381f, 7.528f, 16.426f, 7.574f)
                curveTo(16.472f, 7.619f, 16.6f, 7.8f, 16.6f, 8.5f)
                curveTo(16.6f, 8.997f, 17.003f, 9.4f, 17.5f, 9.4f)
                curveTo(17.997f, 9.4f, 18.4f, 8.997f, 18.4f, 8.5f)
                curveTo(18.4f, 7.8f, 18.528f, 7.619f, 18.574f, 7.574f)
                curveTo(18.619f, 7.528f, 18.8f, 7.4f, 19.5f, 7.4f)
                curveTo(19.997f, 7.4f, 20.4f, 6.997f, 20.4f, 6.5f)
                curveTo(20.4f, 6.003f, 19.997f, 5.6f, 19.5f, 5.6f)
                curveTo(18.8f, 5.6f, 18.619f, 5.471f, 18.574f, 5.426f)
                curveTo(18.528f, 5.38f, 18.4f, 5.2f, 18.4f, 4.5f)
                curveTo(18.4f, 4.003f, 17.997f, 3.6f, 17.5f, 3.6f)
                close()
                moveTo(6.5f, 14.6f)
                curveTo(6.003f, 14.6f, 5.6f, 15.003f, 5.6f, 15.5f)
                curveTo(5.6f, 16.2f, 5.472f, 16.38f, 5.426f, 16.426f)
                curveTo(5.381f, 16.472f, 5.2f, 16.6f, 4.5f, 16.6f)
                curveTo(4.003f, 16.6f, 3.6f, 17.003f, 3.6f, 17.5f)
                curveTo(3.6f, 17.997f, 4.003f, 18.4f, 4.5f, 18.4f)
                curveTo(5.2f, 18.4f, 5.381f, 18.528f, 5.426f, 18.574f)
                curveTo(5.472f, 18.619f, 5.6f, 18.8f, 5.6f, 19.5f)
                curveTo(5.6f, 19.997f, 6.003f, 20.4f, 6.5f, 20.4f)
                curveTo(6.997f, 20.4f, 7.4f, 19.997f, 7.4f, 19.5f)
                curveTo(7.4f, 18.8f, 7.528f, 18.619f, 7.574f, 18.574f)
                curveTo(7.62f, 18.528f, 7.8f, 18.4f, 8.5f, 18.4f)
                curveTo(8.997f, 18.4f, 9.4f, 17.997f, 9.4f, 17.5f)
                curveTo(9.4f, 17.003f, 8.997f, 16.6f, 8.5f, 16.6f)
                curveTo(7.8f, 16.6f, 7.62f, 16.472f, 7.574f, 16.426f)
                curveTo(7.528f, 16.38f, 7.4f, 16.2f, 7.4f, 15.5f)
                curveTo(7.4f, 15.003f, 6.997f, 14.6f, 6.5f, 14.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(10.844f, 7.711f)
                curveTo(10.312f, 7.448f, 9.688f, 7.448f, 9.156f, 7.711f)
                curveTo(8.87f, 7.853f, 8.63f, 8.095f, 8.422f, 8.305f)
                lineTo(8.305f, 8.421f)
                curveTo(8.095f, 8.63f, 7.853f, 8.87f, 7.712f, 9.156f)
                curveTo(7.448f, 9.687f, 7.448f, 10.311f, 7.712f, 10.843f)
                curveTo(7.853f, 11.129f, 8.095f, 11.369f, 8.305f, 11.577f)
                lineTo(17.422f, 20.694f)
                curveTo(17.63f, 20.904f, 17.87f, 21.146f, 18.156f, 21.288f)
                curveTo(18.688f, 21.551f, 19.312f, 21.551f, 19.843f, 21.288f)
                curveTo(20.129f, 21.146f, 20.37f, 20.904f, 20.578f, 20.694f)
                lineTo(20.695f, 20.577f)
                curveTo(20.904f, 20.369f, 21.146f, 20.129f, 21.288f, 19.843f)
                curveTo(21.551f, 19.311f, 21.551f, 18.687f, 21.288f, 18.156f)
                curveTo(21.146f, 17.87f, 20.904f, 17.629f, 20.695f, 17.421f)
                lineTo(11.578f, 8.304f)
                curveTo(11.37f, 8.095f, 11.129f, 7.853f, 10.844f, 7.711f)
                close()
                moveTo(9.929f, 9.343f)
                curveTo(9.968f, 9.304f, 10.031f, 9.304f, 10.071f, 9.343f)
                lineTo(14.363f, 13.636f)
                lineTo(13.636f, 14.363f)
                lineTo(9.343f, 10.07f)
                curveTo(9.304f, 10.031f, 9.304f, 9.968f, 9.343f, 9.929f)
                lineTo(9.929f, 9.343f)
                close()
            }
        }
        .build()
        return _magicwand!!
    }

private var _magicwand: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Magicwand, contentDescription = "")
    }
}
