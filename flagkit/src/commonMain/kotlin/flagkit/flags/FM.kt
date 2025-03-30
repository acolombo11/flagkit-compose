package flagkit.flags

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import flagkit.FlagKit

val FlagKit.FM: ImageVector
    get() {
        if (_FM != null) {
            return _FM!!
        }
        _FM = ImageVector.Builder(
            name = "FM",
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
                        0f to Color(0xFF95CEF5),
                        1f to Color(0xFF78B3DC)
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
                    start = Offset(10.5f, 1.5f),
                    end = Offset(10.5f, 13.118f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.5f, 4.32f)
                lineTo(9.324f, 5.118f)
                lineTo(9.72f, 3.753f)
                lineTo(8.598f, 2.882f)
                lineTo(10.018f, 2.837f)
                lineTo(10.5f, 1.5f)
                lineTo(10.982f, 2.837f)
                lineTo(12.402f, 2.882f)
                lineTo(11.28f, 3.753f)
                lineTo(11.676f, 5.118f)
                lineTo(10.5f, 4.32f)
                close()
                moveTo(10.5f, 12.32f)
                lineTo(9.324f, 13.118f)
                lineTo(9.72f, 11.753f)
                lineTo(8.598f, 10.882f)
                lineTo(10.018f, 10.837f)
                lineTo(10.5f, 9.5f)
                lineTo(10.982f, 10.837f)
                lineTo(12.402f, 10.882f)
                lineTo(11.28f, 11.753f)
                lineTo(11.676f, 13.118f)
                lineTo(10.5f, 12.32f)
                close()
                moveTo(14.5f, 8.32f)
                lineTo(13.324f, 9.118f)
                lineTo(13.72f, 7.753f)
                lineTo(12.598f, 6.882f)
                lineTo(14.018f, 6.837f)
                lineTo(14.5f, 5.5f)
                lineTo(14.982f, 6.837f)
                lineTo(16.402f, 6.882f)
                lineTo(15.28f, 7.753f)
                lineTo(15.676f, 9.118f)
                lineTo(14.5f, 8.32f)
                close()
                moveTo(6.5f, 8.32f)
                lineTo(5.324f, 9.118f)
                lineTo(5.72f, 7.753f)
                lineTo(4.598f, 6.882f)
                lineTo(6.018f, 6.837f)
                lineTo(6.5f, 5.5f)
                lineTo(6.982f, 6.837f)
                lineTo(8.402f, 6.882f)
                lineTo(7.28f, 7.753f)
                lineTo(7.676f, 9.118f)
                lineTo(6.5f, 8.32f)
                close()
            }
        }.build()

        return _FM!!
    }

@Suppress("ObjectPropertyName")
private var _FM: ImageVector? = null
