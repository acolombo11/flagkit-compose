package flagkit.flags

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import flagkit.FlagKit

val FlagKit.PH: ImageVector
    get() {
        if (_PH != null) {
            return _PH!!
        }
        _PH = ImageVector.Builder(
            name = "PH",
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
                        0f to Color(0xFFDD1C34),
                        1f to Color(0xFFCC162C)
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
                        0f to Color(0xFF0D4BC3),
                        1f to Color(0xFF073DA6)
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
                        0f to Color(0xFFFFFFFF),
                        1f to Color(0xFFF0F0F0)
                    ),
                    start = Offset(5f, 0f),
                    end = Offset(5f, 15f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                lineToRelative(10f, 7.5f)
                lineToRelative(-10f, 7.5f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFDD64D),
                        1f to Color(0xFFFCD036)
                    ),
                    start = Offset(4.5f, 2f),
                    end = Offset(4.5f, 13f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3.399f, 8.495f)
                lineTo(2.543f, 9.81f)
                lineTo(2.868f, 8.275f)
                curveTo(2.816f, 8.232f, 2.768f, 8.184f, 2.725f, 8.132f)
                lineTo(1.19f, 8.457f)
                lineTo(2.505f, 7.601f)
                curveTo(2.502f, 7.568f, 2.5f, 7.534f, 2.5f, 7.5f)
                curveTo(2.5f, 7.466f, 2.502f, 7.432f, 2.505f, 7.399f)
                lineTo(1.19f, 6.543f)
                lineTo(2.725f, 6.868f)
                curveTo(2.768f, 6.816f, 2.816f, 6.768f, 2.868f, 6.725f)
                lineTo(2.543f, 5.19f)
                lineTo(3.399f, 6.505f)
                curveTo(3.432f, 6.502f, 3.466f, 6.5f, 3.5f, 6.5f)
                curveTo(3.534f, 6.5f, 3.568f, 6.502f, 3.601f, 6.505f)
                lineTo(4.457f, 5.19f)
                lineTo(4.132f, 6.725f)
                curveTo(4.184f, 6.768f, 4.232f, 6.816f, 4.275f, 6.868f)
                lineTo(5.81f, 6.543f)
                lineTo(4.495f, 7.399f)
                curveTo(4.498f, 7.432f, 4.5f, 7.466f, 4.5f, 7.5f)
                curveTo(4.5f, 7.534f, 4.498f, 7.568f, 4.495f, 7.601f)
                lineTo(5.81f, 8.457f)
                lineTo(4.275f, 8.132f)
                curveTo(4.232f, 8.184f, 4.184f, 8.232f, 4.132f, 8.275f)
                lineTo(4.457f, 9.81f)
                lineTo(3.601f, 8.495f)
                curveTo(3.568f, 8.498f, 3.534f, 8.5f, 3.5f, 8.5f)
                curveTo(3.466f, 8.5f, 3.432f, 8.498f, 3.399f, 8.495f)
                lineTo(3.399f, 8.495f)
                close()
                moveTo(7.5f, 8f)
                curveTo(7.224f, 8f, 7f, 7.776f, 7f, 7.5f)
                curveTo(7f, 7.224f, 7.224f, 7f, 7.5f, 7f)
                curveTo(7.776f, 7f, 8f, 7.224f, 8f, 7.5f)
                curveTo(8f, 7.776f, 7.776f, 8f, 7.5f, 8f)
                close()
                moveTo(1.5f, 3f)
                curveTo(1.224f, 3f, 1f, 2.776f, 1f, 2.5f)
                curveTo(1f, 2.224f, 1.224f, 2f, 1.5f, 2f)
                curveTo(1.776f, 2f, 2f, 2.224f, 2f, 2.5f)
                curveTo(2f, 2.776f, 1.776f, 3f, 1.5f, 3f)
                close()
                moveTo(1.5f, 13f)
                curveTo(1.224f, 13f, 1f, 12.776f, 1f, 12.5f)
                curveTo(1f, 12.224f, 1.224f, 12f, 1.5f, 12f)
                curveTo(1.776f, 12f, 2f, 12.224f, 2f, 12.5f)
                curveTo(2f, 12.776f, 1.776f, 13f, 1.5f, 13f)
                close()
            }
        }.build()

        return _PH!!
    }

@Suppress("ObjectPropertyName")
private var _PH: ImageVector? = null
