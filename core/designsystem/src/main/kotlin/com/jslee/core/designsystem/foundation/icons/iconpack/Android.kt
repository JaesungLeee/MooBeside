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

public val MooBesideIconPack.Android: ImageVector
    get() {
        if (_android != null) {
            return _android!!
        }
        _android = Builder(name = "Android", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0f, 18.0f)
                curveTo(1.15f, 16.217f, 1.696f, 14.575f, 2.637f, 13.075f)
                curveTo(3.579f, 11.575f, 4.833f, 10.384f, 6.4f, 9.5f)
                lineTo(4.55f, 6.3f)
                curveTo(4.45f, 6.15f, 4.425f, 5.992f, 4.475f, 5.825f)
                curveTo(4.525f, 5.659f, 4.633f, 5.534f, 4.8f, 5.45f)
                curveTo(4.933f, 5.367f, 5.083f, 5.35f, 5.25f, 5.4f)
                curveTo(5.417f, 5.45f, 5.55f, 5.55f, 5.65f, 5.7f)
                lineTo(7.5f, 8.9f)
                curveTo(8.933f, 8.3f, 10.433f, 8.0f, 12.0f, 8.0f)
                curveTo(13.567f, 8.0f, 15.067f, 8.3f, 16.5f, 8.9f)
                lineTo(18.35f, 5.7f)
                curveTo(18.45f, 5.55f, 18.583f, 5.45f, 18.75f, 5.4f)
                curveTo(18.917f, 5.35f, 19.067f, 5.367f, 19.2f, 5.45f)
                curveTo(19.367f, 5.534f, 19.475f, 5.659f, 19.525f, 5.825f)
                curveTo(19.575f, 5.992f, 19.55f, 6.15f, 19.45f, 6.3f)
                lineTo(17.6f, 9.5f)
                curveTo(19.167f, 10.384f, 20.421f, 11.575f, 21.362f, 13.075f)
                curveTo(22.304f, 14.575f, 22.85f, 16.217f, 23.0f, 18.0f)
                horizontalLineTo(1.0f)
                close()
                moveTo(7.0f, 15.25f)
                curveTo(7.35f, 15.25f, 7.646f, 15.129f, 7.887f, 14.888f)
                curveTo(8.129f, 14.646f, 8.25f, 14.35f, 8.25f, 14.0f)
                curveTo(8.25f, 13.65f, 8.129f, 13.354f, 7.887f, 13.113f)
                curveTo(7.646f, 12.871f, 7.35f, 12.75f, 7.0f, 12.75f)
                curveTo(6.65f, 12.75f, 6.354f, 12.871f, 6.112f, 13.113f)
                curveTo(5.871f, 13.354f, 5.75f, 13.65f, 5.75f, 14.0f)
                curveTo(5.75f, 14.35f, 5.871f, 14.646f, 6.112f, 14.888f)
                curveTo(6.354f, 15.129f, 6.65f, 15.25f, 7.0f, 15.25f)
                close()
                moveTo(17.0f, 15.25f)
                curveTo(17.35f, 15.25f, 17.646f, 15.129f, 17.887f, 14.888f)
                curveTo(18.129f, 14.646f, 18.25f, 14.35f, 18.25f, 14.0f)
                curveTo(18.25f, 13.65f, 18.129f, 13.354f, 17.887f, 13.113f)
                curveTo(17.646f, 12.871f, 17.35f, 12.75f, 17.0f, 12.75f)
                curveTo(16.65f, 12.75f, 16.354f, 12.871f, 16.112f, 13.113f)
                curveTo(15.871f, 13.354f, 15.75f, 13.65f, 15.75f, 14.0f)
                curveTo(15.75f, 14.35f, 15.871f, 14.646f, 16.112f, 14.888f)
                curveTo(16.354f, 15.129f, 16.65f, 15.25f, 17.0f, 15.25f)
                close()
            }
        }
        .build()
        return _android!!
    }

private var _android: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Android, contentDescription = "")
    }
}
