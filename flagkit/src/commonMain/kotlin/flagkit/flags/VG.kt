package flagkit.flags

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import flagkit.FlagKit

val FlagKit.VG: ImageVector
    get() {
        if (_VG != null) {
            return _VG!!
        }
        _VG = ImageVector.Builder(
            name = "VG",
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
                        0f to Color(0xFF008339),
                        1f to Color(0xFF00612A)
                    ),
                    start = Offset(15.5f, 4f),
                    end = Offset(15.5f, 11f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13f, 7.5f)
                lineTo(13f, 4.999f)
                curveTo(13f, 4.447f, 13.444f, 4f, 14f, 4f)
                lineTo(17f, 4f)
                curveTo(17.552f, 4f, 18f, 4.441f, 18f, 4.999f)
                lineTo(18f, 7.5f)
                curveTo(18f, 10f, 15.5f, 11f, 15.5f, 11f)
                curveTo(15.5f, 11f, 13f, 10f, 13f, 7.5f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFD033),
                        1f to Color(0xFFFEC403)
                    ),
                    start = Offset(15.5f, 5f),
                    end = Offset(15.5f, 9f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(14.5f, 6f)
                curveTo(14.224f, 6f, 14f, 5.776f, 14f, 5.5f)
                curveTo(14f, 5.224f, 14.224f, 5f, 14.5f, 5f)
                curveTo(14.776f, 5f, 15f, 5.224f, 15f, 5.5f)
                curveTo(15f, 5.776f, 14.776f, 6f, 14.5f, 6f)
                close()
                moveTo(14.5f, 7f)
                curveTo(14.224f, 7f, 14f, 6.776f, 14f, 6.5f)
                curveTo(14f, 6.224f, 14.224f, 6f, 14.5f, 6f)
                curveTo(14.776f, 6f, 15f, 6.224f, 15f, 6.5f)
                curveTo(15f, 6.776f, 14.776f, 7f, 14.5f, 7f)
                close()
                moveTo(14.5f, 8f)
                curveTo(14.224f, 8f, 14f, 7.776f, 14f, 7.5f)
                curveTo(14f, 7.224f, 14.224f, 7f, 14.5f, 7f)
                curveTo(14.776f, 7f, 15f, 7.224f, 15f, 7.5f)
                curveTo(15f, 7.776f, 14.776f, 8f, 14.5f, 8f)
                close()
                moveTo(14.5f, 9f)
                curveTo(14.224f, 9f, 14f, 8.776f, 14f, 8.5f)
                curveTo(14f, 8.224f, 14.224f, 8f, 14.5f, 8f)
                curveTo(14.776f, 8f, 15f, 8.224f, 15f, 8.5f)
                curveTo(15f, 8.776f, 14.776f, 9f, 14.5f, 9f)
                close()
                moveTo(16.5f, 9f)
                curveTo(16.224f, 9f, 16f, 8.776f, 16f, 8.5f)
                curveTo(16f, 8.224f, 16.224f, 8f, 16.5f, 8f)
                curveTo(16.776f, 8f, 17f, 8.224f, 17f, 8.5f)
                curveTo(17f, 8.776f, 16.776f, 9f, 16.5f, 9f)
                close()
                moveTo(16.5f, 8f)
                curveTo(16.224f, 8f, 16f, 7.776f, 16f, 7.5f)
                curveTo(16f, 7.224f, 16.224f, 7f, 16.5f, 7f)
                curveTo(16.776f, 7f, 17f, 7.224f, 17f, 7.5f)
                curveTo(17f, 7.776f, 16.776f, 8f, 16.5f, 8f)
                close()
                moveTo(16.5f, 7f)
                curveTo(16.224f, 7f, 16f, 6.776f, 16f, 6.5f)
                curveTo(16f, 6.224f, 16.224f, 6f, 16.5f, 6f)
                curveTo(16.776f, 6f, 17f, 6.224f, 17f, 6.5f)
                curveTo(17f, 6.776f, 16.776f, 7f, 16.5f, 7f)
                close()
                moveTo(16.5f, 6f)
                curveTo(16.224f, 6f, 16f, 5.776f, 16f, 5.5f)
                curveTo(16f, 5.224f, 16.224f, 5f, 16.5f, 5f)
                curveTo(16.776f, 5f, 17f, 5.224f, 17f, 5.5f)
                curveTo(17f, 5.776f, 16.776f, 6f, 16.5f, 6f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFFFFF),
                        1f to Color(0xFFF0F0F0)
                    ),
                    start = Offset(15.5f, 5.5f),
                    end = Offset(15.5f, 8.5f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(14.5f, 7f)
                arcToRelative(1f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2f, 0f)
                arcToRelative(1f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, -2f, 0f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFD033),
                        1f to Color(0xFFFEC403)
                    ),
                    start = Offset(15.5f, 9.5f),
                    end = Offset(15.5f, 11.5f)
                ),
                strokeLineWidth = 1f
            ) {
                moveTo(12.5f, 10f)
                curveTo(12.5f, 10.954f, 13.866f, 11.5f, 15.5f, 11.5f)
                curveTo(17.134f, 11.5f, 18.5f, 10.954f, 18.5f, 10f)
                curveTo(18.5f, 9.724f, 18.276f, 9.5f, 18f, 9.5f)
                curveTo(17.724f, 9.5f, 17.5f, 9.724f, 17.5f, 10f)
                curveTo(17.5f, 10.01f, 17.379f, 10.124f, 17.082f, 10.243f)
                curveTo(16.679f, 10.404f, 16.112f, 10.5f, 15.5f, 10.5f)
                curveTo(14.888f, 10.5f, 14.321f, 10.404f, 13.918f, 10.243f)
                curveTo(13.621f, 10.124f, 13.5f, 10.01f, 13.5f, 10f)
                curveTo(13.5f, 9.724f, 13.276f, 9.5f, 13f, 9.5f)
                curveTo(12.724f, 9.5f, 12.5f, 9.724f, 12.5f, 10f)
                lineTo(12.5f, 10f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFFFFF),
                        1f to Color(0xFFF0F0F0)
                    ),
                    start = Offset(4.074f, -0.902f),
                    end = Offset(4.074f, 7.902f)
                ),
                strokeLineWidth = 1f
            ) {
                moveTo(3f, 3.23f)
                lineTo(-1.352f, -0.5f)
                lineTo(0.66f, -0.5f)
                lineTo(4.16f, 2f)
                lineTo(4.857f, 2f)
                lineTo(9.5f, -0.902f)
                lineTo(9.5f, 0.25f)
                curveTo(9.5f, 0.553f, 9.333f, 0.877f, 9.082f, 1.056f)
                lineTo(6f, 3.257f)
                lineTo(6f, 3.77f)
                lineTo(9.137f, 6.459f)
                curveTo(9.599f, 6.855f, 9.341f, 7.5f, 8.75f, 7.5f)
                curveTo(8.505f, 7.5f, 8.205f, 7.404f, 8.001f, 7.258f)
                lineTo(4.84f, 5f)
                lineTo(4.143f, 5f)
                lineTo(-0.5f, 7.902f)
                lineTo(-0.5f, 6.243f)
                lineTo(3f, 3.743f)
                lineTo(3f, 3.23f)
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
        }.build()

        return _VG!!
    }

@Suppress("ObjectPropertyName")
private var _VG: ImageVector? = null
