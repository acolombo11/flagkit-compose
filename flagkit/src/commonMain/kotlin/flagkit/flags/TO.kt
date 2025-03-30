package flagkit.flags

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import flagkit.FlagKit

val FlagKit.TO: ImageVector
    get() {
        if (_TO != null) {
            return _TO!!
        }
        _TO = ImageVector.Builder(
            name = "TO",
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
                        0f to Color(0xFFE20F1B),
                        1f to Color(0xFFC00711)
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
                        0f to Color(0xFFDF101B),
                        1f to Color(0xFFC00711)
                    ),
                    start = Offset(6f, 1f),
                    end = Offset(6f, 7f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7f, 3f)
                lineTo(7f, 1.258f)
                curveTo(7f, 1.104f, 6.89f, 1f, 6.755f, 1f)
                lineTo(5.245f, 1f)
                curveTo(5.108f, 1f, 5f, 1.115f, 5f, 1.258f)
                lineTo(5f, 3f)
                lineTo(3.258f, 3f)
                curveTo(3.104f, 3f, 3f, 3.11f, 3f, 3.245f)
                lineTo(3f, 4.755f)
                curveTo(3f, 4.892f, 3.115f, 5f, 3.258f, 5f)
                lineTo(5f, 5f)
                lineTo(5f, 6.742f)
                curveTo(5f, 6.896f, 5.11f, 7f, 5.245f, 7f)
                lineTo(6.755f, 7f)
                curveTo(6.892f, 7f, 7f, 6.885f, 7f, 6.742f)
                lineTo(7f, 5f)
                lineTo(8.742f, 5f)
                curveTo(8.896f, 5f, 9f, 4.89f, 9f, 4.755f)
                lineTo(9f, 3.245f)
                curveTo(9f, 3.108f, 8.885f, 3f, 8.742f, 3f)
                lineTo(7f, 3f)
                lineTo(7f, 3f)
                close()
            }
        }.build()

        return _TO!!
    }

@Suppress("ObjectPropertyName")
private var _TO: ImageVector? = null
