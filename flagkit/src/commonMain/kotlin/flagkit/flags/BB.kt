package flagkit.flags

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import flagkit.FlagKit

val FlagKit.BB: ImageVector
    get() {
        if (_BB != null) {
            return _BB!!
        }
        _BB = ImageVector.Builder(
            name = "BB",
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
                        0f to Color(0xFF1132C7),
                        1f to Color(0xFF0522A5)
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
                        0f to Color(0xFF08379D),
                        1f to Color(0xFF042A7D)
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
                        0f to Color(0xFF08379D),
                        1f to Color(0xFF042A7D)
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
                        0f to Color(0xFFFFCC50),
                        1f to Color(0xFFFFC63C)
                    ),
                    start = Offset(10.5f, 0f),
                    end = Offset(10.5f, 15f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7f, 0f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(-7f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF262626),
                        1f to Color(0xFF0D0D0D)
                    ),
                    start = Offset(10.501f, 4.624f),
                    end = Offset(10.501f, 10.5f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.378f, 4.709f)
                curveTo(10.457f, 4.593f, 10.584f, 4.598f, 10.656f, 4.709f)
                lineTo(11.364f, 5.791f)
                curveTo(11.439f, 5.907f, 11.383f, 6f, 11.246f, 6f)
                lineTo(11.004f, 6f)
                curveTo(10.864f, 6f, 10.761f, 6.107f, 10.775f, 6.249f)
                lineTo(10.975f, 8.251f)
                curveTo(10.989f, 8.389f, 11.116f, 8.5f, 11.25f, 8.5f)
                curveTo(11.388f, 8.5f, 11.578f, 8.423f, 11.681f, 8.321f)
                lineTo(11.819f, 8.184f)
                curveTo(11.919f, 8.085f, 12f, 7.898f, 12f, 7.752f)
                lineTo(12f, 7.254f)
                curveTo(12f, 7.114f, 11.922f, 6.922f, 11.819f, 6.819f)
                lineTo(11.681f, 6.681f)
                curveTo(11.581f, 6.581f, 11.598f, 6.467f, 11.734f, 6.422f)
                lineTo(12.766f, 6.078f)
                curveTo(12.895f, 6.035f, 12.98f, 6.107f, 12.954f, 6.249f)
                lineTo(12.586f, 8.251f)
                curveTo(12.561f, 8.389f, 12.459f, 8.578f, 12.359f, 8.674f)
                lineTo(11.681f, 9.326f)
                curveTo(11.581f, 9.422f, 11.384f, 9.5f, 11.25f, 9.5f)
                curveTo(11.112f, 9.5f, 11f, 9.607f, 11f, 9.752f)
                lineTo(11f, 10.248f)
                curveTo(11f, 10.387f, 10.893f, 10.5f, 10.748f, 10.5f)
                lineTo(10.252f, 10.5f)
                curveTo(10.113f, 10.5f, 10f, 10.393f, 10f, 10.248f)
                lineTo(10f, 9.752f)
                curveTo(10f, 9.613f, 9.884f, 9.5f, 9.75f, 9.5f)
                curveTo(9.612f, 9.5f, 9.422f, 9.422f, 9.326f, 9.326f)
                lineTo(8.674f, 8.674f)
                curveTo(8.578f, 8.578f, 8.479f, 8.393f, 8.45f, 8.251f)
                lineTo(8.05f, 6.249f)
                curveTo(8.022f, 6.111f, 8.098f, 6.033f, 8.234f, 6.078f)
                lineTo(9.266f, 6.422f)
                curveTo(9.395f, 6.465f, 9.422f, 6.578f, 9.319f, 6.681f)
                lineTo(9.181f, 6.819f)
                curveTo(9.081f, 6.919f, 9f, 7.108f, 9f, 7.254f)
                lineTo(9f, 7.752f)
                curveTo(9f, 7.892f, 9.078f, 8.083f, 9.181f, 8.184f)
                lineTo(9.319f, 8.321f)
                curveTo(9.419f, 8.42f, 9.616f, 8.5f, 9.75f, 8.5f)
                curveTo(9.888f, 8.5f, 10.011f, 8.393f, 10.025f, 8.251f)
                lineTo(10.225f, 6.249f)
                curveTo(10.239f, 6.111f, 10.133f, 6f, 9.996f, 6f)
                lineTo(9.754f, 6f)
                curveTo(9.614f, 6f, 9.567f, 5.902f, 9.642f, 5.791f)
                lineTo(10.378f, 4.709f)
                close()
            }
        }.build()

        return _BB!!
    }

@Suppress("ObjectPropertyName")
private var _BB: ImageVector? = null
