package flagkit.flags

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import flagkit.FlagKit

val FlagKit.KN: ImageVector
    get() {
        if (_KN != null) {
            return _KN!!
        }
        _KN = ImageVector.Builder(
            name = "KN",
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
                        0f to Color(0xFF1EC160),
                        1f to Color(0xFF169E4D)
                    ),
                    start = Offset(10.501f, 0f),
                    end = Offset(10.501f, 10f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0.001f, 10f)
                lineToRelative(21f, -10f)
                lineToRelative(-21f, 0f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFDF2A40),
                        1f to Color(0xFFCC162C)
                    ),
                    start = Offset(10.501f, 5f),
                    end = Offset(10.501f, 15f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0.001f, 15f)
                lineToRelative(21f, 0f)
                lineToRelative(0f, -10f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFD956),
                        1f to Color(0xFFFCD036)
                    ),
                    start = Offset(10.501f, -0.149f),
                    end = Offset(10.501f, 14.957f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0.589f, 19f)
                lineToRelative(24.593f, -15.368f)
                lineToRelative(-4.769f, -7.632f)
                lineToRelative(-24.593f, 15.368f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF262626),
                        1f to Color(0xFF0D0D0D)
                    ),
                    start = Offset(10.5f, -2.304f),
                    end = Offset(10.5f, 17.304f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(-0.471f, 17.304f)
                lineToRelative(24.593f, -15.368f)
                lineToRelative(-2.65f, -4.24f)
                lineToRelative(-24.593f, 15.368f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFFFFF),
                        1f to Color(0xFFF0F0F0)
                    ),
                    start = Offset(14.67f, 3.25f),
                    end = Offset(14.67f, 6.971f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(15.233f, 5.848f)
                lineToRelative(-0.709f, 1.123f)
                lineToRelative(-0.46f, -1.246f)
                lineToRelative(-1.287f, -0.327f)
                lineToRelative(1.043f, -0.823f)
                lineToRelative(-0.086f, -1.325f)
                lineToRelative(1.105f, 0.738f)
                lineToRelative(1.234f, -0.492f)
                lineToRelative(-0.36f, 1.278f)
                lineToRelative(0.849f, 1.021f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFFFFF),
                        1f to Color(0xFFF0F0F0)
                    ),
                    start = Offset(6.669f, 8.1f),
                    end = Offset(6.669f, 11.821f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.233f, 10.698f)
                lineToRelative(-0.709f, 1.123f)
                lineToRelative(-0.46f, -1.246f)
                lineToRelative(-1.287f, -0.327f)
                lineToRelative(1.043f, -0.823f)
                lineToRelative(-0.086f, -1.325f)
                lineToRelative(1.105f, 0.738f)
                lineToRelative(1.234f, -0.492f)
                lineToRelative(-0.36f, 1.278f)
                lineToRelative(0.849f, 1.021f)
                close()
            }
        }.build()

        return _KN!!
    }

@Suppress("ObjectPropertyName")
private var _KN: ImageVector? = null
