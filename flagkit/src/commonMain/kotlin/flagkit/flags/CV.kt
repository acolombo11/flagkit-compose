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

val FlagKit.CV: ImageVector
    get() {
        if (_CV != null) {
            return _CV!!
        }
        _CV = ImageVector.Builder(
            name = "CV",
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
                        0f to Color(0xFF0C49AE),
                        1f to Color(0xFF063B91)
                    ),
                    start = Offset(10.5f, 0f),
                    end = Offset(10.5f, 8f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(21f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-21f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF0C49AE),
                        1f to Color(0xFF063B91)
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
                    start = Offset(10.5f, 8f),
                    end = Offset(10.5f, 11f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 8f)
                horizontalLineToRelative(21f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-21f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFCD232E),
                        1f to Color(0xFFCD232E)
                    ),
                    start = Offset(10.5f, 9f),
                    end = Offset(10.5f, 10f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 9f)
                horizontalLineToRelative(21f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-21f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7D035)),
                strokeLineWidth = 1f
            ) {
                moveTo(8f, 13f)
                curveTo(7.724f, 13f, 7.5f, 12.776f, 7.5f, 12.5f)
                curveTo(7.5f, 12.224f, 7.724f, 12f, 8f, 12f)
                curveTo(8.284f, 12f, 8.56f, 11.953f, 8.822f, 11.862f)
                curveTo(9.083f, 11.771f, 9.368f, 11.909f, 9.458f, 12.17f)
                curveTo(9.549f, 12.431f, 9.411f, 12.716f, 9.151f, 12.806f)
                curveTo(8.784f, 12.934f, 8.396f, 13f, 8f, 13f)
                close()
                moveTo(10.651f, 11.785f)
                curveTo(10.907f, 11.489f, 11.111f, 11.152f, 11.256f, 10.787f)
                curveTo(11.357f, 10.53f, 11.231f, 10.24f, 10.975f, 10.138f)
                curveTo(10.718f, 10.037f, 10.427f, 10.162f, 10.326f, 10.419f)
                curveTo(10.223f, 10.679f, 10.077f, 10.92f, 9.894f, 11.132f)
                curveTo(9.714f, 11.341f, 9.737f, 11.657f, 9.946f, 11.837f)
                curveTo(10.155f, 12.017f, 10.471f, 11.994f, 10.651f, 11.785f)
                close()
                moveTo(11.468f, 9.026f)
                curveTo(11.415f, 8.635f, 11.297f, 8.259f, 11.12f, 7.912f)
                curveTo(10.994f, 7.666f, 10.693f, 7.568f, 10.447f, 7.693f)
                curveTo(10.201f, 7.819f, 10.103f, 8.12f, 10.229f, 8.366f)
                curveTo(10.355f, 8.614f, 10.439f, 8.882f, 10.477f, 9.16f)
                curveTo(10.514f, 9.434f, 10.766f, 9.626f, 11.04f, 9.589f)
                curveTo(11.313f, 9.552f, 11.505f, 9.3f, 11.468f, 9.026f)
                close()
                moveTo(9.857f, 6.533f)
                curveTo(9.525f, 6.325f, 9.161f, 6.174f, 8.777f, 6.087f)
                curveTo(8.508f, 6.026f, 8.24f, 6.194f, 8.179f, 6.464f)
                curveTo(8.118f, 6.733f, 8.287f, 7.001f, 8.556f, 7.062f)
                curveTo(8.83f, 7.124f, 9.089f, 7.232f, 9.326f, 7.38f)
                curveTo(9.56f, 7.527f, 9.868f, 7.456f, 10.015f, 7.222f)
                curveTo(10.161f, 6.988f, 10.091f, 6.679f, 9.857f, 6.533f)
                close()
                moveTo(7.058f, 6.128f)
                curveTo(6.679f, 6.234f, 6.323f, 6.403f, 6.002f, 6.626f)
                curveTo(5.775f, 6.784f, 5.719f, 7.096f, 5.877f, 7.322f)
                curveTo(6.035f, 7.549f, 6.347f, 7.605f, 6.573f, 7.447f)
                curveTo(6.802f, 7.287f, 7.057f, 7.167f, 7.326f, 7.092f)
                curveTo(7.592f, 7.017f, 7.748f, 6.742f, 7.674f, 6.476f)
                curveTo(7.599f, 6.21f, 7.324f, 6.054f, 7.058f, 6.128f)
                close()
                moveTo(4.85f, 7.973f)
                curveTo(4.679f, 8.324f, 4.569f, 8.702f, 4.523f, 9.094f)
                curveTo(4.492f, 9.369f, 4.688f, 9.617f, 4.963f, 9.648f)
                curveTo(5.237f, 9.68f, 5.485f, 9.483f, 5.517f, 9.209f)
                curveTo(5.549f, 8.929f, 5.628f, 8.66f, 5.749f, 8.41f)
                curveTo(5.87f, 8.161f, 5.766f, 7.862f, 5.518f, 7.742f)
                curveTo(5.27f, 7.621f, 4.97f, 7.725f, 4.85f, 7.973f)
                close()
                moveTo(4.79f, 10.898f)
                curveTo(4.947f, 11.257f, 5.163f, 11.587f, 5.428f, 11.874f)
                curveTo(5.616f, 12.077f, 5.932f, 12.09f, 6.135f, 11.902f)
                curveTo(6.338f, 11.715f, 6.35f, 11.398f, 6.163f, 11.196f)
                curveTo(5.973f, 10.99f, 5.819f, 10.754f, 5.707f, 10.498f)
                curveTo(5.597f, 10.245f, 5.302f, 10.129f, 5.049f, 10.239f)
                curveTo(4.796f, 10.35f, 4.68f, 10.644f, 4.79f, 10.898f)
                close()
                moveTo(6.936f, 12.835f)
                curveTo(6.673f, 12.751f, 6.527f, 12.47f, 6.611f, 12.207f)
                curveTo(6.695f, 11.944f, 6.976f, 11.799f, 7.24f, 11.882f)
                curveTo(7.469f, 11.955f, 7.709f, 11.995f, 7.954f, 12f)
                curveTo(8.23f, 12.005f, 8.45f, 12.232f, 8.445f, 12.508f)
                curveTo(8.44f, 12.785f, 8.212f, 13.004f, 7.936f, 12.999f)
                curveTo(7.593f, 12.993f, 7.257f, 12.938f, 6.936f, 12.835f)
                close()
            }
        }.build()

        return _CV!!
    }

@Suppress("ObjectPropertyName")
private var _CV: ImageVector? = null
