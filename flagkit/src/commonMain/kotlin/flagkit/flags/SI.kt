package flagkit.flags

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import flagkit.FlagKit

val FlagKit.SI: ImageVector
    get() {
        if (_SI != null) {
            return _SI!!
        }
        _SI = ImageVector.Builder(
            name = "SI",
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
                        0f to Color(0xFF0C47B7),
                        1f to Color(0xFF073DA4)
                    ),
                    start = Offset(10.5f, 3f),
                    end = Offset(10.5f, 10f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 3f)
                horizontalLineToRelative(21f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-21f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFE53B35),
                        1f to Color(0xFFD32E28)
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
                    start = Offset(10.5f, 0f),
                    end = Offset(10.5f, 7f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 5f)
                lineTo(0f, 0f)
                lineTo(21f, 0f)
                lineTo(21f, 5f)
                lineTo(6.933f, 5f)
                lineTo(6.933f, 4f)
                curveTo(6.933f, 4f, 6.228f, 3.5f, 5.5f, 3.5f)
                curveTo(4.772f, 3.5f, 4f, 4f, 4f, 4f)
                lineTo(4f, 5f)
                lineTo(0f, 5f)
                close()
                moveTo(5.5f, 7f)
                curveTo(4.948f, 7f, 4.5f, 6.552f, 4.5f, 6f)
                curveTo(4.5f, 5.448f, 4.948f, 5f, 5.5f, 5f)
                curveTo(6.052f, 5f, 6.5f, 5.448f, 6.5f, 6f)
                curveTo(6.5f, 6.552f, 6.052f, 7f, 5.5f, 7f)
                close()
            }
        }.build()

        return _SI!!
    }

@Suppress("ObjectPropertyName")
private var _SI: ImageVector? = null
