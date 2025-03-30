package flagkit.flags

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import flagkit.FlagKit

val FlagKit.DO: ImageVector
    get() {
        if (_DO != null) {
            return _DO!!
        }
        _DO = ImageVector.Builder(
            name = "DO",
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
                        0f to Color(0xFF083D7A),
                        1f to Color(0xFF032F61)
                    ),
                    start = Offset(4.5f, 0f),
                    end = Offset(4.5f, 6f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-9f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF083D7A),
                        1f to Color(0xFF032F61)
                    ),
                    start = Offset(16.5f, 9f),
                    end = Offset(16.5f, 15f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 9f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-9f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFDF1E35),
                        1f to Color(0xFFCC162C)
                    ),
                    start = Offset(4.5f, 9f),
                    end = Offset(4.5f, 15f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 9f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-9f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFDF1E35),
                        1f to Color(0xFFCC162C)
                    ),
                    start = Offset(16.5f, 0f),
                    end = Offset(16.5f, 6f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 0f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-9f)
                close()
            }
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
                moveTo(9f, 6f)
                lineTo(0f, 6f)
                lineTo(0f, 9f)
                lineTo(9f, 9f)
                lineTo(9f, 15f)
                lineTo(12f, 15f)
                lineTo(12f, 9f)
                lineTo(21f, 9f)
                lineTo(21f, 6f)
                lineTo(12f, 6f)
                lineTo(12f, 0f)
                lineTo(9f, 0f)
                lineTo(9f, 6f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFC93127)),
                fillAlpha = 0.2f,
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9.439f, 6.439f)
                curveTo(8.854f, 7.025f, 8.854f, 7.975f, 9.439f, 8.561f)
                curveTo(10.025f, 9.146f, 10.975f, 9.146f, 11.561f, 8.561f)
                lineTo(11.561f, 8.561f)
                curveTo(12.146f, 7.975f, 12.146f, 7.025f, 11.561f, 6.439f)
            }
            path(
                fill = SolidColor(Color(0xFF042F60)),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.5f, 7.5f)
                moveToRelative(-1f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 0f)
            }
            path(
                fill = SolidColor(Color(0xFF0F6D1A)),
                strokeLineWidth = 1f
            ) {
                moveTo(11.561f, 8.561f)
                curveTo(10.975f, 9.146f, 10.025f, 9.146f, 9.439f, 8.561f)
                curveTo(8.854f, 7.975f, 8.854f, 7.025f, 9.439f, 6.439f)
                lineTo(9.793f, 6.793f)
                curveTo(9.402f, 7.183f, 9.402f, 7.817f, 9.793f, 8.207f)
                curveTo(10.183f, 8.598f, 10.817f, 8.598f, 11.207f, 8.207f)
                curveTo(11.598f, 7.817f, 11.598f, 7.183f, 11.207f, 6.793f)
                lineTo(11.561f, 6.439f)
                curveTo(12.146f, 7.025f, 12.146f, 7.975f, 11.561f, 8.561f)
                close()
                moveTo(11.561f, 8.561f)
                curveTo(10.975f, 9.146f, 10.025f, 9.146f, 9.439f, 8.561f)
                curveTo(8.854f, 7.975f, 8.854f, 7.025f, 9.439f, 6.439f)
                lineTo(9.793f, 6.793f)
                curveTo(9.402f, 7.183f, 9.402f, 7.817f, 9.793f, 8.207f)
                curveTo(10.183f, 8.598f, 10.817f, 8.598f, 11.207f, 8.207f)
                curveTo(11.598f, 7.817f, 11.598f, 7.183f, 11.207f, 6.793f)
                lineTo(11.561f, 6.439f)
                curveTo(12.146f, 7.025f, 12.146f, 7.975f, 11.561f, 8.561f)
                close()
            }
        }.build()

        return _DO!!
    }

@Suppress("ObjectPropertyName")
private var _DO: ImageVector? = null
