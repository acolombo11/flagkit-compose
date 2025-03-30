package flagkit.flags

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import flagkit.FlagKit

val FlagKit.XK: ImageVector
    get() {
        if (_XK != null) {
            return _XK!!
        }
        _XK = ImageVector.Builder(
            name = "XK",
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
                        0f to Color(0xFF2F5FBF),
                        1f to Color(0xFF244EA3)
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
                    start = Offset(10.5f, 2.293f),
                    end = Offset(10.5f, 6.707f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9f, 3.5f)
                lineTo(8.293f, 3.707f)
                lineTo(8.5f, 3f)
                lineTo(8.293f, 2.293f)
                lineTo(9f, 2.5f)
                lineTo(9.707f, 2.293f)
                lineTo(9.5f, 3f)
                lineTo(9.707f, 3.707f)
                lineTo(9f, 3.5f)
                close()
                moveTo(12f, 3.5f)
                lineTo(11.293f, 3.707f)
                lineTo(11.5f, 3f)
                lineTo(11.293f, 2.293f)
                lineTo(12f, 2.5f)
                lineTo(12.707f, 2.293f)
                lineTo(12.5f, 3f)
                lineTo(12.707f, 3.707f)
                lineTo(12f, 3.5f)
                close()
                moveTo(15f, 4.5f)
                lineTo(14.293f, 4.707f)
                lineTo(14.5f, 4f)
                lineTo(14.293f, 3.293f)
                lineTo(15f, 3.5f)
                lineTo(15.707f, 3.293f)
                lineTo(15.5f, 4f)
                lineTo(15.707f, 4.707f)
                lineTo(15f, 4.5f)
                close()
                moveTo(17f, 6.5f)
                lineTo(16.293f, 6.707f)
                lineTo(16.5f, 6f)
                lineTo(16.293f, 5.293f)
                lineTo(17f, 5.5f)
                lineTo(17.707f, 5.293f)
                lineTo(17.5f, 6f)
                lineTo(17.707f, 6.707f)
                lineTo(17f, 6.5f)
                close()
                moveTo(4f, 6.5f)
                lineTo(3.293f, 6.707f)
                lineTo(3.5f, 6f)
                lineTo(3.293f, 5.293f)
                lineTo(4f, 5.5f)
                lineTo(4.707f, 5.293f)
                lineTo(4.5f, 6f)
                lineTo(4.707f, 6.707f)
                lineTo(4f, 6.5f)
                close()
                moveTo(6f, 4.5f)
                lineTo(5.293f, 4.707f)
                lineTo(5.5f, 4f)
                lineTo(5.293f, 3.293f)
                lineTo(6f, 3.5f)
                lineTo(6.707f, 3.293f)
                lineTo(6.5f, 4f)
                lineTo(6.707f, 4.707f)
                lineTo(6f, 4.5f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFE9C072),
                        1f to Color(0xFFCFA557)
                    ),
                    start = Offset(10.5f, 5f),
                    end = Offset(10.5f, 12f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9f, 10f)
                lineToRelative(-1f, -0.5f)
                lineToRelative(-1f, -2f)
                lineToRelative(1f, 0f)
                lineToRelative(1f, -1f)
                lineToRelative(0.5f, -1f)
                lineToRelative(1f, -0.5f)
                lineToRelative(0.5f, 0.5f)
                lineToRelative(1f, 0.5f)
                lineToRelative(0f, 0.5f)
                lineToRelative(0.5f, 0.5f)
                lineToRelative(1.5f, 1f)
                lineToRelative(-0.5f, 1.5f)
                lineToRelative(-1.5f, 1.5f)
                lineToRelative(-0.5f, -1f)
                lineToRelative(-1.5f, 1f)
                lineToRelative(0f, 1f)
                lineToRelative(-0.5f, -0.5f)
                close()
            }
        }.build()

        return _XK!!
    }

@Suppress("ObjectPropertyName")
private var _XK: ImageVector? = null
