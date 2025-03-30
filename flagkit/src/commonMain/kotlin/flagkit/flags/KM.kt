package flagkit.flags

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import flagkit.FlagKit

val FlagKit.KM: ImageVector
    get() {
        if (_KM != null) {
            return _KM!!
        }
        _KM = ImageVector.Builder(
            name = "KM",
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
                        0f to Color(0xFFFFCB49),
                        1f to Color(0xFFFFC638)
                    ),
                    start = Offset(10.5f, 0f),
                    end = Offset(10.5f, 4f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(21f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-21f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFDC1D34),
                        1f to Color(0xFFCC162C)
                    ),
                    start = Offset(10.5f, 7f),
                    end = Offset(10.5f, 11f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 7f)
                horizontalLineToRelative(21f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-21f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF4985D4),
                        1f to Color(0xFF3D77C2)
                    ),
                    start = Offset(10.5f, 11f),
                    end = Offset(10.5f, 15f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 11f)
                horizontalLineToRelative(21f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-21f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFFFFF),
                        1f to Color(0xFFF0F0F0)
                    ),
                    start = Offset(10.5f, 4f),
                    end = Offset(10.5f, 7f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 4f)
                horizontalLineToRelative(21f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-21f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF4BA343),
                        1f to Color(0xFF408D39)
                    ),
                    start = Offset(5f, 0f),
                    end = Offset(5f, 15f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 15f)
                lineToRelative(10f, -7.5f)
                lineToRelative(-10f, -7.5f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFFFFF),
                        1f to Color(0xFFF0F0F0)
                    ),
                    start = Offset(3.5f, 4.5f),
                    end = Offset(3.5f, 10.5f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4.75f, 4.595f)
                curveTo(4.51f, 4.533f, 4.259f, 4.5f, 4f, 4.5f)
                curveTo(2.343f, 4.5f, 1f, 5.843f, 1f, 7.5f)
                curveTo(1f, 9.157f, 2.343f, 10.5f, 4f, 10.5f)
                curveTo(4.259f, 10.5f, 4.51f, 10.467f, 4.75f, 10.405f)
                curveTo(3.456f, 10.072f, 2.5f, 8.898f, 2.5f, 7.5f)
                curveTo(2.5f, 6.102f, 3.456f, 4.928f, 4.75f, 4.595f)
                close()
                moveTo(5.5f, 6f)
                curveTo(5.224f, 6f, 5f, 5.776f, 5f, 5.5f)
                curveTo(5f, 5.224f, 5.224f, 5f, 5.5f, 5f)
                curveTo(5.776f, 5f, 6f, 5.224f, 6f, 5.5f)
                curveTo(6f, 5.776f, 5.776f, 6f, 5.5f, 6f)
                close()
                moveTo(5.5f, 8f)
                curveTo(5.224f, 8f, 5f, 7.776f, 5f, 7.5f)
                curveTo(5f, 7.224f, 5.224f, 7f, 5.5f, 7f)
                curveTo(5.776f, 7f, 6f, 7.224f, 6f, 7.5f)
                curveTo(6f, 7.776f, 5.776f, 8f, 5.5f, 8f)
                close()
                moveTo(5.5f, 10f)
                curveTo(5.224f, 10f, 5f, 9.776f, 5f, 9.5f)
                curveTo(5f, 9.224f, 5.224f, 9f, 5.5f, 9f)
                curveTo(5.776f, 9f, 6f, 9.224f, 6f, 9.5f)
                curveTo(6f, 9.776f, 5.776f, 10f, 5.5f, 10f)
                close()
            }
        }.build()

        return _KM!!
    }

@Suppress("ObjectPropertyName")
private var _KM: ImageVector? = null
