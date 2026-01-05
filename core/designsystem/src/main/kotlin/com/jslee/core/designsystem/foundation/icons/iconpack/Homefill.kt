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

public val MooBesideIconPack.Homefill: ImageVector
    get() {
        if (_homefill != null) {
            return _homefill!!
        }
        _homefill = Builder(name = "Homefill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.639f, 2.276f)
                curveTo(11.875f, 2.213f, 12.125f, 2.213f, 12.361f, 2.276f)
                curveTo(12.642f, 2.352f, 12.875f, 2.533f, 12.998f, 2.629f)
                lineTo(13.033f, 2.656f)
                lineTo(19.866f, 7.882f)
                curveTo(20.253f, 8.177f, 20.579f, 8.426f, 20.822f, 8.75f)
                curveTo(21.035f, 9.035f, 21.194f, 9.357f, 21.291f, 9.699f)
                curveTo(21.401f, 10.089f, 21.4f, 10.499f, 21.4f, 10.986f)
                lineTo(21.4f, 17.335f)
                curveTo(21.4f, 17.865f, 21.4f, 18.316f, 21.37f, 18.687f)
                curveTo(21.338f, 19.076f, 21.268f, 19.454f, 21.084f, 19.816f)
                curveTo(20.806f, 20.362f, 20.362f, 20.806f, 19.817f, 21.083f)
                curveTo(19.455f, 21.268f, 19.076f, 21.337f, 18.687f, 21.369f)
                curveTo(18.316f, 21.4f, 17.865f, 21.4f, 17.335f, 21.4f)
                horizontalLineTo(12.9f)
                verticalLineTo(14.0f)
                curveTo(12.9f, 13.503f, 12.497f, 13.1f, 12.0f, 13.1f)
                curveTo(11.503f, 13.1f, 11.1f, 13.503f, 11.1f, 14.0f)
                verticalLineTo(21.4f)
                horizontalLineTo(6.665f)
                curveTo(6.135f, 21.4f, 5.684f, 21.4f, 5.313f, 21.369f)
                curveTo(4.924f, 21.337f, 4.545f, 21.268f, 4.183f, 21.083f)
                curveTo(3.638f, 20.806f, 3.194f, 20.362f, 2.916f, 19.816f)
                curveTo(2.732f, 19.454f, 2.662f, 19.076f, 2.63f, 18.687f)
                curveTo(2.6f, 18.316f, 2.6f, 17.865f, 2.6f, 17.335f)
                lineTo(2.6f, 10.986f)
                curveTo(2.6f, 10.5f, 2.599f, 10.089f, 2.709f, 9.699f)
                curveTo(2.806f, 9.357f, 2.965f, 9.035f, 3.178f, 8.75f)
                curveTo(3.421f, 8.426f, 3.747f, 8.177f, 4.134f, 7.882f)
                lineTo(10.967f, 2.656f)
                lineTo(11.002f, 2.629f)
                curveTo(11.125f, 2.533f, 11.358f, 2.352f, 11.639f, 2.276f)
                close()
            }
        }
        .build()
        return _homefill!!
    }

private var _homefill: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Homefill, contentDescription = "")
    }
}
