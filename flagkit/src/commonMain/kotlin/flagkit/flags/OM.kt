package flagkit.flags

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import flagkit.FlagKit

val FlagKit.OM: ImageVector
    get() {
        if (_OM != null) {
            return _OM!!
        }
        _OM = ImageVector.Builder(
            name = "OM",
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
                        0f to Color(0xFF138E16),
                        1f to Color(0xFF0F7F12)
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
                        0f to Color(0xFFED2B35),
                        1f to Color(0xFFD91B25)
                    ),
                    start = Offset(10.5f, 0f),
                    end = Offset(10.5f, 15f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 15f)
                lineToRelative(7f, 0f)
                lineToRelative(0f, -5f)
                lineToRelative(14f, 0f)
                lineToRelative(0f, -5f)
                lineToRelative(-14f, 0f)
                lineToRelative(0f, -5f)
                lineToRelative(-7f, 0f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFFFFF),
                        1f to Color(0xFFF0F0F0)
                    ),
                    start = Offset(3.5f, 1f),
                    end = Offset(3.5f, 4.802f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3.5f, 3.534f)
                lineToRelative(-0.868f, 1.268f)
                lineToRelative(0.45f, -1.469f)
                lineToRelative(-1.532f, 0.112f)
                lineToRelative(1.429f, -0.564f)
                lineToRelative(-1.043f, -1.128f)
                lineToRelative(1.332f, 0.766f)
                lineToRelative(0.232f, -1.519f)
                lineToRelative(0.232f, 1.519f)
                lineToRelative(1.332f, -0.766f)
                lineToRelative(-1.043f, 1.128f)
                lineToRelative(1.429f, 0.564f)
                lineToRelative(-1.532f, -0.112f)
                lineToRelative(0.45f, 1.469f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFFFFF),
                        1f to Color(0xFFF0F0F0)
                    ),
                    start = Offset(14f, 0f),
                    end = Offset(14f, 5f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7f, 0f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-14f)
                close()
            }
        }.build()

        return _OM!!
    }

@Suppress("ObjectPropertyName")
private var _OM: ImageVector? = null
