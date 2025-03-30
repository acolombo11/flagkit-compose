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

val FlagKit.AG: ImageVector
    get() {
        if (_AG != null) {
            return _AG!!
        }
        _AG = ImageVector.Builder(
            name = "AG",
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
                fill = SolidColor(Color(0xFFFFFFFF)),
                fillAlpha = 0.5f,
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9.5f, 6.5f)
                arcToRelative(1f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2f, 0f)
                arcToRelative(1f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, -2f, 0f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFE2243B),
                        1f to Color(0xFFCC162C)
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
                        0f to Color(0xFF262626),
                        1f to Color(0xFF0D0D0D)
                    ),
                    start = Offset(10.5f, 0f),
                    end = Offset(10.5f, 15f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                lineToRelative(21f, 0f)
                lineToRelative(-10.5f, 15f)
                close()
            }
            group(
                clipPathData = PathData {
                    moveTo(0f, 0f)
                    lineToRelative(21f, 0f)
                    lineToRelative(-10.5f, 15f)
                    close()
                }
            ) {
                path(
                    fill = Brush.linearGradient(
                        colorStops = arrayOf(
                            0f to Color(0xFFFFCF3C),
                            1f to Color(0xFFFECB2F)
                        ),
                        start = Offset(10.5f, 1.5f),
                        end = Offset(10.5f, 10.157f)
                    ),
                    strokeLineWidth = 1f,
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(10.5f, 8.25f)
                    lineToRelative(-1.722f, 1.907f)
                    lineToRelative(0.131f, -2.566f)
                    lineToRelative(-2.566f, 0.131f)
                    lineToRelative(1.907f, -1.722f)
                    lineToRelative(-2.25f, -2f)
                    lineToRelative(2.909f, 0.5f)
                    lineToRelative(-0.409f, -3f)
                    lineToRelative(2f, 2.5f)
                    lineToRelative(2f, -2.5f)
                    lineToRelative(-0.409f, 3f)
                    lineToRelative(2.909f, -0.5f)
                    lineToRelative(-2.25f, 2f)
                    lineToRelative(1.907f, 1.722f)
                    lineToRelative(-2.566f, -0.131f)
                    lineToRelative(0.131f, 2.566f)
                    close()
                }
            }
            group(
                clipPathData = PathData {
                    moveTo(0f, 0f)
                    lineToRelative(21f, 0f)
                    lineToRelative(-10.5f, 15f)
                    close()
                }
            ) {
                path(
                    fill = Brush.linearGradient(
                        colorStops = arrayOf(
                            0f to Color(0xFF1984D8),
                            1f to Color(0xFF1175C4)
                        ),
                        start = Offset(10.5f, 6f),
                        end = Offset(10.5f, 10f)
                    ),
                    strokeLineWidth = 1f,
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(0f, 6f)
                    horizontalLineToRelative(21f)
                    verticalLineToRelative(4f)
                    horizontalLineToRelative(-21f)
                    close()
                }
            }
            group(
                clipPathData = PathData {
                    moveTo(0f, 0f)
                    lineToRelative(21f, 0f)
                    lineToRelative(-10.5f, 15f)
                    close()
                }
            ) {
                path(
                    fill = Brush.linearGradient(
                        colorStops = arrayOf(
                            0f to Color(0xFFFFFFFF),
                            1f to Color(0xFFF0F0F0)
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
            }
        }.build()

        return _AG!!
    }

@Suppress("ObjectPropertyName")
private var _AG: ImageVector? = null
