package flagkit.flags

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import flagkit.FlagKit

val FlagKit.PA: ImageVector
    get() {
        if (_PA != null) {
            return _PA!!
        }
        _PA = ImageVector.Builder(
            name = "PA",
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
                        0f to Color(0xFFE52448),
                        1f to Color(0xFFD01739)
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
                        0f to Color(0xFF1367AE),
                        1f to Color(0xFF0A5492)
                    ),
                    start = Offset(10.5f, 7f),
                    end = Offset(10.5f, 15f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 7f)
                horizontalLineToRelative(21f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-21f)
                close()
            }
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
                moveTo(0f, 7f)
                lineTo(0f, 0f)
                lineTo(10f, 0f)
                lineTo(10f, 7f)
                lineTo(0f, 7f)
                close()
                moveTo(10f, 15f)
                lineTo(10f, 7f)
                lineTo(21f, 7f)
                lineTo(21f, 15f)
                lineTo(10f, 15f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF1367AE),
                        1f to Color(0xFF0A5492)
                    ),
                    start = Offset(5f, 1.5f),
                    end = Offset(5f, 5.118f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5f, 4.32f)
                lineToRelative(-1.176f, 0.798f)
                lineToRelative(0.396f, -1.365f)
                lineToRelative(-1.122f, -0.871f)
                lineToRelative(1.42f, -0.045f)
                lineToRelative(0.482f, -1.337f)
                lineToRelative(0.482f, 1.337f)
                lineToRelative(1.42f, 0.045f)
                lineToRelative(-1.122f, 0.871f)
                lineToRelative(0.396f, 1.365f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFE52448),
                        1f to Color(0xFFD01739)
                    ),
                    start = Offset(15.5f, 9f),
                    end = Offset(15.5f, 12.618f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(15.5f, 11.82f)
                lineToRelative(-1.176f, 0.798f)
                lineToRelative(0.396f, -1.365f)
                lineToRelative(-1.122f, -0.871f)
                lineToRelative(1.42f, -0.045f)
                lineToRelative(0.482f, -1.337f)
                lineToRelative(0.482f, 1.337f)
                lineToRelative(1.42f, 0.045f)
                lineToRelative(-1.122f, 0.871f)
                lineToRelative(0.396f, 1.365f)
                close()
            }
        }.build()

        return _PA!!
    }

@Suppress("ObjectPropertyName")
private var _PA: ImageVector? = null
