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

val FlagKit.AW: ImageVector
    get() {
        if (_AW != null) {
            return _AW!!
        }
        _AW = ImageVector.Builder(
            name = "AW",
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
                        0f to Color(0xFF5098EA),
                        1f to Color(0xFF458BDB)
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
                    start = Offset(4.5f, 1.5f),
                    end = Offset(4.5f, 7.5f)
                ),
                strokeLineWidth = 1f
            ) {
                moveTo(1.803f, 4.96f)
                curveTo(1.399f, 4.786f, 1.399f, 4.214f, 1.803f, 4.04f)
                lineTo(3.369f, 3.369f)
                lineTo(4.04f, 1.803f)
                curveTo(4.214f, 1.399f, 4.786f, 1.399f, 4.96f, 1.803f)
                lineTo(5.631f, 3.369f)
                lineTo(7.197f, 4.04f)
                curveTo(7.601f, 4.214f, 7.601f, 4.786f, 7.197f, 4.96f)
                lineTo(5.631f, 5.631f)
                lineTo(4.96f, 7.197f)
                curveTo(4.786f, 7.601f, 4.214f, 7.601f, 4.04f, 7.197f)
                lineTo(3.369f, 5.631f)
                lineTo(1.803f, 4.96f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFE82045),
                        1f to Color(0xFFD01739)
                    ),
                    start = Offset(4.5f, 2f),
                    end = Offset(4.5f, 7f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3.75f, 5.25f)
                lineToRelative(-1.75f, -0.75f)
                lineToRelative(1.75f, -0.75f)
                lineToRelative(0.75f, -1.75f)
                lineToRelative(0.75f, 1.75f)
                lineToRelative(1.75f, 0.75f)
                lineToRelative(-1.75f, 0.75f)
                lineToRelative(-0.75f, 1.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF9D536)),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 11f)
                horizontalLineToRelative(21f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-21f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF9D536)),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 9f)
                horizontalLineToRelative(21f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-21f)
                close()
            }
        }.build()

        return _AW!!
    }

@Suppress("ObjectPropertyName")
private var _AW: ImageVector? = null
