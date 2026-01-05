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

public val MooBesideIconPack.Diamond: ImageVector
    get() {
        if (_diamond != null) {
            return _diamond!!
        }
        _diamond = Builder(name = "Diamond", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(7.687f, 3.101f)
                lineTo(7.593f, 3.1f)
                curveTo(7.234f, 3.099f, 6.803f, 3.097f, 6.413f, 3.28f)
                curveTo(6.022f, 3.463f, 5.748f, 3.795f, 5.519f, 4.072f)
                lineTo(5.459f, 4.144f)
                lineTo(2.145f, 8.121f)
                curveTo(1.905f, 8.409f, 1.674f, 8.687f, 1.511f, 8.942f)
                curveTo(1.327f, 9.229f, 1.167f, 9.58f, 1.177f, 10.013f)
                curveTo(1.186f, 10.447f, 1.362f, 10.791f, 1.558f, 11.069f)
                curveTo(1.732f, 11.317f, 1.975f, 11.584f, 2.228f, 11.861f)
                lineTo(9.893f, 20.274f)
                curveTo(10.207f, 20.619f, 10.502f, 20.943f, 10.779f, 21.173f)
                curveTo(11.086f, 21.429f, 11.482f, 21.666f, 12.0f, 21.666f)
                curveTo(12.518f, 21.666f, 12.914f, 21.429f, 13.221f, 21.173f)
                curveTo(13.498f, 20.943f, 13.794f, 20.619f, 14.108f, 20.274f)
                lineTo(21.773f, 11.861f)
                curveTo(22.026f, 11.584f, 22.269f, 11.317f, 22.443f, 11.069f)
                curveTo(22.639f, 10.791f, 22.814f, 10.447f, 22.824f, 10.013f)
                curveTo(22.833f, 9.58f, 22.673f, 9.229f, 22.49f, 8.942f)
                curveTo(22.327f, 8.687f, 22.096f, 8.409f, 21.855f, 8.121f)
                lineTo(18.541f, 4.144f)
                lineTo(18.481f, 4.072f)
                curveTo(18.252f, 3.795f, 17.978f, 3.463f, 17.588f, 3.28f)
                curveTo(17.197f, 3.097f, 16.767f, 3.099f, 16.408f, 3.1f)
                lineTo(16.313f, 3.101f)
                horizontalLineTo(7.687f)
                close()
                moveTo(12.0f, 8.634f)
                lineTo(8.734f, 4.901f)
                horizontalLineTo(15.267f)
                lineTo(12.0f, 8.634f)
                close()
                moveTo(13.984f, 9.101f)
                lineTo(17.233f, 5.386f)
                lineTo(20.329f, 9.101f)
                horizontalLineTo(13.984f)
                close()
                moveTo(6.767f, 5.386f)
                lineTo(10.017f, 9.101f)
                horizontalLineTo(3.672f)
                lineTo(6.767f, 5.386f)
                close()
                moveTo(11.1f, 18.927f)
                verticalLineTo(10.901f)
                horizontalLineTo(3.788f)
                lineTo(11.1f, 18.927f)
                close()
                moveTo(12.9f, 10.901f)
                verticalLineTo(18.927f)
                lineTo(20.213f, 10.901f)
                horizontalLineTo(12.9f)
                close()
            }
        }
        .build()
        return _diamond!!
    }

private var _diamond: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Diamond, contentDescription = "")
    }
}
