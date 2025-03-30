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

val FlagKit.SZ: ImageVector
    get() {
        if (_SZ != null) {
            return _SZ!!
        }
        _SZ = ImageVector.Builder(
            name = "SZ",
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
                        0f to Color(0xFF486BCA),
                        1f to Color(0xFF3E5FBA)
                    ),
                    start = Offset(10.5f, 0f),
                    end = Offset(10.5f, 3f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(21f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-21f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF486BCA),
                        1f to Color(0xFF3E5FBA)
                    ),
                    start = Offset(10.5f, 12f),
                    end = Offset(10.5f, 15f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 12f)
                horizontalLineToRelative(21f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-21f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFDF20),
                        1f to Color(0xFFFFDA00)
                    ),
                    start = Offset(10.5f, 3f),
                    end = Offset(10.5f, 12f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 3f)
                horizontalLineToRelative(21f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(-21f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFCF1615),
                        1f to Color(0xFFB20D0C)
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
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFFFFF),
                        1f to Color(0xFFF0F0F0)
                    ),
                    start = Offset(10.5f, 5f),
                    end = Offset(10.5f, 10f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6f, 7.5f)
                arcToRelative(4.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 9f, 0f)
                arcToRelative(4.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, -9f, 0f)
                close()
            }
            group(
                clipPathData = PathData {
                    moveTo(11f, 7.5f)
                    arcToRelative(2.5f, 4.5f, 90f, isMoreThanHalf = true, isPositiveArc = true, -9f, 0f)
                    arcToRelative(2.5f, 4.5f, 90f, isMoreThanHalf = true, isPositiveArc = true, 9f, 0f)
                    close()
                }
            ) {
                path(
                    fill = Brush.linearGradient(
                        colorStops = arrayOf(
                            0f to Color(0xFF262626),
                            1f to Color(0xFF0D0D0D)
                        ),
                        start = Offset(8.5f, 5f),
                        end = Offset(8.5f, 10f)
                    ),
                    strokeLineWidth = 1f,
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(11f, 5f)
                    lineToRelative(-5f, 0f)
                    lineToRelative(-0f, 5f)
                    lineToRelative(4f, 0f)
                    close()
                }
            }
            group(
                clipPathData = PathData {
                    moveTo(6f, 7.5f)
                    arcToRelative(4.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 9f, 0f)
                    arcToRelative(4.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, -9f, 0f)
                    close()
                }
            ) {
                path(
                    fill = SolidColor(Color(0xFF1A1A1A)),
                    strokeLineWidth = 1f,
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(11.5f, 7.5f)
                    moveToRelative(-1f, 0f)
                    arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, 0f)
                    arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 0f)
                }
            }
            group(
                clipPathData = PathData {
                    moveTo(6f, 7.5f)
                    arcToRelative(4.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 9f, 0f)
                    arcToRelative(4.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, -9f, 0f)
                    close()
                }
            ) {
                path(
                    fill = SolidColor(Color(0xFFF6F6F6)),
                    strokeLineWidth = 1f,
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(9.5f, 7.5f)
                    moveToRelative(-1f, 0f)
                    arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, 0f)
                    arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 0f)
                }
            }
        }.build()

        return _SZ!!
    }

@Suppress("ObjectPropertyName")
private var _SZ: ImageVector? = null
