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

val FlagKit.KR: ImageVector
    get() {
        if (_KR != null) {
            return _KR!!
        }
        _KR = ImageVector.Builder(
            name = "KR",
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
                        0f to Color(0xFFE01B41),
                        1f to Color(0xFFC51335)
                    ),
                    start = Offset(10.5f, 4f),
                    end = Offset(10.5f, 11f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.5f, 7.5f)
                moveToRelative(-3.5f, 0f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 7f, 0f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -7f, 0f)
            }
            group(
                clipPathData = PathData {
                    moveTo(10.5f, 7.5f)
                    moveToRelative(-3.5f, 0f)
                    arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 7f, 0f)
                    arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -7f, 0f)
                }
            ) {
                path(
                    fill = Brush.linearGradient(
                        colorStops = arrayOf(
                            0f to Color(0xFF0E4B9C),
                            1f to Color(0xFF053677)
                        ),
                        start = Offset(10.389f, 6.875f),
                        end = Offset(10.389f, 11f)
                    ),
                    strokeLineWidth = 1f,
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(7f, 8f)
                    curveTo(8f, 8.938f, 9.5f, 9.5f, 10.5f, 8f)
                    curveTo(11.5f, 6.5f, 13.5f, 6.5f, 14f, 8f)
                    curveTo(14.5f, 9.5f, 14f, 11f, 14f, 11f)
                    lineTo(7f, 11f)
                    curveTo(7f, 11f, 6f, 7.063f, 7f, 8f)
                    close()
                }
                path(
                    fill = Brush.linearGradient(
                        colorStops = arrayOf(
                            0f to Color(0xFF262626),
                            1f to Color(0xFF0D0D0D)
                        ),
                        start = Offset(10.5f, 2.542f),
                        end = Offset(10.5f, 12.458f)
                    ),
                    fillAlpha = 0.75f,
                    strokeAlpha = 0.75f,
                    strokeLineWidth = 1f,
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(14.208f, 3.922f)
                    curveTo(14.137f, 3.8f, 14.173f, 3.647f, 14.299f, 3.575f)
                    lineTo(14.728f, 3.327f)
                    curveTo(14.848f, 3.257f, 15.003f, 3.3f, 15.074f, 3.422f)
                    lineTo(16.318f, 5.578f)
                    curveTo(16.389f, 5.7f, 16.353f, 5.853f, 16.228f, 5.925f)
                    lineTo(15.799f, 6.173f)
                    curveTo(15.678f, 6.243f, 15.523f, 6.2f, 15.452f, 6.078f)
                    lineTo(14.208f, 3.922f)
                    close()
                    moveTo(15.507f, 3.172f)
                    curveTo(15.436f, 3.05f, 15.472f, 2.897f, 15.598f, 2.825f)
                    lineTo(16.027f, 2.577f)
                    curveTo(16.147f, 2.507f, 16.302f, 2.55f, 16.373f, 2.672f)
                    lineTo(17.617f, 4.828f)
                    curveTo(17.688f, 4.95f, 17.653f, 5.103f, 17.527f, 5.175f)
                    lineTo(17.098f, 5.423f)
                    curveTo(16.977f, 5.493f, 16.822f, 5.45f, 16.751f, 5.328f)
                    lineTo(15.507f, 3.172f)
                    close()
                    moveTo(3.383f, 10.172f)
                    curveTo(3.312f, 10.05f, 3.347f, 9.897f, 3.473f, 9.825f)
                    lineTo(3.902f, 9.577f)
                    curveTo(4.023f, 9.507f, 4.178f, 9.55f, 4.249f, 9.672f)
                    lineTo(5.493f, 11.828f)
                    curveTo(5.564f, 11.95f, 5.528f, 12.103f, 5.402f, 12.175f)
                    lineTo(4.973f, 12.423f)
                    curveTo(4.853f, 12.493f, 4.698f, 12.45f, 4.627f, 12.328f)
                    lineTo(3.383f, 10.172f)
                    close()
                    moveTo(4.682f, 9.422f)
                    curveTo(4.611f, 9.3f, 4.647f, 9.147f, 4.772f, 9.075f)
                    lineTo(5.201f, 8.827f)
                    curveTo(5.322f, 8.757f, 5.477f, 8.8f, 5.548f, 8.922f)
                    lineTo(6.792f, 11.078f)
                    curveTo(6.863f, 11.2f, 6.827f, 11.353f, 6.701f, 11.425f)
                    lineTo(6.272f, 11.673f)
                    curveTo(6.152f, 11.743f, 5.997f, 11.7f, 5.926f, 11.578f)
                    lineTo(4.682f, 9.422f)
                    close()
                    moveTo(15.452f, 8.922f)
                    curveTo(15.523f, 8.8f, 15.673f, 8.754f, 15.799f, 8.827f)
                    lineTo(16.228f, 9.075f)
                    curveTo(16.348f, 9.144f, 16.389f, 9.3f, 16.318f, 9.422f)
                    lineTo(15.074f, 11.578f)
                    curveTo(15.003f, 11.7f, 14.853f, 11.746f, 14.728f, 11.673f)
                    lineTo(14.299f, 11.425f)
                    curveTo(14.178f, 11.356f, 14.137f, 11.2f, 14.208f, 11.078f)
                    lineTo(15.452f, 8.922f)
                    close()
                    moveTo(16.751f, 9.672f)
                    curveTo(16.822f, 9.55f, 16.972f, 9.504f, 17.098f, 9.577f)
                    lineTo(17.527f, 9.825f)
                    curveTo(17.647f, 9.894f, 17.688f, 10.05f, 17.617f, 10.172f)
                    lineTo(16.373f, 12.328f)
                    curveTo(16.302f, 12.45f, 16.153f, 12.496f, 16.027f, 12.423f)
                    lineTo(15.598f, 12.175f)
                    curveTo(15.477f, 12.106f, 15.436f, 11.95f, 15.507f, 11.828f)
                    lineTo(16.751f, 9.672f)
                    close()
                    moveTo(4.627f, 2.672f)
                    curveTo(4.698f, 2.55f, 4.847f, 2.504f, 4.973f, 2.577f)
                    lineTo(5.402f, 2.825f)
                    curveTo(5.523f, 2.894f, 5.564f, 3.05f, 5.493f, 3.172f)
                    lineTo(4.249f, 5.328f)
                    curveTo(4.178f, 5.45f, 4.028f, 5.496f, 3.902f, 5.423f)
                    lineTo(3.473f, 5.175f)
                    curveTo(3.353f, 5.106f, 3.312f, 4.95f, 3.383f, 4.828f)
                    lineTo(4.627f, 2.672f)
                    close()
                    moveTo(5.926f, 3.422f)
                    curveTo(5.997f, 3.3f, 6.147f, 3.254f, 6.272f, 3.327f)
                    lineTo(6.701f, 3.575f)
                    curveTo(6.822f, 3.644f, 6.863f, 3.8f, 6.792f, 3.922f)
                    lineTo(5.548f, 6.078f)
                    curveTo(5.477f, 6.2f, 5.327f, 6.246f, 5.201f, 6.173f)
                    lineTo(4.772f, 5.925f)
                    curveTo(4.652f, 5.856f, 4.611f, 5.7f, 4.682f, 5.578f)
                    lineTo(5.926f, 3.422f)
                    close()
                }
            }
        }.build()

        return _KR!!
    }

@Suppress("ObjectPropertyName")
private var _KR: ImageVector? = null
