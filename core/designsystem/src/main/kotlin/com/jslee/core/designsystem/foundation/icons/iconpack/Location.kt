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

public val MooBesideIconPack.Location: ImageVector
    get() {
        if (_location != null) {
            return _location!!
        }
        _location = Builder(name = "Location", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(16.403f, 18.88f)
                curveTo(15.43f, 19.905f, 14.46f, 20.743f, 13.734f, 21.324f)
                curveTo(13.335f, 21.643f, 12.928f, 21.958f, 12.504f, 22.246f)
                curveTo(12.203f, 22.448f, 11.794f, 22.448f, 11.494f, 22.244f)
                curveTo(11.071f, 21.957f, 10.664f, 21.643f, 10.265f, 21.324f)
                curveTo(9.54f, 20.743f, 8.57f, 19.905f, 7.597f, 18.88f)
                curveTo(5.691f, 16.871f, 3.6f, 13.962f, 3.6f, 10.75f)
                curveTo(3.6f, 6.11f, 7.361f, 2.35f, 12.0f, 2.35f)
                curveTo(16.639f, 2.35f, 20.4f, 6.11f, 20.4f, 10.75f)
                curveTo(20.4f, 13.962f, 18.309f, 16.871f, 16.403f, 18.88f)
                close()
                moveTo(12.0f, 4.149f)
                curveTo(8.355f, 4.149f, 5.4f, 7.104f, 5.4f, 10.749f)
                curveTo(5.4f, 13.231f, 7.059f, 15.697f, 8.903f, 17.64f)
                curveTo(10.114f, 18.917f, 11.336f, 19.893f, 12.0f, 20.391f)
                curveTo(12.664f, 19.893f, 13.885f, 18.917f, 15.097f, 17.64f)
                curveTo(16.941f, 15.697f, 18.6f, 13.231f, 18.6f, 10.749f)
                curveTo(18.6f, 7.104f, 15.645f, 4.149f, 12.0f, 4.149f)
                close()
            }
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 7.1f)
                curveTo(9.984f, 7.1f, 8.35f, 8.734f, 8.35f, 10.75f)
                curveTo(8.35f, 12.765f, 9.984f, 14.4f, 12.0f, 14.4f)
                curveTo(14.016f, 14.4f, 15.65f, 12.765f, 15.65f, 10.75f)
                curveTo(15.65f, 8.734f, 14.016f, 7.1f, 12.0f, 7.1f)
                close()
                moveTo(10.15f, 10.75f)
                curveTo(10.15f, 9.728f, 10.978f, 8.9f, 12.0f, 8.9f)
                curveTo(13.022f, 8.9f, 13.85f, 9.728f, 13.85f, 10.75f)
                curveTo(13.85f, 11.771f, 13.022f, 12.6f, 12.0f, 12.6f)
                curveTo(10.978f, 12.6f, 10.15f, 11.771f, 10.15f, 10.75f)
                close()
            }
        }
        .build()
        return _location!!
    }

private var _location: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Location, contentDescription = "")
    }
}
