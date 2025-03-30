package flagkit.flags

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import flagkit.FlagKit

val FlagKit.MV: ImageVector
    get() {
        if (_MV != null) {
            return _MV!!
        }
        _MV = ImageVector.Builder(
            name = "MV",
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
                        0f to Color(0xFFF32249),
                        1f to Color(0xFFD01739)
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
                        0f to Color(0xFF15A04F),
                        1f to Color(0xFF0F7E3D)
                    ),
                    start = Offset(10.5f, 3f),
                    end = Offset(10.5f, 12f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3.5f, 3f)
                lineTo(17.5f, 3f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 3.5f)
                lineTo(18f, 11.5f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.5f, 12f)
                lineTo(3.5f, 12f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 11.5f)
                lineTo(3f, 3.5f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.5f, 3f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFFFFF),
                        1f to Color(0xFFF0F0F0)
                    ),
                    start = Offset(10.125f, 4f),
                    end = Offset(10.125f, 11f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12.25f, 4.081f)
                curveTo(12.008f, 4.028f, 11.757f, 4f, 11.5f, 4f)
                curveTo(9.567f, 4f, 8f, 5.567f, 8f, 7.5f)
                curveTo(8f, 9.433f, 9.567f, 11f, 11.5f, 11f)
                curveTo(11.757f, 11f, 12.008f, 10.972f, 12.25f, 10.919f)
                curveTo(10.677f, 10.576f, 9.5f, 9.176f, 9.5f, 7.5f)
                curveTo(9.5f, 5.824f, 10.677f, 4.424f, 12.25f, 4.081f)
                close()
            }
        }.build()

        return _MV!!
    }

@Suppress("ObjectPropertyName")
private var _MV: ImageVector? = null
