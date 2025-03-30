package flagkit.flags

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import flagkit.FlagKit

val FlagKit.WS: ImageVector
    get() {
        if (_WS != null) {
            return _WS!!
        }
        _WS = ImageVector.Builder(
            name = "WS",
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
                        0f to Color(0xFFE31F37),
                        1f to Color(0xFFCC162C)
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
                        0f to Color(0xFF083B9A),
                        1f to Color(0xFF042E7D)
                    ),
                    start = Offset(5.5f, 0f),
                    end = Offset(5.5f, 8f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 8f)
                lineToRelative(11f, 0f)
                lineToRelative(0f, -8f)
                lineToRelative(-11f, 0f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFFFFF),
                        1f to Color(0xFFF0F0F0)
                    ),
                    start = Offset(5.25f, 0.793f),
                    end = Offset(5.25f, 7.207f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5f, 7f)
                lineTo(4.293f, 7.207f)
                lineTo(4.5f, 6.5f)
                lineTo(4.293f, 5.793f)
                lineTo(5f, 6f)
                lineTo(5.707f, 5.793f)
                lineTo(5.5f, 6.5f)
                lineTo(5.707f, 7.207f)
                lineTo(5f, 7f)
                close()
                moveTo(5f, 2f)
                lineTo(4.293f, 2.207f)
                lineTo(4.5f, 1.5f)
                lineTo(4.293f, 0.793f)
                lineTo(5f, 1f)
                lineTo(5.707f, 0.793f)
                lineTo(5.5f, 1.5f)
                lineTo(5.707f, 2.207f)
                lineTo(5f, 2f)
                close()
                moveTo(3f, 4.5f)
                lineTo(2.293f, 4.707f)
                lineTo(2.5f, 4f)
                lineTo(2.293f, 3.293f)
                lineTo(3f, 3.5f)
                lineTo(3.707f, 3.293f)
                lineTo(3.5f, 4f)
                lineTo(3.707f, 4.707f)
                lineTo(3f, 4.5f)
                close()
                moveTo(7.5f, 4f)
                lineTo(6.793f, 4.207f)
                lineTo(7f, 3.5f)
                lineTo(6.793f, 2.793f)
                lineTo(7.5f, 3f)
                lineTo(8.207f, 2.793f)
                lineTo(8f, 3.5f)
                lineTo(8.207f, 4.207f)
                lineTo(7.5f, 4f)
                close()
                moveTo(6.25f, 5.5f)
                curveTo(6.112f, 5.5f, 6f, 5.388f, 6f, 5.25f)
                curveTo(6f, 5.112f, 6.112f, 5f, 6.25f, 5f)
                curveTo(6.388f, 5f, 6.5f, 5.112f, 6.5f, 5.25f)
                curveTo(6.5f, 5.388f, 6.388f, 5.5f, 6.25f, 5.5f)
                close()
            }
        }.build()

        return _WS!!
    }

@Suppress("ObjectPropertyName")
private var _WS: ImageVector? = null
