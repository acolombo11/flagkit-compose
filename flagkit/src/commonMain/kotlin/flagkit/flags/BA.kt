package flagkit.flags

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import flagkit.FlagKit

val FlagKit.BA: ImageVector
    get() {
        if (_BA != null) {
            return _BA!!
        }
        _BA = ImageVector.Builder(
            name = "BA",
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
                        0f to Color(0xFF0B36B2),
                        1f to Color(0xFF042993)
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
                        0f to Color(0xFFFFD045),
                        1f to Color(0xFFFECA2F)
                    ),
                    start = Offset(11.75f, 0f),
                    end = Offset(11.75f, 15f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(17f, 15f)
                lineToRelative(0f, -15f)
                lineToRelative(-10.5f, 0f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFFFFF),
                        1f to Color(0xFFF0F0F0)
                    ),
                    start = Offset(13f, 12.793f),
                    end = Offset(13f, 14.207f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13f, 14f)
                lineToRelative(-0.707f, 0.207f)
                lineToRelative(0.207f, -0.707f)
                lineToRelative(-0.207f, -0.707f)
                lineToRelative(0.707f, 0.207f)
                lineToRelative(0.707f, -0.207f)
                lineToRelative(-0.207f, 0.707f)
                lineToRelative(0.207f, 0.707f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFFFFF),
                        1f to Color(0xFFF0F0F0)
                    ),
                    start = Offset(11f, 9.793f),
                    end = Offset(11f, 11.207f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11f, 11f)
                lineToRelative(-0.707f, 0.207f)
                lineToRelative(0.207f, -0.707f)
                lineToRelative(-0.207f, -0.707f)
                lineToRelative(0.707f, 0.207f)
                lineToRelative(0.707f, -0.207f)
                lineToRelative(-0.207f, 0.707f)
                lineToRelative(0.207f, 0.707f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFFFFF),
                        1f to Color(0xFFF0F0F0)
                    ),
                    start = Offset(9f, 6.793f),
                    end = Offset(9f, 8.207f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9f, 8f)
                lineToRelative(-0.707f, 0.207f)
                lineToRelative(0.207f, -0.707f)
                lineToRelative(-0.207f, -0.707f)
                lineToRelative(0.707f, 0.207f)
                lineToRelative(0.707f, -0.207f)
                lineToRelative(-0.207f, 0.707f)
                lineToRelative(0.207f, 0.707f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFFFFF),
                        1f to Color(0xFFF0F0F0)
                    ),
                    start = Offset(7f, 3.793f),
                    end = Offset(7f, 5.207f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7f, 5f)
                lineToRelative(-0.707f, 0.207f)
                lineToRelative(0.207f, -0.707f)
                lineToRelative(-0.207f, -0.707f)
                lineToRelative(0.707f, 0.207f)
                lineToRelative(0.707f, -0.207f)
                lineToRelative(-0.207f, 0.707f)
                lineToRelative(0.207f, 0.707f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFFFFF),
                        1f to Color(0xFFF0F0F0)
                    ),
                    start = Offset(5f, 0.793f),
                    end = Offset(5f, 2.207f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5f, 2f)
                lineToRelative(-0.707f, 0.207f)
                lineToRelative(0.207f, -0.707f)
                lineToRelative(-0.207f, -0.707f)
                lineToRelative(0.707f, 0.207f)
                lineToRelative(0.707f, -0.207f)
                lineToRelative(-0.207f, 0.707f)
                lineToRelative(0.207f, 0.707f)
                close()
            }
        }.build()

        return _BA!!
    }

@Suppress("ObjectPropertyName")
private var _BA: ImageVector? = null
