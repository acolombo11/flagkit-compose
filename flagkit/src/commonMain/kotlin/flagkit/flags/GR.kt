package flagkit.flags

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import flagkit.FlagKit

val FlagKit.GR: ImageVector
    get() {
        if (_GR != null) {
            return _GR!!
        }
        _GR = ImageVector.Builder(
            name = "GR",
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
                        0f to Color(0xFF1C6DC1),
                        1f to Color(0xFF1660AD)
                    ),
                    start = Offset(10.5f, 0f),
                    end = Offset(10.5f, 14f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                lineTo(4f, 0f)
                lineTo(4f, 4f)
                lineTo(0f, 4f)
                lineTo(0f, 0f)
                close()
                moveTo(6f, 0f)
                lineTo(10f, 0f)
                lineTo(10f, 4f)
                lineTo(6f, 4f)
                lineTo(6f, 0f)
                close()
                moveTo(10f, 0f)
                lineTo(21f, 0f)
                lineTo(21f, 2f)
                lineTo(10f, 2f)
                lineTo(10f, 0f)
                close()
                moveTo(10f, 4f)
                lineTo(21f, 4f)
                lineTo(21f, 6f)
                lineTo(10f, 6f)
                lineTo(10f, 4f)
                close()
                moveTo(10f, 8f)
                lineTo(21f, 8f)
                lineTo(21f, 10f)
                lineTo(10f, 10f)
                lineTo(10f, 8f)
                close()
                moveTo(0f, 12f)
                lineTo(21f, 12f)
                lineTo(21f, 14f)
                lineTo(0f, 14f)
                lineTo(0f, 12f)
                close()
                moveTo(6f, 6f)
                lineTo(10f, 6f)
                lineTo(10f, 10f)
                lineTo(6f, 10f)
                lineTo(6f, 6f)
                close()
                moveTo(0f, 6f)
                lineTo(4f, 6f)
                lineTo(4f, 10f)
                lineTo(0f, 10f)
                lineTo(0f, 6f)
                close()
            }
        }.build()

        return _GR!!
    }

@Suppress("ObjectPropertyName")
private var _GR: ImageVector? = null
