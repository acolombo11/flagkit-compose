package flagkit.flags

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import flagkit.FlagKit

val FlagKit.TN: ImageVector
    get() {
        if (_TN != null) {
            return _TN!!
        }
        _TN = ImageVector.Builder(
            name = "TN",
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
                        0f to Color(0xFFE92434),
                        1f to Color(0xFFE11324)
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
                        0f to Color(0xFFFFFFFF),
                        1f to Color(0xFFF0F0F0)
                    ),
                    start = Offset(10.5f, 3f),
                    end = Offset(10.5f, 12f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11.858f, 4.273f)
                curveTo(11.441f, 4.097f, 10.982f, 4f, 10.5f, 4f)
                curveTo(8.567f, 4f, 7f, 5.567f, 7f, 7.5f)
                curveTo(7f, 9.433f, 8.567f, 11f, 10.5f, 11f)
                curveTo(10.982f, 11f, 11.441f, 10.903f, 11.858f, 10.727f)
                curveTo(10.248f, 10.533f, 9f, 9.162f, 9f, 7.5f)
                curveTo(9f, 5.838f, 10.248f, 4.467f, 11.858f, 4.273f)
                lineTo(11.858f, 4.273f)
                close()
                moveTo(10.5f, 12f)
                curveTo(8.015f, 12f, 6f, 9.985f, 6f, 7.5f)
                curveTo(6f, 5.015f, 8.015f, 3f, 10.5f, 3f)
                curveTo(12.985f, 3f, 15f, 5.015f, 15f, 7.5f)
                curveTo(15f, 9.985f, 12.985f, 12f, 10.5f, 12f)
                close()
                moveTo(12.266f, 8.378f)
                lineTo(13.618f, 8.883f)
                lineTo(12.843f, 7.665f)
                lineTo(13.741f, 6.535f)
                lineTo(12.343f, 6.896f)
                lineTo(11.546f, 5.692f)
                lineTo(11.458f, 7.133f)
                lineTo(10.067f, 7.519f)
                lineTo(11.41f, 8.049f)
                lineTo(11.347f, 9.491f)
                lineTo(12.266f, 8.378f)
                close()
            }
        }.build()

        return _TN!!
    }

@Suppress("ObjectPropertyName")
private var _TN: ImageVector? = null
