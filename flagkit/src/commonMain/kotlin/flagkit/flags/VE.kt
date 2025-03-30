package flagkit.flags

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import flagkit.FlagKit

val FlagKit.VE: ImageVector
    get() {
        if (_VE != null) {
            return _VE!!
        }
        _VE = ImageVector.Builder(
            name = "VE",
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
                        0f to Color(0xFF063191),
                        1f to Color(0xFF03287C)
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
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFE2213B),
                        1f to Color(0xFFCD1931)
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
                    start = Offset(10.5f, 6f),
                    end = Offset(10.5f, 9f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.5f, 7f)
                curveTo(10.224f, 7f, 10f, 6.776f, 10f, 6.5f)
                curveTo(10f, 6.224f, 10.224f, 6f, 10.5f, 6f)
                curveTo(10.776f, 6f, 11f, 6.224f, 11f, 6.5f)
                curveTo(11f, 6.776f, 10.776f, 7f, 10.5f, 7f)
                close()
                moveTo(8.5f, 7.5f)
                curveTo(8.224f, 7.5f, 8f, 7.276f, 8f, 7f)
                curveTo(8f, 6.724f, 8.224f, 6.5f, 8.5f, 6.5f)
                curveTo(8.776f, 6.5f, 9f, 6.724f, 9f, 7f)
                curveTo(9f, 7.276f, 8.776f, 7.5f, 8.5f, 7.5f)
                close()
                moveTo(12.5f, 7.5f)
                curveTo(12.224f, 7.5f, 12f, 7.276f, 12f, 7f)
                curveTo(12f, 6.724f, 12.224f, 6.5f, 12.5f, 6.5f)
                curveTo(12.776f, 6.5f, 13f, 6.724f, 13f, 7f)
                curveTo(13f, 7.276f, 12.776f, 7.5f, 12.5f, 7.5f)
                close()
                moveTo(7.5f, 9f)
                curveTo(7.224f, 9f, 7f, 8.776f, 7f, 8.5f)
                curveTo(7f, 8.224f, 7.224f, 8f, 7.5f, 8f)
                curveTo(7.776f, 8f, 8f, 8.224f, 8f, 8.5f)
                curveTo(8f, 8.776f, 7.776f, 9f, 7.5f, 9f)
                close()
                moveTo(13.5f, 9f)
                curveTo(13.224f, 9f, 13f, 8.776f, 13f, 8.5f)
                curveTo(13f, 8.224f, 13.224f, 8f, 13.5f, 8f)
                curveTo(13.776f, 8f, 14f, 8.224f, 14f, 8.5f)
                curveTo(14f, 8.776f, 13.776f, 9f, 13.5f, 9f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFD044),
                        1f to Color(0xFFFFCB2F)
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
        }.build()

        return _VE!!
    }

@Suppress("ObjectPropertyName")
private var _VE: ImageVector? = null
