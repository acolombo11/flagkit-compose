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

val FlagKit.MA: ImageVector
    get() {
        if (_MA != null) {
            return _MA!!
        }
        _MA = ImageVector.Builder(
            name = "MA",
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
                        0f to Color(0xFFE33B44),
                        1f to Color(0xFFC02A32)
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
                fill = SolidColor(Color(0xFF0A6135)),
                strokeLineWidth = 1f
            ) {
                moveTo(10.5f, 9.255f)
                lineTo(7.855f, 11.141f)
                lineTo(8.831f, 8.042f)
                lineTo(6.22f, 6.109f)
                lineTo(9.468f, 6.08f)
                lineTo(10.5f, 3f)
                lineTo(11.532f, 6.08f)
                lineTo(14.78f, 6.109f)
                lineTo(12.169f, 8.042f)
                lineTo(13.145f, 11.141f)
                lineTo(10.5f, 9.255f)
                close()
                moveTo(10.5f, 8.027f)
                lineTo(11.294f, 8.593f)
                lineTo(11.001f, 7.663f)
                lineTo(11.785f, 7.082f)
                lineTo(10.81f, 7.074f)
                lineTo(10.5f, 6.149f)
                lineTo(10.19f, 7.074f)
                lineTo(9.215f, 7.082f)
                lineTo(9.999f, 7.663f)
                lineTo(9.706f, 8.593f)
                lineTo(10.5f, 8.027f)
                close()
            }
        }.build()

        return _MA!!
    }

@Suppress("ObjectPropertyName")
private var _MA: ImageVector? = null
