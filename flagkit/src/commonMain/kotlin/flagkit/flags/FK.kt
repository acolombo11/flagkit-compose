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

val FlagKit.FK: ImageVector
    get() {
        if (_FK != null) {
            return _FK!!
        }
        _FK = ImageVector.Builder(
            name = "FK",
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
                        0f to Color(0xFF07319C),
                        1f to Color(0xFF00247E)
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
                        0f to Color(0xFF1F8BDE),
                        1f to Color(0xFF1075C2)
                    ),
                    start = Offset(15.5f, 4f),
                    end = Offset(15.5f, 11f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13f, 7.5f)
                lineTo(13f, 4.51f)
                curveTo(13f, 4.228f, 13.215f, 4f, 13.498f, 4f)
                lineTo(17.502f, 4f)
                curveTo(17.777f, 4f, 18f, 4.227f, 18f, 4.51f)
                lineTo(18f, 7.5f)
                curveTo(18f, 10f, 15.5f, 11f, 15.5f, 11f)
                curveTo(15.5f, 11f, 13f, 10f, 13f, 7.5f)
                close()
            }
            group(
                clipPathData = PathData {
                    moveTo(13f, 7.5f)
                    lineTo(13f, 4.51f)
                    curveTo(13f, 4.228f, 13.215f, 4f, 13.498f, 4f)
                    lineTo(17.502f, 4f)
                    curveTo(17.777f, 4f, 18f, 4.227f, 18f, 4.51f)
                    lineTo(18f, 7.5f)
                    curveTo(18f, 10f, 15.5f, 11f, 15.5f, 11f)
                    curveTo(15.5f, 11f, 13f, 10f, 13f, 7.5f)
                    close()
                }
            ) {
                path(
                    fill = Brush.linearGradient(
                        colorStops = arrayOf(
                            0f to Color(0xFFFFFFFF),
                            1f to Color(0xFFF0F0F0)
                        ),
                        start = Offset(15.5f, 4f),
                        end = Offset(15.5f, 11f)
                    ),
                    strokeLineWidth = 1f
                ) {
                    moveTo(13f, 7.5f)
                    lineTo(13f, 4.51f)
                    curveTo(13f, 4.228f, 13.215f, 4f, 13.498f, 4f)
                    lineTo(17.502f, 4f)
                    curveTo(17.777f, 4f, 18f, 4.227f, 18f, 4.51f)
                    lineTo(18f, 7.5f)
                    curveTo(18f, 10f, 15.5f, 11f, 15.5f, 11f)
                    curveTo(15.5f, 11f, 13f, 10f, 13f, 7.5f)
                    close()
                    moveTo(15.644f, 10.37f)
                    curveTo(15.907f, 10.221f, 16.171f, 10.036f, 16.416f, 9.816f)
                    curveTo(17.099f, 9.201f, 17.5f, 8.439f, 17.5f, 7.5f)
                    lineTo(17.5f, 4.51f)
                    curveTo(17.5f, 4.501f, 13.499f, 4.5f, 13.499f, 4.5f)
                    curveTo(13.499f, 4.501f, 13.5f, 7.5f, 13.5f, 7.5f)
                    curveTo(13.5f, 8.439f, 13.901f, 9.201f, 14.584f, 9.816f)
                    curveTo(14.829f, 10.036f, 15.093f, 10.221f, 15.356f, 10.37f)
                    curveTo(15.409f, 10.4f, 15.457f, 10.426f, 15.5f, 10.448f)
                    curveTo(15.543f, 10.426f, 15.591f, 10.4f, 15.644f, 10.37f)
                    close()
                }
            }
            group(
                clipPathData = PathData {
                    moveTo(13f, 7.5f)
                    lineTo(13f, 4.51f)
                    curveTo(13f, 4.228f, 13.215f, 4f, 13.498f, 4f)
                    lineTo(17.502f, 4f)
                    curveTo(17.777f, 4f, 18f, 4.227f, 18f, 4.51f)
                    lineTo(18f, 7.5f)
                    curveTo(18f, 10f, 15.5f, 11f, 15.5f, 11f)
                    curveTo(15.5f, 11f, 13f, 10f, 13f, 7.5f)
                    close()
                }
            ) {
                path(
                    fill = Brush.linearGradient(
                        colorStops = arrayOf(
                            0f to Color(0xFF187536),
                            1f to Color(0xFF0E5023)
                        ),
                        start = Offset(15.5f, 7f),
                        end = Offset(15.5f, 8.269f)
                    ),
                    strokeLineWidth = 1f,
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(14.158f, 7.475f)
                    curveTo(14.071f, 7.212f, 14.216f, 7f, 14.495f, 7f)
                    lineTo(16.505f, 7f)
                    curveTo(16.778f, 7f, 16.93f, 7.209f, 16.842f, 7.475f)
                    lineTo(16.658f, 8.025f)
                    curveTo(16.571f, 8.288f, 16.363f, 8.331f, 16.134f, 8.158f)
                    curveTo(16.134f, 8.158f, 16.222f, 8f, 15.5f, 8f)
                    curveTo(14.778f, 8f, 14.866f, 8.158f, 14.866f, 8.158f)
                    curveTo(14.664f, 8.347f, 14.43f, 8.291f, 14.342f, 8.025f)
                    lineTo(14.158f, 7.475f)
                    close()
                }
            }
            group(
                clipPathData = PathData {
                    moveTo(13f, 7.5f)
                    lineTo(13f, 4.51f)
                    curveTo(13f, 4.228f, 13.215f, 4f, 13.498f, 4f)
                    lineTo(17.502f, 4f)
                    curveTo(17.777f, 4f, 18f, 4.227f, 18f, 4.51f)
                    lineTo(18f, 7.5f)
                    curveTo(18f, 10f, 15.5f, 11f, 15.5f, 11f)
                    curveTo(15.5f, 11f, 13f, 10f, 13f, 7.5f)
                    close()
                }
            ) {
                path(
                    fill = Brush.linearGradient(
                        colorStops = arrayOf(
                            0f to Color(0xFFFFFFFF),
                            1f to Color(0xFFF0F0F0)
                        ),
                        start = Offset(15.5f, 5f),
                        end = Offset(15.5f, 7.006f)
                    ),
                    strokeLineWidth = 1f,
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(14.5f, 7f)
                    curveTo(14.771f, 7.054f, 15.09f, 6.5f, 15.5f, 6.5f)
                    curveTo(15.937f, 6.5f, 16.226f, 7.067f, 16.5f, 7f)
                    curveTo(16.746f, 6.94f, 17f, 6.261f, 17f, 6f)
                    curveTo(17f, 5.448f, 16.328f, 5f, 15.5f, 5f)
                    curveTo(14.672f, 5f, 14f, 5.448f, 14f, 6f)
                    curveTo(14f, 6.279f, 14.223f, 6.945f, 14.5f, 7f)
                    close()
                }
            }
            group(
                clipPathData = PathData {
                    moveTo(13f, 7.5f)
                    lineTo(13f, 4.51f)
                    curveTo(13f, 4.228f, 13.215f, 4f, 13.498f, 4f)
                    lineTo(17.502f, 4f)
                    curveTo(17.777f, 4f, 18f, 4.227f, 18f, 4.51f)
                    lineTo(18f, 7.5f)
                    curveTo(18f, 10f, 15.5f, 11f, 15.5f, 11f)
                    curveTo(15.5f, 11f, 13f, 10f, 13f, 7.5f)
                    close()
                }
            ) {
                path(
                    fill = Brush.linearGradient(
                        colorStops = arrayOf(
                            0f to Color(0xFFFFFFFF),
                            1f to Color(0xFFF0F0F0)
                        ),
                        start = Offset(15.325f, 8.955f),
                        end = Offset(15.325f, 10.354f)
                    ),
                    strokeLineWidth = 1f
                ) {
                    moveTo(12.677f, 10.177f)
                    curveTo(12.755f, 10.099f, 12.755f, 10.099f, 13.027f, 9.827f)
                    lineTo(13.327f, 9.527f)
                    curveTo(13.423f, 9.431f, 13.577f, 9.431f, 13.673f, 9.527f)
                    lineTo(13.973f, 9.827f)
                    curveTo(14.264f, 10.118f, 14.735f, 10.118f, 15.027f, 9.827f)
                    lineTo(15.327f, 9.527f)
                    curveTo(15.423f, 9.431f, 15.577f, 9.431f, 15.673f, 9.527f)
                    lineTo(15.973f, 9.827f)
                    curveTo(16.264f, 10.118f, 16.735f, 10.118f, 17.027f, 9.827f)
                    lineTo(17.327f, 9.527f)
                    curveTo(17.423f, 9.431f, 17.577f, 9.431f, 17.673f, 9.527f)
                    lineTo(17.973f, 9.827f)
                    lineTo(18.15f, 10.004f)
                    lineTo(18.504f, 9.65f)
                    lineTo(18.327f, 9.473f)
                    lineTo(18.027f, 9.173f)
                    curveTo(17.735f, 8.882f, 17.264f, 8.882f, 16.973f, 9.173f)
                    lineTo(16.673f, 9.473f)
                    curveTo(16.577f, 9.569f, 16.423f, 9.569f, 16.327f, 9.473f)
                    lineTo(16.027f, 9.173f)
                    curveTo(15.735f, 8.882f, 15.264f, 8.882f, 14.973f, 9.173f)
                    lineTo(14.673f, 9.473f)
                    curveTo(14.577f, 9.569f, 14.423f, 9.569f, 14.327f, 9.473f)
                    lineTo(14.027f, 9.173f)
                    curveTo(13.735f, 8.882f, 13.264f, 8.882f, 12.973f, 9.173f)
                    lineTo(12.673f, 9.473f)
                    lineTo(12.323f, 9.823f)
                    lineTo(12.146f, 10f)
                    lineTo(12.5f, 10.354f)
                    lineTo(12.677f, 10.177f)
                    lineTo(12.677f, 10.177f)
                    close()
                }
            }
            group(
                clipPathData = PathData {
                    moveTo(13f, 7.5f)
                    lineTo(13f, 4.51f)
                    curveTo(13f, 4.228f, 13.215f, 4f, 13.498f, 4f)
                    lineTo(17.502f, 4f)
                    curveTo(17.777f, 4f, 18f, 4.227f, 18f, 4.51f)
                    lineTo(18f, 7.5f)
                    curveTo(18f, 10f, 15.5f, 11f, 15.5f, 11f)
                    curveTo(15.5f, 11f, 13f, 10f, 13f, 7.5f)
                    close()
                }
            ) {
                path(
                    fill = Brush.linearGradient(
                        colorStops = arrayOf(
                            0f to Color(0xFFFFFFFF),
                            1f to Color(0xFFF0F0F0)
                        ),
                        start = Offset(15.325f, 7.455f),
                        end = Offset(15.325f, 8.854f)
                    ),
                    strokeLineWidth = 1f
                ) {
                    moveTo(12.677f, 8.677f)
                    curveTo(12.755f, 8.599f, 12.755f, 8.599f, 13.027f, 8.327f)
                    lineTo(13.327f, 8.027f)
                    curveTo(13.423f, 7.931f, 13.577f, 7.931f, 13.673f, 8.027f)
                    lineTo(13.973f, 8.327f)
                    curveTo(14.264f, 8.618f, 14.735f, 8.618f, 15.027f, 8.327f)
                    lineTo(15.327f, 8.027f)
                    curveTo(15.423f, 7.931f, 15.577f, 7.931f, 15.673f, 8.027f)
                    lineTo(15.973f, 8.327f)
                    curveTo(16.264f, 8.618f, 16.735f, 8.618f, 17.027f, 8.327f)
                    lineTo(17.327f, 8.027f)
                    curveTo(17.423f, 7.931f, 17.577f, 7.931f, 17.673f, 8.027f)
                    lineTo(17.973f, 8.327f)
                    lineTo(18.15f, 8.504f)
                    lineTo(18.504f, 8.15f)
                    lineTo(18.327f, 7.973f)
                    lineTo(18.027f, 7.673f)
                    curveTo(17.735f, 7.382f, 17.264f, 7.382f, 16.973f, 7.673f)
                    lineTo(16.673f, 7.973f)
                    curveTo(16.577f, 8.069f, 16.423f, 8.069f, 16.327f, 7.973f)
                    lineTo(16.027f, 7.673f)
                    curveTo(15.735f, 7.382f, 15.264f, 7.382f, 14.973f, 7.673f)
                    lineTo(14.673f, 7.973f)
                    curveTo(14.577f, 8.069f, 14.423f, 8.069f, 14.327f, 7.973f)
                    lineTo(14.027f, 7.673f)
                    curveTo(13.735f, 7.382f, 13.264f, 7.382f, 12.973f, 7.673f)
                    lineTo(12.673f, 7.973f)
                    lineTo(12.323f, 8.323f)
                    lineTo(12.146f, 8.5f)
                    lineTo(12.5f, 8.854f)
                    lineTo(12.677f, 8.677f)
                    lineTo(12.677f, 8.677f)
                    close()
                }
            }
            group(
                clipPathData = PathData {
                    moveTo(13f, 7.5f)
                    lineTo(13f, 4.51f)
                    curveTo(13f, 4.228f, 13.215f, 4f, 13.498f, 4f)
                    lineTo(17.502f, 4f)
                    curveTo(17.777f, 4f, 18f, 4.227f, 18f, 4.51f)
                    lineTo(18f, 7.5f)
                    curveTo(18f, 10f, 15.5f, 11f, 15.5f, 11f)
                    curveTo(15.5f, 11f, 13f, 10f, 13f, 7.5f)
                    close()
                }
            ) {
                path(
                    fill = Brush.linearGradient(
                        colorStops = arrayOf(
                            0f to Color(0xFFFFFFFF),
                            1f to Color(0xFFF0F0F0)
                        ),
                        start = Offset(15.325f, 10.455f),
                        end = Offset(15.325f, 11.854f)
                    ),
                    strokeLineWidth = 1f
                ) {
                    moveTo(12.677f, 11.677f)
                    curveTo(12.755f, 11.599f, 12.755f, 11.599f, 13.027f, 11.327f)
                    lineTo(13.327f, 11.027f)
                    curveTo(13.423f, 10.931f, 13.577f, 10.931f, 13.673f, 11.027f)
                    lineTo(13.973f, 11.327f)
                    curveTo(14.264f, 11.618f, 14.735f, 11.618f, 15.027f, 11.327f)
                    lineTo(15.327f, 11.027f)
                    curveTo(15.423f, 10.931f, 15.577f, 10.931f, 15.673f, 11.027f)
                    lineTo(15.973f, 11.327f)
                    curveTo(16.264f, 11.618f, 16.735f, 11.618f, 17.027f, 11.327f)
                    lineTo(17.327f, 11.027f)
                    curveTo(17.423f, 10.931f, 17.577f, 10.931f, 17.673f, 11.027f)
                    lineTo(17.973f, 11.327f)
                    lineTo(18.15f, 11.504f)
                    lineTo(18.504f, 11.15f)
                    lineTo(18.327f, 10.973f)
                    lineTo(18.027f, 10.673f)
                    curveTo(17.735f, 10.382f, 17.264f, 10.382f, 16.973f, 10.673f)
                    lineTo(16.673f, 10.973f)
                    curveTo(16.577f, 11.069f, 16.423f, 11.069f, 16.327f, 10.973f)
                    lineTo(16.027f, 10.673f)
                    curveTo(15.735f, 10.382f, 15.264f, 10.382f, 14.973f, 10.673f)
                    lineTo(14.673f, 10.973f)
                    curveTo(14.577f, 11.069f, 14.423f, 11.069f, 14.327f, 10.973f)
                    lineTo(14.027f, 10.673f)
                    curveTo(13.735f, 10.382f, 13.264f, 10.382f, 12.973f, 10.673f)
                    lineTo(12.673f, 10.973f)
                    lineTo(12.323f, 11.323f)
                    lineTo(12.146f, 11.5f)
                    lineTo(12.5f, 11.854f)
                    lineTo(12.677f, 11.677f)
                    lineTo(12.677f, 11.677f)
                    close()
                }
                path(
                    fill = Brush.linearGradient(
                        colorStops = arrayOf(
                            0f to Color(0xFFDB1E36),
                            1f to Color(0xFFD51931)
                        ),
                        start = Offset(4.5f, 0f),
                        end = Offset(4.5f, 7f)
                    ),
                    strokeLineWidth = 1f,
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(3.5f, 3f)
                    lineTo(0f, 0f)
                    lineTo(0.5f, 0f)
                    lineTo(4f, 2.5f)
                    lineTo(5f, 2.5f)
                    lineTo(9f, 0f)
                    lineTo(9f, 0.25f)
                    curveTo(9f, 0.388f, 8.913f, 0.562f, 8.792f, 0.649f)
                    lineTo(5.5f, 3f)
                    lineTo(5.5f, 4f)
                    lineTo(8.812f, 6.839f)
                    curveTo(8.916f, 6.928f, 8.884f, 7f, 8.75f, 7f)
                    lineTo(8.75f, 7f)
                    curveTo(8.612f, 7f, 8.413f, 6.938f, 8.292f, 6.851f)
                    lineTo(5f, 4.5f)
                    lineTo(4f, 4.5f)
                    lineTo(0f, 7f)
                    lineTo(0f, 6.5f)
                    lineTo(3.5f, 4f)
                    lineTo(3.5f, 3f)
                    close()
                }
                path(
                    stroke = SolidColor(Color(0xFFFFFFFF)),
                    strokeLineWidth = 0.5f,
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(3.25f, 3.115f)
                    lineTo(-0.676f, -0.25f)
                    lineTo(0.5f, -0.25f)
                    lineTo(0.645f, -0.203f)
                    lineTo(4.08f, 2.25f)
                    lineTo(4.928f, 2.25f)
                    lineTo(9.25f, -0.451f)
                    lineTo(9.25f, 0.25f)
                    curveTo(9.25f, 0.472f, 9.122f, 0.72f, 8.937f, 0.852f)
                    lineTo(5.75f, 3.129f)
                    lineTo(5.75f, 3.885f)
                    lineTo(8.975f, 6.649f)
                    curveTo(9.257f, 6.891f, 9.113f, 7.25f, 8.75f, 7.25f)
                    curveTo(8.557f, 7.25f, 8.308f, 7.17f, 8.146f, 7.055f)
                    lineTo(4.92f, 4.75f)
                    lineTo(4.072f, 4.75f)
                    lineTo(-0.25f, 7.451f)
                    lineTo(-0.25f, 6.371f)
                    lineTo(3.25f, 3.871f)
                    lineTo(3.25f, 3.115f)
                    close()
                }
                path(
                    fill = Brush.linearGradient(
                        colorStops = arrayOf(
                            0f to Color(0xFFFFFFFF),
                            1f to Color(0xFFF0F0F0)
                        ),
                        start = Offset(4.75f, 0f),
                        end = Offset(4.75f, 7.5f)
                    ),
                    strokeLineWidth = 1f,
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(0f, 2.5f)
                    lineTo(0f, 4.5f)
                    lineTo(3.5f, 4.5f)
                    lineTo(3.5f, 7.005f)
                    curveTo(3.5f, 7.278f, 3.714f, 7.5f, 4.005f, 7.5f)
                    lineTo(4.995f, 7.5f)
                    curveTo(5.274f, 7.5f, 5.5f, 7.284f, 5.5f, 7.005f)
                    lineTo(5.5f, 4.5f)
                    lineTo(9.01f, 4.5f)
                    curveTo(9.28f, 4.5f, 9.5f, 4.286f, 9.5f, 3.995f)
                    lineTo(9.5f, 3.005f)
                    curveTo(9.5f, 2.726f, 9.285f, 2.5f, 9.01f, 2.5f)
                    lineTo(5.5f, 2.5f)
                    lineTo(5.5f, 0f)
                    lineTo(3.5f, 0f)
                    lineTo(3.5f, 2.5f)
                    lineTo(0f, 2.5f)
                    close()
                }
                path(
                    fill = Brush.linearGradient(
                        colorStops = arrayOf(
                            0f to Color(0xFFDB1E36),
                            1f to Color(0xFFD51931)
                        ),
                        start = Offset(4.5f, 0f),
                        end = Offset(4.5f, 7f)
                    ),
                    strokeLineWidth = 1f,
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(0f, 3f)
                    lineToRelative(4f, 0f)
                    lineToRelative(0f, -0.5f)
                    lineToRelative(0f, -2.5f)
                    lineToRelative(1f, 0f)
                    lineToRelative(0f, 2.5f)
                    lineToRelative(0f, 0.5f)
                    lineToRelative(4f, 0f)
                    lineToRelative(0f, 1f)
                    lineToRelative(-4f, 0f)
                    lineToRelative(0f, 0.5f)
                    lineToRelative(0f, 2.5f)
                    lineToRelative(-1f, 0f)
                    lineToRelative(0f, -2.5f)
                    lineToRelative(0f, -0.5f)
                    lineToRelative(-4f, 0f)
                    close()
                }
            }
        }.build()

        return _FK!!
    }

@Suppress("ObjectPropertyName")
private var _FK: ImageVector? = null
