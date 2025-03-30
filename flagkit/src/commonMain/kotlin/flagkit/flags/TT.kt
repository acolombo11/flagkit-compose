package flagkit.flags

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import flagkit.FlagKit

val FlagKit.TT: ImageVector
    get() {
        if (_TT != null) {
            return _TT!!
        }
        _TT = ImageVector.Builder(
            name = "TT",
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
                        0f to Color(0xFFED233C),
                        1f to Color(0xFFCC162C)
                    ),
                    start = Offset(10.496f, 0.005f),
                    end = Offset(10.496f, 15.005f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(-0.004f, 0.005f)
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
                    start = Offset(10.75f, -4.061f),
                    end = Offset(10.75f, 19.07f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(-1.5f, -1f)
                lineToRelative(7.144f, -3.061f)
                lineToRelative(15.1f, 17.996f)
                lineToRelative(2.256f, 2.065f)
                lineToRelative(-7.653f, 3.07f)
                lineToRelative(-14.825f, -17.667f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF262626),
                        1f to Color(0xFF0D0D0D)
                    ),
                    start = Offset(10.495f, -5.21f),
                    end = Offset(10.495f, 20.219f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(17.901f, 20.219f)
                lineToRelative(-18.641f, -22.215f)
                lineToRelative(3.83f, -3.214f)
                lineToRelative(18.641f, 22.215f)
                lineToRelative(-3.83f, 3.214f)
                close()
            }
        }.build()

        return _TT!!
    }

@Suppress("ObjectPropertyName")
private var _TT: ImageVector? = null
