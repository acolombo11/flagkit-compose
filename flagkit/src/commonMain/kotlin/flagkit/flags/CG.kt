package flagkit.flags

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import flagkit.FlagKit

val FlagKit.CG: ImageVector
    get() {
        if (_CG != null) {
            return _CG!!
        }
        _CG = ImageVector.Builder(
            name = "CG",
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
                        0f to Color(0xFFF33630),
                        1f to Color(0xFFDC241E)
                    ),
                    start = Offset(13.002f, -0.003f),
                    end = Offset(13.002f, 14.997f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5.002f, 13.997f)
                lineToRelative(15f, -14f)
                lineToRelative(1f, 0f)
                lineToRelative(0f, 15f)
                lineToRelative(-16f, 0f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF009643),
                        1f to Color(0xFF09C15B)
                    ),
                    start = Offset(8.002f, -0.003f),
                    end = Offset(8.002f, 14.997f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(16.002f, 0.997f)
                lineToRelative(-15f, 14f)
                lineToRelative(-1f, -0f)
                lineToRelative(-0f, -15f)
                lineToRelative(16f, -0f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFCDF4A),
                        1f to Color(0xFFFCE154)
                    ),
                    start = Offset(10.811f, -5.02f),
                    end = Offset(10.811f, 19.314f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(22.682f, -1.547f)
                lineToRelative(-20.145f, 20.861f)
                lineToRelative(-3.597f, -3.473f)
                lineToRelative(20.145f, -20.861f)
                close()
            }
        }.build()

        return _CG!!
    }

@Suppress("ObjectPropertyName")
private var _CG: ImageVector? = null
