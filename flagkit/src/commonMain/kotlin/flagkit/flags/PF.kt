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

val FlagKit.PF: ImageVector
    get() {
        if (_PF != null) {
            return _PF!!
        }
        _PF = ImageVector.Builder(
            name = "PF",
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
                        0f to Color(0xFFE02639),
                        1f to Color(0xFFCA1A2C)
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
                        0f to Color(0xFFDC2235),
                        1f to Color(0xFFCA1A2C)
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
            group(
                clipPathData = PathData {
                    moveTo(10.5f, 7.5f)
                    moveToRelative(-2.5f, 0f)
                    arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 5f, 0f)
                    arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -5f, 0f)
                }
            ) {
                path(
                    fill = Brush.linearGradient(
                        colorStops = arrayOf(
                            0f to Color(0xFFFFA135),
                            1f to Color(0xFFFD9C2D)
                        ),
                        start = Offset(10.5f, 5f),
                        end = Offset(10.5f, 7.5f)
                    ),
                    strokeLineWidth = 1f,
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(8f, 5f)
                    horizontalLineToRelative(5f)
                    verticalLineToRelative(2.5f)
                    horizontalLineToRelative(-5f)
                    close()
                }
            }
            group(
                clipPathData = PathData {
                    moveTo(10.5f, 7.5f)
                    moveToRelative(-2.5f, 0f)
                    arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 5f, 0f)
                    arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -5f, 0f)
                }
            ) {
                path(
                    fill = SolidColor(Color(0xFFFFFFFF)),
                    strokeLineWidth = 1f,
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(9f, 6.5f)
                    lineToRelative(3f, 0f)
                    lineToRelative(-0.5f, 1f)
                    lineToRelative(-2f, 0f)
                    close()
                }
            }
            group(
                clipPathData = PathData {
                    moveTo(10.5f, 7.5f)
                    moveToRelative(-2.5f, 0f)
                    arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 5f, 0f)
                    arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -5f, 0f)
                }
            ) {
                path(
                    fill = Brush.linearGradient(
                        colorStops = arrayOf(
                            0f to Color(0xFFDF2034),
                            1f to Color(0xFFCA1A2C)
                        ),
                        start = Offset(10.5f, 5f),
                        end = Offset(10.5f, 8f)
                    ),
                    strokeLineWidth = 1f,
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(10f, 5f)
                    lineTo(11f, 5f)
                    lineTo(11f, 6.495f)
                    curveTo(11f, 6.774f, 10.768f, 7f, 10.5f, 7f)
                    curveTo(10.224f, 7f, 10f, 6.786f, 10f, 6.495f)
                    lineTo(10f, 5f)
                    close()
                    moveTo(9f, 6f)
                    curveTo(9f, 6f, 9.75f, 7.5f, 10.5f, 7.5f)
                    curveTo(11.25f, 7.5f, 12f, 6f, 12f, 6f)
                    lineTo(12f, 7f)
                    curveTo(12f, 7.552f, 11.557f, 8f, 11.001f, 8f)
                    lineTo(9.999f, 8f)
                    curveTo(9.447f, 8f, 9f, 7.556f, 9f, 7f)
                    lineTo(9f, 6f)
                    close()
                }
            }
            group(
                clipPathData = PathData {
                    moveTo(10.5f, 7.5f)
                    moveToRelative(-2.5f, 0f)
                    arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 5f, 0f)
                    arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -5f, 0f)
                }
            ) {
                path(
                    fill = Brush.linearGradient(
                        colorStops = arrayOf(
                            0f to Color(0xFF0B4BAD),
                            1f to Color(0xFF08429A)
                        ),
                        start = Offset(10.5f, 8f),
                        end = Offset(10.5f, 10f)
                    ),
                    strokeLineWidth = 1f,
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(8f, 8f)
                    horizontalLineToRelative(5f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(-5f)
                    close()
                }
            }
            group(
                clipPathData = PathData {
                    moveTo(10.5f, 7.5f)
                    moveToRelative(-2.5f, 0f)
                    arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 5f, 0f)
                    arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -5f, 0f)
                }
            ) {
                path(
                    fill = SolidColor(Color(0xFFFFFFFF)),
                    strokeLineWidth = 1f,
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(8f, 8.5f)
                    lineToRelative(5f, 0f)
                    lineToRelative(0f, 0.5f)
                    lineToRelative(-5f, 0f)
                    close()
                }
            }
        }.build()

        return _PF!!
    }

@Suppress("ObjectPropertyName")
private var _PF: ImageVector? = null
