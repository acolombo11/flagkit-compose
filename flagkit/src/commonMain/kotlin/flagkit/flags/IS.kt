package flagkit.flags

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import flagkit.FlagKit

val FlagKit.IS: ImageVector
    get() {
        if (_IS != null) {
            return _IS!!
        }
        _IS = ImageVector.Builder(
            name = "IS",
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
                        0f to Color(0xFF0E4CB5),
                        1f to Color(0xFF063B95)
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
                    start = Offset(10.5f, 0f),
                    end = Offset(10.5f, 15f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 9f)
                lineToRelative(6f, 0f)
                lineToRelative(0f, 6f)
                lineToRelative(3f, 0f)
                lineToRelative(0f, -6f)
                lineToRelative(12f, 0f)
                lineToRelative(0f, -3f)
                lineToRelative(-12f, 0f)
                lineToRelative(0f, -6f)
                lineToRelative(-3f, 0f)
                lineToRelative(0f, 6f)
                lineToRelative(-6f, 0f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFEB363A),
                        1f to Color(0xFFD52B2F)
                    ),
                    start = Offset(10.5f, 0f),
                    end = Offset(10.5f, 15f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 8f)
                lineToRelative(7f, 0f)
                lineToRelative(0f, 7f)
                lineToRelative(1f, 0f)
                lineToRelative(0f, -7f)
                lineToRelative(13f, 0f)
                lineToRelative(0f, -1f)
                lineToRelative(-13f, 0f)
                lineToRelative(0f, -7f)
                lineToRelative(-1f, 0f)
                lineToRelative(0f, 7f)
                lineToRelative(-7f, 0f)
                close()
            }
        }.build()

        return _IS!!
    }

@Suppress("ObjectPropertyName")
private var _IS: ImageVector? = null
