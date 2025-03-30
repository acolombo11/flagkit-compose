package flagkit.flags

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathData
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import flagkit.FlagKit

val FlagKit.GD: ImageVector
    get() {
        if (_GD != null) {
            return _GD!!
        }
        _GD = ImageVector.Builder(
            name = "GD",
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
                        0f to Color(0xFFE42235),
                        1f to Color(0xFFCE1225)
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
                        0f to Color(0xFF079B77),
                        1f to Color(0xFF007B5D)
                    ),
                    start = Offset(10.5f, 2f),
                    end = Offset(10.5f, 13f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(2f, 2f)
                horizontalLineToRelative(17f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(-17f)
                close()
            }
            group(
                clipPathData = PathData {
                    moveTo(2f, 2f)
                    horizontalLineToRelative(17f)
                    verticalLineToRelative(11f)
                    horizontalLineToRelative(-17f)
                    close()
                }
            ) {
                path(
                    fill = Brush.linearGradient(
                        colorStops = arrayOf(
                            0f to Color(0xFFFFD938),
                            1f to Color(0xFFFDD117)
                        ),
                        start = Offset(4.22f, 5.797f),
                        end = Offset(4.22f, 8.429f)
                    ),
                    strokeLineWidth = 1f,
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(3.295f, 7.599f)
                    curveTo(3.578f, 8.052f, 3.984f, 8.351f, 4.363f, 8.428f)
                    curveTo(4.572f, 8.47f, 4.19f, 7.514f, 4.356f, 7.41f)
                    curveTo(4.498f, 7.322f, 5.181f, 8.116f, 5.241f, 7.951f)
                    curveTo(5.378f, 7.569f, 5.297f, 7.029f, 4.991f, 6.539f)
                    curveTo(4.552f, 5.836f, 4.535f, 6.3f, 3.348f, 5.797f)
                    curveTo(3.472f, 6.517f, 2.856f, 6.896f, 3.295f, 7.599f)
                    lineTo(3.295f, 7.599f)
                    close()
                }
            }
            group(
                clipPathData = PathData {
                    moveTo(2f, 2f)
                    horizontalLineToRelative(17f)
                    verticalLineToRelative(11f)
                    horizontalLineToRelative(-17f)
                    close()
                }
            ) {
                path(
                    fill = Brush.linearGradient(
                        colorStops = arrayOf(
                            0f to Color(0xFFFFD93B),
                            1f to Color(0xFFFDD117)
                        ),
                        start = Offset(10.5f, 2f),
                        end = Offset(10.5f, 13f)
                    ),
                    strokeLineWidth = 1f,
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(2f, 2f)
                    lineTo(19f, 2f)
                    lineTo(10.5f, 7.5f)
                    lineTo(2f, 2f)
                    close()
                    moveTo(2f, 13f)
                    lineTo(10.5f, 7.5f)
                    lineTo(19f, 13f)
                    lineTo(2f, 13f)
                    close()
                }
            }
            group(
                clipPathData = PathData {
                    moveTo(2f, 2f)
                    horizontalLineToRelative(17f)
                    verticalLineToRelative(11f)
                    horizontalLineToRelative(-17f)
                    close()
                }
            ) {
                path(
                    fill = Brush.linearGradient(
                        colorStops = arrayOf(
                            0f to Color(0xFFE21C30),
                            1f to Color(0xFFCE1225)
                        ),
                        start = Offset(10.5f, 5f),
                        end = Offset(10.5f, 10f)
                    ),
                    strokeLineWidth = 1f,
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(10.5f, 7.5f)
                    moveToRelative(-2.5f, 0f)
                    arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 5f, 0f)
                    arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -5f, 0f)
                }
            }
            group(
                clipPathData = PathData {
                    moveTo(2f, 2f)
                    horizontalLineToRelative(17f)
                    verticalLineToRelative(11f)
                    horizontalLineToRelative(-17f)
                    close()
                }
            ) {
                path(
                    fill = Brush.linearGradient(
                        colorStops = arrayOf(
                            0f to Color(0xFFFFD938),
                            1f to Color(0xFFFDD117)
                        ),
                        start = Offset(10.499f, 5.5f),
                        end = Offset(10.499f, 9.118f)
                    ),
                    strokeLineWidth = 1f,
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(10.5f, 8.271f)
                    lineToRelative(-1.176f, 0.847f)
                    lineToRelative(0.442f, -1.38f)
                    lineToRelative(-1.169f, -0.856f)
                    lineToRelative(1.449f, -0.006f)
                    lineToRelative(0.453f, -1.376f)
                    lineToRelative(0.453f, 1.376f)
                    lineToRelative(1.449f, 0.006f)
                    lineToRelative(-1.169f, 0.856f)
                    lineToRelative(0.442f, 1.38f)
                    close()
                }
            }
        }.build()

        return _GD!!
    }

@Suppress("ObjectPropertyName")
private var _GD: ImageVector? = null
