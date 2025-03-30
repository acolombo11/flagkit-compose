package flagkit.flags

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import flagkit.FlagKit

val FlagKit.LY: ImageVector
    get() {
        if (_LY != null) {
            return _LY!!
        }
        _LY = ImageVector.Builder(
            name = "LY",
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
                        0f to Color(0xFF262626),
                        1f to Color(0xFF0D0D0D)
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
                        0f to Color(0xFF34B857),
                        1f to Color(0xFF2B9E4A)
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
                        0f to Color(0xFFF41F34),
                        1f to Color(0xFFE60B21)
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
                        0f to Color(0xFFFFFFFF),
                        1f to Color(0xFFF0F0F0)
                    ),
                    start = Offset(10.5f, 6f),
                    end = Offset(10.5f, 9f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11.334f, 6.253f)
                curveTo(11.306f, 6.251f, 11.278f, 6.25f, 11.25f, 6.25f)
                curveTo(10.56f, 6.25f, 10f, 6.81f, 10f, 7.5f)
                curveTo(10f, 8.19f, 10.56f, 8.75f, 11.25f, 8.75f)
                curveTo(11.278f, 8.75f, 11.306f, 8.749f, 11.334f, 8.747f)
                curveTo(11.095f, 8.907f, 10.808f, 9f, 10.5f, 9f)
                curveTo(9.672f, 9f, 9f, 8.328f, 9f, 7.5f)
                curveTo(9f, 6.672f, 9.672f, 6f, 10.5f, 6f)
                curveTo(10.808f, 6f, 11.095f, 6.093f, 11.334f, 6.253f)
                close()
                moveTo(11.5f, 8f)
                curveTo(11.224f, 8f, 11f, 7.776f, 11f, 7.5f)
                curveTo(11f, 7.224f, 11.224f, 7f, 11.5f, 7f)
                curveTo(11.776f, 7f, 12f, 7.224f, 12f, 7.5f)
                curveTo(12f, 7.776f, 11.776f, 8f, 11.5f, 8f)
                close()
            }
        }.build()

        return _LY!!
    }

@Suppress("ObjectPropertyName")
private var _LY: ImageVector? = null
