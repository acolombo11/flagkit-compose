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

val FlagKit.TJ: ImageVector
    get() {
        if (_TJ != null) {
            return _TJ!!
        }
        _TJ = ImageVector.Builder(
            name = "TJ",
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
                        0f to Color(0xFFD9101C),
                        1f to Color(0xFFCA0814)
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
                        0f to Color(0xFF0F7811),
                        1f to Color(0xFF0A650C)
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
                fill = SolidColor(Color(0xFFFAD14E)),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.066f, 8f)
                curveTo(10.024f, 7.783f, 10f, 7.59f, 10f, 7.5f)
                curveTo(10f, 7.224f, 10.224f, 7f, 10.5f, 7f)
                curveTo(10.776f, 7f, 11f, 7.224f, 11f, 7.5f)
                curveTo(11f, 7.59f, 10.976f, 7.783f, 10.934f, 8f)
                lineTo(11.505f, 8f)
                curveTo(11.778f, 8f, 12f, 8.232f, 12f, 8.5f)
                curveTo(12f, 8.776f, 11.784f, 9f, 11.505f, 9f)
                lineTo(9.495f, 9f)
                curveTo(9.222f, 9f, 9f, 8.768f, 9f, 8.5f)
                curveTo(9f, 8.224f, 9.216f, 8f, 9.495f, 8f)
                lineTo(10.066f, 8f)
                lineTo(10.066f, 8f)
                close()
                moveTo(9.5f, 7f)
                curveTo(9.224f, 7f, 9f, 6.776f, 9f, 6.5f)
                curveTo(9f, 6.224f, 9.224f, 6f, 9.5f, 6f)
                curveTo(9.776f, 6f, 10f, 6.224f, 10f, 6.5f)
                curveTo(10f, 6.776f, 9.776f, 7f, 9.5f, 7f)
                close()
                moveTo(11.5f, 7f)
                curveTo(11.224f, 7f, 11f, 6.776f, 11f, 6.5f)
                curveTo(11f, 6.224f, 11.224f, 6f, 11.5f, 6f)
                curveTo(11.776f, 6f, 12f, 6.224f, 12f, 6.5f)
                curveTo(12f, 6.776f, 11.776f, 7f, 11.5f, 7f)
                close()
                moveTo(13.5f, 8f)
                curveTo(13.224f, 8f, 13f, 7.776f, 13f, 7.5f)
                curveTo(13f, 7.224f, 13.224f, 7f, 13.5f, 7f)
                curveTo(13.776f, 7f, 14f, 7.224f, 14f, 7.5f)
                curveTo(14f, 7.776f, 13.776f, 8f, 13.5f, 8f)
                close()
                moveTo(7.5f, 8f)
                curveTo(7.224f, 8f, 7f, 7.776f, 7f, 7.5f)
                curveTo(7f, 7.224f, 7.224f, 7f, 7.5f, 7f)
                curveTo(7.776f, 7f, 8f, 7.224f, 8f, 7.5f)
                curveTo(8f, 7.776f, 7.776f, 8f, 7.5f, 8f)
                close()
            }
        }.build()

        return _TJ!!
    }

@Suppress("ObjectPropertyName")
private var _TJ: ImageVector? = null
