package flagkit.flags

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import flagkit.FlagKit

val FlagKit.GT: ImageVector
    get() {
        if (_GT != null) {
            return _GT!!
        }
        _GT = ImageVector.Builder(
            name = "GT",
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
                        0f to Color(0xFF63AEE3),
                        1f to Color(0xFF4998D0)
                    ),
                    start = Offset(15.5f, 0f),
                    end = Offset(15.5f, 15f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10f, 0f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(-11f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF63AEE3),
                        1f to Color(0xFF4998D0)
                    ),
                    start = Offset(3.5f, 0f),
                    end = Offset(3.5f, 15f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(-7f)
                close()
            }
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
                moveTo(7f, 0f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(-7f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF628A40)),
                strokeLineWidth = 1f
            ) {
                moveTo(8f, 7f)
                curveTo(8f, 7.901f, 8.482f, 8.72f, 9.247f, 9.164f)
                curveTo(9.486f, 9.302f, 9.792f, 9.221f, 9.93f, 8.982f)
                curveTo(10.069f, 8.743f, 9.987f, 8.437f, 9.749f, 8.299f)
                curveTo(9.289f, 8.032f, 9f, 7.541f, 9f, 7f)
                curveTo(9f, 6.724f, 8.776f, 6.5f, 8.5f, 6.5f)
                curveTo(8.224f, 6.5f, 8f, 6.724f, 8f, 7f)
                close()
                moveTo(11.846f, 9.107f)
                curveTo(12.559f, 8.651f, 13f, 7.863f, 13f, 7f)
                curveTo(13f, 6.724f, 12.776f, 6.5f, 12.5f, 6.5f)
                curveTo(12.224f, 6.5f, 12f, 6.724f, 12f, 7f)
                curveTo(12f, 7.518f, 11.736f, 7.991f, 11.307f, 8.265f)
                curveTo(11.074f, 8.414f, 11.006f, 8.723f, 11.155f, 8.955f)
                curveTo(11.304f, 9.188f, 11.613f, 9.256f, 11.846f, 9.107f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFDCC26D)),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.5f, 7f)
                moveToRelative(-1f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 0f)
            }
        }.build()

        return _GT!!
    }

@Suppress("ObjectPropertyName")
private var _GT: ImageVector? = null
