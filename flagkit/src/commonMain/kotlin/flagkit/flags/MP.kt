package flagkit.flags

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import flagkit.FlagKit

val FlagKit.MP: ImageVector
    get() {
        if (_MP != null) {
            return _MP!!
        }
        _MP = ImageVector.Builder(
            name = "MP",
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
                        0f to Color(0xFF1E8BD6),
                        1f to Color(0xFF1074BA)
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
                    start = Offset(10.5f, 2.5f),
                    end = Offset(10.5f, 12.5f)
                ),
                strokeLineWidth = 1f
            ) {
                moveTo(10.5f, 12.5f)
                curveTo(13.261f, 12.5f, 15.5f, 10.261f, 15.5f, 7.5f)
                curveTo(15.5f, 4.739f, 13.261f, 2.5f, 10.5f, 2.5f)
                curveTo(7.739f, 2.5f, 5.5f, 4.739f, 5.5f, 7.5f)
                curveTo(5.5f, 10.261f, 7.739f, 12.5f, 10.5f, 12.5f)
                lineTo(10.5f, 12.5f)
                close()
                moveTo(10.5f, 11.5f)
                curveTo(8.291f, 11.5f, 6.5f, 9.709f, 6.5f, 7.5f)
                curveTo(6.5f, 5.291f, 8.291f, 3.5f, 10.5f, 3.5f)
                curveTo(12.709f, 3.5f, 14.5f, 5.291f, 14.5f, 7.5f)
                curveTo(14.5f, 9.709f, 12.709f, 11.5f, 10.5f, 11.5f)
                lineTo(10.5f, 11.5f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFA9A7A9),
                        1f to Color(0xFF8C8A8C)
                    ),
                    start = Offset(10.5f, 5f),
                    end = Offset(10.5f, 13f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.938f, 5.997f)
                curveTo(8.972f, 5.446f, 9.443f, 5f, 9.999f, 5f)
                lineTo(11.001f, 5f)
                curveTo(11.553f, 5f, 12.028f, 5.453f, 12.062f, 5.997f)
                lineTo(12.438f, 12.003f)
                curveTo(12.472f, 12.554f, 12.057f, 13f, 11.491f, 13f)
                lineTo(9.509f, 13f)
                curveTo(8.952f, 13f, 8.528f, 12.547f, 8.562f, 12.003f)
                lineTo(8.938f, 5.997f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFFFFF),
                        1f to Color(0xFFF0F0F0)
                    ),
                    start = Offset(10.499f, 4.65f),
                    end = Offset(10.499f, 10.982f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.5f, 9.515f)
                lineToRelative(-2.057f, 1.467f)
                lineToRelative(0.759f, -2.41f)
                lineToRelative(-2.031f, -1.503f)
                lineToRelative(2.526f, -0.023f)
                lineToRelative(0.802f, -2.396f)
                lineToRelative(0.802f, 2.396f)
                lineToRelative(2.526f, 0.023f)
                lineToRelative(-2.031f, 1.503f)
                lineToRelative(0.759f, 2.41f)
                close()
            }
        }.build()

        return _MP!!
    }

@Suppress("ObjectPropertyName")
private var _MP: ImageVector? = null
