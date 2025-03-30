package flagkit.flags

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import flagkit.FlagKit

val FlagKit.GG: ImageVector
    get() {
        if (_GG != null) {
            return _GG!!
        }
        _GG = ImageVector.Builder(
            name = "GG",
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
                        0f to Color(0xFFF33349),
                        1f to Color(0xFFE51D34)
                    ),
                    start = Offset(10.5f, 0f),
                    end = Offset(10.5f, 15f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9f, 6f)
                lineTo(0f, 6f)
                lineTo(0f, 9f)
                lineTo(9f, 9f)
                lineTo(9f, 15f)
                lineTo(12f, 15f)
                lineTo(12f, 9f)
                lineTo(21f, 9f)
                lineTo(21f, 6f)
                lineTo(12f, 6f)
                lineTo(12f, 0f)
                lineTo(9f, 0f)
                lineTo(9f, 6f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFCE24C),
                        1f to Color(0xFFF9DC38)
                    ),
                    start = Offset(10.5f, 2f),
                    end = Offset(10.5f, 13f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10f, 8f)
                lineTo(10f, 12f)
                lineTo(9.5f, 13f)
                lineTo(11.5f, 13f)
                lineTo(11f, 12f)
                lineTo(11f, 8f)
                lineTo(15f, 8f)
                lineTo(16f, 8.5f)
                lineTo(16f, 6.5f)
                lineTo(15f, 7f)
                lineTo(11f, 7f)
                lineTo(11f, 3f)
                lineTo(11.5f, 2f)
                lineTo(9.5f, 2f)
                lineTo(10f, 3f)
                lineTo(10f, 7f)
                lineTo(6f, 7f)
                lineTo(5f, 6.5f)
                lineTo(5f, 8.5f)
                lineTo(6f, 8f)
                lineTo(10f, 8f)
                close()
            }
        }.build()

        return _GG!!
    }

@Suppress("ObjectPropertyName")
private var _GG: ImageVector? = null
