package flagkit.flags

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import flagkit.FlagKit

val FlagKit.CW: ImageVector
    get() {
        if (_CW != null) {
            return _CW!!
        }
        _CW = ImageVector.Builder(
            name = "CW",
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
                        0f to Color(0xFF0543A8),
                        1f to Color(0xFF00307D)
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
                        0f to Color(0xFFFCC747),
                        1f to Color(0xFFFEC539)
                    ),
                    start = Offset(10.5f, 10f),
                    end = Offset(10.5f, 12f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 10f)
                horizontalLineToRelative(21f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-21f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFFFFF),
                        1f to Color(0xFFF0F0F0)
                    ),
                    start = Offset(6.499f, 3.501f),
                    end = Offset(6.499f, 7.118f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.5f, 6.267f)
                lineToRelative(-1.176f, 0.851f)
                lineToRelative(0.446f, -1.381f)
                lineToRelative(-1.173f, -0.855f)
                lineToRelative(1.451f, -0.002f)
                lineToRelative(0.451f, -1.379f)
                lineToRelative(0.451f, 1.379f)
                lineToRelative(1.451f, 0.002f)
                lineToRelative(-1.173f, 0.855f)
                lineToRelative(0.446f, 1.381f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFFFFF),
                        1f to Color(0xFFF0F0F0)
                    ),
                    start = Offset(3f, 1.499f),
                    end = Offset(3f, 4.213f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3f, 3.575f)
                lineToRelative(-0.882f, 0.638f)
                lineToRelative(0.335f, -1.036f)
                lineToRelative(-0.879f, -0.641f)
                lineToRelative(1.088f, -0.002f)
                lineToRelative(0.338f, -1.035f)
                lineToRelative(0.338f, 1.035f)
                lineToRelative(1.088f, 0.002f)
                lineToRelative(-0.879f, 0.641f)
                lineToRelative(0.335f, 1.036f)
                close()
            }
        }.build()

        return _CW!!
    }

@Suppress("ObjectPropertyName")
private var _CW: ImageVector? = null
