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

val FlagKit.PY: ImageVector
    get() {
        if (_PY != null) {
            return _PY!!
        }
        _PY = ImageVector.Builder(
            name = "PY",
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
                        0f to Color(0xFFE33F39),
                        1f to Color(0xFFD32E28)
                    ),
                    start = Offset(10.5f, 0f),
                    end = Offset(10.5f, 5f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(21f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-21f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF124BBA),
                        1f to Color(0xFF073DA6)
                    ),
                    start = Offset(10.5f, 10f),
                    end = Offset(10.5f, 15f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 10f)
                horizontalLineToRelative(21f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-21f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFFFFF),
                        1f to Color(0xFFF0F0F0)
                    ),
                    start = Offset(10.5f, 5f),
                    end = Offset(10.5f, 10f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 5f)
                horizontalLineToRelative(21f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-21f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF398153)),
                strokeLineWidth = 1f
            ) {
                moveTo(10.5f, 9f)
                curveTo(11.328f, 9f, 12f, 8.328f, 12f, 7.5f)
                curveTo(12f, 6.672f, 11.328f, 6f, 10.5f, 6f)
                curveTo(9.672f, 6f, 9f, 6.672f, 9f, 7.5f)
                curveTo(9f, 8.328f, 9.672f, 9f, 10.5f, 9f)
                close()
                moveTo(10.5f, 9.5f)
                curveTo(9.395f, 9.5f, 8.5f, 8.605f, 8.5f, 7.5f)
                curveTo(8.5f, 6.395f, 9.395f, 5.5f, 10.5f, 5.5f)
                curveTo(11.605f, 5.5f, 12.5f, 6.395f, 12.5f, 7.5f)
                curveTo(12.5f, 8.605f, 11.605f, 9.5f, 10.5f, 9.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE5CF58)),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.5f, 7.5f)
                moveToRelative(-1f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 0f)
            }
        }.build()

        return _PY!!
    }

@Suppress("ObjectPropertyName")
private var _PY: ImageVector? = null
