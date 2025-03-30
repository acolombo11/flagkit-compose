package flagkit.flags

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathData
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import flagkit.FlagKit

val FlagKit.VI: ImageVector
    get() {
        if (_VI != null) {
            return _VI!!
        }
        _VI = ImageVector.Builder(
            name = "VI",
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
                fill = SolidColor(Color(0xFF1583C4)),
                strokeLineWidth = 1f
            ) {
                moveTo(16.349f, 6.505f)
                lineTo(13.278f, 12.384f)
                curveTo(13.214f, 12.507f, 13.262f, 12.658f, 13.384f, 12.722f)
                curveTo(13.507f, 12.786f, 13.658f, 12.738f, 13.722f, 12.616f)
                lineTo(16.792f, 6.736f)
                curveTo(16.856f, 6.614f, 16.809f, 6.463f, 16.686f, 6.399f)
                curveTo(16.564f, 6.335f, 16.413f, 6.382f, 16.349f, 6.505f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF1583C4)),
                strokeLineWidth = 1f
            ) {
                moveTo(16.781f, 7.813f)
                lineTo(13.302f, 12.348f)
                curveTo(13.218f, 12.457f, 13.238f, 12.614f, 13.348f, 12.698f)
                curveTo(13.457f, 12.782f, 13.614f, 12.762f, 13.698f, 12.652f)
                lineTo(17.178f, 8.118f)
                curveTo(17.262f, 8.008f, 17.241f, 7.851f, 17.131f, 7.767f)
                curveTo(17.022f, 7.683f, 16.865f, 7.704f, 16.781f, 7.813f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF1583C4)),
                strokeLineWidth = 1f
            ) {
                moveTo(15.223f, 7.409f)
                lineTo(13.267f, 12.409f)
                curveTo(13.217f, 12.538f, 13.28f, 12.683f, 13.409f, 12.733f)
                curveTo(13.538f, 12.783f, 13.683f, 12.72f, 13.733f, 12.591f)
                lineTo(15.688f, 7.591f)
                curveTo(15.739f, 7.462f, 15.675f, 7.317f, 15.547f, 7.267f)
                curveTo(15.418f, 7.217f, 15.273f, 7.28f, 15.223f, 7.409f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF409347)),
                strokeLineWidth = 1f
            ) {
                moveTo(4.261f, 6.573f)
                curveTo(4.289f, 6.666f, 4.341f, 6.829f, 4.41f, 7.037f)
                curveTo(4.527f, 7.384f, 4.652f, 7.731f, 4.781f, 8.056f)
                curveTo(4.929f, 8.429f, 5.074f, 8.749f, 5.212f, 9.001f)
                curveTo(5.237f, 9.046f, 5.261f, 9.088f, 5.286f, 9.129f)
                curveTo(5.446f, 9.395f, 5.699f, 9.743f, 6.028f, 10.155f)
                curveTo(6.09f, 10.233f, 6.154f, 10.313f, 6.221f, 10.394f)
                curveTo(6.46f, 10.687f, 6.716f, 10.988f, 6.972f, 11.281f)
                curveTo(7.126f, 11.457f, 7.246f, 11.592f, 7.315f, 11.668f)
                curveTo(7.407f, 11.77f, 7.565f, 11.778f, 7.668f, 11.685f)
                curveTo(7.77f, 11.593f, 7.778f, 11.435f, 7.685f, 11.332f)
                curveTo(7.619f, 11.258f, 7.501f, 11.126f, 7.349f, 10.952f)
                curveTo(7.096f, 10.663f, 6.844f, 10.365f, 6.608f, 10.077f)
                curveTo(6.543f, 9.998f, 6.48f, 9.92f, 6.419f, 9.843f)
                curveTo(6.103f, 9.447f, 5.86f, 9.115f, 5.714f, 8.871f)
                curveTo(5.694f, 8.837f, 5.672f, 8.799f, 5.651f, 8.76f)
                curveTo(5.523f, 8.529f, 5.387f, 8.227f, 5.246f, 7.871f)
                curveTo(5.12f, 7.556f, 4.998f, 7.217f, 4.885f, 6.878f)
                curveTo(4.816f, 6.675f, 4.766f, 6.517f, 4.739f, 6.427f)
                curveTo(4.699f, 6.295f, 4.559f, 6.221f, 4.427f, 6.261f)
                curveTo(4.295f, 6.301f, 4.221f, 6.441f, 4.261f, 6.573f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF1583C4)),
                strokeLineWidth = 1f
            ) {
                moveTo(19f, 6.5f)
                lineTo(19f, 9f)
                curveTo(19f, 9.276f, 19.224f, 9.5f, 19.5f, 9.5f)
                curveTo(19.776f, 9.5f, 20f, 9.276f, 20f, 9f)
                lineTo(20f, 6.5f)
                curveTo(20f, 6.224f, 19.776f, 6f, 19.5f, 6f)
                curveTo(19.224f, 6f, 19f, 6.224f, 19f, 6.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF1583C4)),
                strokeLineWidth = 1f
            ) {
                moveTo(2.5f, 7.654f)
                lineTo(1.964f, 6.314f)
                curveTo(1.862f, 6.058f, 1.571f, 5.933f, 1.314f, 6.036f)
                curveTo(1.058f, 6.138f, 0.933f, 6.429f, 1.036f, 6.686f)
                lineTo(2.036f, 9.186f)
                curveTo(2.203f, 9.605f, 2.797f, 9.605f, 2.964f, 9.186f)
                lineTo(3.964f, 6.686f)
                curveTo(4.067f, 6.429f, 3.942f, 6.138f, 3.686f, 6.036f)
                curveTo(3.429f, 5.933f, 3.138f, 6.058f, 3.036f, 6.314f)
                lineTo(2.5f, 7.654f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFF8CE61),
                        1f to Color(0xFFF3C44B)
                    ),
                    start = Offset(10.5f, 1.978f),
                    end = Offset(10.5f, 12.739f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(15f, 6.5f)
                curveTo(15f, 6.5f, 15.036f, 7.165f, 14.197f, 7.5f)
                curveTo(13.358f, 7.835f, 12.5f, 7.5f, 12.5f, 7.5f)
                curveTo(12.5f, 7.5f, 13.118f, 7.863f, 13.5f, 8.5f)
                curveTo(13.882f, 9.137f, 13.682f, 9.483f, 14f, 9.801f)
                curveTo(14.318f, 10.119f, 14.891f, 9.902f, 15.118f, 10.174f)
                curveTo(15.345f, 10.447f, 15.328f, 10.758f, 15f, 11f)
                curveTo(14.672f, 11.242f, 14.568f, 11.129f, 14.197f, 10.882f)
                curveTo(13.826f, 10.634f, 14f, 10.387f, 14f, 10.387f)
                curveTo(14f, 10.387f, 13.361f, 10.056f, 12.872f, 9.913f)
                curveTo(12.5f, 9.218f, 12f, 9f, 12f, 9f)
                lineTo(12f, 9.5f)
                curveTo(12f, 9.5f, 13f, 10.013f, 13f, 10.5f)
                curveTo(13f, 10.713f, 12.538f, 11.416f, 12f, 11.917f)
                curveTo(11.308f, 12.561f, 10.5f, 12.739f, 10.5f, 12.739f)
                lineTo(10.5f, 5.5f)
                lineTo(13.5f, 5f)
                curveTo(13.5f, 5f, 12.119f, 3.913f, 15.25f, 3.153f)
                curveTo(18.381f, 2.393f, 19.03f, 2.236f, 19.03f, 2.236f)
                curveTo(19.566f, 2.106f, 19.771f, 2.377f, 19.472f, 2.841f)
                curveTo(19.472f, 2.841f, 19.448f, 2.94f, 19f, 3.5f)
                curveTo(18.552f, 4.06f, 18.454f, 4.16f, 18f, 4.5f)
                curveTo(17.546f, 4.84f, 17.546f, 4.59f, 17f, 5f)
                curveTo(16.454f, 5.41f, 16.433f, 5.783f, 16f, 6f)
                curveTo(15.567f, 6.217f, 15f, 6f, 15f, 6f)
                lineTo(15f, 6.5f)
                close()
                moveTo(6f, 6.5f)
                lineTo(6f, 6f)
                curveTo(6f, 6f, 5.433f, 6.217f, 5f, 6f)
                curveTo(4.566f, 5.783f, 4.546f, 5.41f, 4f, 5f)
                curveTo(3.453f, 4.59f, 3.453f, 4.84f, 3f, 4.5f)
                curveTo(2.546f, 4.16f, 2.448f, 4.06f, 2f, 3.5f)
                curveTo(1.552f, 2.94f, 1.528f, 2.841f, 1.528f, 2.841f)
                curveTo(1.229f, 2.377f, 1.434f, 2.106f, 1.97f, 2.236f)
                curveTo(1.97f, 2.236f, 2.618f, 2.393f, 5.75f, 3.153f)
                curveTo(8.881f, 3.913f, 7.5f, 5f, 7.5f, 5f)
                lineTo(10.5f, 5.5f)
                lineTo(10.5f, 12.739f)
                curveTo(10.5f, 12.739f, 9.692f, 12.561f, 9f, 11.917f)
                curveTo(8.462f, 11.416f, 8f, 10.713f, 8f, 10.5f)
                curveTo(8f, 10.013f, 9f, 9.5f, 9f, 9.5f)
                lineTo(9f, 9f)
                curveTo(9f, 9f, 8.5f, 9.218f, 8.128f, 9.913f)
                curveTo(7.639f, 10.056f, 7f, 10.387f, 7f, 10.387f)
                curveTo(7f, 10.387f, 7.174f, 10.634f, 6.803f, 10.882f)
                curveTo(6.431f, 11.129f, 6.327f, 11.242f, 6f, 11f)
                curveTo(5.672f, 10.758f, 5.654f, 10.447f, 5.881f, 10.174f)
                curveTo(6.108f, 9.902f, 6.682f, 10.119f, 7f, 9.801f)
                curveTo(7.317f, 9.483f, 7.117f, 9.137f, 7.5f, 8.5f)
                curveTo(7.882f, 7.863f, 8.5f, 7.5f, 8.5f, 7.5f)
                curveTo(8.5f, 7.5f, 7.642f, 7.835f, 6.803f, 7.5f)
                curveTo(5.964f, 7.165f, 6f, 6.5f, 6f, 6.5f)
                close()
                moveTo(9.248f, 4.726f)
                curveTo(9.228f, 4.587f, 8.93f, 4.476f, 9.063f, 4.442f)
                curveTo(9.31f, 4.378f, 9.434f, 4.299f, 9.556f, 4.089f)
                curveTo(9.61f, 3.997f, 9.369f, 4.057f, 9.447f, 3.966f)
                curveTo(9.859f, 3.489f, 9.945f, 3.119f, 9.681f, 2.994f)
                curveTo(9.11f, 2.725f, 9.04f, 3.421f, 9.063f, 3.134f)
                curveTo(9.079f, 2.93f, 9.1f, 2.765f, 9.126f, 2.683f)
                curveTo(9.241f, 2.317f, 9.823f, 2.339f, 9.859f, 2.268f)
                curveTo(10.005f, 1.975f, 10.173f, 1.947f, 10.5f, 2f)
                curveTo(10.827f, 2.053f, 10.975f, 2.209f, 11.105f, 2.469f)
                curveTo(11.203f, 2.665f, 11.175f, 2.971f, 11.283f, 3.263f)
                curveTo(11.352f, 3.452f, 11.454f, 3.557f, 11.53f, 3.746f)
                curveTo(11.574f, 3.856f, 11.241f, 3.638f, 11.283f, 3.746f)
                curveTo(11.396f, 4.04f, 11.679f, 4.027f, 11.849f, 4.293f)
                curveTo(11.918f, 4.402f, 11.593f, 4.273f, 11.614f, 4.442f)
                curveTo(11.629f, 4.555f, 12f, 5f, 12f, 5f)
                lineTo(9f, 5f)
                curveTo(9f, 5f, 9.266f, 4.847f, 9.248f, 4.726f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 0.08f,
                strokeLineWidth = 0.5f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(14.123f, 10.169f)
                lineTo(14.37f, 10.296f)
                lineTo(14.211f, 10.521f)
                curveTo(14.198f, 10.555f, 14.21f, 10.59f, 14.336f, 10.674f)
                curveTo(14.638f, 10.875f, 14.641f, 10.877f, 14.684f, 10.884f)
                curveTo(14.71f, 10.888f, 14.752f, 10.872f, 14.852f, 10.799f)
                curveTo(15.053f, 10.65f, 15.07f, 10.506f, 14.926f, 10.334f)
                curveTo(14.895f, 10.297f, 14.821f, 10.277f, 14.598f, 10.256f)
                curveTo(14.536f, 10.25f, 14.536f, 10.25f, 14.469f, 10.243f)
                curveTo(14.337f, 10.228f, 14.223f, 10.206f, 14.123f, 10.169f)
                close()
                moveTo(13.951f, 10.083f)
                curveTo(13.906f, 10.053f, 13.864f, 10.018f, 13.823f, 9.978f)
                curveTo(13.65f, 9.805f, 13.59f, 9.649f, 13.535f, 9.351f)
                curveTo(13.471f, 9.004f, 13.431f, 8.871f, 13.286f, 8.629f)
                curveTo(13.197f, 8.481f, 13.089f, 8.34f, 12.965f, 8.208f)
                curveTo(12.741f, 7.968f, 12.516f, 7.799f, 12.373f, 7.716f)
                lineTo(12.591f, 7.267f)
                curveTo(12.628f, 7.282f, 12.704f, 7.306f, 12.811f, 7.331f)
                curveTo(13.221f, 7.428f, 13.656f, 7.432f, 14.055f, 7.287f)
                curveTo(14.08f, 7.277f, 14.08f, 7.277f, 14.104f, 7.268f)
                curveTo(14.32f, 7.182f, 14.475f, 7.069f, 14.581f, 6.937f)
                curveTo(14.712f, 6.776f, 14.753f, 6.615f, 14.75f, 6.51f)
                lineTo(14.75f, 6.513f)
                lineTo(14.75f, 6.5f)
                lineTo(14.75f, 5.637f)
                lineTo(15.089f, 5.766f)
                curveTo(15.111f, 5.775f, 15.158f, 5.79f, 15.221f, 5.805f)
                curveTo(15.386f, 5.845f, 15.554f, 5.859f, 15.702f, 5.834f)
                curveTo(15.771f, 5.823f, 15.833f, 5.804f, 15.888f, 5.776f)
                curveTo(16.015f, 5.713f, 16.095f, 5.638f, 16.213f, 5.482f)
                curveTo(16.549f, 5.039f, 16.582f, 5.001f, 16.85f, 4.8f)
                curveTo(17.117f, 4.6f, 17.262f, 4.534f, 17.495f, 4.476f)
                lineTo(17.509f, 4.473f)
                curveTo(17.635f, 4.441f, 17.704f, 4.41f, 17.85f, 4.3f)
                curveTo(18.283f, 3.975f, 18.367f, 3.891f, 18.805f, 3.344f)
                curveTo(19.116f, 2.954f, 19.229f, 2.782f, 19.262f, 2.706f)
                curveTo(19.436f, 2.436f, 19.41f, 2.401f, 19.089f, 2.479f)
                curveTo(19.008f, 2.498f, 19.008f, 2.498f, 18.373f, 2.652f)
                curveTo(17.681f, 2.82f, 16.679f, 3.064f, 15.309f, 3.396f)
                curveTo(14.65f, 3.556f, 14.173f, 3.736f, 13.86f, 3.928f)
                curveTo(13.391f, 4.217f, 13.361f, 4.44f, 13.548f, 4.689f)
                curveTo(13.591f, 4.745f, 13.632f, 4.786f, 13.655f, 4.804f)
                lineTo(14.099f, 5.154f)
                lineTo(10.75f, 5.712f)
                lineTo(10.75f, 12.398f)
                curveTo(10.764f, 12.392f, 10.779f, 12.387f, 10.794f, 12.381f)
                curveTo(11.065f, 12.273f, 11.335f, 12.127f, 11.587f, 11.937f)
                curveTo(11.671f, 11.874f, 11.752f, 11.806f, 11.83f, 11.734f)
                curveTo(12.287f, 11.308f, 12.75f, 10.637f, 12.75f, 10.5f)
                curveTo(12.75f, 10.493f, 12.749f, 10.485f, 12.748f, 10.476f)
                curveTo(12.726f, 10.361f, 12.58f, 10.191f, 12.349f, 10.017f)
                curveTo(12.175f, 9.885f, 11.999f, 9.781f, 11.886f, 9.722f)
                lineTo(11.75f, 9.653f)
                lineTo(11.75f, 8.618f)
                lineTo(12.1f, 8.771f)
                curveTo(12.294f, 8.856f, 12.566f, 9.051f, 12.832f, 9.392f)
                curveTo(12.906f, 9.488f, 12.977f, 9.592f, 13.042f, 9.703f)
                curveTo(13.108f, 9.725f, 13.178f, 9.75f, 13.252f, 9.778f)
                curveTo(13.339f, 9.811f, 13.43f, 9.848f, 13.523f, 9.887f)
                curveTo(13.683f, 9.956f, 13.83f, 10.024f, 13.951f, 10.083f)
                close()
                moveTo(13.951f, 10.083f)
                curveTo(14.013f, 10.113f, 14.069f, 10.141f, 14.115f, 10.165f)
                lineTo(14.123f, 10.169f)
                curveTo(14.061f, 10.146f, 14.004f, 10.118f, 13.951f, 10.083f)
                close()
                moveTo(10.25f, 5.712f)
                lineTo(10.459f, 5.747f)
                lineTo(10.25f, 5.5f)
                lineTo(10.25f, 5.712f)
                close()
                moveTo(10.25f, 12.398f)
                lineTo(10.25f, 12.739f)
                lineTo(10.554f, 12.495f)
                curveTo(10.495f, 12.482f, 10.389f, 12.451f, 10.25f, 12.398f)
                close()
                moveTo(7.958f, 9.703f)
                curveTo(7.941f, 9.733f, 7.924f, 9.764f, 7.907f, 9.795f)
                lineTo(8.057f, 9.673f)
                curveTo(8.025f, 9.682f, 7.992f, 9.692f, 7.958f, 9.703f)
                close()
                moveTo(6.789f, 10.521f)
                lineTo(6.795f, 10.531f)
                curveTo(6.787f, 10.518f, 6.788f, 10.52f, 6.788f, 10.52f)
                curveTo(6.788f, 10.52f, 6.789f, 10.521f, 6.789f, 10.521f)
                close()
                moveTo(7.049f, 10.083f)
                curveTo(6.986f, 10.113f, 6.931f, 10.141f, 6.885f, 10.165f)
                lineTo(6.877f, 10.169f)
                curveTo(6.939f, 10.146f, 6.996f, 10.118f, 7.049f, 10.083f)
                close()
                moveTo(9.499f, 4.75f)
                lineTo(11.495f, 4.75f)
                curveTo(11.417f, 4.636f, 11.377f, 4.555f, 11.366f, 4.473f)
                curveTo(11.354f, 4.374f, 11.371f, 4.297f, 11.409f, 4.24f)
                curveTo(11.22f, 4.12f, 11.122f, 4.023f, 11.05f, 3.836f)
                curveTo(10.998f, 3.702f, 11.042f, 3.589f, 11.127f, 3.524f)
                curveTo(11.095f, 3.464f, 11.071f, 3.413f, 11.048f, 3.35f)
                curveTo(11.034f, 3.311f, 11.021f, 3.271f, 11.01f, 3.229f)
                curveTo(10.98f, 3.118f, 10.968f, 3.049f, 10.941f, 2.85f)
                curveTo(10.92f, 2.695f, 10.905f, 2.628f, 10.881f, 2.58f)
                curveTo(10.771f, 2.36f, 10.677f, 2.282f, 10.46f, 2.247f)
                curveTo(10.2f, 2.205f, 10.163f, 2.218f, 10.083f, 2.38f)
                curveTo(10.028f, 2.488f, 9.971f, 2.513f, 9.845f, 2.545f)
                curveTo(9.887f, 2.534f, 9.629f, 2.592f, 9.563f, 2.614f)
                curveTo(9.502f, 2.635f, 9.457f, 2.656f, 9.425f, 2.68f)
                curveTo(9.536f, 2.679f, 9.658f, 2.707f, 9.787f, 2.768f)
                curveTo(10.219f, 2.971f, 10.161f, 3.432f, 9.786f, 3.943f)
                curveTo(9.828f, 4.027f, 9.822f, 4.129f, 9.772f, 4.215f)
                curveTo(9.682f, 4.371f, 9.583f, 4.478f, 9.451f, 4.556f)
                curveTo(9.473f, 4.596f, 9.488f, 4.639f, 9.496f, 4.69f)
                curveTo(9.499f, 4.71f, 9.5f, 4.73f, 9.499f, 4.75f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFFFFF),
                        1f to Color(0xFFF0F0F0)
                    ),
                    start = Offset(10.5f, 4f),
                    end = Offset(10.5f, 10f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8f, 6.5f)
                lineTo(8f, 4f)
                curveTo(8f, 4f, 8.498f, 4.489f, 9.163f, 4.489f)
                curveTo(9.827f, 4.489f, 10.5f, 4f, 10.5f, 4f)
                curveTo(10.5f, 4f, 11.127f, 4.489f, 11.751f, 4.489f)
                curveTo(12.376f, 4.489f, 13f, 4f, 13f, 4f)
                lineTo(13f, 6.5f)
                curveTo(13f, 9f, 10.5f, 10f, 10.5f, 10f)
                curveTo(10.5f, 10f, 8f, 9f, 8f, 6.5f)
                close()
            }
            group(
                clipPathData = PathData {
                    moveTo(8f, 6.5f)
                    lineTo(8f, 4f)
                    curveTo(8f, 4f, 8.498f, 4.489f, 9.163f, 4.489f)
                    curveTo(9.827f, 4.489f, 10.5f, 4f, 10.5f, 4f)
                    curveTo(10.5f, 4f, 11.127f, 4.489f, 11.751f, 4.489f)
                    curveTo(12.376f, 4.489f, 13f, 4f, 13f, 4f)
                    lineTo(13f, 6.5f)
                    curveTo(13f, 9f, 10.5f, 10f, 10.5f, 10f)
                    curveTo(10.5f, 10f, 8f, 9f, 8f, 6.5f)
                    close()
                }
            ) {
                path(
                    fill = Brush.linearGradient(
                        colorStops = arrayOf(
                            0f to Color(0xFF1E357F),
                            1f to Color(0xFF162966)
                        ),
                        start = Offset(10.5f, 4f),
                        end = Offset(10.5f, 6f)
                    ),
                    strokeLineWidth = 1f,
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(8f, 4f)
                    horizontalLineToRelative(5f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(-5f)
                    close()
                }
            }
            group(
                clipPathData = PathData {
                    moveTo(8f, 6.5f)
                    lineTo(8f, 4f)
                    curveTo(8f, 4f, 8.498f, 4.489f, 9.163f, 4.489f)
                    curveTo(9.827f, 4.489f, 10.5f, 4f, 10.5f, 4f)
                    curveTo(10.5f, 4f, 11.127f, 4.489f, 11.751f, 4.489f)
                    curveTo(12.376f, 4.489f, 13f, 4f, 13f, 4f)
                    lineTo(13f, 6.5f)
                    curveTo(13f, 9f, 10.5f, 10f, 10.5f, 10f)
                    curveTo(10.5f, 10f, 8f, 9f, 8f, 6.5f)
                    close()
                }
            ) {
                path(
                    fill = Brush.linearGradient(
                        colorStops = arrayOf(
                            0f to Color(0xFFBC1443),
                            1f to Color(0xFFA30B35)
                        ),
                        start = Offset(10.5f, 6f),
                        end = Offset(10.5f, 10f)
                    ),
                    strokeLineWidth = 1f,
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(8f, 6f)
                    lineTo(9f, 6f)
                    lineTo(9f, 10f)
                    lineTo(8f, 10f)
                    lineTo(8f, 6f)
                    close()
                    moveTo(10f, 6f)
                    lineTo(11f, 6f)
                    lineTo(11f, 10f)
                    lineTo(10f, 10f)
                    lineTo(10f, 6f)
                    close()
                    moveTo(12f, 6f)
                    lineTo(13f, 6f)
                    lineTo(13f, 10f)
                    lineTo(12f, 10f)
                    lineTo(12f, 6f)
                    close()
                }
            }
        }.build()

        return _VI!!
    }

@Suppress("ObjectPropertyName")
private var _VI: ImageVector? = null
