package flagkit.flags

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import flagkit.FlagKit

val FlagKit.CA: ImageVector
    get() {
        if (_CA != null) {
            return _CA!!
        }
        _CA = ImageVector.Builder(
            name = "CA",
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
                        0f to Color(0xFFFF3131),
                        1f to Color(0xFFFF0000)
                    ),
                    start = Offset(15.5f, 0f),
                    end = Offset(15.5f, 15f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10f, 0f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(-11f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFF3131),
                        1f to Color(0xFFFF0000)
                    ),
                    start = Offset(3.5f, 0f),
                    end = Offset(3.5f, 15f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(-7f)
                close()
            }
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
                moveTo(6f, 0f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(-9f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFF3131),
                        1f to Color(0xFFFF0000)
                    ),
                    start = Offset(10.5f, 4f),
                    end = Offset(10.5f, 11f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11.674f, 7.326f)
                lineTo(12.326f, 6.674f)
                curveTo(12.422f, 6.578f, 12.581f, 6.581f, 12.681f, 6.681f)
                lineTo(13f, 7f)
                lineTo(14f, 6.5f)
                lineTo(13.5f, 7.5f)
                lineTo(13.819f, 7.819f)
                curveTo(13.922f, 7.922f, 13.923f, 8.077f, 13.828f, 8.172f)
                lineTo(12.5f, 9.5f)
                lineTo(11f, 9.5f)
                lineTo(10.75f, 11f)
                lineTo(10.25f, 11f)
                lineTo(10f, 9.5f)
                lineTo(8.5f, 9.5f)
                lineTo(7.172f, 8.172f)
                curveTo(7.081f, 8.081f, 7.081f, 7.919f, 7.181f, 7.819f)
                lineTo(7.5f, 7.5f)
                lineTo(7f, 6.5f)
                lineTo(8f, 7f)
                lineTo(8.319f, 6.681f)
                curveTo(8.422f, 6.578f, 8.578f, 6.578f, 8.674f, 6.674f)
                lineTo(9.326f, 7.326f)
                curveTo(9.422f, 7.422f, 9.478f, 7.389f, 9.45f, 7.251f)
                lineTo(9f, 5f)
                lineTo(10f, 5.5f)
                lineTo(10.5f, 4f)
                lineTo(11f, 5.5f)
                lineTo(12f, 5f)
                lineTo(11.55f, 7.251f)
                curveTo(11.521f, 7.393f, 11.578f, 7.422f, 11.674f, 7.326f)
                close()
            }
        }.build()

        return _CA!!
    }

@Suppress("ObjectPropertyName")
private var _CA: ImageVector? = null
