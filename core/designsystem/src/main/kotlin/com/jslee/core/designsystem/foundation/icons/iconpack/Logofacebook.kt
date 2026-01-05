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

public val MooBesideIconPack.Logofacebook: ImageVector
    get() {
        if (_logofacebook != null) {
            return _logofacebook!!
        }
        _logofacebook = Builder(name = "Logofacebook", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.1f)
                curveTo(6.535f, 2.1f, 2.1f, 6.535f, 2.1f, 12.0f)
                curveTo(2.1f, 16.94f, 5.723f, 21.039f, 10.455f, 21.781f)
                verticalLineTo(14.861f)
                horizontalLineTo(7.941f)
                verticalLineTo(12.0f)
                horizontalLineTo(10.455f)
                verticalLineTo(9.822f)
                curveTo(10.455f, 7.337f, 11.931f, 5.971f, 14.198f, 5.971f)
                curveTo(15.277f, 5.971f, 16.415f, 6.169f, 16.415f, 6.169f)
                verticalLineTo(8.604f)
                horizontalLineTo(15.168f)
                curveTo(13.94f, 8.604f, 13.554f, 9.367f, 13.554f, 10.149f)
                verticalLineTo(12.01f)
                horizontalLineTo(16.296f)
                lineTo(15.861f, 14.871f)
                horizontalLineTo(13.554f)
                verticalLineTo(21.791f)
                curveTo(18.286f, 21.049f, 21.9f, 16.94f, 21.9f, 12.0f)
                curveTo(21.9f, 6.535f, 17.475f, 2.11f, 12.01f, 2.11f)
                lineTo(12.0f, 2.1f)
                close()
            }
        }
        .build()
        return _logofacebook!!
    }

private var _logofacebook: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Logofacebook, contentDescription = "")
    }
}
