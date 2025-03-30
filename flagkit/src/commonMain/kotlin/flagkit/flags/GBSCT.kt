package flagkit.flags

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import flagkit.FlagKit

val FlagKit.GBSCT: ImageVector
    get() {
        if (_GBSCT != null) {
            return _GBSCT!!
        }
        _GBSCT = ImageVector.Builder(
            name = "GBSCT",
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
                        0f to Color(0xFF1479D0),
                        1f to Color(0xFF0A68BA)
                    ),
                    start = Offset(10.5f, -0.003f),
                    end = Offset(10.5f, 14.997f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, -0.003f)
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
                    start = Offset(10.5f, -1.44f),
                    end = Offset(10.5f, 16.435f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.5f, 6.291f)
                lineTo(-0.962f, -1.44f)
                lineTo(-2.08f, 0.218f)
                lineTo(8.712f, 7.497f)
                lineTo(-2.08f, 14.777f)
                lineTo(-0.962f, 16.435f)
                lineTo(10.5f, 8.704f)
                lineTo(21.962f, 16.435f)
                lineTo(23.08f, 14.777f)
                lineTo(12.289f, 7.497f)
                lineTo(23.08f, 0.218f)
                lineTo(21.962f, -1.44f)
                lineTo(10.5f, 6.291f)
                close()
            }
        }.build()

        return _GBSCT!!
    }

@Suppress("ObjectPropertyName")
private var _GBSCT: ImageVector? = null
