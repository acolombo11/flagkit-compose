package flagkit.flags

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import flagkit.FlagKit

val FlagKit.VU: ImageVector
    get() {
        if (_VU != null) {
            return _VU!!
        }
        _VU = ImageVector.Builder(
            name = "VU",
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
                        0f to Color(0xFF27AB53),
                        1f to Color(0xFF219447)
                    ),
                    start = Offset(10.7f, 9f),
                    end = Offset(10.7f, 15f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0.2f, 9f)
                horizontalLineToRelative(21f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-21f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFEC2547),
                        1f to Color(0xFFCE1A39)
                    ),
                    start = Offset(10.7f, 0f),
                    end = Offset(10.7f, 6f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0.2f, 0f)
                horizontalLineToRelative(21f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-21f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF262626),
                        1f to Color(0xFF0D0D0D)
                    ),
                    start = Offset(10.7f, 0f),
                    end = Offset(10.7f, 15f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.2f, 6f)
                lineTo(21.2f, 6f)
                lineTo(21.2f, 9f)
                lineTo(8.2f, 9f)
                lineTo(0.2f, 15f)
                lineTo(0.2f, 0f)
                lineTo(8.2f, 6f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFD449),
                        1f to Color(0xFFFDCD34)
                    ),
                    start = Offset(10.1f, 0.8f),
                    end = Offset(10.1f, 14.2f)
                ),
                strokeLineWidth = 1f
            ) {
                moveTo(6.867f, 7.5f)
                lineTo(-0.6f, 1.9f)
                lineTo(-1f, 1.6f)
                lineTo(-0.4f, 0.8f)
                lineTo(0f, 1.1f)
                lineTo(7.867f, 7f)
                lineTo(20.7f, 7f)
                lineTo(21.2f, 7f)
                lineTo(21.2f, 8f)
                lineTo(20.7f, 8f)
                lineTo(7.7f, 8f)
                lineTo(8f, 7.9f)
                lineTo(0f, 13.9f)
                lineTo(-0.4f, 14.2f)
                lineTo(-1f, 13.4f)
                lineTo(-0.6f, 13.1f)
                lineTo(6.867f, 7.5f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFD449),
                        1f to Color(0xFFFDCD34)
                    ),
                    start = Offset(2.7f, 6f),
                    end = Offset(2.7f, 10f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(2.7f, 9f)
                curveTo(1.872f, 9f, 1.2f, 8.328f, 1.2f, 7.5f)
                curveTo(1.2f, 6.672f, 1.872f, 6f, 2.7f, 6f)
                curveTo(3.528f, 6f, 4.2f, 6.672f, 4.2f, 7.5f)
                curveTo(4.2f, 8.227f, 3.387f, 9.863f, 2.7f, 10f)
                curveTo(2.604f, 10.019f, 2.801f, 9f, 2.7f, 9f)
                close()
                moveTo(2.7f, 8.25f)
                curveTo(2.976f, 8.5f, 3.2f, 7.776f, 3.2f, 7.5f)
                curveTo(3.2f, 7.224f, 2.976f, 7f, 2.7f, 7f)
                curveTo(2.424f, 7f, 2.2f, 7.224f, 2.2f, 7.5f)
                curveTo(2.2f, 7.776f, 2.424f, 8.5f, 2.7f, 8.25f)
                close()
            }
        }.build()

        return _VU!!
    }

@Suppress("ObjectPropertyName")
private var _VU: ImageVector? = null
