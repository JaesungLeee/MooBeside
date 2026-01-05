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

public val MooBesideIconPack.Thumbnail: ImageVector
    get() {
        if (_thumbnail != null) {
            return _thumbnail!!
        }
        _thumbnail = Builder(name = "Thumbnail", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(15.571f, 13.099f)
                horizontalLineTo(18.93f)
                curveTo(19.184f, 13.099f, 19.426f, 13.099f, 19.63f, 13.116f)
                curveTo(19.853f, 13.134f, 20.108f, 13.176f, 20.363f, 13.306f)
                curveTo(20.72f, 13.488f, 21.011f, 13.779f, 21.193f, 14.137f)
                curveTo(21.323f, 14.392f, 21.365f, 14.647f, 21.384f, 14.869f)
                curveTo(21.4f, 15.073f, 21.4f, 15.315f, 21.4f, 15.569f)
                verticalLineTo(18.929f)
                curveTo(21.4f, 19.183f, 21.4f, 19.425f, 21.384f, 19.629f)
                curveTo(21.365f, 19.852f, 21.323f, 20.107f, 21.193f, 20.362f)
                curveTo(21.011f, 20.719f, 20.72f, 21.01f, 20.363f, 21.192f)
                curveTo(20.108f, 21.322f, 19.853f, 21.364f, 19.63f, 21.382f)
                curveTo(19.426f, 21.399f, 19.184f, 21.399f, 18.93f, 21.399f)
                horizontalLineTo(15.571f)
                curveTo(15.316f, 21.399f, 15.074f, 21.399f, 14.87f, 21.382f)
                curveTo(14.648f, 21.364f, 14.393f, 21.322f, 14.138f, 21.192f)
                curveTo(13.78f, 21.01f, 13.49f, 20.719f, 13.307f, 20.362f)
                curveTo(13.177f, 20.107f, 13.135f, 19.852f, 13.117f, 19.629f)
                curveTo(13.1f, 19.425f, 13.1f, 19.183f, 13.1f, 18.929f)
                verticalLineTo(15.569f)
                curveTo(13.1f, 15.315f, 13.1f, 15.073f, 13.117f, 14.869f)
                curveTo(13.135f, 14.647f, 13.177f, 14.392f, 13.307f, 14.137f)
                curveTo(13.49f, 13.779f, 13.78f, 13.488f, 14.138f, 13.306f)
                curveTo(14.393f, 13.176f, 14.648f, 13.134f, 14.87f, 13.116f)
                curveTo(15.074f, 13.099f, 15.316f, 13.099f, 15.571f, 13.099f)
                close()
                moveTo(15.0f, 14.9f)
                curveTo(14.945f, 14.9f, 14.9f, 14.945f, 14.9f, 15.0f)
                verticalLineTo(19.5f)
                curveTo(14.9f, 19.555f, 14.945f, 19.6f, 15.0f, 19.6f)
                horizontalLineTo(19.5f)
                curveTo(19.556f, 19.6f, 19.6f, 19.555f, 19.6f, 19.5f)
                verticalLineTo(15.0f)
                curveTo(19.6f, 14.945f, 19.556f, 14.9f, 19.5f, 14.9f)
                horizontalLineTo(15.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.07f, 13.099f)
                horizontalLineTo(8.43f)
                curveTo(8.684f, 13.099f, 8.926f, 13.099f, 9.13f, 13.116f)
                curveTo(9.353f, 13.134f, 9.608f, 13.176f, 9.863f, 13.306f)
                curveTo(10.22f, 13.488f, 10.511f, 13.779f, 10.693f, 14.137f)
                curveTo(10.823f, 14.392f, 10.865f, 14.647f, 10.884f, 14.869f)
                curveTo(10.9f, 15.073f, 10.9f, 15.315f, 10.9f, 15.569f)
                verticalLineTo(18.929f)
                curveTo(10.9f, 19.183f, 10.9f, 19.425f, 10.884f, 19.629f)
                curveTo(10.865f, 19.852f, 10.823f, 20.107f, 10.693f, 20.362f)
                curveTo(10.511f, 20.719f, 10.22f, 21.01f, 9.863f, 21.192f)
                curveTo(9.608f, 21.322f, 9.353f, 21.364f, 9.13f, 21.382f)
                curveTo(8.926f, 21.399f, 8.684f, 21.399f, 8.43f, 21.399f)
                horizontalLineTo(5.07f)
                curveTo(4.816f, 21.399f, 4.574f, 21.399f, 4.37f, 21.382f)
                curveTo(4.148f, 21.364f, 3.893f, 21.322f, 3.638f, 21.192f)
                curveTo(3.28f, 21.01f, 2.99f, 20.719f, 2.807f, 20.362f)
                curveTo(2.677f, 20.107f, 2.635f, 19.852f, 2.617f, 19.629f)
                curveTo(2.6f, 19.425f, 2.6f, 19.183f, 2.6f, 18.929f)
                verticalLineTo(15.569f)
                curveTo(2.6f, 15.315f, 2.6f, 15.073f, 2.617f, 14.869f)
                curveTo(2.635f, 14.647f, 2.677f, 14.392f, 2.807f, 14.137f)
                curveTo(2.99f, 13.779f, 3.28f, 13.488f, 3.638f, 13.306f)
                curveTo(3.893f, 13.176f, 4.148f, 13.134f, 4.37f, 13.116f)
                curveTo(4.574f, 13.099f, 4.816f, 13.099f, 5.07f, 13.099f)
                close()
                moveTo(4.5f, 14.9f)
                curveTo(4.445f, 14.9f, 4.4f, 14.945f, 4.4f, 15.0f)
                verticalLineTo(19.5f)
                curveTo(4.4f, 19.555f, 4.445f, 19.6f, 4.5f, 19.6f)
                horizontalLineTo(9.0f)
                curveTo(9.056f, 19.6f, 9.1f, 19.555f, 9.1f, 19.5f)
                verticalLineTo(15.0f)
                curveTo(9.1f, 14.945f, 9.056f, 14.9f, 9.0f, 14.9f)
                horizontalLineTo(4.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(15.571f, 2.599f)
                horizontalLineTo(18.93f)
                curveTo(19.184f, 2.599f, 19.426f, 2.599f, 19.63f, 2.616f)
                curveTo(19.853f, 2.634f, 20.108f, 2.676f, 20.363f, 2.806f)
                curveTo(20.72f, 2.988f, 21.011f, 3.279f, 21.193f, 3.637f)
                curveTo(21.323f, 3.892f, 21.365f, 4.147f, 21.384f, 4.369f)
                curveTo(21.4f, 4.573f, 21.4f, 4.815f, 21.4f, 5.069f)
                verticalLineTo(8.429f)
                curveTo(21.4f, 8.683f, 21.4f, 8.925f, 21.384f, 9.129f)
                curveTo(21.365f, 9.352f, 21.323f, 9.607f, 21.193f, 9.862f)
                curveTo(21.011f, 10.219f, 20.72f, 10.51f, 20.363f, 10.692f)
                curveTo(20.108f, 10.822f, 19.853f, 10.864f, 19.63f, 10.882f)
                curveTo(19.426f, 10.899f, 19.184f, 10.899f, 18.93f, 10.899f)
                horizontalLineTo(15.571f)
                curveTo(15.316f, 10.899f, 15.074f, 10.899f, 14.87f, 10.882f)
                curveTo(14.648f, 10.864f, 14.393f, 10.822f, 14.138f, 10.692f)
                curveTo(13.78f, 10.51f, 13.49f, 10.219f, 13.307f, 9.862f)
                curveTo(13.177f, 9.607f, 13.135f, 9.352f, 13.117f, 9.129f)
                curveTo(13.1f, 8.925f, 13.1f, 8.683f, 13.1f, 8.429f)
                verticalLineTo(5.069f)
                curveTo(13.1f, 4.815f, 13.1f, 4.573f, 13.117f, 4.369f)
                curveTo(13.135f, 4.147f, 13.177f, 3.892f, 13.307f, 3.637f)
                curveTo(13.49f, 3.279f, 13.78f, 2.988f, 14.138f, 2.806f)
                curveTo(14.393f, 2.676f, 14.648f, 2.634f, 14.87f, 2.616f)
                curveTo(15.074f, 2.599f, 15.316f, 2.599f, 15.571f, 2.599f)
                close()
                moveTo(15.0f, 4.4f)
                curveTo(14.945f, 4.4f, 14.9f, 4.445f, 14.9f, 4.5f)
                verticalLineTo(9.0f)
                curveTo(14.9f, 9.055f, 14.945f, 9.1f, 15.0f, 9.1f)
                horizontalLineTo(19.5f)
                curveTo(19.556f, 9.1f, 19.6f, 9.055f, 19.6f, 9.0f)
                verticalLineTo(4.5f)
                curveTo(19.6f, 4.445f, 19.556f, 4.4f, 19.5f, 4.4f)
                horizontalLineTo(15.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.07f, 2.599f)
                horizontalLineTo(8.43f)
                curveTo(8.684f, 2.599f, 8.926f, 2.599f, 9.13f, 2.616f)
                curveTo(9.353f, 2.634f, 9.608f, 2.676f, 9.863f, 2.806f)
                curveTo(10.22f, 2.988f, 10.511f, 3.279f, 10.693f, 3.637f)
                curveTo(10.823f, 3.892f, 10.865f, 4.147f, 10.884f, 4.369f)
                curveTo(10.9f, 4.573f, 10.9f, 4.815f, 10.9f, 5.069f)
                verticalLineTo(8.429f)
                curveTo(10.9f, 8.683f, 10.9f, 8.925f, 10.884f, 9.129f)
                curveTo(10.865f, 9.352f, 10.823f, 9.607f, 10.693f, 9.862f)
                curveTo(10.511f, 10.219f, 10.22f, 10.51f, 9.863f, 10.692f)
                curveTo(9.608f, 10.822f, 9.353f, 10.864f, 9.13f, 10.882f)
                curveTo(8.926f, 10.899f, 8.684f, 10.899f, 8.43f, 10.899f)
                horizontalLineTo(5.07f)
                curveTo(4.816f, 10.899f, 4.574f, 10.899f, 4.37f, 10.882f)
                curveTo(4.148f, 10.864f, 3.893f, 10.822f, 3.638f, 10.692f)
                curveTo(3.28f, 10.51f, 2.99f, 10.219f, 2.807f, 9.862f)
                curveTo(2.677f, 9.607f, 2.635f, 9.352f, 2.617f, 9.129f)
                curveTo(2.6f, 8.925f, 2.6f, 8.683f, 2.6f, 8.429f)
                verticalLineTo(5.069f)
                curveTo(2.6f, 4.815f, 2.6f, 4.573f, 2.617f, 4.369f)
                curveTo(2.635f, 4.147f, 2.677f, 3.892f, 2.807f, 3.637f)
                curveTo(2.99f, 3.279f, 3.28f, 2.988f, 3.638f, 2.806f)
                curveTo(3.893f, 2.676f, 4.148f, 2.634f, 4.37f, 2.616f)
                curveTo(4.574f, 2.599f, 4.816f, 2.599f, 5.07f, 2.599f)
                close()
                moveTo(4.5f, 4.4f)
                curveTo(4.445f, 4.4f, 4.4f, 4.445f, 4.4f, 4.5f)
                verticalLineTo(9.0f)
                curveTo(4.4f, 9.055f, 4.445f, 9.1f, 4.5f, 9.1f)
                horizontalLineTo(9.0f)
                curveTo(9.056f, 9.1f, 9.1f, 9.055f, 9.1f, 9.0f)
                verticalLineTo(4.5f)
                curveTo(9.1f, 4.445f, 9.056f, 4.4f, 9.0f, 4.4f)
                horizontalLineTo(4.5f)
                close()
            }
        }
        .build()
        return _thumbnail!!
    }

private var _thumbnail: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Thumbnail, contentDescription = "")
    }
}
