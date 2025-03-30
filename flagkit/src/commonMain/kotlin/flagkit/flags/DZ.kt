package flagkit.flags

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import flagkit.FlagKit

val FlagKit.DZ: ImageVector
    get() {
        if (_DZ != null) {
            return _DZ!!
        }
        _DZ = ImageVector.Builder(
            name = "DZ",
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
                        0f to Color(0xFF048345),
                        1f to Color(0xFF04753E)
                    ),
                    start = Offset(5.5f, 0f),
                    end = Offset(5.5f, 15f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(-11f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFFFFF),
                        1f to Color(0xFFF0F0F0)
                    ),
                    start = Offset(16f, 0f),
                    end = Offset(16f, 15f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11f, 0f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(-10f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFE81B42),
                        1f to Color(0xFFD20F34)
                    ),
                    start = Offset(13f, 5.5f),
                    end = Offset(13f, 9.118f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13f, 8.28f)
                lineToRelative(-1.176f, 0.838f)
                lineToRelative(0.434f, -1.377f)
                lineToRelative(-1.16f, -0.859f)
                lineToRelative(1.444f, -0.013f)
                lineToRelative(0.458f, -1.369f)
                lineToRelative(0.458f, 1.369f)
                lineToRelative(1.444f, 0.013f)
                lineToRelative(-1.16f, 0.859f)
                lineToRelative(0.434f, 1.377f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFE81B42),
                        1f to Color(0xFFD20F34)
                    ),
                    start = Offset(9.63f, 3f),
                    end = Offset(9.63f, 12f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13.26f, 4.214f)
                curveTo(12.489f, 3.461f, 11.453f, 3f, 10.313f, 3f)
                curveTo(7.931f, 3f, 6f, 5.015f, 6f, 7.5f)
                curveTo(6f, 9.985f, 7.931f, 12f, 10.313f, 12f)
                curveTo(11.453f, 12f, 12.489f, 11.539f, 13.26f, 10.786f)
                curveTo(12.728f, 11.039f, 12.127f, 11.182f, 11.489f, 11.182f)
                curveTo(9.324f, 11.182f, 7.568f, 9.533f, 7.568f, 7.5f)
                curveTo(7.568f, 5.467f, 9.324f, 3.818f, 11.489f, 3.818f)
                curveTo(12.127f, 3.818f, 12.728f, 3.961f, 13.26f, 4.214f)
                lineTo(13.26f, 4.214f)
                close()
            }
        }.build()

        return _DZ!!
    }

@Suppress("ObjectPropertyName")
private var _DZ: ImageVector? = null
