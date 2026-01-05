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

public val MooBesideIconPack.Heartinheartfill: ImageVector
    get() {
        if (_heartinheartfill != null) {
            return _heartinheartfill!!
        }
        _heartinheartfill = Builder(name = "Heartinheartfill", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.6f, 3.1f)
                curveTo(4.17f, 3.1f, 1.5f, 5.937f, 1.5f, 9.4f)
                curveTo(1.5f, 11.04f, 2.093f, 12.421f, 3.021f, 13.703f)
                curveTo(3.931f, 14.961f, 5.197f, 16.168f, 6.587f, 17.46f)
                lineTo(6.592f, 17.463f)
                lineTo(10.331f, 20.891f)
                curveTo(10.504f, 21.05f, 10.67f, 21.202f, 10.821f, 21.32f)
                curveTo(10.986f, 21.449f, 11.188f, 21.582f, 11.444f, 21.66f)
                curveTo(11.806f, 21.771f, 12.193f, 21.771f, 12.555f, 21.66f)
                curveTo(12.812f, 21.582f, 13.013f, 21.449f, 13.179f, 21.32f)
                curveTo(13.33f, 21.202f, 13.495f, 21.05f, 13.668f, 20.891f)
                lineTo(13.94f, 20.642f)
                curveTo(13.698f, 20.384f, 13.463f, 20.109f, 13.254f, 19.82f)
                curveTo(12.698f, 19.052f, 12.24f, 18.071f, 12.24f, 16.848f)
                curveTo(12.24f, 14.366f, 14.183f, 12.2f, 16.806f, 12.2f)
                curveTo(17.446f, 12.2f, 18.05f, 12.333f, 18.597f, 12.569f)
                curveTo(19.144f, 12.333f, 19.748f, 12.2f, 20.388f, 12.2f)
                curveTo(20.875f, 12.2f, 21.338f, 12.275f, 21.77f, 12.413f)
                curveTo(22.23f, 11.493f, 22.5f, 10.506f, 22.5f, 9.4f)
                curveTo(22.5f, 5.937f, 19.83f, 3.1f, 16.4f, 3.1f)
                curveTo(14.657f, 3.1f, 13.102f, 3.837f, 12.0f, 5.019f)
                curveTo(10.897f, 3.837f, 9.342f, 3.1f, 7.6f, 3.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.24f, 16.848f)
                curveTo(14.24f, 15.396f, 15.361f, 14.2f, 16.806f, 14.2f)
                curveTo(17.508f, 14.2f, 18.138f, 14.485f, 18.597f, 14.945f)
                curveTo(19.056f, 14.485f, 19.685f, 14.2f, 20.388f, 14.2f)
                curveTo(21.833f, 14.2f, 22.954f, 15.396f, 22.954f, 16.848f)
                curveTo(22.954f, 17.538f, 22.704f, 18.117f, 22.319f, 18.648f)
                curveTo(21.943f, 19.168f, 21.422f, 19.665f, 20.857f, 20.19f)
                lineTo(20.854f, 20.191f)
                lineTo(19.577f, 21.363f)
                curveTo(19.022f, 21.871f, 18.171f, 21.871f, 17.617f, 21.363f)
                lineTo(16.339f, 20.191f)
                lineTo(16.337f, 20.19f)
                curveTo(15.772f, 19.665f, 15.251f, 19.168f, 14.875f, 18.648f)
                curveTo(14.49f, 18.117f, 14.24f, 17.538f, 14.24f, 16.848f)
                close()
            }
        }
        .build()
        return _heartinheartfill!!
    }

private var _heartinheartfill: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Heartinheartfill, contentDescription = "")
    }
}
