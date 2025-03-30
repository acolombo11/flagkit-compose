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

val FlagKit.BL: ImageVector
    get() {
        if (_BL != null) {
            return _BL!!
        }
        _BL = ImageVector.Builder(
            name = "BL",
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
                        0f to Color(0xFF216CD3),
                        1f to Color(0xFF1557B2)
                    ),
                    start = Offset(10.5f, 5f),
                    end = Offset(10.5f, 12.923f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7f, 5f)
                lineTo(14f, 5f)
                lineTo(14f, 9.491f)
                curveTo(14f, 10.048f, 13.664f, 10.788f, 13.241f, 11.151f)
                lineTo(11.646f, 12.518f)
                curveTo(11.013f, 13.06f, 9.984f, 13.057f, 9.354f, 12.518f)
                lineTo(7.759f, 11.151f)
                curveTo(7.34f, 10.791f, 7f, 10.05f, 7f, 9.491f)
                lineTo(7f, 5f)
                close()
            }
            group(
                clipPathData = PathData {
                    moveTo(7f, 5f)
                    lineTo(14f, 5f)
                    lineTo(14f, 9.491f)
                    curveTo(14f, 10.048f, 13.664f, 10.788f, 13.241f, 11.151f)
                    lineTo(11.646f, 12.518f)
                    curveTo(11.013f, 13.06f, 9.984f, 13.057f, 9.354f, 12.518f)
                    lineTo(7.759f, 11.151f)
                    curveTo(7.34f, 10.791f, 7f, 10.05f, 7f, 9.491f)
                    lineTo(7f, 5f)
                    close()
                }
            ) {
                path(
                    fill = Brush.linearGradient(
                        colorStops = arrayOf(
                            0f to Color(0xFFF7E14B),
                            1f to Color(0xFFF7DF3E)
                        ),
                        start = Offset(10.5f, 6f),
                        end = Offset(10.5f, 7f)
                    ),
                    strokeLineWidth = 1f,
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(8.5f, 7f)
                    curveTo(8.224f, 7f, 8f, 6.776f, 8f, 6.5f)
                    curveTo(8f, 6.224f, 8.224f, 6f, 8.5f, 6f)
                    curveTo(8.776f, 6f, 9f, 6.224f, 9f, 6.5f)
                    curveTo(9f, 6.776f, 8.776f, 7f, 8.5f, 7f)
                    close()
                    moveTo(10.5f, 7f)
                    curveTo(10.224f, 7f, 10f, 6.776f, 10f, 6.5f)
                    curveTo(10f, 6.224f, 10.224f, 6f, 10.5f, 6f)
                    curveTo(10.776f, 6f, 11f, 6.224f, 11f, 6.5f)
                    curveTo(11f, 6.776f, 10.776f, 7f, 10.5f, 7f)
                    close()
                    moveTo(12.5f, 7f)
                    curveTo(12.224f, 7f, 12f, 6.776f, 12f, 6.5f)
                    curveTo(12f, 6.224f, 12.224f, 6f, 12.5f, 6f)
                    curveTo(12.776f, 6f, 13f, 6.224f, 13f, 6.5f)
                    curveTo(13f, 6.776f, 12.776f, 7f, 12.5f, 7f)
                    close()
                }
            }
            group(
                clipPathData = PathData {
                    moveTo(7f, 5f)
                    lineTo(14f, 5f)
                    lineTo(14f, 9.491f)
                    curveTo(14f, 10.048f, 13.664f, 10.788f, 13.241f, 11.151f)
                    lineTo(11.646f, 12.518f)
                    curveTo(11.013f, 13.06f, 9.984f, 13.057f, 9.354f, 12.518f)
                    lineTo(7.759f, 11.151f)
                    curveTo(7.34f, 10.791f, 7f, 10.05f, 7f, 9.491f)
                    lineTo(7f, 5f)
                    close()
                }
            ) {
                path(
                    fill = Brush.linearGradient(
                        colorStops = arrayOf(
                            0f to Color(0xFFF7E14B),
                            1f to Color(0xFFF7DF3E)
                        ),
                        start = Offset(10.5f, 10.5f),
                        end = Offset(10.5f, 12f)
                    ),
                    strokeLineWidth = 1f,
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(9f, 11.5f)
                    curveTo(8.724f, 11.5f, 8.5f, 11.276f, 8.5f, 11f)
                    curveTo(8.5f, 10.724f, 8.724f, 10.5f, 9f, 10.5f)
                    curveTo(9.276f, 10.5f, 9.5f, 10.724f, 9.5f, 11f)
                    curveTo(9.5f, 11.276f, 9.276f, 11.5f, 9f, 11.5f)
                    close()
                    moveTo(10.5f, 12f)
                    curveTo(10.224f, 12f, 10f, 11.776f, 10f, 11.5f)
                    curveTo(10f, 11.224f, 10.224f, 11f, 10.5f, 11f)
                    curveTo(10.776f, 11f, 11f, 11.224f, 11f, 11.5f)
                    curveTo(11f, 11.776f, 10.776f, 12f, 10.5f, 12f)
                    close()
                    moveTo(12f, 11.5f)
                    curveTo(11.724f, 11.5f, 11.5f, 11.276f, 11.5f, 11f)
                    curveTo(11.5f, 10.724f, 11.724f, 10.5f, 12f, 10.5f)
                    curveTo(12.276f, 10.5f, 12.5f, 10.724f, 12.5f, 11f)
                    curveTo(12.5f, 11.276f, 12.276f, 11.5f, 12f, 11.5f)
                    close()
                }
            }
            group(
                clipPathData = PathData {
                    moveTo(7f, 5f)
                    lineTo(14f, 5f)
                    lineTo(14f, 9.491f)
                    curveTo(14f, 10.048f, 13.664f, 10.788f, 13.241f, 11.151f)
                    lineTo(11.646f, 12.518f)
                    curveTo(11.013f, 13.06f, 9.984f, 13.057f, 9.354f, 12.518f)
                    lineTo(7.759f, 11.151f)
                    curveTo(7.34f, 10.791f, 7f, 10.05f, 7f, 9.491f)
                    lineTo(7f, 5f)
                    close()
                }
            ) {
                path(
                    fill = Brush.linearGradient(
                        colorStops = arrayOf(
                            0f to Color(0xFFE12539),
                            1f to Color(0xFFCA192C)
                        ),
                        start = Offset(10.5f, 8f),
                        end = Offset(10.5f, 10f)
                    ),
                    strokeLineWidth = 1f,
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(7f, 8f)
                    horizontalLineToRelative(7f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(-7f)
                    close()
                }
            }
            group(
                clipPathData = PathData {
                    moveTo(7f, 5f)
                    lineTo(14f, 5f)
                    lineTo(14f, 9.491f)
                    curveTo(14f, 10.048f, 13.664f, 10.788f, 13.241f, 11.151f)
                    lineTo(11.646f, 12.518f)
                    curveTo(11.013f, 13.06f, 9.984f, 13.057f, 9.354f, 12.518f)
                    lineTo(7.759f, 11.151f)
                    curveTo(7.34f, 10.791f, 7f, 10.05f, 7f, 9.491f)
                    lineTo(7f, 5f)
                    close()
                }
            ) {
                path(
                    fill = SolidColor(Color(0xFFFFFFFF)),
                    strokeLineWidth = 1f,
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(10.5f, 9f)
                    moveToRelative(-1f, 0f)
                    arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, 0f)
                    arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 0f)
                }
                path(
                    fill = Brush.linearGradient(
                        colorStops = arrayOf(
                            0f to Color(0xFFF7E14B),
                            1f to Color(0xFFF7DF3E)
                        ),
                        start = Offset(10.5f, 3f),
                        end = Offset(10.5f, 5.5f)
                    ),
                    strokeLineWidth = 1f,
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(6.5f, 3.5f)
                    curveTo(6.5f, 3.5f, 8.5f, 3f, 10.5f, 3f)
                    curveTo(12.5f, 3f, 14.5f, 3.5f, 14.5f, 3.5f)
                    lineTo(14f, 5.5f)
                    curveTo(14f, 5.5f, 12.25f, 5f, 10.5f, 5f)
                    curveTo(8.75f, 5f, 7f, 5.5f, 7f, 5.5f)
                    lineTo(6.5f, 3.5f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF5E5216)),
                    strokeLineWidth = 1f,
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(10.5f, 4.5f)
                    curveTo(10.224f, 4.5f, 10f, 4.276f, 10f, 4f)
                    curveTo(10f, 3.724f, 10.224f, 3.5f, 10.5f, 3.5f)
                    curveTo(10.776f, 3.5f, 11f, 3.724f, 11f, 4f)
                    curveTo(11f, 4.276f, 10.776f, 4.5f, 10.5f, 4.5f)
                    close()
                    moveTo(12.5f, 4.5f)
                    curveTo(12.224f, 4.5f, 12f, 4.276f, 12f, 4f)
                    curveTo(12f, 3.724f, 12.224f, 3.5f, 12.5f, 3.5f)
                    curveTo(12.776f, 3.5f, 13f, 3.724f, 13f, 4f)
                    curveTo(13f, 4.276f, 12.776f, 4.5f, 12.5f, 4.5f)
                    close()
                    moveTo(8.5f, 4.5f)
                    curveTo(8.224f, 4.5f, 8f, 4.276f, 8f, 4f)
                    curveTo(8f, 3.724f, 8.224f, 3.5f, 8.5f, 3.5f)
                    curveTo(8.776f, 3.5f, 9f, 3.724f, 9f, 4f)
                    curveTo(9f, 4.276f, 8.776f, 4.5f, 8.5f, 4.5f)
                    close()
                }
            }
        }.build()

        return _BL!!
    }

@Suppress("ObjectPropertyName")
private var _BL: ImageVector? = null
