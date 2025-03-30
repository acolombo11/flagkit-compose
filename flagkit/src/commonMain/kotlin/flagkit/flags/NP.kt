package flagkit.flags

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathData
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import flagkit.FlagKit

val FlagKit.NP: ImageVector
    get() {
        if (_NP != null) {
            return _NP!!
        }
        _NP = ImageVector.Builder(
            name = "NP",
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
                    start = Offset(6.749f, 0f),
                    end = Offset(6.749f, 15f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                lineTo(1.495f, 0f)
                curveTo(1.774f, 0f, 2.188f, 0.126f, 2.413f, 0.275f)
                lineTo(13.175f, 7.45f)
                curveTo(13.631f, 7.754f, 13.547f, 8f, 13.003f, 8f)
                lineTo(6f, 8f)
                lineTo(13.247f, 14.341f)
                curveTo(13.663f, 14.705f, 13.55f, 15f, 12.993f, 15f)
                lineTo(0f, 15f)
                lineTo(0f, 0f)
                close()
            }
            group(
                clipPathData = PathData {
                    moveTo(0f, 0f)
                    lineTo(1.495f, 0f)
                    curveTo(1.774f, 0f, 2.188f, 0.126f, 2.413f, 0.275f)
                    lineTo(13.175f, 7.45f)
                    curveTo(13.631f, 7.754f, 13.547f, 8f, 13.003f, 8f)
                    lineTo(6f, 8f)
                    lineTo(13.247f, 14.341f)
                    curveTo(13.663f, 14.705f, 13.55f, 15f, 12.993f, 15f)
                    lineTo(0f, 15f)
                    lineTo(0f, 0f)
                    close()
                }
            ) {
                path(
                    fill = Brush.linearGradient(
                        colorStops = arrayOf(
                            0f to Color(0xFFEE1B44),
                            1f to Color(0xFFDD153C)
                        ),
                        start = Offset(6.749f, 0f),
                        end = Offset(6.749f, 15f)
                    ),
                    strokeLineWidth = 1f,
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(0f, 0f)
                    lineTo(1.495f, 0f)
                    curveTo(1.774f, 0f, 2.188f, 0.126f, 2.413f, 0.275f)
                    lineTo(13.175f, 7.45f)
                    curveTo(13.631f, 7.754f, 13.547f, 8f, 13.003f, 8f)
                    lineTo(6f, 8f)
                    lineTo(13.247f, 14.341f)
                    curveTo(13.663f, 14.705f, 13.55f, 15f, 12.993f, 15f)
                    lineTo(0f, 15f)
                    lineTo(0f, 0f)
                    close()
                }
                path(
                    fill = Brush.linearGradient(
                        colorStops = arrayOf(
                            0f to Color(0xFF0543A8),
                            1f to Color(0xFF003893)
                        ),
                        start = Offset(6.584f, 0.5f),
                        end = Offset(6.584f, 14.5f)
                    ),
                    strokeLineWidth = 1f,
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(0.5f, 0.5f)
                    lineTo(0.5f, 14.5f)
                    lineTo(12.669f, 14.5f)
                    lineTo(4.669f, 7.5f)
                    lineTo(12.349f, 7.5f)
                    lineTo(2.136f, 0.691f)
                    curveTo(1.992f, 0.596f, 1.674f, 0.5f, 1.495f, 0.5f)
                    lineTo(0.5f, 0.5f)
                    close()
                }
            }
            group(
                clipPathData = PathData {
                    moveTo(0f, 0f)
                    lineTo(1.495f, 0f)
                    curveTo(1.774f, 0f, 2.188f, 0.126f, 2.413f, 0.275f)
                    lineTo(13.175f, 7.45f)
                    curveTo(13.631f, 7.754f, 13.547f, 8f, 13.003f, 8f)
                    lineTo(6f, 8f)
                    lineTo(13.247f, 14.341f)
                    curveTo(13.663f, 14.705f, 13.55f, 15f, 12.993f, 15f)
                    lineTo(0f, 15f)
                    lineTo(0f, 0f)
                    close()
                }
            ) {
                path(
                    fill = Brush.linearGradient(
                        colorStops = arrayOf(
                            0f to Color(0xFFFFFFFF),
                            1f to Color(0xFFF0F0F0)
                        ),
                        start = Offset(3.998f, 4.114f),
                        end = Offset(3.998f, 12.848f)
                    ),
                    strokeLineWidth = 1f,
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(5.138f, 5.851f)
                    curveTo(5.426f, 5.772f, 5.692f, 5.664f, 5.927f, 5.532f)
                    curveTo(5.694f, 6.378f, 4.919f, 7f, 3.998f, 7f)
                    curveTo(3.078f, 7f, 2.303f, 6.378f, 2.07f, 5.532f)
                    curveTo(2.306f, 5.664f, 2.572f, 5.772f, 2.861f, 5.851f)
                    lineTo(3.25f, 5.5f)
                    lineTo(2.614f, 4.926f)
                    lineTo(3.47f, 4.97f)
                    lineTo(3.426f, 4.114f)
                    lineTo(4f, 4.75f)
                    lineTo(4.574f, 4.114f)
                    lineTo(4.53f, 4.97f)
                    lineTo(5.386f, 4.926f)
                    lineTo(4.75f, 5.5f)
                    lineTo(5.138f, 5.851f)
                    lineTo(5.138f, 5.851f)
                    close()
                    moveTo(4f, 12f)
                    lineTo(3.235f, 12.848f)
                    lineTo(3.293f, 11.707f)
                    lineTo(2.152f, 11.765f)
                    lineTo(3f, 11f)
                    lineTo(2.152f, 10.235f)
                    lineTo(3.293f, 10.293f)
                    lineTo(3.235f, 9.152f)
                    lineTo(4f, 10f)
                    lineTo(4.765f, 9.152f)
                    lineTo(4.707f, 10.293f)
                    lineTo(5.848f, 10.235f)
                    lineTo(5f, 11f)
                    lineTo(5.848f, 11.765f)
                    lineTo(4.707f, 11.707f)
                    lineTo(4.765f, 12.848f)
                    lineTo(4f, 12f)
                    close()
                }
            }
        }.build()

        return _NP!!
    }

@Suppress("ObjectPropertyName")
private var _NP: ImageVector? = null
