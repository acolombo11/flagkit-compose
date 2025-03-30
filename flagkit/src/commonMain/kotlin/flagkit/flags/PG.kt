package flagkit.flags

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import flagkit.FlagKit

val FlagKit.PG: ImageVector
    get() {
        if (_PG != null) {
            return _PG!!
        }
        _PG = ImageVector.Builder(
            name = "PG",
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
                horizontalLineToRelative(21f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(-21f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFE8283F),
                        1f to Color(0xFFCC162C)
                    ),
                    start = Offset(10.5f, 0f),
                    end = Offset(10.5f, 15f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                lineToRelative(21f, 0f)
                lineToRelative(0f, 15f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFFFFF),
                        1f to Color(0xFFF0F0F0)
                    ),
                    start = Offset(5f, 11.293f),
                    end = Offset(5f, 12.707f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5f, 12.5f)
                lineToRelative(-0.707f, 0.207f)
                lineToRelative(0.207f, -0.707f)
                lineToRelative(-0.207f, -0.707f)
                lineToRelative(0.707f, 0.207f)
                lineToRelative(0.707f, -0.207f)
                lineToRelative(-0.207f, 0.707f)
                lineToRelative(0.207f, 0.707f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFFFFF),
                        1f to Color(0xFFF0F0F0)
                    ),
                    start = Offset(5f, 5.293f),
                    end = Offset(5f, 6.707f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5f, 6.5f)
                lineToRelative(-0.707f, 0.207f)
                lineToRelative(0.207f, -0.707f)
                lineToRelative(-0.207f, -0.707f)
                lineToRelative(0.707f, 0.207f)
                lineToRelative(0.707f, -0.207f)
                lineToRelative(-0.207f, 0.707f)
                lineToRelative(0.207f, 0.707f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFFFFF),
                        1f to Color(0xFFF0F0F0)
                    ),
                    start = Offset(2.5f, 7.793f),
                    end = Offset(2.5f, 9.207f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(2.5f, 9f)
                lineToRelative(-0.707f, 0.207f)
                lineToRelative(0.207f, -0.707f)
                lineToRelative(-0.207f, -0.707f)
                lineToRelative(0.707f, 0.207f)
                lineToRelative(0.707f, -0.207f)
                lineToRelative(-0.207f, 0.707f)
                lineToRelative(0.207f, 0.707f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFFFFF),
                        1f to Color(0xFFF0F0F0)
                    ),
                    start = Offset(7f, 7.293f),
                    end = Offset(7f, 8.707f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7f, 8.5f)
                lineToRelative(-0.707f, 0.207f)
                lineToRelative(0.207f, -0.707f)
                lineToRelative(-0.207f, -0.707f)
                lineToRelative(0.707f, 0.207f)
                lineToRelative(0.707f, -0.207f)
                lineToRelative(-0.207f, 0.707f)
                lineToRelative(0.207f, 0.707f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFD84E),
                        1f to Color(0xFFFCD036)
                    ),
                    start = Offset(14.831f, 2f),
                    end = Offset(14.831f, 7.783f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(14.146f, 6.949f)
                curveTo(14.026f, 6.877f, 13.929f, 6.708f, 13.929f, 6.573f)
                lineTo(13.929f, 5.651f)
                curveTo(13.929f, 5.515f, 13.831f, 5.438f, 13.683f, 5.487f)
                lineTo(13.115f, 5.676f)
                curveTo(12.979f, 5.722f, 12.771f, 5.726f, 12.623f, 5.676f)
                lineTo(12.054f, 5.487f)
                curveTo(11.918f, 5.442f, 11.903f, 5.348f, 12.025f, 5.275f)
                lineTo(13.359f, 4.474f)
                curveTo(13.479f, 4.402f, 13.543f, 4.246f, 13.494f, 4.098f)
                lineTo(13.304f, 3.53f)
                curveTo(13.259f, 3.394f, 13.32f, 3.316f, 13.468f, 3.366f)
                lineTo(14.037f, 3.555f)
                curveTo(14.173f, 3.6f, 14.34f, 3.542f, 14.413f, 3.42f)
                lineTo(15.213f, 2.086f)
                curveTo(15.285f, 1.966f, 15.376f, 1.967f, 15.425f, 2.115f)
                lineTo(15.615f, 2.684f)
                curveTo(15.66f, 2.82f, 15.664f, 3.028f, 15.615f, 3.176f)
                lineTo(15.425f, 3.745f)
                curveTo(15.38f, 3.881f, 15.454f, 3.991f, 15.59f, 3.991f)
                lineTo(16.511f, 3.991f)
                curveTo(16.647f, 3.991f, 16.815f, 4.086f, 16.888f, 4.207f)
                lineTo(17.688f, 5.542f)
                curveTo(17.76f, 5.661f, 17.702f, 5.782f, 17.572f, 5.808f)
                lineTo(16.296f, 6.063f)
                curveTo(16.161f, 6.09f, 16.027f, 6.228f, 16.001f, 6.358f)
                lineTo(15.746f, 7.634f)
                curveTo(15.719f, 7.77f, 15.602f, 7.823f, 15.48f, 7.75f)
                lineTo(14.146f, 6.949f)
                lineTo(14.146f, 6.949f)
                close()
            }
        }.build()

        return _PG!!
    }

@Suppress("ObjectPropertyName")
private var _PG: ImageVector? = null
