package flagkit.flags

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import flagkit.FlagKit

val FlagKit.TW: ImageVector
    get() {
        if (_TW != null) {
            return _TW!!
        }
        _TW = ImageVector.Builder(
            name = "TW",
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
                        0f to Color(0xFFFE3030),
                        1f to Color(0xFFFF0000)
                    ),
                    start = Offset(10.5f, 0f),
                    end = Offset(10.5f, 14.065f)
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
                        0f to Color(0xFF0909B6),
                        1f to Color(0xFF000096)
                    ),
                    start = Offset(5.5f, 0f),
                    end = Offset(5.5f, 8f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 8f)
                lineToRelative(11f, 0f)
                lineToRelative(0f, -8f)
                lineToRelative(-11f, 0f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFFFFF),
                        1f to Color(0xFFF0F0F0)
                    ),
                    start = Offset(5.5f, 1.69f),
                    end = Offset(5.5f, 6.31f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5.5f, 5.25f)
                lineToRelative(-0.957f, 1.06f)
                lineToRelative(0.073f, -1.426f)
                lineToRelative(-1.426f, 0.073f)
                lineToRelative(1.06f, -0.957f)
                lineToRelative(-1.06f, -0.957f)
                lineToRelative(1.426f, 0.073f)
                lineToRelative(-0.073f, -1.426f)
                lineToRelative(0.957f, 1.06f)
                lineToRelative(0.957f, -1.06f)
                lineToRelative(-0.073f, 1.426f)
                lineToRelative(1.426f, -0.073f)
                lineToRelative(-1.06f, 0.957f)
                lineToRelative(1.06f, 0.957f)
                lineToRelative(-1.426f, -0.073f)
                lineToRelative(0.073f, 1.426f)
                close()
            }
        }.build()

        return _TW!!
    }

@Suppress("ObjectPropertyName")
private var _TW: ImageVector? = null
