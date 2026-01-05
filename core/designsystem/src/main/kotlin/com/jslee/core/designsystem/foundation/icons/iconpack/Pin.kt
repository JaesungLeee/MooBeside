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

public val MooBesideIconPack.Pin: ImageVector
    get() {
        if (_pin != null) {
            return _pin!!
        }
        _pin = Builder(name = "Pin", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.947f, 2.602f)
                curveTo(8.531f, 2.602f, 8.159f, 2.602f, 7.86f, 2.629f)
                curveTo(7.555f, 2.657f, 7.179f, 2.723f, 6.849f, 2.961f)
                curveTo(6.414f, 3.275f, 6.132f, 3.757f, 6.072f, 4.289f)
                curveTo(6.027f, 4.694f, 6.154f, 5.053f, 6.279f, 5.332f)
                curveTo(6.402f, 5.607f, 6.584f, 5.931f, 6.788f, 6.294f)
                lineTo(7.6f, 7.737f)
                verticalLineTo(10.685f)
                lineTo(5.851f, 12.871f)
                curveTo(5.541f, 13.26f, 5.269f, 13.599f, 5.08f, 13.885f)
                curveTo(4.895f, 14.165f, 4.681f, 14.545f, 4.681f, 14.999f)
                curveTo(4.68f, 15.578f, 4.943f, 16.125f, 5.396f, 16.486f)
                curveTo(5.75f, 16.769f, 6.18f, 16.84f, 6.515f, 16.87f)
                curveTo(6.856f, 16.901f, 7.29f, 16.901f, 7.788f, 16.901f)
                lineTo(11.1f, 16.901f)
                verticalLineTo(22.001f)
                curveTo(11.1f, 22.498f, 11.503f, 22.901f, 12.0f, 22.901f)
                curveTo(12.497f, 22.901f, 12.9f, 22.498f, 12.9f, 22.001f)
                verticalLineTo(16.901f)
                lineTo(16.212f, 16.901f)
                curveTo(16.71f, 16.901f, 17.144f, 16.901f, 17.486f, 16.87f)
                curveTo(17.82f, 16.84f, 18.25f, 16.769f, 18.605f, 16.486f)
                curveTo(19.057f, 16.125f, 19.32f, 15.578f, 19.319f, 14.999f)
                curveTo(19.319f, 14.545f, 19.106f, 14.165f, 18.92f, 13.885f)
                curveTo(18.731f, 13.599f, 18.46f, 13.26f, 18.149f, 12.871f)
                lineTo(16.4f, 10.685f)
                verticalLineTo(7.737f)
                lineTo(17.212f, 6.294f)
                curveTo(17.416f, 5.931f, 17.599f, 5.607f, 17.722f, 5.332f)
                curveTo(17.847f, 5.053f, 17.974f, 4.694f, 17.928f, 4.289f)
                curveTo(17.868f, 3.757f, 17.586f, 3.275f, 17.152f, 2.961f)
                curveTo(16.821f, 2.723f, 16.445f, 2.657f, 16.141f, 2.629f)
                curveTo(15.842f, 2.602f, 15.469f, 2.602f, 15.053f, 2.602f)
                horizontalLineTo(8.947f)
                close()
                moveTo(7.873f, 4.551f)
                curveTo(7.86f, 4.528f, 7.859f, 4.513f, 7.859f, 4.501f)
                curveTo(7.859f, 4.487f, 7.864f, 4.469f, 7.874f, 4.451f)
                curveTo(7.884f, 4.434f, 7.898f, 4.421f, 7.91f, 4.414f)
                curveTo(7.92f, 4.408f, 7.934f, 4.402f, 7.96f, 4.402f)
                horizontalLineTo(16.04f)
                curveTo(16.066f, 4.402f, 16.081f, 4.408f, 16.09f, 4.414f)
                curveTo(16.103f, 4.421f, 16.116f, 4.434f, 16.126f, 4.451f)
                curveTo(16.137f, 4.469f, 16.141f, 4.487f, 16.142f, 4.501f)
                curveTo(16.142f, 4.513f, 16.14f, 4.528f, 16.127f, 4.551f)
                lineTo(14.716f, 7.06f)
                curveTo(14.64f, 7.194f, 14.6f, 7.346f, 14.6f, 7.501f)
                verticalLineTo(11.001f)
                curveTo(14.6f, 11.205f, 14.67f, 11.403f, 14.797f, 11.563f)
                lineTo(17.498f, 14.938f)
                curveTo(17.517f, 14.962f, 17.52f, 14.979f, 17.521f, 14.989f)
                curveTo(17.522f, 15.003f, 17.52f, 15.023f, 17.51f, 15.044f)
                curveTo(17.499f, 15.066f, 17.485f, 15.08f, 17.473f, 15.088f)
                curveTo(17.465f, 15.093f, 17.45f, 15.101f, 17.42f, 15.101f)
                horizontalLineTo(6.581f)
                curveTo(6.55f, 15.101f, 6.535f, 15.093f, 6.527f, 15.088f)
                curveTo(6.515f, 15.08f, 6.501f, 15.066f, 6.491f, 15.044f)
                curveTo(6.48f, 15.023f, 6.478f, 15.003f, 6.479f, 14.989f)
                curveTo(6.48f, 14.979f, 6.483f, 14.962f, 6.503f, 14.938f)
                lineTo(9.203f, 11.563f)
                curveTo(9.331f, 11.403f, 9.4f, 11.205f, 9.4f, 11.001f)
                verticalLineTo(7.501f)
                curveTo(9.4f, 7.346f, 9.36f, 7.194f, 9.285f, 7.06f)
                lineTo(7.873f, 4.551f)
                close()
            }
        }
        .build()
        return _pin!!
    }

private var _pin: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Pin, contentDescription = "")
    }
}
