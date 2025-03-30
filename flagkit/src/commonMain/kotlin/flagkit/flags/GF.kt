package flagkit.flags

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import flagkit.FlagKit

val FlagKit.GF: ImageVector
    get() {
        if (_GF != null) {
            return _GF!!
        }
        _GF = ImageVector.Builder(
            name = "GF",
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
                        0f to Color(0xFF2DA446),
                        1f to Color(0xFF218736)
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
                        0f to Color(0xFFFFE24A),
                        1f to Color(0xFFFCDC34)
                    ),
                    start = Offset(10.5f, 0f),
                    end = Offset(10.5f, 15f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                lineToRelative(21f, 15f)
                lineToRelative(-21f, 0f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFE7242C),
                        1f to Color(0xFFD61C24)
                    ),
                    start = Offset(10.5f, 4.75f),
                    end = Offset(10.5f, 10.403f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.5f, 9.073f)
                lineToRelative(-1.837f, 1.33f)
                lineToRelative(0.697f, -2.158f)
                lineToRelative(-1.832f, -1.336f)
                lineToRelative(2.268f, -0.004f)
                lineToRelative(0.704f, -2.155f)
                lineToRelative(0.704f, 2.155f)
                lineToRelative(2.268f, 0.004f)
                lineToRelative(-1.832f, 1.336f)
                lineToRelative(0.697f, 2.158f)
                close()
            }
        }.build()

        return _GF!!
    }

@Suppress("ObjectPropertyName")
private var _GF: ImageVector? = null
