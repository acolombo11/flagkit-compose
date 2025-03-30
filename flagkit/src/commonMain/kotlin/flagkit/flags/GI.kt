package flagkit.flags

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import flagkit.FlagKit

val FlagKit.GI: ImageVector
    get() {
        if (_GI != null) {
            return _GI!!
        }
        _GI = ImageVector.Builder(
            name = "GI",
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
                        0f to Color(0xFFFFFFFF),
                        1f to Color(0xFFF0F0F0)
                    ),
                    start = Offset(10.5f, 0f),
                    end = Offset(10.5f, 10f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(21f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(-21f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFE71924),
                        1f to Color(0xFFD6101B)
                    ),
                    start = Offset(10.5f, 10f),
                    end = Offset(10.5f, 15f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 10f)
                horizontalLineToRelative(21f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-21f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFEA1824),
                        1f to Color(0xFFD6101B)
                    ),
                    start = Offset(10.5f, 3f),
                    end = Offset(10.5f, 9f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9f, 6f)
                lineTo(8f, 6f)
                lineTo(8f, 4.49f)
                curveTo(8f, 4.215f, 7.774f, 4f, 7.495f, 4f)
                lineTo(6.505f, 4f)
                curveTo(6.214f, 4f, 6f, 4.22f, 6f, 4.49f)
                lineTo(6f, 6.755f)
                lineTo(6f, 8f)
                lineTo(5f, 9f)
                lineTo(16f, 9f)
                lineTo(15f, 8f)
                lineTo(15f, 6.755f)
                lineTo(15f, 4.49f)
                curveTo(15f, 4.215f, 14.774f, 4f, 14.495f, 4f)
                lineTo(13.505f, 4f)
                curveTo(13.214f, 4f, 13f, 4.22f, 13f, 4.49f)
                lineTo(13f, 6f)
                lineTo(12f, 6f)
                lineTo(12f, 3.49f)
                curveTo(12f, 3.215f, 11.778f, 3f, 11.505f, 3f)
                lineTo(9.495f, 3f)
                curveTo(9.216f, 3f, 9f, 3.22f, 9f, 3.49f)
                lineTo(9f, 6f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF262626),
                        1f to Color(0xFF0D0D0D)
                    ),
                    start = Offset(10.5f, 4f),
                    end = Offset(10.5f, 8f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7f, 8f)
                curveTo(6.724f, 8f, 6.5f, 7.776f, 6.5f, 7.5f)
                curveTo(6.5f, 7.224f, 6.724f, 7f, 7f, 7f)
                curveTo(7.276f, 7f, 7.5f, 7.224f, 7.5f, 7.5f)
                curveTo(7.5f, 7.776f, 7.276f, 8f, 7f, 8f)
                close()
                moveTo(7f, 6f)
                curveTo(6.724f, 6f, 6.5f, 5.776f, 6.5f, 5.5f)
                curveTo(6.5f, 5.224f, 6.724f, 5f, 7f, 5f)
                curveTo(7.276f, 5f, 7.5f, 5.224f, 7.5f, 5.5f)
                curveTo(7.5f, 5.776f, 7.276f, 6f, 7f, 6f)
                close()
                moveTo(10.5f, 8f)
                curveTo(10.224f, 8f, 10f, 7.776f, 10f, 7.5f)
                curveTo(10f, 7.224f, 10.224f, 7f, 10.5f, 7f)
                curveTo(10.776f, 7f, 11f, 7.224f, 11f, 7.5f)
                curveTo(11f, 7.776f, 10.776f, 8f, 10.5f, 8f)
                close()
                moveTo(10.5f, 5f)
                curveTo(10.224f, 5f, 10f, 4.776f, 10f, 4.5f)
                curveTo(10f, 4.224f, 10.224f, 4f, 10.5f, 4f)
                curveTo(10.776f, 4f, 11f, 4.224f, 11f, 4.5f)
                curveTo(11f, 4.776f, 10.776f, 5f, 10.5f, 5f)
                close()
                moveTo(14f, 8f)
                curveTo(13.724f, 8f, 13.5f, 7.776f, 13.5f, 7.5f)
                curveTo(13.5f, 7.224f, 13.724f, 7f, 14f, 7f)
                curveTo(14.276f, 7f, 14.5f, 7.224f, 14.5f, 7.5f)
                curveTo(14.5f, 7.776f, 14.276f, 8f, 14f, 8f)
                close()
                moveTo(14f, 6f)
                curveTo(13.724f, 6f, 13.5f, 5.776f, 13.5f, 5.5f)
                curveTo(13.5f, 5.224f, 13.724f, 5f, 14f, 5f)
                curveTo(14.276f, 5f, 14.5f, 5.224f, 14.5f, 5.5f)
                curveTo(14.5f, 5.776f, 14.276f, 6f, 14f, 6f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFECCE3E),
                        1f to Color(0xFFD9BC2D)
                    ),
                    start = Offset(10.5f, 8f),
                    end = Offset(10.5f, 13f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10f, 9.943f)
                lineTo(10f, 12f)
                lineTo(9f, 12f)
                lineTo(9f, 13f)
                lineTo(11f, 13f)
                lineTo(11f, 9.943f)
                curveTo(11.583f, 9.806f, 12f, 9.435f, 12f, 9f)
                curveTo(12f, 8.448f, 11.328f, 8f, 10.5f, 8f)
                curveTo(9.672f, 8f, 9f, 8.448f, 9f, 9f)
                curveTo(9f, 9.435f, 9.417f, 9.806f, 10f, 9.943f)
                close()
            }
        }.build()

        return _GI!!
    }

@Suppress("ObjectPropertyName")
private var _GI: ImageVector? = null
