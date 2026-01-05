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

public val MooBesideIconPack.Lockopenfill: ImageVector
    get() {
        if (_lockopenfill != null) {
            return _lockopenfill!!
        }
        _lockopenfill = Builder(name = "Lockopenfill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 1.85f)
                curveTo(10.652f, 1.85f, 9.302f, 2.4f, 8.349f, 3.342f)
                lineTo(8.346f, 3.346f)
                curveTo(7.533f, 4.158f, 7.116f, 5.119f, 6.951f, 6.363f)
                lineTo(6.95f, 6.368f)
                curveTo(6.875f, 6.962f, 6.85f, 7.664f, 6.85f, 8.7f)
                verticalLineTo(9.605f)
                curveTo(6.655f, 9.61f, 6.476f, 9.617f, 6.313f, 9.63f)
                curveTo(5.924f, 9.662f, 5.545f, 9.732f, 5.183f, 9.916f)
                curveTo(4.638f, 10.194f, 4.194f, 10.638f, 3.916f, 11.184f)
                curveTo(3.732f, 11.545f, 3.662f, 11.924f, 3.63f, 12.313f)
                curveTo(3.6f, 12.684f, 3.6f, 13.135f, 3.6f, 13.665f)
                verticalLineTo(17.836f)
                curveTo(3.6f, 18.365f, 3.6f, 18.817f, 3.63f, 19.187f)
                curveTo(3.662f, 19.576f, 3.732f, 19.955f, 3.916f, 20.317f)
                curveTo(4.194f, 20.862f, 4.638f, 21.306f, 5.183f, 21.584f)
                curveTo(5.545f, 21.768f, 5.924f, 21.838f, 6.313f, 21.87f)
                curveTo(6.683f, 21.9f, 7.135f, 21.9f, 7.664f, 21.9f)
                horizontalLineTo(16.335f)
                curveTo(16.865f, 21.9f, 17.316f, 21.9f, 17.687f, 21.87f)
                curveTo(18.076f, 21.838f, 18.455f, 21.768f, 18.816f, 21.584f)
                curveTo(19.362f, 21.306f, 19.806f, 20.862f, 20.084f, 20.317f)
                curveTo(20.268f, 19.955f, 20.338f, 19.576f, 20.37f, 19.187f)
                curveTo(20.4f, 18.817f, 20.4f, 18.365f, 20.4f, 17.836f)
                verticalLineTo(13.665f)
                curveTo(20.4f, 13.135f, 20.4f, 12.684f, 20.37f, 12.313f)
                curveTo(20.338f, 11.924f, 20.268f, 11.545f, 20.084f, 11.184f)
                curveTo(19.806f, 10.638f, 19.362f, 10.194f, 18.816f, 9.916f)
                curveTo(18.455f, 9.732f, 18.076f, 9.662f, 17.687f, 9.63f)
                curveTo(17.316f, 9.6f, 16.865f, 9.6f, 16.335f, 9.6f)
                horizontalLineTo(8.65f)
                verticalLineTo(8.7f)
                curveTo(8.65f, 7.68f, 8.675f, 7.073f, 8.736f, 6.597f)
                curveTo(8.86f, 5.667f, 9.139f, 5.099f, 9.617f, 4.62f)
                curveTo(10.229f, 4.016f, 11.121f, 3.65f, 12.0f, 3.65f)
                curveTo(12.887f, 3.65f, 13.763f, 4.008f, 14.383f, 4.62f)
                curveTo(14.862f, 5.1f, 15.149f, 5.695f, 15.273f, 6.602f)
                curveTo(15.34f, 7.095f, 15.793f, 7.44f, 16.286f, 7.373f)
                curveTo(16.778f, 7.306f, 17.124f, 6.852f, 17.056f, 6.36f)
                curveTo(16.891f, 5.143f, 16.465f, 4.158f, 15.654f, 3.346f)
                lineTo(15.65f, 3.342f)
                curveTo(14.689f, 2.391f, 13.356f, 1.85f, 12.0f, 1.85f)
                close()
            }
        }
        .build()
        return _lockopenfill!!
    }

private var _lockopenfill: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Lockopenfill, contentDescription = "")
    }
}
