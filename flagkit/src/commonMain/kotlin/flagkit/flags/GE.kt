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

val FlagKit.GE: ImageVector
    get() {
        if (_GE != null) {
            return _GE!!
        }
        _GE = ImageVector.Builder(
            name = "GE",
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
                        0f to Color(0xFFFF2B37),
                        1f to Color(0xFFFD0D1B)
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
                fill = SolidColor(Color(0xFFFD0D1B)),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(16.2f, 2.7f)
                lineTo(16f, 1.5f)
                lineTo(17f, 1.5f)
                lineTo(16.8f, 2.7f)
                lineTo(18f, 2.5f)
                lineTo(18f, 3.5f)
                lineTo(16.8f, 3.3f)
                lineTo(17f, 4.5f)
                lineTo(16f, 4.5f)
                lineTo(16.2f, 3.3f)
                lineTo(15f, 3.5f)
                lineTo(15f, 2.5f)
                lineTo(16.2f, 2.7f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFD0D1B)),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4.2f, 2.7f)
                lineTo(4f, 1.5f)
                lineTo(5f, 1.5f)
                lineTo(4.8f, 2.7f)
                lineTo(6f, 2.5f)
                lineTo(6f, 3.5f)
                lineTo(4.8f, 3.3f)
                lineTo(5f, 4.5f)
                lineTo(4f, 4.5f)
                lineTo(4.2f, 3.3f)
                lineTo(3f, 3.5f)
                lineTo(3f, 2.5f)
                lineTo(4.2f, 2.7f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFD0D1B)),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4.2f, 11.7f)
                lineTo(4f, 10.5f)
                lineTo(5f, 10.5f)
                lineTo(4.8f, 11.7f)
                lineTo(6f, 11.5f)
                lineTo(6f, 12.5f)
                lineTo(4.8f, 12.3f)
                lineTo(5f, 13.5f)
                lineTo(4f, 13.5f)
                lineTo(4.2f, 12.3f)
                lineTo(3f, 12.5f)
                lineTo(3f, 11.5f)
                lineTo(4.2f, 11.7f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFD0D1B)),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(16.2f, 11.7f)
                lineTo(16f, 10.5f)
                lineTo(17f, 10.5f)
                lineTo(16.8f, 11.7f)
                lineTo(18f, 11.5f)
                lineTo(18f, 12.5f)
                lineTo(16.8f, 12.3f)
                lineTo(17f, 13.5f)
                lineTo(16f, 13.5f)
                lineTo(16.2f, 12.3f)
                lineTo(15f, 12.5f)
                lineTo(15f, 11.5f)
                lineTo(16.2f, 11.7f)
                close()
            }
        }.build()

        return _GE!!
    }

@Suppress("ObjectPropertyName")
private var _GE: ImageVector? = null
