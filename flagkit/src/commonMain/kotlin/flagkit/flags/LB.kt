package flagkit.flags

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import flagkit.FlagKit

val FlagKit.LB: ImageVector
    get() {
        if (_LB != null) {
            return _LB!!
        }
        _LB = ImageVector.Builder(
            name = "LB",
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
                        0f to Color(0xFFF03340),
                        1f to Color(0xFFEB212E)
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
                        0f to Color(0xFFF03340),
                        1f to Color(0xFFEB212E)
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
                        0f to Color(0xFFFFFFFF),
                        1f to Color(0xFFF0F0F0)
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
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF1FC065),
                        1f to Color(0xFF17A555)
                    ),
                    start = Offset(10.501f, 5.179f),
                    end = Offset(10.501f, 10f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9.65f, 9.35f)
                curveTo(9.843f, 9.157f, 9.842f, 8.842f, 9.647f, 8.647f)
                lineTo(9.853f, 8.853f)
                curveTo(9.658f, 8.658f, 9.286f, 8.554f, 9.016f, 8.621f)
                lineTo(7.984f, 8.879f)
                curveTo(7.717f, 8.946f, 7.685f, 8.862f, 7.905f, 8.696f)
                lineTo(9.095f, 7.804f)
                curveTo(9.319f, 7.636f, 9.279f, 7.5f, 8.992f, 7.5f)
                lineTo(8.508f, 7.5f)
                curveTo(8.227f, 7.5f, 8.199f, 7.4f, 8.444f, 7.278f)
                lineTo(9.556f, 6.722f)
                curveTo(9.801f, 6.599f, 9.779f, 6.5f, 9.492f, 6.5f)
                lineTo(9.008f, 6.5f)
                curveTo(8.727f, 6.5f, 8.685f, 6.362f, 8.905f, 6.196f)
                lineTo(10.095f, 5.304f)
                curveTo(10.319f, 5.136f, 10.685f, 5.138f, 10.905f, 5.304f)
                lineTo(12.095f, 6.196f)
                curveTo(12.319f, 6.364f, 12.279f, 6.5f, 11.992f, 6.5f)
                lineTo(11.508f, 6.5f)
                curveTo(11.227f, 6.5f, 11.199f, 6.6f, 11.444f, 6.722f)
                lineTo(12.556f, 7.278f)
                curveTo(12.801f, 7.401f, 12.779f, 7.5f, 12.492f, 7.5f)
                lineTo(12.008f, 7.5f)
                curveTo(11.727f, 7.5f, 11.685f, 7.638f, 11.905f, 7.804f)
                lineTo(13.095f, 8.696f)
                curveTo(13.319f, 8.864f, 13.286f, 8.946f, 13.016f, 8.879f)
                lineTo(11.984f, 8.621f)
                curveTo(11.717f, 8.554f, 11.342f, 8.658f, 11.147f, 8.853f)
                lineTo(11.353f, 8.647f)
                curveTo(11.158f, 8.842f, 11.156f, 9.156f, 11.35f, 9.35f)
                lineTo(11.65f, 9.65f)
                curveTo(11.843f, 9.843f, 11.784f, 10f, 11.505f, 10f)
                lineTo(9.495f, 10f)
                curveTo(9.222f, 10f, 9.156f, 9.844f, 9.35f, 9.65f)
                lineTo(9.65f, 9.35f)
                close()
            }
        }.build()

        return _LB!!
    }

@Suppress("ObjectPropertyName")
private var _LB: ImageVector? = null
