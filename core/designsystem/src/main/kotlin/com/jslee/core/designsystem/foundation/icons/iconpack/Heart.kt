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

public val MooBesideIconPack.Heart: ImageVector
    get() {
        if (_heart != null) {
            return _heart!!
        }
        _heart = Builder(name = "Heart", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(1.5f, 9.4f)
                curveTo(1.5f, 5.937f, 4.17f, 3.1f, 7.6f, 3.1f)
                curveTo(9.343f, 3.1f, 10.897f, 3.837f, 12.0f, 5.019f)
                curveTo(13.103f, 3.837f, 14.658f, 3.1f, 16.4f, 3.1f)
                curveTo(19.83f, 3.1f, 22.5f, 5.937f, 22.5f, 9.4f)
                curveTo(22.5f, 11.04f, 21.906f, 12.421f, 20.979f, 13.703f)
                curveTo(20.069f, 14.961f, 18.803f, 16.168f, 17.412f, 17.46f)
                lineTo(17.408f, 17.463f)
                lineTo(13.669f, 20.892f)
                curveTo(13.496f, 21.05f, 13.33f, 21.202f, 13.179f, 21.32f)
                curveTo(13.014f, 21.449f, 12.812f, 21.582f, 12.556f, 21.66f)
                curveTo(12.193f, 21.771f, 11.807f, 21.771f, 11.444f, 21.66f)
                curveTo(11.188f, 21.582f, 10.986f, 21.449f, 10.821f, 21.32f)
                curveTo(10.67f, 21.202f, 10.504f, 21.05f, 10.331f, 20.892f)
                lineTo(6.592f, 17.463f)
                lineTo(6.588f, 17.46f)
                curveTo(5.197f, 16.168f, 3.931f, 14.961f, 3.021f, 13.703f)
                curveTo(2.094f, 12.421f, 1.5f, 11.04f, 1.5f, 9.4f)
                close()
                moveTo(7.6f, 4.9f)
                curveTo(5.23f, 4.9f, 3.3f, 6.863f, 3.3f, 9.4f)
                curveTo(3.3f, 10.56f, 3.706f, 11.579f, 4.479f, 12.647f)
                curveTo(5.269f, 13.739f, 6.402f, 14.831f, 7.81f, 16.138f)
                lineTo(11.932f, 19.917f)
                curveTo(11.971f, 19.952f, 12.029f, 19.952f, 12.068f, 19.917f)
                lineTo(16.19f, 16.138f)
                curveTo(17.598f, 14.831f, 18.731f, 13.739f, 19.521f, 12.647f)
                curveTo(20.294f, 11.579f, 20.7f, 10.56f, 20.7f, 9.4f)
                curveTo(20.7f, 6.863f, 18.77f, 4.9f, 16.4f, 4.9f)
                curveTo(14.867f, 4.9f, 13.532f, 5.713f, 12.769f, 6.969f)
                curveTo(12.606f, 7.238f, 12.314f, 7.402f, 12.0f, 7.402f)
                curveTo(11.686f, 7.402f, 11.394f, 7.238f, 11.231f, 6.969f)
                curveTo(10.468f, 5.713f, 9.133f, 4.9f, 7.6f, 4.9f)
                close()
            }
        }
        .build()
        return _heart!!
    }

private var _heart: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Heart, contentDescription = "")
    }
}
