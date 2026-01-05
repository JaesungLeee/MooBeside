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

public val MooBesideIconPack.Chat: ImageVector
    get() {
        if (_chat != null) {
            return _chat!!
        }
        _chat = Builder(name = "Chat", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(6.179f, 8.841f)
                curveTo(3.252f, 9.639f, 1.1f, 12.317f, 1.1f, 15.498f)
                curveTo(1.1f, 16.43f, 1.285f, 17.32f, 1.621f, 18.133f)
                lineTo(0.992f, 20.44f)
                curveTo(0.939f, 20.635f, 0.884f, 20.836f, 0.854f, 21.008f)
                curveTo(0.823f, 21.183f, 0.787f, 21.475f, 0.905f, 21.785f)
                curveTo(1.047f, 22.157f, 1.341f, 22.451f, 1.713f, 22.593f)
                curveTo(2.023f, 22.711f, 2.315f, 22.675f, 2.49f, 22.644f)
                curveTo(2.661f, 22.614f, 2.863f, 22.559f, 3.058f, 22.506f)
                lineTo(5.365f, 21.876f)
                curveTo(6.178f, 22.213f, 7.068f, 22.398f, 8.0f, 22.398f)
                curveTo(10.776f, 22.398f, 13.169f, 20.759f, 14.264f, 18.396f)
                curveTo(14.342f, 18.398f, 14.421f, 18.399f, 14.5f, 18.399f)
                curveTo(15.81f, 18.399f, 17.052f, 18.099f, 18.159f, 17.562f)
                lineTo(19.888f, 18.034f)
                curveTo(20.211f, 18.122f, 20.511f, 18.204f, 20.76f, 18.248f)
                curveTo(21.012f, 18.292f, 21.361f, 18.329f, 21.716f, 18.193f)
                curveTo(22.168f, 18.021f, 22.525f, 17.663f, 22.698f, 17.211f)
                curveTo(22.834f, 16.856f, 22.797f, 16.508f, 22.753f, 16.255f)
                curveTo(22.709f, 16.006f, 22.627f, 15.706f, 22.539f, 15.383f)
                lineTo(22.066f, 13.651f)
                curveTo(22.601f, 12.546f, 22.9f, 11.306f, 22.9f, 9.999f)
                curveTo(22.9f, 5.36f, 19.139f, 1.599f, 14.5f, 1.599f)
                curveTo(10.254f, 1.599f, 6.744f, 4.75f, 6.179f, 8.841f)
                close()
                moveTo(8.049f, 8.598f)
                curveTo(11.837f, 8.624f, 14.9f, 11.703f, 14.9f, 15.498f)
                curveTo(14.9f, 15.87f, 14.87f, 16.236f, 14.814f, 16.592f)
                curveTo(15.832f, 16.544f, 16.787f, 16.267f, 17.632f, 15.811f)
                curveTo(17.835f, 15.701f, 18.073f, 15.673f, 18.296f, 15.734f)
                lineTo(20.326f, 16.288f)
                curveTo(20.614f, 16.366f, 20.81f, 16.419f, 20.956f, 16.452f)
                curveTo(20.924f, 16.305f, 20.871f, 16.109f, 20.792f, 15.821f)
                lineTo(20.238f, 13.789f)
                curveTo(20.177f, 13.566f, 20.205f, 13.329f, 20.314f, 13.125f)
                curveTo(20.815f, 12.196f, 21.1f, 11.132f, 21.1f, 9.999f)
                curveTo(21.1f, 6.354f, 18.145f, 3.399f, 14.5f, 3.399f)
                curveTo(11.336f, 3.399f, 8.691f, 5.626f, 8.049f, 8.598f)
                close()
                moveTo(13.1f, 15.498f)
                curveTo(13.1f, 12.681f, 10.817f, 10.398f, 8.0f, 10.398f)
                curveTo(5.183f, 10.398f, 2.9f, 12.681f, 2.9f, 15.498f)
                curveTo(2.9f, 16.279f, 3.075f, 17.017f, 3.387f, 17.676f)
                curveTo(3.479f, 17.87f, 3.498f, 18.091f, 3.442f, 18.298f)
                lineTo(2.783f, 20.715f)
                lineTo(5.2f, 20.056f)
                curveTo(5.407f, 19.999f, 5.627f, 20.019f, 5.822f, 20.111f)
                curveTo(6.481f, 20.423f, 7.219f, 20.598f, 8.0f, 20.598f)
                curveTo(10.817f, 20.598f, 13.1f, 18.314f, 13.1f, 15.498f)
                close()
            }
        }
        .build()
        return _chat!!
    }

private var _chat: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Chat, contentDescription = "")
    }
}
