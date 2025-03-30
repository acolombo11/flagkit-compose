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

val FlagKit.CK: ImageVector
    get() {
        if (_CK != null) {
            return _CK!!
        }
        _CK = ImageVector.Builder(
            name = "CK",
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
                        0f to Color(0xFF0A17A7),
                        1f to Color(0xFF030E88)
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
                lineTo(-0f, 0f)
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
                lineTo(-0f, 7f)
                lineTo(-0f, 6.5f)
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
                moveTo(-0f, 2.5f)
                lineTo(-0f, 4.5f)
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
                lineTo(-0f, 2.5f)
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
                moveTo(-0f, 3f)
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
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(15.5f, 5f)
                curveTo(15.224f, 5f, 15f, 4.776f, 15f, 4.5f)
                curveTo(15f, 4.224f, 15.224f, 4f, 15.5f, 4f)
                curveTo(15.776f, 4f, 16f, 4.224f, 16f, 4.5f)
                curveTo(16f, 4.776f, 15.776f, 5f, 15.5f, 5f)
                close()
                moveTo(15.5f, 11f)
                curveTo(15.224f, 11f, 15f, 10.776f, 15f, 10.5f)
                curveTo(15f, 10.224f, 15.224f, 10f, 15.5f, 10f)
                curveTo(15.776f, 10f, 16f, 10.224f, 16f, 10.5f)
                curveTo(16f, 10.776f, 15.776f, 11f, 15.5f, 11f)
                close()
                moveTo(13f, 7.5f)
                curveTo(13f, 7.776f, 12.776f, 8f, 12.5f, 8f)
                curveTo(12.224f, 8f, 12f, 7.776f, 12f, 7.5f)
                curveTo(12f, 7.224f, 12.224f, 7f, 12.5f, 7f)
                curveTo(12.776f, 7f, 13f, 7.224f, 13f, 7.5f)
                close()
                moveTo(19f, 7.5f)
                curveTo(19f, 7.776f, 18.776f, 8f, 18.5f, 8f)
                curveTo(18.224f, 8f, 18f, 7.776f, 18f, 7.5f)
                curveTo(18f, 7.224f, 18.224f, 7f, 18.5f, 7f)
                curveTo(18.776f, 7f, 19f, 7.224f, 19f, 7.5f)
                close()
                moveTo(13.732f, 9.268f)
                curveTo(13.927f, 9.463f, 13.927f, 9.78f, 13.732f, 9.975f)
                curveTo(13.537f, 10.17f, 13.22f, 10.17f, 13.025f, 9.975f)
                curveTo(12.83f, 9.78f, 12.83f, 9.463f, 13.025f, 9.268f)
                curveTo(13.22f, 9.073f, 13.537f, 9.073f, 13.732f, 9.268f)
                close()
                moveTo(17.975f, 5.025f)
                curveTo(18.17f, 5.22f, 18.17f, 5.537f, 17.975f, 5.732f)
                curveTo(17.78f, 5.927f, 17.463f, 5.927f, 17.268f, 5.732f)
                curveTo(17.073f, 5.537f, 17.073f, 5.22f, 17.268f, 5.025f)
                curveTo(17.463f, 4.83f, 17.78f, 4.83f, 17.975f, 5.025f)
                close()
                moveTo(17.268f, 9.268f)
                curveTo(17.463f, 9.073f, 17.78f, 9.073f, 17.975f, 9.268f)
                curveTo(18.17f, 9.463f, 18.17f, 9.78f, 17.975f, 9.975f)
                curveTo(17.78f, 10.17f, 17.463f, 10.17f, 17.268f, 9.975f)
                curveTo(17.073f, 9.78f, 17.073f, 9.463f, 17.268f, 9.268f)
                close()
                moveTo(13.025f, 5.025f)
                curveTo(13.22f, 4.83f, 13.537f, 4.83f, 13.732f, 5.025f)
                curveTo(13.927f, 5.22f, 13.927f, 5.537f, 13.732f, 5.732f)
                curveTo(13.537f, 5.927f, 13.22f, 5.927f, 13.025f, 5.732f)
                curveTo(12.83f, 5.537f, 12.83f, 5.22f, 13.025f, 5.025f)
                close()
            }
        }.build()

        return _CK!!
    }

@Suppress("ObjectPropertyName")
private var _CK: ImageVector? = null
