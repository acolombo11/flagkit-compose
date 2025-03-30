package flagkit.flags

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import flagkit.FlagKit

val FlagKit.UG: ImageVector
    get() {
        if (_UG != null) {
            return _UG!!
        }
        _UG = ImageVector.Builder(
            name = "UG",
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
                        0f to Color(0xFF262626),
                        1f to Color(0xFF0D0D0D)
                    ),
                    start = Offset(10.5f, 0f),
                    end = Offset(10.5f, 2f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(21f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-21f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF262626),
                        1f to Color(0xFF0D0D0D)
                    ),
                    start = Offset(10.5f, 8f),
                    end = Offset(10.5f, 10f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 8f)
                horizontalLineToRelative(21f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-21f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFED1623),
                        1f to Color(0xFFD70915)
                    ),
                    start = Offset(10.5f, 5f),
                    end = Offset(10.5f, 8f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 5f)
                horizontalLineToRelative(21f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-21f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFEE044),
                        1f to Color(0xFFFCDB32)
                    ),
                    start = Offset(10.5f, 2f),
                    end = Offset(10.5f, 5f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 2f)
                horizontalLineToRelative(21f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-21f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFED1623),
                        1f to Color(0xFFD70915)
                    ),
                    start = Offset(10.5f, 13f),
                    end = Offset(10.5f, 15f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 13f)
                horizontalLineToRelative(21f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-21f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFEE044),
                        1f to Color(0xFFFCDB32)
                    ),
                    start = Offset(10.5f, 10f),
                    end = Offset(10.5f, 13f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 10f)
                horizontalLineToRelative(21f)
                verticalLineToRelative(3f)
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
                moveTo(10.5f, 7.5f)
                moveToRelative(-3.5f, 0f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 7f, 0f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -7f, 0f)
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF262626),
                        1f to Color(0xFF0D0D0D)
                    ),
                    start = Offset(10.762f, 4.701f),
                    end = Offset(10.762f, 10f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9.681f, 5.681f)
                curveTo(9.581f, 5.581f, 9.578f, 5.422f, 9.681f, 5.319f)
                lineTo(9.819f, 5.181f)
                curveTo(9.919f, 5.081f, 10.072f, 4.909f, 10.158f, 4.818f)
                lineTo(10.28f, 4.719f)
                curveTo(10.402f, 4.736f, 10.597f, 4.683f, 10.722f, 4.707f)
                lineTo(10.841f, 4.799f)
                curveTo(10.929f, 4.91f, 10.954f, 5.092f, 10.884f, 5.232f)
                lineTo(10.616f, 5.768f)
                curveTo(10.552f, 5.896f, 10.5f, 6.116f, 10.5f, 6.25f)
                lineTo(10.5f, 6.25f)
                curveTo(10.5f, 6.388f, 10.592f, 6.546f, 10.732f, 6.616f)
                lineTo(11.268f, 6.884f)
                curveTo(11.396f, 6.948f, 11.578f, 7.078f, 11.674f, 7.174f)
                lineTo(12.326f, 7.826f)
                curveTo(12.422f, 7.922f, 12.454f, 8.092f, 12.384f, 8.232f)
                lineTo(12.116f, 8.768f)
                curveTo(12.052f, 8.896f, 11.922f, 8.922f, 11.819f, 8.819f)
                lineTo(11.681f, 8.681f)
                curveTo(11.581f, 8.581f, 11.422f, 8.578f, 11.319f, 8.681f)
                lineTo(11.181f, 8.819f)
                curveTo(11.081f, 8.919f, 11f, 9.116f, 11f, 9.25f)
                lineTo(11f, 9.25f)
                curveTo(11f, 9.388f, 11.078f, 9.578f, 11.181f, 9.681f)
                lineTo(11.319f, 9.819f)
                curveTo(11.419f, 9.919f, 11.382f, 10f, 11.252f, 10f)
                lineTo(10.248f, 10f)
                curveTo(10.111f, 10f, 10.078f, 9.922f, 10.181f, 9.819f)
                lineTo(10.319f, 9.681f)
                curveTo(10.419f, 9.581f, 10.5f, 9.384f, 10.5f, 9.25f)
                lineTo(10.5f, 9.25f)
                curveTo(10.5f, 9.112f, 10.384f, 9f, 10.25f, 9f)
                lineTo(10.25f, 9f)
                curveTo(10.112f, 9f, 9.922f, 9.078f, 9.819f, 9.181f)
                lineTo(9.681f, 9.319f)
                curveTo(9.581f, 9.419f, 9.422f, 9.422f, 9.319f, 9.319f)
                lineTo(9.181f, 9.181f)
                curveTo(9.081f, 9.081f, 9.078f, 8.922f, 9.181f, 8.819f)
                lineTo(9.319f, 8.681f)
                curveTo(9.419f, 8.581f, 9.607f, 8.5f, 9.752f, 8.5f)
                lineTo(10.248f, 8.5f)
                curveTo(10.387f, 8.5f, 10.419f, 8.419f, 10.328f, 8.328f)
                lineTo(9.172f, 7.172f)
                curveTo(9.077f, 7.077f, 9.078f, 6.922f, 9.174f, 6.826f)
                lineTo(9.826f, 6.174f)
                curveTo(9.922f, 6.078f, 9.922f, 5.922f, 9.819f, 5.819f)
                lineTo(9.681f, 5.681f)
                close()
            }
        }.build()

        return _UG!!
    }

@Suppress("ObjectPropertyName")
private var _UG: ImageVector? = null
