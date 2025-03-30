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

val FlagKit.CD: ImageVector
    get() {
        if (_CD != null) {
            return _CD!!
        }
        _CD = ImageVector.Builder(
            name = "CD",
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
                        0f to Color(0xFF158AFF),
                        1f to Color(0xFF007FFF)
                    ),
                    start = Offset(10.504f, 0.003f),
                    end = Offset(10.504f, 15.003f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0.004f, 0.003f)
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
                moveTo(24.273f, 3.906f)
                lineToRelative(-25.839f, 13.166f)
                lineToRelative(-2.724f, -5.346f)
                lineToRelative(25.839f, -13.166f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFCE1120),
                        1f to Color(0xFFE11B2B)
                    ),
                    start = Offset(10.267f, -0.731f),
                    end = Offset(10.267f, 15.999f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(24.095f, 2.833f)
                lineToRelative(-25.839f, 13.166f)
                lineToRelative(-1.816f, -3.564f)
                lineToRelative(25.839f, -13.166f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFDD216)),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3.504f, 4.478f)
                lineToRelative(-1.469f, 1.048f)
                lineToRelative(0.542f, -1.721f)
                lineToRelative(-1.45f, -1.074f)
                lineToRelative(1.805f, -0.016f)
                lineToRelative(0.573f, -1.711f)
                lineToRelative(0.573f, 1.711f)
                lineToRelative(1.805f, 0.016f)
                lineToRelative(-1.45f, 1.074f)
                lineToRelative(0.542f, 1.721f)
                close()
            }
        }.build()

        return _CD!!
    }

@Suppress("ObjectPropertyName")
private var _CD: ImageVector? = null
