package flagkit.flags

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import flagkit.FlagKit

val FlagKit.JO: ImageVector
    get() {
        if (_JO != null) {
            return _JO!!
        }
        _JO = ImageVector.Builder(
            name = "JO",
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
                        0f to Color(0xFF199E56),
                        1f to Color(0xFF0F7A40)
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
                        0f to Color(0xFF262626),
                        1f to Color(0xFF0D0D0D)
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
                        0f to Color(0xFFE6223A),
                        1f to Color(0xFFCC162C)
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
                    start = Offset(3.498f, 6f),
                    end = Offset(3.498f, 8.851f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3.5f, 8.25f)
                lineToRelative(-0.651f, 0.601f)
                lineToRelative(0.064f, -0.884f)
                lineToRelative(-0.876f, -0.134f)
                lineToRelative(0.731f, -0.501f)
                lineToRelative(-0.442f, -0.768f)
                lineToRelative(0.847f, 0.26f)
                lineToRelative(0.325f, -0.824f)
                lineToRelative(0.325f, 0.824f)
                lineToRelative(0.847f, -0.26f)
                lineToRelative(-0.442f, 0.768f)
                lineToRelative(0.731f, 0.501f)
                lineToRelative(-0.876f, 0.134f)
                lineToRelative(0.064f, 0.884f)
                close()
            }
        }.build()

        return _JO!!
    }

@Suppress("ObjectPropertyName")
private var _JO: ImageVector? = null
