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

val FlagKit.PM: ImageVector
    get() {
        if (_PM != null) {
            return _PM!!
        }
        _PM = ImageVector.Builder(
            name = "PM",
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
                        0f to Color(0xFF138E16),
                        1f to Color(0xFF0F7F12)
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
                        0f to Color(0xFF26A7DC),
                        1f to Color(0xFF1B94C6)
                    ),
                    start = Offset(10.5f, 0f),
                    end = Offset(10.5f, 15f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 15f)
                lineToRelative(7f, 0f)
                lineToRelative(14f, 0f)
                lineToRelative(0f, -15f)
                lineToRelative(-14f, 0f)
                lineToRelative(-7f, 0f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFBCD3F),
                        1f to Color(0xFFFFCE2F)
                    ),
                    start = Offset(14f, 3.089f),
                    end = Offset(14f, 10f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(17.326f, 6.429f)
                curveTo(18.353f, 6.176f, 19f, 6.109f, 19f, 7f)
                curveTo(19f, 8.657f, 16.761f, 10f, 14f, 10f)
                curveTo(11.239f, 10f, 9f, 8.657f, 9f, 7f)
                curveTo(9f, 6.109f, 9.647f, 6.176f, 10.674f, 6.429f)
                curveTo(10.609f, 6.251f, 10.555f, 6.063f, 10.513f, 5.866f)
                curveTo(10.226f, 4.516f, 10.65f, 3.282f, 11.46f, 3.109f)
                curveTo(12.271f, 2.937f, 13.16f, 3.892f, 13.447f, 5.243f)
                curveTo(13.583f, 5.879f, 13.56f, 6.49f, 13.413f, 6.976f)
                curveTo(13.606f, 6.991f, 13.802f, 7f, 14f, 7f)
                curveTo(14.198f, 7f, 14.394f, 6.991f, 14.587f, 6.976f)
                curveTo(14.44f, 6.49f, 14.417f, 5.879f, 14.553f, 5.243f)
                curveTo(14.84f, 3.892f, 15.729f, 2.937f, 16.54f, 3.109f)
                curveTo(17.35f, 3.282f, 17.774f, 4.516f, 17.487f, 5.866f)
                curveTo(17.445f, 6.063f, 17.391f, 6.251f, 17.326f, 6.429f)
                lineTo(17.326f, 6.429f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFFFFF),
                        1f to Color(0xFFF0F0F0)
                    ),
                    start = Offset(14f, 11f),
                    end = Offset(14f, 13f)
                ),
                strokeLineWidth = 1f
            ) {
                moveTo(15.776f, 12.947f)
                curveTo(15.917f, 13.018f, 16.083f, 13.018f, 16.224f, 12.947f)
                lineTo(18.224f, 11.947f)
                curveTo(18.471f, 11.824f, 18.571f, 11.523f, 18.447f, 11.276f)
                curveTo(18.324f, 11.029f, 18.023f, 10.929f, 17.776f, 11.053f)
                lineTo(16f, 11.941f)
                lineTo(14.224f, 11.053f)
                curveTo(14.083f, 10.982f, 13.917f, 10.982f, 13.776f, 11.053f)
                lineTo(12f, 11.941f)
                lineTo(10.224f, 11.053f)
                curveTo(9.977f, 10.929f, 9.676f, 11.029f, 9.553f, 11.276f)
                curveTo(9.429f, 11.523f, 9.529f, 11.824f, 9.776f, 11.947f)
                lineTo(11.776f, 12.947f)
                curveTo(11.917f, 13.018f, 12.083f, 13.018f, 12.224f, 12.947f)
                lineTo(14f, 12.059f)
                lineTo(15.776f, 12.947f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFF03633),
                        1f to Color(0xFFD82A28)
                    ),
                    start = Offset(3.5f, 0f),
                    end = Offset(3.5f, 5f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-7f)
                close()
            }
            group(
                clipPathData = PathData {
                    moveTo(-0.743f, 3.207f)
                    lineToRelative(4.95f, -4.95f)
                    lineToRelative(3.536f, 3.536f)
                    lineToRelative(-4.95f, 4.95f)
                    close()
                }
            ) {
                path(
                    fill = Brush.linearGradient(
                        colorStops = arrayOf(
                            0f to Color(0xFF2AA854),
                            1f to Color(0xFF219447)
                        ),
                        start = Offset(5.823f, 0.247f),
                        end = Offset(1.409f, 4.514f)
                    ),
                    strokeLineWidth = 1f,
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(3.5f, 1.793f)
                    lineTo(0.672f, -1.036f)
                    lineTo(-0.036f, -0.328f)
                    lineTo(2.793f, 2.5f)
                    lineTo(-0.036f, 5.328f)
                    lineTo(0.672f, 6.036f)
                    lineTo(3.5f, 3.207f)
                    lineTo(6.328f, 6.036f)
                    lineTo(7.036f, 5.328f)
                    lineTo(4.207f, 2.5f)
                    lineTo(7.036f, -0.328f)
                    lineTo(6.328f, -1.036f)
                    lineTo(3.5f, 1.793f)
                    close()
                }
            }
            group(
                clipPathData = PathData {
                    moveTo(0f, 0f)
                    horizontalLineToRelative(7f)
                    verticalLineToRelative(5f)
                    horizontalLineToRelative(-7f)
                    close()
                }
            ) {
                path(
                    fill = Brush.linearGradient(
                        colorStops = arrayOf(
                            0f to Color(0xFFFFFFFF),
                            1f to Color(0xFFF0F0F0)
                        ),
                        start = Offset(3.5f, -1f),
                        end = Offset(3.5f, 6f)
                    ),
                    strokeLineWidth = 1f,
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(4f, 2f)
                    lineTo(4f, -1f)
                    lineTo(3f, -1f)
                    lineTo(3f, 2f)
                    lineTo(0f, 2f)
                    lineTo(0f, 3f)
                    lineTo(3f, 3f)
                    lineTo(3f, 6f)
                    lineTo(4f, 6f)
                    lineTo(4f, 3f)
                    lineTo(7f, 3f)
                    lineTo(7f, 2f)
                    lineTo(4f, 2f)
                    close()
                }
                path(
                    fill = Brush.linearGradient(
                        colorStops = arrayOf(
                            0f to Color(0xFFFFFFFF),
                            1f to Color(0xFFF0F0F0)
                        ),
                        start = Offset(3.5f, 5f),
                        end = Offset(3.5f, 10f)
                    ),
                    strokeLineWidth = 1f,
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(0f, 5f)
                    horizontalLineToRelative(7f)
                    verticalLineToRelative(5f)
                    horizontalLineToRelative(-7f)
                    close()
                }
                path(
                    fill = Brush.linearGradient(
                        colorStops = arrayOf(
                            0f to Color(0xFF262626),
                            1f to Color(0xFF0D0D0D)
                        ),
                        start = Offset(3.5f, 6f),
                        end = Offset(3.5f, 9f)
                    ),
                    strokeLineWidth = 1f,
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(1.5f, 7f)
                    curveTo(1.224f, 7f, 1f, 6.776f, 1f, 6.5f)
                    curveTo(1f, 6.224f, 1.224f, 6f, 1.5f, 6f)
                    curveTo(1.776f, 6f, 2f, 6.224f, 2f, 6.5f)
                    curveTo(2f, 6.776f, 1.776f, 7f, 1.5f, 7f)
                    close()
                    moveTo(3.5f, 7f)
                    curveTo(3.224f, 7f, 3f, 6.776f, 3f, 6.5f)
                    curveTo(3f, 6.224f, 3.224f, 6f, 3.5f, 6f)
                    curveTo(3.776f, 6f, 4f, 6.224f, 4f, 6.5f)
                    curveTo(4f, 6.776f, 3.776f, 7f, 3.5f, 7f)
                    close()
                    moveTo(5.5f, 7f)
                    curveTo(5.224f, 7f, 5f, 6.776f, 5f, 6.5f)
                    curveTo(5f, 6.224f, 5.224f, 6f, 5.5f, 6f)
                    curveTo(5.776f, 6f, 6f, 6.224f, 6f, 6.5f)
                    curveTo(6f, 6.776f, 5.776f, 7f, 5.5f, 7f)
                    close()
                    moveTo(4.5f, 9f)
                    curveTo(4.224f, 9f, 4f, 8.776f, 4f, 8.5f)
                    curveTo(4f, 8.224f, 4.224f, 8f, 4.5f, 8f)
                    curveTo(4.776f, 8f, 5f, 8.224f, 5f, 8.5f)
                    curveTo(5f, 8.776f, 4.776f, 9f, 4.5f, 9f)
                    close()
                    moveTo(2.5f, 9f)
                    curveTo(2.224f, 9f, 2f, 8.776f, 2f, 8.5f)
                    curveTo(2f, 8.224f, 2.224f, 8f, 2.5f, 8f)
                    curveTo(2.776f, 8f, 3f, 8.224f, 3f, 8.5f)
                    curveTo(3f, 8.776f, 2.776f, 9f, 2.5f, 9f)
                    close()
                }
                path(
                    fill = Brush.linearGradient(
                        colorStops = arrayOf(
                            0f to Color(0xFFD7181D),
                            1f to Color(0xFFC60E13)
                        ),
                        start = Offset(3.5f, 10f),
                        end = Offset(3.5f, 15f)
                    ),
                    strokeLineWidth = 1f,
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(0f, 10f)
                    horizontalLineToRelative(7f)
                    verticalLineToRelative(5f)
                    horizontalLineToRelative(-7f)
                    close()
                }
                path(
                    fill = Brush.linearGradient(
                        colorStops = arrayOf(
                            0f to Color(0xFFFBCD3F),
                            1f to Color(0xFFFECB2F)
                        ),
                        start = Offset(3.5f, 11f),
                        end = Offset(3.5f, 14f)
                    ),
                    strokeLineWidth = 1f,
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(3.5f, 12f)
                    curveTo(2.119f, 12f, 1f, 11.776f, 1f, 11.5f)
                    curveTo(1f, 11.224f, 2.119f, 11f, 3.5f, 11f)
                    curveTo(4.881f, 11f, 6f, 11.224f, 6f, 11.5f)
                    curveTo(6f, 11.776f, 4.881f, 12f, 3.5f, 12f)
                    close()
                    moveTo(3.5f, 14f)
                    curveTo(2.119f, 14f, 1f, 13.776f, 1f, 13.5f)
                    curveTo(1f, 13.224f, 2.119f, 13f, 3.5f, 13f)
                    curveTo(4.881f, 13f, 6f, 13.224f, 6f, 13.5f)
                    curveTo(6f, 13.776f, 4.881f, 14f, 3.5f, 14f)
                    close()
                }
            }
        }.build()

        return _PM!!
    }

@Suppress("ObjectPropertyName")
private var _PM: ImageVector? = null
