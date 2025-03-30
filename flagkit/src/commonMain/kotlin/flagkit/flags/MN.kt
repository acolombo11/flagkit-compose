package flagkit.flags

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import flagkit.FlagKit

val FlagKit.MN: ImageVector
    get() {
        if (_MN != null) {
            return _MN!!
        }
        _MN = ImageVector.Builder(
            name = "MN",
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
                        0f to Color(0xFF146BBC),
                        1f to Color(0xFF0B5396)
                    ),
                    start = Offset(10.5f, 0f),
                    end = Offset(10.5f, 15f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7f, 0f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(-7f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFE43642),
                        1f to Color(0xFFC32A34)
                    ),
                    start = Offset(3.5f, 0f),
                    end = Offset(3.5f, 15f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(-7f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFE43642),
                        1f to Color(0xFFC32A34)
                    ),
                    start = Offset(17.5f, 0f),
                    end = Offset(17.5f, 15f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(14f, 0f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(-7f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFF8D246),
                        1f to Color(0xFFF9CE2F)
                    ),
                    start = Offset(3.5f, 7.5f),
                    end = Offset(3.5f, 12f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4f, 9f)
                lineTo(5f, 9f)
                lineTo(5f, 12f)
                lineTo(4f, 12f)
                lineTo(4f, 9f)
                close()
                moveTo(2f, 9f)
                lineTo(3f, 9f)
                lineTo(3f, 12f)
                lineTo(2f, 12f)
                lineTo(2f, 9f)
                close()
                moveTo(3f, 11f)
                lineTo(4f, 11f)
                lineTo(3.5f, 12f)
                lineTo(3f, 11f)
                close()
                moveTo(3f, 9f)
                lineTo(4f, 9f)
                lineTo(3.5f, 10f)
                lineTo(3f, 9f)
                close()
                moveTo(3f, 8f)
                lineTo(3.5f, 7.5f)
                lineTo(4f, 8f)
                lineTo(3f, 8f)
                close()
                moveTo(3.5f, 9f)
                curveTo(3.224f, 9f, 3f, 8.776f, 3f, 8.5f)
                curveTo(3f, 8.224f, 3.224f, 8f, 3.5f, 8f)
                curveTo(3.776f, 8f, 4f, 8.224f, 4f, 8.5f)
                curveTo(4f, 8.776f, 3.776f, 9f, 3.5f, 9f)
                close()
                moveTo(3.5f, 11f)
                curveTo(3.224f, 11f, 3f, 10.776f, 3f, 10.5f)
                curveTo(3f, 10.224f, 3.224f, 10f, 3.5f, 10f)
                curveTo(3.776f, 10f, 4f, 10.224f, 4f, 10.5f)
                curveTo(4f, 10.776f, 3.776f, 11f, 3.5f, 11f)
                close()
            }
        }.build()

        return _MN!!
    }

@Suppress("ObjectPropertyName")
private var _MN: ImageVector? = null
