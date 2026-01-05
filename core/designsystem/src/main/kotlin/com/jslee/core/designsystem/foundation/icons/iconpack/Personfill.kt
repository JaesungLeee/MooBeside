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

public val MooBesideIconPack.Personfill: ImageVector
    get() {
        if (_personfill != null) {
            return _personfill!!
        }
        _personfill = Builder(name = "Personfill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.6f, 7.253f)
                curveTo(7.6f, 4.823f, 9.57f, 2.853f, 12.0f, 2.853f)
                curveTo(14.43f, 2.853f, 16.4f, 4.823f, 16.4f, 7.253f)
                curveTo(16.4f, 9.683f, 14.43f, 11.653f, 12.0f, 11.653f)
                curveTo(9.57f, 11.653f, 7.6f, 9.683f, 7.6f, 7.253f)
                close()
            }
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 13.599f)
                curveTo(9.688f, 13.599f, 7.531f, 14.052f, 5.916f, 14.921f)
                curveTo(4.303f, 15.79f, 3.1f, 17.165f, 3.1f, 18.999f)
                lineTo(3.1f, 19.327f)
                curveTo(3.1f, 19.514f, 3.1f, 19.704f, 3.113f, 19.866f)
                curveTo(3.128f, 20.047f, 3.164f, 20.271f, 3.28f, 20.499f)
                curveTo(3.438f, 20.81f, 3.69f, 21.062f, 4.001f, 21.22f)
                curveTo(4.229f, 21.337f, 4.453f, 21.372f, 4.634f, 21.387f)
                curveTo(4.797f, 21.4f, 4.987f, 21.4f, 5.173f, 21.4f)
                lineTo(18.827f, 21.399f)
                curveTo(19.014f, 21.399f, 19.204f, 21.399f, 19.366f, 21.386f)
                curveTo(19.547f, 21.371f, 19.771f, 21.336f, 19.999f, 21.219f)
                curveTo(20.309f, 21.061f, 20.562f, 20.809f, 20.72f, 20.498f)
                curveTo(20.836f, 20.27f, 20.872f, 20.046f, 20.887f, 19.865f)
                curveTo(20.9f, 19.703f, 20.9f, 19.513f, 20.9f, 19.326f)
                lineTo(20.9f, 18.999f)
                curveTo(20.9f, 17.165f, 19.697f, 15.79f, 18.084f, 14.921f)
                curveTo(16.469f, 14.052f, 14.312f, 13.599f, 12.0f, 13.599f)
                close()
            }
        }
        .build()
        return _personfill!!
    }

private var _personfill: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Personfill, contentDescription = "")
    }
}
