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

val FlagKit.DM: ImageVector
    get() {
        if (_DM != null) {
            return _DM!!
        }
        _DM = ImageVector.Builder(
            name = "DM",
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
                        0f to Color(0xFF108753),
                        1f to Color(0xFF0B6B41)
                    ),
                    start = Offset(10.5f, 0f),
                    end = Offset(10.5f, 6f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(21f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-21f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF108753),
                        1f to Color(0xFF0B6B41)
                    ),
                    start = Offset(10.5f, 9f),
                    end = Offset(10.5f, 15f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 9f)
                horizontalLineToRelative(21f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-21f)
                close()
            }
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
                moveTo(9f, 6f)
                lineTo(0f, 6f)
                lineTo(0f, 9f)
                lineTo(9f, 9f)
                lineTo(9f, 15f)
                lineTo(12f, 15f)
                lineTo(12f, 9f)
                lineTo(21f, 9f)
                lineTo(21f, 6f)
                lineTo(12f, 6f)
                lineTo(12f, 0f)
                lineTo(9f, 0f)
                lineTo(9f, 6f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF262626),
                        1f to Color(0xFF0D0D0D)
                    ),
                    start = Offset(10.5f, 0f),
                    end = Offset(10.5f, 15f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10f, 8f)
                lineTo(10f, 15f)
                lineTo(11f, 15f)
                lineTo(11f, 8f)
                lineTo(21f, 8f)
                lineTo(21f, 7f)
                lineTo(11f, 7f)
                lineTo(11f, 0f)
                lineTo(10f, 0f)
                lineTo(10f, 7f)
                lineTo(0f, 7f)
                lineTo(0f, 8f)
                lineTo(10f, 8f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFCD449),
                        1f to Color(0xFFFCD036)
                    ),
                    start = Offset(10.5f, 0f),
                    end = Offset(10.5f, 15f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9f, 7f)
                lineTo(9f, 15f)
                lineTo(10f, 15f)
                lineTo(10f, 7f)
                lineTo(21f, 7f)
                lineTo(21f, 6f)
                lineTo(10f, 6f)
                lineTo(10f, 0f)
                lineTo(9f, 0f)
                lineTo(9f, 6f)
                lineTo(0f, 6f)
                lineTo(0f, 7f)
                lineTo(9f, 7f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFE02C42),
                        1f to Color(0xFFD22036)
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
                fill = SolidColor(Color(0xFF0E673F)),
                strokeLineWidth = 1f
            ) {
                moveTo(10.5f, 10.5f)
                curveTo(10.224f, 10.5f, 10f, 10.276f, 10f, 10f)
                curveTo(10f, 9.724f, 10.224f, 9.5f, 10.5f, 9.5f)
                curveTo(10.774f, 9.5f, 11.038f, 9.445f, 11.284f, 9.341f)
                curveTo(11.538f, 9.232f, 11.832f, 9.35f, 11.94f, 9.604f)
                curveTo(12.048f, 9.858f, 11.93f, 10.152f, 11.676f, 10.261f)
                curveTo(11.307f, 10.418f, 10.909f, 10.5f, 10.5f, 10.5f)
                close()
                moveTo(13.316f, 8.535f)
                curveTo(13.431f, 8.225f, 13.493f, 7.896f, 13.499f, 7.56f)
                curveTo(13.5f, 7.44f, 13.498f, 7.369f, 13.493f, 7.293f)
                curveTo(13.474f, 7.017f, 13.235f, 6.809f, 12.96f, 6.828f)
                curveTo(12.684f, 6.847f, 12.476f, 7.086f, 12.495f, 7.361f)
                curveTo(12.499f, 7.411f, 12.5f, 7.458f, 12.5f, 7.548f)
                curveTo(12.495f, 7.765f, 12.454f, 7.984f, 12.378f, 8.19f)
                curveTo(12.283f, 8.449f, 12.415f, 8.737f, 12.675f, 8.832f)
                curveTo(12.934f, 8.927f, 13.221f, 8.794f, 13.316f, 8.535f)
                close()
                moveTo(12.367f, 5.152f)
                curveTo(12.051f, 4.9f, 11.688f, 4.715f, 11.297f, 4.607f)
                curveTo(11.031f, 4.534f, 10.755f, 4.69f, 10.682f, 4.957f)
                curveTo(10.609f, 5.223f, 10.765f, 5.498f, 11.032f, 5.571f)
                curveTo(11.292f, 5.643f, 11.534f, 5.766f, 11.744f, 5.934f)
                curveTo(11.96f, 6.106f, 12.275f, 6.07f, 12.447f, 5.854f)
                curveTo(12.619f, 5.638f, 12.583f, 5.323f, 12.367f, 5.152f)
                close()
                moveTo(8.944f, 4.935f)
                curveTo(8.599f, 5.144f, 8.299f, 5.422f, 8.064f, 5.749f)
                curveTo(7.902f, 5.973f, 7.953f, 6.286f, 8.177f, 6.447f)
                curveTo(8.402f, 6.608f, 8.714f, 6.557f, 8.875f, 6.333f)
                curveTo(9.033f, 6.115f, 9.233f, 5.929f, 9.463f, 5.789f)
                curveTo(9.699f, 5.646f, 9.774f, 5.338f, 9.631f, 5.102f)
                curveTo(9.487f, 4.866f, 9.18f, 4.791f, 8.944f, 4.935f)
                close()
                moveTo(7.564f, 8.12f)
                curveTo(7.648f, 8.517f, 7.811f, 8.891f, 8.043f, 9.221f)
                curveTo(8.201f, 9.447f, 8.513f, 9.502f, 8.739f, 9.343f)
                curveTo(8.965f, 9.185f, 9.02f, 8.873f, 8.861f, 8.647f)
                curveTo(8.707f, 8.427f, 8.598f, 8.178f, 8.543f, 7.914f)
                curveTo(8.486f, 7.644f, 8.221f, 7.471f, 7.951f, 7.528f)
                curveTo(7.68f, 7.584f, 7.507f, 7.849f, 7.564f, 8.12f)
                close()
                moveTo(10.105f, 10.474f)
                curveTo(9.831f, 10.438f, 9.638f, 10.187f, 9.675f, 9.913f)
                curveTo(9.711f, 9.639f, 9.962f, 9.447f, 10.236f, 9.483f)
                curveTo(10.317f, 9.493f, 10.399f, 9.499f, 10.481f, 9.5f)
                curveTo(10.757f, 9.502f, 10.979f, 9.728f, 10.977f, 10.004f)
                curveTo(10.974f, 10.281f, 10.748f, 10.502f, 10.472f, 10.5f)
                curveTo(10.349f, 10.499f, 10.226f, 10.49f, 10.105f, 10.474f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0E673F)),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.5f, 8.5f)
                curveTo(11.052f, 8.5f, 11f, 8.052f, 11f, 7.5f)
                curveTo(11f, 6.948f, 11.052f, 6.5f, 10.5f, 6.5f)
                curveTo(9.948f, 6.5f, 10f, 6.948f, 10f, 7.5f)
                curveTo(10f, 8.052f, 9.948f, 8.5f, 10.5f, 8.5f)
                close()
            }
        }.build()

        return _DM!!
    }

@Suppress("ObjectPropertyName")
private var _DM: ImageVector? = null
