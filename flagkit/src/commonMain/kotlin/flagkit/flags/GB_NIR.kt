package flagkit.flags

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathData
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import flagkit.FlagKit

val FlagKit.GB_NIR: ImageVector
    get() {
        if (_GB_NIR != null) {
            return _GB_NIR!!
        }
        _GB_NIR = ImageVector.Builder(
            name = "GB_NIR",
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
                        0f to Color(0xFFE82739),
                        1f to Color(0xFFCA1A2B)
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
                        0f to Color(0xFFFFFFFF),
                        1f to Color(0xFFF0F0F0)
                    ),
                    start = Offset(10.5f, 4f),
                    end = Offset(10.5f, 11f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11.516f, 9.261f)
                lineToRelative(-1.016f, 1.739f)
                lineToRelative(-1.016f, -1.739f)
                lineToRelative(-2.015f, -0.011f)
                lineToRelative(0.998f, -1.75f)
                lineToRelative(-0.998f, -1.75f)
                lineToRelative(2.015f, -0.011f)
                lineToRelative(1.016f, -1.739f)
                lineToRelative(1.016f, 1.739f)
                lineToRelative(2.015f, 0.011f)
                lineToRelative(-0.998f, 1.75f)
                lineToRelative(0.998f, 1.75f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFE6101E),
                        1f to Color(0xFFCA0814)
                    ),
                    start = Offset(10.552f, 6.133f),
                    end = Offset(10.552f, 9f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9.551f, 7.006f)
                curveTo(9.523f, 6.727f, 9.709f, 6.43f, 9.975f, 6.342f)
                lineTo(10.525f, 6.158f)
                curveTo(10.788f, 6.071f, 11f, 6.221f, 11f, 6.508f)
                lineTo(11f, 7.5f)
                curveTo(11f, 7.5f, 11.321f, 6.463f, 11.5f, 7f)
                curveTo(11.679f, 7.537f, 11.372f, 8.526f, 11.372f, 8.526f)
                curveTo(11.305f, 8.788f, 11.029f, 9f, 10.742f, 9f)
                lineTo(10.258f, 9f)
                curveTo(9.977f, 9f, 9.727f, 8.769f, 9.699f, 8.494f)
                lineTo(9.551f, 7.006f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFFFFF),
                        1f to Color(0xFFF0F0F0)
                    ),
                    start = Offset(10.498f, 2.908f),
                    end = Offset(10.498f, 4.101f)
                ),
                strokeLineWidth = 1f
            ) {
                moveTo(10.499f, 2.908f)
                curveTo(9.989f, 2.908f, 9.533f, 3.212f, 9.332f, 3.671f)
                lineTo(9.231f, 3.9f)
                lineTo(9.689f, 4.101f)
                lineTo(9.789f, 3.872f)
                curveTo(9.912f, 3.593f, 10.189f, 3.408f, 10.499f, 3.408f)
                curveTo(10.808f, 3.408f, 11.083f, 3.59f, 11.207f, 3.867f)
                lineTo(11.309f, 4.095f)
                lineTo(11.765f, 3.89f)
                lineTo(11.663f, 3.662f)
                curveTo(11.459f, 3.207f, 11.006f, 2.908f, 10.499f, 2.908f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFD148),
                        1f to Color(0xFFFFCB2F)
                    ),
                    start = Offset(10.5f, 2f),
                    end = Offset(10.5f, 5f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9f, 3.75f)
                lineTo(10f, 4f)
                lineTo(10.5f, 3.5f)
                lineTo(11f, 4f)
                lineTo(12f, 3.75f)
                lineTo(11.596f, 4.759f)
                curveTo(11.543f, 4.892f, 11.392f, 5f, 11.255f, 5f)
                lineTo(9.745f, 5f)
                curveTo(9.61f, 5f, 9.461f, 4.902f, 9.404f, 4.759f)
                lineTo(9f, 3.75f)
                close()
                moveTo(10.5f, 3f)
                curveTo(10.224f, 3f, 10f, 2.776f, 10f, 2.5f)
                curveTo(10f, 2.224f, 10.224f, 2f, 10.5f, 2f)
                curveTo(10.776f, 2f, 11f, 2.224f, 11f, 2.5f)
                curveTo(11f, 2.776f, 10.776f, 3f, 10.5f, 3f)
                close()
            }
            group(
                clipPathData = PathData {
                    moveTo(9f, 3.75f)
                    lineTo(10f, 4f)
                    lineTo(10.5f, 3.5f)
                    lineTo(11f, 4f)
                    lineTo(12f, 3.75f)
                    lineTo(11.596f, 4.759f)
                    curveTo(11.543f, 4.892f, 11.392f, 5f, 11.255f, 5f)
                    lineTo(9.745f, 5f)
                    curveTo(9.61f, 5f, 9.461f, 4.902f, 9.404f, 4.759f)
                    lineTo(9f, 3.75f)
                    close()
                    moveTo(10.5f, 3f)
                    curveTo(10.224f, 3f, 10f, 2.776f, 10f, 2.5f)
                    curveTo(10f, 2.224f, 10.224f, 2f, 10.5f, 2f)
                    curveTo(10.776f, 2f, 11f, 2.224f, 11f, 2.5f)
                    curveTo(11f, 2.776f, 10.776f, 3f, 10.5f, 3f)
                    close()
                }
            ) {
                path(
                    fill = SolidColor(Color(0xFF5169E2)),
                    strokeLineWidth = 1f,
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(10.5f, 4.5f)
                    moveToRelative(-1f, 0f)
                    arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, 0f)
                    arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 0f)
                }
            }
            group(
                clipPathData = PathData {
                    moveTo(9f, 3.75f)
                    lineTo(10f, 4f)
                    lineTo(10.5f, 3.5f)
                    lineTo(11f, 4f)
                    lineTo(12f, 3.75f)
                    lineTo(11.596f, 4.759f)
                    curveTo(11.543f, 4.892f, 11.392f, 5f, 11.255f, 5f)
                    lineTo(9.745f, 5f)
                    curveTo(9.61f, 5f, 9.461f, 4.902f, 9.404f, 4.759f)
                    lineTo(9f, 3.75f)
                    close()
                    moveTo(10.5f, 3f)
                    curveTo(10.224f, 3f, 10f, 2.776f, 10f, 2.5f)
                    curveTo(10f, 2.224f, 10.224f, 2f, 10.5f, 2f)
                    curveTo(10.776f, 2f, 11f, 2.224f, 11f, 2.5f)
                    curveTo(11f, 2.776f, 10.776f, 3f, 10.5f, 3f)
                    close()
                }
            ) {
                path(
                    fill = SolidColor(Color(0xFFD34D43)),
                    strokeLineWidth = 1f,
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(11.5f, 4.5f)
                    moveToRelative(-1f, 0f)
                    arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, 0f)
                    arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 0f)
                }
            }
            group(
                clipPathData = PathData {
                    moveTo(9f, 3.75f)
                    lineTo(10f, 4f)
                    lineTo(10.5f, 3.5f)
                    lineTo(11f, 4f)
                    lineTo(12f, 3.75f)
                    lineTo(11.596f, 4.759f)
                    curveTo(11.543f, 4.892f, 11.392f, 5f, 11.255f, 5f)
                    lineTo(9.745f, 5f)
                    curveTo(9.61f, 5f, 9.461f, 4.902f, 9.404f, 4.759f)
                    lineTo(9f, 3.75f)
                    close()
                    moveTo(10.5f, 3f)
                    curveTo(10.224f, 3f, 10f, 2.776f, 10f, 2.5f)
                    curveTo(10f, 2.224f, 10.224f, 2f, 10.5f, 2f)
                    curveTo(10.776f, 2f, 11f, 2.224f, 11f, 2.5f)
                    curveTo(11f, 2.776f, 10.776f, 3f, 10.5f, 3f)
                    close()
                }
            ) {
                path(
                    fill = SolidColor(Color(0xFFD34D43)),
                    strokeLineWidth = 1f,
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(9.5f, 4.5f)
                    moveToRelative(-1f, 0f)
                    arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, 0f)
                    arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 0f)
                }
            }
        }.build()

        return _GB_NIR!!
    }

@Suppress("ObjectPropertyName")
private var _GB_NIR: ImageVector? = null
