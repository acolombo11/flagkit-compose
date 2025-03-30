package flagkit.flags

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import flagkit.FlagKit

val FlagKit.RW: ImageVector
    get() {
        if (_RW != null) {
            return _RW!!
        }
        _RW = ImageVector.Builder(
            name = "RW",
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
                        0f to Color(0xFF2D754D),
                        1f to Color(0xFF235F3E)
                    ),
                    start = Offset(10.5f, 11f),
                    end = Offset(10.5f, 15f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 11f)
                horizontalLineToRelative(21f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-21f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF25B1EB),
                        1f to Color(0xFF1AA3DC)
                    ),
                    start = Offset(10.5f, 0f),
                    end = Offset(10.5f, 7f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(21f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-21f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFAD546),
                        1f to Color(0xFFFAD12F)
                    ),
                    start = Offset(10.5f, 7f),
                    end = Offset(10.5f, 11f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 7f)
                horizontalLineToRelative(21f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-21f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFEDC738),
                        1f to Color(0xFFE5BE2A)
                    ),
                    start = Offset(16f, 1.652f),
                    end = Offset(16f, 5.348f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(16f, 4.5f)
                lineToRelative(-0.765f, 0.848f)
                lineToRelative(0.058f, -1.141f)
                lineToRelative(-1.141f, 0.058f)
                lineToRelative(0.848f, -0.765f)
                lineToRelative(-0.848f, -0.765f)
                lineToRelative(1.141f, 0.058f)
                lineToRelative(-0.058f, -1.141f)
                lineToRelative(0.765f, 0.848f)
                lineToRelative(0.765f, -0.848f)
                lineToRelative(-0.058f, 1.141f)
                lineToRelative(1.141f, -0.058f)
                lineToRelative(-0.848f, 0.765f)
                lineToRelative(0.848f, 0.765f)
                lineToRelative(-1.141f, -0.058f)
                lineToRelative(0.058f, 1.141f)
                close()
            }
        }.build()

        return _RW!!
    }

@Suppress("ObjectPropertyName")
private var _RW: ImageVector? = null
