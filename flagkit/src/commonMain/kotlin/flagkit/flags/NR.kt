package flagkit.flags

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import flagkit.FlagKit

val FlagKit.NR: ImageVector
    get() {
        if (_NR != null) {
            return _NR!!
        }
        _NR = ImageVector.Builder(
            name = "NR",
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
                        0f to Color(0xFF0744A7),
                        1f to Color(0xFF00307D)
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
                        0f to Color(0xFFFCC747),
                        1f to Color(0xFFFEC539)
                    ),
                    start = Offset(10.5f, 6f),
                    end = Offset(10.5f, 8f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 6f)
                horizontalLineToRelative(21f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-21f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFFFFF),
                        1f to Color(0xFFF0F0F0)
                    ),
                    start = Offset(5.5f, 8.624f),
                    end = Offset(5.5f, 13.378f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5.5f, 12.25f)
                lineToRelative(-0.773f, 1.128f)
                lineToRelative(0.038f, -1.366f)
                lineToRelative(-1.288f, 0.458f)
                lineToRelative(0.834f, -1.083f)
                lineToRelative(-1.311f, -0.386f)
                lineToRelative(1.311f, -0.386f)
                lineToRelative(-0.834f, -1.083f)
                lineToRelative(1.288f, 0.458f)
                lineToRelative(-0.038f, -1.366f)
                lineToRelative(0.773f, 1.128f)
                lineToRelative(0.773f, -1.128f)
                lineToRelative(-0.038f, 1.366f)
                lineToRelative(1.288f, -0.458f)
                lineToRelative(-0.834f, 1.083f)
                lineToRelative(1.311f, 0.386f)
                lineToRelative(-1.311f, 0.386f)
                lineToRelative(0.834f, 1.083f)
                lineToRelative(-1.288f, -0.458f)
                lineToRelative(0.038f, 1.366f)
                close()
            }
        }.build()

        return _NR!!
    }

@Suppress("ObjectPropertyName")
private var _NR: ImageVector? = null
