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

public val MooBesideIconPack.Lock: ImageVector
    get() {
        if (_lock != null) {
            return _lock!!
        }
        _lock = Builder(name = "Lock", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 2.35f)
                curveTo(10.652f, 2.35f, 9.302f, 2.9f, 8.349f, 3.842f)
                lineTo(8.346f, 3.846f)
                curveTo(7.534f, 4.658f, 7.116f, 5.619f, 6.951f, 6.863f)
                lineTo(6.951f, 6.868f)
                curveTo(6.875f, 7.462f, 6.85f, 8.164f, 6.85f, 9.2f)
                verticalLineTo(9.605f)
                curveTo(6.655f, 9.609f, 6.476f, 9.617f, 6.313f, 9.63f)
                curveTo(5.924f, 9.662f, 5.545f, 9.732f, 5.183f, 9.916f)
                curveTo(4.638f, 10.194f, 4.194f, 10.638f, 3.916f, 11.183f)
                curveTo(3.732f, 11.545f, 3.662f, 11.924f, 3.63f, 12.313f)
                curveTo(3.6f, 12.684f, 3.6f, 13.135f, 3.6f, 13.665f)
                verticalLineTo(17.835f)
                curveTo(3.6f, 18.365f, 3.6f, 18.816f, 3.63f, 19.187f)
                curveTo(3.662f, 19.576f, 3.732f, 19.955f, 3.916f, 20.317f)
                curveTo(4.194f, 20.862f, 4.638f, 21.306f, 5.183f, 21.584f)
                curveTo(5.545f, 21.768f, 5.924f, 21.838f, 6.313f, 21.87f)
                curveTo(6.684f, 21.9f, 7.135f, 21.9f, 7.665f, 21.9f)
                horizontalLineTo(16.335f)
                curveTo(16.865f, 21.9f, 17.316f, 21.9f, 17.687f, 21.87f)
                curveTo(18.076f, 21.838f, 18.455f, 21.768f, 18.816f, 21.584f)
                curveTo(19.362f, 21.306f, 19.806f, 20.862f, 20.084f, 20.317f)
                curveTo(20.268f, 19.955f, 20.338f, 19.576f, 20.37f, 19.187f)
                curveTo(20.4f, 18.816f, 20.4f, 18.365f, 20.4f, 17.835f)
                verticalLineTo(13.665f)
                curveTo(20.4f, 13.135f, 20.4f, 12.684f, 20.37f, 12.313f)
                curveTo(20.338f, 11.924f, 20.268f, 11.545f, 20.084f, 11.183f)
                curveTo(19.806f, 10.638f, 19.362f, 10.194f, 18.816f, 9.916f)
                curveTo(18.455f, 9.732f, 18.076f, 9.662f, 17.687f, 9.63f)
                curveTo(17.524f, 9.617f, 17.344f, 9.609f, 17.15f, 9.605f)
                verticalLineTo(9.2f)
                curveTo(17.15f, 8.115f, 17.125f, 7.423f, 17.058f, 6.873f)
                lineTo(17.057f, 6.86f)
                curveTo(16.891f, 5.643f, 16.466f, 4.658f, 15.654f, 3.846f)
                lineTo(15.65f, 3.842f)
                curveTo(14.689f, 2.891f, 13.356f, 2.35f, 12.0f, 2.35f)
                close()
                moveTo(15.35f, 9.6f)
                verticalLineTo(9.2f)
                curveTo(15.35f, 8.131f, 15.324f, 7.531f, 15.272f, 7.096f)
                curveTo(15.148f, 6.192f, 14.861f, 5.599f, 14.383f, 5.12f)
                curveTo(13.763f, 4.508f, 12.887f, 4.15f, 12.0f, 4.15f)
                curveTo(11.122f, 4.15f, 10.229f, 4.516f, 9.617f, 5.12f)
                curveTo(9.139f, 5.599f, 8.86f, 6.167f, 8.736f, 7.097f)
                curveTo(8.676f, 7.573f, 8.65f, 8.18f, 8.65f, 9.2f)
                verticalLineTo(9.6f)
                horizontalLineTo(15.35f)
                close()
                moveTo(6.16f, 11.454f)
                curveTo(6.292f, 11.411f, 6.485f, 11.4f, 7.3f, 11.4f)
                horizontalLineTo(16.7f)
                curveTo(17.514f, 11.4f, 17.708f, 11.411f, 17.84f, 11.454f)
                curveTo(18.175f, 11.563f, 18.437f, 11.825f, 18.546f, 12.16f)
                curveTo(18.589f, 12.291f, 18.6f, 12.485f, 18.6f, 13.3f)
                verticalLineTo(18.2f)
                curveTo(18.6f, 19.014f, 18.589f, 19.208f, 18.546f, 19.34f)
                curveTo(18.437f, 19.675f, 18.175f, 19.937f, 17.84f, 20.046f)
                curveTo(17.708f, 20.089f, 17.514f, 20.1f, 16.7f, 20.1f)
                horizontalLineTo(7.3f)
                curveTo(6.485f, 20.1f, 6.292f, 20.089f, 6.16f, 20.046f)
                curveTo(5.825f, 19.937f, 5.563f, 19.675f, 5.454f, 19.34f)
                curveTo(5.411f, 19.208f, 5.4f, 19.014f, 5.4f, 18.2f)
                verticalLineTo(13.3f)
                curveTo(5.4f, 12.485f, 5.411f, 12.291f, 5.454f, 12.16f)
                curveTo(5.563f, 11.825f, 5.825f, 11.563f, 6.16f, 11.454f)
                close()
            }
        }
        .build()
        return _lock!!
    }

private var _lock: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Lock, contentDescription = "")
    }
}
