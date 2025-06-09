package flagkit.flags

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import flagkit.FlagKit

val FlagKit.GB_WLS: ImageVector
    get() {
        if (_GB_WLS != null) {
            return _GB_WLS!!
        }
        _GB_WLS = ImageVector.Builder(
            name = "GB_WLS",
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
                        0f to Color(0xFF3ACC55),
                        1f to Color(0xFF28A940)
                    ),
                    start = Offset(10.5f, 7f),
                    end = Offset(10.5f, 15f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 7f)
                horizontalLineToRelative(21f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-21f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFFFFF),
                        1f to Color(0xFFF0F0F0)
                    ),
                    start = Offset(10.5f, 0f),
                    end = Offset(10.5f, 7f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(21f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-21f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFE91C44),
                        1f to Color(0xFFD20F35)
                    ),
                    start = Offset(10.231f, 1.887f),
                    end = Offset(10.231f, 12.068f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.066f, 11.396f)
                lineTo(9.302f, 11.185f)
                lineTo(8.345f, 10.734f)
                lineTo(9f, 10.367f)
                curveTo(9f, 10.367f, 10.104f, 11.299f, 10.104f, 11f)
                curveTo(10.104f, 10.679f, 11.142f, 10.819f, 11.1f, 10.367f)
                curveTo(11.043f, 9.747f, 9.951f, 10.321f, 9.756f, 9.547f)
                curveTo(9.647f, 9.115f, 9.302f, 9.17f, 9.302f, 9.17f)
                lineTo(8.203f, 9.547f)
                lineTo(7.655f, 10.367f)
                lineTo(7.383f, 9.547f)
                curveTo(7.383f, 9.547f, 6.741f, 10.069f, 6.528f, 10.367f)
                curveTo(6.3f, 10.685f, 6.058f, 11.396f, 6.058f, 11.396f)
                lineTo(7.18f, 11.865f)
                lineTo(5.544f, 11.576f)
                lineTo(4.35f, 11.865f)
                lineTo(3.618f, 12.068f)
                lineTo(3.94f, 11.73f)
                lineTo(3.283f, 11.396f)
                lineTo(3.94f, 11f)
                lineTo(3.618f, 10.734f)
                lineTo(5.036f, 11f)
                curveTo(5.036f, 11f, 5.554f, 10.948f, 5.75f, 10.734f)
                curveTo(5.997f, 10.464f, 6.191f, 9.547f, 6.191f, 9.547f)
                lineTo(5.544f, 9.17f)
                lineTo(5.036f, 10.091f)
                curveTo(5.036f, 10.091f, 4.685f, 9.22f, 4.35f, 8.731f)
                curveTo(4.101f, 8.367f, 3.283f, 7.534f, 3.283f, 7.534f)
                lineTo(2.229f, 8.089f)
                lineTo(2.817f, 6.916f)
                curveTo(2.817f, 6.916f, 3.283f, 6.509f, 2.987f, 6.091f)
                curveTo(2.691f, 5.673f, 2.442f, 4.738f, 2.442f, 4.738f)
                curveTo(2.442f, 4.738f, 3.06f, 5.809f, 3.283f, 5.726f)
                curveTo(3.6f, 5.609f, 2.889f, 4.632f, 3.283f, 4.458f)
                curveTo(3.567f, 4.332f, 3.618f, 5.578f, 3.618f, 5.578f)
                lineTo(3.94f, 4.967f)
                lineTo(3.94f, 5.726f)
                curveTo(3.94f, 5.726f, 3.753f, 6.634f, 4.07f, 7.173f)
                curveTo(4.388f, 7.712f, 5.331f, 8.089f, 5.331f, 8.089f)
                curveTo(5.331f, 8.089f, 5.086f, 7.548f, 5.331f, 6.509f)
                curveTo(5.497f, 5.806f, 6.087f, 4.606f, 6.365f, 4.222f)
                curveTo(6.511f, 4.018f, 5.193f, 4.967f, 5.193f, 4.967f)
                lineTo(5.193f, 4.222f)
                lineTo(3.94f, 4.093f)
                lineTo(3.618f, 4.458f)
                lineTo(2.817f, 3.144f)
                lineTo(3.813f, 3.645f)
                lineTo(5.331f, 3.645f)
                lineTo(5.036f, 3.283f)
                lineTo(3.813f, 3.283f)
                curveTo(3.813f, 3.283f, 4.07f, 2.754f, 5.331f, 2.754f)
                lineTo(5.927f, 2.349f)
                curveTo(5.927f, 2.349f, 6.742f, 2.372f, 7.201f, 2.389f)
                curveTo(7.609f, 2.405f, 8.345f, 1.887f, 8.345f, 1.887f)
                lineTo(8.552f, 2.389f)
                lineTo(8.066f, 3.144f)
                lineTo(8.552f, 3.645f)
                lineTo(8.345f, 3.954f)
                lineTo(8.702f, 4.458f)
                lineTo(8.066f, 4.458f)
                lineTo(8.552f, 5.241f)
                lineTo(8.066f, 4.967f)
                lineTo(8.345f, 5.726f)
                lineTo(8.066f, 6.509f)
                lineTo(9.302f, 6.091f)
                curveTo(9.302f, 6.091f, 9.302f, 4.967f, 9.756f, 4.458f)
                curveTo(11.142f, 3.036f, 13.401f, 1.887f, 13.401f, 1.887f)
                curveTo(13.401f, 1.887f, 13.282f, 2.919f, 13.616f, 3f)
                curveTo(14.101f, 3.118f, 16.221f, 2.15f, 16.221f, 2.15f)
                curveTo(16.221f, 2.15f, 14.947f, 3.52f, 15.208f, 3.645f)
                curveTo(15.349f, 3.712f, 15.582f, 3.954f, 15.582f, 3.954f)
                curveTo(15.582f, 3.954f, 14.481f, 4.854f, 14.297f, 5.241f)
                curveTo(14.113f, 5.628f, 14.567f, 6.091f, 14.567f, 6.091f)
                curveTo(14.567f, 6.091f, 13.616f, 6.091f, 13.142f, 6.509f)
                curveTo(14.567f, 6.509f, 15.732f, 7.184f, 16.422f, 6.686f)
                curveTo(16.885f, 6.352f, 14.767f, 6.56f, 15.045f, 5.726f)
                curveTo(15.148f, 5.417f, 15.418f, 5.058f, 16.035f, 4.967f)
                curveTo(16.652f, 4.875f, 16.87f, 5.241f, 16.87f, 5.241f)
                lineTo(17.203f, 4.738f)
                lineTo(16.221f, 4.738f)
                lineTo(18f, 3f)
                lineTo(18.232f, 5.241f)
                lineTo(17.63f, 4.738f)
                curveTo(17.63f, 4.738f, 17.36f, 5.578f, 17.36f, 5.578f)
                curveTo(18f, 7.534f, 15.045f, 7.95f, 15.045f, 7.95f)
                lineTo(16.87f, 9.17f)
                lineTo(16.221f, 9.356f)
                lineTo(16.035f, 11.185f)
                lineTo(16.87f, 11.865f)
                lineTo(15.772f, 11.576f)
                lineTo(13.616f, 12.068f)
                lineTo(14.045f, 11.396f)
                lineTo(13.142f, 11.576f)
                lineTo(13.745f, 11f)
                lineTo(13.142f, 10.734f)
                lineTo(13.913f, 10.52f)
                lineTo(14.884f, 11.185f)
                curveTo(14.884f, 11.185f, 15.364f, 10.563f, 15.418f, 10.233f)
                curveTo(15.472f, 9.892f, 15.208f, 9.17f, 15.208f, 9.17f)
                curveTo(15.208f, 9.17f, 13.777f, 9.14f, 13.273f, 9.015f)
                curveTo(12.768f, 8.89f, 12.476f, 8.493f, 12.476f, 8.493f)
                lineTo(11.903f, 9.17f)
                curveTo(11.903f, 9.17f, 13.9f, 9.918f, 13.401f, 10.233f)
                curveTo(13.285f, 10.306f, 12.714f, 10.091f, 12.714f, 10.091f)
                curveTo(12.714f, 10.091f, 11.73f, 11.242f, 11.1f, 11.396f)
                curveTo(10.814f, 11.466f, 11.903f, 11.865f, 11.903f, 11.865f)
                curveTo(11.903f, 11.865f, 10.973f, 11.717f, 10.5f, 11.576f)
                curveTo(10.005f, 11.429f, 8.552f, 11.865f, 8.552f, 11.865f)
                lineTo(8.066f, 11.396f)
                close()
                moveTo(16.087f, 6.053f)
                curveTo(16.225f, 6.053f, 16.337f, 5.941f, 16.337f, 5.803f)
                curveTo(16.337f, 5.665f, 16.225f, 5.553f, 16.087f, 5.553f)
                curveTo(15.948f, 5.553f, 15.837f, 5.665f, 15.837f, 5.803f)
                curveTo(15.837f, 5.941f, 15.948f, 6.053f, 16.087f, 6.053f)
                close()
            }
        }.build()

        return _GB_WLS!!
    }

@Suppress("ObjectPropertyName")
private var _GB_WLS: ImageVector? = null
