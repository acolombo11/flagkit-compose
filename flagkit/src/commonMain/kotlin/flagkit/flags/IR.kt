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

val FlagKit.IR: ImageVector
    get() {
        if (_IR != null) {
            return _IR!!
        }
        _IR = ImageVector.Builder(
            name = "IR",
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
                        0f to Color(0xFF38BB56),
                        1f to Color(0xFF2B9F45)
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
                        0f to Color(0xFFDE1B27),
                        1f to Color(0xFFD80915)
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
                fill = SolidColor(Color(0xFFFFFFFF)),
                fillAlpha = 0.5f,
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(1f, 4.252f)
                curveTo(1f, 4.113f, 1.107f, 4f, 1.252f, 4f)
                lineTo(1.748f, 4f)
                curveTo(1.887f, 4f, 2f, 4.107f, 2f, 4.252f)
                lineTo(2f, 4.748f)
                curveTo(2f, 4.887f, 1.893f, 5f, 1.748f, 5f)
                lineTo(1.252f, 5f)
                curveTo(1.113f, 5f, 1f, 4.893f, 1f, 4.748f)
                lineTo(1f, 4.252f)
                close()
                moveTo(3f, 4.252f)
                curveTo(3f, 4.113f, 3.107f, 4f, 3.252f, 4f)
                lineTo(3.748f, 4f)
                curveTo(3.887f, 4f, 4f, 4.107f, 4f, 4.252f)
                lineTo(4f, 4.748f)
                curveTo(4f, 4.887f, 3.893f, 5f, 3.748f, 5f)
                lineTo(3.252f, 5f)
                curveTo(3.113f, 5f, 3f, 4.893f, 3f, 4.748f)
                lineTo(3f, 4.252f)
                close()
                moveTo(5f, 4.252f)
                curveTo(5f, 4.113f, 5.107f, 4f, 5.252f, 4f)
                lineTo(5.748f, 4f)
                curveTo(5.887f, 4f, 6f, 4.107f, 6f, 4.252f)
                lineTo(6f, 4.748f)
                curveTo(6f, 4.887f, 5.893f, 5f, 5.748f, 5f)
                lineTo(5.252f, 5f)
                curveTo(5.113f, 5f, 5f, 4.893f, 5f, 4.748f)
                lineTo(5f, 4.252f)
                close()
                moveTo(7f, 4.252f)
                curveTo(7f, 4.113f, 7.107f, 4f, 7.252f, 4f)
                lineTo(7.748f, 4f)
                curveTo(7.887f, 4f, 8f, 4.107f, 8f, 4.252f)
                lineTo(8f, 4.748f)
                curveTo(8f, 4.887f, 7.893f, 5f, 7.748f, 5f)
                lineTo(7.252f, 5f)
                curveTo(7.113f, 5f, 7f, 4.893f, 7f, 4.748f)
                lineTo(7f, 4.252f)
                close()
                moveTo(9f, 4.252f)
                curveTo(9f, 4.113f, 9.107f, 4f, 9.252f, 4f)
                lineTo(9.748f, 4f)
                curveTo(9.887f, 4f, 10f, 4.107f, 10f, 4.252f)
                lineTo(10f, 4.748f)
                curveTo(10f, 4.887f, 9.893f, 5f, 9.748f, 5f)
                lineTo(9.252f, 5f)
                curveTo(9.113f, 5f, 9f, 4.893f, 9f, 4.748f)
                lineTo(9f, 4.252f)
                close()
                moveTo(11f, 4.252f)
                curveTo(11f, 4.113f, 11.107f, 4f, 11.252f, 4f)
                lineTo(11.748f, 4f)
                curveTo(11.887f, 4f, 12f, 4.107f, 12f, 4.252f)
                lineTo(12f, 4.748f)
                curveTo(12f, 4.887f, 11.893f, 5f, 11.748f, 5f)
                lineTo(11.252f, 5f)
                curveTo(11.113f, 5f, 11f, 4.893f, 11f, 4.748f)
                lineTo(11f, 4.252f)
                close()
                moveTo(13f, 4.252f)
                curveTo(13f, 4.113f, 13.107f, 4f, 13.252f, 4f)
                lineTo(13.748f, 4f)
                curveTo(13.887f, 4f, 14f, 4.107f, 14f, 4.252f)
                lineTo(14f, 4.748f)
                curveTo(14f, 4.887f, 13.893f, 5f, 13.748f, 5f)
                lineTo(13.252f, 5f)
                curveTo(13.113f, 5f, 13f, 4.893f, 13f, 4.748f)
                lineTo(13f, 4.252f)
                close()
                moveTo(15f, 4.252f)
                curveTo(15f, 4.113f, 15.107f, 4f, 15.252f, 4f)
                lineTo(15.748f, 4f)
                curveTo(15.887f, 4f, 16f, 4.107f, 16f, 4.252f)
                lineTo(16f, 4.748f)
                curveTo(16f, 4.887f, 15.893f, 5f, 15.748f, 5f)
                lineTo(15.252f, 5f)
                curveTo(15.113f, 5f, 15f, 4.893f, 15f, 4.748f)
                lineTo(15f, 4.252f)
                close()
                moveTo(17f, 4.252f)
                curveTo(17f, 4.113f, 17.107f, 4f, 17.252f, 4f)
                lineTo(17.748f, 4f)
                curveTo(17.887f, 4f, 18f, 4.107f, 18f, 4.252f)
                lineTo(18f, 4.748f)
                curveTo(18f, 4.887f, 17.893f, 5f, 17.748f, 5f)
                lineTo(17.252f, 5f)
                curveTo(17.113f, 5f, 17f, 4.893f, 17f, 4.748f)
                lineTo(17f, 4.252f)
                close()
                moveTo(19f, 4.252f)
                curveTo(19f, 4.113f, 19.107f, 4f, 19.252f, 4f)
                lineTo(19.748f, 4f)
                curveTo(19.887f, 4f, 20f, 4.107f, 20f, 4.252f)
                lineTo(20f, 4.748f)
                curveTo(20f, 4.887f, 19.893f, 5f, 19.748f, 5f)
                lineTo(19.252f, 5f)
                curveTo(19.113f, 5f, 19f, 4.893f, 19f, 4.748f)
                lineTo(19f, 4.252f)
                close()
                moveTo(1f, 10.252f)
                curveTo(1f, 10.113f, 1.107f, 10f, 1.252f, 10f)
                lineTo(1.748f, 10f)
                curveTo(1.887f, 10f, 2f, 10.107f, 2f, 10.252f)
                lineTo(2f, 10.748f)
                curveTo(2f, 10.887f, 1.893f, 11f, 1.748f, 11f)
                lineTo(1.252f, 11f)
                curveTo(1.113f, 11f, 1f, 10.893f, 1f, 10.748f)
                lineTo(1f, 10.252f)
                close()
                moveTo(3f, 10.252f)
                curveTo(3f, 10.113f, 3.107f, 10f, 3.252f, 10f)
                lineTo(3.748f, 10f)
                curveTo(3.887f, 10f, 4f, 10.107f, 4f, 10.252f)
                lineTo(4f, 10.748f)
                curveTo(4f, 10.887f, 3.893f, 11f, 3.748f, 11f)
                lineTo(3.252f, 11f)
                curveTo(3.113f, 11f, 3f, 10.893f, 3f, 10.748f)
                lineTo(3f, 10.252f)
                close()
                moveTo(5f, 10.252f)
                curveTo(5f, 10.113f, 5.107f, 10f, 5.252f, 10f)
                lineTo(5.748f, 10f)
                curveTo(5.887f, 10f, 6f, 10.107f, 6f, 10.252f)
                lineTo(6f, 10.748f)
                curveTo(6f, 10.887f, 5.893f, 11f, 5.748f, 11f)
                lineTo(5.252f, 11f)
                curveTo(5.113f, 11f, 5f, 10.893f, 5f, 10.748f)
                lineTo(5f, 10.252f)
                close()
                moveTo(7f, 10.252f)
                curveTo(7f, 10.113f, 7.107f, 10f, 7.252f, 10f)
                lineTo(7.748f, 10f)
                curveTo(7.887f, 10f, 8f, 10.107f, 8f, 10.252f)
                lineTo(8f, 10.748f)
                curveTo(8f, 10.887f, 7.893f, 11f, 7.748f, 11f)
                lineTo(7.252f, 11f)
                curveTo(7.113f, 11f, 7f, 10.893f, 7f, 10.748f)
                lineTo(7f, 10.252f)
                close()
                moveTo(9f, 10.252f)
                curveTo(9f, 10.113f, 9.107f, 10f, 9.252f, 10f)
                lineTo(9.748f, 10f)
                curveTo(9.887f, 10f, 10f, 10.107f, 10f, 10.252f)
                lineTo(10f, 10.748f)
                curveTo(10f, 10.887f, 9.893f, 11f, 9.748f, 11f)
                lineTo(9.252f, 11f)
                curveTo(9.113f, 11f, 9f, 10.893f, 9f, 10.748f)
                lineTo(9f, 10.252f)
                close()
                moveTo(11f, 10.252f)
                curveTo(11f, 10.113f, 11.107f, 10f, 11.252f, 10f)
                lineTo(11.748f, 10f)
                curveTo(11.887f, 10f, 12f, 10.107f, 12f, 10.252f)
                lineTo(12f, 10.748f)
                curveTo(12f, 10.887f, 11.893f, 11f, 11.748f, 11f)
                lineTo(11.252f, 11f)
                curveTo(11.113f, 11f, 11f, 10.893f, 11f, 10.748f)
                lineTo(11f, 10.252f)
                close()
                moveTo(13f, 10.252f)
                curveTo(13f, 10.113f, 13.107f, 10f, 13.252f, 10f)
                lineTo(13.748f, 10f)
                curveTo(13.887f, 10f, 14f, 10.107f, 14f, 10.252f)
                lineTo(14f, 10.748f)
                curveTo(14f, 10.887f, 13.893f, 11f, 13.748f, 11f)
                lineTo(13.252f, 11f)
                curveTo(13.113f, 11f, 13f, 10.893f, 13f, 10.748f)
                lineTo(13f, 10.252f)
                close()
                moveTo(15f, 10.252f)
                curveTo(15f, 10.113f, 15.107f, 10f, 15.252f, 10f)
                lineTo(15.748f, 10f)
                curveTo(15.887f, 10f, 16f, 10.107f, 16f, 10.252f)
                lineTo(16f, 10.748f)
                curveTo(16f, 10.887f, 15.893f, 11f, 15.748f, 11f)
                lineTo(15.252f, 11f)
                curveTo(15.113f, 11f, 15f, 10.893f, 15f, 10.748f)
                lineTo(15f, 10.252f)
                close()
                moveTo(17f, 10.252f)
                curveTo(17f, 10.113f, 17.107f, 10f, 17.252f, 10f)
                lineTo(17.748f, 10f)
                curveTo(17.887f, 10f, 18f, 10.107f, 18f, 10.252f)
                lineTo(18f, 10.748f)
                curveTo(18f, 10.887f, 17.893f, 11f, 17.748f, 11f)
                lineTo(17.252f, 11f)
                curveTo(17.113f, 11f, 17f, 10.893f, 17f, 10.748f)
                lineTo(17f, 10.252f)
                close()
                moveTo(19f, 10.252f)
                curveTo(19f, 10.113f, 19.107f, 10f, 19.252f, 10f)
                lineTo(19.748f, 10f)
                curveTo(19.887f, 10f, 20f, 10.107f, 20f, 10.252f)
                lineTo(20f, 10.748f)
                curveTo(20f, 10.887f, 19.893f, 11f, 19.748f, 11f)
                lineTo(19.252f, 11f)
                curveTo(19.113f, 11f, 19f, 10.893f, 19f, 10.748f)
                lineTo(19f, 10.252f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFFD80915)),
                strokeLineWidth = 0.5f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9.591f, 6.642f)
                curveTo(9.374f, 6.871f, 9.25f, 7.175f, 9.25f, 7.5f)
                curveTo(9.25f, 8.19f, 9.81f, 8.75f, 10.5f, 8.75f)
                curveTo(11.19f, 8.75f, 11.75f, 8.19f, 11.75f, 7.5f)
                curveTo(11.75f, 7.182f, 11.631f, 6.884f, 11.422f, 6.656f)
                lineTo(9.591f, 6.642f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFD80915)),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.5f, 7f)
                lineTo(10.5f, 7f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 7.5f)
                lineTo(11f, 8.5f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.5f, 9f)
                lineTo(10.5f, 9f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 8.5f)
                lineTo(10f, 7.5f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.5f, 7f)
                close()
            }
        }.build()

        return _IR!!
    }

@Suppress("ObjectPropertyName")
private var _IR: ImageVector? = null
