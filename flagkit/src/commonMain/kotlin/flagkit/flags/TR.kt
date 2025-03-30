package flagkit.flags

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import flagkit.FlagKit

val FlagKit.TR: ImageVector
    get() {
        if (_TR != null) {
            return _TR!!
        }
        _TR = ImageVector.Builder(
            name = "TR",
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
                        0f to Color(0xFFE92434),
                        1f to Color(0xFFE11324)
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
                        0f to Color(0xFFFFFFFF),
                        1f to Color(0xFFF0F0F0)
                    ),
                    start = Offset(10.371f, 3f),
                    end = Offset(10.371f, 12f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13.052f, 4.737f)
                curveTo(12.417f, 4.275f, 11.618f, 4f, 10.75f, 4f)
                curveTo(8.679f, 4f, 7f, 5.567f, 7f, 7.5f)
                curveTo(7f, 9.433f, 8.679f, 11f, 10.75f, 11f)
                curveTo(11.618f, 11f, 12.417f, 10.725f, 13.052f, 10.263f)
                curveTo(12.229f, 11.32f, 10.944f, 12f, 9.5f, 12f)
                curveTo(7.015f, 12f, 5f, 9.985f, 5f, 7.5f)
                curveTo(5f, 5.015f, 7.015f, 3f, 9.5f, 3f)
                curveTo(10.944f, 3f, 12.229f, 3.68f, 13.052f, 4.737f)
                close()
                moveTo(14.266f, 8.076f)
                lineTo(13.347f, 9.19f)
                lineTo(13.41f, 7.748f)
                lineTo(12.067f, 7.218f)
                lineTo(13.458f, 6.832f)
                lineTo(13.546f, 5.391f)
                lineTo(14.343f, 6.595f)
                lineTo(15.741f, 6.234f)
                lineTo(14.843f, 7.364f)
                lineTo(15.618f, 8.581f)
                lineTo(14.266f, 8.076f)
                close()
            }
        }.build()

        return _TR!!
    }

@Suppress("ObjectPropertyName")
private var _TR: ImageVector? = null
