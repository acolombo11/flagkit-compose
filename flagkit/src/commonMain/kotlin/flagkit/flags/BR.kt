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

val FlagKit.BR: ImageVector
    get() {
        if (_BR != null) {
            return _BR!!
        }
        _BR = ImageVector.Builder(
            name = "BR",
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
                        0f to Color(0xFF05AB41),
                        1f to Color(0xFF019C39)
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
                fill = SolidColor(Color(0xFFFDD216)),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(2.422f, 7.773f)
                curveTo(2.189f, 7.622f, 2.194f, 7.375f, 2.422f, 7.227f)
                lineTo(10.078f, 2.273f)
                curveTo(10.311f, 2.122f, 10.694f, 2.125f, 10.922f, 2.273f)
                lineTo(18.578f, 7.227f)
                curveTo(18.811f, 7.378f, 18.806f, 7.625f, 18.578f, 7.773f)
                lineTo(10.922f, 12.727f)
                curveTo(10.689f, 12.878f, 10.306f, 12.875f, 10.078f, 12.727f)
                lineTo(2.422f, 7.773f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF053087),
                        1f to Color(0xFF012877)
                    ),
                    start = Offset(10.5f, 4f),
                    end = Offset(10.5f, 11f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.5f, 7.5f)
                moveToRelative(-3.5f, 0f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 7f, 0f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -7f, 0f)
            }
            group(
                clipPathData = PathData {
                    moveTo(10.5f, 7.5f)
                    moveToRelative(-3.5f, 0f)
                    arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 7f, 0f)
                    arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -7f, 0f)
                }
            ) {
                path(
                    fill = SolidColor(Color(0xFFFFFFFF)),
                    strokeLineWidth = 1f
                ) {
                    moveTo(6.9f, 6.974f)
                    curveTo(7.165f, 6.759f, 8.363f, 6.934f, 10.434f, 7.486f)
                    curveTo(11.908f, 7.88f, 13.607f, 8.748f, 13.996f, 9.228f)
                    lineTo(14.31f, 9.616f)
                    lineTo(15.088f, 8.987f)
                    lineTo(14.773f, 8.599f)
                    curveTo(14.223f, 7.919f, 12.352f, 6.963f, 10.692f, 6.52f)
                    curveTo(8.106f, 5.83f, 6.934f, 5.659f, 6.27f, 6.197f)
                    lineTo(5.882f, 6.511f)
                    lineTo(6.511f, 7.288f)
                    lineTo(6.9f, 6.974f)
                    close()
                }
            }
        }.build()

        return _BR!!
    }

@Suppress("ObjectPropertyName")
private var _BR: ImageVector? = null
