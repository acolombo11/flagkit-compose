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

val FlagKit.HT: ImageVector
    get() {
        if (_HT != null) {
            return _HT!!
        }
        _HT = ImageVector.Builder(
            name = "HT",
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
                        0f to Color(0xFF112EBC),
                        1f to Color(0xFF0620A0)
                    ),
                    start = Offset(10.5f, 0f),
                    end = Offset(10.5f, 7f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(21f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-21f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFE3264A),
                        1f to Color(0xFFD20F34)
                    ),
                    start = Offset(10.5f, 7f),
                    end = Offset(10.5f, 15f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 7f)
                horizontalLineToRelative(21f)
                verticalLineToRelative(8f)
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
                    end = Offset(10.5f, 11f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.5f, 5f)
                lineTo(13.5f, 5f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 5.5f)
                lineTo(14f, 10.5f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.5f, 11f)
                lineTo(7.5f, 11f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 10.5f)
                lineTo(7f, 5.5f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.5f, 5f)
                close()
            }
            group(
                clipPathData = PathData {
                    moveTo(7.5f, 5f)
                    lineTo(13.5f, 5f)
                    arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 5.5f)
                    lineTo(14f, 10.5f)
                    arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.5f, 11f)
                    lineTo(7.5f, 11f)
                    arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 10.5f)
                    lineTo(7f, 5.5f)
                    arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.5f, 5f)
                    close()
                }
            ) {
                path(
                    fill = SolidColor(Color(0xFFAABCAE)),
                    strokeLineWidth = 1f,
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(7f, 10f)
                    lineTo(8.105f, 9.447f)
                    curveTo(8.599f, 9.2f, 9.443f, 9f, 9.999f, 9f)
                    lineTo(11.001f, 9f)
                    curveTo(11.553f, 9f, 12.405f, 9.202f, 12.895f, 9.447f)
                    lineTo(14f, 10f)
                    lineTo(14f, 11f)
                    lineTo(7f, 11f)
                    lineTo(7f, 10f)
                    close()
                }
                path(
                    stroke = SolidColor(Color(0xFF366C14)),
                    strokeLineWidth = 0.5f,
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(7.25f, 10.155f)
                    lineTo(7.25f, 10.75f)
                    lineTo(13.75f, 10.75f)
                    lineTo(13.75f, 10.155f)
                    lineTo(12.783f, 9.671f)
                    curveTo(12.326f, 9.443f, 11.512f, 9.25f, 11.001f, 9.25f)
                    lineTo(9.999f, 9.25f)
                    curveTo(9.483f, 9.25f, 8.678f, 9.441f, 8.217f, 9.671f)
                    lineTo(7.25f, 10.155f)
                    close()
                }
            }
            group(
                clipPathData = PathData {
                    moveTo(7.5f, 5f)
                    lineTo(13.5f, 5f)
                    arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 5.5f)
                    lineTo(14f, 10.5f)
                    arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.5f, 11f)
                    lineTo(7.5f, 11f)
                    arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 10.5f)
                    lineTo(7f, 5.5f)
                    arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.5f, 5f)
                    close()
                }
            ) {
                path(
                    fill = SolidColor(Color(0xFFD4B872)),
                    strokeLineWidth = 1f,
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(10.5f, 7.5f)
                    moveToRelative(-1.5f, 0f)
                    arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 3f, 0f)
                    arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -3f, 0f)
                }
            }
            group(
                clipPathData = PathData {
                    moveTo(7.5f, 5f)
                    lineTo(13.5f, 5f)
                    arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 5.5f)
                    lineTo(14f, 10.5f)
                    arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.5f, 11f)
                    lineTo(7.5f, 11f)
                    arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 10.5f)
                    lineTo(7f, 5.5f)
                    arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.5f, 5f)
                    close()
                }
            ) {
                path(
                    fill = SolidColor(Color(0xFFC28321)),
                    strokeLineWidth = 1f,
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(8f, 8.006f)
                    curveTo(8f, 7.727f, 8.18f, 7.644f, 8.391f, 7.813f)
                    lineTo(10.109f, 9.188f)
                    curveTo(10.325f, 9.36f, 10.68f, 9.356f, 10.891f, 9.188f)
                    lineTo(12.609f, 7.813f)
                    curveTo(12.825f, 7.64f, 13f, 7.731f, 13f, 8.006f)
                    lineTo(13f, 9.494f)
                    curveTo(13f, 9.773f, 12.785f, 10f, 12.502f, 10f)
                    lineTo(8.498f, 10f)
                    curveTo(8.223f, 10f, 8f, 9.769f, 8f, 9.494f)
                    lineTo(8f, 8.006f)
                    close()
                }
                path(
                    stroke = SolidColor(Color(0xFF0D3488)),
                    strokeLineWidth = 0.5f,
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(8.25f, 8.02f)
                    lineTo(8.25f, 9.494f)
                    curveTo(8.25f, 9.634f, 8.364f, 9.75f, 8.498f, 9.75f)
                    lineTo(12.502f, 9.75f)
                    curveTo(12.643f, 9.75f, 12.75f, 9.64f, 12.75f, 9.494f)
                    lineTo(12.75f, 8.02f)
                    lineTo(11.047f, 9.383f)
                    curveTo(10.743f, 9.626f, 10.259f, 9.627f, 9.953f, 9.383f)
                    lineTo(8.25f, 8.02f)
                    close()
                }
            }
            group(
                clipPathData = PathData {
                    moveTo(7.5f, 5f)
                    lineTo(13.5f, 5f)
                    arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 5.5f)
                    lineTo(14f, 10.5f)
                    arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.5f, 11f)
                    lineTo(7.5f, 11f)
                    arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 10.5f)
                    lineTo(7f, 5.5f)
                    arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.5f, 5f)
                    close()
                }
            ) {
                path(
                    fill = SolidColor(Color(0xFF216C30)),
                    strokeLineWidth = 1f,
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(9.172f, 6.172f)
                    curveTo(9.077f, 6.077f, 9.114f, 6f, 9.256f, 6f)
                    lineTo(11.744f, 6f)
                    curveTo(11.885f, 6f, 11.919f, 6.081f, 11.828f, 6.172f)
                    lineTo(10.672f, 7.328f)
                    curveTo(10.577f, 7.423f, 10.419f, 7.419f, 10.328f, 7.328f)
                    lineTo(9.172f, 6.172f)
                    close()
                }
            }
        }.build()

        return _HT!!
    }

@Suppress("ObjectPropertyName")
private var _HT: ImageVector? = null
