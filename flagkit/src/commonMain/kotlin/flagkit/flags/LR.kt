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

val FlagKit.LR: ImageVector
    get() {
        if (_LR != null) {
            return _LR!!
        }
        _LR = ImageVector.Builder(
            name = "LR",
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
                    end = Offset(10.5f, 14f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10f, 0f)
                lineTo(21f, 0f)
                lineTo(21f, 2f)
                lineTo(10f, 2f)
                lineTo(10f, 0f)
                close()
                moveTo(10f, 4f)
                lineTo(21f, 4f)
                lineTo(21f, 6f)
                lineTo(10f, 6f)
                lineTo(10f, 4f)
                close()
                moveTo(10f, 8f)
                lineTo(21f, 8f)
                lineTo(21f, 10f)
                lineTo(10f, 10f)
                lineTo(10f, 8f)
                close()
                moveTo(0f, 12f)
                lineTo(21f, 12f)
                lineTo(21f, 14f)
                lineTo(0f, 14f)
                lineTo(0f, 12f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF0C3F8E),
                        1f to Color(0xFF032A67)
                    ),
                    start = Offset(5f, 0f),
                    end = Offset(5f, 10f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(-10f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5f, 6.17f)
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
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFFFFF),
                        1f to Color(0xFFF0F0F0)
                    ),
                    start = Offset(5.001f, 2f),
                    end = Offset(5.001f, 7.427f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5f, 6.17f)
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

        return _LR!!
    }

@Suppress("ObjectPropertyName")
private var _LR: ImageVector? = null
