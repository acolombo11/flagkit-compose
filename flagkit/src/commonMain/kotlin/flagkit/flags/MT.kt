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

val FlagKit.MT: ImageVector
    get() {
        if (_MT != null) {
            return _MT!!
        }
        _MT = ImageVector.Builder(
            name = "MT",
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
                        0f to Color(0xFFDE233C),
                        1f to Color(0xFFCD1931)
                    ),
                    start = Offset(16f, 0f),
                    end = Offset(16f, 15f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11f, 0f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(-10f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFFFFF),
                        1f to Color(0xFFF0F0F0)
                    ),
                    start = Offset(5.5f, 0f),
                    end = Offset(5.5f, 15f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(-11f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFCCCCCD)),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4f, 3f)
                lineTo(4f, 2f)
                lineTo(3f, 2f)
                lineTo(3f, 3f)
                lineTo(2f, 3f)
                lineTo(2f, 4f)
                lineTo(3f, 4f)
                lineTo(3f, 5f)
                lineTo(4f, 5f)
                lineTo(4f, 4f)
                lineTo(5f, 4f)
                lineTo(5f, 3f)
                lineTo(4f, 3f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF7B716A)),
                strokeAlpha = 0.66f,
                strokeLineWidth = 0.5f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4.25f, 2.75f)
                lineTo(5.25f, 2.75f)
                lineTo(5.25f, 4.25f)
                lineTo(4.25f, 4.25f)
                lineTo(4.25f, 5.25f)
                lineTo(2.75f, 5.25f)
                lineTo(2.75f, 4.25f)
                lineTo(1.75f, 4.25f)
                lineTo(1.75f, 2.75f)
                lineTo(2.75f, 2.75f)
                lineTo(2.75f, 1.75f)
                lineTo(4.25f, 1.75f)
                lineTo(4.25f, 2.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF7B716A)),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3.5f, 3.5f)
                moveToRelative(-1f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 0f)
            }
        }.build()

        return _MT!!
    }

@Suppress("ObjectPropertyName")
private var _MT: ImageVector? = null
