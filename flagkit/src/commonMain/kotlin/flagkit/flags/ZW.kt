package flagkit.flags

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import flagkit.FlagKit

val FlagKit.ZW: ImageVector
    get() {
        if (_ZW != null) {
            return _ZW!!
        }
        _ZW = ImageVector.Builder(
            name = "ZW",
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
                        0f to Color(0xFF369D0C),
                        1f to Color(0xFF319209)
                    ),
                    start = Offset(10.5f, 0f),
                    end = Offset(10.5f, 2f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(21f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-21f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF369D0C),
                        1f to Color(0xFF319209)
                    ),
                    start = Offset(10.5f, 13f),
                    end = Offset(10.5f, 15f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 13f)
                horizontalLineToRelative(21f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-21f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF369D0C),
                        1f to Color(0xFF319209)
                    ),
                    start = Offset(10.5f, 4f),
                    end = Offset(10.5f, 6f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 4f)
                horizontalLineToRelative(21f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-21f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF369D0C),
                        1f to Color(0xFF319209)
                    ),
                    start = Offset(10.5f, 9f),
                    end = Offset(10.5f, 11f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 9f)
                horizontalLineToRelative(21f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-21f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF262626),
                        1f to Color(0xFF0D0D0D)
                    ),
                    start = Offset(10.5f, 6f),
                    end = Offset(10.5f, 9f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 6f)
                horizontalLineToRelative(21f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-21f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFD40E),
                        1f to Color(0xFFFFD201)
                    ),
                    start = Offset(10.5f, 2f),
                    end = Offset(10.5f, 4f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 2f)
                horizontalLineToRelative(21f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-21f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFD40E),
                        1f to Color(0xFFFFD201)
                    ),
                    start = Offset(10.5f, 11f),
                    end = Offset(10.5f, 13f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 11f)
                horizontalLineToRelative(21f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-21f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF262626),
                        1f to Color(0xFF0D0D0D)
                    ),
                    start = Offset(4.5f, 0f),
                    end = Offset(4.5f, 15f)
                ),
                strokeLineWidth = 1f
            ) {
                moveTo(-1f, 15f)
                lineToRelative(0f, -15f)
                lineToRelative(1f, 0f)
                lineToRelative(10f, 7.5f)
                lineToRelative(-10f, 7.5f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFFFFF),
                        1f to Color(0xFFF0F0F0)
                    ),
                    start = Offset(4.167f, 1.25f),
                    end = Offset(4.167f, 13.75f)
                ),
                strokeLineWidth = 1f
            ) {
                moveTo(0f, 13.75f)
                lineToRelative(8.333f, -6.25f)
                lineToRelative(-8.333f, -6.25f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFF12F1F),
                        1f to Color(0xFFDE2010)
                    ),
                    start = Offset(3.001f, 5.001f),
                    end = Offset(3.001f, 9.523f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3f, 8.475f)
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

        return _ZW!!
    }

@Suppress("ObjectPropertyName")
private var _ZW: ImageVector? = null
