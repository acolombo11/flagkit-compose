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

val FlagKit.IL: ImageVector
    get() {
        if (_IL != null) {
            return _IL!!
        }
        _IL = ImageVector.Builder(
            name = "IL",
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
                        0f to Color(0xFF0E46D4),
                        1f to Color(0xFF0538B9)
                    ),
                    start = Offset(10.5f, 0f),
                    end = Offset(10.5f, 3f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(21f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-21f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF0E46D4),
                        1f to Color(0xFF0538B9)
                    ),
                    start = Offset(10.5f, 12f),
                    end = Offset(10.5f, 15f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 12f)
                horizontalLineToRelative(21f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-21f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFFFFF),
                        1f to Color(0xFFF0F0F0)
                    ),
                    start = Offset(10.5f, 3f),
                    end = Offset(10.5f, 12f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 3f)
                horizontalLineToRelative(21f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(-21f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF093EC5)),
                strokeLineWidth = 0.5f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.575f, 9.25f)
                lineTo(10.5f, 3.985f)
                lineTo(13.425f, 9.25f)
                lineTo(7.575f, 9.25f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF093EC5)),
                strokeLineWidth = 0.5f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.575f, 5.75f)
                lineTo(10.5f, 11.015f)
                lineTo(13.425f, 5.75f)
                lineTo(7.575f, 5.75f)
                close()
            }
        }.build()

        return _IL!!
    }

@Suppress("ObjectPropertyName")
private var _IL: ImageVector? = null
