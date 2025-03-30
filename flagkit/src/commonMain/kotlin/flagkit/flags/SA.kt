package flagkit.flags

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import flagkit.FlagKit

val FlagKit.SA: ImageVector
    get() {
        if (_SA != null) {
            return _SA!!
        }
        _SA = ImageVector.Builder(
            name = "SA",
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
                        0f to Color(0xFF128C4B),
                        1f to Color(0xFF0B6C38)
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
                    start = Offset(10.5f, 7.676f),
                    end = Offset(10.5f, 11f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5f, 9f)
                lineTo(13f, 9f)
                lineTo(13f, 8.008f)
                curveTo(13f, 7.727f, 13.193f, 7.596f, 13.453f, 7.727f)
                lineTo(14f, 8f)
                lineTo(14f, 9f)
                lineTo(15.495f, 9f)
                curveTo(15.774f, 9f, 16f, 9.214f, 16f, 9.505f)
                lineTo(16f, 10f)
                curveTo(16f, 10.552f, 15.557f, 11f, 15.001f, 11f)
                lineTo(13.495f, 11f)
                curveTo(13.222f, 11f, 13f, 10.768f, 13f, 10.5f)
                lineTo(13f, 10f)
                lineTo(6.503f, 10f)
                curveTo(6.225f, 10f, 5.844f, 9.844f, 5.65f, 9.65f)
                lineTo(5f, 9f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFFFFF),
                        1f to Color(0xFFF0F0F0)
                    ),
                    start = Offset(6.5f, 4f),
                    end = Offset(6.5f, 7f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5f, 6.252f)
                curveTo(5f, 6.113f, 5.078f, 5.922f, 5.181f, 5.819f)
                lineTo(5.319f, 5.681f)
                curveTo(5.419f, 5.581f, 5.422f, 5.422f, 5.319f, 5.319f)
                lineTo(5.181f, 5.181f)
                curveTo(5.081f, 5.081f, 5f, 4.893f, 5f, 4.748f)
                lineTo(5f, 4.252f)
                curveTo(5f, 4.113f, 5.107f, 4f, 5.252f, 4f)
                lineTo(5.748f, 4f)
                curveTo(5.887f, 4f, 6f, 4.107f, 6f, 4.252f)
                lineTo(6f, 4.748f)
                curveTo(6f, 4.887f, 6.046f, 4.908f, 6.116f, 4.768f)
                lineTo(6.384f, 4.232f)
                curveTo(6.448f, 4.104f, 6.618f, 4f, 6.748f, 4f)
                lineTo(7.752f, 4f)
                curveTo(7.889f, 4f, 8f, 4.116f, 8f, 4.25f)
                lineTo(8f, 4.25f)
                curveTo(8f, 4.388f, 7.893f, 4.5f, 7.748f, 4.5f)
                lineTo(7.252f, 4.5f)
                curveTo(7.113f, 4.5f, 7f, 4.616f, 7f, 4.75f)
                lineTo(7f, 4.75f)
                curveTo(7f, 4.888f, 7.107f, 5f, 7.252f, 5f)
                lineTo(7.748f, 5f)
                curveTo(7.887f, 5f, 8f, 5.108f, 8f, 5.245f)
                lineTo(8f, 6.755f)
                curveTo(8f, 6.89f, 7.893f, 7f, 7.748f, 7f)
                lineTo(7.252f, 7f)
                curveTo(7.113f, 7f, 7f, 6.893f, 7f, 6.748f)
                lineTo(7f, 6.252f)
                curveTo(7f, 6.113f, 7.116f, 6f, 7.25f, 6f)
                lineTo(7.25f, 6f)
                curveTo(7.388f, 6f, 7.5f, 5.884f, 7.5f, 5.75f)
                lineTo(7.5f, 5.75f)
                curveTo(7.5f, 5.612f, 7.393f, 5.5f, 7.248f, 5.5f)
                lineTo(6.752f, 5.5f)
                curveTo(6.613f, 5.5f, 6.5f, 5.618f, 6.5f, 5.748f)
                lineTo(6.5f, 6.752f)
                curveTo(6.5f, 6.889f, 6.384f, 7f, 6.25f, 7f)
                lineTo(6.25f, 7f)
                curveTo(6.112f, 7f, 6f, 6.893f, 6f, 6.748f)
                lineTo(6f, 6.252f)
                curveTo(6f, 6.113f, 5.884f, 6f, 5.75f, 6f)
                lineTo(5.75f, 6f)
                curveTo(5.612f, 6f, 5.5f, 6.107f, 5.5f, 6.252f)
                lineTo(5.5f, 6.748f)
                curveTo(5.5f, 6.887f, 5.384f, 7f, 5.25f, 7f)
                lineTo(5.25f, 7f)
                curveTo(5.112f, 7f, 5f, 6.893f, 5f, 6.748f)
                lineTo(5f, 6.252f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFFFFF),
                        1f to Color(0xFFF0F0F0)
                    ),
                    start = Offset(14.5f, 4f),
                    end = Offset(14.5f, 7f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13f, 6.252f)
                curveTo(13f, 6.113f, 13.078f, 5.922f, 13.181f, 5.819f)
                lineTo(13.319f, 5.681f)
                curveTo(13.419f, 5.581f, 13.422f, 5.422f, 13.319f, 5.319f)
                lineTo(13.181f, 5.181f)
                curveTo(13.081f, 5.081f, 13f, 4.893f, 13f, 4.748f)
                lineTo(13f, 4.252f)
                curveTo(13f, 4.113f, 13.107f, 4f, 13.252f, 4f)
                lineTo(13.748f, 4f)
                curveTo(13.887f, 4f, 14f, 4.107f, 14f, 4.252f)
                lineTo(14f, 4.748f)
                curveTo(14f, 4.887f, 14.046f, 4.908f, 14.116f, 4.768f)
                lineTo(14.384f, 4.232f)
                curveTo(14.448f, 4.104f, 14.618f, 4f, 14.748f, 4f)
                lineTo(15.752f, 4f)
                curveTo(15.889f, 4f, 16f, 4.116f, 16f, 4.25f)
                lineTo(16f, 4.25f)
                curveTo(16f, 4.388f, 15.893f, 4.5f, 15.748f, 4.5f)
                lineTo(15.252f, 4.5f)
                curveTo(15.113f, 4.5f, 15f, 4.616f, 15f, 4.75f)
                lineTo(15f, 4.75f)
                curveTo(15f, 4.888f, 15.107f, 5f, 15.252f, 5f)
                lineTo(15.748f, 5f)
                curveTo(15.887f, 5f, 16f, 5.108f, 16f, 5.245f)
                lineTo(16f, 6.755f)
                curveTo(16f, 6.89f, 15.893f, 7f, 15.748f, 7f)
                lineTo(15.252f, 7f)
                curveTo(15.113f, 7f, 15f, 6.893f, 15f, 6.748f)
                lineTo(15f, 6.252f)
                curveTo(15f, 6.113f, 15.116f, 6f, 15.25f, 6f)
                lineTo(15.25f, 6f)
                curveTo(15.388f, 6f, 15.5f, 5.884f, 15.5f, 5.75f)
                lineTo(15.5f, 5.75f)
                curveTo(15.5f, 5.612f, 15.393f, 5.5f, 15.248f, 5.5f)
                lineTo(14.752f, 5.5f)
                curveTo(14.613f, 5.5f, 14.5f, 5.618f, 14.5f, 5.748f)
                lineTo(14.5f, 6.752f)
                curveTo(14.5f, 6.889f, 14.384f, 7f, 14.25f, 7f)
                lineTo(14.25f, 7f)
                curveTo(14.112f, 7f, 14f, 6.893f, 14f, 6.748f)
                lineTo(14f, 6.252f)
                curveTo(14f, 6.113f, 13.884f, 6f, 13.75f, 6f)
                lineTo(13.75f, 6f)
                curveTo(13.612f, 6f, 13.5f, 6.107f, 13.5f, 6.252f)
                lineTo(13.5f, 6.748f)
                curveTo(13.5f, 6.887f, 13.384f, 7f, 13.25f, 7f)
                lineTo(13.25f, 7f)
                curveTo(13.112f, 7f, 13f, 6.893f, 13f, 6.748f)
                lineTo(13f, 6.252f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFFFFF),
                        1f to Color(0xFFF0F0F0)
                    ),
                    start = Offset(10.5f, 4f),
                    end = Offset(10.5f, 7f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 4.748f)
                curveTo(12f, 4.887f, 11.922f, 5.078f, 11.819f, 5.181f)
                lineTo(11.681f, 5.319f)
                curveTo(11.581f, 5.419f, 11.578f, 5.578f, 11.681f, 5.681f)
                lineTo(11.819f, 5.819f)
                curveTo(11.919f, 5.919f, 12f, 6.107f, 12f, 6.252f)
                lineTo(12f, 6.748f)
                curveTo(12f, 6.887f, 11.893f, 7f, 11.748f, 7f)
                lineTo(11.252f, 7f)
                curveTo(11.113f, 7f, 11f, 6.893f, 11f, 6.748f)
                lineTo(11f, 6.252f)
                curveTo(11f, 6.113f, 10.954f, 6.092f, 10.884f, 6.232f)
                lineTo(10.616f, 6.768f)
                curveTo(10.552f, 6.896f, 10.382f, 7f, 10.252f, 7f)
                lineTo(9.248f, 7f)
                curveTo(9.111f, 7f, 9f, 6.884f, 9f, 6.75f)
                lineTo(9f, 6.75f)
                curveTo(9f, 6.612f, 9.107f, 6.5f, 9.252f, 6.5f)
                lineTo(9.748f, 6.5f)
                curveTo(9.887f, 6.5f, 10f, 6.384f, 10f, 6.25f)
                lineTo(10f, 6.25f)
                curveTo(10f, 6.112f, 9.893f, 6f, 9.748f, 6f)
                lineTo(9.252f, 6f)
                curveTo(9.113f, 6f, 9f, 5.892f, 9f, 5.755f)
                lineTo(9f, 4.245f)
                curveTo(9f, 4.11f, 9.107f, 4f, 9.252f, 4f)
                lineTo(9.748f, 4f)
                curveTo(9.887f, 4f, 10f, 4.107f, 10f, 4.252f)
                lineTo(10f, 4.748f)
                curveTo(10f, 4.887f, 9.884f, 5f, 9.75f, 5f)
                lineTo(9.75f, 5f)
                curveTo(9.612f, 5f, 9.5f, 5.116f, 9.5f, 5.25f)
                lineTo(9.5f, 5.25f)
                curveTo(9.5f, 5.388f, 9.607f, 5.5f, 9.752f, 5.5f)
                lineTo(10.248f, 5.5f)
                curveTo(10.387f, 5.5f, 10.5f, 5.382f, 10.5f, 5.252f)
                lineTo(10.5f, 4.248f)
                curveTo(10.5f, 4.111f, 10.616f, 4f, 10.75f, 4f)
                lineTo(10.75f, 4f)
                curveTo(10.888f, 4f, 11f, 4.107f, 11f, 4.252f)
                lineTo(11f, 4.748f)
                curveTo(11f, 4.887f, 11.116f, 5f, 11.25f, 5f)
                lineTo(11.25f, 5f)
                curveTo(11.388f, 5f, 11.5f, 4.893f, 11.5f, 4.748f)
                lineTo(11.5f, 4.252f)
                curveTo(11.5f, 4.113f, 11.616f, 4f, 11.75f, 4f)
                lineTo(11.75f, 4f)
                curveTo(11.888f, 4f, 12f, 4.107f, 12f, 4.252f)
                lineTo(12f, 4.748f)
                lineTo(12f, 4.748f)
                close()
            }
        }.build()

        return _SA!!
    }

@Suppress("ObjectPropertyName")
private var _SA: ImageVector? = null
