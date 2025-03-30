package flagkit.flags

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import flagkit.FlagKit

val FlagKit.HN: ImageVector
    get() {
        if (_HN != null) {
            return _HN!!
        }
        _HN = ImageVector.Builder(
            name = "HN",
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
                        0f to Color(0xFF0884E6),
                        1f to Color(0xFF0074D0)
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
                        0f to Color(0xFF0884E6),
                        1f to Color(0xFF0074D0)
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
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF0E88E9),
                        1f to Color(0xFF0074D0)
                    ),
                    start = Offset(10.5f, 6.793f),
                    end = Offset(10.5f, 8.207f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.5f, 8f)
                lineToRelative(-0.707f, 0.207f)
                lineToRelative(0.207f, -0.707f)
                lineToRelative(-0.207f, -0.707f)
                lineToRelative(0.707f, 0.207f)
                lineToRelative(0.707f, -0.207f)
                lineToRelative(-0.207f, 0.707f)
                lineToRelative(0.207f, 0.707f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF0E88E9),
                        1f to Color(0xFF0074D0)
                    ),
                    start = Offset(14.5f, 5.793f),
                    end = Offset(14.5f, 7.207f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(14.5f, 7f)
                lineToRelative(-0.707f, 0.207f)
                lineToRelative(0.207f, -0.707f)
                lineToRelative(-0.207f, -0.707f)
                lineToRelative(0.707f, 0.207f)
                lineToRelative(0.707f, -0.207f)
                lineToRelative(-0.207f, 0.707f)
                lineToRelative(0.207f, 0.707f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF0E88E9),
                        1f to Color(0xFF0074D0)
                    ),
                    start = Offset(14.5f, 7.793f),
                    end = Offset(14.5f, 9.207f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(14.5f, 9f)
                lineToRelative(-0.707f, 0.207f)
                lineToRelative(0.207f, -0.707f)
                lineToRelative(-0.207f, -0.707f)
                lineToRelative(0.707f, 0.207f)
                lineToRelative(0.707f, -0.207f)
                lineToRelative(-0.207f, 0.707f)
                lineToRelative(0.207f, 0.707f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF0E88E9),
                        1f to Color(0xFF0074D0)
                    ),
                    start = Offset(6.5f, 7.793f),
                    end = Offset(6.5f, 9.207f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.5f, 9f)
                lineToRelative(-0.707f, 0.207f)
                lineToRelative(0.207f, -0.707f)
                lineToRelative(-0.207f, -0.707f)
                lineToRelative(0.707f, 0.207f)
                lineToRelative(0.707f, -0.207f)
                lineToRelative(-0.207f, 0.707f)
                lineToRelative(0.207f, 0.707f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF0E88E9),
                        1f to Color(0xFF0074D0)
                    ),
                    start = Offset(6.5f, 5.793f),
                    end = Offset(6.5f, 7.207f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.5f, 7f)
                lineToRelative(-0.707f, 0.207f)
                lineToRelative(0.207f, -0.707f)
                lineToRelative(-0.207f, -0.707f)
                lineToRelative(0.707f, 0.207f)
                lineToRelative(0.707f, -0.207f)
                lineToRelative(-0.207f, 0.707f)
                lineToRelative(0.207f, 0.707f)
                close()
            }
        }.build()

        return _HN!!
    }

@Suppress("ObjectPropertyName")
private var _HN: ImageVector? = null
