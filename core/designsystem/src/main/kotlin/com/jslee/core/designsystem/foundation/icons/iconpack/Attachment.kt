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

public val MooBesideIconPack.Attachment: ImageVector
    get() {
        if (_attachment != null) {
            return _attachment!!
        }
        _attachment = Builder(name = "Attachment", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.35f, 3.9f)
                curveTo(9.025f, 3.9f, 7.95f, 4.975f, 7.95f, 6.3f)
                verticalLineTo(16.05f)
                curveTo(7.95f, 18.287f, 9.764f, 20.1f, 12.0f, 20.1f)
                curveTo(14.237f, 20.1f, 16.05f, 18.287f, 16.05f, 16.05f)
                verticalLineTo(5.93f)
                curveTo(16.05f, 5.433f, 16.453f, 5.03f, 16.95f, 5.03f)
                curveTo(17.447f, 5.03f, 17.85f, 5.433f, 17.85f, 5.93f)
                verticalLineTo(16.05f)
                curveTo(17.85f, 19.281f, 15.231f, 21.9f, 12.0f, 21.9f)
                curveTo(8.77f, 21.9f, 6.15f, 19.281f, 6.15f, 16.05f)
                verticalLineTo(6.3f)
                curveTo(6.15f, 3.98f, 8.031f, 2.1f, 10.35f, 2.1f)
                curveTo(12.67f, 2.1f, 14.55f, 3.98f, 14.55f, 6.3f)
                verticalLineTo(16.001f)
                curveTo(14.55f, 17.41f, 13.409f, 18.551f, 12.0f, 18.551f)
                curveTo(10.592f, 18.551f, 9.45f, 17.41f, 9.45f, 16.001f)
                verticalLineTo(7.186f)
                curveTo(9.45f, 6.689f, 9.853f, 6.286f, 10.35f, 6.286f)
                curveTo(10.847f, 6.286f, 11.25f, 6.689f, 11.25f, 7.186f)
                verticalLineTo(16.001f)
                curveTo(11.25f, 16.416f, 11.586f, 16.751f, 12.0f, 16.751f)
                curveTo(12.415f, 16.751f, 12.75f, 16.416f, 12.75f, 16.001f)
                verticalLineTo(6.3f)
                curveTo(12.75f, 4.975f, 11.676f, 3.9f, 10.35f, 3.9f)
                close()
            }
        }
        .build()
        return _attachment!!
    }

private var _attachment: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Attachment, contentDescription = "")
    }
}
