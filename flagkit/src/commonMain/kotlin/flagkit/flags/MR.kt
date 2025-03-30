package flagkit.flags

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import flagkit.FlagKit

val FlagKit.MR: ImageVector
    get() {
        if (_MR != null) {
            return _MR!!
        }
        _MR = ImageVector.Builder(
            name = "MR",
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
                        0f to Color(0xFF108B4D),
                        1f to Color(0xFF0A6135)
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
                        0f to Color(0xFFFFC941),
                        1f to Color(0xFFFFC42E)
                    ),
                    start = Offset(10.416f, 3.5f),
                    end = Offset(10.416f, 11.008f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(14.86f, 5.8f)
                curveTo(14.897f, 6.031f, 14.916f, 6.267f, 14.916f, 6.508f)
                curveTo(14.916f, 8.993f, 12.901f, 11.008f, 10.416f, 11.008f)
                curveTo(7.93f, 11.008f, 5.916f, 8.993f, 5.916f, 6.508f)
                curveTo(5.916f, 6.267f, 5.934f, 6.031f, 5.971f, 5.8f)
                curveTo(6.31f, 7.949f, 8.171f, 9.592f, 10.416f, 9.592f)
                curveTo(12.66f, 9.592f, 14.521f, 7.949f, 14.86f, 5.8f)
                lineTo(14.86f, 5.8f)
                close()
                moveTo(10.5f, 6.423f)
                lineTo(9.264f, 7.304f)
                lineTo(9.72f, 5.856f)
                lineTo(8.5f, 4.953f)
                lineTo(10.018f, 4.939f)
                lineTo(10.5f, 3.5f)
                lineTo(10.982f, 4.939f)
                lineTo(12.5f, 4.953f)
                lineTo(11.28f, 5.856f)
                lineTo(11.736f, 7.304f)
                lineTo(10.5f, 6.423f)
                lineTo(10.5f, 6.423f)
                close()
            }
        }.build()

        return _MR!!
    }

@Suppress("ObjectPropertyName")
private var _MR: ImageVector? = null
