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

val FlagKit.RS: ImageVector
    get() {
        if (_RS != null) {
            return _RS!!
        }
        _RS = ImageVector.Builder(
            name = "RS",
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
                        0f to Color(0xFF17508F),
                        1f to Color(0xFF114175)
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
                        0f to Color(0xFFE1444D),
                        1f to Color(0xFFC53840)
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
                        0f to Color(0xFFFFFFFF),
                        1f to Color(0xFFF0F0F0)
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
                    start = Offset(6.5f, 5f),
                    end = Offset(6.5f, 11f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4.5f, 7.5f)
                curveTo(4.5f, 6.826f, 4.874f, 5.485f, 4.874f, 5.485f)
                curveTo(4.944f, 5.217f, 5.216f, 5f, 5.495f, 5f)
                lineTo(7.505f, 5f)
                curveTo(7.778f, 5f, 8.057f, 5.214f, 8.126f, 5.481f)
                curveTo(8.126f, 5.481f, 8.5f, 6.81f, 8.5f, 7.5f)
                curveTo(8.5f, 8.145f, 8.124f, 9.519f, 8.124f, 9.519f)
                curveTo(8.055f, 9.785f, 7.855f, 10.174f, 7.667f, 10.372f)
                curveTo(7.667f, 10.372f, 7.25f, 11f, 6.5f, 11f)
                curveTo(5.75f, 11f, 5.333f, 10.372f, 5.333f, 10.372f)
                curveTo(5.149f, 10.167f, 4.943f, 9.783f, 4.874f, 9.513f)
                curveTo(4.874f, 9.513f, 4.5f, 8.161f, 4.5f, 7.5f)
                close()
            }
            group(
                clipPathData = PathData {
                    moveTo(4.5f, 7.5f)
                    curveTo(4.5f, 6.826f, 4.874f, 5.485f, 4.874f, 5.485f)
                    curveTo(4.944f, 5.217f, 5.216f, 5f, 5.495f, 5f)
                    lineTo(7.505f, 5f)
                    curveTo(7.778f, 5f, 8.057f, 5.214f, 8.126f, 5.481f)
                    curveTo(8.126f, 5.481f, 8.5f, 6.81f, 8.5f, 7.5f)
                    curveTo(8.5f, 8.145f, 8.124f, 9.519f, 8.124f, 9.519f)
                    curveTo(8.055f, 9.785f, 7.855f, 10.174f, 7.667f, 10.372f)
                    curveTo(7.667f, 10.372f, 7.25f, 11f, 6.5f, 11f)
                    curveTo(5.75f, 11f, 5.333f, 10.372f, 5.333f, 10.372f)
                    curveTo(5.149f, 10.167f, 4.943f, 9.783f, 4.874f, 9.513f)
                    curveTo(4.874f, 9.513f, 4.5f, 8.161f, 4.5f, 7.5f)
                    close()
                }
            ) {
                path(
                    fill = SolidColor(Color(0xFFC43840)),
                    strokeLineWidth = 1f
                ) {
                    moveTo(8.422f, 4.797f)
                    lineToRelative(-4.625f, 5.781f)
                    lineToRelative(0.781f, 0.625f)
                    lineToRelative(4.625f, -5.781f)
                    close()
                }
            }
            group(
                clipPathData = PathData {
                    moveTo(4.5f, 7.5f)
                    curveTo(4.5f, 6.826f, 4.874f, 5.485f, 4.874f, 5.485f)
                    curveTo(4.944f, 5.217f, 5.216f, 5f, 5.495f, 5f)
                    lineTo(7.505f, 5f)
                    curveTo(7.778f, 5f, 8.057f, 5.214f, 8.126f, 5.481f)
                    curveTo(8.126f, 5.481f, 8.5f, 6.81f, 8.5f, 7.5f)
                    curveTo(8.5f, 8.145f, 8.124f, 9.519f, 8.124f, 9.519f)
                    curveTo(8.055f, 9.785f, 7.855f, 10.174f, 7.667f, 10.372f)
                    curveTo(7.667f, 10.372f, 7.25f, 11f, 6.5f, 11f)
                    curveTo(5.75f, 11f, 5.333f, 10.372f, 5.333f, 10.372f)
                    curveTo(5.149f, 10.167f, 4.943f, 9.783f, 4.874f, 9.513f)
                    curveTo(4.874f, 9.513f, 4.5f, 8.161f, 4.5f, 7.5f)
                    close()
                }
            ) {
                path(
                    fill = SolidColor(Color(0xFFC43840)),
                    strokeLineWidth = 1f
                ) {
                    moveTo(3.797f, 5.422f)
                    lineToRelative(4.625f, 5.781f)
                    lineToRelative(0.781f, -0.625f)
                    lineToRelative(-4.625f, -5.781f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFFFFFFFF)),
                    strokeLineWidth = 1f,
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(5.5f, 7.5f)
                    arcToRelative(1f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2f, 0f)
                    arcToRelative(1f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, -2f, 0f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFFD1A43A)),
                    strokeLineWidth = 1f,
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(5f, 4f)
                    lineTo(4.5f, 3f)
                    lineTo(5.5f, 3.5f)
                    lineTo(6.5f, 3f)
                    lineTo(7.5f, 3.5f)
                    lineTo(8.5f, 3f)
                    lineTo(8f, 4f)
                    lineTo(8f, 4.5f)
                    curveTo(8f, 4.776f, 7.784f, 5f, 7.505f, 5f)
                    lineTo(5.495f, 5f)
                    curveTo(5.222f, 5f, 5f, 4.768f, 5f, 4.5f)
                    lineTo(5f, 4f)
                    close()
                }
            }
        }.build()

        return _RS!!
    }

@Suppress("ObjectPropertyName")
private var _RS: ImageVector? = null
