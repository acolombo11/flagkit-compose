package flagkit.flags

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import flagkit.FlagKit

val FlagKit.CH: ImageVector
    get() {
        if (_CH != null) {
            return _CH!!
        }
        _CH = ImageVector.Builder(
            name = "CH",
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
                        0f to Color(0xFFFF0000),
                        1f to Color(0xFFFF3131)
                    ),
                    start = Offset(10.5f, 15f),
                    end = Offset(10.5f, 0f)
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
                    start = Offset(10.5f, 3f),
                    end = Offset(10.5f, 12f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9f, 9f)
                lineTo(6.256f, 9f)
                curveTo(6.115f, 9f, 6f, 8.886f, 6f, 8.744f)
                lineTo(6f, 6.256f)
                curveTo(6f, 6.115f, 6.114f, 6f, 6.256f, 6f)
                lineTo(9f, 6f)
                lineTo(9f, 3.256f)
                curveTo(9f, 3.115f, 9.114f, 3f, 9.256f, 3f)
                lineTo(11.744f, 3f)
                curveTo(11.885f, 3f, 12f, 3.114f, 12f, 3.256f)
                lineTo(12f, 6f)
                lineTo(14.744f, 6f)
                curveTo(14.885f, 6f, 15f, 6.114f, 15f, 6.256f)
                lineTo(15f, 8.744f)
                curveTo(15f, 8.885f, 14.886f, 9f, 14.744f, 9f)
                lineTo(12f, 9f)
                lineTo(12f, 11.744f)
                curveTo(12f, 11.885f, 11.886f, 12f, 11.744f, 12f)
                lineTo(9.256f, 12f)
                curveTo(9.115f, 12f, 9f, 11.886f, 9f, 11.744f)
                lineTo(9f, 9f)
                close()
            }
        }.build()

        return _CH!!
    }

@Suppress("ObjectPropertyName")
private var _CH: ImageVector? = null
