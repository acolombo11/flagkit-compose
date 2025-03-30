package flagkit.flags

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import flagkit.FlagKit

val FlagKit.AE: ImageVector
    get() {
        if (_AE != null) {
            return _AE!!
        }
        _AE = ImageVector.Builder(
            name = "AE",
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
                        0f to Color(0xFF12833B),
                        1f to Color(0xFF0D7332)
                    ),
                    start = Offset(13.5f, 0f),
                    end = Offset(13.5f, 5f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6f, 0f)
                horizontalLineToRelative(15f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-15f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF262626),
                        1f to Color(0xFF0D0D0D)
                    ),
                    start = Offset(13.5f, 10f),
                    end = Offset(13.5f, 15f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6f, 10f)
                horizontalLineToRelative(15f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-15f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFFFFF),
                        1f to Color(0xFFF0F0F0)
                    ),
                    start = Offset(13.5f, 5f),
                    end = Offset(13.5f, 10f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6f, 5f)
                horizontalLineToRelative(15f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-15f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFF323E),
                        1f to Color(0xFFFD0D1B)
                    ),
                    start = Offset(3f, 0f),
                    end = Offset(3f, 15f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(-6f)
                close()
            }
        }.build()

        return _AE!!
    }

@Suppress("ObjectPropertyName")
private var _AE: ImageVector? = null
