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

val FlagKit.GB: ImageVector
    get() {
        if (_GB != null) {
            return _GB!!
        }
        _GB = ImageVector.Builder(
            name = "GB",
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
                        0f to Color(0xFF0A17A7),
                        1f to Color(0xFF030E88)
                    ),
                    start = Offset(10.498f, 0f),
                    end = Offset(10.498f, 15f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(-0.002f, 0f)
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
                    start = Offset(10.498f, -1.437f),
                    end = Offset(10.498f, 16.437f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5.003f, 10f)
                lineTo(-0.002f, 10f)
                lineTo(-0.002f, 5f)
                lineTo(5.003f, 5f)
                lineTo(-2.082f, 0.221f)
                lineTo(-0.964f, -1.437f)
                lineTo(7.998f, 4.608f)
                lineTo(7.998f, -1f)
                lineTo(12.998f, -1f)
                lineTo(12.998f, 4.608f)
                lineTo(21.96f, -1.437f)
                lineTo(23.078f, 0.221f)
                lineTo(15.993f, 5f)
                lineTo(20.998f, 5f)
                lineTo(20.998f, 10f)
                lineTo(15.993f, 10f)
                lineTo(23.078f, 14.779f)
                lineTo(21.96f, 16.437f)
                lineTo(12.998f, 10.392f)
                lineTo(12.998f, 16f)
                lineTo(7.998f, 16f)
                lineTo(7.998f, 10.392f)
                lineTo(-0.964f, 16.437f)
                lineTo(-2.082f, 14.779f)
                lineTo(5.003f, 10f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFDB1F35)),
                strokeLineWidth = 1f
            ) {
                moveTo(14.136f, 4.958f)
                lineTo(23.636f, -1.291f)
                curveTo(23.751f, -1.367f, 23.783f, -1.522f, 23.707f, -1.637f)
                curveTo(23.631f, -1.753f, 23.476f, -1.785f, 23.361f, -1.709f)
                lineTo(13.862f, 4.54f)
                curveTo(13.746f, 4.616f, 13.714f, 4.771f, 13.79f, 4.887f)
                curveTo(13.866f, 5.002f, 14.021f, 5.034f, 14.136f, 4.958f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFDB1F35)),
                strokeLineWidth = 1f
            ) {
                moveTo(14.868f, 10.48f)
                lineTo(23.383f, 16.22f)
                curveTo(23.498f, 16.297f, 23.653f, 16.267f, 23.73f, 16.152f)
                curveTo(23.808f, 16.038f, 23.777f, 15.883f, 23.663f, 15.805f)
                lineTo(15.147f, 10.066f)
                curveTo(15.033f, 9.989f, 14.878f, 10.019f, 14.8f, 10.133f)
                curveTo(14.723f, 10.248f, 14.753f, 10.403f, 14.868f, 10.48f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFDB1F35)),
                strokeLineWidth = 1f
            ) {
                moveTo(6.142f, 4.526f)
                lineTo(-2.74f, -1.461f)
                curveTo(-2.855f, -1.538f, -3.01f, -1.507f, -3.087f, -1.393f)
                curveTo(-3.164f, -1.278f, -3.134f, -1.123f, -3.02f, -1.046f)
                lineTo(5.863f, 4.94f)
                curveTo(5.977f, 5.017f, 6.132f, 4.987f, 6.21f, 4.873f)
                curveTo(6.287f, 4.758f, 6.256f, 4.603f, 6.142f, 4.526f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFDB1F35)),
                strokeLineWidth = 1f
            ) {
                moveTo(6.827f, 9.995f)
                lineTo(-3.018f, 16.524f)
                curveTo(-3.133f, 16.601f, -3.165f, 16.756f, -3.088f, 16.871f)
                curveTo(-3.012f, 16.986f, -2.857f, 17.018f, -2.742f, 16.941f)
                lineTo(7.104f, 10.412f)
                curveTo(7.219f, 10.336f, 7.25f, 10.181f, 7.174f, 10.066f)
                curveTo(7.098f, 9.95f, 6.943f, 9.919f, 6.827f, 9.995f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFE6273E),
                        1f to Color(0xFFCF152B)
                    ),
                    start = Offset(10.498f, 0f),
                    end = Offset(10.498f, 15f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(-0.002f, 9f)
                lineToRelative(9f, 0f)
                lineToRelative(0f, 6f)
                lineToRelative(3f, 0f)
                lineToRelative(0f, -6f)
                lineToRelative(9f, 0f)
                lineToRelative(0f, -3f)
                lineToRelative(-9f, 0f)
                lineToRelative(0f, -6f)
                lineToRelative(-3f, 0f)
                lineToRelative(0f, 6f)
                lineToRelative(-9f, 0f)
                close()
            }
        }.build()

        return _GB!!
    }

@Suppress("ObjectPropertyName")
private var _GB: ImageVector? = null
