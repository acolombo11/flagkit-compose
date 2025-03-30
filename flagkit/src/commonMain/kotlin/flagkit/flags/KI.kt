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

val FlagKit.KI: ImageVector
    get() {
        if (_KI != null) {
            return _KI!!
        }
        _KI = ImageVector.Builder(
            name = "KI",
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
                        0f to Color(0xFFE62B3F),
                        1f to Color(0xFFCA1A2C)
                    ),
                    start = Offset(10.5f, 0f),
                    end = Offset(10.5f, 8f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(21f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-21f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFDA57),
                        1f to Color(0xFFFCD036)
                    ),
                    start = Offset(10.5f, 6f),
                    end = Offset(10.5f, 11f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.5f, 8.5f)
                moveToRelative(-2.5f, 0f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 5f, 0f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -5f, 0f)
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFDA57),
                        1f to Color(0xFFFCD036)
                    ),
                    start = Offset(10.5f, 3.138f),
                    end = Offset(10.5f, 13.862f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.5f, 12.035f)
                lineTo(9.276f, 13.862f)
                lineTo(8.966f, 11.685f)
                lineTo(7.071f, 12.8f)
                lineTo(7.736f, 10.704f)
                lineTo(5.545f, 10.886f)
                lineTo(7.053f, 9.287f)
                lineTo(5f, 8.5f)
                lineTo(7.053f, 7.713f)
                lineTo(5.545f, 6.114f)
                lineTo(7.736f, 6.296f)
                lineTo(7.071f, 4.2f)
                lineTo(8.966f, 5.315f)
                lineTo(9.276f, 3.138f)
                lineTo(10.5f, 4.965f)
                lineTo(11.724f, 3.138f)
                lineTo(12.034f, 5.315f)
                lineTo(13.929f, 4.2f)
                lineTo(13.264f, 6.296f)
                lineTo(15.455f, 6.114f)
                lineTo(13.947f, 7.713f)
                lineTo(16f, 8.5f)
                lineTo(13.947f, 9.287f)
                lineTo(15.455f, 10.886f)
                lineTo(13.264f, 10.704f)
                lineTo(13.929f, 12.8f)
                lineTo(12.034f, 11.685f)
                lineTo(11.724f, 13.862f)
                lineTo(10.5f, 12.035f)
                close()
                moveTo(10.5f, 12f)
                curveTo(12.433f, 12f, 14f, 10.433f, 14f, 8.5f)
                curveTo(14f, 6.567f, 12.433f, 5f, 10.5f, 5f)
                curveTo(8.567f, 5f, 7f, 6.567f, 7f, 8.5f)
                curveTo(7f, 10.433f, 8.567f, 12f, 10.5f, 12f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFDA57),
                        1f to Color(0xFFFCD036)
                    ),
                    start = Offset(11.055f, 1f),
                    end = Offset(11.055f, 3f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.86f, 2.403f)
                lineTo(8.813f, 2.169f)
                lineTo(9.795f, 2.005f)
                curveTo(9.795f, 2.005f, 8.477f, 1.694f, 8.042f, 1.538f)
                curveTo(7.417f, 1.314f, 7.504f, 1.14f, 7.504f, 1.14f)
                curveTo(7.504f, 1.14f, 9.289f, 1.491f, 10.169f, 1.491f)
                curveTo(10.357f, 1.491f, 10.73f, 1.958f, 10.73f, 1.958f)
                curveTo(10.73f, 1.958f, 11.379f, 1.303f, 11.689f, 1.281f)
                curveTo(13.095f, 1.178f, 14.611f, 1f, 14.611f, 1f)
                curveTo(14.611f, 1f, 14.172f, 1.294f, 13.909f, 1.374f)
                curveTo(13.198f, 1.59f, 11.689f, 1.888f, 11.689f, 1.888f)
                lineTo(11.478f, 2.216f)
                lineTo(12.974f, 2.216f)
                lineTo(12.343f, 2.403f)
                lineTo(12.67f, 2.707f)
                curveTo(12.67f, 2.707f, 12.327f, 2.529f, 11.876f, 2.613f)
                curveTo(11.566f, 2.671f, 11.203f, 2.878f, 10.87f, 2.964f)
                curveTo(10.052f, 3.174f, 9.561f, 2.403f, 9.561f, 2.403f)
                lineTo(8.86f, 2.403f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF0752A2),
                        1f to Color(0xFF034285)
                    ),
                    start = Offset(10.5f, 8f),
                    end = Offset(10.5f, 15f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 8f)
                horizontalLineToRelative(21f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-21f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
                strokeLineWidth = 1f
            ) {
                moveTo(23.322f, 12.933f)
                lineTo(23.796f, 13.092f)
                lineTo(23.48f, 14.04f)
                lineTo(23.006f, 13.882f)
                curveTo(22.898f, 13.846f, 22.898f, 13.846f, 22.537f, 13.726f)
                lineTo(20.474f, 13.038f)
                curveTo(20.32f, 12.987f, 20.006f, 12.987f, 19.853f, 13.038f)
                lineTo(17.791f, 13.726f)
                curveTo(17.431f, 13.846f, 16.894f, 13.845f, 16.537f, 13.726f)
                lineTo(14.474f, 13.038f)
                curveTo(14.32f, 12.987f, 14.006f, 12.987f, 13.853f, 13.038f)
                lineTo(11.791f, 13.726f)
                curveTo(11.431f, 13.846f, 10.894f, 13.845f, 10.537f, 13.726f)
                lineTo(8.474f, 13.038f)
                curveTo(8.32f, 12.987f, 8.006f, 12.987f, 7.853f, 13.038f)
                lineTo(5.791f, 13.726f)
                curveTo(5.431f, 13.846f, 4.894f, 13.845f, 4.537f, 13.726f)
                lineTo(2.474f, 13.038f)
                curveTo(2.32f, 12.987f, 2.006f, 12.987f, 1.853f, 13.038f)
                lineTo(-0.209f, 13.726f)
                lineTo(-0.684f, 13.884f)
                lineTo(-1f, 12.935f)
                lineTo(-0.526f, 12.777f)
                lineTo(1.537f, 12.09f)
                curveTo(1.894f, 11.971f, 2.431f, 11.97f, 2.791f, 12.09f)
                lineTo(4.853f, 12.777f)
                curveTo(5.006f, 12.828f, 5.32f, 12.828f, 5.474f, 12.777f)
                lineTo(7.537f, 12.09f)
                curveTo(7.894f, 11.971f, 8.431f, 11.97f, 8.791f, 12.09f)
                lineTo(10.853f, 12.777f)
                curveTo(11.006f, 12.828f, 11.32f, 12.828f, 11.474f, 12.777f)
                lineTo(13.537f, 12.09f)
                curveTo(13.894f, 11.971f, 14.431f, 11.97f, 14.791f, 12.09f)
                lineTo(16.853f, 12.777f)
                curveTo(17.006f, 12.828f, 17.32f, 12.828f, 17.474f, 12.777f)
                lineTo(19.537f, 12.09f)
                curveTo(19.894f, 11.971f, 20.431f, 11.97f, 20.791f, 12.09f)
                lineTo(22.853f, 12.777f)
                curveTo(23.214f, 12.897f, 23.214f, 12.897f, 23.322f, 12.933f)
                close()
                moveTo(23.322f, 10.433f)
                lineTo(23.796f, 10.592f)
                lineTo(23.48f, 11.54f)
                lineTo(23.006f, 11.382f)
                curveTo(22.898f, 11.346f, 22.898f, 11.346f, 22.537f, 11.226f)
                lineTo(20.474f, 10.538f)
                curveTo(20.32f, 10.487f, 20.006f, 10.487f, 19.853f, 10.538f)
                lineTo(17.791f, 11.226f)
                curveTo(17.431f, 11.346f, 16.894f, 11.345f, 16.537f, 11.226f)
                lineTo(14.474f, 10.538f)
                curveTo(14.32f, 10.487f, 14.006f, 10.487f, 13.853f, 10.538f)
                lineTo(11.791f, 11.226f)
                curveTo(11.431f, 11.346f, 10.894f, 11.345f, 10.537f, 11.226f)
                lineTo(8.474f, 10.538f)
                curveTo(8.32f, 10.487f, 8.006f, 10.487f, 7.853f, 10.538f)
                lineTo(5.791f, 11.226f)
                curveTo(5.431f, 11.346f, 4.894f, 11.345f, 4.537f, 11.226f)
                lineTo(2.474f, 10.538f)
                curveTo(2.32f, 10.487f, 2.006f, 10.487f, 1.853f, 10.538f)
                lineTo(-0.209f, 11.226f)
                lineTo(-0.684f, 11.384f)
                lineTo(-1f, 10.435f)
                lineTo(-0.526f, 10.277f)
                lineTo(1.537f, 9.59f)
                curveTo(1.894f, 9.471f, 2.431f, 9.47f, 2.791f, 9.59f)
                lineTo(4.853f, 10.277f)
                curveTo(5.006f, 10.328f, 5.32f, 10.328f, 5.474f, 10.277f)
                lineTo(7.537f, 9.59f)
                curveTo(7.894f, 9.471f, 8.431f, 9.47f, 8.791f, 9.59f)
                lineTo(10.853f, 10.277f)
                curveTo(11.006f, 10.328f, 11.32f, 10.328f, 11.474f, 10.277f)
                lineTo(13.537f, 9.59f)
                curveTo(13.894f, 9.471f, 14.431f, 9.47f, 14.791f, 9.59f)
                lineTo(16.853f, 10.277f)
                curveTo(17.006f, 10.328f, 17.32f, 10.328f, 17.474f, 10.277f)
                lineTo(19.537f, 9.59f)
                curveTo(19.894f, 9.471f, 20.431f, 9.47f, 20.791f, 9.59f)
                lineTo(22.853f, 10.277f)
                curveTo(23.214f, 10.397f, 23.214f, 10.397f, 23.322f, 10.433f)
                close()
                moveTo(23.322f, 7.933f)
                lineTo(23.796f, 8.092f)
                lineTo(23.48f, 9.04f)
                lineTo(23.006f, 8.882f)
                curveTo(22.898f, 8.846f, 22.898f, 8.846f, 22.537f, 8.726f)
                lineTo(20.474f, 8.038f)
                curveTo(20.32f, 7.987f, 20.006f, 7.987f, 19.853f, 8.038f)
                lineTo(17.791f, 8.726f)
                curveTo(17.431f, 8.846f, 16.894f, 8.845f, 16.537f, 8.726f)
                lineTo(14.474f, 8.038f)
                curveTo(14.32f, 7.987f, 14.006f, 7.987f, 13.853f, 8.038f)
                lineTo(11.791f, 8.726f)
                curveTo(11.431f, 8.846f, 10.894f, 8.845f, 10.537f, 8.726f)
                lineTo(8.474f, 8.038f)
                curveTo(8.32f, 7.987f, 8.006f, 7.987f, 7.853f, 8.038f)
                lineTo(5.791f, 8.726f)
                curveTo(5.431f, 8.846f, 4.894f, 8.845f, 4.537f, 8.726f)
                lineTo(2.474f, 8.038f)
                curveTo(2.32f, 7.987f, 2.006f, 7.987f, 1.853f, 8.038f)
                lineTo(-0.209f, 8.726f)
                lineTo(-0.684f, 8.884f)
                lineTo(-1f, 7.935f)
                lineTo(-0.526f, 7.777f)
                lineTo(1.537f, 7.09f)
                curveTo(1.894f, 6.971f, 2.431f, 6.97f, 2.791f, 7.09f)
                lineTo(4.853f, 7.777f)
                curveTo(5.006f, 7.828f, 5.32f, 7.828f, 5.474f, 7.777f)
                lineTo(7.537f, 7.09f)
                curveTo(7.894f, 6.971f, 8.431f, 6.97f, 8.791f, 7.09f)
                lineTo(10.853f, 7.777f)
                curveTo(11.006f, 7.828f, 11.32f, 7.828f, 11.474f, 7.777f)
                lineTo(13.537f, 7.09f)
                curveTo(13.894f, 6.971f, 14.431f, 6.97f, 14.791f, 7.09f)
                lineTo(16.853f, 7.777f)
                curveTo(17.006f, 7.828f, 17.32f, 7.828f, 17.474f, 7.777f)
                lineTo(19.537f, 7.09f)
                curveTo(19.894f, 6.971f, 20.431f, 6.97f, 20.791f, 7.09f)
                lineTo(22.853f, 7.777f)
                lineTo(23.322f, 7.933f)
                close()
            }
        }.build()

        return _KI!!
    }

@Suppress("ObjectPropertyName")
private var _KI: ImageVector? = null
