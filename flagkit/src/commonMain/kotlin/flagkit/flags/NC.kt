package flagkit.flags

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import flagkit.FlagKit

val FlagKit.NC: ImageVector
    get() {
        if (_NC != null) {
            return _NC!!
        }
        _NC = ImageVector.Builder(
            name = "NC",
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
                        0f to Color(0xFF094CC7),
                        1f to Color(0xFF003CAB)
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
                        0f to Color(0xFF2AAD55),
                        1f to Color(0xFF219447)
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
                        0f to Color(0xFFF65D55),
                        1f to Color(0xFFE9443C)
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
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFAE749),
                        1f to Color(0xFFFBE533)
                    ),
                    start = Offset(10.5f, 4f),
                    end = Offset(10.5f, 11f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.5f, 7.5f)
                moveToRelative(-3.5f, 0f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 7f, 0f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -7f, 0f)
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF262626),
                        1f to Color(0xFF0D0D0D)
                    ),
                    start = Offset(10.5f, 4.74f),
                    end = Offset(10.5f, 10.5f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.092f, 6.211f)
                curveTo(10.034f, 6.293f, 10f, 6.392f, 10f, 6.5f)
                curveTo(10f, 6.776f, 10.224f, 7f, 10.5f, 7f)
                curveTo(10.776f, 7f, 11f, 6.776f, 11f, 6.5f)
                curveTo(11f, 6.26f, 10.831f, 6.06f, 10.606f, 6.011f)
                curveTo(10.654f, 5.987f, 10.702f, 5.961f, 10.75f, 5.933f)
                curveTo(11.348f, 5.588f, 11.721f, 5.114f, 11.583f, 4.875f)
                curveTo(11.444f, 4.636f, 10.848f, 4.722f, 10.25f, 5.067f)
                curveTo(9.652f, 5.412f, 9.279f, 5.886f, 9.417f, 6.125f)
                curveTo(9.503f, 6.273f, 9.764f, 6.296f, 10.092f, 6.211f)
                lineTo(10.092f, 6.211f)
                close()
                moveTo(10.5f, 10.5f)
                curveTo(9.672f, 10.5f, 9.5f, 9.776f, 9.5f, 9.5f)
                curveTo(9.5f, 9.224f, 9.672f, 9f, 10.5f, 9f)
                curveTo(11.328f, 9f, 11.5f, 9.224f, 11.5f, 9.5f)
                curveTo(11.5f, 9.776f, 11.328f, 10.5f, 10.5f, 10.5f)
                close()
                moveTo(10.5f, 9f)
                curveTo(10.224f, 9f, 10f, 8.776f, 10f, 8.5f)
                curveTo(10f, 8.224f, 10.224f, 8f, 10.5f, 8f)
                curveTo(10.776f, 8f, 11f, 8.224f, 11f, 8.5f)
                curveTo(11f, 8.776f, 10.776f, 9f, 10.5f, 9f)
                close()
                moveTo(10.5f, 8f)
                curveTo(10.224f, 8f, 10f, 7.776f, 10f, 7.5f)
                curveTo(10f, 7.224f, 10.224f, 7f, 10.5f, 7f)
                curveTo(10.776f, 7f, 11f, 7.224f, 11f, 7.5f)
                curveTo(11f, 7.776f, 10.776f, 8f, 10.5f, 8f)
                close()
            }
        }.build()

        return _NC!!
    }

@Suppress("ObjectPropertyName")
private var _NC: ImageVector? = null
