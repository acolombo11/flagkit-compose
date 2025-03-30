package flagkit.flags

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import flagkit.FlagKit

val FlagKit.MH: ImageVector
    get() {
        if (_MH != null) {
            return _MH!!
        }
        _MH = ImageVector.Builder(
            name = "MH",
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
                        0f to Color(0xFF064DAE),
                        1f to Color(0xFF003D91)
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
                        0f to Color(0xFFF18D36),
                        1f to Color(0xFFDB761E)
                    ),
                    start = Offset(10.5f, 0f),
                    end = Offset(10.5f, 15f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(21f, 0f)
                lineToRelative(0f, 4f)
                lineToRelative(-21f, 11f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFFFFF),
                        1f to Color(0xFFF0F0F0)
                    ),
                    start = Offset(10.5f, 4f),
                    end = Offset(10.5f, 15f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(21f, 8f)
                lineToRelative(0f, -4f)
                lineToRelative(-21f, 11f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFFFFF),
                        1f to Color(0xFFF0F0F0)
                    ),
                    start = Offset(4.5f, 2f),
                    end = Offset(4.5f, 9f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4.839f, 4.372f)
                lineTo(4.5f, 2f)
                lineTo(4.161f, 4.372f)
                lineTo(3.25f, 3.335f)
                lineTo(3.718f, 4.718f)
                lineTo(2.335f, 4.25f)
                lineTo(3.372f, 5.161f)
                lineTo(1f, 5.5f)
                lineTo(3.372f, 5.839f)
                lineTo(2.335f, 6.75f)
                lineTo(3.718f, 6.282f)
                lineTo(3.25f, 7.665f)
                lineTo(4.161f, 6.628f)
                lineTo(4.5f, 9f)
                lineTo(4.839f, 6.628f)
                lineTo(5.75f, 7.665f)
                lineTo(5.282f, 6.282f)
                lineTo(6.665f, 6.75f)
                lineTo(5.628f, 5.839f)
                lineTo(8f, 5.5f)
                lineTo(5.628f, 5.161f)
                lineTo(6.665f, 4.25f)
                lineTo(5.282f, 4.718f)
                lineTo(5.75f, 3.335f)
                lineTo(4.839f, 4.372f)
                close()
            }
        }.build()

        return _MH!!
    }

@Suppress("ObjectPropertyName")
private var _MH: ImageVector? = null
