package flagkit.flags

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import flagkit.FlagKit

val FlagKit.LK: ImageVector
    get() {
        if (_LK != null) {
            return _LK!!
        }
        _LK = ImageVector.Builder(
            name = "LK",
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
                        0f to Color(0xFFFFBF19),
                        1f to Color(0xFFFFB800)
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
                        0f to Color(0xFFA52531),
                        1f to Color(0xFF8E1F29)
                    ),
                    start = Offset(14f, 1f),
                    end = Offset(14f, 14f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8f, 1f)
                lineTo(19.249f, 1f)
                curveTo(19.664f, 1f, 20f, 1.334f, 20f, 1.755f)
                lineTo(20f, 13.245f)
                curveTo(20f, 13.662f, 19.667f, 14f, 19.249f, 14f)
                lineTo(8f, 14f)
                lineTo(8f, 1f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF03664F),
                        1f to Color(0xFF005642)
                    ),
                    start = Offset(2.5f, 1f),
                    end = Offset(2.5f, 14f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(1f, 1.755f)
                curveTo(1f, 1.338f, 1.344f, 1f, 1.757f, 1f)
                lineTo(4f, 1f)
                lineTo(4f, 14f)
                lineTo(1.757f, 14f)
                curveTo(1.339f, 14f, 1f, 13.666f, 1f, 13.245f)
                lineTo(1f, 1.755f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFF6816),
                        1f to Color(0xFFFF5B01)
                    ),
                    start = Offset(5.5f, 1f),
                    end = Offset(5.5f, 14f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4.5f, 1f)
                lineTo(6.5f, 1f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 1.5f)
                lineTo(7f, 13.5f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.5f, 14f)
                lineTo(4.5f, 14f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 13.5f)
                lineTo(4f, 1.5f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.5f, 1f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFBF18),
                        1f to Color(0xFFFFB800)
                    ),
                    start = Offset(14f, 2f),
                    end = Offset(14f, 13f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9.5f, 3f)
                curveTo(9.224f, 3f, 9f, 2.776f, 9f, 2.5f)
                lineTo(9f, 2f)
                lineTo(9.5f, 2f)
                curveTo(9.776f, 2f, 10f, 2.224f, 10f, 2.5f)
                curveTo(10f, 2.776f, 9.776f, 3f, 9.5f, 3f)
                close()
                moveTo(18.5f, 3f)
                curveTo(18.224f, 3f, 18f, 2.776f, 18f, 2.5f)
                curveTo(18f, 2.224f, 18.224f, 2f, 18.5f, 2f)
                lineTo(19f, 2f)
                lineTo(19f, 2.5f)
                curveTo(19f, 2.776f, 18.776f, 3f, 18.5f, 3f)
                close()
                moveTo(18.5f, 12f)
                curveTo(18.776f, 12f, 19f, 12.224f, 19f, 12.5f)
                lineTo(19f, 13f)
                lineTo(18.5f, 13f)
                curveTo(18.224f, 13f, 18f, 12.776f, 18f, 12.5f)
                curveTo(18f, 12.224f, 18.224f, 12f, 18.5f, 12f)
                close()
                moveTo(9.5f, 12f)
                curveTo(9.776f, 12f, 10f, 12.224f, 10f, 12.5f)
                curveTo(10f, 12.776f, 9.776f, 13f, 9.5f, 13f)
                lineTo(9f, 13f)
                lineTo(9f, 12.5f)
                curveTo(9f, 12.224f, 9.224f, 12f, 9.5f, 12f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFBF18),
                        1f to Color(0xFFFFB800)
                    ),
                    start = Offset(13.772f, 4.19f),
                    end = Offset(13.772f, 11f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 9.5f)
                curveTo(12f, 9.224f, 11.773f, 9f, 11.5f, 9f)
                lineTo(12f, 9f)
                curveTo(11.724f, 9f, 11.291f, 8.924f, 11.025f, 8.815f)
                curveTo(11.025f, 8.815f, 10f, 8.5f, 10f, 8f)
                curveTo(10f, 7.5f, 10.203f, 7.386f, 10.203f, 7.386f)
                curveTo(10.367f, 7.173f, 10.418f, 6.798f, 10.315f, 6.525f)
                curveTo(10.315f, 6.525f, 9.9f, 5.6f, 10f, 5f)
                curveTo(10.1f, 4.4f, 10.571f, 4.251f, 10.571f, 4.251f)
                curveTo(10.808f, 4.112f, 11f, 4.216f, 11f, 4.495f)
                lineTo(11f, 6.505f)
                curveTo(11f, 6.778f, 11.193f, 7.096f, 11.453f, 7.227f)
                lineTo(11.547f, 7.273f)
                curveTo(11.797f, 7.399f, 12.158f, 7.342f, 12.353f, 7.147f)
                lineTo(12.147f, 7.353f)
                curveTo(12.342f, 7.158f, 12.307f, 6.904f, 12.047f, 6.773f)
                lineTo(11.5f, 6.5f)
                lineTo(11.5f, 6f)
                lineTo(12f, 6f)
                curveTo(12.276f, 6f, 12.307f, 5.904f, 12.047f, 5.773f)
                lineTo(11.5f, 5.5f)
                lineTo(11.5f, 5f)
                lineTo(12f, 5f)
                curveTo(12.276f, 5f, 12.658f, 4.842f, 12.853f, 4.647f)
                lineTo(12.647f, 4.853f)
                curveTo(12.842f, 4.658f, 13.232f, 4.5f, 13.5f, 4.5f)
                lineTo(13.5f, 4.5f)
                curveTo(13.776f, 4.5f, 14.096f, 4.693f, 14.227f, 4.953f)
                lineTo(14.273f, 5.047f)
                curveTo(14.399f, 5.297f, 14.43f, 5.709f, 14.342f, 5.975f)
                lineTo(14.158f, 6.525f)
                curveTo(14.071f, 6.788f, 14.231f, 7f, 14.506f, 7f)
                lineTo(15.994f, 7f)
                curveTo(16.273f, 7f, 16.658f, 6.842f, 16.853f, 6.647f)
                lineTo(16.647f, 6.853f)
                curveTo(16.842f, 6.658f, 16.807f, 6.404f, 16.547f, 6.273f)
                lineTo(16.453f, 6.227f)
                curveTo(16.203f, 6.101f, 15.768f, 6f, 15.5f, 6f)
                lineTo(15.5f, 6f)
                curveTo(15.224f, 6f, 15f, 5.768f, 15f, 5.5f)
                lineTo(15f, 5.5f)
                curveTo(15f, 5.224f, 15.158f, 4.842f, 15.353f, 4.647f)
                lineTo(15.5f, 4.5f)
                lineTo(15.5f, 5f)
                curveTo(15.5f, 5.276f, 15.727f, 5.5f, 16f, 5.5f)
                lineTo(15.5f, 5.5f)
                curveTo(15.776f, 5.5f, 16.232f, 5.5f, 16.5f, 5.5f)
                lineTo(16.5f, 5.5f)
                curveTo(16.776f, 5.5f, 17.096f, 5.693f, 17.227f, 5.953f)
                lineTo(17.273f, 6.047f)
                curveTo(17.399f, 6.297f, 17.52f, 6.72f, 17.537f, 6.994f)
                curveTo(17.537f, 6.994f, 17.606f, 7.47f, 17.5f, 8f)
                curveTo(17.394f, 8.53f, 17.274f, 8.589f, 17.274f, 8.589f)
                curveTo(17.123f, 8.816f, 17f, 9.214f, 17f, 9.505f)
                lineTo(17f, 10.495f)
                curveTo(17f, 10.774f, 16.768f, 11f, 16.5f, 11f)
                lineTo(16.5f, 11f)
                curveTo(16.224f, 11f, 16.096f, 10.807f, 16.227f, 10.547f)
                lineTo(16.273f, 10.453f)
                curveTo(16.399f, 10.203f, 16.404f, 9.807f, 16.273f, 9.547f)
                lineTo(16.227f, 9.453f)
                curveTo(16.101f, 9.203f, 16f, 9.232f, 16f, 9.5f)
                lineTo(16f, 9.5f)
                curveTo(16f, 9.776f, 15.904f, 10.193f, 15.773f, 10.453f)
                lineTo(15.727f, 10.547f)
                curveTo(15.601f, 10.797f, 15.268f, 11f, 15f, 11f)
                lineTo(15f, 11f)
                curveTo(14.724f, 11f, 14.596f, 10.807f, 14.727f, 10.547f)
                lineTo(14.773f, 10.453f)
                curveTo(14.899f, 10.203f, 15f, 9.768f, 15f, 9.5f)
                lineTo(15f, 9.5f)
                curveTo(15f, 9.224f, 14.786f, 9f, 14.495f, 9f)
                lineTo(13.505f, 9f)
                curveTo(13.226f, 9f, 13f, 9.232f, 13f, 9.5f)
                lineTo(13f, 9.5f)
                curveTo(13f, 9.776f, 12.904f, 10.193f, 12.773f, 10.453f)
                lineTo(12.727f, 10.547f)
                curveTo(12.601f, 10.797f, 12.268f, 11f, 12f, 11f)
                lineTo(12f, 11f)
                curveTo(11.724f, 11f, 11.596f, 10.807f, 11.727f, 10.547f)
                lineTo(11.773f, 10.453f)
                curveTo(11.899f, 10.203f, 12f, 9.768f, 12f, 9.5f)
                lineTo(12f, 9.5f)
                close()
            }
        }.build()

        return _LK!!
    }

@Suppress("ObjectPropertyName")
private var _LK: ImageVector? = null
