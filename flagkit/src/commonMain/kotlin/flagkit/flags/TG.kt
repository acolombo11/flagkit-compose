package flagkit.flags

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import flagkit.FlagKit

val FlagKit.TG: ImageVector
    get() {
        if (_TG != null) {
            return _TG!!
        }
        _TG = ImageVector.Builder(
            name = "TG",
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
                        0f to Color(0xFFFFD44D),
                        1f to Color(0xFFFFCD2F)
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
                        0f to Color(0xFF159A74),
                        1f to Color(0xFF0C6A4F)
                    ),
                    start = Offset(10.5f, 0f),
                    end = Offset(10.5f, 15f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9f, 0f)
                lineTo(21f, 0f)
                lineTo(21f, 3f)
                lineTo(9f, 3f)
                lineTo(9f, 0f)
                close()
                moveTo(9f, 6f)
                lineTo(21f, 6f)
                lineTo(21f, 9f)
                lineTo(9f, 9f)
                lineTo(9f, 6f)
                close()
                moveTo(0f, 12f)
                lineTo(21f, 12f)
                lineTo(21f, 15f)
                lineTo(0f, 15f)
                lineTo(0f, 12f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFED1F45),
                        1f to Color(0xFFD01739)
                    ),
                    start = Offset(4.5f, 0f),
                    end = Offset(4.5f, 9f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(-9f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFFFFF),
                        1f to Color(0xFFF0F0F0)
                    ),
                    start = Offset(4.501f, 1.5f),
                    end = Offset(4.501f, 6.927f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4.5f, 5.67f)
                lineToRelative(-1.763f, 1.257f)
                lineToRelative(0.651f, -2.066f)
                lineToRelative(-1.74f, -1.289f)
                lineToRelative(2.165f, -0.019f)
                lineToRelative(0.688f, -2.053f)
                lineToRelative(0.688f, 2.053f)
                lineToRelative(2.165f, 0.019f)
                lineToRelative(-1.74f, 1.289f)
                lineToRelative(0.651f, 2.066f)
                close()
            }
        }.build()

        return _TG!!
    }

@Suppress("ObjectPropertyName")
private var _TG: ImageVector? = null
