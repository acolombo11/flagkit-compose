package flagkit.flags

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import flagkit.FlagKit

val FlagKit.KH: ImageVector
    get() {
        if (_KH != null) {
            return _KH!!
        }
        _KH = ImageVector.Builder(
            name = "KH",
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
                        0f to Color(0xFF0F3EB6),
                        1f to Color(0xFF09339F)
                    ),
                    start = Offset(10.5f, 0f),
                    end = Offset(10.5f, 4f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(21f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-21f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF0F3EB6),
                        1f to Color(0xFF09339F)
                    ),
                    start = Offset(10.5f, 11f),
                    end = Offset(10.5f, 15f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 11f)
                horizontalLineToRelative(21f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-21f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFED1A3C),
                        1f to Color(0xFFDE0B2D)
                    ),
                    start = Offset(10.5f, 4f),
                    end = Offset(10.5f, 11f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 4f)
                horizontalLineToRelative(21f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-21f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFFFFF),
                        1f to Color(0xFFF0F0F0)
                    ),
                    start = Offset(10.5f, 5.5f),
                    end = Offset(10.5f, 10f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.5f, 8f)
                lineTo(8.5f, 8f)
                lineTo(8.5f, 10f)
                lineTo(6.5f, 10f)
                lineTo(7.5f, 8f)
                close()
                moveTo(9f, 8f)
                lineTo(12f, 8f)
                lineTo(12f, 10f)
                lineTo(9f, 10f)
                lineTo(9f, 8f)
                close()
                moveTo(12.5f, 8f)
                lineTo(13.5f, 8f)
                lineTo(14.5f, 10f)
                lineTo(12.5f, 10f)
                lineTo(12.5f, 8f)
                close()
                moveTo(12.5f, 6.508f)
                curveTo(12.5f, 6.227f, 12.732f, 6f, 13f, 6f)
                curveTo(13.276f, 6f, 13.5f, 6.221f, 13.5f, 6.508f)
                lineTo(13.5f, 7.5f)
                lineTo(12.5f, 7.5f)
                lineTo(12.5f, 6.508f)
                close()
                moveTo(9f, 6.545f)
                lineTo(10f, 6.545f)
                lineTo(10f, 5.998f)
                curveTo(10f, 5.723f, 10.232f, 5.5f, 10.5f, 5.5f)
                curveTo(10.776f, 5.5f, 11f, 5.722f, 11f, 5.998f)
                lineTo(11f, 6.545f)
                lineTo(12f, 6.545f)
                lineTo(12f, 7.5f)
                lineTo(9f, 7.5f)
                lineTo(9f, 6.545f)
                close()
                moveTo(7.5f, 6.508f)
                curveTo(7.5f, 6.227f, 7.732f, 6f, 8f, 6f)
                curveTo(8.276f, 6f, 8.5f, 6.221f, 8.5f, 6.508f)
                lineTo(8.5f, 7.5f)
                lineTo(7.5f, 7.5f)
                lineTo(7.5f, 6.508f)
                close()
            }
        }.build()

        return _KH!!
    }

@Suppress("ObjectPropertyName")
private var _KH: ImageVector? = null
