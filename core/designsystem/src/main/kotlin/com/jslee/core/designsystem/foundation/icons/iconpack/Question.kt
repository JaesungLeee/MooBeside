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

public val MooBesideIconPack.Question: ImageVector
    get() {
        if (_question != null) {
            return _question!!
        }
        _question = Builder(name = "Question", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.924f, 15.521f)
                curveTo(11.34f, 15.521f, 10.859f, 15.044f, 10.923f, 14.464f)
                curveTo(11.408f, 10.061f, 14.93f, 10.371f, 14.93f, 7.725f)
                curveTo(14.93f, 6.152f, 13.685f, 5.142f, 11.924f, 5.142f)
                curveTo(10.417f, 5.142f, 9.394f, 5.867f, 9.048f, 7.148f)
                curveTo(8.896f, 7.712f, 8.445f, 8.195f, 7.862f, 8.195f)
                curveTo(7.278f, 8.195f, 6.793f, 7.718f, 6.888f, 7.142f)
                curveTo(7.291f, 4.696f, 9.135f, 3.169f, 11.924f, 3.169f)
                curveTo(14.859f, 3.169f, 17.043f, 4.86f, 17.043f, 7.725f)
                curveTo(17.043f, 11.289f, 13.647f, 11.073f, 13.065f, 14.467f)
                curveTo(12.967f, 15.042f, 12.508f, 15.521f, 11.924f, 15.521f)
                close()
            }
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.468f, 19.231f)
                curveTo(10.468f, 20.076f, 11.079f, 20.687f, 11.924f, 20.687f)
                curveTo(12.769f, 20.687f, 13.38f, 20.076f, 13.38f, 19.231f)
                curveTo(13.38f, 18.385f, 12.769f, 17.775f, 11.924f, 17.775f)
                curveTo(11.079f, 17.775f, 10.468f, 18.385f, 10.468f, 19.231f)
                close()
            }
        }
        .build()
        return _question!!
    }

private var _question: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Question, contentDescription = "")
    }
}
