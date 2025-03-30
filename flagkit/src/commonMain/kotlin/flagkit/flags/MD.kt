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

val FlagKit.MD: ImageVector
    get() {
        if (_MD != null) {
            return _MD!!
        }
        _MD = ImageVector.Builder(
            name = "MD",
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
                        0f to Color(0xFFEB1C43),
                        1f to Color(0xFFCA1134)
                    ),
                    start = Offset(15.5f, 0f),
                    end = Offset(15.5f, 15f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10f, 0f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(-11f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF115BCB),
                        1f to Color(0xFF094AAC)
                    ),
                    start = Offset(3.5f, 0f),
                    end = Offset(3.5f, 15f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(-7f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7f, 0f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(-7f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFD953),
                        1f to Color(0xFFFFD130)
                    ),
                    start = Offset(10.5f, 0f),
                    end = Offset(10.5f, 15f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7f, 0f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(-7f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFAF7F59)),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9f, 6f)
                lineTo(10f, 6f)
                lineTo(10.5f, 4.5f)
                lineTo(11f, 6f)
                lineTo(12f, 6f)
                lineTo(12f, 9f)
                lineTo(10.5f, 10f)
                lineTo(9f, 9f)
                lineTo(9f, 6f)
                close()
                moveTo(10f, 7f)
                lineTo(10f, 8.5f)
                lineTo(11f, 8.5f)
                lineTo(11f, 7f)
                lineTo(10f, 7f)
                close()
            }
        }.build()

        return _MD!!
    }

@Suppress("ObjectPropertyName")
private var _MD: ImageVector? = null
