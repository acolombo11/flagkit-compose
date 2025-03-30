package flagkit.flags

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import flagkit.FlagKit

val FlagKit.UZ: ImageVector
    get() {
        if (_UZ != null) {
            return _UZ!!
        }
        _UZ = ImageVector.Builder(
            name = "UZ",
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
                        0f to Color(0xFF04AAC8),
                        1f to Color(0xFF009AB6)
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
                        0f to Color(0xFF23C840),
                        1f to Color(0xFF1EB639)
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
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFFFFF),
                        1f to Color(0xFFF0F0F0)
                    ),
                    start = Offset(6f, 1f),
                    end = Offset(6f, 4f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4.334f, 1.253f)
                curveTo(4.095f, 1.093f, 3.808f, 1f, 3.5f, 1f)
                curveTo(2.672f, 1f, 2f, 1.672f, 2f, 2.5f)
                curveTo(2f, 3.328f, 2.672f, 4f, 3.5f, 4f)
                curveTo(3.808f, 4f, 4.095f, 3.907f, 4.334f, 3.747f)
                curveTo(4.306f, 3.749f, 4.278f, 3.75f, 4.25f, 3.75f)
                curveTo(3.56f, 3.75f, 3f, 3.19f, 3f, 2.5f)
                curveTo(3f, 1.81f, 3.56f, 1.25f, 4.25f, 1.25f)
                curveTo(4.278f, 1.25f, 4.306f, 1.251f, 4.334f, 1.253f)
                close()
                moveTo(5.5f, 4f)
                curveTo(5.224f, 4f, 5f, 3.776f, 5f, 3.5f)
                curveTo(5f, 3.224f, 5.224f, 3f, 5.5f, 3f)
                curveTo(5.776f, 3f, 6f, 3.224f, 6f, 3.5f)
                curveTo(6f, 3.776f, 5.776f, 4f, 5.5f, 4f)
                close()
                moveTo(7.5f, 2f)
                curveTo(7.224f, 2f, 7f, 1.776f, 7f, 1.5f)
                curveTo(7f, 1.224f, 7.224f, 1f, 7.5f, 1f)
                curveTo(7.776f, 1f, 8f, 1.224f, 8f, 1.5f)
                curveTo(8f, 1.776f, 7.776f, 2f, 7.5f, 2f)
                close()
                moveTo(9.5f, 2f)
                curveTo(9.224f, 2f, 9f, 1.776f, 9f, 1.5f)
                curveTo(9f, 1.224f, 9.224f, 1f, 9.5f, 1f)
                curveTo(9.776f, 1f, 10f, 1.224f, 10f, 1.5f)
                curveTo(10f, 1.776f, 9.776f, 2f, 9.5f, 2f)
                close()
                moveTo(9.5f, 4f)
                curveTo(9.224f, 4f, 9f, 3.776f, 9f, 3.5f)
                curveTo(9f, 3.224f, 9.224f, 3f, 9.5f, 3f)
                curveTo(9.776f, 3f, 10f, 3.224f, 10f, 3.5f)
                curveTo(10f, 3.776f, 9.776f, 4f, 9.5f, 4f)
                close()
                moveTo(7.5f, 4f)
                curveTo(7.224f, 4f, 7f, 3.776f, 7f, 3.5f)
                curveTo(7f, 3.224f, 7.224f, 3f, 7.5f, 3f)
                curveTo(7.776f, 3f, 8f, 3.224f, 8f, 3.5f)
                curveTo(8f, 3.776f, 7.776f, 4f, 7.5f, 4f)
                close()
            }
        }.build()

        return _UZ!!
    }

@Suppress("ObjectPropertyName")
private var _UZ: ImageVector? = null
