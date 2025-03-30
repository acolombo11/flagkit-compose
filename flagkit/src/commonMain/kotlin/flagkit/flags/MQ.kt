package flagkit.flags

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import flagkit.FlagKit

val FlagKit.MQ: ImageVector
    get() {
        if (_MQ != null) {
            return _MQ!!
        }
        _MQ = ImageVector.Builder(
            name = "MQ",
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
                        0f to Color(0xFF345CB3),
                        1f to Color(0xFF23448D)
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
                    start = Offset(16.303f, 1.1f),
                    end = Offset(16.303f, 4.972f)
                ),
                strokeLineWidth = 1f
            ) {
                moveTo(15.917f, 1.603f)
                curveTo(16.069f, 1.598f, 16.235f, 1.599f, 16.388f, 1.611f)
                curveTo(16.594f, 1.626f, 16.739f, 1.672f, 16.728f, 1.629f)
                curveTo(16.711f, 1.562f, 16.723f, 1.545f, 16.699f, 1.562f)
                curveTo(16.648f, 1.6f, 16.724f, 1.555f, 16.421f, 1.729f)
                curveTo(15.979f, 1.982f, 15.787f, 2.174f, 15.884f, 2.52f)
                curveTo(15.969f, 2.824f, 16.194f, 2.907f, 16.723f, 2.99f)
                curveTo(16.758f, 2.996f, 16.758f, 2.996f, 16.793f, 3.001f)
                curveTo(17.004f, 3.034f, 17.099f, 3.054f, 17.162f, 3.082f)
                curveTo(17.176f, 3.088f, 17.149f, 3.045f, 17.157f, 3.018f)
                curveTo(17.15f, 3.041f, 17.009f, 3.096f, 16.656f, 3.166f)
                curveTo(16.57f, 3.182f, 16.57f, 3.182f, 16.481f, 3.2f)
                curveTo(15.801f, 3.339f, 15.462f, 3.52f, 15.411f, 3.991f)
                curveTo(15.356f, 4.506f, 15.89f, 4.865f, 16.561f, 4.953f)
                curveTo(17.246f, 5.043f, 17.841f, 4.817f, 17.902f, 4.261f)
                curveTo(17.941f, 3.907f, 17.695f, 3.696f, 17.306f, 3.618f)
                curveTo(17.042f, 3.565f, 16.695f, 3.566f, 16.278f, 3.607f)
                curveTo(16.045f, 3.63f, 15.797f, 3.666f, 15.544f, 3.71f)
                curveTo(15.262f, 3.759f, 15.031f, 3.809f, 14.892f, 3.842f)
                curveTo(14.757f, 3.874f, 14.675f, 4.009f, 14.707f, 4.143f)
                curveTo(14.739f, 4.278f, 14.874f, 4.36f, 15.008f, 4.328f)
                curveTo(15.138f, 4.297f, 15.36f, 4.25f, 15.631f, 4.202f)
                curveTo(15.872f, 4.16f, 16.108f, 4.126f, 16.328f, 4.105f)
                curveTo(16.699f, 4.068f, 17.003f, 4.067f, 17.208f, 4.108f)
                curveTo(17.375f, 4.141f, 17.409f, 4.171f, 17.405f, 4.207f)
                curveTo(17.384f, 4.397f, 17.07f, 4.516f, 16.626f, 4.458f)
                curveTo(16.19f, 4.4f, 15.892f, 4.2f, 15.908f, 4.044f)
                curveTo(15.925f, 3.885f, 16.109f, 3.787f, 16.581f, 3.69f)
                curveTo(16.667f, 3.673f, 16.667f, 3.673f, 16.753f, 3.656f)
                curveTo(17.335f, 3.542f, 17.547f, 3.458f, 17.636f, 3.16f)
                curveTo(17.709f, 2.916f, 17.588f, 2.724f, 17.364f, 2.625f)
                curveTo(17.245f, 2.572f, 17.129f, 2.547f, 16.869f, 2.507f)
                curveTo(16.834f, 2.502f, 16.834f, 2.502f, 16.8f, 2.496f)
                curveTo(16.499f, 2.449f, 16.37f, 2.401f, 16.366f, 2.385f)
                curveTo(16.361f, 2.37f, 16.434f, 2.297f, 16.669f, 2.163f)
                curveTo(16.75f, 2.117f, 16.797f, 2.09f, 16.833f, 2.069f)
                curveTo(16.898f, 2.031f, 16.949f, 1.999f, 16.994f, 1.966f)
                curveTo(17.167f, 1.84f, 17.263f, 1.698f, 17.212f, 1.503f)
                curveTo(17.141f, 1.23f, 16.873f, 1.146f, 16.426f, 1.112f)
                curveTo(16.252f, 1.099f, 16.069f, 1.097f, 15.9f, 1.103f)
                curveTo(15.841f, 1.106f, 15.841f, 1.106f, 15.825f, 1.106f)
                curveTo(15.687f, 1.114f, 15.582f, 1.233f, 15.59f, 1.371f)
                curveTo(15.598f, 1.508f, 15.716f, 1.614f, 15.854f, 1.606f)
                curveTo(15.864f, 1.605f, 15.864f, 1.605f, 15.917f, 1.603f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFFFFF),
                        1f to Color(0xFFF0F0F0)
                    ),
                    start = Offset(4.703f, 1.1f),
                    end = Offset(4.703f, 4.972f)
                ),
                strokeLineWidth = 1f
            ) {
                moveTo(4.317f, 1.603f)
                curveTo(4.469f, 1.598f, 4.635f, 1.599f, 4.788f, 1.611f)
                curveTo(4.994f, 1.626f, 5.139f, 1.672f, 5.128f, 1.629f)
                curveTo(5.111f, 1.562f, 5.123f, 1.545f, 5.099f, 1.562f)
                curveTo(5.048f, 1.6f, 5.124f, 1.555f, 4.821f, 1.729f)
                curveTo(4.379f, 1.982f, 4.187f, 2.174f, 4.284f, 2.52f)
                curveTo(4.369f, 2.824f, 4.594f, 2.907f, 5.123f, 2.99f)
                curveTo(5.158f, 2.996f, 5.158f, 2.996f, 5.193f, 3.001f)
                curveTo(5.404f, 3.034f, 5.499f, 3.054f, 5.562f, 3.082f)
                curveTo(5.576f, 3.088f, 5.549f, 3.045f, 5.557f, 3.018f)
                curveTo(5.55f, 3.041f, 5.409f, 3.096f, 5.056f, 3.166f)
                curveTo(4.97f, 3.182f, 4.97f, 3.182f, 4.881f, 3.2f)
                curveTo(4.201f, 3.339f, 3.862f, 3.52f, 3.811f, 3.991f)
                curveTo(3.756f, 4.506f, 4.29f, 4.865f, 4.961f, 4.953f)
                curveTo(5.646f, 5.043f, 6.241f, 4.817f, 6.302f, 4.261f)
                curveTo(6.341f, 3.907f, 6.095f, 3.696f, 5.706f, 3.618f)
                curveTo(5.442f, 3.565f, 5.095f, 3.566f, 4.678f, 3.607f)
                curveTo(4.445f, 3.63f, 4.197f, 3.666f, 3.944f, 3.71f)
                curveTo(3.662f, 3.759f, 3.431f, 3.809f, 3.292f, 3.842f)
                curveTo(3.157f, 3.874f, 3.075f, 4.009f, 3.107f, 4.143f)
                curveTo(3.139f, 4.278f, 3.274f, 4.36f, 3.408f, 4.328f)
                curveTo(3.538f, 4.297f, 3.76f, 4.25f, 4.031f, 4.202f)
                curveTo(4.272f, 4.16f, 4.508f, 4.126f, 4.728f, 4.105f)
                curveTo(5.099f, 4.068f, 5.403f, 4.067f, 5.608f, 4.108f)
                curveTo(5.775f, 4.141f, 5.809f, 4.171f, 5.805f, 4.207f)
                curveTo(5.784f, 4.397f, 5.47f, 4.516f, 5.026f, 4.458f)
                curveTo(4.59f, 4.4f, 4.292f, 4.2f, 4.308f, 4.044f)
                curveTo(4.325f, 3.885f, 4.509f, 3.787f, 4.981f, 3.69f)
                curveTo(5.067f, 3.673f, 5.067f, 3.673f, 5.153f, 3.656f)
                curveTo(5.735f, 3.542f, 5.947f, 3.458f, 6.036f, 3.16f)
                curveTo(6.109f, 2.916f, 5.988f, 2.724f, 5.764f, 2.625f)
                curveTo(5.645f, 2.572f, 5.529f, 2.547f, 5.269f, 2.507f)
                curveTo(5.234f, 2.502f, 5.234f, 2.502f, 5.2f, 2.496f)
                curveTo(4.899f, 2.449f, 4.77f, 2.401f, 4.766f, 2.385f)
                curveTo(4.761f, 2.37f, 4.834f, 2.297f, 5.069f, 2.163f)
                curveTo(5.15f, 2.117f, 5.197f, 2.09f, 5.233f, 2.069f)
                curveTo(5.298f, 2.031f, 5.349f, 1.999f, 5.394f, 1.966f)
                curveTo(5.567f, 1.84f, 5.663f, 1.698f, 5.612f, 1.503f)
                curveTo(5.541f, 1.23f, 5.273f, 1.146f, 4.826f, 1.112f)
                curveTo(4.652f, 1.099f, 4.469f, 1.097f, 4.3f, 1.103f)
                curveTo(4.241f, 1.106f, 4.241f, 1.106f, 4.225f, 1.106f)
                curveTo(4.087f, 1.114f, 3.982f, 1.233f, 3.99f, 1.371f)
                curveTo(3.998f, 1.508f, 4.116f, 1.614f, 4.254f, 1.606f)
                curveTo(4.264f, 1.605f, 4.264f, 1.605f, 4.317f, 1.603f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFFFFF),
                        1f to Color(0xFFF0F0F0)
                    ),
                    start = Offset(16.303f, 10.1f),
                    end = Offset(16.303f, 13.972f)
                ),
                strokeLineWidth = 1f
            ) {
                moveTo(15.917f, 10.603f)
                curveTo(16.069f, 10.598f, 16.235f, 10.599f, 16.388f, 10.611f)
                curveTo(16.594f, 10.626f, 16.739f, 10.672f, 16.728f, 10.629f)
                curveTo(16.711f, 10.562f, 16.723f, 10.545f, 16.699f, 10.562f)
                curveTo(16.648f, 10.6f, 16.724f, 10.555f, 16.421f, 10.729f)
                curveTo(15.979f, 10.982f, 15.787f, 11.174f, 15.884f, 11.52f)
                curveTo(15.969f, 11.824f, 16.194f, 11.907f, 16.723f, 11.99f)
                curveTo(16.758f, 11.996f, 16.758f, 11.996f, 16.793f, 12.001f)
                curveTo(17.004f, 12.034f, 17.099f, 12.054f, 17.162f, 12.082f)
                curveTo(17.176f, 12.088f, 17.149f, 12.045f, 17.157f, 12.018f)
                curveTo(17.15f, 12.041f, 17.009f, 12.096f, 16.656f, 12.166f)
                curveTo(16.57f, 12.182f, 16.57f, 12.182f, 16.481f, 12.2f)
                curveTo(15.801f, 12.339f, 15.462f, 12.52f, 15.411f, 12.991f)
                curveTo(15.356f, 13.506f, 15.89f, 13.865f, 16.561f, 13.953f)
                curveTo(17.246f, 14.043f, 17.841f, 13.817f, 17.902f, 13.261f)
                curveTo(17.941f, 12.907f, 17.695f, 12.696f, 17.306f, 12.618f)
                curveTo(17.042f, 12.565f, 16.695f, 12.566f, 16.278f, 12.607f)
                curveTo(16.045f, 12.63f, 15.797f, 12.666f, 15.544f, 12.71f)
                curveTo(15.262f, 12.759f, 15.031f, 12.809f, 14.892f, 12.842f)
                curveTo(14.757f, 12.874f, 14.675f, 13.009f, 14.707f, 13.143f)
                curveTo(14.739f, 13.278f, 14.874f, 13.36f, 15.008f, 13.328f)
                curveTo(15.138f, 13.297f, 15.36f, 13.25f, 15.631f, 13.202f)
                curveTo(15.872f, 13.16f, 16.108f, 13.126f, 16.328f, 13.105f)
                curveTo(16.699f, 13.068f, 17.003f, 13.067f, 17.208f, 13.108f)
                curveTo(17.375f, 13.141f, 17.409f, 13.171f, 17.405f, 13.207f)
                curveTo(17.384f, 13.397f, 17.07f, 13.516f, 16.626f, 13.458f)
                curveTo(16.19f, 13.4f, 15.892f, 13.2f, 15.908f, 13.044f)
                curveTo(15.925f, 12.885f, 16.109f, 12.787f, 16.581f, 12.69f)
                curveTo(16.667f, 12.673f, 16.667f, 12.673f, 16.753f, 12.656f)
                curveTo(17.335f, 12.542f, 17.547f, 12.458f, 17.636f, 12.16f)
                curveTo(17.709f, 11.916f, 17.588f, 11.724f, 17.364f, 11.625f)
                curveTo(17.245f, 11.572f, 17.129f, 11.547f, 16.869f, 11.507f)
                curveTo(16.834f, 11.502f, 16.834f, 11.502f, 16.8f, 11.496f)
                curveTo(16.499f, 11.449f, 16.37f, 11.401f, 16.366f, 11.385f)
                curveTo(16.361f, 11.37f, 16.434f, 11.297f, 16.669f, 11.163f)
                curveTo(16.75f, 11.117f, 16.797f, 11.09f, 16.833f, 11.069f)
                curveTo(16.898f, 11.031f, 16.949f, 10.999f, 16.994f, 10.966f)
                curveTo(17.167f, 10.84f, 17.263f, 10.698f, 17.212f, 10.503f)
                curveTo(17.141f, 10.23f, 16.873f, 10.146f, 16.426f, 10.112f)
                curveTo(16.252f, 10.099f, 16.069f, 10.097f, 15.9f, 10.103f)
                curveTo(15.841f, 10.106f, 15.841f, 10.106f, 15.825f, 10.106f)
                curveTo(15.687f, 10.114f, 15.582f, 10.233f, 15.59f, 10.371f)
                curveTo(15.598f, 10.508f, 15.716f, 10.614f, 15.854f, 10.606f)
                curveTo(15.864f, 10.605f, 15.864f, 10.605f, 15.917f, 10.603f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFFFFF),
                        1f to Color(0xFFF0F0F0)
                    ),
                    start = Offset(4.703f, 10.1f),
                    end = Offset(4.703f, 13.972f)
                ),
                strokeLineWidth = 1f
            ) {
                moveTo(4.317f, 10.603f)
                curveTo(4.469f, 10.598f, 4.635f, 10.599f, 4.788f, 10.611f)
                curveTo(4.994f, 10.626f, 5.139f, 10.672f, 5.128f, 10.629f)
                curveTo(5.111f, 10.562f, 5.123f, 10.545f, 5.099f, 10.562f)
                curveTo(5.048f, 10.6f, 5.124f, 10.555f, 4.821f, 10.729f)
                curveTo(4.379f, 10.982f, 4.187f, 11.174f, 4.284f, 11.52f)
                curveTo(4.369f, 11.824f, 4.594f, 11.907f, 5.123f, 11.99f)
                curveTo(5.158f, 11.996f, 5.158f, 11.996f, 5.193f, 12.001f)
                curveTo(5.404f, 12.034f, 5.499f, 12.054f, 5.562f, 12.082f)
                curveTo(5.576f, 12.088f, 5.549f, 12.045f, 5.557f, 12.018f)
                curveTo(5.55f, 12.041f, 5.409f, 12.096f, 5.056f, 12.166f)
                curveTo(4.97f, 12.182f, 4.97f, 12.182f, 4.881f, 12.2f)
                curveTo(4.201f, 12.339f, 3.862f, 12.52f, 3.811f, 12.991f)
                curveTo(3.756f, 13.506f, 4.29f, 13.865f, 4.961f, 13.953f)
                curveTo(5.646f, 14.043f, 6.241f, 13.817f, 6.302f, 13.261f)
                curveTo(6.341f, 12.907f, 6.095f, 12.696f, 5.706f, 12.618f)
                curveTo(5.442f, 12.565f, 5.095f, 12.566f, 4.678f, 12.607f)
                curveTo(4.445f, 12.63f, 4.197f, 12.666f, 3.944f, 12.71f)
                curveTo(3.662f, 12.759f, 3.431f, 12.809f, 3.292f, 12.842f)
                curveTo(3.157f, 12.874f, 3.075f, 13.009f, 3.107f, 13.143f)
                curveTo(3.139f, 13.278f, 3.274f, 13.36f, 3.408f, 13.328f)
                curveTo(3.538f, 13.297f, 3.76f, 13.25f, 4.031f, 13.202f)
                curveTo(4.272f, 13.16f, 4.508f, 13.126f, 4.728f, 13.105f)
                curveTo(5.099f, 13.068f, 5.403f, 13.067f, 5.608f, 13.108f)
                curveTo(5.775f, 13.141f, 5.809f, 13.171f, 5.805f, 13.207f)
                curveTo(5.784f, 13.397f, 5.47f, 13.516f, 5.026f, 13.458f)
                curveTo(4.59f, 13.4f, 4.292f, 13.2f, 4.308f, 13.044f)
                curveTo(4.325f, 12.885f, 4.509f, 12.787f, 4.981f, 12.69f)
                curveTo(5.067f, 12.673f, 5.067f, 12.673f, 5.153f, 12.656f)
                curveTo(5.735f, 12.542f, 5.947f, 12.458f, 6.036f, 12.16f)
                curveTo(6.109f, 11.916f, 5.988f, 11.724f, 5.764f, 11.625f)
                curveTo(5.645f, 11.572f, 5.529f, 11.547f, 5.269f, 11.507f)
                curveTo(5.234f, 11.502f, 5.234f, 11.502f, 5.2f, 11.496f)
                curveTo(4.899f, 11.449f, 4.77f, 11.401f, 4.766f, 11.385f)
                curveTo(4.761f, 11.37f, 4.834f, 11.297f, 5.069f, 11.163f)
                curveTo(5.15f, 11.117f, 5.197f, 11.09f, 5.233f, 11.069f)
                curveTo(5.298f, 11.031f, 5.349f, 10.999f, 5.394f, 10.966f)
                curveTo(5.567f, 10.84f, 5.663f, 10.698f, 5.612f, 10.503f)
                curveTo(5.541f, 10.23f, 5.273f, 10.146f, 4.826f, 10.112f)
                curveTo(4.652f, 10.099f, 4.469f, 10.097f, 4.3f, 10.103f)
                curveTo(4.241f, 10.106f, 4.241f, 10.106f, 4.225f, 10.106f)
                curveTo(4.087f, 10.114f, 3.982f, 10.233f, 3.99f, 10.371f)
                curveTo(3.998f, 10.508f, 4.116f, 10.614f, 4.254f, 10.606f)
                curveTo(4.264f, 10.605f, 4.264f, 10.605f, 4.317f, 10.603f)
                close()
            }
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
                moveTo(9f, 6f)
                lineTo(0f, 6f)
                lineTo(0f, 9f)
                lineTo(9f, 9f)
                lineTo(9f, 15f)
                lineTo(12f, 15f)
                lineTo(12f, 9f)
                lineTo(21f, 9f)
                lineTo(21f, 6f)
                lineTo(12f, 6f)
                lineTo(12f, 0f)
                lineTo(9f, 0f)
                lineTo(9f, 6f)
                close()
            }
        }.build()

        return _MQ!!
    }

@Suppress("ObjectPropertyName")
private var _MQ: ImageVector? = null
