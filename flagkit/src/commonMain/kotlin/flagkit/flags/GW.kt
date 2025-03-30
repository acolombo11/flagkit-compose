package flagkit.flags

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import flagkit.FlagKit

val FlagKit.GW: ImageVector
    get() {
        if (_GW != null) {
            return _GW!!
        }
        _GW = ImageVector.Builder(
            name = "GW",
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
                        0f to Color(0xFF1AB558),
                        1f to Color(0xFF169E4D)
                    ),
                    start = Offset(10.5f, 7f),
                    end = Offset(10.5f, 15f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 7f)
                horizontalLineToRelative(21f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-21f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFD952),
                        1f to Color(0xFFFCD036)
                    ),
                    start = Offset(10.5f, 0f),
                    end = Offset(10.5f, 7f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(21f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-21f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFE72B42),
                        1f to Color(0xFFCC162C)
                    ),
                    start = Offset(4f, 0f),
                    end = Offset(4f, 15f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(-8f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF262626),
                        1f to Color(0xFF0D0D0D)
                    ),
                    start = Offset(4.001f, 5.001f),
                    end = Offset(4.001f, 9.523f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4f, 8.459f)
                lineToRelative(-1.469f, 1.064f)
                lineToRelative(0.558f, -1.726f)
                lineToRelative(-1.466f, -1.069f)
                lineToRelative(1.814f, -0.003f)
                lineToRelative(0.564f, -1.724f)
                lineToRelative(0.564f, 1.724f)
                lineToRelative(1.814f, 0.003f)
                lineToRelative(-1.466f, 1.069f)
                lineToRelative(0.558f, 1.726f)
                close()
            }
        }.build()

        return _GW!!
    }

@Suppress("ObjectPropertyName")
private var _GW: ImageVector? = null
