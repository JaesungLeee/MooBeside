package com.jslee.core.designsystem.foundation.icons.iconpack

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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

public val MooBesideIconPack.Tag: ImageVector
    get() {
        if (_tag != null) {
            return _tag!!
        }
        _tag = Builder(name = "Tag", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.25f, 8.999f)
                curveTo(16.94f, 8.999f, 17.5f, 8.439f, 17.5f, 7.749f)
                curveTo(17.5f, 7.059f, 16.94f, 6.499f, 16.25f, 6.499f)
                curveTo(15.559f, 6.499f, 15.0f, 7.059f, 15.0f, 7.749f)
                curveTo(15.0f, 8.439f, 15.559f, 8.999f, 16.25f, 8.999f)
                close()
            }
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(14.642f, 1.846f)
                curveTo(14.001f, 1.846f, 13.533f, 1.846f, 13.082f, 1.954f)
                curveTo(12.684f, 2.05f, 12.304f, 2.207f, 11.955f, 2.421f)
                curveTo(11.559f, 2.663f, 11.229f, 2.994f, 10.775f, 3.448f)
                lineTo(4.981f, 9.242f)
                curveTo(4.41f, 9.814f, 3.942f, 10.281f, 3.594f, 10.692f)
                curveTo(3.233f, 11.117f, 2.946f, 11.541f, 2.783f, 12.041f)
                curveTo(2.529f, 12.824f, 2.529f, 13.668f, 2.783f, 14.451f)
                curveTo(2.946f, 14.952f, 3.233f, 15.375f, 3.594f, 15.801f)
                curveTo(3.942f, 16.211f, 4.41f, 16.679f, 4.981f, 17.25f)
                lineTo(6.746f, 19.015f)
                curveTo(7.317f, 19.587f, 7.785f, 20.054f, 8.196f, 20.403f)
                curveTo(8.621f, 20.764f, 9.044f, 21.05f, 9.545f, 21.213f)
                curveTo(10.328f, 21.467f, 11.172f, 21.467f, 11.955f, 21.213f)
                curveTo(12.455f, 21.05f, 12.879f, 20.764f, 13.304f, 20.403f)
                curveTo(13.715f, 20.054f, 14.182f, 19.587f, 14.754f, 19.015f)
                lineTo(20.548f, 13.221f)
                curveTo(21.002f, 12.768f, 21.333f, 12.437f, 21.575f, 12.041f)
                curveTo(21.789f, 11.692f, 21.947f, 11.312f, 22.042f, 10.914f)
                curveTo(22.15f, 10.463f, 22.15f, 9.995f, 22.15f, 9.354f)
                verticalLineTo(7.639f)
                curveTo(22.15f, 6.997f, 22.15f, 6.529f, 22.042f, 6.078f)
                curveTo(21.947f, 5.681f, 21.789f, 5.3f, 21.575f, 4.951f)
                curveTo(21.333f, 4.556f, 21.002f, 4.225f, 20.548f, 3.772f)
                lineTo(20.225f, 3.448f)
                curveTo(19.772f, 2.995f, 19.441f, 2.663f, 19.045f, 2.421f)
                curveTo(18.696f, 2.207f, 18.316f, 2.05f, 17.918f, 1.954f)
                curveTo(17.467f, 1.846f, 16.999f, 1.846f, 16.358f, 1.846f)
                horizontalLineTo(14.642f)
                close()
                moveTo(13.502f, 3.704f)
                curveTo(13.72f, 3.652f, 13.962f, 3.646f, 14.738f, 3.646f)
                horizontalLineTo(16.262f)
                curveTo(17.038f, 3.646f, 17.28f, 3.652f, 17.498f, 3.704f)
                curveTo(17.712f, 3.756f, 17.917f, 3.841f, 18.105f, 3.956f)
                curveTo(18.296f, 4.073f, 18.471f, 4.239f, 19.02f, 4.789f)
                lineTo(19.208f, 4.977f)
                curveTo(19.757f, 5.526f, 19.924f, 5.701f, 20.041f, 5.892f)
                curveTo(20.156f, 6.079f, 20.24f, 6.284f, 20.292f, 6.499f)
                curveTo(20.344f, 6.716f, 20.35f, 6.958f, 20.35f, 7.734f)
                verticalLineTo(9.258f)
                curveTo(20.35f, 10.035f, 20.344f, 10.276f, 20.292f, 10.494f)
                curveTo(20.24f, 10.708f, 20.156f, 10.913f, 20.04f, 11.101f)
                curveTo(19.924f, 11.292f, 19.757f, 11.467f, 19.208f, 12.016f)
                lineTo(13.508f, 17.716f)
                curveTo(12.903f, 18.32f, 12.488f, 18.735f, 12.139f, 19.03f)
                curveTo(11.799f, 19.319f, 11.583f, 19.441f, 11.399f, 19.501f)
                curveTo(10.977f, 19.638f, 10.523f, 19.638f, 10.101f, 19.501f)
                curveTo(9.916f, 19.441f, 9.7f, 19.319f, 9.36f, 19.03f)
                curveTo(9.012f, 18.735f, 8.597f, 18.32f, 7.992f, 17.716f)
                lineTo(6.28f, 16.004f)
                curveTo(5.676f, 15.399f, 5.261f, 14.984f, 4.966f, 14.636f)
                curveTo(4.677f, 14.296f, 4.555f, 14.08f, 4.495f, 13.895f)
                curveTo(4.358f, 13.473f, 4.358f, 13.019f, 4.495f, 12.597f)
                curveTo(4.555f, 12.413f, 4.677f, 12.197f, 4.966f, 11.857f)
                curveTo(5.261f, 11.509f, 5.676f, 11.093f, 6.28f, 10.488f)
                lineTo(11.98f, 4.789f)
                curveTo(12.53f, 4.239f, 12.705f, 4.073f, 12.895f, 3.956f)
                curveTo(13.083f, 3.841f, 13.288f, 3.756f, 13.502f, 3.704f)
                close()
            }
        }
        .build()
        return _tag!!
    }

private var _tag: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Tag, contentDescription = "")
    }
}
