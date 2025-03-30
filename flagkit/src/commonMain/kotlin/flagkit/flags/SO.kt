package flagkit.flags

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import flagkit.FlagKit

val FlagKit.SO: ImageVector
    get() {
        if (_SO != null) {
            return _SO!!
        }
        _SO = ImageVector.Builder(
            name = "SO",
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
                        0f to Color(0xFF5D9FE9),
                        1f to Color(0xFF458BDB)
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
                        0f to Color(0xFFFFFFFF),
                        1f to Color(0xFFF0F0F0)
                    ),
                    start = Offset(10.5f, 3.001f),
                    end = Offset(10.5f, 11.141f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.5f, 9.255f)
                lineToRelative(-2.645f, 1.886f)
                lineToRelative(0.976f, -3.098f)
                lineToRelative(-2.611f, -1.933f)
                lineToRelative(3.248f, -0.029f)
                lineToRelative(1.032f, -3.08f)
                lineToRelative(1.032f, 3.08f)
                lineToRelative(3.248f, 0.029f)
                lineToRelative(-2.611f, 1.933f)
                lineToRelative(0.976f, 3.098f)
                close()
            }
        }.build()

        return _SO!!
    }

@Suppress("ObjectPropertyName")
private var _SO: ImageVector? = null
