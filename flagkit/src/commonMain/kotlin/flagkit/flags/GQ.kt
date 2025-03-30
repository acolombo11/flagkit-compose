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

val FlagKit.GQ: ImageVector
    get() {
        if (_GQ != null) {
            return _GQ!!
        }
        _GQ = ImageVector.Builder(
            name = "GQ",
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
                        0f to Color(0xFFEC3938),
                        1f to Color(0xFFE12524)
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
                        0f to Color(0xFF51B422),
                        1f to Color(0xFF429919)
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
                fill = SolidColor(Color(0xFF159940)),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.066f, 8.932f)
                curveTo(10.162f, 8.831f, 10.241f, 8.635f, 10.241f, 8.507f)
                lineTo(10.249f, 7.243f)
                curveTo(10.249f, 7.109f, 10.133f, 7f, 9.996f, 7f)
                lineTo(9.754f, 7f)
                curveTo(9.614f, 7f, 9.578f, 6.922f, 9.674f, 6.826f)
                lineTo(10.326f, 6.174f)
                curveTo(10.422f, 6.078f, 10.578f, 6.078f, 10.674f, 6.174f)
                lineTo(11.326f, 6.826f)
                curveTo(11.422f, 6.922f, 11.383f, 7f, 11.246f, 7f)
                lineTo(11.004f, 7f)
                curveTo(10.864f, 7f, 10.75f, 7.115f, 10.75f, 7.243f)
                lineTo(10.75f, 8.507f)
                curveTo(10.75f, 8.641f, 10.829f, 8.829f, 10.921f, 8.921f)
                lineTo(10.829f, 8.829f)
                curveTo(10.923f, 8.923f, 10.893f, 9f, 10.748f, 9f)
                lineTo(10.252f, 9f)
                curveTo(10.113f, 9f, 10.076f, 8.921f, 10.174f, 8.818f)
                lineTo(10.066f, 8.932f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF258DE7),
                        1f to Color(0xFF1276CC)
                    ),
                    start = Offset(3.5f, 0f),
                    end = Offset(3.5f, 15f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                lineToRelative(7f, 7.5f)
                lineToRelative(-7f, 7.5f)
                close()
            }
        }.build()

        return _GQ!!
    }

@Suppress("ObjectPropertyName")
private var _GQ: ImageVector? = null
