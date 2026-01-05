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

public val MooBesideIconPack.Locationfill: ImageVector
    get() {
        if (_locationfill != null) {
            return _locationfill!!
        }
        _locationfill = Builder(name = "Locationfill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(13.734f, 21.324f)
                curveTo(14.46f, 20.743f, 15.43f, 19.905f, 16.403f, 18.88f)
                curveTo(18.309f, 16.871f, 20.4f, 13.962f, 20.4f, 10.75f)
                curveTo(20.4f, 6.11f, 16.639f, 2.35f, 12.0f, 2.35f)
                curveTo(7.361f, 2.35f, 3.6f, 6.11f, 3.6f, 10.75f)
                curveTo(3.6f, 13.962f, 5.691f, 16.871f, 7.597f, 18.88f)
                curveTo(8.57f, 19.905f, 9.54f, 20.743f, 10.265f, 21.324f)
                curveTo(10.664f, 21.643f, 11.071f, 21.957f, 11.494f, 22.244f)
                curveTo(11.794f, 22.448f, 12.203f, 22.448f, 12.504f, 22.246f)
                curveTo(12.928f, 21.958f, 13.335f, 21.643f, 13.734f, 21.324f)
                close()
                moveTo(14.75f, 10.75f)
                curveTo(14.75f, 12.268f, 13.519f, 13.5f, 12.0f, 13.5f)
                curveTo(10.481f, 13.5f, 9.25f, 12.268f, 9.25f, 10.75f)
                curveTo(9.25f, 9.231f, 10.481f, 8.0f, 12.0f, 8.0f)
                curveTo(13.519f, 8.0f, 14.75f, 9.231f, 14.75f, 10.75f)
                close()
            }
        }
        .build()
        return _locationfill!!
    }

private var _locationfill: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Locationfill, contentDescription = "")
    }
}
