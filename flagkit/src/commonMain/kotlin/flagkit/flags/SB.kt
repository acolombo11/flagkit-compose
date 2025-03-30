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

val FlagKit.SB: ImageVector
    get() {
        if (_SB != null) {
            return _SB!!
        }
        _SB = ImageVector.Builder(
            name = "SB",
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
                        0f to Color(0xFFFFFFFF),
                        1f to Color(0xFFF0F0F0)
                    ),
                    start = Offset(7.42f, 3.56f),
                    end = Offset(7.42f, 6.56f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5.92f, 5.812f)
                curveTo(5.92f, 5.673f, 5.998f, 5.482f, 6.101f, 5.379f)
                lineTo(6.239f, 5.241f)
                curveTo(6.339f, 5.141f, 6.342f, 4.982f, 6.239f, 4.879f)
                lineTo(6.101f, 4.741f)
                curveTo(6.001f, 4.641f, 5.92f, 4.453f, 5.92f, 4.308f)
                lineTo(5.92f, 3.812f)
                curveTo(5.92f, 3.673f, 6.027f, 3.56f, 6.172f, 3.56f)
                lineTo(6.668f, 3.56f)
                curveTo(6.807f, 3.56f, 6.92f, 3.667f, 6.92f, 3.812f)
                lineTo(6.92f, 4.308f)
                curveTo(6.92f, 4.447f, 6.966f, 4.468f, 7.036f, 4.328f)
                lineTo(7.304f, 3.792f)
                curveTo(7.368f, 3.664f, 7.538f, 3.56f, 7.668f, 3.56f)
                lineTo(8.672f, 3.56f)
                curveTo(8.809f, 3.56f, 8.92f, 3.676f, 8.92f, 3.81f)
                lineTo(8.92f, 3.81f)
                curveTo(8.92f, 3.948f, 8.813f, 4.06f, 8.668f, 4.06f)
                lineTo(8.172f, 4.06f)
                curveTo(8.033f, 4.06f, 7.92f, 4.176f, 7.92f, 4.31f)
                lineTo(7.92f, 4.31f)
                curveTo(7.92f, 4.448f, 8.027f, 4.56f, 8.172f, 4.56f)
                lineTo(8.668f, 4.56f)
                curveTo(8.807f, 4.56f, 8.92f, 4.668f, 8.92f, 4.805f)
                lineTo(8.92f, 6.315f)
                curveTo(8.92f, 6.45f, 8.813f, 6.56f, 8.668f, 6.56f)
                lineTo(8.172f, 6.56f)
                curveTo(8.033f, 6.56f, 7.92f, 6.453f, 7.92f, 6.308f)
                lineTo(7.92f, 5.812f)
                curveTo(7.92f, 5.673f, 8.036f, 5.56f, 8.17f, 5.56f)
                lineTo(8.17f, 5.56f)
                curveTo(8.308f, 5.56f, 8.42f, 5.444f, 8.42f, 5.31f)
                lineTo(8.42f, 5.31f)
                curveTo(8.42f, 5.172f, 8.313f, 5.06f, 8.168f, 5.06f)
                lineTo(7.672f, 5.06f)
                curveTo(7.533f, 5.06f, 7.42f, 5.178f, 7.42f, 5.308f)
                lineTo(7.42f, 6.312f)
                curveTo(7.42f, 6.449f, 7.304f, 6.56f, 7.17f, 6.56f)
                lineTo(7.17f, 6.56f)
                curveTo(7.032f, 6.56f, 6.92f, 6.453f, 6.92f, 6.308f)
                lineTo(6.92f, 5.812f)
                curveTo(6.92f, 5.673f, 6.804f, 5.56f, 6.67f, 5.56f)
                lineTo(6.67f, 5.56f)
                curveTo(6.532f, 5.56f, 6.42f, 5.667f, 6.42f, 5.812f)
                lineTo(6.42f, 6.308f)
                curveTo(6.42f, 6.447f, 6.304f, 6.56f, 6.17f, 6.56f)
                lineTo(6.17f, 6.56f)
                curveTo(6.032f, 6.56f, 5.92f, 6.453f, 5.92f, 6.308f)
                lineTo(5.92f, 5.812f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF1DBE4F),
                        1f to Color(0xFF159B3F)
                    ),
                    start = Offset(10.5f, -0.003f),
                    end = Offset(10.5f, 14.997f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, -0.003f)
                horizontalLineToRelative(21f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(-21f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF0660D4),
                        1f to Color(0xFF0051BB)
                    ),
                    start = Offset(10.5f, -0.003f),
                    end = Offset(10.5f, 14.997f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, -0.003f)
                lineToRelative(21f, 0f)
                lineToRelative(-21f, 15f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF2C7442),
                        1f to Color(0xFF225B34)
                    ),
                    start = Offset(10.5f, -0.003f),
                    end = Offset(10.5f, 14.997f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(21f, -0.003f)
                lineToRelative(-21f, 15f)
                lineToRelative(21f, 0f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFD646),
                        1f to Color(0xFFFED02F)
                    ),
                    start = Offset(10.5f, 6.497f),
                    end = Offset(10.5f, 8.497f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(-4f, 6.497f)
                horizontalLineToRelative(29f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-29f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(2.25f, 2.872f)
                lineTo(1.516f, 3.259f)
                lineTo(1.656f, 2.44f)
                lineTo(1.061f, 1.861f)
                lineTo(1.883f, 1.742f)
                lineTo(2.25f, 0.997f)
                lineTo(2.618f, 1.742f)
                lineTo(3.439f, 1.861f)
                lineTo(2.845f, 2.44f)
                lineTo(2.985f, 3.259f)
                lineTo(2.25f, 2.872f)
                close()
                moveTo(7.25f, 2.872f)
                lineTo(6.516f, 3.259f)
                lineTo(6.656f, 2.44f)
                lineTo(6.061f, 1.861f)
                lineTo(6.883f, 1.742f)
                lineTo(7.25f, 0.997f)
                lineTo(7.618f, 1.742f)
                lineTo(8.439f, 1.861f)
                lineTo(7.845f, 2.44f)
                lineTo(7.985f, 3.259f)
                lineTo(7.25f, 2.872f)
                close()
                moveTo(7.25f, 5.872f)
                lineTo(6.516f, 6.259f)
                lineTo(6.656f, 5.44f)
                lineTo(6.061f, 4.861f)
                lineTo(6.883f, 4.742f)
                lineTo(7.25f, 3.997f)
                lineTo(7.618f, 4.742f)
                lineTo(8.439f, 4.861f)
                lineTo(7.845f, 5.44f)
                lineTo(7.985f, 6.259f)
                lineTo(7.25f, 5.872f)
                close()
                moveTo(2.25f, 5.872f)
                lineTo(1.516f, 6.259f)
                lineTo(1.656f, 5.44f)
                lineTo(1.061f, 4.861f)
                lineTo(1.883f, 4.742f)
                lineTo(2.25f, 3.997f)
                lineTo(2.618f, 4.742f)
                lineTo(3.439f, 4.861f)
                lineTo(2.845f, 5.44f)
                lineTo(2.985f, 6.259f)
                lineTo(2.25f, 5.872f)
                close()
                moveTo(4.75f, 4.372f)
                lineTo(4.016f, 4.759f)
                lineTo(4.156f, 3.94f)
                lineTo(3.561f, 3.361f)
                lineTo(4.383f, 3.242f)
                lineTo(4.75f, 2.497f)
                lineTo(5.118f, 3.242f)
                lineTo(5.939f, 3.361f)
                lineTo(5.345f, 3.94f)
                lineTo(5.485f, 4.759f)
                lineTo(4.75f, 4.372f)
                close()
            }
        }.build()

        return _SB!!
    }

@Suppress("ObjectPropertyName")
private var _SB: ImageVector? = null
