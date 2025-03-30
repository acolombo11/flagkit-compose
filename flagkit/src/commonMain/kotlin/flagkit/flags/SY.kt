package flagkit.flags

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import flagkit.FlagKit

val FlagKit.SY: ImageVector
    get() {
        if (_SY != null) {
            return _SY!!
        }
        _SY = ImageVector.Builder(
            name = "SY",
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
                        0f to Color(0xFF262626),
                        1f to Color(0xFF0D0D0D)
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
                        0f to Color(0xFFE32139),
                        1f to Color(0xFFCC162C)
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
                        0f to Color(0xFFFFFFFF),
                        1f to Color(0xFFF0F0F0)
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
                        0f to Color(0xFF128A49),
                        1f to Color(0xFF0F7A40)
                    ),
                    start = Offset(7f, 5.5f),
                    end = Offset(7f, 9.118f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7f, 8.32f)
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
                        0f to Color(0xFF128A49),
                        1f to Color(0xFF0F7A40)
                    ),
                    start = Offset(14f, 5.5f),
                    end = Offset(14f, 9.118f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(14f, 8.32f)
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

        return _SY!!
    }

@Suppress("ObjectPropertyName")
private var _SY: ImageVector? = null
