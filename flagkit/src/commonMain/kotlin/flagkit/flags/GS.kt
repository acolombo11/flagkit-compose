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

val FlagKit.GS: ImageVector
    get() {
        if (_GS != null) {
            return _GS!!
        }
        _GS = ImageVector.Builder(
            name = "GS",
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
                        0f to Color(0xFF07319C),
                        1f to Color(0xFF00247E)
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
                    start = Offset(4.074f, -0.902f),
                    end = Offset(4.074f, 7.902f)
                ),
                strokeLineWidth = 1f
            ) {
                moveTo(3f, 3.23f)
                lineTo(-1.352f, -0.5f)
                lineTo(0.66f, -0.5f)
                lineTo(4.16f, 2f)
                lineTo(4.857f, 2f)
                lineTo(9.5f, -0.902f)
                lineTo(9.5f, 0.25f)
                curveTo(9.5f, 0.553f, 9.333f, 0.877f, 9.082f, 1.056f)
                lineTo(6f, 3.257f)
                lineTo(6f, 3.77f)
                lineTo(9.137f, 6.459f)
                curveTo(9.599f, 6.855f, 9.341f, 7.5f, 8.75f, 7.5f)
                curveTo(8.505f, 7.5f, 8.205f, 7.404f, 8.001f, 7.258f)
                lineTo(4.84f, 5f)
                lineTo(4.143f, 5f)
                lineTo(-0.5f, 7.902f)
                lineTo(-0.5f, 6.243f)
                lineTo(3f, 3.743f)
                lineTo(3f, 3.23f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFDB1E36),
                        1f to Color(0xFFD51931)
                    ),
                    start = Offset(4.5f, 0f),
                    end = Offset(4.5f, 7f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3.5f, 3f)
                lineTo(-0f, -0f)
                lineTo(0.5f, -0f)
                lineTo(4f, 2.5f)
                lineTo(5f, 2.5f)
                lineTo(9f, -0f)
                lineTo(9f, 0.25f)
                curveTo(9f, 0.388f, 8.913f, 0.562f, 8.792f, 0.649f)
                lineTo(5.5f, 3f)
                lineTo(5.5f, 4f)
                lineTo(8.812f, 6.839f)
                curveTo(8.916f, 6.928f, 8.884f, 7f, 8.75f, 7f)
                lineTo(8.75f, 7f)
                curveTo(8.612f, 7f, 8.413f, 6.938f, 8.292f, 6.851f)
                lineTo(5f, 4.5f)
                lineTo(4f, 4.5f)
                lineTo(-0f, 7f)
                lineTo(-0f, 6.5f)
                lineTo(3.5f, 4f)
                lineTo(3.5f, 3f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFFFFF),
                        1f to Color(0xFFF0F0F0)
                    ),
                    start = Offset(4.75f, 0f),
                    end = Offset(4.75f, 7.5f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(-0f, 2.5f)
                lineTo(-0f, 4.5f)
                lineTo(3.5f, 4.5f)
                lineTo(3.5f, 7.005f)
                curveTo(3.5f, 7.278f, 3.714f, 7.5f, 4.005f, 7.5f)
                lineTo(4.995f, 7.5f)
                curveTo(5.274f, 7.5f, 5.5f, 7.284f, 5.5f, 7.005f)
                lineTo(5.5f, 4.5f)
                lineTo(9.01f, 4.5f)
                curveTo(9.28f, 4.5f, 9.5f, 4.286f, 9.5f, 3.995f)
                lineTo(9.5f, 3.005f)
                curveTo(9.5f, 2.726f, 9.285f, 2.5f, 9.01f, 2.5f)
                lineTo(5.5f, 2.5f)
                lineTo(5.5f, -0f)
                lineTo(3.5f, -0f)
                lineTo(3.5f, 2.5f)
                lineTo(-0f, 2.5f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFDB1E36),
                        1f to Color(0xFFD51931)
                    ),
                    start = Offset(4.5f, 0f),
                    end = Offset(4.5f, 7f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(-0f, 3f)
                lineToRelative(4f, 0f)
                lineToRelative(0f, -0.5f)
                lineToRelative(0f, -2.5f)
                lineToRelative(1f, 0f)
                lineToRelative(0f, 2.5f)
                lineToRelative(0f, 0.5f)
                lineToRelative(4f, 0f)
                lineToRelative(0f, 1f)
                lineToRelative(-4f, 0f)
                lineToRelative(0f, 0.5f)
                lineToRelative(0f, 2.5f)
                lineToRelative(-1f, 0f)
                lineToRelative(0f, -2.5f)
                lineToRelative(0f, -0.5f)
                lineToRelative(-4f, 0f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF1E1E1E),
                        1f to Color(0xFF000000)
                    ),
                    start = Offset(18.5f, 8f),
                    end = Offset(18.5f, 11f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(17.5f, 9.5f)
                arcToRelative(1f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2f, 0f)
                arcToRelative(1f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, -2f, 0f)
                close()
            }
            group(
                clipPathData = PathData {
                    moveTo(17.5f, 9.5f)
                    arcToRelative(1f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2f, 0f)
                    arcToRelative(1f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, -2f, 0f)
                    close()
                }
            ) {
                path(
                    fill = Brush.linearGradient(
                        colorStops = arrayOf(
                            0f to Color(0xFFFFFFFF),
                            1f to Color(0xFFF0F0F0)
                        ),
                        start = Offset(18f, 8.5f),
                        end = Offset(18f, 11.5f)
                    ),
                    strokeLineWidth = 1f,
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(17f, 10f)
                    arcToRelative(1f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2f, 0f)
                    arcToRelative(1f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, -2f, 0f)
                    close()
                }
                path(
                    fill = Brush.linearGradient(
                        colorStops = arrayOf(
                            0f to Color(0xFFA2ADB0),
                            1f to Color(0xFF8B9497)
                        ),
                        start = Offset(14.5f, 8f),
                        end = Offset(14.5f, 11f)
                    ),
                    strokeLineWidth = 1f,
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(13.5f, 9.5f)
                    arcToRelative(1f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2f, 0f)
                    arcToRelative(1f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, -2f, 0f)
                    close()
                }
            }
            group(
                clipPathData = PathData {
                    moveTo(13.5f, 9.5f)
                    arcToRelative(1f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2f, 0f)
                    arcToRelative(1f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, -2f, 0f)
                    close()
                }
            ) {
                path(
                    fill = Brush.linearGradient(
                        colorStops = arrayOf(
                            0f to Color(0xFF4F4F4F),
                            1f to Color(0xFF2B2B2B)
                        ),
                        start = Offset(15f, 8.5f),
                        end = Offset(15f, 11.5f)
                    ),
                    strokeLineWidth = 1f,
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(14f, 10f)
                    arcToRelative(1f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2f, 0f)
                    arcToRelative(1f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, -2f, 0f)
                    close()
                }
                path(
                    fill = Brush.linearGradient(
                        colorStops = arrayOf(
                            0f to Color(0xFFFEC241),
                            1f to Color(0xFFFEBB2C)
                        ),
                        start = Offset(16.5f, 12f),
                        end = Offset(16.5f, 12.797f)
                    ),
                    strokeLineWidth = 1f,
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(16.5f, 12.5f)
                    curveTo(17.328f, 13f, 18f, 12.776f, 18f, 12.5f)
                    curveTo(18f, 12.224f, 17.328f, 12f, 16.5f, 12f)
                    curveTo(15.672f, 12f, 15f, 12.224f, 15f, 12.5f)
                    curveTo(15f, 12.776f, 15.672f, 13f, 16.5f, 12.5f)
                    close()
                }
                path(
                    fill = Brush.linearGradient(
                        colorStops = arrayOf(
                            0f to Color(0xFFFFFFFF),
                            1f to Color(0xFFF0F0F0)
                        ),
                        start = Offset(18.5f, 4.5f),
                        end = Offset(18.5f, 6.5f)
                    ),
                    strokeLineWidth = 1f,
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(18.5f, 5.5f)
                    moveToRelative(-1f, 0f)
                    arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, 0f)
                    arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 0f)
                }
                path(
                    fill = Brush.linearGradient(
                        colorStops = arrayOf(
                            0f to Color(0xFFA84B14),
                            1f to Color(0xFF913F0E)
                        ),
                        start = Offset(16.5f, 3.5f),
                        end = Offset(16.5f, 5.5f)
                    ),
                    strokeLineWidth = 1f,
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(16.5f, 4.5f)
                    moveToRelative(-1f, 0f)
                    arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, 0f)
                    arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 0f)
                }
                path(
                    fill = Brush.linearGradient(
                        colorStops = arrayOf(
                            0f to Color(0xFFCFB063),
                            1f to Color(0xFFBEA157)
                        ),
                        start = Offset(16.5f, 2.75f),
                        end = Offset(16.5f, 4.75f)
                    ),
                    strokeLineWidth = 1f,
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(15.5f, 3.75f)
                    arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2f, 0f)
                    arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, -2f, 0f)
                    close()
                }
                path(
                    fill = Brush.linearGradient(
                        colorStops = arrayOf(
                            0f to Color(0xFFFFFFFF),
                            1f to Color(0xFFF0F0F0)
                        ),
                        start = Offset(16.5f, 10.5f),
                        end = Offset(16.5f, 12.5f)
                    ),
                    strokeLineWidth = 1f,
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(16.5f, 11.5f)
                    moveToRelative(-1f, 0f)
                    arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, 0f)
                    arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 0f)
                }
                path(
                    fill = Brush.linearGradient(
                        colorStops = arrayOf(
                            0f to Color(0xFFFFFFFF),
                            1f to Color(0xFFF0F0F0)
                        ),
                        start = Offset(14.5f, 4.5f),
                        end = Offset(14.5f, 6.5f)
                    ),
                    strokeLineWidth = 1f,
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(14.5f, 5.5f)
                    moveToRelative(-1f, 0f)
                    arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, 0f)
                    arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 0f)
                }
                path(
                    fill = Brush.linearGradient(
                        colorStops = arrayOf(
                            0f to Color(0xFF2D42FF),
                            1f to Color(0xFF0B24FC)
                        ),
                        start = Offset(15f, 5.5f),
                        end = Offset(15f, 7.5f)
                    ),
                    strokeLineWidth = 1f,
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(15f, 6.5f)
                    moveToRelative(-1f, 0f)
                    arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, 0f)
                    arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 0f)
                }
                path(
                    fill = Brush.linearGradient(
                        colorStops = arrayOf(
                            0f to Color(0xFF2D42FF),
                            1f to Color(0xFF0B24FC)
                        ),
                        start = Offset(18f, 5.5f),
                        end = Offset(18f, 7.5f)
                    ),
                    strokeLineWidth = 1f,
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(18f, 6.5f)
                    moveToRelative(-1f, 0f)
                    arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, 0f)
                    arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 0f)
                }
                path(
                    fill = Brush.linearGradient(
                        colorStops = arrayOf(
                            0f to Color(0xFFE3DC3D),
                            1f to Color(0xFFCFC82A)
                        ),
                        start = Offset(18f, 7f),
                        end = Offset(20f, 8f)
                    ),
                    strokeLineWidth = 1f,
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(18f, 8f)
                    arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2f, 0f)
                    arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, -2f, 0f)
                    close()
                }
                path(
                    fill = Brush.linearGradient(
                        colorStops = arrayOf(
                            0f to Color(0xFF7F7D7D),
                            1f to Color(0xFF656263)
                        ),
                        start = Offset(16.5f, 5f),
                        end = Offset(16.5f, 8f)
                    ),
                    strokeLineWidth = 1f,
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(16f, 7.5f)
                    lineTo(15.5f, 8f)
                    lineTo(17.5f, 8f)
                    lineTo(17f, 7.5f)
                    lineTo(17.5f, 6f)
                    curveTo(17.5f, 6f, 17.052f, 5f, 16.5f, 5f)
                    curveTo(15.948f, 5f, 15.5f, 6f, 15.5f, 6f)
                    lineTo(16f, 7.5f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF5D0543)),
                    strokeLineWidth = 1f,
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(16.5f, 6.5f)
                    curveTo(16.5f, 6.5f, 17f, 6.388f, 17f, 6.12f)
                    curveTo(17f, 6.112f, 16.5f, 6f, 16.5f, 6f)
                    curveTo(16.5f, 6f, 16f, 6.112f, 16f, 6.12f)
                    curveTo(16f, 6.388f, 16.5f, 6.5f, 16.5f, 6.5f)
                    close()
                }
                path(
                    fill = Brush.linearGradient(
                        colorStops = arrayOf(
                            0f to Color(0xFFFFFFFF),
                            1f to Color(0xFFF0F0F0)
                        ),
                        start = Offset(16.518f, 8f),
                        end = Offset(16.518f, 11.417f)
                    ),
                    strokeLineWidth = 1f,
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(15.007f, 8.506f)
                    curveTo(15.003f, 8.227f, 15.216f, 8f, 15.495f, 8f)
                    lineTo(17.505f, 8f)
                    curveTo(17.778f, 8f, 18.003f, 8.231f, 18.007f, 8.506f)
                    lineTo(18.03f, 10.251f)
                    curveTo(18.032f, 10.389f, 17.934f, 10.566f, 17.823f, 10.639f)
                    lineTo(16.728f, 11.361f)
                    curveTo(16.611f, 11.438f, 16.42f, 11.434f, 16.311f, 11.361f)
                    lineTo(15.24f, 10.639f)
                    curveTo(15.126f, 10.562f, 15.032f, 10.393f, 15.03f, 10.251f)
                    lineTo(15.007f, 8.506f)
                    close()
                }
            }
            group(
                clipPathData = PathData {
                    moveTo(15.007f, 8.506f)
                    curveTo(15.003f, 8.227f, 15.216f, 8f, 15.495f, 8f)
                    lineTo(17.505f, 8f)
                    curveTo(17.778f, 8f, 18.003f, 8.231f, 18.007f, 8.506f)
                    lineTo(18.03f, 10.251f)
                    curveTo(18.032f, 10.389f, 17.934f, 10.566f, 17.823f, 10.639f)
                    lineTo(16.728f, 11.361f)
                    curveTo(16.611f, 11.438f, 16.42f, 11.434f, 16.311f, 11.361f)
                    lineTo(15.24f, 10.639f)
                    curveTo(15.126f, 10.562f, 15.032f, 10.393f, 15.03f, 10.251f)
                    lineTo(15.007f, 8.506f)
                    close()
                }
            ) {
                path(
                    fill = SolidColor(Color(0xFF225DA4)),
                    strokeLineWidth = 1f,
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(17.5f, 10.5f)
                    moveToRelative(-1f, 0f)
                    arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, 0f)
                    arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 0f)
                }
            }
            group(
                clipPathData = PathData {
                    moveTo(15.007f, 8.506f)
                    curveTo(15.003f, 8.227f, 15.216f, 8f, 15.495f, 8f)
                    lineTo(17.505f, 8f)
                    curveTo(17.778f, 8f, 18.003f, 8.231f, 18.007f, 8.506f)
                    lineTo(18.03f, 10.251f)
                    curveTo(18.032f, 10.389f, 17.934f, 10.566f, 17.823f, 10.639f)
                    lineTo(16.728f, 11.361f)
                    curveTo(16.611f, 11.438f, 16.42f, 11.434f, 16.311f, 11.361f)
                    lineTo(15.24f, 10.639f)
                    curveTo(15.126f, 10.562f, 15.032f, 10.393f, 15.03f, 10.251f)
                    lineTo(15.007f, 8.506f)
                    close()
                }
            ) {
                path(
                    fill = SolidColor(Color(0xFF225DA4)),
                    strokeLineWidth = 1f,
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(15.5f, 9.5f)
                    moveToRelative(-1f, 0f)
                    arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, 0f)
                    arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 0f)
                }
            }
            group(
                clipPathData = PathData {
                    moveTo(15.007f, 8.506f)
                    curveTo(15.003f, 8.227f, 15.216f, 8f, 15.495f, 8f)
                    lineTo(17.505f, 8f)
                    curveTo(17.778f, 8f, 18.003f, 8.231f, 18.007f, 8.506f)
                    lineTo(18.03f, 10.251f)
                    curveTo(18.032f, 10.389f, 17.934f, 10.566f, 17.823f, 10.639f)
                    lineTo(16.728f, 11.361f)
                    curveTo(16.611f, 11.438f, 16.42f, 11.434f, 16.311f, 11.361f)
                    lineTo(15.24f, 10.639f)
                    curveTo(15.126f, 10.562f, 15.032f, 10.393f, 15.03f, 10.251f)
                    lineTo(15.007f, 8.506f)
                    close()
                }
            ) {
                path(
                    fill = Brush.linearGradient(
                        colorStops = arrayOf(
                            0f to Color(0xFF0F8012),
                            1f to Color(0xFF0B6A0D)
                        ),
                        start = Offset(16.5f, 8f),
                        end = Offset(16.5f, 11f)
                    ),
                    strokeLineWidth = 1f,
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(15f, 8f)
                    lineToRelative(3f, 0f)
                    lineToRelative(-1.5f, 3f)
                    close()
                }
            }
            group(
                clipPathData = PathData {
                    moveTo(15.007f, 8.506f)
                    curveTo(15.003f, 8.227f, 15.216f, 8f, 15.495f, 8f)
                    lineTo(17.505f, 8f)
                    curveTo(17.778f, 8f, 18.003f, 8.231f, 18.007f, 8.506f)
                    lineTo(18.03f, 10.251f)
                    curveTo(18.032f, 10.389f, 17.934f, 10.566f, 17.823f, 10.639f)
                    lineTo(16.728f, 11.361f)
                    curveTo(16.611f, 11.438f, 16.42f, 11.434f, 16.311f, 11.361f)
                    lineTo(15.24f, 10.639f)
                    curveTo(15.126f, 10.562f, 15.032f, 10.393f, 15.03f, 10.251f)
                    lineTo(15.007f, 8.506f)
                    close()
                }
            ) {
                path(
                    fill = Brush.linearGradient(
                        colorStops = arrayOf(
                            0f to Color(0xFFFFCF44),
                            1f to Color(0xFFFCC72E)
                        ),
                        start = Offset(16.5f, 8.5f),
                        end = Offset(16.5f, 10.5f)
                    ),
                    strokeLineWidth = 1f,
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(15.5f, 9.5f)
                    arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2f, 0f)
                    arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, -2f, 0f)
                    close()
                }
            }
        }.build()

        return _GS!!
    }

@Suppress("ObjectPropertyName")
private var _GS: ImageVector? = null
