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

val FlagKit.CX: ImageVector
    get() {
        if (_CX != null) {
            return _CX!!
        }
        _CX = ImageVector.Builder(
            name = "CX",
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
                        0f to Color(0xFF0637C5),
                        1f to Color(0xFF002CAA)
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
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4f, 13f)
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
                fill = SolidColor(Color(0xFFFFFFFF)),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4f, 5.5f)
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
                fill = SolidColor(Color(0xFFFFFFFF)),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6f, 8.5f)
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
                fill = SolidColor(Color(0xFFFFFFFF)),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(2f, 9.5f)
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
                fill = SolidColor(Color(0xFFFFFFFF)),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5.5f, 10.75f)
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
                        0f to Color(0xFF3BA758),
                        1f to Color(0xFF2C8945)
                    ),
                    start = Offset(10.5f, 0f),
                    end = Offset(10.5f, 15f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(21f, 15f)
                lineTo(12.079f, 8.628f)
                curveTo(12.079f, 8.628f, 10.097f, 9.653f, 9.339f, 9.112f)
                curveTo(8.582f, 8.571f, 8.992f, 6.423f, 8.992f, 6.423f)
                lineTo(0f, 0f)
                lineTo(21f, 0f)
                lineTo(21f, 15f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFCC5D),
                        1f to Color(0xFFFEC54A)
                    ),
                    start = Offset(17.164f, 1.357f),
                    end = Offset(17.164f, 7.962f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(14.461f, 7.5f)
                curveTo(14.461f, 7.5f, 16.875f, 7.101f, 17.163f, 5.973f)
                curveTo(17.451f, 4.846f, 14.865f, 4.039f, 14.763f, 3.634f)
                curveTo(14.661f, 3.228f, 15.713f, 3.516f, 16.178f, 3.634f)
                curveTo(16.629f, 3.748f, 17.511f, 4.329f, 17.511f, 4.329f)
                curveTo(17.511f, 4.329f, 17.5f, 3.529f, 17.38f, 3.159f)
                curveTo(17.178f, 2.538f, 16.544f, 1.357f, 16.544f, 1.357f)
                curveTo(16.544f, 1.357f, 17.619f, 2.046f, 18.08f, 2.597f)
                curveTo(18.345f, 2.912f, 18.444f, 4.335f, 18.77f, 4.823f)
                curveTo(19.354f, 5.695f, 20.718f, 4.721f, 20.139f, 5.646f)
                curveTo(19.559f, 6.57f, 18.228f, 6.696f, 17.163f, 7.101f)
                curveTo(16.198f, 7.468f, 14.048f, 7.962f, 14.048f, 7.962f)
                lineTo(14.461f, 7.5f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFCC5D),
                        1f to Color(0xFFFEC54A)
                    ),
                    start = Offset(10.5f, 5f),
                    end = Offset(10.5f, 10f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.5f, 10f)
                curveTo(9.119f, 10f, 8f, 8.881f, 8f, 7.5f)
                curveTo(8f, 6.119f, 9.119f, 5f, 10.5f, 5f)
                curveTo(11.881f, 5f, 13f, 6.119f, 13f, 7.5f)
                curveTo(13f, 8.881f, 11.881f, 10f, 10.5f, 10f)
                close()
                moveTo(9.258f, 7.5f)
                lineTo(9f, 8f)
                curveTo(9f, 8f, 9.839f, 7.811f, 10.123f, 8f)
                curveTo(10.507f, 8.256f, 10.5f, 9f, 10.5f, 9f)
                lineTo(11f, 9f)
                curveTo(11f, 9f, 10.836f, 8.27f, 11.093f, 7.757f)
                curveTo(11.35f, 7.244f, 12f, 7f, 12f, 7f)
                lineTo(12f, 6f)
                curveTo(12f, 6f, 11.319f, 6.727f, 10.5f, 7f)
                curveTo(9.681f, 7.273f, 9f, 7f, 9f, 7f)
                lineTo(9.258f, 7.5f)
                close()
            }
        }.build()

        return _CX!!
    }

@Suppress("ObjectPropertyName")
private var _CX: ImageVector? = null
