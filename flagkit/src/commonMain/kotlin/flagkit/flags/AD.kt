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

val FlagKit.AD: ImageVector
    get() {
        if (_AD != null) {
            return _AD!!
        }
        _AD = ImageVector.Builder(
            name = "AD",
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
                        0f to Color(0xFF1537D1),
                        1f to Color(0xFF0522A5)
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
                        0f to Color(0xFFEA3058),
                        1f to Color(0xFFCE173E)
                    ),
                    start = Offset(15.5f, 0f),
                    end = Offset(15.5f, 15f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10f, 0f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(-11f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFCF3C),
                        1f to Color(0xFFFECB2F)
                    ),
                    start = Offset(10.5f, 0f),
                    end = Offset(10.5f, 15f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7f, 0f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(-7f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFFEDB1)),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9.5f, 6.5f)
                lineToRelative(1f, 0f)
                lineToRelative(0f, 0.5f)
                lineToRelative(-1f, 0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFD32E28)),
                strokeLineWidth = 1f
            ) {
                moveTo(9.665f, 7.96f)
                curveTo(9.69f, 8.255f, 9.957f, 8.5f, 10.252f, 8.5f)
                lineTo(10.748f, 8.5f)
                curveTo(11.042f, 8.5f, 11.311f, 8.253f, 11.335f, 7.96f)
                lineTo(11.457f, 6.5f)
                lineTo(9.543f, 6.5f)
                lineTo(9.665f, 7.96f)
                close()
                moveTo(9.041f, 6.495f)
                curveTo(9.018f, 6.222f, 9.216f, 6f, 9.495f, 6f)
                lineTo(11.505f, 6f)
                curveTo(11.778f, 6f, 11.982f, 6.216f, 11.959f, 6.495f)
                lineTo(11.833f, 8.001f)
                curveTo(11.787f, 8.553f, 11.303f, 9f, 10.748f, 9f)
                lineTo(10.252f, 9f)
                curveTo(9.699f, 9f, 9.213f, 8.557f, 9.167f, 8.001f)
                lineTo(9.041f, 6.495f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFD32E28)),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9.5f, 7f)
                lineToRelative(2f, 0f)
                lineToRelative(0f, 0.5f)
                lineToRelative(-0.5f, 0f)
                lineToRelative(-1f, 0f)
                lineToRelative(-0.5f, 0f)
                close()
            }
        }.build()

        return _AD!!
    }

@Suppress("ObjectPropertyName")
private var _AD: ImageVector? = null
