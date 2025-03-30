package flagkit.flags

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import flagkit.FlagKit

val FlagKit.KZ: ImageVector
    get() {
        if (_KZ != null) {
            return _KZ!!
        }
        _KZ = ImageVector.Builder(
            name = "KZ",
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
                        0f to Color(0xFF30C6E0),
                        1f to Color(0xFF1CB0C9)
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
                        0f to Color(0xFFFFCD4B),
                        1f to Color(0xFFFEC531)
                    ),
                    start = Offset(10.5f, 4.5f),
                    end = Offset(10.5f, 10.5f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.5f, 7.5f)
                moveToRelative(-3f, 0f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = true, 6f, 0f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = true, -6f, 0f)
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFCD4B),
                        1f to Color(0xFFFEC531)
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
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFCD4B),
                        1f to Color(0xFFFEC531)
                    ),
                    start = Offset(2f, 1f),
                    end = Offset(2f, 14f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(1f, 1.252f)
                curveTo(1f, 1.113f, 1.107f, 1f, 1.252f, 1f)
                lineTo(1.748f, 1f)
                curveTo(1.887f, 1f, 2f, 1.107f, 2f, 1.252f)
                lineTo(2f, 1.748f)
                curveTo(2f, 1.887f, 1.893f, 2f, 1.748f, 2f)
                lineTo(1.252f, 2f)
                curveTo(1.113f, 2f, 1f, 1.893f, 1f, 1.748f)
                lineTo(1f, 1.252f)
                close()
                moveTo(1f, 3.252f)
                curveTo(1f, 3.113f, 1.107f, 3f, 1.252f, 3f)
                lineTo(1.748f, 3f)
                curveTo(1.887f, 3f, 2f, 3.107f, 2f, 3.252f)
                lineTo(2f, 3.748f)
                curveTo(2f, 3.887f, 1.893f, 4f, 1.748f, 4f)
                lineTo(1.252f, 4f)
                curveTo(1.113f, 4f, 1f, 3.893f, 1f, 3.748f)
                lineTo(1f, 3.252f)
                close()
                moveTo(1f, 5.252f)
                curveTo(1f, 5.113f, 1.107f, 5f, 1.252f, 5f)
                lineTo(1.748f, 5f)
                curveTo(1.887f, 5f, 2f, 5.107f, 2f, 5.252f)
                lineTo(2f, 5.748f)
                curveTo(2f, 5.887f, 1.893f, 6f, 1.748f, 6f)
                lineTo(1.252f, 6f)
                curveTo(1.113f, 6f, 1f, 5.893f, 1f, 5.748f)
                lineTo(1f, 5.252f)
                close()
                moveTo(1f, 7.252f)
                curveTo(1f, 7.113f, 1.107f, 7f, 1.252f, 7f)
                lineTo(1.748f, 7f)
                curveTo(1.887f, 7f, 2f, 7.107f, 2f, 7.252f)
                lineTo(2f, 7.748f)
                curveTo(2f, 7.887f, 1.893f, 8f, 1.748f, 8f)
                lineTo(1.252f, 8f)
                curveTo(1.113f, 8f, 1f, 7.893f, 1f, 7.748f)
                lineTo(1f, 7.252f)
                close()
                moveTo(1f, 9.252f)
                curveTo(1f, 9.113f, 1.107f, 9f, 1.252f, 9f)
                lineTo(1.748f, 9f)
                curveTo(1.887f, 9f, 2f, 9.107f, 2f, 9.252f)
                lineTo(2f, 9.748f)
                curveTo(2f, 9.887f, 1.893f, 10f, 1.748f, 10f)
                lineTo(1.252f, 10f)
                curveTo(1.113f, 10f, 1f, 9.893f, 1f, 9.748f)
                lineTo(1f, 9.252f)
                close()
                moveTo(1f, 11.252f)
                curveTo(1f, 11.113f, 1.107f, 11f, 1.252f, 11f)
                lineTo(1.748f, 11f)
                curveTo(1.887f, 11f, 2f, 11.107f, 2f, 11.252f)
                lineTo(2f, 11.748f)
                curveTo(2f, 11.887f, 1.893f, 12f, 1.748f, 12f)
                lineTo(1.252f, 12f)
                curveTo(1.113f, 12f, 1f, 11.893f, 1f, 11.748f)
                lineTo(1f, 11.252f)
                close()
                moveTo(1f, 13.252f)
                curveTo(1f, 13.113f, 1.107f, 13f, 1.252f, 13f)
                lineTo(1.748f, 13f)
                curveTo(1.887f, 13f, 2f, 13.107f, 2f, 13.252f)
                lineTo(2f, 13.748f)
                curveTo(2f, 13.887f, 1.893f, 14f, 1.748f, 14f)
                lineTo(1.252f, 14f)
                curveTo(1.113f, 14f, 1f, 13.893f, 1f, 13.748f)
                lineTo(1f, 13.252f)
                close()
                moveTo(2f, 12.252f)
                curveTo(2f, 12.113f, 2.107f, 12f, 2.252f, 12f)
                lineTo(2.748f, 12f)
                curveTo(2.887f, 12f, 3f, 12.107f, 3f, 12.252f)
                lineTo(3f, 12.748f)
                curveTo(3f, 12.887f, 2.893f, 13f, 2.748f, 13f)
                lineTo(2.252f, 13f)
                curveTo(2.113f, 13f, 2f, 12.893f, 2f, 12.748f)
                lineTo(2f, 12.252f)
                close()
                moveTo(2f, 10.252f)
                curveTo(2f, 10.113f, 2.107f, 10f, 2.252f, 10f)
                lineTo(2.748f, 10f)
                curveTo(2.887f, 10f, 3f, 10.107f, 3f, 10.252f)
                lineTo(3f, 10.748f)
                curveTo(3f, 10.887f, 2.893f, 11f, 2.748f, 11f)
                lineTo(2.252f, 11f)
                curveTo(2.113f, 11f, 2f, 10.893f, 2f, 10.748f)
                lineTo(2f, 10.252f)
                close()
                moveTo(2f, 8.252f)
                curveTo(2f, 8.113f, 2.107f, 8f, 2.252f, 8f)
                lineTo(2.748f, 8f)
                curveTo(2.887f, 8f, 3f, 8.107f, 3f, 8.252f)
                lineTo(3f, 8.748f)
                curveTo(3f, 8.887f, 2.893f, 9f, 2.748f, 9f)
                lineTo(2.252f, 9f)
                curveTo(2.113f, 9f, 2f, 8.893f, 2f, 8.748f)
                lineTo(2f, 8.252f)
                close()
                moveTo(2f, 6.252f)
                curveTo(2f, 6.113f, 2.107f, 6f, 2.252f, 6f)
                lineTo(2.748f, 6f)
                curveTo(2.887f, 6f, 3f, 6.107f, 3f, 6.252f)
                lineTo(3f, 6.748f)
                curveTo(3f, 6.887f, 2.893f, 7f, 2.748f, 7f)
                lineTo(2.252f, 7f)
                curveTo(2.113f, 7f, 2f, 6.893f, 2f, 6.748f)
                lineTo(2f, 6.252f)
                close()
                moveTo(2f, 4.252f)
                curveTo(2f, 4.113f, 2.107f, 4f, 2.252f, 4f)
                lineTo(2.748f, 4f)
                curveTo(2.887f, 4f, 3f, 4.107f, 3f, 4.252f)
                lineTo(3f, 4.748f)
                curveTo(3f, 4.887f, 2.893f, 5f, 2.748f, 5f)
                lineTo(2.252f, 5f)
                curveTo(2.113f, 5f, 2f, 4.893f, 2f, 4.748f)
                lineTo(2f, 4.252f)
                close()
                moveTo(2f, 2.252f)
                curveTo(2f, 2.113f, 2.107f, 2f, 2.252f, 2f)
                lineTo(2.748f, 2f)
                curveTo(2.887f, 2f, 3f, 2.107f, 3f, 2.252f)
                lineTo(3f, 2.748f)
                curveTo(3f, 2.887f, 2.893f, 3f, 2.748f, 3f)
                lineTo(2.252f, 3f)
                curveTo(2.113f, 3f, 2f, 2.893f, 2f, 2.748f)
                lineTo(2f, 2.252f)
                close()
            }
        }.build()

        return _KZ!!
    }

@Suppress("ObjectPropertyName")
private var _KZ: ImageVector? = null
