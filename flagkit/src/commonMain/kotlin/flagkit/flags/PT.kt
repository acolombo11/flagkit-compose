package flagkit.flags

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import flagkit.FlagKit

val FlagKit.PT: ImageVector
    get() {
        if (_PT != null) {
            return _PT!!
        }
        _PT = ImageVector.Builder(
            name = "PT",
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
                        0f to Color(0xFFFF2936),
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
                        0f to Color(0xFF128415),
                        1f to Color(0xFF0A650C)
                    ),
                    start = Offset(4f, 0f),
                    end = Offset(4f, 15f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(-8f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFAF94F),
                        1f to Color(0xFFF8F736)
                    ),
                    start = Offset(8f, 4.5f),
                    end = Offset(8f, 10.5f)
                ),
                strokeLineWidth = 1f
            ) {
                moveTo(8f, 9.5f)
                curveTo(9.105f, 9.5f, 10f, 8.605f, 10f, 7.5f)
                curveTo(10f, 6.395f, 9.105f, 5.5f, 8f, 5.5f)
                curveTo(6.895f, 5.5f, 6f, 6.395f, 6f, 7.5f)
                curveTo(6f, 8.605f, 6.895f, 9.5f, 8f, 9.5f)
                close()
                moveTo(8f, 10.5f)
                curveTo(6.343f, 10.5f, 5f, 9.157f, 5f, 7.5f)
                curveTo(5f, 5.843f, 6.343f, 4.5f, 8f, 4.5f)
                curveTo(9.657f, 4.5f, 11f, 5.843f, 11f, 7.5f)
                curveTo(11f, 9.157f, 9.657f, 10.5f, 8f, 10.5f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFFFFF),
                        1f to Color(0xFFF0F0F0)
                    ),
                    start = Offset(8f, 6f),
                    end = Offset(8f, 9f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7f, 6.256f)
                curveTo(7f, 6.115f, 7.108f, 6f, 7.245f, 6f)
                lineTo(8.755f, 6f)
                curveTo(8.89f, 6f, 9f, 6.114f, 9f, 6.256f)
                lineTo(9f, 8.001f)
                curveTo(9f, 8.553f, 8.556f, 9f, 8f, 9f)
                curveTo(7.448f, 9f, 7f, 8.557f, 7f, 8.001f)
                lineTo(7f, 6.256f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF1D50B5),
                        1f to Color(0xFF15439D)
                    ),
                    start = Offset(8f, 6.5f),
                    end = Offset(8f, 8f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8f, 8f)
                curveTo(8.276f, 8f, 8.5f, 7.276f, 8.5f, 7f)
                curveTo(8.5f, 6.724f, 8.276f, 6.5f, 8f, 6.5f)
                curveTo(7.724f, 6.5f, 7.5f, 6.724f, 7.5f, 7f)
                curveTo(7.5f, 7.276f, 7.724f, 8f, 8f, 8f)
                close()
            }
        }.build()

        return _PT!!
    }

@Suppress("ObjectPropertyName")
private var _PT: ImageVector? = null
