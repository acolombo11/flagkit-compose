package flagkit.flags

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import flagkit.FlagKit

val FlagKit.NI: ImageVector
    get() {
        if (_NI != null) {
            return _NI!!
        }
        _NI = ImageVector.Builder(
            name = "NI",
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
                        0f to Color(0xFF1A78D6),
                        1f to Color(0xFF106AC4)
                    ),
                    start = Offset(10.5f, 0f),
                    end = Offset(10.5f, 5f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(21f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-21f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF1A78D6),
                        1f to Color(0xFF106AC4)
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
                        0f to Color(0xFFFFFFFF),
                        1f to Color(0xFFF0F0F0)
                    ),
                    start = Offset(10.5f, 5f),
                    end = Offset(10.5f, 10f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 5f)
                horizontalLineToRelative(21f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-21f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFDBCD92)),
                strokeLineWidth = 1f
            ) {
                moveTo(10.5f, 9f)
                curveTo(11.328f, 9f, 12f, 8.328f, 12f, 7.5f)
                curveTo(12f, 6.672f, 11.328f, 6f, 10.5f, 6f)
                curveTo(9.672f, 6f, 9f, 6.672f, 9f, 7.5f)
                curveTo(9f, 8.328f, 9.672f, 9f, 10.5f, 9f)
                close()
                moveTo(10.5f, 9.5f)
                curveTo(9.395f, 9.5f, 8.5f, 8.605f, 8.5f, 7.5f)
                curveTo(8.5f, 6.395f, 9.395f, 5.5f, 10.5f, 5.5f)
                curveTo(11.605f, 5.5f, 12.5f, 6.395f, 12.5f, 7.5f)
                curveTo(12.5f, 8.605f, 11.605f, 9.5f, 10.5f, 9.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF9CDDEE)),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.5f, 6.5f)
                lineToRelative(1f, 2f)
                lineToRelative(-2f, 0f)
                close()
            }
        }.build()

        return _NI!!
    }

@Suppress("ObjectPropertyName")
private var _NI: ImageVector? = null
