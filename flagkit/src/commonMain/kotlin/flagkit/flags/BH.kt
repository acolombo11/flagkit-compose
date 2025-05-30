package flagkit.flags

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import flagkit.FlagKit

val FlagKit.BH: ImageVector
    get() {
        if (_BH != null) {
            return _BH!!
        }
        _BH = ImageVector.Builder(
            name = "BH",
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
                        0f to Color(0xFFE7243B),
                        1f to Color(0xFFCC162C)
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
                        0f to Color(0xFFFFFFFF),
                        1f to Color(0xFFF0F0F0)
                    ),
                    start = Offset(3.75f, 0f),
                    end = Offset(3.75f, 15f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 15f)
                lineToRelative(7.5f, 0f)
                lineToRelative(-1.5f, -1f)
                lineToRelative(1.5f, -1f)
                lineToRelative(-1.5f, -1f)
                lineToRelative(1.5f, -1f)
                lineToRelative(-1.5f, -1f)
                lineToRelative(1.5f, -1f)
                lineToRelative(-1.5f, -1f)
                lineToRelative(1.5f, -1f)
                lineToRelative(-1.5f, -1f)
                lineToRelative(1.5f, -1f)
                lineToRelative(-1.5f, -1f)
                lineToRelative(1.5f, -1f)
                lineToRelative(-1.5f, -1f)
                lineToRelative(1.5f, -1f)
                lineToRelative(-1.5f, -1f)
                lineToRelative(-6f, 0f)
                close()
            }
        }.build()

        return _BH!!
    }

@Suppress("ObjectPropertyName")
private var _BH: ImageVector? = null
