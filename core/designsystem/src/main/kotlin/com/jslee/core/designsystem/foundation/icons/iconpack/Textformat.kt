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

public val MooBesideIconPack.Textformat: ImageVector
    get() {
        if (_textformat != null) {
            return _textformat!!
        }
        _textformat = Builder(name = "Textformat", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(7.187f, 5.499f)
                curveTo(6.521f, 5.499f, 5.925f, 5.909f, 5.687f, 6.53f)
                lineTo(1.595f, 17.205f)
                curveTo(1.355f, 17.83f, 1.817f, 18.502f, 2.487f, 18.502f)
                curveTo(2.888f, 18.502f, 3.246f, 18.251f, 3.384f, 17.874f)
                lineTo(4.441f, 14.981f)
                horizontalLineTo(9.924f)
                lineTo(10.98f, 17.872f)
                curveTo(11.118f, 18.25f, 11.478f, 18.502f, 11.88f, 18.502f)
                curveTo(12.553f, 18.502f, 13.017f, 17.827f, 12.776f, 17.199f)
                lineTo(8.686f, 6.53f)
                curveTo(8.448f, 5.909f, 7.852f, 5.499f, 7.187f, 5.499f)
                close()
                moveTo(7.134f, 7.609f)
                horizontalLineTo(7.23f)
                lineTo(9.281f, 13.221f)
                horizontalLineTo(5.084f)
                lineTo(7.134f, 7.609f)
                close()
            }
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(17.981f, 12.799f)
                lineTo(20.333f, 12.67f)
                curveTo(20.304f, 11.266f, 19.636f, 10.599f, 18.295f, 10.599f)
                curveTo(17.58f, 10.599f, 17.038f, 10.785f, 16.616f, 11.191f)
                curveTo(16.283f, 11.512f, 15.805f, 11.703f, 15.382f, 11.515f)
                curveTo(14.913f, 11.306f, 14.71f, 10.734f, 15.042f, 10.342f)
                curveTo(15.81f, 9.436f, 16.899f, 8.983f, 18.295f, 8.983f)
                curveTo(20.748f, 8.983f, 22.138f, 10.384f, 22.138f, 12.773f)
                verticalLineTo(17.599f)
                curveTo(22.138f, 18.098f, 21.734f, 18.502f, 21.236f, 18.502f)
                curveTo(20.737f, 18.502f, 20.333f, 18.098f, 20.333f, 17.599f)
                verticalLineTo(17.101f)
                horizontalLineTo(20.261f)
                curveTo(19.631f, 18.142f, 18.512f, 18.753f, 17.298f, 18.753f)
                curveTo(15.644f, 18.753f, 14.137f, 17.518f, 14.137f, 15.817f)
                curveTo(14.137f, 13.752f, 16.209f, 12.866f, 17.981f, 12.799f)
                close()
                moveTo(20.333f, 14.883f)
                verticalLineTo(14.018f)
                lineTo(18.025f, 14.173f)
                curveTo(17.069f, 14.225f, 16.005f, 14.663f, 16.005f, 15.772f)
                curveTo(16.005f, 16.658f, 16.681f, 17.173f, 17.855f, 17.173f)
                curveTo(19.399f, 17.173f, 20.333f, 16.244f, 20.333f, 14.883f)
                close()
            }
        }
        .build()
        return _textformat!!
    }

private var _textformat: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Textformat, contentDescription = "")
    }
}
