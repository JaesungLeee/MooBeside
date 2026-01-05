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

public val MooBesideIconPack.Sendfill: ImageVector
    get() {
        if (_sendfill != null) {
            return _sendfill!!
        }
        _sendfill = Builder(name = "Sendfill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.945f, 3.408f)
                lineTo(20.225f, 9.801f)
                curveTo(20.635f, 10.014f, 20.997f, 10.203f, 21.271f, 10.378f)
                curveTo(21.543f, 10.553f, 21.872f, 10.803f, 22.056f, 11.197f)
                curveTo(22.293f, 11.706f, 22.293f, 12.294f, 22.056f, 12.803f)
                curveTo(21.872f, 13.197f, 21.543f, 13.446f, 21.271f, 13.621f)
                curveTo(20.997f, 13.797f, 20.635f, 13.985f, 20.225f, 14.199f)
                lineTo(7.945f, 20.591f)
                curveTo(7.454f, 20.847f, 7.032f, 21.066f, 6.689f, 21.207f)
                curveTo(6.362f, 21.342f, 5.916f, 21.493f, 5.446f, 21.388f)
                curveTo(4.859f, 21.257f, 4.368f, 20.855f, 4.124f, 20.305f)
                curveTo(3.929f, 19.865f, 3.989f, 19.398f, 4.057f, 19.051f)
                curveTo(4.128f, 18.686f, 4.26f, 18.23f, 4.414f, 17.698f)
                lineTo(5.805f, 12.9f)
                horizontalLineTo(13.0f)
                curveTo(13.497f, 12.9f, 13.9f, 12.497f, 13.9f, 12.0f)
                curveTo(13.9f, 11.503f, 13.497f, 11.1f, 13.0f, 11.1f)
                horizontalLineTo(5.805f)
                lineTo(4.414f, 6.301f)
                curveTo(4.26f, 5.769f, 4.128f, 5.313f, 4.057f, 4.949f)
                curveTo(3.989f, 4.601f, 3.929f, 4.134f, 4.124f, 3.695f)
                curveTo(4.368f, 3.145f, 4.859f, 2.743f, 5.446f, 2.611f)
                curveTo(5.916f, 2.506f, 6.362f, 2.657f, 6.689f, 2.792f)
                curveTo(7.032f, 2.933f, 7.454f, 3.153f, 7.945f, 3.408f)
                close()
            }
        }
        .build()
        return _sendfill!!
    }

private var _sendfill: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Sendfill, contentDescription = "")
    }
}
