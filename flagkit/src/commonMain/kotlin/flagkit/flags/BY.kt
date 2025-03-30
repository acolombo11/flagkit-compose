package flagkit.flags

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import flagkit.FlagKit

val FlagKit.BY: ImageVector
    get() {
        if (_BY != null) {
            return _BY!!
        }
        _BY = ImageVector.Builder(
            name = "BY",
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
                        0f to Color(0xFFE54252),
                        1f to Color(0xFFC63442)
                    ),
                    start = Offset(10.5f, 0f),
                    end = Offset(10.5f, 10f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(21f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(-21f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF5CBE6B),
                        1f to Color(0xFF4EA55B)
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
                        0f to Color(0xFFFFFFFF),
                        1f to Color(0xFFF0F0F0)
                    ),
                    start = Offset(1.5f, 0f),
                    end = Offset(1.5f, 15f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3f, 12.75f)
                lineTo(3f, 15f)
                lineTo(0f, 15f)
                lineTo(0f, 0f)
                lineTo(3f, 0f)
                lineTo(3f, 2.25f)
                lineTo(2.5f, 3f)
                lineTo(3f, 3.75f)
                lineTo(3f, 5.25f)
                lineTo(2.5f, 6f)
                lineTo(3f, 6.75f)
                lineTo(3f, 8.25f)
                lineTo(2.5f, 9f)
                lineTo(3f, 9.75f)
                lineTo(3f, 11.25f)
                lineTo(2.5f, 12f)
                lineTo(3f, 12.75f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFE54252),
                        1f to Color(0xFFC63442)
                    ),
                    start = Offset(-0.5f, 1.5f),
                    end = Offset(-0.5f, 13.5f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(-1.5f, 3f)
                lineTo(-0.5f, 1.5f)
                lineTo(0.5f, 3f)
                lineTo(-0.5f, 4.5f)
                lineTo(-1.5f, 3f)
                close()
                moveTo(-1.5f, 6f)
                lineTo(-0.5f, 4.5f)
                lineTo(0.5f, 6f)
                lineTo(-0.5f, 7.5f)
                lineTo(-1.5f, 6f)
                close()
                moveTo(-1.5f, 9f)
                lineTo(-0.5f, 7.5f)
                lineTo(0.5f, 9f)
                lineTo(-0.5f, 10.5f)
                lineTo(-1.5f, 9f)
                close()
                moveTo(-1.5f, 12f)
                lineTo(-0.5f, 10.5f)
                lineTo(0.5f, 12f)
                lineTo(-0.5f, 13.5f)
                lineTo(-1.5f, 12f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFE54252),
                        1f to Color(0xFFC63442)
                    ),
                    start = Offset(1.5f, 0f),
                    end = Offset(1.5f, 15f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0.5f, 1.5f)
                lineTo(1.5f, 0f)
                lineTo(2.5f, 1.5f)
                lineTo(1.5f, 3f)
                lineTo(0.5f, 1.5f)
                close()
                moveTo(0.5f, 4.5f)
                lineTo(1.5f, 3f)
                lineTo(2.5f, 4.5f)
                lineTo(1.5f, 6f)
                lineTo(0.5f, 4.5f)
                close()
                moveTo(0.5f, 7.5f)
                lineTo(1.5f, 6f)
                lineTo(2.5f, 7.5f)
                lineTo(1.5f, 9f)
                lineTo(0.5f, 7.5f)
                close()
                moveTo(0.5f, 10.5f)
                lineTo(1.5f, 9f)
                lineTo(2.5f, 10.5f)
                lineTo(1.5f, 12f)
                lineTo(0.5f, 10.5f)
                close()
                moveTo(0.5f, 13.5f)
                lineTo(1.5f, 12f)
                lineTo(2.5f, 13.5f)
                lineTo(1.5f, 15f)
                lineTo(0.5f, 13.5f)
                close()
            }
        }.build()

        return _BY!!
    }

@Suppress("ObjectPropertyName")
private var _BY: ImageVector? = null
