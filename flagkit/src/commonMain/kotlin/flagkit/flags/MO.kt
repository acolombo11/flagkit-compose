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

val FlagKit.MO: ImageVector
    get() {
        if (_MO != null) {
            return _MO!!
        }
        _MO = ImageVector.Builder(
            name = "MO",
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
                        0f to Color(0xFF079D7B),
                        1f to Color(0xFF01795E)
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
                    start = Offset(10.514f, 4f),
                    end = Offset(10.514f, 12f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.452f, 8.902f)
                curveTo(8.595f, 8.94f, 8.736f, 8.973f, 8.875f, 9f)
                lineTo(6.5f, 9f)
                curveTo(6.619f, 9.356f, 6.778f, 9.691f, 6.973f, 10f)
                lineTo(14.027f, 10f)
                lineTo(14.027f, 10f)
                curveTo(14.222f, 9.691f, 14.381f, 9.356f, 14.5f, 9f)
                lineTo(12.093f, 9f)
                curveTo(12.236f, 8.973f, 12.382f, 8.941f, 12.53f, 8.903f)
                curveTo(12.076f, 8.918f, 11.336f, 9f, 10.5f, 9f)
                curveTo(9.653f, 9f, 8.904f, 8.916f, 8.452f, 8.902f)
                close()
                moveTo(8.035f, 8.777f)
                curveTo(6.914f, 8.398f, 6.146f, 7.792f, 6.267f, 7.341f)
                curveTo(6.401f, 6.838f, 7.592f, 6.72f, 8.926f, 7.078f)
                curveTo(8.996f, 7.096f, 9.065f, 7.116f, 9.132f, 7.137f)
                curveTo(9.102f, 6.933f, 9.086f, 6.72f, 9.086f, 6.5f)
                curveTo(9.086f, 5.119f, 9.719f, 4f, 10.5f, 4f)
                curveTo(11.281f, 4f, 11.914f, 5.119f, 11.914f, 6.5f)
                curveTo(11.914f, 6.719f, 11.898f, 6.931f, 11.868f, 7.134f)
                curveTo(11.945f, 7.11f, 12.023f, 7.087f, 12.102f, 7.066f)
                curveTo(13.436f, 6.709f, 14.626f, 6.827f, 14.761f, 7.33f)
                curveTo(14.883f, 7.784f, 14.101f, 8.397f, 12.964f, 8.775f)
                curveTo(12.764f, 8.18f, 11.737f, 8f, 10.5f, 8f)
                curveTo(9.262f, 8f, 8.234f, 8.18f, 8.035f, 8.777f)
                close()
                moveTo(13.166f, 11f)
                curveTo(12.438f, 11.625f, 11.51f, 12f, 10.5f, 12f)
                curveTo(9.49f, 12f, 8.562f, 11.625f, 7.834f, 11f)
                lineTo(13.166f, 11f)
                lineTo(13.166f, 11f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFCD117)),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.5f, 3f)
                curveTo(10.224f, 3f, 10f, 2.776f, 10f, 2.5f)
                curveTo(10f, 2.224f, 10.224f, 2f, 10.5f, 2f)
                curveTo(10.776f, 2f, 11f, 2.224f, 11f, 2.5f)
                curveTo(11f, 2.776f, 10.776f, 3f, 10.5f, 3f)
                close()
                moveTo(6.5f, 5.5f)
                curveTo(6.224f, 5.5f, 6f, 5.276f, 6f, 5f)
                curveTo(6f, 4.724f, 6.224f, 4.5f, 6.5f, 4.5f)
                curveTo(6.776f, 4.5f, 7f, 4.724f, 7f, 5f)
                curveTo(7f, 5.276f, 6.776f, 5.5f, 6.5f, 5.5f)
                close()
                moveTo(14.5f, 5.5f)
                curveTo(14.224f, 5.5f, 14f, 5.276f, 14f, 5f)
                curveTo(14f, 4.724f, 14.224f, 4.5f, 14.5f, 4.5f)
                curveTo(14.776f, 4.5f, 15f, 4.724f, 15f, 5f)
                curveTo(15f, 5.276f, 14.776f, 5.5f, 14.5f, 5.5f)
                close()
                moveTo(13f, 4f)
                curveTo(12.724f, 4f, 12.5f, 3.776f, 12.5f, 3.5f)
                curveTo(12.5f, 3.224f, 12.724f, 3f, 13f, 3f)
                curveTo(13.276f, 3f, 13.5f, 3.224f, 13.5f, 3.5f)
                curveTo(13.5f, 3.776f, 13.276f, 4f, 13f, 4f)
                close()
                moveTo(8f, 4f)
                curveTo(7.724f, 4f, 7.5f, 3.776f, 7.5f, 3.5f)
                curveTo(7.5f, 3.224f, 7.724f, 3f, 8f, 3f)
                curveTo(8.276f, 3f, 8.5f, 3.224f, 8.5f, 3.5f)
                curveTo(8.5f, 3.776f, 8.276f, 4f, 8f, 4f)
                close()
            }
        }.build()

        return _MO!!
    }

@Suppress("ObjectPropertyName")
private var _MO: ImageVector? = null
