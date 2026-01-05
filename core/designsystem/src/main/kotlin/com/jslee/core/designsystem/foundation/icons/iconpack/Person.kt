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

public val MooBesideIconPack.Person: ImageVector
    get() {
        if (_person != null) {
            return _person!!
        }
        _person = Builder(name = "Person", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 2.601f)
                curveTo(9.294f, 2.601f, 7.1f, 4.795f, 7.1f, 7.501f)
                curveTo(7.1f, 10.207f, 9.294f, 12.401f, 12.0f, 12.401f)
                curveTo(14.706f, 12.401f, 16.9f, 10.207f, 16.9f, 7.501f)
                curveTo(16.9f, 4.795f, 14.706f, 2.601f, 12.0f, 2.601f)
                close()
                moveTo(8.9f, 7.501f)
                curveTo(8.9f, 5.789f, 10.288f, 4.401f, 12.0f, 4.401f)
                curveTo(13.712f, 4.401f, 15.1f, 5.789f, 15.1f, 7.501f)
                curveTo(15.1f, 9.213f, 13.712f, 10.601f, 12.0f, 10.601f)
                curveTo(10.288f, 10.601f, 8.9f, 9.213f, 8.9f, 7.501f)
                close()
            }
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 13.599f)
                curveTo(9.688f, 13.599f, 7.531f, 14.052f, 5.916f, 14.922f)
                curveTo(4.303f, 15.79f, 3.1f, 17.166f, 3.1f, 19.0f)
                lineTo(3.1f, 19.327f)
                curveTo(3.1f, 19.514f, 3.1f, 19.704f, 3.113f, 19.866f)
                curveTo(3.128f, 20.047f, 3.164f, 20.271f, 3.28f, 20.5f)
                curveTo(3.438f, 20.81f, 3.691f, 21.063f, 4.001f, 21.221f)
                curveTo(4.229f, 21.337f, 4.453f, 21.372f, 4.634f, 21.387f)
                curveTo(4.797f, 21.4f, 4.987f, 21.4f, 5.173f, 21.4f)
                lineTo(18.827f, 21.4f)
                curveTo(19.014f, 21.4f, 19.204f, 21.4f, 19.366f, 21.386f)
                curveTo(19.547f, 21.372f, 19.771f, 21.336f, 19.999f, 21.22f)
                curveTo(20.31f, 21.062f, 20.562f, 20.809f, 20.72f, 20.499f)
                curveTo(20.836f, 20.27f, 20.872f, 20.046f, 20.887f, 19.865f)
                curveTo(20.9f, 19.703f, 20.9f, 19.513f, 20.9f, 19.326f)
                lineTo(20.9f, 19.0f)
                curveTo(20.9f, 17.166f, 19.697f, 15.79f, 18.084f, 14.922f)
                curveTo(16.469f, 14.052f, 14.312f, 13.599f, 12.0f, 13.599f)
                close()
                moveTo(4.9f, 19.0f)
                curveTo(4.9f, 18.072f, 5.488f, 17.197f, 6.77f, 16.506f)
                curveTo(8.051f, 15.816f, 9.894f, 15.399f, 12.0f, 15.399f)
                curveTo(14.106f, 15.399f, 15.949f, 15.816f, 17.23f, 16.506f)
                curveTo(18.512f, 17.197f, 19.1f, 18.072f, 19.1f, 19.0f)
                lineTo(19.098f, 19.598f)
                lineTo(4.902f, 19.599f)
                lineTo(4.9f, 19.0f)
                close()
            }
        }
        .build()
        return _person!!
    }

private var _person: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Person, contentDescription = "")
    }
}
