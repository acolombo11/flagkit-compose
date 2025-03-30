package flagkit.flags

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import flagkit.FlagKit

val FlagKit.SG: ImageVector
    get() {
        if (_SG != null) {
            return _SG!!
        }
        _SG = ImageVector.Builder(
            name = "SG",
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
                        0f to Color(0xFFE12237),
                        1f to Color(0xFFCE1126)
                    ),
                    start = Offset(10.5f, 0f),
                    end = Offset(10.5f, 8f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(21f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-21f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFFFFF),
                        1f to Color(0xFFF0F0F0)
                    ),
                    start = Offset(10.5f, 8f),
                    end = Offset(10.5f, 15f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 8f)
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
                    start = Offset(6f, 1f),
                    end = Offset(6f, 7f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.874f, 1.657f)
                curveTo(6.602f, 1.555f, 6.307f, 1.5f, 6f, 1.5f)
                curveTo(4.619f, 1.5f, 3.5f, 2.619f, 3.5f, 4f)
                curveTo(3.5f, 5.381f, 4.619f, 6.5f, 6f, 6.5f)
                curveTo(6.307f, 6.5f, 6.602f, 6.445f, 6.874f, 6.343f)
                curveTo(6.36f, 6.754f, 5.709f, 7f, 5f, 7f)
                curveTo(3.343f, 7f, 2f, 5.657f, 2f, 4f)
                curveTo(2f, 2.343f, 3.343f, 1f, 5f, 1f)
                curveTo(5.709f, 1f, 6.36f, 1.246f, 6.874f, 1.657f)
                lineTo(6.874f, 1.657f)
                close()
                moveTo(5.5f, 4f)
                curveTo(5.224f, 4f, 5f, 3.776f, 5f, 3.5f)
                curveTo(5f, 3.224f, 5.224f, 3f, 5.5f, 3f)
                curveTo(5.776f, 3f, 6f, 3.224f, 6f, 3.5f)
                curveTo(6f, 3.776f, 5.776f, 4f, 5.5f, 4f)
                close()
                moveTo(6.5f, 6f)
                curveTo(6.224f, 6f, 6f, 5.776f, 6f, 5.5f)
                curveTo(6f, 5.224f, 6.224f, 5f, 6.5f, 5f)
                curveTo(6.776f, 5f, 7f, 5.224f, 7f, 5.5f)
                curveTo(7f, 5.776f, 6.776f, 6f, 6.5f, 6f)
                close()
                moveTo(8.5f, 6f)
                curveTo(8.224f, 6f, 8f, 5.776f, 8f, 5.5f)
                curveTo(8f, 5.224f, 8.224f, 5f, 8.5f, 5f)
                curveTo(8.776f, 5f, 9f, 5.224f, 9f, 5.5f)
                curveTo(9f, 5.776f, 8.776f, 6f, 8.5f, 6f)
                close()
                moveTo(9.5f, 4f)
                curveTo(9.224f, 4f, 9f, 3.776f, 9f, 3.5f)
                curveTo(9f, 3.224f, 9.224f, 3f, 9.5f, 3f)
                curveTo(9.776f, 3f, 10f, 3.224f, 10f, 3.5f)
                curveTo(10f, 3.776f, 9.776f, 4f, 9.5f, 4f)
                close()
                moveTo(7.5f, 2.5f)
                curveTo(7.224f, 2.5f, 7f, 2.276f, 7f, 2f)
                curveTo(7f, 1.724f, 7.224f, 1.5f, 7.5f, 1.5f)
                curveTo(7.776f, 1.5f, 8f, 1.724f, 8f, 2f)
                curveTo(8f, 2.276f, 7.776f, 2.5f, 7.5f, 2.5f)
                close()
            }
        }.build()

        return _SG!!
    }

@Suppress("ObjectPropertyName")
private var _SG: ImageVector? = null
