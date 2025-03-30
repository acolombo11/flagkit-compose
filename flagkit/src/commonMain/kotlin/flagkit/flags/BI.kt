package flagkit.flags

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import flagkit.FlagKit

val FlagKit.BI: ImageVector
    get() {
        if (_BI != null) {
            return _BI!!
        }
        _BI = ImageVector.Builder(
            name = "BI",
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
                        0f to Color(0xFFE4233B),
                        1f to Color(0xFFCC162C)
                    ),
                    start = Offset(10.5f, -0.003f),
                    end = Offset(10.5f, 14.997f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, -0.003f)
                horizontalLineToRelative(21f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(-21f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF34CD4E),
                        1f to Color(0xFF2AB441)
                    ),
                    start = Offset(4.42f, -0.003f),
                    end = Offset(4.42f, 14.997f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(-0.08f, -0.003f)
                lineToRelative(9f, 7.5f)
                lineToRelative(-9f, 7.5f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF34CD4E),
                        1f to Color(0xFF2AB441)
                    ),
                    start = Offset(16.5f, -0.003f),
                    end = Offset(16.5f, 14.997f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(21f, -0.003f)
                lineToRelative(-9f, 7.5f)
                lineToRelative(9f, 7.5f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFFFFF),
                        1f to Color(0xFFF0F0F0)
                    ),
                    start = Offset(10.5f, -1.44f),
                    end = Offset(10.5f, 16.435f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.279f, 4.793f)
                lineTo(-0.962f, -1.44f)
                lineTo(-2.08f, 0.218f)
                lineTo(7.16f, 6.45f)
                curveTo(7.056f, 6.781f, 7f, 7.133f, 7f, 7.497f)
                curveTo(7f, 7.862f, 7.056f, 8.214f, 7.16f, 8.544f)
                lineTo(-2.08f, 14.777f)
                lineTo(-0.962f, 16.435f)
                lineTo(8.279f, 10.202f)
                curveTo(8.883f, 10.699f, 9.657f, 10.997f, 10.5f, 10.997f)
                curveTo(11.344f, 10.997f, 12.117f, 10.699f, 12.722f, 10.202f)
                lineTo(21.962f, 16.435f)
                lineTo(23.08f, 14.777f)
                lineTo(13.841f, 8.544f)
                curveTo(13.944f, 8.214f, 14f, 7.862f, 14f, 7.497f)
                curveTo(14f, 7.133f, 13.944f, 6.781f, 13.841f, 6.45f)
                lineTo(23.08f, 0.218f)
                lineTo(21.962f, -1.44f)
                lineTo(12.722f, 4.793f)
                curveTo(12.117f, 4.296f, 11.344f, 3.997f, 10.5f, 3.997f)
                curveTo(9.657f, 3.997f, 8.883f, 4.296f, 8.279f, 4.793f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFDF2239),
                        1f to Color(0xFFCC162C)
                    ),
                    start = Offset(10.5f, 5.29f),
                    end = Offset(10.5f, 9.204f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.5f, 6.497f)
                lineTo(9.793f, 6.704f)
                lineTo(10f, 5.997f)
                lineTo(9.793f, 5.29f)
                lineTo(10.5f, 5.497f)
                lineTo(11.207f, 5.29f)
                lineTo(11f, 5.997f)
                lineTo(11.207f, 6.704f)
                lineTo(10.5f, 6.497f)
                close()
                moveTo(9f, 8.997f)
                lineTo(8.293f, 9.204f)
                lineTo(8.5f, 8.497f)
                lineTo(8.293f, 7.79f)
                lineTo(9f, 7.997f)
                lineTo(9.707f, 7.79f)
                lineTo(9.5f, 8.497f)
                lineTo(9.707f, 9.204f)
                lineTo(9f, 8.997f)
                close()
                moveTo(12f, 8.997f)
                lineTo(11.293f, 9.204f)
                lineTo(11.5f, 8.497f)
                lineTo(11.293f, 7.79f)
                lineTo(12f, 7.997f)
                lineTo(12.707f, 7.79f)
                lineTo(12.5f, 8.497f)
                lineTo(12.707f, 9.204f)
                lineTo(12f, 8.997f)
                close()
            }
        }.build()

        return _BI!!
    }

@Suppress("ObjectPropertyName")
private var _BI: ImageVector? = null
