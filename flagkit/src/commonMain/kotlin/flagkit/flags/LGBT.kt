package flagkit.flags

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import flagkit.FlagKit

val FlagKit.LGBT: ImageVector
    get() {
        if (_LGBT != null) {
            return _LGBT!!
        }
        _LGBT = ImageVector.Builder(
            name = "LGBT",
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
                        0f to Color(0xFFF71E24),
                        1f to Color(0xFFFB141B)
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
                        0f to Color(0xFFFB6C2C),
                        1f to Color(0xFFFC6420)
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
                        0f to Color(0xFFFDFC42),
                        1f to Color(0xFFFFFD38)
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
                        0f to Color(0xFF238F35),
                        1f to Color(0xFF1C7E2C)
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
                        0f to Color(0xFF0F62FA),
                        1f to Color(0xFF0059FC)
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
        }.build()

        return _LGBT!!
    }

@Suppress("ObjectPropertyName")
private var _LGBT: ImageVector? = null
