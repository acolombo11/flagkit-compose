package flagkit.flags

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import flagkit.FlagKit

val FlagKit.CU: ImageVector
    get() {
        if (_CU != null) {
            return _CU!!
        }
        _CU = ImageVector.Builder(
            name = "CU",
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
                        0f to Color(0xFF0B389F),
                        1f to Color(0xFF052E8D)
                    ),
                    start = Offset(10.5f, 0f),
                    end = Offset(10.5f, 3f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(21f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-21f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF0B389F),
                        1f to Color(0xFF052E8D)
                    ),
                    start = Offset(10.5f, 6f),
                    end = Offset(10.5f, 9f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 6f)
                horizontalLineToRelative(21f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-21f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFFFFF),
                        1f to Color(0xFFF0F0F0)
                    ),
                    start = Offset(10.5f, 3f),
                    end = Offset(10.5f, 6f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 3f)
                horizontalLineToRelative(21f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-21f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF0B389F),
                        1f to Color(0xFF052E8D)
                    ),
                    start = Offset(10.5f, 12f),
                    end = Offset(10.5f, 15f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 12f)
                horizontalLineToRelative(21f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-21f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFFFFF),
                        1f to Color(0xFFF0F0F0)
                    ),
                    start = Offset(10.5f, 9f),
                    end = Offset(10.5f, 12f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 9f)
                horizontalLineToRelative(21f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-21f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFE12A43),
                        1f to Color(0xFFCD1931)
                    ),
                    start = Offset(5f, 0f),
                    end = Offset(5f, 15f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                lineToRelative(10f, 7.5f)
                lineToRelative(-10f, 7.5f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFFFFF),
                        1f to Color(0xFFF0F0F0)
                    ),
                    start = Offset(3.499f, 5.501f),
                    end = Offset(3.499f, 9.118f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3.5f, 8.267f)
                lineToRelative(-1.176f, 0.851f)
                lineToRelative(0.446f, -1.381f)
                lineToRelative(-1.173f, -0.855f)
                lineToRelative(1.451f, -0.002f)
                lineToRelative(0.451f, -1.379f)
                lineToRelative(0.451f, 1.379f)
                lineToRelative(1.451f, 0.002f)
                lineToRelative(-1.173f, 0.855f)
                lineToRelative(0.446f, 1.381f)
                close()
            }
        }.build()

        return _CU!!
    }

@Suppress("ObjectPropertyName")
private var _CU: ImageVector? = null
