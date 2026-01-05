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

public val MooBesideIconPack.Caretdown: ImageVector
    get() {
        if (_caretdown != null) {
            return _caretdown!!
        }
        _caretdown = Builder(name = "Caretdown", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.863f, 14.708f)
                curveTo(13.225f, 15.493f, 12.906f, 15.885f, 12.522f, 16.028f)
                curveTo(12.185f, 16.153f, 11.815f, 16.153f, 11.478f, 16.028f)
                curveTo(11.094f, 15.885f, 10.775f, 15.493f, 10.137f, 14.708f)
                lineTo(8.68f, 12.913f)
                curveTo(7.663f, 11.662f, 7.155f, 11.037f, 7.152f, 10.51f)
                curveTo(7.149f, 10.051f, 7.355f, 9.617f, 7.713f, 9.33f)
                curveTo(8.124f, 9.0f, 8.93f, 9.0f, 10.542f, 9.0f)
                horizontalLineTo(13.458f)
                curveTo(15.07f, 9.0f, 15.876f, 9.0f, 16.287f, 9.33f)
                curveTo(16.645f, 9.617f, 16.851f, 10.051f, 16.849f, 10.51f)
                curveTo(16.845f, 11.037f, 16.337f, 11.662f, 15.32f, 12.913f)
                lineTo(13.863f, 14.708f)
                close()
            }
        }
        .build()
        return _caretdown!!
    }

private var _caretdown: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Caretdown, contentDescription = "")
    }
}
