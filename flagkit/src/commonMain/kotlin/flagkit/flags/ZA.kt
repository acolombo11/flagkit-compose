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

val FlagKit.ZA: ImageVector
    get() {
        if (_ZA != null) {
            return _ZA!!
        }
        _ZA = ImageVector.Builder(
            name = "ZA",
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
                        0f to Color(0xFF06A86E),
                        1f to Color(0xFF007A4E)
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
                        0f to Color(0xFFFFBF2E),
                        1f to Color(0xFFFFB612)
                    ),
                    start = Offset(3.5f, 2f),
                    end = Offset(3.5f, 13f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 2f)
                lineToRelative(7f, 5.5f)
                lineToRelative(-7f, 5.5f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF262626),
                        1f to Color(0xFF0D0D0D)
                    ),
                    start = Offset(2.375f, 2.25f),
                    end = Offset(2.375f, 12.75f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(-1f, 2.25f)
                lineToRelative(6.75f, 5.25f)
                lineToRelative(-6.75f, 5.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9f, 6f)
                lineToRelative(-7f, -6f)
                lineToRelative(19f, 0f)
                lineToRelative(0f, 6f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFF44E46),
                        1f to Color(0xFFDF3931)
                    ),
                    start = Offset(12.125f, 0f),
                    end = Offset(12.125f, 5f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9.25f, 5f)
                lineToRelative(-6f, -5f)
                lineToRelative(17.75f, 0f)
                lineToRelative(0f, 5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(2f, 15f)
                lineToRelative(19f, 0f)
                lineToRelative(0f, -6f)
                lineToRelative(-12f, 0f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF072CB4),
                        1f to Color(0xFF042396)
                    ),
                    start = Offset(12.125f, 10f),
                    end = Offset(12.125f, 15f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3.25f, 15f)
                lineToRelative(17.75f, 0f)
                lineToRelative(0f, -5f)
                lineToRelative(-11.75f, 0f)
                close()
            }
        }.build()

        return _ZA!!
    }

@Suppress("ObjectPropertyName")
private var _ZA: ImageVector? = null
