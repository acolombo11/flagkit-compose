package flagkit.flags

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import flagkit.FlagKit

val FlagKit.UM: ImageVector
    get() {
        if (_UM != null) {
            return _UM!!
        }
        _UM = ImageVector.Builder(
            name = "UM",
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
                        0f to Color(0xFFD02F44),
                        1f to Color(0xFFB12537)
                    ),
                    start = Offset(10.5f, 0f),
                    end = Offset(10.5f, 15f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                lineTo(21f, 0f)
                lineTo(21f, 1f)
                lineTo(0f, 1f)
                lineTo(0f, 0f)
                close()
                moveTo(0f, 2f)
                lineTo(21f, 2f)
                lineTo(21f, 3f)
                lineTo(0f, 3f)
                lineTo(0f, 2f)
                close()
                moveTo(0f, 4f)
                lineTo(21f, 4f)
                lineTo(21f, 5f)
                lineTo(0f, 5f)
                lineTo(0f, 4f)
                close()
                moveTo(0f, 6f)
                lineTo(21f, 6f)
                lineTo(21f, 7f)
                lineTo(0f, 7f)
                lineTo(0f, 6f)
                close()
                moveTo(0f, 8f)
                lineTo(21f, 8f)
                lineTo(21f, 9f)
                lineTo(0f, 9f)
                lineTo(0f, 8f)
                close()
                moveTo(0f, 10f)
                lineTo(21f, 10f)
                lineTo(21f, 11f)
                lineTo(0f, 11f)
                lineTo(0f, 10f)
                close()
                moveTo(0f, 12f)
                lineTo(21f, 12f)
                lineTo(21f, 13f)
                lineTo(0f, 13f)
                lineTo(0f, 12f)
                close()
                moveTo(0f, 14f)
                lineTo(21f, 14f)
                lineTo(21f, 15f)
                lineTo(0f, 15f)
                lineTo(0f, 14f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF46467F),
                        1f to Color(0xFF3C3C6D)
                    ),
                    start = Offset(4.5f, 0f),
                    end = Offset(4.5f, 7f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-9f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFFFFF),
                        1f to Color(0xFFF0F0F0)
                    ),
                    start = Offset(4.5f, 1f),
                    end = Offset(4.5f, 6f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(1.5f, 2f)
                curveTo(1.224f, 2f, 1f, 1.776f, 1f, 1.5f)
                curveTo(1f, 1.224f, 1.224f, 1f, 1.5f, 1f)
                curveTo(1.776f, 1f, 2f, 1.224f, 2f, 1.5f)
                curveTo(2f, 1.776f, 1.776f, 2f, 1.5f, 2f)
                close()
                moveTo(3.5f, 2f)
                curveTo(3.224f, 2f, 3f, 1.776f, 3f, 1.5f)
                curveTo(3f, 1.224f, 3.224f, 1f, 3.5f, 1f)
                curveTo(3.776f, 1f, 4f, 1.224f, 4f, 1.5f)
                curveTo(4f, 1.776f, 3.776f, 2f, 3.5f, 2f)
                close()
                moveTo(5.5f, 2f)
                curveTo(5.224f, 2f, 5f, 1.776f, 5f, 1.5f)
                curveTo(5f, 1.224f, 5.224f, 1f, 5.5f, 1f)
                curveTo(5.776f, 1f, 6f, 1.224f, 6f, 1.5f)
                curveTo(6f, 1.776f, 5.776f, 2f, 5.5f, 2f)
                close()
                moveTo(7.5f, 2f)
                curveTo(7.224f, 2f, 7f, 1.776f, 7f, 1.5f)
                curveTo(7f, 1.224f, 7.224f, 1f, 7.5f, 1f)
                curveTo(7.776f, 1f, 8f, 1.224f, 8f, 1.5f)
                curveTo(8f, 1.776f, 7.776f, 2f, 7.5f, 2f)
                close()
                moveTo(2.5f, 3f)
                curveTo(2.224f, 3f, 2f, 2.776f, 2f, 2.5f)
                curveTo(2f, 2.224f, 2.224f, 2f, 2.5f, 2f)
                curveTo(2.776f, 2f, 3f, 2.224f, 3f, 2.5f)
                curveTo(3f, 2.776f, 2.776f, 3f, 2.5f, 3f)
                close()
                moveTo(4.5f, 3f)
                curveTo(4.224f, 3f, 4f, 2.776f, 4f, 2.5f)
                curveTo(4f, 2.224f, 4.224f, 2f, 4.5f, 2f)
                curveTo(4.776f, 2f, 5f, 2.224f, 5f, 2.5f)
                curveTo(5f, 2.776f, 4.776f, 3f, 4.5f, 3f)
                close()
                moveTo(6.5f, 3f)
                curveTo(6.224f, 3f, 6f, 2.776f, 6f, 2.5f)
                curveTo(6f, 2.224f, 6.224f, 2f, 6.5f, 2f)
                curveTo(6.776f, 2f, 7f, 2.224f, 7f, 2.5f)
                curveTo(7f, 2.776f, 6.776f, 3f, 6.5f, 3f)
                close()
                moveTo(7.5f, 4f)
                curveTo(7.224f, 4f, 7f, 3.776f, 7f, 3.5f)
                curveTo(7f, 3.224f, 7.224f, 3f, 7.5f, 3f)
                curveTo(7.776f, 3f, 8f, 3.224f, 8f, 3.5f)
                curveTo(8f, 3.776f, 7.776f, 4f, 7.5f, 4f)
                close()
                moveTo(5.5f, 4f)
                curveTo(5.224f, 4f, 5f, 3.776f, 5f, 3.5f)
                curveTo(5f, 3.224f, 5.224f, 3f, 5.5f, 3f)
                curveTo(5.776f, 3f, 6f, 3.224f, 6f, 3.5f)
                curveTo(6f, 3.776f, 5.776f, 4f, 5.5f, 4f)
                close()
                moveTo(3.5f, 4f)
                curveTo(3.224f, 4f, 3f, 3.776f, 3f, 3.5f)
                curveTo(3f, 3.224f, 3.224f, 3f, 3.5f, 3f)
                curveTo(3.776f, 3f, 4f, 3.224f, 4f, 3.5f)
                curveTo(4f, 3.776f, 3.776f, 4f, 3.5f, 4f)
                close()
                moveTo(1.5f, 4f)
                curveTo(1.224f, 4f, 1f, 3.776f, 1f, 3.5f)
                curveTo(1f, 3.224f, 1.224f, 3f, 1.5f, 3f)
                curveTo(1.776f, 3f, 2f, 3.224f, 2f, 3.5f)
                curveTo(2f, 3.776f, 1.776f, 4f, 1.5f, 4f)
                close()
                moveTo(2.5f, 5f)
                curveTo(2.224f, 5f, 2f, 4.776f, 2f, 4.5f)
                curveTo(2f, 4.224f, 2.224f, 4f, 2.5f, 4f)
                curveTo(2.776f, 4f, 3f, 4.224f, 3f, 4.5f)
                curveTo(3f, 4.776f, 2.776f, 5f, 2.5f, 5f)
                close()
                moveTo(4.5f, 5f)
                curveTo(4.224f, 5f, 4f, 4.776f, 4f, 4.5f)
                curveTo(4f, 4.224f, 4.224f, 4f, 4.5f, 4f)
                curveTo(4.776f, 4f, 5f, 4.224f, 5f, 4.5f)
                curveTo(5f, 4.776f, 4.776f, 5f, 4.5f, 5f)
                close()
                moveTo(6.5f, 5f)
                curveTo(6.224f, 5f, 6f, 4.776f, 6f, 4.5f)
                curveTo(6f, 4.224f, 6.224f, 4f, 6.5f, 4f)
                curveTo(6.776f, 4f, 7f, 4.224f, 7f, 4.5f)
                curveTo(7f, 4.776f, 6.776f, 5f, 6.5f, 5f)
                close()
                moveTo(7.5f, 6f)
                curveTo(7.224f, 6f, 7f, 5.776f, 7f, 5.5f)
                curveTo(7f, 5.224f, 7.224f, 5f, 7.5f, 5f)
                curveTo(7.776f, 5f, 8f, 5.224f, 8f, 5.5f)
                curveTo(8f, 5.776f, 7.776f, 6f, 7.5f, 6f)
                close()
                moveTo(5.5f, 6f)
                curveTo(5.224f, 6f, 5f, 5.776f, 5f, 5.5f)
                curveTo(5f, 5.224f, 5.224f, 5f, 5.5f, 5f)
                curveTo(5.776f, 5f, 6f, 5.224f, 6f, 5.5f)
                curveTo(6f, 5.776f, 5.776f, 6f, 5.5f, 6f)
                close()
                moveTo(3.5f, 6f)
                curveTo(3.224f, 6f, 3f, 5.776f, 3f, 5.5f)
                curveTo(3f, 5.224f, 3.224f, 5f, 3.5f, 5f)
                curveTo(3.776f, 5f, 4f, 5.224f, 4f, 5.5f)
                curveTo(4f, 5.776f, 3.776f, 6f, 3.5f, 6f)
                close()
                moveTo(1.5f, 6f)
                curveTo(1.224f, 6f, 1f, 5.776f, 1f, 5.5f)
                curveTo(1f, 5.224f, 1.224f, 5f, 1.5f, 5f)
                curveTo(1.776f, 5f, 2f, 5.224f, 2f, 5.5f)
                curveTo(2f, 5.776f, 1.776f, 6f, 1.5f, 6f)
                close()
            }
        }.build()

        return _UM!!
    }

@Suppress("ObjectPropertyName")
private var _UM: ImageVector? = null
