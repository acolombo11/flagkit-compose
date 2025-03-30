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

val FlagKit.UY: ImageVector
    get() {
        if (_UY != null) {
            return _UY!!
        }
        _UY = ImageVector.Builder(
            name = "UY",
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
                        0f to Color(0xFF0E4DC5),
                        1f to Color(0xFF073DA6)
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
                    start = Offset(10.5f, 0f),
                    end = Offset(10.5f, 14f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10f, 0f)
                lineTo(21f, 0f)
                lineTo(21f, 2f)
                lineTo(10f, 2f)
                lineTo(10f, 0f)
                close()
                moveTo(10f, 4f)
                lineTo(21f, 4f)
                lineTo(21f, 6f)
                lineTo(10f, 6f)
                lineTo(10f, 4f)
                close()
                moveTo(10f, 8f)
                lineTo(21f, 8f)
                lineTo(21f, 10f)
                lineTo(10f, 10f)
                lineTo(10f, 8f)
                close()
                moveTo(0f, 12f)
                lineTo(21f, 12f)
                lineTo(21f, 14f)
                lineTo(0f, 14f)
                lineTo(0f, 12f)
                close()
                moveTo(0f, 0f)
                lineTo(10f, 0f)
                lineTo(10f, 10f)
                lineTo(0f, 10f)
                lineTo(0f, 0f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFED443),
                        1f to Color(0xFFFCD036)
                    ),
                    start = Offset(5f, 2.138f),
                    end = Offset(5f, 7.987f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5f, 6.991f)
                lineTo(4.332f, 7.987f)
                lineTo(4.163f, 6.8f)
                lineTo(3.13f, 7.408f)
                lineTo(3.492f, 6.265f)
                lineTo(2.297f, 6.364f)
                lineTo(3.12f, 5.492f)
                lineTo(2f, 5.063f)
                lineTo(3.12f, 4.634f)
                lineTo(2.297f, 3.761f)
                lineTo(3.492f, 3.86f)
                lineTo(3.13f, 2.717f)
                lineTo(4.163f, 3.325f)
                lineTo(4.332f, 2.138f)
                lineTo(5f, 3.134f)
                lineTo(5.668f, 2.138f)
                lineTo(5.837f, 3.325f)
                lineTo(6.87f, 2.717f)
                lineTo(6.508f, 3.86f)
                lineTo(7.703f, 3.761f)
                lineTo(6.88f, 4.634f)
                lineTo(8f, 5.063f)
                lineTo(6.88f, 5.492f)
                lineTo(7.703f, 6.364f)
                lineTo(6.508f, 6.265f)
                lineTo(6.87f, 7.408f)
                lineTo(5.837f, 6.8f)
                lineTo(5.668f, 7.987f)
                lineTo(5f, 6.991f)
                close()
                moveTo(5f, 6.972f)
                curveTo(6.054f, 6.972f, 6.909f, 6.117f, 6.909f, 5.063f)
                curveTo(6.909f, 4.008f, 6.054f, 3.154f, 5f, 3.154f)
                curveTo(3.946f, 3.154f, 3.091f, 4.008f, 3.091f, 5.063f)
                curveTo(3.091f, 6.117f, 3.946f, 6.972f, 5f, 6.972f)
                close()
                moveTo(5f, 6.5f)
                curveTo(4.172f, 6.5f, 3.5f, 5.828f, 3.5f, 5f)
                curveTo(3.5f, 4.172f, 4.172f, 3.5f, 5f, 3.5f)
                curveTo(5.828f, 3.5f, 6.5f, 4.172f, 6.5f, 5f)
                curveTo(6.5f, 5.828f, 5.828f, 6.5f, 5f, 6.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFC6A326)),
                strokeLineWidth = 1f
            ) {
                moveTo(4.125f, 5f)
                curveTo(4.125f, 4.931f, 4.181f, 4.875f, 4.25f, 4.875f)
                curveTo(4.319f, 4.875f, 4.375f, 4.931f, 4.375f, 5f)
                curveTo(4.375f, 5.106f, 4.401f, 5.208f, 4.451f, 5.299f)
                curveTo(4.56f, 5.499f, 4.769f, 5.625f, 5f, 5.625f)
                curveTo(5.243f, 5.625f, 5.461f, 5.485f, 5.564f, 5.27f)
                curveTo(5.583f, 5.232f, 5.583f, 5.232f, 5.602f, 5.199f)
                curveTo(5.609f, 5.188f, 5.609f, 5.188f, 5.616f, 5.177f)
                curveTo(5.664f, 5.096f, 5.678f, 5.058f, 5.678f, 5f)
                curveTo(5.678f, 4.931f, 5.734f, 4.875f, 5.803f, 4.875f)
                curveTo(5.872f, 4.875f, 5.928f, 4.931f, 5.928f, 5f)
                curveTo(5.928f, 5.114f, 5.899f, 5.189f, 5.831f, 5.304f)
                curveTo(5.824f, 5.316f, 5.824f, 5.316f, 5.818f, 5.326f)
                curveTo(5.802f, 5.354f, 5.802f, 5.354f, 5.79f, 5.378f)
                curveTo(5.645f, 5.679f, 5.34f, 5.875f, 5f, 5.875f)
                curveTo(4.677f, 5.875f, 4.384f, 5.698f, 4.232f, 5.419f)
                curveTo(4.162f, 5.292f, 4.125f, 5.148f, 4.125f, 5f)
                close()
                moveTo(5.5f, 4.75f)
                curveTo(5.362f, 4.75f, 5.25f, 4.638f, 5.25f, 4.5f)
                curveTo(5.25f, 4.362f, 5.362f, 4.25f, 5.5f, 4.25f)
                curveTo(5.638f, 4.25f, 5.75f, 4.362f, 5.75f, 4.5f)
                curveTo(5.75f, 4.638f, 5.638f, 4.75f, 5.5f, 4.75f)
                close()
                moveTo(4.5f, 4.75f)
                curveTo(4.362f, 4.75f, 4.25f, 4.638f, 4.25f, 4.5f)
                curveTo(4.25f, 4.362f, 4.362f, 4.25f, 4.5f, 4.25f)
                curveTo(4.638f, 4.25f, 4.75f, 4.362f, 4.75f, 4.5f)
                curveTo(4.75f, 4.638f, 4.638f, 4.75f, 4.5f, 4.75f)
                close()
            }
        }.build()

        return _UY!!
    }

@Suppress("ObjectPropertyName")
private var _UY: ImageVector? = null
