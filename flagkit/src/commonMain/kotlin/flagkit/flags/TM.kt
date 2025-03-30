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

val FlagKit.TM: ImageVector
    get() {
        if (_TM != null) {
            return _TM!!
        }
        _TM = ImageVector.Builder(
            name = "TM",
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
                        0f to Color(0xFF30C375),
                        1f to Color(0xFF28AE67)
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
                        0f to Color(0xFFDE414F),
                        1f to Color(0xFFCA3745)
                    ),
                    start = Offset(4.5f, 0f),
                    end = Offset(4.5f, 15f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3f, 0f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(-3f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3f, 2f)
                arcToRelative(1.5f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 3f, 0f)
                arcToRelative(1.5f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, -3f, 0f)
                close()
            }
            group(
                clipPathData = PathData {
                    moveTo(3f, 2f)
                    arcToRelative(1.5f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 3f, 0f)
                    arcToRelative(1.5f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, -3f, 0f)
                    close()
                }
            ) {
                path(
                    fill = SolidColor(Color(0xFFDD404F)),
                    strokeLineWidth = 1f,
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(4.5f, 2f)
                    moveToRelative(-1f, 0f)
                    arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, 0f)
                    arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 0f)
                }
            }
            group(
                clipPathData = PathData {
                    moveTo(3f, 2f)
                    arcToRelative(1.5f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 3f, 0f)
                    arcToRelative(1.5f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, -3f, 0f)
                    close()
                }
            ) {
                path(
                    fill = SolidColor(Color(0xFFFBAF29)),
                    strokeLineWidth = 1f,
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(3f, 1f)
                    horizontalLineToRelative(1.5f)
                    verticalLineToRelative(1f)
                    horizontalLineToRelative(-1.5f)
                    close()
                }
            }
            group(
                clipPathData = PathData {
                    moveTo(3f, 2f)
                    arcToRelative(1.5f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 3f, 0f)
                    arcToRelative(1.5f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, -3f, 0f)
                    close()
                }
            ) {
                path(
                    fill = SolidColor(Color(0xFFFBAF29)),
                    strokeLineWidth = 1f,
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(4.5f, 2f)
                    horizontalLineToRelative(1.5f)
                    verticalLineToRelative(1f)
                    horizontalLineToRelative(-1.5f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFFFFFFFF)),
                    strokeLineWidth = 1f,
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(3f, 13f)
                    arcToRelative(1.5f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 3f, 0f)
                    arcToRelative(1.5f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, -3f, 0f)
                    close()
                }
            }
            group(
                clipPathData = PathData {
                    moveTo(3f, 13f)
                    arcToRelative(1.5f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 3f, 0f)
                    arcToRelative(1.5f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, -3f, 0f)
                    close()
                }
            ) {
                path(
                    fill = SolidColor(Color(0xFFDD404F)),
                    strokeLineWidth = 1f,
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(4.5f, 13f)
                    moveToRelative(-1f, 0f)
                    arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, 0f)
                    arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 0f)
                }
            }
            group(
                clipPathData = PathData {
                    moveTo(3f, 13f)
                    arcToRelative(1.5f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 3f, 0f)
                    arcToRelative(1.5f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, -3f, 0f)
                    close()
                }
            ) {
                path(
                    fill = SolidColor(Color(0xFFFBAF29)),
                    strokeLineWidth = 1f,
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(3f, 12f)
                    horizontalLineToRelative(1.5f)
                    verticalLineToRelative(1f)
                    horizontalLineToRelative(-1.5f)
                    close()
                }
            }
            group(
                clipPathData = PathData {
                    moveTo(3f, 13f)
                    arcToRelative(1.5f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 3f, 0f)
                    arcToRelative(1.5f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, -3f, 0f)
                    close()
                }
            ) {
                path(
                    fill = SolidColor(Color(0xFFFBAF29)),
                    strokeLineWidth = 1f,
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(4.5f, 13f)
                    horizontalLineToRelative(1.5f)
                    verticalLineToRelative(1f)
                    horizontalLineToRelative(-1.5f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF28AE67)),
                    strokeLineWidth = 1f,
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(3f, 8f)
                    arcToRelative(1.5f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 3f, 0f)
                    arcToRelative(1.5f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, -3f, 0f)
                    close()
                }
            }
            group(
                clipPathData = PathData {
                    moveTo(3f, 8f)
                    arcToRelative(1.5f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 3f, 0f)
                    arcToRelative(1.5f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, -3f, 0f)
                    close()
                }
            ) {
                path(
                    fill = SolidColor(Color(0xFFDD404F)),
                    strokeLineWidth = 1f,
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(3.5f, 8f)
                    arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2f, 0f)
                    arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, -2f, 0f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF28AE67)),
                    strokeLineWidth = 1f,
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(3f, 10.5f)
                    arcToRelative(1.5f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 3f, 0f)
                    arcToRelative(1.5f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, -3f, 0f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFFFBAF29)),
                    strokeLineWidth = 1f,
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(3f, 5f)
                    arcToRelative(1.5f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 3f, 0f)
                    arcToRelative(1.5f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, -3f, 0f)
                    close()
                }
            }
            group(
                clipPathData = PathData {
                    moveTo(3f, 5f)
                    arcToRelative(1.5f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 3f, 0f)
                    arcToRelative(1.5f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, -3f, 0f)
                    close()
                }
            ) {
                path(
                    fill = SolidColor(Color(0xFFDD404F)),
                    strokeLineWidth = 1f,
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(4.5f, 5f)
                    moveToRelative(-1f, 0f)
                    arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, 0f)
                    arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 0f)
                }
            }
            group(
                clipPathData = PathData {
                    moveTo(3f, 5f)
                    arcToRelative(1.5f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 3f, 0f)
                    arcToRelative(1.5f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, -3f, 0f)
                    close()
                }
            ) {
                path(
                    fill = SolidColor(Color(0xFF28AE67)),
                    strokeLineWidth = 1f,
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(3f, 4f)
                    horizontalLineToRelative(1f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(-1f)
                    close()
                }
            }
            group(
                clipPathData = PathData {
                    moveTo(3f, 5f)
                    arcToRelative(1.5f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 3f, 0f)
                    arcToRelative(1.5f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, -3f, 0f)
                    close()
                }
            ) {
                path(
                    fill = SolidColor(Color(0xFF28AE67)),
                    strokeLineWidth = 1f,
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(5f, 4f)
                    horizontalLineToRelative(1f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(-1f)
                    close()
                }
                path(
                    fill = Brush.linearGradient(
                        colorStops = arrayOf(
                            0f to Color(0xFFFFFFFF),
                            1f to Color(0xFFF0F0F0)
                        ),
                        start = Offset(10f, 2f),
                        end = Offset(10f, 6f)
                    ),
                    strokeLineWidth = 1f,
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(11.117f, 3.179f)
                    curveTo(10.939f, 3.39f, 10.967f, 3.706f, 11.179f, 3.883f)
                    curveTo(11.39f, 4.061f, 11.706f, 4.033f, 11.883f, 3.821f)
                    curveTo(12.061f, 3.61f, 12.033f, 3.294f, 11.821f, 3.117f)
                    curveTo(11.61f, 2.939f, 11.294f, 2.967f, 11.117f, 3.179f)
                    close()
                    moveTo(9.821f, 5.117f)
                    curveTo(9.61f, 4.939f, 9.294f, 4.967f, 9.117f, 5.179f)
                    curveTo(8.939f, 5.39f, 8.967f, 5.706f, 9.179f, 5.883f)
                    curveTo(9.39f, 6.061f, 9.706f, 6.033f, 9.883f, 5.821f)
                    curveTo(10.061f, 5.61f, 10.033f, 5.294f, 9.821f, 5.117f)
                    lineTo(9.821f, 5.117f)
                    close()
                    moveTo(8.821f, 4.117f)
                    curveTo(8.61f, 3.939f, 8.294f, 3.967f, 8.117f, 4.179f)
                    curveTo(7.939f, 4.39f, 7.967f, 4.706f, 8.179f, 4.883f)
                    curveTo(8.39f, 5.061f, 8.706f, 5.033f, 8.883f, 4.821f)
                    curveTo(9.061f, 4.61f, 9.033f, 4.294f, 8.821f, 4.117f)
                    lineTo(8.821f, 4.117f)
                    close()
                    moveTo(10.821f, 2.117f)
                    curveTo(10.61f, 1.939f, 10.294f, 1.967f, 10.117f, 2.179f)
                    curveTo(9.939f, 2.39f, 9.967f, 2.706f, 10.179f, 2.883f)
                    curveTo(10.39f, 3.061f, 10.706f, 3.033f, 10.883f, 2.821f)
                    curveTo(11.061f, 2.61f, 11.033f, 2.294f, 10.821f, 2.117f)
                    lineTo(10.821f, 2.117f)
                    close()
                    moveTo(10.321f, 3.617f)
                    curveTo(10.11f, 3.439f, 9.794f, 3.467f, 9.617f, 3.679f)
                    curveTo(9.439f, 3.89f, 9.467f, 4.206f, 9.679f, 4.383f)
                    curveTo(9.89f, 4.561f, 10.206f, 4.533f, 10.383f, 4.321f)
                    curveTo(10.561f, 4.11f, 10.533f, 3.794f, 10.321f, 3.617f)
                    lineTo(10.321f, 3.617f)
                    close()
                }
                path(
                    fill = Brush.linearGradient(
                        colorStops = arrayOf(
                            0f to Color(0xFFFFFFFF),
                            1f to Color(0xFFF0F0F0)
                        ),
                        start = Offset(11.241f, 2.462f),
                        end = Offset(11.241f, 7.981f)
                    ),
                    strokeLineWidth = 1f,
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(13.107f, 7.088f)
                    curveTo(11.916f, 8.279f, 9.985f, 8.279f, 8.794f, 7.088f)
                    curveTo(8.679f, 6.972f, 8.574f, 6.85f, 8.481f, 6.722f)
                    curveTo(9.674f, 7.589f, 11.353f, 7.485f, 12.429f, 6.409f)
                    curveTo(13.504f, 5.334f, 13.609f, 3.655f, 12.741f, 2.462f)
                    curveTo(12.869f, 2.555f, 12.992f, 2.659f, 13.107f, 2.775f)
                    curveTo(14.298f, 3.966f, 14.298f, 5.897f, 13.107f, 7.088f)
                    close()
                }
            }
        }.build()

        return _TM!!
    }

@Suppress("ObjectPropertyName")
private var _TM: ImageVector? = null
