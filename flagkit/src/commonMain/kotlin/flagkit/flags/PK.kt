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

val FlagKit.PK: ImageVector
    get() {
        if (_PK != null) {
            return _PK!!
        }
        _PK = ImageVector.Builder(
            name = "PK",
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
                        0f to Color(0xFF0A632F),
                        1f to Color(0xFF05411E)
                    ),
                    start = Offset(10.5f, -0.002f),
                    end = Offset(10.5f, 14.998f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, -0.002f)
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
                    start = Offset(3f, -0.002f),
                    end = Offset(3f, 14.998f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, -0.002f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(-6f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(17.753f, 8.061f)
                curveTo(17.656f, 8.999f, 17.257f, 9.901f, 16.551f, 10.607f)
                curveTo(14.866f, 12.292f, 12.075f, 12.233f, 10.318f, 10.475f)
                curveTo(8.56f, 8.718f, 8.502f, 5.928f, 10.187f, 4.243f)
                curveTo(10.893f, 3.537f, 11.794f, 3.136f, 12.731f, 3.04f)
                curveTo(12.437f, 3.215f, 12.157f, 3.43f, 11.901f, 3.685f)
                curveTo(10.37f, 5.216f, 10.294f, 7.623f, 11.732f, 9.061f)
                curveTo(13.17f, 10.499f, 15.577f, 10.422f, 17.108f, 8.892f)
                curveTo(17.363f, 8.636f, 17.579f, 8.357f, 17.753f, 8.061f)
                lineTo(17.753f, 8.061f)
                close()
                moveTo(15.819f, 6.077f)
                lineTo(15.581f, 7.501f)
                lineTo(14.914f, 6.22f)
                lineTo(13.485f, 6.433f)
                lineTo(14.497f, 5.403f)
                lineTo(13.854f, 4.112f)
                lineTo(15.146f, 4.754f)
                lineTo(16.175f, 3.743f)
                lineTo(15.963f, 5.171f)
                lineTo(17.244f, 5.838f)
                lineTo(15.819f, 6.077f)
                lineTo(15.819f, 6.077f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFFFFF),
                        1f to Color(0xFFF0F0F0)
                    ),
                    start = Offset(13.357f, 3.04f),
                    end = Offset(13.357f, 11.833f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(17.753f, 8.061f)
                curveTo(17.656f, 8.999f, 17.257f, 9.901f, 16.551f, 10.607f)
                curveTo(14.866f, 12.292f, 12.075f, 12.233f, 10.318f, 10.475f)
                curveTo(8.56f, 8.718f, 8.502f, 5.928f, 10.187f, 4.243f)
                curveTo(10.893f, 3.537f, 11.794f, 3.136f, 12.731f, 3.04f)
                curveTo(12.437f, 3.215f, 12.157f, 3.43f, 11.901f, 3.685f)
                curveTo(10.37f, 5.216f, 10.294f, 7.623f, 11.732f, 9.061f)
                curveTo(13.17f, 10.499f, 15.577f, 10.422f, 17.108f, 8.892f)
                curveTo(17.363f, 8.636f, 17.579f, 8.357f, 17.753f, 8.061f)
                lineTo(17.753f, 8.061f)
                close()
                moveTo(15.819f, 6.077f)
                lineTo(15.581f, 7.501f)
                lineTo(14.914f, 6.22f)
                lineTo(13.485f, 6.433f)
                lineTo(14.497f, 5.403f)
                lineTo(13.854f, 4.112f)
                lineTo(15.146f, 4.754f)
                lineTo(16.175f, 3.743f)
                lineTo(15.963f, 5.171f)
                lineTo(17.244f, 5.838f)
                lineTo(15.819f, 6.077f)
                lineTo(15.819f, 6.077f)
                close()
            }
        }.build()

        return _PK!!
    }

@Suppress("ObjectPropertyName")
private var _PK: ImageVector? = null
