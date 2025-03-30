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

val FlagKit.BZ: ImageVector
    get() {
        if (_BZ != null) {
            return _BZ!!
        }
        _BZ = ImageVector.Builder(
            name = "BZ",
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
                        0f to Color(0xFF094995),
                        1f to Color(0xFF074185)
                    ),
                    start = Offset(10.5f, 2f),
                    end = Offset(10.5f, 13f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 2f)
                horizontalLineToRelative(21f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(-21f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFD5182F),
                        1f to Color(0xFFCC162C)
                    ),
                    start = Offset(10.5f, 0f),
                    end = Offset(10.5f, 2f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(21f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-21f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFD5182F),
                        1f to Color(0xFFCC162C)
                    ),
                    start = Offset(10.5f, 13f),
                    end = Offset(10.5f, 15f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 13f)
                horizontalLineToRelative(21f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-21f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFFFFF),
                        1f to Color(0xFFF0F0F0)
                    ),
                    start = Offset(10.5f, 3f),
                    end = Offset(10.5f, 12f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.5f, 7.5f)
                moveToRelative(-4.5f, 0f)
                arcToRelative(4.5f, 4.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 9f, 0f)
                arcToRelative(4.5f, 4.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -9f, 0f)
            }
            path(
                fill = SolidColor(Color(0xFF118014)),
                strokeLineWidth = 1f
            ) {
                moveTo(10.5f, 11f)
                curveTo(10.224f, 11f, 10f, 10.776f, 10f, 10.5f)
                curveTo(10f, 10.224f, 10.224f, 10f, 10.5f, 10f)
                curveTo(10.784f, 10f, 11.06f, 9.953f, 11.322f, 9.862f)
                curveTo(11.583f, 9.771f, 11.868f, 9.909f, 11.958f, 10.17f)
                curveTo(12.049f, 10.431f, 11.911f, 10.716f, 11.651f, 10.806f)
                curveTo(11.284f, 10.934f, 10.896f, 11f, 10.5f, 11f)
                close()
                moveTo(13.151f, 9.785f)
                curveTo(13.407f, 9.489f, 13.611f, 9.152f, 13.756f, 8.787f)
                curveTo(13.857f, 8.53f, 13.731f, 8.24f, 13.475f, 8.138f)
                curveTo(13.218f, 8.037f, 12.927f, 8.162f, 12.826f, 8.419f)
                curveTo(12.723f, 8.679f, 12.577f, 8.92f, 12.394f, 9.132f)
                curveTo(12.214f, 9.341f, 12.237f, 9.657f, 12.446f, 9.837f)
                curveTo(12.655f, 10.017f, 12.971f, 9.994f, 13.151f, 9.785f)
                close()
                moveTo(13.968f, 7.026f)
                curveTo(13.915f, 6.635f, 13.797f, 6.259f, 13.62f, 5.912f)
                curveTo(13.494f, 5.666f, 13.193f, 5.568f, 12.947f, 5.693f)
                curveTo(12.701f, 5.819f, 12.603f, 6.12f, 12.729f, 6.366f)
                curveTo(12.855f, 6.614f, 12.939f, 6.882f, 12.977f, 7.16f)
                curveTo(13.014f, 7.434f, 13.266f, 7.626f, 13.54f, 7.589f)
                curveTo(13.813f, 7.552f, 14.005f, 7.3f, 13.968f, 7.026f)
                close()
                moveTo(12.357f, 4.533f)
                curveTo(12.025f, 4.325f, 11.661f, 4.174f, 11.277f, 4.087f)
                curveTo(11.008f, 4.026f, 10.74f, 4.194f, 10.679f, 4.464f)
                curveTo(10.618f, 4.733f, 10.787f, 5.001f, 11.056f, 5.062f)
                curveTo(11.33f, 5.124f, 11.589f, 5.232f, 11.826f, 5.38f)
                curveTo(12.06f, 5.527f, 12.368f, 5.456f, 12.515f, 5.222f)
                curveTo(12.661f, 4.988f, 12.591f, 4.679f, 12.357f, 4.533f)
                close()
                moveTo(9.558f, 4.128f)
                curveTo(9.179f, 4.234f, 8.823f, 4.403f, 8.502f, 4.626f)
                curveTo(8.275f, 4.784f, 8.219f, 5.096f, 8.377f, 5.322f)
                curveTo(8.535f, 5.549f, 8.847f, 5.605f, 9.073f, 5.447f)
                curveTo(9.302f, 5.287f, 9.557f, 5.167f, 9.826f, 5.092f)
                curveTo(10.092f, 5.017f, 10.248f, 4.742f, 10.174f, 4.476f)
                curveTo(10.099f, 4.21f, 9.824f, 4.054f, 9.558f, 4.128f)
                close()
                moveTo(7.35f, 5.973f)
                curveTo(7.179f, 6.324f, 7.069f, 6.702f, 7.023f, 7.094f)
                curveTo(6.992f, 7.369f, 7.188f, 7.617f, 7.463f, 7.648f)
                curveTo(7.737f, 7.68f, 7.985f, 7.483f, 8.017f, 7.209f)
                curveTo(8.049f, 6.929f, 8.128f, 6.66f, 8.249f, 6.41f)
                curveTo(8.37f, 6.161f, 8.266f, 5.862f, 8.018f, 5.742f)
                curveTo(7.77f, 5.621f, 7.47f, 5.725f, 7.35f, 5.973f)
                close()
                moveTo(7.29f, 8.898f)
                curveTo(7.447f, 9.257f, 7.663f, 9.587f, 7.928f, 9.874f)
                curveTo(8.116f, 10.077f, 8.432f, 10.09f, 8.635f, 9.902f)
                curveTo(8.838f, 9.715f, 8.85f, 9.398f, 8.663f, 9.196f)
                curveTo(8.473f, 8.99f, 8.319f, 8.754f, 8.207f, 8.498f)
                curveTo(8.097f, 8.245f, 7.802f, 8.129f, 7.549f, 8.239f)
                curveTo(7.296f, 8.35f, 7.18f, 8.644f, 7.29f, 8.898f)
                close()
                moveTo(9.436f, 10.835f)
                curveTo(9.173f, 10.751f, 9.027f, 10.47f, 9.111f, 10.207f)
                curveTo(9.195f, 9.944f, 9.476f, 9.799f, 9.74f, 9.882f)
                curveTo(9.969f, 9.955f, 10.209f, 9.995f, 10.454f, 10f)
                curveTo(10.73f, 10.005f, 10.95f, 10.232f, 10.945f, 10.508f)
                curveTo(10.94f, 10.785f, 10.712f, 11.004f, 10.436f, 10.999f)
                curveTo(10.093f, 10.993f, 9.757f, 10.938f, 9.436f, 10.835f)
                close()
            }
        }.build()

        return _BZ!!
    }

@Suppress("ObjectPropertyName")
private var _BZ: ImageVector? = null
