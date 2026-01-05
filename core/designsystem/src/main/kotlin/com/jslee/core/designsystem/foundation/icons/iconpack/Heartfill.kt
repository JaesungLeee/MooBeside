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

public val MooBesideIconPack.Heartfill: ImageVector
    get() {
        if (_heartfill != null) {
            return _heartfill!!
        }
        _heartfill = Builder(name = "Heartfill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.6f, 3.1f)
                curveTo(4.17f, 3.1f, 1.5f, 5.937f, 1.5f, 9.4f)
                curveTo(1.5f, 11.04f, 2.094f, 12.421f, 3.021f, 13.703f)
                curveTo(3.931f, 14.961f, 5.197f, 16.168f, 6.588f, 17.46f)
                lineTo(6.592f, 17.463f)
                lineTo(10.331f, 20.892f)
                curveTo(10.504f, 21.05f, 10.67f, 21.202f, 10.821f, 21.32f)
                curveTo(10.986f, 21.449f, 11.188f, 21.582f, 11.444f, 21.66f)
                curveTo(11.807f, 21.771f, 12.193f, 21.771f, 12.556f, 21.66f)
                curveTo(12.812f, 21.582f, 13.014f, 21.449f, 13.179f, 21.32f)
                curveTo(13.33f, 21.202f, 13.496f, 21.05f, 13.668f, 20.892f)
                lineTo(17.408f, 17.463f)
                lineTo(17.412f, 17.46f)
                curveTo(18.803f, 16.168f, 20.069f, 14.961f, 20.979f, 13.703f)
                curveTo(21.906f, 12.421f, 22.5f, 11.04f, 22.5f, 9.4f)
                curveTo(22.5f, 5.937f, 19.83f, 3.1f, 16.4f, 3.1f)
                curveTo(14.658f, 3.1f, 13.103f, 3.837f, 12.0f, 5.019f)
                curveTo(10.897f, 3.837f, 9.342f, 3.1f, 7.6f, 3.1f)
                close()
            }
        }
        .build()
        return _heartfill!!
    }

private var _heartfill: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Heartfill, contentDescription = "")
    }
}
