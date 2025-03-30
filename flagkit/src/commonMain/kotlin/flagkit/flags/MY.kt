package flagkit.flags

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import flagkit.FlagKit

val FlagKit.MY: ImageVector
    get() {
        if (_MY != null) {
            return _MY!!
        }
        _MY = ImageVector.Builder(
            name = "MY",
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
                        0f to Color(0xFFE1244A),
                        1f to Color(0xFFBE1134)
                    ),
                    start = Offset(10.5f, 0f),
                    end = Offset(10.5f, 15f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10f, 0f)
                lineTo(21f, 0f)
                lineTo(21f, 1f)
                lineTo(10f, 1f)
                lineTo(10f, 0f)
                close()
                moveTo(10f, 2f)
                lineTo(21f, 2f)
                lineTo(21f, 3f)
                lineTo(10f, 3f)
                lineTo(10f, 2f)
                close()
                moveTo(10f, 4f)
                lineTo(21f, 4f)
                lineTo(21f, 5f)
                lineTo(10f, 5f)
                lineTo(10f, 4f)
                close()
                moveTo(10f, 6f)
                lineTo(21f, 6f)
                lineTo(21f, 7f)
                lineTo(10f, 7f)
                lineTo(10f, 6f)
                close()
                moveTo(0f, 8f)
                lineTo(21f, 8f)
                lineTo(21f, 9f)
                lineTo(0f, 9f)
                lineTo(0f, 8f)
                close()
                moveTo(0f, 10f)
                lineTo(21f, 10f)
                lineTo(21f, 11f)
                lineTo(0f, 11f)
                lineTo(0f, 10f)
                close()
                moveTo(0f, 12f)
                lineTo(21f, 12f)
                lineTo(21f, 13f)
                lineTo(0f, 13f)
                lineTo(0f, 12f)
                close()
                moveTo(0f, 14f)
                lineTo(21f, 14f)
                lineTo(21f, 15f)
                lineTo(0f, 15f)
                lineTo(0f, 14f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF0C3F8E),
                        1f to Color(0xFF032A67)
                    ),
                    start = Offset(6f, 0f),
                    end = Offset(6f, 8f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-12f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFD34F),
                        1f to Color(0xFFFFCB2F)
                    ),
                    start = Offset(5.975f, 1f),
                    end = Offset(5.975f, 7f)
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
                close()
                moveTo(8f, 4.82f)
                lineTo(7.132f, 5.802f)
                lineTo(7.359f, 4.511f)
                lineTo(6.05f, 4.445f)
                lineTo(7.201f, 3.818f)
                lineTo(6.436f, 2.753f)
                lineTo(7.644f, 3.261f)
                lineTo(8f, 2f)
                lineTo(8.356f, 3.261f)
                lineTo(9.564f, 2.753f)
                lineTo(8.799f, 3.818f)
                lineTo(9.95f, 4.445f)
                lineTo(8.641f, 4.511f)
                lineTo(8.868f, 5.802f)
                lineTo(8f, 4.82f)
                close()
            }
        }.build()

        return _MY!!
    }

@Suppress("ObjectPropertyName")
private var _MY: ImageVector? = null
