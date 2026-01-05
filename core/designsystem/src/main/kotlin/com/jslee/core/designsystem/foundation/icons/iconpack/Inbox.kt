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

public val MooBesideIconPack.Inbox: ImageVector
    get() {
        if (_inbox != null) {
            return _inbox!!
        }
        _inbox = Builder(name = "Inbox", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.111f, 4.1f)
                curveTo(7.586f, 4.1f, 7.144f, 4.099f, 6.729f, 4.225f)
                curveTo(6.364f, 4.336f, 6.024f, 4.518f, 5.73f, 4.76f)
                curveTo(5.395f, 5.036f, 5.15f, 5.404f, 4.859f, 5.841f)
                lineTo(2.257f, 9.744f)
                curveTo(2.089f, 9.996f, 1.947f, 10.209f, 1.843f, 10.446f)
                curveTo(1.752f, 10.655f, 1.686f, 10.873f, 1.646f, 11.097f)
                curveTo(1.601f, 11.352f, 1.601f, 11.608f, 1.601f, 11.911f)
                lineTo(1.601f, 15.836f)
                curveTo(1.601f, 16.365f, 1.601f, 16.817f, 1.631f, 17.187f)
                curveTo(1.663f, 17.576f, 1.733f, 17.955f, 1.917f, 18.317f)
                curveTo(2.195f, 18.862f, 2.639f, 19.306f, 3.184f, 19.584f)
                curveTo(3.546f, 19.769f, 3.925f, 19.838f, 4.314f, 19.87f)
                curveTo(4.685f, 19.9f, 5.136f, 19.9f, 5.666f, 19.9f)
                horizontalLineTo(18.336f)
                curveTo(18.866f, 19.9f, 19.317f, 19.9f, 19.688f, 19.87f)
                curveTo(20.077f, 19.838f, 20.456f, 19.769f, 20.818f, 19.584f)
                curveTo(21.363f, 19.306f, 21.807f, 18.862f, 22.085f, 18.317f)
                curveTo(22.269f, 17.955f, 22.339f, 17.576f, 22.371f, 17.187f)
                curveTo(22.401f, 16.817f, 22.401f, 16.365f, 22.401f, 15.836f)
                lineTo(22.401f, 11.911f)
                curveTo(22.401f, 11.608f, 22.401f, 11.352f, 22.356f, 11.097f)
                curveTo(22.316f, 10.873f, 22.25f, 10.655f, 22.159f, 10.446f)
                curveTo(22.055f, 10.209f, 21.913f, 9.996f, 21.745f, 9.744f)
                lineTo(19.143f, 5.841f)
                curveTo(18.852f, 5.404f, 18.607f, 5.036f, 18.272f, 4.76f)
                curveTo(17.978f, 4.518f, 17.638f, 4.336f, 17.273f, 4.225f)
                curveTo(16.858f, 4.099f, 16.416f, 4.1f, 15.891f, 4.1f)
                horizontalLineTo(8.111f)
                close()
                moveTo(7.357f, 5.921f)
                curveTo(7.442f, 5.904f, 7.546f, 5.9f, 8.0f, 5.9f)
                horizontalLineTo(16.002f)
                curveTo(16.456f, 5.9f, 16.56f, 5.904f, 16.645f, 5.921f)
                curveTo(16.859f, 5.964f, 17.055f, 6.069f, 17.209f, 6.223f)
                curveTo(17.271f, 6.285f, 17.332f, 6.369f, 17.583f, 6.746f)
                lineTo(19.819f, 10.101f)
                horizontalLineTo(16.25f)
                curveTo(15.02f, 10.101f, 14.252f, 11.104f, 13.922f, 11.85f)
                curveTo(13.594f, 12.589f, 12.856f, 13.101f, 12.0f, 13.101f)
                curveTo(11.145f, 13.101f, 10.406f, 12.589f, 10.079f, 11.85f)
                curveTo(9.748f, 11.104f, 8.98f, 10.101f, 7.75f, 10.101f)
                horizontalLineTo(4.183f)
                lineTo(6.419f, 6.746f)
                curveTo(6.67f, 6.369f, 6.731f, 6.285f, 6.793f, 6.223f)
                curveTo(6.947f, 6.069f, 7.143f, 5.964f, 7.357f, 5.921f)
                close()
                moveTo(3.401f, 11.901f)
                verticalLineTo(16.2f)
                curveTo(3.401f, 17.015f, 3.412f, 17.208f, 3.455f, 17.34f)
                curveTo(3.564f, 17.675f, 3.826f, 17.938f, 4.161f, 18.046f)
                curveTo(4.293f, 18.089f, 4.486f, 18.1f, 5.301f, 18.1f)
                horizontalLineTo(18.701f)
                curveTo(19.516f, 18.1f, 19.709f, 18.089f, 19.841f, 18.046f)
                curveTo(20.176f, 17.938f, 20.438f, 17.675f, 20.547f, 17.34f)
                curveTo(20.59f, 17.208f, 20.601f, 17.015f, 20.601f, 16.2f)
                verticalLineTo(11.901f)
                horizontalLineTo(16.25f)
                curveTo(15.923f, 11.901f, 15.679f, 12.327f, 15.567f, 12.58f)
                curveTo(14.962f, 13.945f, 13.594f, 14.901f, 12.0f, 14.901f)
                curveTo(10.407f, 14.901f, 9.039f, 13.945f, 8.433f, 12.58f)
                curveTo(8.321f, 12.327f, 8.078f, 11.901f, 7.75f, 11.901f)
                horizontalLineTo(3.401f)
                close()
            }
        }
        .build()
        return _inbox!!
    }

private var _inbox: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Inbox, contentDescription = "")
    }
}
