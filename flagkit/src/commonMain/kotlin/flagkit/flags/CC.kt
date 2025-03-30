package flagkit.flags

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import flagkit.FlagKit

val FlagKit.CC: ImageVector
    get() {
        if (_CC != null) {
            return _CC!!
        }
        _CC = ImageVector.Builder(
            name = "CC",
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
                        0f to Color(0xFF229716),
                        1f to Color(0xFF1C7E12)
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
                        0f to Color(0xFFFFE244),
                        1f to Color(0xFFFFDF32)
                    ),
                    start = Offset(4f, 2f),
                    end = Offset(4f, 6f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4f, 6f)
                curveTo(2.895f, 6f, 2f, 5.105f, 2f, 4f)
                curveTo(2f, 2.895f, 2.895f, 2f, 4f, 2f)
                curveTo(5.105f, 2f, 6f, 2.895f, 6f, 4f)
                curveTo(6f, 5.105f, 5.105f, 6f, 4f, 6f)
                close()
                moveTo(4f, 4f)
                curveTo(4.208f, 4f, 3.84f, 5.054f, 4f, 5f)
                curveTo(4.265f, 4.91f, 5f, 3.672f, 5f, 3.5f)
                curveTo(5f, 3.224f, 4.552f, 3f, 4f, 3f)
                curveTo(3.448f, 3f, 3f, 3.224f, 3f, 3.5f)
                curveTo(3f, 3.776f, 3.448f, 4f, 4f, 4f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFE244),
                        1f to Color(0xFFFFDF32)
                    ),
                    start = Offset(16f, 11.793f),
                    end = Offset(16f, 13.207f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(16f, 13f)
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
                        0f to Color(0xFFFFE244),
                        1f to Color(0xFFFFDF32)
                    ),
                    start = Offset(16f, 2.293f),
                    end = Offset(16f, 3.707f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(16f, 3.5f)
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
                        0f to Color(0xFFFFE244),
                        1f to Color(0xFFFFDF32)
                    ),
                    start = Offset(19f, 5.293f),
                    end = Offset(19f, 6.707f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(19f, 6.5f)
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
                        0f to Color(0xFFFFE244),
                        1f to Color(0xFFFFDF32)
                    ),
                    start = Offset(14f, 6.293f),
                    end = Offset(14f, 7.707f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(14f, 7.5f)
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
                        0f to Color(0xFFFFE244),
                        1f to Color(0xFFFFDF32)
                    ),
                    start = Offset(17.5f, 8.146f),
                    end = Offset(17.5f, 8.854f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(17.5f, 8.75f)
                lineToRelative(-0.354f, 0.104f)
                lineToRelative(0.104f, -0.354f)
                lineToRelative(-0.104f, -0.354f)
                lineToRelative(0.354f, 0.104f)
                lineToRelative(0.354f, -0.104f)
                lineToRelative(-0.104f, 0.354f)
                lineToRelative(0.104f, 0.354f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFE244),
                        1f to Color(0xFFFFDF32)
                    ),
                    start = Offset(10.03f, 5f),
                    end = Offset(10.03f, 10f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12.061f, 5.547f)
                curveTo(11.634f, 5.205f, 11.091f, 5f, 10.5f, 5f)
                curveTo(9.119f, 5f, 8f, 6.119f, 8f, 7.5f)
                curveTo(8f, 8.881f, 9.119f, 10f, 10.5f, 10f)
                curveTo(11.091f, 10f, 11.634f, 9.795f, 12.061f, 9.453f)
                curveTo(11.835f, 9.537f, 11.589f, 9.583f, 11.333f, 9.583f)
                curveTo(10.183f, 9.583f, 9.25f, 8.651f, 9.25f, 7.5f)
                curveTo(9.25f, 6.349f, 10.183f, 5.417f, 11.333f, 5.417f)
                curveTo(11.589f, 5.417f, 11.835f, 5.463f, 12.061f, 5.547f)
                lineTo(12.061f, 5.547f)
                close()
            }
        }.build()

        return _CC!!
    }

@Suppress("ObjectPropertyName")
private var _CC: ImageVector? = null
