package flagkit.flags

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import flagkit.FlagKit

val FlagKit.EG: ImageVector
    get() {
        if (_EG != null) {
            return _EG!!
        }
        _EG = ImageVector.Builder(
            name = "EG",
            defaultWidth = 21.dp,
            defaultHeight = 15.dp,
            viewportWidth = 21f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFFFFF),
                        1f to Color(0xFFF0F0F0)
                    ),
                    start = Offset(10.5f, 0f),
                    end = Offset(10.5f, 15f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(21f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(-21f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFE41D33),
                        1f to Color(0xFFCE1126)
                    ),
                    start = Offset(10.5f, 0f),
                    end = Offset(10.5f, 5f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(21f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-21f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF262626),
                        1f to Color(0xFF0D0D0D)
                    ),
                    start = Offset(10.5f, 10f),
                    end = Offset(10.5f, 15f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 10f)
                horizontalLineToRelative(21f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-21f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFFFFF),
                        1f to Color(0xFFF0F0F0)
                    ),
                    start = Offset(10.5f, 5f),
                    end = Offset(10.5f, 10f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 5f)
                horizontalLineToRelative(21f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-21f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF4B32E)),
                fillAlpha = 0.25f,
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8f, 6.495f)
                curveTo(8f, 6.222f, 8.232f, 6f, 8.5f, 6f)
                lineTo(8.748f, 6f)
                curveTo(8.887f, 6f, 9.046f, 6.092f, 9.116f, 6.232f)
                lineTo(9.5f, 7f)
                curveTo(9.5f, 7f, 10.049f, 6f, 10.5f, 6f)
                curveTo(11f, 6f, 11.5f, 7f, 11.5f, 7f)
                lineTo(11.884f, 6.232f)
                curveTo(11.948f, 6.104f, 12.107f, 6f, 12.252f, 6f)
                lineTo(12.5f, 6f)
                curveTo(12.776f, 6f, 13f, 6.216f, 13f, 6.495f)
                lineTo(13f, 8.505f)
                curveTo(13f, 8.778f, 12.816f, 8.877f, 12.59f, 8.727f)
                lineTo(11.5f, 8f)
                lineTo(11f, 8f)
                lineTo(11f, 8.5f)
                curveTo(11f, 8.776f, 10.768f, 9f, 10.5f, 9f)
                lineTo(10.5f, 9f)
                curveTo(10.224f, 9f, 10f, 8.768f, 10f, 8.5f)
                lineTo(10f, 8f)
                lineTo(9.5f, 8f)
                lineTo(8.41f, 8.727f)
                curveTo(8.184f, 8.878f, 8f, 8.784f, 8f, 8.505f)
                lineTo(8f, 6.495f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFC6A846)),
                strokeLineWidth = 1f
            ) {
                moveTo(12.5f, 8.066f)
                lineTo(12.5f, 6.5f)
                lineTo(12.309f, 6.5f)
                lineTo(11.77f, 7.579f)
                lineTo(12.5f, 8.066f)
                close()
                moveTo(8.691f, 6.5f)
                lineTo(8.501f, 6.5f)
                curveTo(8.5f, 6.499f, 8.5f, 6.498f, 8.5f, 6.495f)
                lineTo(8.5f, 8.066f)
                lineTo(9.23f, 7.579f)
                lineTo(8.691f, 6.5f)
                close()
                moveTo(10.5f, 7.5f)
                lineTo(10.5f, 8.5f)
                lineTo(10.5f, 7.5f)
                lineTo(11.191f, 7.5f)
                lineTo(11.053f, 7.224f)
                curveTo(11.003f, 7.123f, 10.907f, 6.959f, 10.788f, 6.8f)
                curveTo(10.667f, 6.639f, 10.556f, 6.539f, 10.516f, 6.51f)
                curveTo(10.443f, 6.556f, 10.338f, 6.662f, 10.226f, 6.806f)
                curveTo(10.1f, 6.969f, 9.995f, 7.137f, 9.938f, 7.241f)
                lineTo(9.796f, 7.5f)
                lineTo(10.5f, 7.5f)
                close()
                moveTo(11.374f, 6.776f)
                curveTo(11.453f, 6.906f, 11.5f, 7f, 11.5f, 7f)
                lineTo(11.612f, 6.776f)
                curveTo(11.612f, 6.776f, 11.843f, 6.581f, 11.769f, 6.463f)
                lineTo(11.884f, 6.232f)
                curveTo(11.948f, 6.104f, 12.107f, 6f, 12.252f, 6f)
                lineTo(12.5f, 6f)
                curveTo(12.776f, 6f, 13f, 6.216f, 13f, 6.495f)
                lineTo(13f, 8.505f)
                curveTo(13f, 8.778f, 12.816f, 8.877f, 12.59f, 8.727f)
                lineTo(11.5f, 8f)
                lineTo(11f, 8f)
                lineTo(11f, 8.5f)
                curveTo(11f, 8.776f, 10.768f, 9f, 10.5f, 9f)
                curveTo(10.224f, 9f, 10f, 8.768f, 10f, 8.5f)
                lineTo(10f, 8f)
                lineTo(9.5f, 8f)
                lineTo(8.41f, 8.727f)
                curveTo(8.184f, 8.878f, 8f, 8.784f, 8f, 8.505f)
                lineTo(8f, 6.495f)
                curveTo(8f, 6.222f, 8.232f, 6f, 8.5f, 6f)
                lineTo(8.748f, 6f)
                curveTo(8.887f, 6f, 9.046f, 6.092f, 9.116f, 6.232f)
                lineTo(9.236f, 6.472f)
                curveTo(9.165f, 6.58f, 9.383f, 6.765f, 9.383f, 6.765f)
                lineTo(9.5f, 7f)
                curveTo(9.5f, 7f, 9.553f, 6.903f, 9.64f, 6.77f)
                lineTo(9.818f, 6.517f)
                curveTo(10.013f, 6.262f, 10.269f, 6f, 10.5f, 6f)
                curveTo(10.751f, 6f, 11.002f, 6.252f, 11.19f, 6.503f)
                lineTo(11.374f, 6.776f)
                close()
            }
        }.build()

        return _EG!!
    }

@Suppress("ObjectPropertyName")
private var _EG: ImageVector? = null
