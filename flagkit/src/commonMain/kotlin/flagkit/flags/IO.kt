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

val FlagKit.IO: ImageVector
    get() {
        if (_IO != null) {
            return _IO!!
        }
        _IO = ImageVector.Builder(
            name = "IO",
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
                        0f to Color(0xFF07319C),
                        1f to Color(0xFF00247E)
                    ),
                    start = Offset(10.504f, -0.002f),
                    end = Offset(10.504f, 14.998f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0.004f, -0.002f)
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
                    start = Offset(4.074f, -0.902f),
                    end = Offset(4.074f, 7.902f)
                ),
                strokeLineWidth = 1f
            ) {
                moveTo(3f, 3.23f)
                lineTo(-1.352f, -0.5f)
                lineTo(0.66f, -0.5f)
                lineTo(4.16f, 2f)
                lineTo(4.857f, 2f)
                lineTo(9.5f, -0.902f)
                lineTo(9.5f, 0.25f)
                curveTo(9.5f, 0.553f, 9.333f, 0.877f, 9.082f, 1.056f)
                lineTo(6f, 3.257f)
                lineTo(6f, 3.77f)
                lineTo(9.137f, 6.459f)
                curveTo(9.599f, 6.855f, 9.341f, 7.5f, 8.75f, 7.5f)
                curveTo(8.505f, 7.5f, 8.205f, 7.404f, 8.001f, 7.258f)
                lineTo(4.84f, 5f)
                lineTo(4.143f, 5f)
                lineTo(-0.5f, 7.902f)
                lineTo(-0.5f, 6.243f)
                lineTo(3f, 3.743f)
                lineTo(3f, 3.23f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFDB1E36),
                        1f to Color(0xFFD51931)
                    ),
                    start = Offset(4.5f, 0f),
                    end = Offset(4.5f, 7f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3.5f, 3f)
                lineTo(0f, 0f)
                lineTo(0.5f, 0f)
                lineTo(4f, 2.5f)
                lineTo(5f, 2.5f)
                lineTo(9f, 0f)
                lineTo(9f, 0.25f)
                curveTo(9f, 0.388f, 8.913f, 0.562f, 8.792f, 0.649f)
                lineTo(5.5f, 3f)
                lineTo(5.5f, 4f)
                lineTo(8.812f, 6.839f)
                curveTo(8.916f, 6.928f, 8.884f, 7f, 8.75f, 7f)
                lineTo(8.75f, 7f)
                curveTo(8.612f, 7f, 8.413f, 6.938f, 8.292f, 6.851f)
                lineTo(5f, 4.5f)
                lineTo(4f, 4.5f)
                lineTo(0f, 7f)
                lineTo(0f, 6.5f)
                lineTo(3.5f, 4f)
                lineTo(3.5f, 3f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFFFFF),
                        1f to Color(0xFFF0F0F0)
                    ),
                    start = Offset(4.75f, 0f),
                    end = Offset(4.75f, 7.5f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 2.5f)
                lineTo(0f, 4.5f)
                lineTo(3.5f, 4.5f)
                lineTo(3.5f, 7.005f)
                curveTo(3.5f, 7.278f, 3.714f, 7.5f, 4.005f, 7.5f)
                lineTo(4.995f, 7.5f)
                curveTo(5.274f, 7.5f, 5.5f, 7.284f, 5.5f, 7.005f)
                lineTo(5.5f, 4.5f)
                lineTo(9.01f, 4.5f)
                curveTo(9.28f, 4.5f, 9.5f, 4.286f, 9.5f, 3.995f)
                lineTo(9.5f, 3.005f)
                curveTo(9.5f, 2.726f, 9.285f, 2.5f, 9.01f, 2.5f)
                lineTo(5.5f, 2.5f)
                lineTo(5.5f, 0f)
                lineTo(3.5f, 0f)
                lineTo(3.5f, 2.5f)
                lineTo(0f, 2.5f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFDB1E36),
                        1f to Color(0xFFD51931)
                    ),
                    start = Offset(4.5f, 0f),
                    end = Offset(4.5f, 7f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 3f)
                lineToRelative(4f, 0f)
                lineToRelative(0f, -0.5f)
                lineToRelative(0f, -2.5f)
                lineToRelative(1f, 0f)
                lineToRelative(0f, 2.5f)
                lineToRelative(0f, 0.5f)
                lineToRelative(4f, 0f)
                lineToRelative(0f, 1f)
                lineToRelative(-4f, 0f)
                lineToRelative(0f, 0.5f)
                lineToRelative(0f, 2.5f)
                lineToRelative(-1f, 0f)
                lineToRelative(0f, -2.5f)
                lineToRelative(0f, -0.5f)
                lineToRelative(-4f, 0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
                strokeLineWidth = 1f
            ) {
                moveTo(0.423f, 6.998f)
                lineTo(-0.686f, 7.367f)
                lineTo(-1.16f, 7.525f)
                lineTo(-0.844f, 8.474f)
                lineTo(-0.369f, 8.316f)
                lineTo(1.693f, 7.628f)
                curveTo(1.846f, 7.577f, 2.16f, 7.577f, 2.314f, 7.628f)
                lineTo(4.377f, 8.316f)
                curveTo(4.734f, 8.435f, 5.271f, 8.436f, 5.631f, 8.316f)
                lineTo(7.693f, 7.628f)
                curveTo(7.846f, 7.577f, 8.16f, 7.577f, 8.314f, 7.628f)
                lineTo(10.377f, 8.316f)
                curveTo(10.734f, 8.435f, 11.271f, 8.436f, 11.631f, 8.316f)
                lineTo(13.693f, 7.628f)
                curveTo(13.846f, 7.577f, 14.16f, 7.577f, 14.314f, 7.628f)
                lineTo(16.377f, 8.316f)
                curveTo(16.734f, 8.435f, 17.271f, 8.436f, 17.631f, 8.316f)
                lineTo(19.693f, 7.628f)
                curveTo(19.846f, 7.577f, 20.16f, 7.577f, 20.314f, 7.628f)
                lineTo(22.377f, 8.316f)
                curveTo(22.738f, 8.436f, 22.738f, 8.436f, 22.846f, 8.472f)
                lineTo(23.32f, 8.63f)
                lineTo(23.636f, 7.682f)
                lineTo(23.162f, 7.523f)
                lineTo(22.693f, 7.367f)
                lineTo(20.631f, 6.68f)
                curveTo(20.271f, 6.56f, 19.734f, 6.561f, 19.377f, 6.68f)
                lineTo(17.314f, 7.367f)
                curveTo(17.16f, 7.418f, 16.846f, 7.418f, 16.693f, 7.367f)
                lineTo(14.631f, 6.68f)
                curveTo(14.271f, 6.56f, 13.734f, 6.561f, 13.377f, 6.68f)
                lineTo(11.314f, 7.367f)
                curveTo(11.16f, 7.418f, 10.846f, 7.418f, 10.693f, 7.367f)
                lineTo(9.004f, 6.804f)
                lineTo(9.004f, 6.998f)
                lineTo(6.423f, 6.998f)
                lineTo(5.314f, 7.367f)
                curveTo(5.16f, 7.418f, 4.846f, 7.418f, 4.693f, 7.367f)
                lineTo(3.585f, 6.998f)
                lineTo(0.423f, 6.998f)
                close()
                moveTo(9.004f, 5.358f)
                lineTo(10.377f, 5.816f)
                curveTo(10.734f, 5.935f, 11.271f, 5.936f, 11.631f, 5.816f)
                lineTo(13.693f, 5.128f)
                curveTo(13.846f, 5.077f, 14.16f, 5.077f, 14.314f, 5.128f)
                lineTo(16.377f, 5.816f)
                curveTo(16.734f, 5.935f, 17.271f, 5.936f, 17.631f, 5.816f)
                lineTo(19.693f, 5.128f)
                curveTo(19.846f, 5.077f, 20.16f, 5.077f, 20.314f, 5.128f)
                lineTo(22.377f, 5.816f)
                lineTo(22.846f, 5.972f)
                lineTo(23.32f, 6.13f)
                lineTo(23.636f, 5.182f)
                lineTo(23.162f, 5.023f)
                lineTo(22.693f, 4.867f)
                lineTo(20.631f, 4.18f)
                curveTo(20.271f, 4.06f, 19.734f, 4.061f, 19.377f, 4.18f)
                lineTo(17.314f, 4.867f)
                curveTo(17.16f, 4.918f, 16.846f, 4.918f, 16.693f, 4.867f)
                lineTo(14.631f, 4.18f)
                curveTo(14.271f, 4.06f, 13.734f, 4.061f, 13.377f, 4.18f)
                lineTo(11.314f, 4.867f)
                curveTo(11.16f, 4.918f, 10.846f, 4.918f, 10.693f, 4.867f)
                lineTo(9.004f, 4.304f)
                lineTo(9.004f, 5.358f)
                close()
                moveTo(0.004f, 5.691f)
                lineTo(-0.369f, 5.816f)
                lineTo(-0.844f, 5.974f)
                lineTo(-1.16f, 5.025f)
                lineTo(-0.686f, 4.867f)
                lineTo(0.004f, 4.637f)
                lineTo(0.004f, 5.691f)
                close()
                moveTo(9.004f, 2.858f)
                lineTo(10.377f, 3.316f)
                curveTo(10.734f, 3.435f, 11.271f, 3.436f, 11.631f, 3.316f)
                lineTo(13.693f, 2.628f)
                curveTo(13.846f, 2.577f, 14.16f, 2.577f, 14.314f, 2.628f)
                lineTo(16.377f, 3.316f)
                curveTo(16.734f, 3.435f, 17.271f, 3.436f, 17.631f, 3.316f)
                lineTo(19.693f, 2.628f)
                curveTo(19.846f, 2.577f, 20.16f, 2.577f, 20.314f, 2.628f)
                lineTo(22.377f, 3.316f)
                curveTo(22.738f, 3.436f, 22.738f, 3.436f, 22.846f, 3.472f)
                lineTo(23.32f, 3.63f)
                lineTo(23.636f, 2.682f)
                lineTo(23.162f, 2.523f)
                curveTo(23.054f, 2.487f, 23.054f, 2.487f, 22.693f, 2.367f)
                lineTo(20.631f, 1.68f)
                curveTo(20.271f, 1.56f, 19.734f, 1.561f, 19.377f, 1.68f)
                lineTo(17.314f, 2.367f)
                curveTo(17.16f, 2.418f, 16.846f, 2.418f, 16.693f, 2.367f)
                lineTo(14.631f, 1.68f)
                curveTo(14.271f, 1.56f, 13.734f, 1.561f, 13.377f, 1.68f)
                lineTo(11.314f, 2.367f)
                curveTo(11.16f, 2.418f, 10.846f, 2.418f, 10.693f, 2.367f)
                lineTo(9.004f, 1.804f)
                lineTo(9.004f, 2.858f)
                close()
                moveTo(0.004f, 3.191f)
                lineTo(-0.369f, 3.316f)
                lineTo(-0.844f, 3.474f)
                lineTo(-1.16f, 2.525f)
                lineTo(-0.686f, 2.367f)
                lineTo(0.004f, 2.137f)
                lineTo(0.004f, 3.191f)
                close()
                moveTo(9.004f, 0.358f)
                lineTo(10.377f, 0.816f)
                curveTo(10.734f, 0.935f, 11.271f, 0.936f, 11.631f, 0.816f)
                lineTo(13.693f, 0.128f)
                curveTo(13.846f, 0.077f, 14.16f, 0.077f, 14.314f, 0.128f)
                lineTo(16.377f, 0.816f)
                curveTo(16.734f, 0.935f, 17.271f, 0.936f, 17.631f, 0.816f)
                lineTo(19.693f, 0.128f)
                curveTo(19.846f, 0.077f, 20.16f, 0.077f, 20.314f, 0.128f)
                lineTo(22.377f, 0.816f)
                lineTo(22.846f, 0.972f)
                lineTo(23.32f, 1.13f)
                lineTo(23.636f, 0.182f)
                lineTo(23.162f, 0.023f)
                curveTo(23.054f, -0.013f, 23.054f, -0.013f, 22.693f, -0.133f)
                lineTo(20.631f, -0.82f)
                curveTo(20.271f, -0.94f, 19.734f, -0.939f, 19.377f, -0.82f)
                lineTo(17.314f, -0.133f)
                curveTo(17.16f, -0.082f, 16.846f, -0.082f, 16.693f, -0.133f)
                lineTo(14.631f, -0.82f)
                curveTo(14.271f, -0.94f, 13.734f, -0.939f, 13.377f, -0.82f)
                lineTo(11.314f, -0.133f)
                curveTo(11.16f, -0.082f, 10.846f, -0.082f, 10.693f, -0.133f)
                lineTo(8.631f, -0.82f)
                curveTo(8.271f, -0.94f, 7.734f, -0.939f, 7.377f, -0.82f)
                lineTo(5.314f, -0.133f)
                curveTo(5.16f, -0.082f, 4.846f, -0.082f, 4.693f, -0.133f)
                lineTo(2.631f, -0.82f)
                curveTo(2.271f, -0.94f, 1.734f, -0.939f, 1.377f, -0.82f)
                lineTo(-0.686f, -0.133f)
                lineTo(-1.16f, 0.025f)
                lineTo(-0.844f, 0.974f)
                lineTo(-0.369f, 0.816f)
                lineTo(0.004f, 0.691f)
                lineTo(0.004f, -0.002f)
                lineTo(9.004f, -0.002f)
                lineTo(9.004f, 0.358f)
                close()
                moveTo(23.162f, 15.023f)
                lineTo(23.636f, 15.182f)
                lineTo(23.32f, 16.13f)
                lineTo(22.846f, 15.972f)
                lineTo(22.377f, 15.816f)
                lineTo(20.314f, 15.128f)
                curveTo(20.16f, 15.077f, 19.846f, 15.077f, 19.693f, 15.128f)
                lineTo(17.631f, 15.816f)
                curveTo(17.271f, 15.936f, 16.734f, 15.935f, 16.377f, 15.816f)
                lineTo(14.314f, 15.128f)
                curveTo(14.16f, 15.077f, 13.846f, 15.077f, 13.693f, 15.128f)
                lineTo(11.631f, 15.816f)
                curveTo(11.271f, 15.936f, 10.734f, 15.935f, 10.377f, 15.816f)
                lineTo(8.314f, 15.128f)
                curveTo(8.16f, 15.077f, 7.846f, 15.077f, 7.693f, 15.128f)
                lineTo(5.631f, 15.816f)
                curveTo(5.271f, 15.936f, 4.734f, 15.935f, 4.377f, 15.816f)
                lineTo(2.314f, 15.128f)
                curveTo(2.16f, 15.077f, 1.846f, 15.077f, 1.693f, 15.128f)
                lineTo(-0.369f, 15.816f)
                lineTo(-0.844f, 15.974f)
                lineTo(-1.16f, 15.025f)
                lineTo(-0.686f, 14.867f)
                lineTo(1.377f, 14.18f)
                curveTo(1.734f, 14.061f, 2.271f, 14.06f, 2.631f, 14.18f)
                lineTo(4.693f, 14.867f)
                curveTo(4.846f, 14.918f, 5.16f, 14.918f, 5.314f, 14.867f)
                lineTo(7.377f, 14.18f)
                curveTo(7.734f, 14.061f, 8.271f, 14.06f, 8.631f, 14.18f)
                lineTo(10.693f, 14.867f)
                curveTo(10.846f, 14.918f, 11.16f, 14.918f, 11.314f, 14.867f)
                lineTo(13.377f, 14.18f)
                curveTo(13.734f, 14.061f, 14.271f, 14.06f, 14.631f, 14.18f)
                lineTo(16.693f, 14.867f)
                curveTo(16.846f, 14.918f, 17.16f, 14.918f, 17.314f, 14.867f)
                lineTo(19.377f, 14.18f)
                curveTo(19.734f, 14.061f, 20.271f, 14.06f, 20.631f, 14.18f)
                lineTo(22.693f, 14.867f)
                lineTo(23.162f, 15.023f)
                close()
                moveTo(23.162f, 12.523f)
                lineTo(23.636f, 12.682f)
                lineTo(23.32f, 13.63f)
                lineTo(22.846f, 13.472f)
                curveTo(22.738f, 13.436f, 22.738f, 13.436f, 22.377f, 13.316f)
                lineTo(20.314f, 12.628f)
                curveTo(20.16f, 12.577f, 19.846f, 12.577f, 19.693f, 12.628f)
                lineTo(17.631f, 13.316f)
                curveTo(17.271f, 13.436f, 16.734f, 13.435f, 16.377f, 13.316f)
                lineTo(14.314f, 12.628f)
                curveTo(14.16f, 12.577f, 13.846f, 12.577f, 13.693f, 12.628f)
                lineTo(11.631f, 13.316f)
                curveTo(11.271f, 13.436f, 10.734f, 13.435f, 10.377f, 13.316f)
                lineTo(8.314f, 12.628f)
                curveTo(8.16f, 12.577f, 7.846f, 12.577f, 7.693f, 12.628f)
                lineTo(5.631f, 13.316f)
                curveTo(5.271f, 13.436f, 4.734f, 13.435f, 4.377f, 13.316f)
                lineTo(2.314f, 12.628f)
                curveTo(2.16f, 12.577f, 1.846f, 12.577f, 1.693f, 12.628f)
                lineTo(-0.369f, 13.316f)
                lineTo(-0.844f, 13.474f)
                lineTo(-1.16f, 12.525f)
                lineTo(-0.686f, 12.367f)
                lineTo(1.377f, 11.68f)
                curveTo(1.734f, 11.561f, 2.271f, 11.56f, 2.631f, 11.68f)
                lineTo(4.693f, 12.367f)
                curveTo(4.846f, 12.418f, 5.16f, 12.418f, 5.314f, 12.367f)
                lineTo(7.377f, 11.68f)
                curveTo(7.734f, 11.561f, 8.271f, 11.56f, 8.631f, 11.68f)
                lineTo(10.693f, 12.367f)
                curveTo(10.846f, 12.418f, 11.16f, 12.418f, 11.314f, 12.367f)
                lineTo(13.377f, 11.68f)
                curveTo(13.734f, 11.561f, 14.271f, 11.56f, 14.631f, 11.68f)
                lineTo(16.693f, 12.367f)
                curveTo(16.846f, 12.418f, 17.16f, 12.418f, 17.314f, 12.367f)
                lineTo(19.377f, 11.68f)
                curveTo(19.734f, 11.561f, 20.271f, 11.56f, 20.631f, 11.68f)
                lineTo(22.693f, 12.367f)
                curveTo(23.054f, 12.487f, 23.054f, 12.487f, 23.162f, 12.523f)
                close()
                moveTo(23.162f, 10.023f)
                lineTo(23.636f, 10.182f)
                lineTo(23.32f, 11.13f)
                lineTo(22.846f, 10.972f)
                curveTo(22.738f, 10.936f, 22.738f, 10.936f, 22.377f, 10.816f)
                lineTo(20.314f, 10.128f)
                curveTo(20.16f, 10.077f, 19.846f, 10.077f, 19.693f, 10.128f)
                lineTo(17.631f, 10.816f)
                curveTo(17.271f, 10.936f, 16.734f, 10.935f, 16.377f, 10.816f)
                lineTo(14.314f, 10.128f)
                curveTo(14.16f, 10.077f, 13.846f, 10.077f, 13.693f, 10.128f)
                lineTo(11.631f, 10.816f)
                curveTo(11.271f, 10.936f, 10.734f, 10.935f, 10.377f, 10.816f)
                lineTo(8.314f, 10.128f)
                curveTo(8.16f, 10.077f, 7.846f, 10.077f, 7.693f, 10.128f)
                lineTo(5.631f, 10.816f)
                curveTo(5.271f, 10.936f, 4.734f, 10.935f, 4.377f, 10.816f)
                lineTo(2.314f, 10.128f)
                curveTo(2.16f, 10.077f, 1.846f, 10.077f, 1.693f, 10.128f)
                lineTo(-0.369f, 10.816f)
                lineTo(-0.844f, 10.974f)
                lineTo(-1.16f, 10.025f)
                lineTo(-0.686f, 9.867f)
                lineTo(1.377f, 9.18f)
                curveTo(1.734f, 9.061f, 2.271f, 9.06f, 2.631f, 9.18f)
                lineTo(4.693f, 9.867f)
                curveTo(4.846f, 9.918f, 5.16f, 9.918f, 5.314f, 9.867f)
                lineTo(7.377f, 9.18f)
                curveTo(7.734f, 9.061f, 8.271f, 9.06f, 8.631f, 9.18f)
                lineTo(10.693f, 9.867f)
                curveTo(10.846f, 9.918f, 11.16f, 9.918f, 11.314f, 9.867f)
                lineTo(13.377f, 9.18f)
                curveTo(13.734f, 9.061f, 14.271f, 9.06f, 14.631f, 9.18f)
                lineTo(16.693f, 9.867f)
                curveTo(16.846f, 9.918f, 17.16f, 9.918f, 17.314f, 9.867f)
                lineTo(19.377f, 9.18f)
                curveTo(19.734f, 9.061f, 20.271f, 9.06f, 20.631f, 9.18f)
                lineTo(22.693f, 9.867f)
                curveTo(23.054f, 9.987f, 23.054f, 9.987f, 23.162f, 10.023f)
                close()
            }
        }.build()

        return _IO!!
    }

@Suppress("ObjectPropertyName")
private var _IO: ImageVector? = null
