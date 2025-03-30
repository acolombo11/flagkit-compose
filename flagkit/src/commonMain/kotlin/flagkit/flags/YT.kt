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

val FlagKit.YT: ImageVector
    get() {
        if (_YT != null) {
            return _YT!!
        }
        _YT = ImageVector.Builder(
            name = "YT",
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
                fill = SolidColor(Color(0xFFD8D8D8)),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8f, 4.491f)
                curveTo(8f, 4.22f, 8.215f, 4f, 8.498f, 4f)
                lineTo(12.502f, 4f)
                curveTo(12.777f, 4f, 13f, 4.228f, 13f, 4.491f)
                lineTo(13f, 9.509f)
                curveTo(13f, 9.78f, 12.782f, 10.008f, 12.499f, 10.031f)
                curveTo(12.499f, 10.031f, 11f, 10f, 10.5f, 10.941f)
                curveTo(10f, 10f, 8.501f, 10.031f, 8.501f, 10.031f)
                curveTo(8.224f, 10.014f, 8f, 9.772f, 8f, 9.509f)
                lineTo(8f, 4.491f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF979797)),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12.5f, 4.5f)
                lineTo(12.5f, 4.491f)
                curveTo(12.5f, 4.498f, 12.499f, 4.5f, 12.5f, 4.5f)
                close()
                moveTo(12.5f, 4.5f)
                curveTo(12.5f, 4.5f, 12.501f, 4.5f, 12.502f, 4.5f)
                lineTo(12.5f, 4.5f)
                close()
                moveTo(8.5f, 4.5f)
                lineTo(8.5f, 9.509f)
                curveTo(8.5f, 9.51f, 8.52f, 9.531f, 8.49f, 9.531f)
                curveTo(8.493f, 9.531f, 8.493f, 9.531f, 8.499f, 9.531f)
                curveTo(8.842f, 9.527f, 9.293f, 9.579f, 9.75f, 9.744f)
                curveTo(10.035f, 9.846f, 10.288f, 9.984f, 10.5f, 10.162f)
                curveTo(10.712f, 9.984f, 10.965f, 9.846f, 11.25f, 9.744f)
                curveTo(11.694f, 9.584f, 12.132f, 9.53f, 12.47f, 9.531f)
                curveTo(12.49f, 9.526f, 12.5f, 9.514f, 12.5f, 9.509f)
                lineTo(12.5f, 4.5f)
                curveTo(12.5f, 4.5f, 12.5f, 4.5f, 12.5f, 4.5f)
                lineTo(8.5f, 4.5f)
                close()
            }
            group(
                clipPathData = PathData {
                    moveTo(8f, 4.491f)
                    curveTo(8f, 4.22f, 8.215f, 4f, 8.498f, 4f)
                    lineTo(12.502f, 4f)
                    curveTo(12.777f, 4f, 13f, 4.228f, 13f, 4.491f)
                    lineTo(13f, 9.509f)
                    curveTo(13f, 9.78f, 12.782f, 10.008f, 12.499f, 10.031f)
                    curveTo(12.499f, 10.031f, 11f, 10f, 10.5f, 10.941f)
                    curveTo(10f, 10f, 8.501f, 10.031f, 8.501f, 10.031f)
                    curveTo(8.224f, 10.014f, 8f, 9.772f, 8f, 9.509f)
                    lineTo(8f, 4.491f)
                    close()
                }
            ) {
                path(
                    fill = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1f,
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(8f, 4f)
                    horizontalLineToRelative(5f)
                    verticalLineToRelative(3f)
                    horizontalLineToRelative(-5f)
                    close()
                }
                path(
                    fill = Brush.linearGradient(
                        colorStops = arrayOf(
                            0f to Color(0xFF1B2CA9),
                            1f to Color(0xFF132294)
                        ),
                        start = Offset(10.5f, 4f),
                        end = Offset(10.5f, 7f)
                    ),
                    strokeLineWidth = 1f,
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(8f, 4f)
                    horizontalLineToRelative(5f)
                    verticalLineToRelative(3f)
                    horizontalLineToRelative(-5f)
                    close()
                }
            }
            group(
                clipPathData = PathData {
                    moveTo(8f, 4.491f)
                    curveTo(8f, 4.22f, 8.215f, 4f, 8.498f, 4f)
                    lineTo(12.502f, 4f)
                    curveTo(12.777f, 4f, 13f, 4.228f, 13f, 4.491f)
                    lineTo(13f, 9.509f)
                    curveTo(13f, 9.78f, 12.782f, 10.008f, 12.499f, 10.031f)
                    curveTo(12.499f, 10.031f, 11f, 10f, 10.5f, 10.941f)
                    curveTo(10f, 10f, 8.501f, 10.031f, 8.501f, 10.031f)
                    curveTo(8.224f, 10.014f, 8f, 9.772f, 8f, 9.509f)
                    lineTo(8f, 4.491f)
                    close()
                }
            ) {
                path(
                    fill = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1f,
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(8f, 7f)
                    horizontalLineToRelative(5f)
                    verticalLineToRelative(4f)
                    horizontalLineToRelative(-5f)
                    close()
                }
                path(
                    fill = Brush.linearGradient(
                        colorStops = arrayOf(
                            0f to Color(0xFFE6402C),
                            1f to Color(0xFFD1321F)
                        ),
                        start = Offset(10.5f, 7f),
                        end = Offset(10.5f, 11f)
                    ),
                    strokeLineWidth = 1f,
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(8f, 7f)
                    horizontalLineToRelative(5f)
                    verticalLineToRelative(4f)
                    horizontalLineToRelative(-5f)
                    close()
                }
                path(
                    fill = Brush.linearGradient(
                        colorStops = arrayOf(
                            0f to Color(0xFFD0D0D0),
                            1f to Color(0xFFC4C4C4)
                        ),
                        start = Offset(16.003f, 3.444f),
                        end = Offset(16.003f, 10.717f)
                    ),
                    strokeLineWidth = 1f,
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(15.039f, 4.726f)
                    lineTo(15.039f, 4.262f)
                    lineTo(15.5f, 4f)
                    curveTo(15.5f, 4f, 15.045f, 3.444f, 15.27f, 3.444f)
                    curveTo(15.545f, 3.444f, 16.699f, 3.81f, 17f, 4f)
                    curveTo(17.301f, 4.19f, 17.453f, 4.418f, 17.496f, 4.85f)
                    curveTo(17.538f, 5.281f, 17.18f, 5.831f, 17.18f, 5.831f)
                    lineTo(17f, 6.25f)
                    lineTo(17.788f, 6.071f)
                    curveTo(17.788f, 6.071f, 17.916f, 6.897f, 17.336f, 7.5f)
                    curveTo(16.755f, 8.103f, 15.941f, 7.99f, 15.941f, 7.99f)
                    lineTo(15.777f, 7.5f)
                    curveTo(15.777f, 7.5f, 15.246f, 7.706f, 14.934f, 8.174f)
                    curveTo(14.621f, 8.642f, 14.533f, 9.45f, 15.039f, 9.949f)
                    curveTo(15.545f, 10.448f, 16.38f, 10.406f, 16.778f, 9.704f)
                    curveTo(16.778f, 9.704f, 16.938f, 9.084f, 16.57f, 8.792f)
                    curveTo(16.202f, 8.501f, 15.953f, 9.103f, 15.941f, 9.07f)
                    curveTo(15.87f, 8.86f, 15.777f, 8.501f, 16.369f, 8.501f)
                    curveTo(16.961f, 8.501f, 17.265f, 9.137f, 17.18f, 9.626f)
                    curveTo(17.095f, 10.115f, 16.924f, 10.579f, 15.777f, 10.709f)
                    curveTo(14.631f, 10.839f, 14.336f, 9.386f, 14.336f, 9.386f)
                    curveTo(14.336f, 9.386f, 14.044f, 8.03f, 14.336f, 7.051f)
                    curveTo(14.628f, 6.071f, 15.061f, 6.047f, 15.941f, 5.51f)
                    curveTo(16.821f, 4.972f, 15.41f, 5.327f, 15.41f, 5.327f)
                    curveTo(15.41f, 5.327f, 14.74f, 5.831f, 14.53f, 5.648f)
                    curveTo(14.32f, 5.464f, 15.039f, 4.726f, 15.039f, 4.726f)
                    close()
                }
                path(
                    fill = Brush.linearGradient(
                        colorStops = arrayOf(
                            0f to Color(0xFF262626),
                            1f to Color(0xFF0D0D0D)
                        ),
                        start = Offset(15.75f, 3.75f),
                        end = Offset(15.75f, 5.75f)
                    ),
                    fillAlpha = 0.3f,
                    strokeLineWidth = 1f,
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(15.75f, 4.75f)
                    moveToRelative(-1f, 0f)
                    arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, 0f)
                    arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 0f)
                }
                path(
                    fill = Brush.linearGradient(
                        colorStops = arrayOf(
                            0f to Color(0xFFD0D0D0),
                            1f to Color(0xFFC4C4C4)
                        ),
                        start = Offset(4.997f, 3.444f),
                        end = Offset(4.997f, 10.717f)
                    ),
                    strokeLineWidth = 1f,
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(5.961f, 4.726f)
                    lineTo(5.961f, 4.262f)
                    lineTo(5.5f, 4f)
                    curveTo(5.5f, 4f, 5.955f, 3.444f, 5.73f, 3.444f)
                    curveTo(5.455f, 3.444f, 4.301f, 3.81f, 4f, 4f)
                    curveTo(3.699f, 4.19f, 3.547f, 4.418f, 3.504f, 4.85f)
                    curveTo(3.462f, 5.281f, 3.82f, 5.831f, 3.82f, 5.831f)
                    lineTo(4f, 6.25f)
                    lineTo(3.212f, 6.071f)
                    curveTo(3.212f, 6.071f, 3.084f, 6.897f, 3.664f, 7.5f)
                    curveTo(4.245f, 8.103f, 5.059f, 7.99f, 5.059f, 7.99f)
                    lineTo(5.223f, 7.5f)
                    curveTo(5.223f, 7.5f, 5.754f, 7.706f, 6.066f, 8.174f)
                    curveTo(6.379f, 8.642f, 6.467f, 9.45f, 5.961f, 9.949f)
                    curveTo(5.455f, 10.448f, 4.62f, 10.406f, 4.222f, 9.704f)
                    curveTo(4.222f, 9.704f, 4.062f, 9.084f, 4.43f, 8.792f)
                    curveTo(4.798f, 8.501f, 5.047f, 9.103f, 5.059f, 9.07f)
                    curveTo(5.13f, 8.86f, 5.223f, 8.501f, 4.631f, 8.501f)
                    curveTo(4.039f, 8.501f, 3.735f, 9.137f, 3.82f, 9.626f)
                    curveTo(3.905f, 10.115f, 4.076f, 10.579f, 5.223f, 10.709f)
                    curveTo(6.369f, 10.839f, 6.664f, 9.386f, 6.664f, 9.386f)
                    curveTo(6.664f, 9.386f, 6.956f, 8.03f, 6.664f, 7.051f)
                    curveTo(6.372f, 6.071f, 5.939f, 6.047f, 5.059f, 5.51f)
                    curveTo(4.179f, 4.972f, 5.59f, 5.327f, 5.59f, 5.327f)
                    curveTo(5.59f, 5.327f, 6.26f, 5.831f, 6.47f, 5.648f)
                    curveTo(6.68f, 5.464f, 5.961f, 4.726f, 5.961f, 4.726f)
                    close()
                }
                path(
                    fill = Brush.linearGradient(
                        colorStops = arrayOf(
                            0f to Color(0xFF262626),
                            1f to Color(0xFF0D0D0D)
                        ),
                        start = Offset(5.25f, 3.75f),
                        end = Offset(5.25f, 5.75f)
                    ),
                    fillAlpha = 0.3f,
                    strokeLineWidth = 1f,
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(5.25f, 4.75f)
                    moveToRelative(1f, 0f)
                    arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, -2f, 0f)
                    arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2f, 0f)
                }
                path(
                    fill = Brush.linearGradient(
                        colorStops = arrayOf(
                            0f to Color(0xFFFFFFFF),
                            1f to Color(0xFFF0F0F0)
                        ),
                        start = Offset(10.5f, 5f),
                        end = Offset(10.5f, 6.5f)
                    ),
                    strokeLineWidth = 1f,
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(9.634f, 5f)
                    curveTo(9.549f, 5.147f, 9.5f, 5.318f, 9.5f, 5.5f)
                    curveTo(9.5f, 6.052f, 9.948f, 6.5f, 10.5f, 6.5f)
                    curveTo(11.052f, 6.5f, 11.5f, 6.052f, 11.5f, 5.5f)
                    curveTo(11.5f, 5.318f, 11.451f, 5.147f, 11.366f, 5f)
                    curveTo(11.193f, 5.299f, 10.87f, 5.5f, 10.5f, 5.5f)
                    curveTo(10.13f, 5.5f, 9.807f, 5.299f, 9.634f, 5f)
                    lineTo(9.634f, 5f)
                    close()
                }
                path(
                    fill = Brush.linearGradient(
                        colorStops = arrayOf(
                            0f to Color(0xFFF7E04B),
                            1f to Color(0xFFEAD135)
                        ),
                        start = Offset(10.5f, 8f),
                        end = Offset(10.5f, 9f)
                    ),
                    strokeLineWidth = 1f,
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(9.5f, 9f)
                    curveTo(9.224f, 9f, 9f, 8.776f, 9f, 8.5f)
                    curveTo(9f, 8.224f, 9.224f, 8f, 9.5f, 8f)
                    curveTo(9.776f, 8f, 10f, 8.224f, 10f, 8.5f)
                    curveTo(10f, 8.776f, 9.776f, 9f, 9.5f, 9f)
                    close()
                    moveTo(11.5f, 9f)
                    curveTo(11.224f, 9f, 11f, 8.776f, 11f, 8.5f)
                    curveTo(11f, 8.224f, 11.224f, 8f, 11.5f, 8f)
                    curveTo(11.776f, 8f, 12f, 8.224f, 12f, 8.5f)
                    curveTo(12f, 8.776f, 11.776f, 9f, 11.5f, 9f)
                    close()
                }
            }
        }.build()

        return _YT!!
    }

@Suppress("ObjectPropertyName")
private var _YT: ImageVector? = null
