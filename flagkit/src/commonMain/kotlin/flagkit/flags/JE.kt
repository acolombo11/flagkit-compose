package flagkit.flags

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import flagkit.FlagKit

val FlagKit.JE: ImageVector
    get() {
        if (_JE != null) {
            return _JE!!
        }
        _JE = ImageVector.Builder(
            name = "JE",
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
                        0f to Color(0xFFEF273F),
                        1f to Color(0xFFDB1C33)
                    ),
                    start = Offset(10.5f, -1.44f),
                    end = Offset(10.5f, 16.435f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.5f, 6.291f)
                lineTo(-0.962f, -1.44f)
                lineTo(-2.08f, 0.218f)
                lineTo(8.712f, 7.497f)
                lineTo(-2.08f, 14.777f)
                lineTo(-0.962f, 16.435f)
                lineTo(10.5f, 8.704f)
                lineTo(21.962f, 16.435f)
                lineTo(23.08f, 14.777f)
                lineTo(12.289f, 7.497f)
                lineTo(23.08f, 0.218f)
                lineTo(21.962f, -1.44f)
                lineTo(10.5f, 6.291f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFF22A41),
                        1f to Color(0xFFE51D34)
                    ),
                    start = Offset(10.5f, 1.997f),
                    end = Offset(10.5f, 5.292f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9f, 2.502f)
                curveTo(9f, 2.223f, 9.216f, 1.997f, 9.496f, 1.997f)
                lineTo(11.505f, 1.997f)
                curveTo(11.778f, 1.997f, 12f, 2.211f, 12f, 2.502f)
                lineTo(12f, 3.493f)
                curveTo(12f, 3.771f, 11.84f, 4.158f, 11.652f, 4.345f)
                lineTo(10.848f, 5.149f)
                curveTo(10.656f, 5.342f, 10.34f, 5.337f, 10.152f, 5.149f)
                lineTo(9.348f, 4.345f)
                curveTo(9.156f, 4.153f, 9f, 3.783f, 9f, 3.493f)
                lineTo(9f, 2.502f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFADF46),
                        1f to Color(0xFFF9DC38)
                    ),
                    start = Offset(10.5f, 0.997f),
                    end = Offset(10.5f, 3.997f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.5f, 3.997f)
                curveTo(10.224f, 3.997f, 10f, 3.773f, 10f, 3.497f)
                curveTo(10f, 3.221f, 10.224f, 2.997f, 10.5f, 2.997f)
                curveTo(10.776f, 2.997f, 11f, 3.221f, 11f, 3.497f)
                curveTo(11f, 3.773f, 10.776f, 3.997f, 10.5f, 3.997f)
                close()
                moveTo(10.5f, 1.997f)
                curveTo(9.672f, 1.997f, 9f, 1.773f, 9f, 1.497f)
                curveTo(9f, 1.221f, 9.672f, 0.997f, 10.5f, 0.997f)
                curveTo(11.329f, 0.997f, 12f, 1.221f, 12f, 1.497f)
                curveTo(12f, 1.773f, 11.329f, 1.997f, 10.5f, 1.997f)
                close()
            }
        }.build()

        return _JE!!
    }

@Suppress("ObjectPropertyName")
private var _JE: ImageVector? = null
