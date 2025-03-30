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

val FlagKit.SX: ImageVector
    get() {
        if (_SX != null) {
            return _SX!!
        }
        _SX = ImageVector.Builder(
            name = "SX",
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
                        0f to Color(0xFF0740AA),
                        1f to Color(0xFF012F85)
                    ),
                    start = Offset(10.5f, 7f),
                    end = Offset(10.5f, 15f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 7f)
                horizontalLineToRelative(21f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-21f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFF02C33),
                        1f to Color(0xFFD82027)
                    ),
                    start = Offset(10.5f, 0f),
                    end = Offset(10.5f, 7f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(21f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-21f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFFFFF),
                        1f to Color(0xFFF0F0F0)
                    ),
                    start = Offset(5f, 0f),
                    end = Offset(5f, 15f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                lineToRelative(10f, 7.5f)
                lineToRelative(-10f, 7.5f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFE72C33),
                        1f to Color(0xFFD82027)
                    ),
                    start = Offset(3.5f, 4.5f),
                    end = Offset(3.5f, 9.099f)
                ),
                strokeLineWidth = 1f
            ) {
                moveTo(1.5f, 7f)
                lineTo(1.5f, 5.506f)
                curveTo(1.5f, 4.952f, 1.938f, 4.5f, 2.495f, 4.5f)
                lineTo(4.505f, 4.5f)
                curveTo(5.056f, 4.5f, 5.5f, 4.957f, 5.5f, 5.506f)
                lineTo(5.5f, 7f)
                curveTo(5.5f, 7.845f, 5.116f, 8.447f, 4.497f, 8.798f)
                curveTo(4.139f, 9f, 3.789f, 9.082f, 3.467f, 9.099f)
                curveTo(3.211f, 9.082f, 2.861f, 9f, 2.503f, 8.798f)
                curveTo(1.884f, 8.447f, 1.5f, 7.845f, 1.5f, 7f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF78C1F0),
                        1f to Color(0xFF67B1E0)
                    ),
                    start = Offset(3.5f, 5f),
                    end = Offset(3.5f, 8.6f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(2f, 7f)
                lineTo(2f, 5.506f)
                curveTo(2f, 5.227f, 2.216f, 5f, 2.495f, 5f)
                lineTo(4.505f, 5f)
                curveTo(4.778f, 5f, 5f, 5.232f, 5f, 5.506f)
                lineTo(5f, 7f)
                curveTo(5f, 8.5f, 3.5f, 8.6f, 3.5f, 8.6f)
                curveTo(3.5f, 8.6f, 2f, 8.5f, 2f, 7f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3f, 6.5f)
                lineToRelative(0.5f, -0.5f)
                lineToRelative(0.5f, 0.5f)
                lineToRelative(0f, 1f)
                lineToRelative(-1f, 0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF9D835)),
                strokeLineWidth = 1f
            ) {
                moveTo(1.001f, 9.368f)
                curveTo(1.607f, 10.066f, 2.561f, 10.5f, 3.5f, 10.5f)
                curveTo(4.448f, 10.5f, 5.415f, 10.052f, 6.021f, 9.338f)
                curveTo(6.2f, 9.128f, 6.174f, 8.812f, 5.963f, 8.634f)
                curveTo(5.753f, 8.455f, 5.437f, 8.481f, 5.259f, 8.691f)
                curveTo(4.843f, 9.181f, 4.154f, 9.5f, 3.5f, 9.5f)
                curveTo(2.851f, 9.5f, 2.172f, 9.191f, 1.757f, 8.713f)
                curveTo(1.576f, 8.504f, 1.26f, 8.482f, 1.051f, 8.663f)
                curveTo(0.843f, 8.844f, 0.82f, 9.159f, 1.001f, 9.368f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFF7E14B),
                        1f to Color(0xFFF7DF3E)
                    ),
                    start = Offset(3.5f, 3.5f),
                    end = Offset(3.5f, 5.5f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3.5f, 4.5f)
                moveToRelative(-1f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 0f)
            }
        }.build()

        return _SX!!
    }

@Suppress("ObjectPropertyName")
private var _SX: ImageVector? = null
