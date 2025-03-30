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

val FlagKit.CY: ImageVector
    get() {
        if (_CY != null) {
            return _CY!!
        }
        _CY = ImageVector.Builder(
            name = "CY",
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
                        0f to Color(0xFFE7832C),
                        1f to Color(0xFFD7751F)
                    ),
                    start = Offset(10.651f, 2.168f),
                    end = Offset(10.651f, 8.829f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(15.547f, 2.227f)
                curveTo(15.797f, 2.101f, 15.877f, 2.184f, 15.727f, 2.41f)
                lineTo(15.273f, 3.09f)
                curveTo(15.122f, 3.316f, 14.816f, 3.623f, 14.59f, 3.773f)
                lineTo(13.91f, 4.227f)
                curveTo(13.684f, 4.378f, 13.342f, 4.658f, 13.147f, 4.853f)
                lineTo(13.353f, 4.647f)
                curveTo(13.158f, 4.842f, 13.156f, 5.156f, 13.35f, 5.35f)
                lineTo(13.65f, 5.65f)
                curveTo(13.843f, 5.843f, 13.844f, 6.156f, 13.65f, 6.35f)
                lineTo(13.35f, 6.65f)
                curveTo(13.157f, 6.843f, 12.807f, 6.904f, 12.547f, 6.773f)
                lineTo(12.453f, 6.727f)
                curveTo(12.203f, 6.601f, 11.904f, 6.693f, 11.773f, 6.953f)
                lineTo(11.727f, 7.047f)
                curveTo(11.601f, 7.297f, 11.291f, 7.57f, 11.025f, 7.658f)
                lineTo(10.475f, 7.842f)
                curveTo(10.212f, 7.929f, 9.768f, 8f, 9.5f, 8f)
                lineTo(9.5f, 8f)
                curveTo(9.224f, 8f, 8.904f, 8.193f, 8.773f, 8.453f)
                lineTo(8.727f, 8.547f)
                curveTo(8.601f, 8.797f, 8.301f, 8.9f, 8.056f, 8.778f)
                lineTo(6.944f, 8.222f)
                curveTo(6.699f, 8.099f, 6.344f, 7.844f, 6.15f, 7.65f)
                lineTo(5.85f, 7.35f)
                curveTo(5.657f, 7.157f, 5.5f, 6.768f, 5.5f, 6.5f)
                lineTo(5.5f, 6.5f)
                curveTo(5.5f, 6.224f, 5.727f, 6f, 6f, 6f)
                lineTo(5.5f, 6f)
                curveTo(5.776f, 6f, 6.156f, 5.844f, 6.35f, 5.65f)
                lineTo(6.65f, 5.35f)
                curveTo(6.843f, 5.157f, 7.232f, 5f, 7.5f, 5f)
                lineTo(7.5f, 5f)
                curveTo(7.776f, 5f, 8.07f, 4.791f, 8.158f, 4.525f)
                lineTo(8.342f, 3.975f)
                curveTo(8.429f, 3.712f, 8.713f, 3.543f, 8.982f, 3.596f)
                lineTo(10.518f, 3.904f)
                curveTo(10.784f, 3.957f, 11.214f, 3.946f, 11.484f, 3.879f)
                lineTo(12.516f, 3.621f)
                curveTo(12.783f, 3.554f, 13.193f, 3.404f, 13.453f, 3.273f)
                lineTo(13.547f, 3.227f)
                curveTo(13.797f, 3.101f, 14.193f, 2.904f, 14.453f, 2.773f)
                lineTo(14.547f, 2.727f)
                curveTo(14.797f, 2.601f, 15.193f, 2.404f, 15.453f, 2.273f)
                lineTo(15.547f, 2.227f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF445128)),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.5f, 11.5f)
                moveToRelative(-1f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 0f)
            }
            path(
                fill = SolidColor(Color(0xFF445128)),
                fillAlpha = 0.75f,
                strokeAlpha = 0.75f,
                strokeLineWidth = 1f
            ) {
                moveTo(12.158f, 11.474f)
                curveTo(11.896f, 11.562f, 11.613f, 11.42f, 11.526f, 11.158f)
                curveTo(11.438f, 10.896f, 11.58f, 10.613f, 11.842f, 10.526f)
                curveTo(11.895f, 10.508f, 11.998f, 10.469f, 12.134f, 10.408f)
                curveTo(12.363f, 10.306f, 12.592f, 10.184f, 12.803f, 10.044f)
                curveTo(13.156f, 9.808f, 13.417f, 9.547f, 13.553f, 9.276f)
                curveTo(13.676f, 9.029f, 13.977f, 8.929f, 14.224f, 9.053f)
                curveTo(14.471f, 9.176f, 14.571f, 9.477f, 14.447f, 9.724f)
                curveTo(14.223f, 10.173f, 13.844f, 10.552f, 13.357f, 10.876f)
                curveTo(13.095f, 11.051f, 12.818f, 11.199f, 12.541f, 11.322f)
                curveTo(12.373f, 11.396f, 12.24f, 11.447f, 12.158f, 11.474f)
                close()
                moveTo(9.158f, 10.526f)
                curveTo(9.42f, 10.613f, 9.562f, 10.896f, 9.474f, 11.158f)
                curveTo(9.387f, 11.42f, 9.104f, 11.562f, 8.842f, 11.474f)
                curveTo(8.76f, 11.447f, 8.627f, 11.396f, 8.459f, 11.322f)
                curveTo(8.182f, 11.199f, 7.905f, 11.051f, 7.643f, 10.876f)
                curveTo(7.156f, 10.552f, 6.777f, 10.173f, 6.553f, 9.724f)
                curveTo(6.429f, 9.477f, 6.529f, 9.176f, 6.776f, 9.053f)
                curveTo(7.023f, 8.929f, 7.324f, 9.029f, 7.447f, 9.276f)
                curveTo(7.583f, 9.547f, 7.844f, 9.808f, 8.197f, 10.044f)
                curveTo(8.408f, 10.184f, 8.637f, 10.306f, 8.866f, 10.408f)
                curveTo(9.002f, 10.469f, 9.105f, 10.508f, 9.158f, 10.526f)
                close()
            }
        }.build()

        return _CY!!
    }

@Suppress("ObjectPropertyName")
private var _CY: ImageVector? = null
