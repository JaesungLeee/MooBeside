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

public val MooBesideIconPack.Medal: ImageVector
    get() {
        if (_medal != null) {
            return _medal!!
        }
        _medal = Builder(name = "Medal", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 2.1f)
                curveTo(7.637f, 2.1f, 4.1f, 5.637f, 4.1f, 10.0f)
                curveTo(4.1f, 12.275f, 5.061f, 14.325f, 6.6f, 15.766f)
                verticalLineTo(19.575f)
                curveTo(6.6f, 19.953f, 6.6f, 20.296f, 6.625f, 20.574f)
                curveTo(6.652f, 20.863f, 6.713f, 21.212f, 6.928f, 21.529f)
                curveTo(7.215f, 21.951f, 7.66f, 22.24f, 8.163f, 22.331f)
                curveTo(8.539f, 22.399f, 8.884f, 22.313f, 9.158f, 22.22f)
                curveTo(9.422f, 22.131f, 9.736f, 21.991f, 10.081f, 21.838f)
                lineTo(11.066f, 21.4f)
                curveTo(11.587f, 21.169f, 11.706f, 21.123f, 11.817f, 21.104f)
                curveTo(11.938f, 21.083f, 12.062f, 21.083f, 12.183f, 21.104f)
                curveTo(12.294f, 21.123f, 12.413f, 21.169f, 12.934f, 21.4f)
                lineTo(13.919f, 21.838f)
                curveTo(14.264f, 21.991f, 14.578f, 22.13f, 14.842f, 22.22f)
                curveTo(15.116f, 22.313f, 15.461f, 22.399f, 15.837f, 22.331f)
                curveTo(16.34f, 22.24f, 16.785f, 21.951f, 17.072f, 21.529f)
                curveTo(17.287f, 21.212f, 17.348f, 20.863f, 17.375f, 20.574f)
                curveTo(17.4f, 20.296f, 17.4f, 19.953f, 17.4f, 19.575f)
                lineTo(17.4f, 15.766f)
                curveTo(18.939f, 14.325f, 19.9f, 12.275f, 19.9f, 10.0f)
                curveTo(19.9f, 5.637f, 16.363f, 2.1f, 12.0f, 2.1f)
                close()
                moveTo(5.9f, 10.0f)
                curveTo(5.9f, 6.631f, 8.631f, 3.9f, 12.0f, 3.9f)
                curveTo(15.369f, 3.9f, 18.1f, 6.631f, 18.1f, 10.0f)
                curveTo(18.1f, 13.369f, 15.369f, 16.1f, 12.0f, 16.1f)
                curveTo(8.631f, 16.1f, 5.9f, 13.369f, 5.9f, 10.0f)
                close()
                moveTo(15.6f, 17.034f)
                curveTo(14.52f, 17.588f, 13.297f, 17.9f, 12.0f, 17.9f)
                curveTo(10.703f, 17.9f, 9.48f, 17.588f, 8.4f, 17.034f)
                verticalLineTo(20.461f)
                curveTo(8.4f, 20.533f, 8.474f, 20.582f, 8.541f, 20.552f)
                lineTo(10.822f, 19.538f)
                curveTo(11.572f, 19.205f, 12.428f, 19.205f, 13.178f, 19.538f)
                lineTo(15.459f, 20.552f)
                curveTo(15.526f, 20.582f, 15.6f, 20.533f, 15.6f, 20.461f)
                verticalLineTo(17.034f)
                close()
            }
        }
        .build()
        return _medal!!
    }

private var _medal: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Medal, contentDescription = "")
    }
}
