package flagkit.flags

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import flagkit.FlagKit

val FlagKit.KG: ImageVector
    get() {
        if (_KG != null) {
            return _KG!!
        }
        _KG = ImageVector.Builder(
            name = "KG",
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
                        0f to Color(0xFFF22A46),
                        1f to Color(0xFFE71834)
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
                        0f to Color(0xFFFFF04D),
                        1f to Color(0xFFFFEE35)
                    ),
                    start = Offset(10.5f, 5f),
                    end = Offset(10.5f, 10f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.5f, 7.5f)
                moveToRelative(-2.5f, 0f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 5f, 0f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -5f, 0f)
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFF04D),
                        1f to Color(0xFFFFEE35)
                    ),
                    start = Offset(10.5f, 2.138f),
                    end = Offset(10.5f, 12.862f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.5f, 11.035f)
                lineTo(9.276f, 12.862f)
                lineTo(8.966f, 10.685f)
                lineTo(7.071f, 11.8f)
                lineTo(7.736f, 9.704f)
                lineTo(5.545f, 9.886f)
                lineTo(7.053f, 8.287f)
                lineTo(5f, 7.5f)
                lineTo(7.053f, 6.713f)
                lineTo(5.545f, 5.114f)
                lineTo(7.736f, 5.296f)
                lineTo(7.071f, 3.2f)
                lineTo(8.966f, 4.315f)
                lineTo(9.276f, 2.138f)
                lineTo(10.5f, 3.965f)
                lineTo(11.724f, 2.138f)
                lineTo(12.034f, 4.315f)
                lineTo(13.929f, 3.2f)
                lineTo(13.264f, 5.296f)
                lineTo(15.455f, 5.114f)
                lineTo(13.947f, 6.713f)
                lineTo(16f, 7.5f)
                lineTo(13.947f, 8.287f)
                lineTo(15.455f, 9.886f)
                lineTo(13.264f, 9.704f)
                lineTo(13.929f, 11.8f)
                lineTo(12.034f, 10.685f)
                lineTo(11.724f, 12.862f)
                lineTo(10.5f, 11.035f)
                close()
                moveTo(10.5f, 11f)
                curveTo(12.433f, 11f, 14f, 9.433f, 14f, 7.5f)
                curveTo(14f, 5.567f, 12.433f, 4f, 10.5f, 4f)
                curveTo(8.567f, 4f, 7f, 5.567f, 7f, 7.5f)
                curveTo(7f, 9.433f, 8.567f, 11f, 10.5f, 11f)
                close()
            }
        }.build()

        return _KG!!
    }

@Suppress("ObjectPropertyName")
private var _KG: ImageVector? = null
