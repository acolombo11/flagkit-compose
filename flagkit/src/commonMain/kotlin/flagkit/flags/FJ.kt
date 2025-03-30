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

val FlagKit.FJ: ImageVector
    get() {
        if (_FJ != null) {
            return _FJ!!
        }
        _FJ = ImageVector.Builder(
            name = "FJ",
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
                        0f to Color(0xFF79CFF6),
                        1f to Color(0xFF68BFE6)
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
                        0f to Color(0xFF042C90),
                        1f to Color(0xFF00247E)
                    ),
                    start = Offset(4.5f, 0f),
                    end = Offset(4.5f, 7f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-9f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFFFFF),
                        1f to Color(0xFFF0F0F0)
                    ),
                    start = Offset(15.5f, 4f),
                    end = Offset(15.5f, 11f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13f, 7.5f)
                lineTo(13f, 4f)
                lineTo(18f, 4f)
                lineTo(18f, 7.5f)
                curveTo(18f, 10f, 15.5f, 11f, 15.5f, 11f)
                curveTo(15.5f, 11f, 13f, 10f, 13f, 7.5f)
                close()
            }
            group(
                clipPathData = PathData {
                    moveTo(13f, 7.5f)
                    lineTo(13f, 4f)
                    lineTo(18f, 4f)
                    lineTo(18f, 7.5f)
                    curveTo(18f, 10f, 15.5f, 11f, 15.5f, 11f)
                    curveTo(15.5f, 11f, 13f, 10f, 13f, 7.5f)
                    close()
                }
            ) {
                path(
                    fill = SolidColor(Color(0xFF2A915C)),
                    strokeLineWidth = 1f,
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(14f, 6.5f)
                    curveTo(13.724f, 6.5f, 13.5f, 6.276f, 13.5f, 6f)
                    curveTo(13.5f, 5.724f, 13.724f, 5.5f, 14f, 5.5f)
                    curveTo(14.276f, 5.5f, 14.5f, 5.724f, 14.5f, 6f)
                    curveTo(14.5f, 6.276f, 14.276f, 6.5f, 14f, 6.5f)
                    close()
                    moveTo(17f, 6.5f)
                    curveTo(16.724f, 6.5f, 16.5f, 6.276f, 16.5f, 6f)
                    curveTo(16.5f, 5.724f, 16.724f, 5.5f, 17f, 5.5f)
                    curveTo(17.276f, 5.5f, 17.5f, 5.724f, 17.5f, 6f)
                    curveTo(17.5f, 6.276f, 17.276f, 6.5f, 17f, 6.5f)
                    close()
                }
            }
            group(
                clipPathData = PathData {
                    moveTo(13f, 7.5f)
                    lineTo(13f, 4f)
                    lineTo(18f, 4f)
                    lineTo(18f, 7.5f)
                    curveTo(18f, 10f, 15.5f, 11f, 15.5f, 11f)
                    curveTo(15.5f, 11f, 13f, 10f, 13f, 7.5f)
                    close()
                }
            ) {
                path(
                    fill = Brush.linearGradient(
                        colorStops = arrayOf(
                            0f to Color(0xFFEB1D43),
                            1f to Color(0xFFD21034)
                        ),
                        start = Offset(15.5f, 4f),
                        end = Offset(15.5f, 11f)
                    ),
                    strokeLineWidth = 1f,
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(13f, 4f)
                    lineToRelative(5f, 0f)
                    lineToRelative(0f, 1f)
                    lineToRelative(-2f, 0f)
                    lineToRelative(0f, 2f)
                    lineToRelative(2f, 0f)
                    lineToRelative(0f, 1f)
                    lineToRelative(-2f, 0f)
                    lineToRelative(0f, 3f)
                    lineToRelative(-1f, 0f)
                    lineToRelative(0f, -3f)
                    lineToRelative(-2f, 0f)
                    lineToRelative(0f, -1f)
                    lineToRelative(2f, 0f)
                    lineToRelative(0f, -2f)
                    lineToRelative(-2f, 0f)
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

        return _FJ!!
    }

@Suppress("ObjectPropertyName")
private var _FJ: ImageVector? = null
