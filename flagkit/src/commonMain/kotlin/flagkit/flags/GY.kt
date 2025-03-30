package flagkit.flags

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import flagkit.FlagKit

val FlagKit.GY: ImageVector
    get() {
        if (_GY != null) {
            return _GY!!
        }
        _GY = ImageVector.Builder(
            name = "GY",
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
                        0f to Color(0xFF08C55F),
                        1f to Color(0xFF009F49)
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
                    start = Offset(10f, 0f),
                    end = Offset(10f, 15f)
                ),
                strokeLineWidth = 1f
            ) {
                moveTo(-1f, 15f)
                lineToRelative(0f, -15f)
                lineToRelative(1f, 0f)
                lineToRelative(21f, 7f)
                lineToRelative(0f, 1f)
                lineToRelative(-21f, 7f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFD831),
                        1f to Color(0xFFFDD117)
                    ),
                    start = Offset(9.669f, 1.054f),
                    end = Offset(9.669f, 13.946f)
                ),
                strokeLineWidth = 1f
            ) {
                moveTo(0f, 1.054f)
                lineToRelative(0f, 12.892f)
                lineToRelative(19.338f, -6.446f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF262626),
                        1f to Color(0xFF0D0D0D)
                    ),
                    start = Offset(5.25f, 0f),
                    end = Offset(5.25f, 15f)
                ),
                strokeLineWidth = 1f
            ) {
                moveTo(-1f, 15f)
                lineToRelative(0f, -15f)
                lineToRelative(1f, 0f)
                lineToRelative(11.5f, 7.5f)
                lineToRelative(-11.5f, 7.5f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFE92034),
                        1f to Color(0xFFCE1225)
                    ),
                    start = Offset(4.834f, 1.194f),
                    end = Offset(4.834f, 13.806f)
                ),
                strokeLineWidth = 1f
            ) {
                moveTo(0f, 13.806f)
                lineToRelative(9.669f, -6.306f)
                lineToRelative(-9.669f, -6.306f)
                close()
            }
        }.build()

        return _GY!!
    }

@Suppress("ObjectPropertyName")
private var _GY: ImageVector? = null
