package flagkit.flags

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import flagkit.FlagKit

val FlagKit.NF: ImageVector
    get() {
        if (_NF != null) {
            return _NF!!
        }
        _NF = ImageVector.Builder(
            name = "NF",
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
                        0f to Color(0xFF219646),
                        1f to Color(0xFF197837)
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
                        0f to Color(0xFF219646),
                        1f to Color(0xFF197837)
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
                moveTo(6f, 0f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(-9f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF259D4B),
                        1f to Color(0xFF197837)
                    ),
                    start = Offset(10.5f, 2f),
                    end = Offset(10.5f, 13f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9.444f, 4.003f)
                lineTo(9.866f, 2.484f)
                curveTo(9.94f, 2.217f, 10.232f, 2f, 10.5f, 2f)
                curveTo(10.776f, 2f, 11.062f, 2.222f, 11.134f, 2.484f)
                lineTo(11.556f, 4.003f)
                curveTo(11.538f, 4.001f, 11.519f, 4f, 11.5f, 4f)
                curveTo(11.224f, 4f, 11f, 4.224f, 11f, 4.5f)
                curveTo(11f, 4.776f, 11.224f, 5f, 11.5f, 5f)
                curveTo(11.615f, 5f, 11.72f, 4.961f, 11.805f, 4.897f)
                lineTo(12.115f, 6.013f)
                curveTo(12.078f, 6.005f, 12.04f, 6f, 12f, 6f)
                curveTo(11.724f, 6f, 11.5f, 6.224f, 11.5f, 6.5f)
                curveTo(11.5f, 6.776f, 11.724f, 7f, 12f, 7f)
                curveTo(12.136f, 7f, 12.259f, 6.946f, 12.349f, 6.858f)
                lineTo(12.675f, 8.032f)
                curveTo(12.621f, 8.011f, 12.562f, 8f, 12.5f, 8f)
                curveTo(12.224f, 8f, 12f, 8.224f, 12f, 8.5f)
                curveTo(12f, 8.776f, 12.224f, 9f, 12.5f, 9f)
                curveTo(12.659f, 9f, 12.8f, 8.926f, 12.892f, 8.811f)
                lineTo(13.5f, 11f)
                lineTo(11f, 11f)
                lineTo(11f, 13f)
                lineTo(10f, 13f)
                lineTo(10f, 11f)
                lineTo(7.5f, 11f)
                lineTo(8.108f, 8.811f)
                curveTo(8.2f, 8.926f, 8.341f, 9f, 8.5f, 9f)
                curveTo(8.776f, 9f, 9f, 8.776f, 9f, 8.5f)
                curveTo(9f, 8.224f, 8.776f, 8f, 8.5f, 8f)
                curveTo(8.438f, 8f, 8.379f, 8.011f, 8.325f, 8.032f)
                lineTo(8.651f, 6.858f)
                curveTo(8.741f, 6.946f, 8.864f, 7f, 9f, 7f)
                curveTo(9.276f, 7f, 9.5f, 6.776f, 9.5f, 6.5f)
                curveTo(9.5f, 6.224f, 9.276f, 6f, 9f, 6f)
                curveTo(8.96f, 6f, 8.922f, 6.005f, 8.885f, 6.013f)
                lineTo(9.195f, 4.897f)
                curveTo(9.28f, 4.961f, 9.385f, 5f, 9.5f, 5f)
                curveTo(9.776f, 5f, 10f, 4.776f, 10f, 4.5f)
                curveTo(10f, 4.224f, 9.776f, 4f, 9.5f, 4f)
                curveTo(9.481f, 4f, 9.462f, 4.001f, 9.444f, 4.003f)
                lineTo(9.444f, 4.003f)
                close()
            }
        }.build()

        return _NF!!
    }

@Suppress("ObjectPropertyName")
private var _NF: ImageVector? = null
