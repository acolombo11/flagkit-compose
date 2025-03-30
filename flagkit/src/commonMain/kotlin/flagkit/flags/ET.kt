package flagkit.flags

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import flagkit.FlagKit

val FlagKit.ET: ImageVector
    get() {
        if (_ET != null) {
            return _ET!!
        }
        _ET = ImageVector.Builder(
            name = "ET",
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
                        0f to Color(0xFF20AA46),
                        1f to Color(0xFF168835)
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
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFE92F3B),
                        1f to Color(0xFFD81824)
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
                        0f to Color(0xFFFADF50),
                        1f to Color(0xFFFCDC34)
                    ),
                    start = Offset(10.5f, 5f),
                    end = Offset(10.5f, 10f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 5f)
                horizontalLineToRelative(21f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-21f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF205CCA),
                        1f to Color(0xFF154BAD)
                    ),
                    start = Offset(10.5f, 4f),
                    end = Offset(10.5f, 11f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.5f, 7.5f)
                moveToRelative(-3.5f, 0f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 7f, 0f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -7f, 0f)
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFDB3D),
                        1f to Color(0xFFFDD420)
                    ),
                    start = Offset(10.5f, 5f),
                    end = Offset(10.5f, 9.523f)
                ),
                strokeLineWidth = 1f
            ) {
                moveTo(10.5f, 8.475f)
                lineTo(9.031f, 9.523f)
                lineTo(9.573f, 7.801f)
                lineTo(8.122f, 6.727f)
                lineTo(9.927f, 6.711f)
                lineTo(10.5f, 5f)
                lineTo(11.073f, 6.711f)
                lineTo(12.878f, 6.727f)
                lineTo(11.427f, 7.801f)
                lineTo(11.969f, 9.523f)
                lineTo(10.5f, 8.475f)
                close()
                moveTo(10.5f, 7.861f)
                lineTo(11.044f, 8.249f)
                lineTo(10.843f, 7.612f)
                lineTo(11.38f, 7.214f)
                lineTo(10.712f, 7.208f)
                lineTo(10.5f, 6.574f)
                lineTo(10.288f, 7.208f)
                lineTo(9.62f, 7.214f)
                lineTo(10.157f, 7.612f)
                lineTo(9.956f, 8.249f)
                lineTo(10.5f, 7.861f)
                close()
            }
        }.build()

        return _ET!!
    }

@Suppress("ObjectPropertyName")
private var _ET: ImageVector? = null
