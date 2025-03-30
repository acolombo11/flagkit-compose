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

val FlagKit.IQ: ImageVector
    get() {
        if (_IQ != null) {
            return _IQ!!
        }
        _IQ = ImageVector.Builder(
            name = "IQ",
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
                        0f to Color(0xFFDF1E35),
                        1f to Color(0xFFCC162C)
                    ),
                    start = Offset(10.5f, 0f),
                    end = Offset(10.5f, 5f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(21f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-21f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF262626),
                        1f to Color(0xFF0D0D0D)
                    ),
                    start = Offset(10.5f, 10f),
                    end = Offset(10.5f, 15f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 10f)
                horizontalLineToRelative(21f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-21f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFFFFF),
                        1f to Color(0xFFF0F0F0)
                    ),
                    start = Offset(10.5f, 5f),
                    end = Offset(10.5f, 10f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 5f)
                horizontalLineToRelative(21f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-21f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0F7A40)),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(14f, 6.256f)
                curveTo(14f, 6.115f, 14.092f, 6.046f, 14.232f, 6.116f)
                lineTo(14.768f, 6.384f)
                curveTo(14.896f, 6.448f, 15f, 6.607f, 15f, 6.749f)
                lineTo(15f, 8.751f)
                curveTo(15f, 8.889f, 14.893f, 9f, 14.748f, 9f)
                lineTo(14.252f, 9f)
                curveTo(14.113f, 9f, 14f, 8.886f, 14f, 8.744f)
                lineTo(14f, 6.256f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0F7A40)),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8f, 6.256f)
                curveTo(8f, 6.115f, 8.092f, 6.046f, 8.232f, 6.116f)
                lineTo(8.768f, 6.384f)
                curveTo(8.896f, 6.448f, 9f, 6.607f, 9f, 6.749f)
                lineTo(9f, 8.751f)
                curveTo(9f, 8.889f, 8.893f, 9f, 8.748f, 9f)
                lineTo(8.252f, 9f)
                curveTo(8.113f, 9f, 8f, 8.886f, 8f, 8.744f)
                lineTo(8f, 6.256f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0F7A40)),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 6.749f)
                curveTo(12f, 6.611f, 12.092f, 6.454f, 12.232f, 6.384f)
                lineTo(12.768f, 6.116f)
                curveTo(12.896f, 6.052f, 13f, 6.114f, 13f, 6.256f)
                lineTo(13f, 8.744f)
                curveTo(13f, 8.885f, 12.893f, 9f, 12.748f, 9f)
                lineTo(12.252f, 9f)
                curveTo(12.113f, 9f, 12f, 8.893f, 12f, 8.751f)
                lineTo(12f, 6.749f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0F7A40)),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10f, 7.748f)
                curveTo(10f, 7.611f, 10.092f, 7.454f, 10.232f, 7.384f)
                lineTo(10.768f, 7.116f)
                curveTo(10.896f, 7.052f, 11f, 7.112f, 11f, 7.242f)
                lineTo(11f, 8.045f)
                lineTo(12.5f, 8.045f)
                lineTo(12.5f, 9f)
                lineTo(11.248f, 9f)
                curveTo(11.111f, 9f, 10.893f, 9f, 10.748f, 9f)
                lineTo(10.252f, 9f)
                curveTo(10.113f, 9f, 10f, 8.882f, 10f, 8.752f)
                lineTo(10f, 7.748f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0F7A40)),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6f, 7.748f)
                curveTo(6f, 7.611f, 6.092f, 7.454f, 6.232f, 7.384f)
                lineTo(6.768f, 7.116f)
                curveTo(6.896f, 7.052f, 7f, 7.112f, 7f, 7.242f)
                lineTo(7f, 8.045f)
                lineTo(8.5f, 8.045f)
                lineTo(8.5f, 9f)
                lineTo(7.248f, 9f)
                curveTo(7.111f, 9f, 6.893f, 9f, 6.748f, 9f)
                lineTo(6.252f, 9f)
                curveTo(6.113f, 9f, 6f, 8.882f, 6f, 8.752f)
                lineTo(6f, 7.748f)
                close()
            }
        }.build()

        return _IQ!!
    }

@Suppress("ObjectPropertyName")
private var _IQ: ImageVector? = null
