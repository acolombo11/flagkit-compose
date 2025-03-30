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

val FlagKit.EC: ImageVector
    get() {
        if (_EC != null) {
            return _EC!!
        }
        _EC = ImageVector.Builder(
            name = "EC",
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
                        0f to Color(0xFF0748AE),
                        1f to Color(0xFF003993)
                    ),
                    start = Offset(10.5f, 7f),
                    end = Offset(10.5f, 11f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 7f)
                horizontalLineToRelative(21f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-21f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFDE2035),
                        1f to Color(0xFFCE1126)
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
                        0f to Color(0xFFFFD935),
                        1f to Color(0xFFFDD216)
                    ),
                    start = Offset(10.5f, 0f),
                    end = Offset(10.5f, 7f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(21f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-21f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFBDC44),
                        1f to Color(0xFFFFDC32)
                    ),
                    start = Offset(10.5f, 6f),
                    end = Offset(10.5f, 9.6f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9.3f, 6f)
                curveTo(8.814f, 6.365f, 8.5f, 6.946f, 8.5f, 7.6f)
                curveTo(8.5f, 8.705f, 9.395f, 9.6f, 10.5f, 9.6f)
                curveTo(11.605f, 9.6f, 12.5f, 8.705f, 12.5f, 7.6f)
                curveTo(12.5f, 6.946f, 12.186f, 6.365f, 11.7f, 6f)
                lineTo(11f, 8.1f)
                lineTo(10f, 8.1f)
                lineTo(9.3f, 6f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF5FC0DC)),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.5f, 5.5f)
                lineToRelative(0.5f, 2.5f)
                lineToRelative(-1f, 0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF3F2821)),
                fillAlpha = 0.66f,
                strokeAlpha = 0.66f,
                strokeLineWidth = 1f
            ) {
                moveTo(9.677f, 3.823f)
                curveTo(9.61f, 3.756f, 9.511f, 3.733f, 9.421f, 3.763f)
                lineTo(7.921f, 4.263f)
                curveTo(7.79f, 4.306f, 7.719f, 4.448f, 7.763f, 4.579f)
                curveTo(7.806f, 4.71f, 7.948f, 4.781f, 8.079f, 4.737f)
                lineTo(9.432f, 4.286f)
                lineTo(10.323f, 5.177f)
                curveTo(10.421f, 5.274f, 10.579f, 5.274f, 10.677f, 5.177f)
                lineTo(11.568f, 4.286f)
                lineTo(12.921f, 4.737f)
                curveTo(13.052f, 4.781f, 13.194f, 4.71f, 13.237f, 4.579f)
                curveTo(13.281f, 4.448f, 13.21f, 4.306f, 13.079f, 4.263f)
                lineTo(11.579f, 3.763f)
                curveTo(11.489f, 3.733f, 11.39f, 3.756f, 11.323f, 3.823f)
                lineTo(10.5f, 4.646f)
                lineTo(9.677f, 3.823f)
                close()
            }
        }.build()

        return _EC!!
    }

@Suppress("ObjectPropertyName")
private var _EC: ImageVector? = null
