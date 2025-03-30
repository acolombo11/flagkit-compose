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

val FlagKit.SK: ImageVector
    get() {
        if (_SK != null) {
            return _SK!!
        }
        _SK = ImageVector.Builder(
            name = "SK",
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
                        0f to Color(0xFF0C47B7),
                        1f to Color(0xFF073DA4)
                    ),
                    start = Offset(10.5f, 5f),
                    end = Offset(10.5f, 10f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 5f)
                horizontalLineToRelative(21f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-21f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFE53B35),
                        1f to Color(0xFFD32E28)
                    ),
                    start = Offset(10.5f, 10f),
                    end = Offset(10.5f, 15f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 10f)
                horizontalLineToRelative(21f)
                verticalLineToRelative(5f)
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
                    end = Offset(10.5f, 5f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(21f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-21f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFFFFF),
                        1f to Color(0xFFF0F0F0)
                    ),
                    start = Offset(7.5f, 2f),
                    end = Offset(7.5f, 12.924f)
                ),
                strokeLineWidth = 1f
            ) {
                moveTo(5.251f, 2f)
                lineTo(9.749f, 2f)
                curveTo(10.839f, 2f, 11.746f, 2.872f, 11.788f, 3.963f)
                lineTo(11.961f, 8.46f)
                curveTo(11.994f, 9.32f, 11.546f, 10.349f, 10.891f, 10.91f)
                lineTo(9.297f, 12.277f)
                curveTo(8.29f, 13.14f, 6.708f, 13.138f, 5.703f, 12.277f)
                lineTo(4.109f, 10.91f)
                curveTo(3.457f, 10.352f, 3.006f, 9.319f, 3.039f, 8.46f)
                lineTo(3.212f, 3.963f)
                curveTo(3.254f, 2.873f, 4.16f, 2f, 5.251f, 2f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFF73744),
                        1f to Color(0xFFEC212F)
                    ),
                    start = Offset(7.5f, 3f),
                    end = Offset(7.5f, 11.923f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4.211f, 4.001f)
                curveTo(4.233f, 3.448f, 4.697f, 3f, 5.251f, 3f)
                lineTo(9.749f, 3f)
                curveTo(10.302f, 3f, 10.767f, 3.447f, 10.789f, 4.001f)
                lineTo(10.961f, 8.499f)
                curveTo(10.983f, 9.052f, 10.664f, 9.788f, 10.241f, 10.151f)
                lineTo(8.646f, 11.518f)
                curveTo(8.013f, 12.06f, 6.984f, 12.057f, 6.354f, 11.518f)
                lineTo(4.759f, 10.151f)
                curveTo(4.34f, 9.791f, 4.017f, 9.053f, 4.039f, 8.499f)
                lineTo(4.211f, 4.001f)
                close()
            }
            group(
                clipPathData = PathData {
                    moveTo(4.211f, 4.001f)
                    curveTo(4.233f, 3.448f, 4.697f, 3f, 5.251f, 3f)
                    lineTo(9.749f, 3f)
                    curveTo(10.302f, 3f, 10.767f, 3.447f, 10.789f, 4.001f)
                    lineTo(10.961f, 8.499f)
                    curveTo(10.983f, 9.052f, 10.664f, 9.788f, 10.241f, 10.151f)
                    lineTo(8.646f, 11.518f)
                    curveTo(8.013f, 12.06f, 6.984f, 12.057f, 6.354f, 11.518f)
                    lineTo(4.759f, 10.151f)
                    curveTo(4.34f, 9.791f, 4.017f, 9.053f, 4.039f, 8.499f)
                    lineTo(4.211f, 4.001f)
                    close()
                }
            ) {
                path(
                    fill = Brush.linearGradient(
                        colorStops = arrayOf(
                            0f to Color(0xFFFFFFFF),
                            1f to Color(0xFFF0F0F0)
                        ),
                        start = Offset(7.5f, 4f),
                        end = Offset(7.5f, 10f)
                    ),
                    strokeLineWidth = 1f,
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(7f, 8.245f)
                    curveTo(7f, 8.11f, 6.882f, 8f, 6.752f, 8f)
                    lineTo(5.748f, 8f)
                    curveTo(5.611f, 8f, 5.5f, 7.893f, 5.5f, 7.748f)
                    lineTo(5.5f, 7.252f)
                    curveTo(5.5f, 7.113f, 5.618f, 7f, 5.748f, 7f)
                    lineTo(6.752f, 7f)
                    curveTo(6.889f, 7f, 7f, 6.893f, 7f, 6.748f)
                    lineTo(7f, 6.252f)
                    curveTo(7f, 6.113f, 6.893f, 6f, 6.748f, 6f)
                    lineTo(6.252f, 6f)
                    curveTo(6.113f, 6f, 6f, 5.893f, 6f, 5.748f)
                    lineTo(6f, 5.252f)
                    curveTo(6f, 5.113f, 6.107f, 5f, 6.252f, 5f)
                    lineTo(6.748f, 5f)
                    curveTo(6.887f, 5f, 7f, 4.893f, 7f, 4.748f)
                    lineTo(7f, 4.252f)
                    curveTo(7f, 4.113f, 7.107f, 4f, 7.252f, 4f)
                    lineTo(7.748f, 4f)
                    curveTo(7.887f, 4f, 8f, 4.107f, 8f, 4.252f)
                    lineTo(8f, 4.748f)
                    curveTo(8f, 4.887f, 8.107f, 5f, 8.252f, 5f)
                    lineTo(8.748f, 5f)
                    curveTo(8.887f, 5f, 9f, 5.107f, 9f, 5.252f)
                    lineTo(9f, 5.748f)
                    curveTo(9f, 5.887f, 8.893f, 6f, 8.748f, 6f)
                    lineTo(8.252f, 6f)
                    curveTo(8.113f, 6f, 8f, 6.107f, 8f, 6.252f)
                    lineTo(8f, 6.748f)
                    curveTo(8f, 6.887f, 8.118f, 7f, 8.248f, 7f)
                    lineTo(9.252f, 7f)
                    curveTo(9.389f, 7f, 9.5f, 7.107f, 9.5f, 7.252f)
                    lineTo(9.5f, 7.748f)
                    curveTo(9.5f, 7.887f, 9.382f, 8f, 9.252f, 8f)
                    lineTo(8.248f, 8f)
                    curveTo(8.111f, 8f, 8f, 8.108f, 8f, 8.245f)
                    lineTo(8f, 9.755f)
                    curveTo(8f, 9.89f, 7.893f, 10f, 7.748f, 10f)
                    lineTo(7.252f, 10f)
                    curveTo(7.113f, 10f, 7f, 9.892f, 7f, 9.755f)
                    lineTo(7f, 8.245f)
                    close()
                }
            }
            group(
                clipPathData = PathData {
                    moveTo(4.211f, 4.001f)
                    curveTo(4.233f, 3.448f, 4.697f, 3f, 5.251f, 3f)
                    lineTo(9.749f, 3f)
                    curveTo(10.302f, 3f, 10.767f, 3.447f, 10.789f, 4.001f)
                    lineTo(10.961f, 8.499f)
                    curveTo(10.983f, 9.052f, 10.664f, 9.788f, 10.241f, 10.151f)
                    lineTo(8.646f, 11.518f)
                    curveTo(8.013f, 12.06f, 6.984f, 12.057f, 6.354f, 11.518f)
                    lineTo(4.759f, 10.151f)
                    curveTo(4.34f, 9.791f, 4.017f, 9.053f, 4.039f, 8.499f)
                    lineTo(4.211f, 4.001f)
                    close()
                }
            ) {
                path(
                    fill = SolidColor(Color(0xFF1251A1)),
                    strokeLineWidth = 1f,
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(6.597f, 10.069f)
                    curveTo(5.382f, 10.261f, 4.5f, 10.829f, 4.5f, 11.5f)
                    curveTo(4.5f, 12.328f, 5.843f, 13f, 7.5f, 13f)
                    curveTo(9.157f, 13f, 10.5f, 12.328f, 10.5f, 11.5f)
                    curveTo(10.5f, 10.829f, 9.618f, 10.261f, 8.403f, 10.069f)
                    curveTo(8.242f, 9.733f, 7.898f, 9.5f, 7.5f, 9.5f)
                    curveTo(7.102f, 9.5f, 6.758f, 9.733f, 6.597f, 10.069f)
                    close()
                }
            }
        }.build()

        return _SK!!
    }

@Suppress("ObjectPropertyName")
private var _SK: ImageVector? = null
