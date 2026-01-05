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

public val MooBesideIconPack.Globe: ImageVector
    get() {
        if (_globe != null) {
            return _globe!!
        }
        _globe = Builder(name = "Globe", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.957f, 3.9f)
                curveTo(11.986f, 3.9f, 12.014f, 3.9f, 12.043f, 3.9f)
                curveTo(12.931f, 5.163f, 13.617f, 6.579f, 14.054f, 8.1f)
                horizontalLineTo(9.946f)
                curveTo(10.383f, 6.579f, 11.069f, 5.163f, 11.957f, 3.9f)
                close()
                moveTo(14.392f, 4.259f)
                curveTo(15.058f, 5.453f, 15.576f, 6.742f, 15.918f, 8.1f)
                horizontalLineTo(19.101f)
                curveTo(18.098f, 6.278f, 16.414f, 4.883f, 14.392f, 4.259f)
                close()
                moveTo(19.825f, 9.9f)
                horizontalLineTo(16.262f)
                curveTo(16.353f, 10.587f, 16.4f, 11.288f, 16.4f, 12.0f)
                curveTo(16.4f, 12.712f, 16.353f, 13.413f, 16.263f, 14.1f)
                horizontalLineTo(19.825f)
                curveTo(20.004f, 13.43f, 20.1f, 12.726f, 20.1f, 12.0f)
                curveTo(20.1f, 11.274f, 20.004f, 10.57f, 19.825f, 9.9f)
                close()
                moveTo(19.101f, 15.9f)
                horizontalLineTo(15.918f)
                curveTo(15.576f, 17.258f, 15.058f, 18.547f, 14.392f, 19.741f)
                curveTo(16.414f, 19.117f, 18.098f, 17.722f, 19.101f, 15.9f)
                close()
                moveTo(12.043f, 20.1f)
                curveTo(12.014f, 20.1f, 11.986f, 20.1f, 11.957f, 20.1f)
                curveTo(11.069f, 18.837f, 10.383f, 17.421f, 9.946f, 15.9f)
                horizontalLineTo(14.054f)
                curveTo(13.617f, 17.421f, 12.931f, 18.837f, 12.043f, 20.1f)
                close()
                moveTo(9.608f, 19.741f)
                curveTo(7.586f, 19.117f, 5.902f, 17.722f, 4.899f, 15.9f)
                horizontalLineTo(8.082f)
                curveTo(8.424f, 17.258f, 8.942f, 18.547f, 9.608f, 19.741f)
                close()
                moveTo(4.175f, 14.1f)
                horizontalLineTo(7.737f)
                curveTo(7.647f, 13.413f, 7.6f, 12.712f, 7.6f, 12.0f)
                curveTo(7.6f, 11.288f, 7.647f, 10.587f, 7.737f, 9.9f)
                horizontalLineTo(4.175f)
                curveTo(3.996f, 10.57f, 3.9f, 11.274f, 3.9f, 12.0f)
                curveTo(3.9f, 12.726f, 3.996f, 13.43f, 4.175f, 14.1f)
                close()
                moveTo(4.899f, 8.1f)
                horizontalLineTo(8.082f)
                curveTo(8.424f, 6.742f, 8.942f, 5.453f, 9.608f, 4.259f)
                curveTo(7.586f, 4.883f, 5.902f, 6.278f, 4.899f, 8.1f)
                close()
                moveTo(12.0f, 2.1f)
                curveTo(6.532f, 2.1f, 2.1f, 6.532f, 2.1f, 12.0f)
                curveTo(2.1f, 17.468f, 6.532f, 21.9f, 12.0f, 21.9f)
                curveTo(17.468f, 21.9f, 21.9f, 17.468f, 21.9f, 12.0f)
                curveTo(21.9f, 6.532f, 17.468f, 2.1f, 12.0f, 2.1f)
                close()
                moveTo(9.555f, 14.1f)
                horizontalLineTo(14.445f)
                curveTo(14.547f, 13.415f, 14.6f, 12.714f, 14.6f, 12.0f)
                curveTo(14.6f, 11.286f, 14.547f, 10.585f, 14.445f, 9.9f)
                horizontalLineTo(9.555f)
                curveTo(9.453f, 10.585f, 9.4f, 11.286f, 9.4f, 12.0f)
                curveTo(9.4f, 12.714f, 9.453f, 13.415f, 9.555f, 14.1f)
                close()
            }
        }
        .build()
        return _globe!!
    }

private var _globe: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Globe, contentDescription = "")
    }
}
