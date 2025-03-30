package flagkit.flags

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import flagkit.FlagKit

val FlagKit.VA: ImageVector
    get() {
        if (_VA != null) {
            return _VA!!
        }
        _VA = ImageVector.Builder(
            name = "VA",
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
                        0f to Color(0xFFFDE048),
                        1f to Color(0xFFFFDF32)
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
                        0f to Color(0xFFCDCCCC),
                        1f to Color(0xFFE4E4E4)
                    ),
                    start = Offset(15.897f, 5.464f),
                    end = Offset(15.897f, 11.207f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(18.682f, 8.646f)
                curveTo(19.268f, 9.232f, 19.268f, 10.182f, 18.682f, 10.768f)
                curveTo(18.096f, 11.354f, 17.146f, 11.354f, 16.561f, 10.768f)
                curveTo(16.099f, 10.306f, 16.001f, 9.618f, 16.267f, 9.06f)
                lineTo(14.086f, 6.879f)
                lineTo(13.732f, 7.232f)
                lineTo(13.379f, 7.586f)
                lineTo(12.672f, 6.879f)
                lineTo(13.025f, 6.525f)
                lineTo(13.732f, 5.818f)
                lineTo(14.086f, 5.464f)
                lineTo(14.439f, 5.818f)
                lineTo(16.975f, 8.353f)
                curveTo(17.532f, 8.087f, 18.22f, 8.185f, 18.682f, 8.646f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFCD9D25),
                        1f to Color(0xFFEBB93A)
                    ),
                    start = Offset(15.103f, 5.464f),
                    end = Offset(15.103f, 11.207f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(14.025f, 8.353f)
                curveTo(13.468f, 8.087f, 12.78f, 8.185f, 12.318f, 8.646f)
                curveTo(11.732f, 9.232f, 11.732f, 10.182f, 12.318f, 10.768f)
                curveTo(12.904f, 11.354f, 13.854f, 11.354f, 14.439f, 10.768f)
                curveTo(14.901f, 10.306f, 14.999f, 9.618f, 14.733f, 9.06f)
                lineTo(16.914f, 6.879f)
                lineTo(17.268f, 7.232f)
                lineTo(17.621f, 7.586f)
                lineTo(18.328f, 6.879f)
                lineTo(17.975f, 6.525f)
                lineTo(17.268f, 5.818f)
                lineTo(16.914f, 5.464f)
                lineTo(16.561f, 5.818f)
                lineTo(14.025f, 8.353f)
                lineTo(14.025f, 8.353f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFCD9D25),
                        1f to Color(0xFFEBB93A)
                    ),
                    start = Offset(15.5f, 2f),
                    end = Offset(15.5f, 5f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(15.5f, 5f)
                curveTo(14.672f, 5f, 14f, 4.776f, 14f, 4.5f)
                curveTo(14f, 4.224f, 14.672f, 4f, 15.5f, 4f)
                curveTo(16.328f, 4f, 17f, 4.224f, 17f, 4.5f)
                curveTo(17f, 4.776f, 16.328f, 5f, 15.5f, 5f)
                close()
                moveTo(15.5f, 2.5f)
                curveTo(15.086f, 2.5f, 14.75f, 2.388f, 14.75f, 2.25f)
                curveTo(14.75f, 2.112f, 15.086f, 2f, 15.5f, 2f)
                curveTo(15.914f, 2f, 16.25f, 2.112f, 16.25f, 2.25f)
                curveTo(16.25f, 2.388f, 15.914f, 2.5f, 15.5f, 2.5f)
                close()
                moveTo(15.5f, 3.667f)
                curveTo(14.948f, 3.667f, 14.5f, 3.517f, 14.5f, 3.333f)
                curveTo(14.5f, 3.149f, 14.948f, 3f, 15.5f, 3f)
                curveTo(16.052f, 3f, 16.5f, 3.149f, 16.5f, 3.333f)
                curveTo(16.5f, 3.517f, 16.052f, 3.667f, 15.5f, 3.667f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFF5252C),
                        1f to Color(0xFFF6151C)
                    ),
                    start = Offset(15.5f, 10f),
                    end = Offset(15.5f, 12.5f)
                ),
                strokeLineWidth = 1f
            ) {
                moveTo(13.026f, 10.658f)
                curveTo(13.106f, 10.9f, 13.273f, 11.234f, 13.553f, 11.57f)
                curveTo(14.033f, 12.146f, 14.683f, 12.5f, 15.5f, 12.5f)
                curveTo(16.317f, 12.5f, 16.967f, 12.146f, 17.447f, 11.57f)
                curveTo(17.727f, 11.234f, 17.894f, 10.9f, 17.974f, 10.658f)
                curveTo(18.062f, 10.396f, 17.92f, 10.113f, 17.658f, 10.026f)
                curveTo(17.396f, 9.938f, 17.113f, 10.08f, 17.026f, 10.342f)
                curveTo(16.981f, 10.475f, 16.867f, 10.703f, 16.678f, 10.93f)
                curveTo(16.377f, 11.292f, 15.995f, 11.5f, 15.5f, 11.5f)
                curveTo(15.005f, 11.5f, 14.623f, 11.292f, 14.322f, 10.93f)
                curveTo(14.133f, 10.703f, 14.019f, 10.475f, 13.974f, 10.342f)
                curveTo(13.887f, 10.08f, 13.604f, 9.938f, 13.342f, 10.026f)
                curveTo(13.08f, 10.113f, 12.938f, 10.396f, 13.026f, 10.658f)
                close()
            }
        }.build()

        return _VA!!
    }

@Suppress("ObjectPropertyName")
private var _VA: ImageVector? = null
