package flagkit.flags

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import flagkit.FlagKit

val FlagKit.HK: ImageVector
    get() {
        if (_HK != null) {
            return _HK!!
        }
        _HK = ImageVector.Builder(
            name = "HK",
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
                        0f to Color(0xFFF0371D),
                        1f to Color(0xFFDE290F)
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
                    start = Offset(10.67f, 3.2f),
                    end = Offset(10.67f, 11.816f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 7.19f)
                curveTo(11.202f, 6.69f, 11f, 7.599f, 11f, 7.19f)
                curveTo(11f, 6.362f, 11.895f, 5.69f, 13f, 5.69f)
                curveTo(14.105f, 5.69f, 15f, 6.362f, 15f, 7.19f)
                curveTo(14.051f, 7.19f, 13.956f, 7.69f, 13.5f, 7.69f)
                curveTo(12.94f, 7.69f, 12.798f, 7.69f, 12f, 7.19f)
                close()
                moveTo(13.25f, 7f)
                curveTo(13.388f, 7f, 13.5f, 6.888f, 13.5f, 6.75f)
                curveTo(13.5f, 6.612f, 13.388f, 6.5f, 13.25f, 6.5f)
                curveTo(13.112f, 6.5f, 13f, 6.612f, 13f, 6.75f)
                curveTo(13f, 6.888f, 13.112f, 7f, 13.25f, 7f)
                close()
                moveTo(11.439f, 8.962f)
                curveTo(11.668f, 8.049f, 10.742f, 8.138f, 11.13f, 8.011f)
                curveTo(11.918f, 7.755f, 12.833f, 8.399f, 13.175f, 9.45f)
                curveTo(13.516f, 10.5f, 13.154f, 11.56f, 12.366f, 11.816f)
                curveTo(12.073f, 10.913f, 11.568f, 10.978f, 11.427f, 10.544f)
                curveTo(11.254f, 10.011f, 11.21f, 9.876f, 11.439f, 8.962f)
                close()
                moveTo(12.006f, 10.092f)
                curveTo(12.049f, 10.224f, 12.19f, 10.296f, 12.321f, 10.253f)
                curveTo(12.453f, 10.21f, 12.525f, 10.069f, 12.482f, 9.938f)
                curveTo(12.439f, 9.807f, 12.298f, 9.735f, 12.167f, 9.777f)
                curveTo(12.036f, 9.82f, 11.964f, 9.961f, 12.006f, 10.092f)
                close()
                moveTo(9.58f, 8.977f)
                curveTo(10.52f, 8.912f, 10.149f, 8.058f, 10.389f, 8.389f)
                curveTo(10.876f, 9.059f, 10.547f, 10.129f, 9.653f, 10.778f)
                curveTo(8.759f, 11.427f, 7.64f, 11.41f, 7.153f, 10.74f)
                curveTo(7.921f, 10.182f, 7.704f, 9.722f, 8.073f, 9.454f)
                curveTo(8.526f, 9.125f, 8.641f, 9.041f, 9.58f, 8.977f)
                close()
                moveTo(8.681f, 9.865f)
                curveTo(8.569f, 9.946f, 8.545f, 10.103f, 8.626f, 10.215f)
                curveTo(8.707f, 10.326f, 8.863f, 10.351f, 8.975f, 10.27f)
                curveTo(9.087f, 10.189f, 9.111f, 10.032f, 9.03f, 9.921f)
                curveTo(8.949f, 9.809f, 8.793f, 9.784f, 8.681f, 9.865f)
                close()
                moveTo(8.993f, 7.213f)
                curveTo(9.344f, 8.087f, 10.042f, 7.471f, 9.802f, 7.801f)
                curveTo(9.315f, 8.471f, 8.196f, 8.488f, 7.302f, 7.839f)
                curveTo(6.408f, 7.19f, 6.079f, 6.12f, 6.566f, 5.45f)
                curveTo(7.333f, 6.008f, 7.704f, 5.659f, 8.073f, 5.927f)
                curveTo(8.526f, 6.256f, 8.641f, 6.34f, 8.993f, 7.213f)
                close()
                moveTo(7.869f, 6.633f)
                curveTo(7.758f, 6.551f, 7.601f, 6.576f, 7.52f, 6.688f)
                curveTo(7.439f, 6.8f, 7.464f, 6.956f, 7.576f, 7.037f)
                curveTo(7.687f, 7.118f, 7.844f, 7.093f, 7.925f, 6.982f)
                curveTo(8.006f, 6.87f, 7.981f, 6.714f, 7.869f, 6.633f)
                close()
                moveTo(10.488f, 6.109f)
                curveTo(9.766f, 6.714f, 10.567f, 7.187f, 10.179f, 7.06f)
                curveTo(9.391f, 6.804f, 9.029f, 5.745f, 9.37f, 4.695f)
                curveTo(9.712f, 3.644f, 10.627f, 3f, 11.415f, 3.256f)
                curveTo(11.122f, 4.159f, 11.568f, 4.403f, 11.427f, 4.837f)
                curveTo(11.254f, 5.37f, 11.21f, 5.505f, 10.488f, 6.109f)
                close()
                moveTo(10.693f, 4.862f)
                curveTo(10.736f, 4.73f, 10.664f, 4.589f, 10.533f, 4.547f)
                curveTo(10.401f, 4.504f, 10.26f, 4.576f, 10.218f, 4.707f)
                curveTo(10.175f, 4.838f, 10.247f, 4.979f, 10.378f, 5.022f)
                curveTo(10.51f, 5.065f, 10.651f, 4.993f, 10.693f, 4.862f)
                close()
            }
        }.build()

        return _HK!!
    }

@Suppress("ObjectPropertyName")
private var _HK: ImageVector? = null
