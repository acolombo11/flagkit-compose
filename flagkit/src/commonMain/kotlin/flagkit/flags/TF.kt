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

val FlagKit.TF: ImageVector
    get() {
        if (_TF != null) {
            return _TF!!
        }
        _TF = ImageVector.Builder(
            name = "TF",
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
                        0f to Color(0xFF073AB6),
                        1f to Color(0xFF002B93)
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
                        0f to Color(0xFFFFFFFF),
                        1f to Color(0xFFF0F0F0)
                    ),
                    start = Offset(4.75f, 0f),
                    end = Offset(4.75f, 7.5f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                lineTo(9.5f, 0f)
                lineTo(9.5f, 7.25f)
                curveTo(9.5f, 7.388f, 9.393f, 7.5f, 9.246f, 7.5f)
                lineTo(0f, 7.5f)
                lineTo(0f, 0f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFF44653),
                        1f to Color(0xFFEE2A39)
                    ),
                    start = Offset(7.5f, 0f),
                    end = Offset(7.5f, 7f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6f, 0f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-3f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF1035BB),
                        1f to Color(0xFF042396)
                    ),
                    start = Offset(1.5f, 0f),
                    end = Offset(1.5f, 7f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-3f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFFFFF),
                        1f to Color(0xFFF0F0F0)
                    ),
                    start = Offset(4.5f, 0f),
                    end = Offset(4.5f, 7f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3f, 0f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-3f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13f, 6f)
                lineTo(18f, 6f)
                lineTo(17.5f, 7f)
                lineTo(16f, 7f)
                lineTo(16f, 7.5f)
                lineTo(17f, 7.5f)
                lineTo(16.5f, 8.5f)
                lineTo(16f, 8.5f)
                lineTo(16f, 10f)
                lineTo(15f, 10f)
                lineTo(15f, 7f)
                lineTo(13.5f, 7f)
                lineTo(13f, 6f)
                close()
                moveTo(17f, 8.5f)
                lineTo(18f, 10f)
                lineTo(16f, 10f)
                lineTo(17f, 8.5f)
                close()
                moveTo(14f, 8.5f)
                lineTo(15f, 10f)
                lineTo(13f, 10f)
                lineTo(14f, 8.5f)
                close()
                moveTo(15.5f, 11.5f)
                lineTo(14.5f, 10f)
                lineTo(16.5f, 10f)
                lineTo(15.5f, 11.5f)
                close()
                moveTo(18.5f, 8f)
                curveTo(18.224f, 8f, 18f, 7.776f, 18f, 7.5f)
                curveTo(18f, 7.224f, 18.224f, 7f, 18.5f, 7f)
                curveTo(18.776f, 7f, 19f, 7.224f, 19f, 7.5f)
                curveTo(19f, 7.776f, 18.776f, 8f, 18.5f, 8f)
                close()
                moveTo(12.5f, 8f)
                curveTo(12.224f, 8f, 12f, 7.776f, 12f, 7.5f)
                curveTo(12f, 7.224f, 12.224f, 7f, 12.5f, 7f)
                curveTo(12.776f, 7f, 13f, 7.224f, 13f, 7.5f)
                curveTo(13f, 7.776f, 12.776f, 8f, 12.5f, 8f)
                close()
                moveTo(13.5f, 12f)
                curveTo(13.224f, 12f, 13f, 11.776f, 13f, 11.5f)
                curveTo(13f, 11.224f, 13.224f, 11f, 13.5f, 11f)
                curveTo(13.776f, 11f, 14f, 11.224f, 14f, 11.5f)
                curveTo(14f, 11.776f, 13.776f, 12f, 13.5f, 12f)
                close()
                moveTo(17.5f, 12f)
                curveTo(17.224f, 12f, 17f, 11.776f, 17f, 11.5f)
                curveTo(17f, 11.224f, 17.224f, 11f, 17.5f, 11f)
                curveTo(17.776f, 11f, 18f, 11.224f, 18f, 11.5f)
                curveTo(18f, 11.776f, 17.776f, 12f, 17.5f, 12f)
                close()
                moveTo(15.5f, 13f)
                curveTo(15.224f, 13f, 15f, 12.776f, 15f, 12.5f)
                curveTo(15f, 12.224f, 15.224f, 12f, 15.5f, 12f)
                curveTo(15.776f, 12f, 16f, 12.224f, 16f, 12.5f)
                curveTo(16f, 12.776f, 15.776f, 13f, 15.5f, 13f)
                close()
            }
        }.build()

        return _TF!!
    }

@Suppress("ObjectPropertyName")
private var _TF: ImageVector? = null
