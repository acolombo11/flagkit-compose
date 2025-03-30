package flagkit.flags

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import flagkit.FlagKit

val FlagKit.AL: ImageVector
    get() {
        if (_AL != null) {
            return _AL!!
        }
        _AL = ImageVector.Builder(
            name = "AL",
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
                        0f to Color(0xFFEE343C),
                        1f to Color(0xFFE2222A)
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
                        0f to Color(0xFF262626),
                        1f to Color(0xFF0D0D0D)
                    ),
                    start = Offset(10.5f, 3.179f),
                    end = Offset(10.5f, 12.223f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9.348f, 3.348f)
                lineTo(10.152f, 4.152f)
                curveTo(10.339f, 4.339f, 10.656f, 4.344f, 10.848f, 4.152f)
                lineTo(11.652f, 3.348f)
                curveTo(11.839f, 3.161f, 12.184f, 3.122f, 12.41f, 3.273f)
                lineTo(13.5f, 4f)
                lineTo(11.952f, 4.774f)
                curveTo(11.703f, 4.898f, 11.5f, 5.224f, 11.5f, 5.5f)
                curveTo(11.5f, 5.768f, 11.724f, 6f, 12f, 6f)
                curveTo(12.268f, 6f, 12.699f, 5.901f, 12.944f, 5.778f)
                lineTo(14.056f, 5.222f)
                curveTo(14.301f, 5.1f, 14.657f, 5.157f, 14.85f, 5.35f)
                lineTo(15.15f, 5.65f)
                curveTo(15.344f, 5.844f, 15.301f, 6.099f, 15.056f, 6.222f)
                lineTo(13.944f, 6.778f)
                curveTo(13.699f, 6.9f, 13.684f, 7.122f, 13.91f, 7.273f)
                lineTo(14.59f, 7.727f)
                curveTo(14.816f, 7.877f, 14.784f, 8.043f, 14.518f, 8.096f)
                lineTo(12.982f, 8.404f)
                curveTo(12.713f, 8.457f, 12.681f, 8.636f, 12.905f, 8.804f)
                lineTo(14.095f, 9.696f)
                curveTo(14.315f, 9.862f, 14.276f, 10f, 14f, 10f)
                curveTo(13.732f, 10f, 13.283f, 9.946f, 13.016f, 9.879f)
                lineTo(11.984f, 9.621f)
                curveTo(11.714f, 9.554f, 11.622f, 9.684f, 11.773f, 9.91f)
                lineTo(12.227f, 10.59f)
                curveTo(12.377f, 10.816f, 12.273f, 11f, 11.992f, 11f)
                lineTo(11.508f, 11f)
                curveTo(11.221f, 11f, 10.929f, 11.212f, 10.842f, 11.475f)
                lineTo(10.658f, 12.025f)
                curveTo(10.57f, 12.291f, 10.429f, 12.288f, 10.342f, 12.025f)
                lineTo(10.158f, 11.475f)
                curveTo(10.07f, 11.209f, 9.773f, 11f, 9.492f, 11f)
                lineTo(9.008f, 11f)
                curveTo(8.721f, 11f, 8.622f, 10.816f, 8.773f, 10.59f)
                lineTo(9.227f, 9.91f)
                curveTo(9.377f, 9.684f, 9.283f, 9.554f, 9.016f, 9.621f)
                lineTo(7.984f, 9.879f)
                curveTo(7.714f, 9.946f, 7.276f, 10f, 7f, 10f)
                curveTo(6.732f, 10f, 6.681f, 9.864f, 6.905f, 9.696f)
                lineTo(8.095f, 8.804f)
                curveTo(8.315f, 8.638f, 8.284f, 8.457f, 8.018f, 8.404f)
                lineTo(6.482f, 8.096f)
                curveTo(6.213f, 8.043f, 6.184f, 7.878f, 6.41f, 7.727f)
                lineTo(7.09f, 7.273f)
                curveTo(7.316f, 7.123f, 7.301f, 6.901f, 7.056f, 6.778f)
                lineTo(5.944f, 6.222f)
                curveTo(5.699f, 6.1f, 5.657f, 5.843f, 5.85f, 5.65f)
                lineTo(6.15f, 5.35f)
                curveTo(6.344f, 5.156f, 6.699f, 5.099f, 6.944f, 5.222f)
                lineTo(8.056f, 5.778f)
                curveTo(8.301f, 5.9f, 8.724f, 6f, 9f, 6f)
                curveTo(9.268f, 6f, 9.5f, 5.776f, 9.5f, 5.5f)
                curveTo(9.5f, 5.232f, 9.301f, 4.901f, 9.056f, 4.778f)
                lineTo(7.944f, 4.222f)
                curveTo(7.699f, 4.1f, 7.684f, 3.878f, 7.91f, 3.727f)
                lineTo(8.59f, 3.273f)
                curveTo(8.816f, 3.123f, 9.156f, 3.156f, 9.348f, 3.348f)
                close()
            }
        }.build()

        return _AL!!
    }

@Suppress("ObjectPropertyName")
private var _AL: ImageVector? = null
