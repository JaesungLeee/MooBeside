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

public val MooBesideIconPack.Mobile: ImageVector
    get() {
        if (_mobile != null) {
            return _mobile!!
        }
        _mobile = Builder(name = "Mobile", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 17.326f)
                curveTo(9.627f, 17.326f, 9.325f, 17.628f, 9.325f, 18.0f)
                curveTo(9.325f, 18.373f, 9.627f, 18.676f, 10.0f, 18.676f)
                horizontalLineTo(14.0f)
                curveTo(14.373f, 18.676f, 14.675f, 18.373f, 14.675f, 18.0f)
                curveTo(14.675f, 17.628f, 14.373f, 17.326f, 14.0f, 17.326f)
                horizontalLineTo(10.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(9.415f, 2.1f)
                curveTo(8.885f, 2.1f, 8.433f, 2.1f, 8.063f, 2.13f)
                curveTo(7.674f, 2.162f, 7.295f, 2.231f, 6.933f, 2.416f)
                curveTo(6.388f, 2.694f, 5.944f, 3.137f, 5.666f, 3.683f)
                curveTo(5.482f, 4.045f, 5.412f, 4.424f, 5.38f, 4.813f)
                curveTo(5.35f, 5.183f, 5.35f, 5.634f, 5.35f, 6.164f)
                verticalLineTo(17.835f)
                curveTo(5.35f, 18.365f, 5.35f, 18.816f, 5.38f, 19.187f)
                curveTo(5.412f, 19.576f, 5.482f, 19.954f, 5.666f, 20.316f)
                curveTo(5.944f, 20.862f, 6.388f, 21.306f, 6.933f, 21.583f)
                curveTo(7.295f, 21.768f, 7.674f, 21.838f, 8.063f, 21.869f)
                curveTo(8.434f, 21.9f, 8.885f, 21.9f, 9.415f, 21.9f)
                horizontalLineTo(14.585f)
                curveTo(15.115f, 21.9f, 15.566f, 21.9f, 15.937f, 21.869f)
                curveTo(16.326f, 21.838f, 16.705f, 21.768f, 17.066f, 21.583f)
                curveTo(17.612f, 21.306f, 18.056f, 20.862f, 18.334f, 20.316f)
                curveTo(18.518f, 19.954f, 18.588f, 19.576f, 18.62f, 19.187f)
                curveTo(18.65f, 18.816f, 18.65f, 18.365f, 18.65f, 17.835f)
                verticalLineTo(6.164f)
                curveTo(18.65f, 5.634f, 18.65f, 5.183f, 18.62f, 4.813f)
                curveTo(18.588f, 4.424f, 18.518f, 4.045f, 18.334f, 3.683f)
                curveTo(18.056f, 3.137f, 17.612f, 2.694f, 17.066f, 2.416f)
                curveTo(16.705f, 2.231f, 16.326f, 2.162f, 15.937f, 2.13f)
                curveTo(15.566f, 2.1f, 15.115f, 2.1f, 14.585f, 2.1f)
                horizontalLineTo(9.415f)
                close()
                moveTo(7.91f, 3.954f)
                curveTo(8.042f, 3.912f, 8.235f, 3.901f, 9.05f, 3.901f)
                horizontalLineTo(14.95f)
                curveTo(15.764f, 3.901f, 15.958f, 3.912f, 16.09f, 3.954f)
                curveTo(16.425f, 4.063f, 16.687f, 4.326f, 16.796f, 4.661f)
                curveTo(16.839f, 4.792f, 16.85f, 4.986f, 16.85f, 5.801f)
                verticalLineTo(18.201f)
                curveTo(16.85f, 19.015f, 16.839f, 19.209f, 16.796f, 19.34f)
                curveTo(16.687f, 19.675f, 16.425f, 19.938f, 16.09f, 20.047f)
                curveTo(15.958f, 20.089f, 15.764f, 20.101f, 14.95f, 20.101f)
                horizontalLineTo(9.05f)
                curveTo(8.235f, 20.101f, 8.042f, 20.089f, 7.91f, 20.047f)
                curveTo(7.575f, 19.938f, 7.313f, 19.675f, 7.204f, 19.34f)
                curveTo(7.161f, 19.209f, 7.15f, 19.015f, 7.15f, 18.201f)
                verticalLineTo(5.801f)
                curveTo(7.15f, 4.986f, 7.161f, 4.792f, 7.204f, 4.661f)
                curveTo(7.313f, 4.326f, 7.575f, 4.063f, 7.91f, 3.954f)
                close()
            }
        }
        .build()
        return _mobile!!
    }

private var _mobile: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Mobile, contentDescription = "")
    }
}
