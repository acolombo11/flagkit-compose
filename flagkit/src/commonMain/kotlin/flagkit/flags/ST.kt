package flagkit.flags

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import flagkit.FlagKit

val FlagKit.ST: ImageVector
    get() {
        if (_ST != null) {
            return _ST!!
        }
        _ST = ImageVector.Builder(
            name = "ST",
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
                        0f to Color(0xFF2ACB41),
                        1f to Color(0xFF21AC35)
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
                        0f to Color(0xFF2ACB41),
                        1f to Color(0xFF21AC35)
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
                        0f to Color(0xFFFDD043),
                        1f to Color(0xFFFFCD2F)
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
                        0f to Color(0xFFE71E43),
                        1f to Color(0xFFD01739)
                    ),
                    start = Offset(4f, 0f),
                    end = Offset(4f, 15f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                lineToRelative(8f, 7.5f)
                lineToRelative(-8f, 7.5f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF262626),
                        1f to Color(0xFF0D0D0D)
                    ),
                    start = Offset(11f, 5.5f),
                    end = Offset(11f, 9.118f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11f, 8.32f)
                lineToRelative(-1.176f, 0.798f)
                lineToRelative(0.396f, -1.365f)
                lineToRelative(-1.122f, -0.871f)
                lineToRelative(1.42f, -0.045f)
                lineToRelative(0.482f, -1.337f)
                lineToRelative(0.482f, 1.337f)
                lineToRelative(1.42f, 0.045f)
                lineToRelative(-1.122f, 0.871f)
                lineToRelative(0.396f, 1.365f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF262626),
                        1f to Color(0xFF0D0D0D)
                    ),
                    start = Offset(16f, 5.5f),
                    end = Offset(16f, 9.118f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(16f, 8.32f)
                lineToRelative(-1.176f, 0.798f)
                lineToRelative(0.396f, -1.365f)
                lineToRelative(-1.122f, -0.871f)
                lineToRelative(1.42f, -0.045f)
                lineToRelative(0.482f, -1.337f)
                lineToRelative(0.482f, 1.337f)
                lineToRelative(1.42f, 0.045f)
                lineToRelative(-1.122f, 0.871f)
                lineToRelative(0.396f, 1.365f)
                close()
            }
        }.build()

        return _ST!!
    }

@Suppress("ObjectPropertyName")
private var _ST: ImageVector? = null
