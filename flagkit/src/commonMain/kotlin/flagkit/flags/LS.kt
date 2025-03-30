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

val FlagKit.LS: ImageVector
    get() {
        if (_LS != null) {
            return _LS!!
        }
        _LS = ImageVector.Builder(
            name = "LS",
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
                        0f to Color(0xFF0C33B8),
                        1f to Color(0xFF05279D)
                    ),
                    start = Offset(10.5f, 0f),
                    end = Offset(10.5f, 5f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(21f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-21f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF1DB158),
                        1f to Color(0xFF149447)
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
                        0f to Color(0xFFFFFFFF),
                        1f to Color(0xFFF0F0F0)
                    ),
                    start = Offset(10.5f, 5f),
                    end = Offset(10.5f, 10f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 5f)
                horizontalLineToRelative(21f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-21f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF262626),
                        1f to Color(0xFF0D0D0D)
                    ),
                    start = Offset(10.502f, 6.277f),
                    end = Offset(10.502f, 9.5f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10f, 7.5f)
                lineTo(10.342f, 6.475f)
                curveTo(10.429f, 6.212f, 10.57f, 6.209f, 10.658f, 6.475f)
                lineTo(11f, 7.5f)
                lineTo(11.861f, 8.791f)
                curveTo(11.938f, 8.907f, 11.918f, 9.07f, 11.806f, 9.147f)
                curveTo(11.806f, 9.147f, 11.5f, 9.5f, 10.5f, 9.5f)
                curveTo(9.5f, 9.5f, 9.194f, 9.147f, 9.194f, 9.147f)
                curveTo(9.087f, 9.066f, 9.066f, 8.902f, 9.139f, 8.791f)
                lineTo(10f, 7.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF242424)),
                strokeLineWidth = 1f
            ) {
                moveTo(10.5f, 7.5f)
                curveTo(9.948f, 7.5f, 9.5f, 7.052f, 9.5f, 6.5f)
                curveTo(9.5f, 5.948f, 9.948f, 5.5f, 10.5f, 5.5f)
                curveTo(11.052f, 5.5f, 11.5f, 5.948f, 11.5f, 6.5f)
                curveTo(11.5f, 7.052f, 11.052f, 7.5f, 10.5f, 7.5f)
                close()
                moveTo(10.5f, 7.5f)
                curveTo(10.776f, 7.5f, 11f, 6.776f, 11f, 6.5f)
                curveTo(11f, 6.224f, 10.776f, 6f, 10.5f, 6f)
                curveTo(10.224f, 6f, 10f, 6.224f, 10f, 6.5f)
                curveTo(10f, 6.776f, 10.224f, 7.5f, 10.5f, 7.5f)
                close()
            }
        }.build()

        return _LS!!
    }

@Suppress("ObjectPropertyName")
private var _LS: ImageVector? = null
