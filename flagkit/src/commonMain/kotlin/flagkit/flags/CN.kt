package flagkit.flags

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import flagkit.FlagKit

val FlagKit.CN: ImageVector
    get() {
        if (_CN != null) {
            return _CN!!
        }
        _CN = ImageVector.Builder(
            name = "CN",
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
                        0f to Color(0xFFF1361D),
                        1f to Color(0xFFDF2910)
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
                        0f to Color(0xFFFFDC42),
                        1f to Color(0xFFFDD217)
                    ),
                    start = Offset(8.781f, 1.196f),
                    end = Offset(9.639f, 9.241f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.129f, 4.483f)
                lineTo(9.5f, 4.866f)
                lineTo(9.517f, 4.129f)
                lineTo(9.134f, 3.5f)
                lineTo(9.871f, 3.517f)
                lineTo(10.5f, 3.134f)
                lineTo(10.483f, 3.871f)
                lineTo(10.866f, 4.5f)
                lineTo(10.129f, 4.483f)
                close()
                moveTo(8.281f, 2.449f)
                lineTo(7.554f, 2.326f)
                lineTo(8.051f, 1.781f)
                lineTo(8.174f, 1.054f)
                lineTo(8.719f, 1.551f)
                lineTo(9.446f, 1.674f)
                lineTo(8.949f, 2.219f)
                lineTo(8.826f, 2.946f)
                lineTo(8.281f, 2.449f)
                close()
                moveTo(8.646f, 8.978f)
                lineTo(8.031f, 9.383f)
                lineTo(8.022f, 8.646f)
                lineTo(7.617f, 8.031f)
                lineTo(8.354f, 8.022f)
                lineTo(8.969f, 7.617f)
                lineTo(8.978f, 8.354f)
                lineTo(9.383f, 8.969f)
                lineTo(8.646f, 8.978f)
                close()
                moveTo(9.913f, 6.992f)
                lineTo(9.181f, 7.074f)
                lineTo(9.508f, 6.413f)
                lineTo(9.426f, 5.681f)
                lineTo(10.087f, 6.008f)
                lineTo(10.819f, 5.926f)
                lineTo(10.492f, 6.587f)
                lineTo(10.574f, 7.319f)
                lineTo(9.913f, 6.992f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFDC42),
                        1f to Color(0xFFFDD217)
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

        return _CN!!
    }

@Suppress("ObjectPropertyName")
private var _CN: ImageVector? = null
