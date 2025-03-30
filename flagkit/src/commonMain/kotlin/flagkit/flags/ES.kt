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

val FlagKit.ES: ImageVector
    get() {
        if (_ES != null) {
            return _ES!!
        }
        _ES = ImageVector.Builder(
            name = "ES",
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
                        0f to Color(0xFFDD172C),
                        1f to Color(0xFFC60B1F)
                    ),
                    start = Offset(10.5f, 0f),
                    end = Offset(10.5f, 4f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(21f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-21f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFDD172C),
                        1f to Color(0xFFC60B1F)
                    ),
                    start = Offset(10.5f, 11f),
                    end = Offset(10.5f, 15f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 11f)
                horizontalLineToRelative(21f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-21f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFD133),
                        1f to Color(0xFFFFC500)
                    ),
                    start = Offset(10.5f, 4f),
                    end = Offset(10.5f, 11f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 4f)
                horizontalLineToRelative(21f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-21f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFFEDB1)),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5.5f, 7f)
                lineToRelative(1f, 0f)
                lineToRelative(0f, 0.5f)
                lineToRelative(-1f, 0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFA41517)),
                strokeLineWidth = 1f
            ) {
                moveTo(4.915f, 8.46f)
                curveTo(4.94f, 8.755f, 5.206f, 9f, 5.5f, 9f)
                curveTo(5.794f, 9f, 6.06f, 8.754f, 6.085f, 8.46f)
                lineTo(6.207f, 7f)
                lineTo(4.793f, 7f)
                lineTo(4.915f, 8.46f)
                close()
                moveTo(4.291f, 6.995f)
                curveTo(4.268f, 6.722f, 4.481f, 6.5f, 4.756f, 6.5f)
                lineTo(6.244f, 6.5f)
                curveTo(6.523f, 6.5f, 6.732f, 6.716f, 6.709f, 6.995f)
                lineTo(6.583f, 8.501f)
                curveTo(6.537f, 9.053f, 6.056f, 9.5f, 5.5f, 9.5f)
                curveTo(4.948f, 9.5f, 4.463f, 9.057f, 4.417f, 8.501f)
                lineTo(4.291f, 6.995f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFA41517)),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4.5f, 7.5f)
                lineToRelative(2f, 0f)
                lineToRelative(0f, 0.5f)
                lineToRelative(-0.5f, 0f)
                lineToRelative(-0.5f, 1f)
                lineToRelative(-0.5f, -1f)
                lineToRelative(-0.5f, 0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFA41517)),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3f, 6f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(-1f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFA41517)),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7f, 6f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(-1f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFA41517)),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4.5f, 5.5f)
                curveTo(4.5f, 5.224f, 4.714f, 5f, 5.005f, 5f)
                lineTo(5.995f, 5f)
                curveTo(6.274f, 5f, 6.5f, 5.232f, 6.5f, 5.5f)
                lineTo(6.5f, 5.748f)
                curveTo(6.5f, 5.887f, 6.392f, 6f, 6.255f, 6f)
                lineTo(4.745f, 6f)
                curveTo(4.61f, 6f, 4.5f, 5.893f, 4.5f, 5.748f)
                lineTo(4.5f, 5.5f)
                close()
            }
        }.build()

        return _ES!!
    }

@Suppress("ObjectPropertyName")
private var _ES: ImageVector? = null
