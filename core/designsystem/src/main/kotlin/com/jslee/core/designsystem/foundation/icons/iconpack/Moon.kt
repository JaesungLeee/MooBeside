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

public val MooBesideIconPack.Moon: ImageVector
    get() {
        if (_moon != null) {
            return _moon!!
        }
        _moon = Builder(name = "Moon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(9.761f, 2.543f)
                curveTo(10.016f, 2.812f, 10.08f, 3.211f, 9.922f, 3.546f)
                curveTo(9.427f, 4.593f, 9.15f, 5.763f, 9.15f, 7.001f)
                curveTo(9.15f, 11.475f, 12.776f, 15.101f, 17.25f, 15.101f)
                curveTo(18.332f, 15.101f, 19.362f, 14.89f, 20.303f, 14.506f)
                curveTo(20.646f, 14.366f, 21.041f, 14.452f, 21.296f, 14.721f)
                curveTo(21.551f, 14.991f, 21.615f, 15.389f, 21.456f, 15.724f)
                curveTo(19.872f, 19.077f, 16.458f, 21.4f, 12.5f, 21.4f)
                curveTo(7.032f, 21.4f, 2.6f, 16.968f, 2.6f, 11.5f)
                curveTo(2.6f, 7.352f, 5.152f, 3.801f, 8.768f, 2.328f)
                curveTo(9.112f, 2.188f, 9.506f, 2.274f, 9.761f, 2.543f)
                close()
                moveTo(7.532f, 5.102f)
                curveTo(5.626f, 6.585f, 4.4f, 8.9f, 4.4f, 11.5f)
                curveTo(4.4f, 15.974f, 8.027f, 19.601f, 12.5f, 19.601f)
                curveTo(14.943f, 19.601f, 17.134f, 18.519f, 18.62f, 16.807f)
                curveTo(18.172f, 16.869f, 17.715f, 16.901f, 17.25f, 16.901f)
                curveTo(11.782f, 16.901f, 7.35f, 12.469f, 7.35f, 7.001f)
                curveTo(7.35f, 6.352f, 7.413f, 5.717f, 7.532f, 5.102f)
                close()
            }
        }
        .build()
        return _moon!!
    }

private var _moon: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Moon, contentDescription = "")
    }
}
