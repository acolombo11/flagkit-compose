package flagkit.flags

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import flagkit.FlagKit

val FlagKit.HR: ImageVector
    get() {
        if (_HR != null) {
            return _HR!!
        }
        _HR = ImageVector.Builder(
            name = "HR",
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
                        0f to Color(0xFFFF202D),
                        1f to Color(0xFFFD0D1B)
                    ),
                    start = Offset(10.5f, 0f),
                    end = Offset(10.5f, 5f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(21f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-21f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF1895DB)),
                fillAlpha = 0.5f,
                strokeAlpha = 0.5f,
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8f, 4f)
                lineTo(8.5f, 3.5f)
                lineTo(9f, 4f)
                lineTo(9f, 5f)
                lineTo(8f, 5f)
                lineTo(8f, 4f)
                close()
                moveTo(10f, 4f)
                lineTo(10.5f, 3.5f)
                lineTo(11f, 4f)
                lineTo(11f, 5f)
                lineTo(10f, 5f)
                lineTo(10f, 4f)
                close()
                moveTo(12f, 4f)
                lineTo(12.5f, 3.5f)
                lineTo(13f, 4f)
                lineTo(13f, 5f)
                lineTo(12f, 5f)
                lineTo(12f, 4f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF191F94)),
                fillAlpha = 0.5f,
                strokeAlpha = 0.5f,
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9f, 4f)
                lineTo(9.5f, 3.5f)
                lineTo(10f, 4f)
                lineTo(10f, 5f)
                lineTo(9f, 5f)
                lineTo(9f, 4f)
                close()
                moveTo(11f, 4f)
                lineTo(11.5f, 3.5f)
                lineTo(12f, 4f)
                lineTo(12f, 5f)
                lineTo(11f, 5f)
                lineTo(11f, 4f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF2027AC),
                        1f to Color(0xFF191F94)
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
                    start = Offset(10.5f, 5f),
                    end = Offset(10.5f, 11f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 10f)
                lineTo(0f, 5f)
                lineTo(21f, 5f)
                lineTo(21f, 10f)
                lineTo(0f, 10f)
                close()
                moveTo(12f, 10f)
                lineTo(13f, 10f)
                lineTo(12.727f, 10.547f)
                curveTo(12.601f, 10.797f, 12.273f, 11f, 12f, 11f)
                lineTo(12f, 10f)
                close()
                moveTo(10f, 10f)
                lineTo(11f, 10f)
                lineTo(11f, 11f)
                lineTo(10f, 11f)
                lineTo(10f, 10f)
                close()
                moveTo(8f, 10f)
                lineTo(9f, 10f)
                lineTo(9f, 11f)
                curveTo(8.724f, 11f, 8.404f, 10.807f, 8.273f, 10.547f)
                lineTo(8f, 10f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFF212E),
                        1f to Color(0xFFFD0D1B)
                    ),
                    start = Offset(10.5f, 5f),
                    end = Offset(10.5f, 11f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10f, 5f)
                lineTo(11f, 5f)
                lineTo(11f, 6f)
                lineTo(10f, 6f)
                lineTo(10f, 5f)
                close()
                moveTo(12f, 5f)
                lineTo(12.5f, 5f)
                lineTo(13f, 6f)
                lineTo(12f, 6f)
                lineTo(12f, 5f)
                close()
                moveTo(8.5f, 5f)
                lineTo(9f, 5f)
                lineTo(9f, 6f)
                lineTo(8f, 6f)
                lineTo(8.5f, 5f)
                close()
                moveTo(9f, 6f)
                lineTo(10f, 6f)
                lineTo(10f, 7f)
                lineTo(9f, 7f)
                lineTo(9f, 6f)
                close()
                moveTo(11f, 6f)
                lineTo(12f, 6f)
                lineTo(12f, 7f)
                lineTo(11f, 7f)
                lineTo(11f, 6f)
                close()
                moveTo(10f, 7f)
                lineTo(11f, 7f)
                lineTo(11f, 8f)
                lineTo(10f, 8f)
                lineTo(10f, 7f)
                close()
                moveTo(12f, 7f)
                lineTo(13f, 7f)
                lineTo(13f, 8f)
                lineTo(12f, 8f)
                lineTo(12f, 7f)
                close()
                moveTo(11f, 8f)
                lineTo(12f, 8f)
                lineTo(12f, 9f)
                lineTo(11f, 9f)
                lineTo(11f, 8f)
                close()
                moveTo(8f, 7f)
                lineTo(9f, 7f)
                lineTo(9f, 8f)
                lineTo(8f, 8f)
                lineTo(8f, 7f)
                close()
                moveTo(9f, 8f)
                lineTo(10f, 8f)
                lineTo(10f, 9f)
                lineTo(9f, 9f)
                lineTo(9f, 8f)
                close()
                moveTo(8f, 9f)
                lineTo(9f, 9f)
                lineTo(9f, 10f)
                lineTo(8f, 10f)
                lineTo(8f, 9f)
                close()
                moveTo(10f, 9f)
                lineTo(11f, 9f)
                lineTo(11f, 10f)
                lineTo(10f, 10f)
                lineTo(10f, 9f)
                close()
                moveTo(12f, 9f)
                lineTo(13f, 9f)
                lineTo(13f, 10f)
                lineTo(12f, 10f)
                lineTo(12f, 9f)
                close()
                moveTo(11f, 10f)
                lineTo(12f, 10f)
                lineTo(12f, 11f)
                lineTo(11f, 11f)
                lineTo(11f, 10f)
                close()
                moveTo(9f, 10f)
                lineTo(10f, 10f)
                lineTo(10f, 11f)
                lineTo(9f, 11f)
                lineTo(9f, 10f)
                close()
            }
        }.build()

        return _HR!!
    }

@Suppress("ObjectPropertyName")
private var _HR: ImageVector? = null
