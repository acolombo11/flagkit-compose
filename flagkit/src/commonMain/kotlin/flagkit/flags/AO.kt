package flagkit.flags

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import flagkit.FlagKit

val FlagKit.AO: ImageVector
    get() {
        if (_AO != null) {
            return _AO!!
        }
        _AO = ImageVector.Builder(
            name = "AO",
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
                        0f to Color(0xFFFF323E),
                        1f to Color(0xFFFD0D1B)
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
                        0f to Color(0xFF262626),
                        1f to Color(0xFF0D0D0D)
                    ),
                    start = Offset(10.5f, 8f),
                    end = Offset(10.5f, 15f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 8f)
                horizontalLineToRelative(21f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-21f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFDD2137),
                        1f to Color(0xFFCC162C)
                    ),
                    start = Offset(10.5f, 0f),
                    end = Offset(10.5f, 8f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(21f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-21f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFF8D84B),
                        1f to Color(0xFFF9D536)
                    ),
                    start = Offset(10.698f, 4.262f),
                    end = Offset(10.698f, 10.177f)
                ),
                strokeLineWidth = 1f
            ) {
                moveTo(10.631f, 8.855f)
                lineTo(9.223f, 7.916f)
                curveTo(8.993f, 7.763f, 8.931f, 7.452f, 9.084f, 7.223f)
                curveTo(9.237f, 6.993f, 9.548f, 6.931f, 9.777f, 7.084f)
                lineTo(11.313f, 8.108f)
                curveTo(11.381f, 7.979f, 11.435f, 7.841f, 11.474f, 7.694f)
                curveTo(11.76f, 6.627f, 11.127f, 5.531f, 10.06f, 5.245f)
                curveTo(9.793f, 5.173f, 9.635f, 4.899f, 9.707f, 4.632f)
                curveTo(9.778f, 4.366f, 10.052f, 4.207f, 10.319f, 4.279f)
                curveTo(11.919f, 4.708f, 12.869f, 6.353f, 12.44f, 7.953f)
                curveTo(12.372f, 8.208f, 12.273f, 8.446f, 12.148f, 8.665f)
                lineTo(12.777f, 9.084f)
                curveTo(13.007f, 9.237f, 13.069f, 9.548f, 12.916f, 9.777f)
                curveTo(12.763f, 10.007f, 12.452f, 10.069f, 12.223f, 9.916f)
                lineTo(11.51f, 9.441f)
                curveTo(10.783f, 10.072f, 9.766f, 10.342f, 8.766f, 10.074f)
                curveTo(8.499f, 10.003f, 8.341f, 9.729f, 8.413f, 9.462f)
                curveTo(8.484f, 9.195f, 8.758f, 9.037f, 9.025f, 9.108f)
                curveTo(9.594f, 9.261f, 10.172f, 9.152f, 10.631f, 8.855f)
                close()
                moveTo(9.5f, 6.5f)
                curveTo(9.224f, 6.5f, 9f, 6.276f, 9f, 6f)
                curveTo(9f, 5.724f, 9.224f, 5.5f, 9.5f, 5.5f)
                curveTo(9.776f, 5.5f, 10f, 5.724f, 10f, 6f)
                curveTo(10f, 6.276f, 9.776f, 6.5f, 9.5f, 6.5f)
                close()
            }
        }.build()

        return _AO!!
    }

@Suppress("ObjectPropertyName")
private var _AO: ImageVector? = null
