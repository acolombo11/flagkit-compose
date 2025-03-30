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

val FlagKit.GU: ImageVector
    get() {
        if (_GU != null) {
            return _GU!!
        }
        _GU = ImageVector.Builder(
            name = "GU",
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
                        0f to Color(0xFFDE3149),
                        1f to Color(0xFFC2273D)
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
                        0f to Color(0xFF053B94),
                        1f to Color(0xFF002E7A)
                    ),
                    start = Offset(10.5f, 1f),
                    end = Offset(10.5f, 14f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(1.75f, 1f)
                lineTo(19.25f, 1f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 1.75f)
                lineTo(20f, 13.25f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.25f, 14f)
                lineTo(1.75f, 14f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 13.25f)
                lineTo(1f, 1.75f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.75f, 1f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFDE3149),
                        1f to Color(0xFFC2273D)
                    ),
                    start = Offset(10.5f, 3f),
                    end = Offset(10.5f, 12f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.5f, 12f)
                curveTo(10.5f, 12f, 13.5f, 9.985f, 13.5f, 7.5f)
                curveTo(13.5f, 5.015f, 10.5f, 3f, 10.5f, 3f)
                curveTo(10.5f, 3f, 7.5f, 5.015f, 7.5f, 7.5f)
                curveTo(7.5f, 9.985f, 10.5f, 12f, 10.5f, 12f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFFFFF),
                        1f to Color(0xFFF0F0F0)
                    ),
                    start = Offset(10.5f, 3.5f),
                    end = Offset(10.5f, 11.5f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.5f, 11.5f)
                curveTo(10.5f, 11.5f, 13f, 9.5f, 13f, 7.5f)
                curveTo(13f, 5.5f, 10.5f, 3.5f, 10.5f, 3.5f)
                curveTo(10.5f, 3.5f, 8f, 5.5f, 8f, 7.5f)
                curveTo(8f, 9.5f, 10.5f, 11.5f, 10.5f, 11.5f)
                close()
            }
            group(
                clipPathData = PathData {
                    moveTo(10.5f, 11.5f)
                    curveTo(10.5f, 11.5f, 13f, 9.5f, 13f, 7.5f)
                    curveTo(13f, 5.5f, 10.5f, 3.5f, 10.5f, 3.5f)
                    curveTo(10.5f, 3.5f, 8f, 5.5f, 8f, 7.5f)
                    curveTo(8f, 9.5f, 10.5f, 11.5f, 10.5f, 11.5f)
                    close()
                }
            ) {
                path(
                    fill = Brush.linearGradient(
                        colorStops = arrayOf(
                            0f to Color(0xFF81C1F3),
                            1f to Color(0xFF6AB1E9)
                        ),
                        start = Offset(10.5f, 3f),
                        end = Offset(10.5f, 8f)
                    ),
                    strokeLineWidth = 1f,
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(8f, 3f)
                    horizontalLineToRelative(5f)
                    verticalLineToRelative(5f)
                    horizontalLineToRelative(-5f)
                    close()
                }
            }
            group(
                clipPathData = PathData {
                    moveTo(10.5f, 11.5f)
                    curveTo(10.5f, 11.5f, 13f, 9.5f, 13f, 7.5f)
                    curveTo(13f, 5.5f, 10.5f, 3.5f, 10.5f, 3.5f)
                    curveTo(10.5f, 3.5f, 8f, 5.5f, 8f, 7.5f)
                    curveTo(8f, 9.5f, 10.5f, 11.5f, 10.5f, 11.5f)
                    close()
                }
            ) {
                path(
                    fill = Brush.linearGradient(
                        colorStops = arrayOf(
                            0f to Color(0xFF27A07E),
                            1f to Color(0xFF1F9171)
                        ),
                        start = Offset(10.5f, 5f),
                        end = Offset(10.5f, 7.714f)
                    ),
                    strokeLineWidth = 1f,
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(10.5f, 7.1f)
                    lineToRelative(-0.882f, 0.614f)
                    lineToRelative(0.311f, -1.028f)
                    lineToRelative(-0.856f, -0.649f)
                    lineToRelative(1.074f, -0.022f)
                    lineToRelative(0.353f, -1.015f)
                    lineToRelative(0.353f, 1.015f)
                    lineToRelative(1.074f, 0.022f)
                    lineToRelative(-0.856f, 0.649f)
                    lineToRelative(0.311f, 1.028f)
                    close()
                }
            }
            group(
                clipPathData = PathData {
                    moveTo(10.5f, 11.5f)
                    curveTo(10.5f, 11.5f, 13f, 9.5f, 13f, 7.5f)
                    curveTo(13f, 5.5f, 10.5f, 3.5f, 10.5f, 3.5f)
                    curveTo(10.5f, 3.5f, 8f, 5.5f, 8f, 7.5f)
                    curveTo(8f, 9.5f, 10.5f, 11.5f, 10.5f, 11.5f)
                    close()
                }
            ) {
                path(
                    fill = Brush.linearGradient(
                        colorStops = arrayOf(
                            0f to Color(0xFF1E8CE8),
                            1f to Color(0xFF107FDC)
                        ),
                        start = Offset(10.5f, 8f),
                        end = Offset(10.5f, 12f)
                    ),
                    strokeLineWidth = 1f,
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(8f, 8f)
                    horizontalLineToRelative(5f)
                    verticalLineToRelative(4f)
                    horizontalLineToRelative(-5f)
                    close()
                }
            }
            group(
                clipPathData = PathData {
                    moveTo(10.5f, 11.5f)
                    curveTo(10.5f, 11.5f, 13f, 9.5f, 13f, 7.5f)
                    curveTo(13f, 5.5f, 10.5f, 3.5f, 10.5f, 3.5f)
                    curveTo(10.5f, 3.5f, 8f, 5.5f, 8f, 7.5f)
                    curveTo(8f, 9.5f, 10.5f, 11.5f, 10.5f, 11.5f)
                    close()
                }
            ) {
                path(
                    fill = Brush.linearGradient(
                        colorStops = arrayOf(
                            0f to Color(0xFFFFF048),
                            1f to Color(0xFFFFEF36)
                        ),
                        start = Offset(10.5f, 9f),
                        end = Offset(10.5f, 12f)
                    ),
                    strokeLineWidth = 1f,
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(8f, 9f)
                    curveTo(8f, 9f, 9.59f, 10.5f, 10f, 10.5f)
                    curveTo(10.488f, 10.5f, 10.496f, 9.777f, 11f, 9.5f)
                    curveTo(11.794f, 9.064f, 13f, 9f, 13f, 9f)
                    lineTo(13f, 12f)
                    lineTo(8f, 12f)
                    lineTo(8f, 9f)
                    close()
                }
                path(
                    fill = Brush.linearGradient(
                        colorStops = arrayOf(
                            0f to Color(0xFF8F5715),
                            1f to Color(0xFF7A480D)
                        ),
                        start = Offset(10.966f, 6.25f),
                        end = Offset(10.966f, 9.75f)
                    ),
                    strokeLineWidth = 1f
                ) {
                    moveTo(10.251f, 6.475f)
                    curveTo(10.242f, 6.563f, 10.229f, 6.712f, 10.216f, 6.898f)
                    curveTo(10.2f, 7.125f, 10.189f, 7.349f, 10.184f, 7.559f)
                    curveTo(10.173f, 8.026f, 10.193f, 8.371f, 10.263f, 8.579f)
                    curveTo(10.35f, 8.84f, 10.547f, 9.085f, 10.82f, 9.321f)
                    curveTo(11.028f, 9.5f, 11.235f, 9.637f, 11.377f, 9.718f)
                    curveTo(11.497f, 9.786f, 11.65f, 9.743f, 11.718f, 9.623f)
                    curveTo(11.786f, 9.503f, 11.743f, 9.35f, 11.623f, 9.282f)
                    curveTo(11.507f, 9.217f, 11.326f, 9.097f, 11.146f, 8.942f)
                    curveTo(10.935f, 8.76f, 10.79f, 8.579f, 10.737f, 8.421f)
                    curveTo(10.693f, 8.287f, 10.674f, 7.979f, 10.684f, 7.571f)
                    curveTo(10.689f, 7.369f, 10.7f, 7.153f, 10.715f, 6.933f)
                    curveTo(10.728f, 6.752f, 10.74f, 6.608f, 10.749f, 6.525f)
                    curveTo(10.763f, 6.388f, 10.662f, 6.265f, 10.525f, 6.251f)
                    curveTo(10.388f, 6.237f, 10.265f, 6.338f, 10.251f, 6.475f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFFFFFFFF)),
                    strokeLineWidth = 1f,
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(9f, 7.5f)
                    lineToRelative(1f, 1.5f)
                    lineToRelative(-1f, 0f)
                    close()
                }
            }
        }.build()

        return _GU!!
    }

@Suppress("ObjectPropertyName")
private var _GU: ImageVector? = null
