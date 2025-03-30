package flagkit.flags

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathData
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import flagkit.FlagKit

val FlagKit.KE: ImageVector
    get() {
        if (_KE != null) {
            return _KE!!
        }
        _KE = ImageVector.Builder(
            name = "KE",
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
                        0f to Color(0xFF262626),
                        1f to Color(0xFF0D0D0D)
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
                        0f to Color(0xFF018301),
                        1f to Color(0xFF006700)
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
                    end = Offset(10.5f, 11f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 4f)
                horizontalLineToRelative(21f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-21f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFDC0808),
                        1f to Color(0xFFBC0000)
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
                fill = SolidColor(Color(0xFFBC0000)),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.5f, 12.5f)
                curveTo(11.5f, 12.5f, 13f, 10.538f, 13f, 7.5f)
                curveTo(13f, 4.462f, 11.5f, 2.5f, 10.5f, 2.5f)
                curveTo(9.5f, 2.5f, 8f, 4.462f, 8f, 7.5f)
                curveTo(8f, 10.538f, 9.5f, 12.5f, 10.5f, 12.5f)
                close()
            }
            group(
                clipPathData = PathData {
                    moveTo(10.5f, 12.5f)
                    curveTo(11.5f, 12.5f, 13f, 10.538f, 13f, 7.5f)
                    curveTo(13f, 4.462f, 11.5f, 2.5f, 10.5f, 2.5f)
                    curveTo(9.5f, 2.5f, 8f, 4.462f, 8f, 7.5f)
                    curveTo(8f, 10.538f, 9.5f, 12.5f, 10.5f, 12.5f)
                    close()
                }
            ) {
                path(
                    fill = Brush.linearGradient(
                        colorStops = arrayOf(
                            0f to Color(0xFF262626),
                            1f to Color(0xFF0D0D0D)
                        ),
                        start = Offset(6.5f, 2f),
                        end = Offset(6.5f, 13f)
                    ),
                    strokeLineWidth = 1f,
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(4f, 7.5f)
                    arcToRelative(2.5f, 5.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 5f, 0f)
                    arcToRelative(2.5f, 5.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, -5f, 0f)
                    close()
                }
            }
            group(
                clipPathData = PathData {
                    moveTo(10.5f, 12.5f)
                    curveTo(11.5f, 12.5f, 13f, 10.538f, 13f, 7.5f)
                    curveTo(13f, 4.462f, 11.5f, 2.5f, 10.5f, 2.5f)
                    curveTo(9.5f, 2.5f, 8f, 4.462f, 8f, 7.5f)
                    curveTo(8f, 10.538f, 9.5f, 12.5f, 10.5f, 12.5f)
                    close()
                }
            ) {
                path(
                    fill = Brush.linearGradient(
                        colorStops = arrayOf(
                            0f to Color(0xFF262626),
                            1f to Color(0xFF0D0D0D)
                        ),
                        start = Offset(14.5f, 2f),
                        end = Offset(14.5f, 13f)
                    ),
                    strokeLineWidth = 1f,
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(12f, 7.5f)
                    arcToRelative(2.5f, 5.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 5f, 0f)
                    arcToRelative(2.5f, 5.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, -5f, 0f)
                    close()
                }
            }
            group(
                clipPathData = PathData {
                    moveTo(10.5f, 12.5f)
                    curveTo(11.5f, 12.5f, 13f, 10.538f, 13f, 7.5f)
                    curveTo(13f, 4.462f, 11.5f, 2.5f, 10.5f, 2.5f)
                    curveTo(9.5f, 2.5f, 8f, 4.462f, 8f, 7.5f)
                    curveTo(8f, 10.538f, 9.5f, 12.5f, 10.5f, 12.5f)
                    close()
                }
            ) {
                path(
                    fill = Brush.linearGradient(
                        colorStops = arrayOf(
                            0f to Color(0xFFFFFFFF),
                            1f to Color(0xFFF0F0F0)
                        ),
                        start = Offset(10.5f, 2f),
                        end = Offset(10.5f, 13f)
                    ),
                    strokeLineWidth = 1f,
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(10.5f, 9f)
                    curveTo(10.224f, 9f, 10f, 8.328f, 10f, 7.5f)
                    curveTo(10f, 6.672f, 10.224f, 6f, 10.5f, 6f)
                    curveTo(10.776f, 6f, 11f, 6.672f, 11f, 7.5f)
                    curveTo(11f, 8.328f, 10.776f, 9f, 10.5f, 9f)
                    close()
                    moveTo(10.5f, 6f)
                    curveTo(10.224f, 6f, 10f, 5.105f, 10f, 4f)
                    curveTo(10f, 2.895f, 10.224f, 2f, 10.5f, 2f)
                    curveTo(10.776f, 2f, 11f, 2.895f, 11f, 4f)
                    curveTo(11f, 5.105f, 10.776f, 6f, 10.5f, 6f)
                    close()
                    moveTo(10.5f, 13f)
                    curveTo(10.224f, 13f, 10f, 12.105f, 10f, 11f)
                    curveTo(10f, 9.895f, 10.224f, 9f, 10.5f, 9f)
                    curveTo(10.776f, 9f, 11f, 9.895f, 11f, 11f)
                    curveTo(11f, 12.105f, 10.776f, 13f, 10.5f, 13f)
                    close()
                }
            }
        }.build()

        return _KE!!
    }

@Suppress("ObjectPropertyName")
private var _KE: ImageVector? = null
