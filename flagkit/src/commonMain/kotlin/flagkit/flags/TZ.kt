package flagkit.flags

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import flagkit.FlagKit

val FlagKit.TZ: ImageVector
    get() {
        if (_TZ != null) {
            return _TZ!!
        }
        _TZ = ImageVector.Builder(
            name = "TZ",
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
                        0f to Color(0xFF33CC4D),
                        1f to Color(0xFF2AB441)
                    ),
                    start = Offset(10.501f, 0.004f),
                    end = Offset(10.501f, 10.004f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0.001f, 10.004f)
                lineToRelative(21f, -10f)
                lineToRelative(-21f, 0f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF2DAFE4),
                        1f to Color(0xFF1BA4DC)
                    ),
                    start = Offset(10.501f, 5.004f),
                    end = Offset(10.501f, 15.004f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0.001f, 15.004f)
                lineToRelative(21f, 0f)
                lineToRelative(0f, -10f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFD84F),
                        1f to Color(0xFFFCD036)
                    ),
                    start = Offset(10.501f, -1.996f),
                    end = Offset(10.501f, 17.004f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(2.313f, 17.004f)
                lineToRelative(20.316f, -12.695f)
                lineToRelative(-3.94f, -6.305f)
                lineToRelative(-20.316f, 12.695f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF262626),
                        1f to Color(0xFF0D0D0D)
                    ),
                    start = Offset(10.502f, -2.3f),
                    end = Offset(10.502f, 17.308f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(-0.47f, 17.308f)
                lineToRelative(24.593f, -15.368f)
                lineToRelative(-2.65f, -4.24f)
                lineToRelative(-24.593f, 15.368f)
                close()
            }
        }.build()

        return _TZ!!
    }

@Suppress("ObjectPropertyName")
private var _TZ: ImageVector? = null
