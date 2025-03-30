package flagkit.flags

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import flagkit.FlagKit

val FlagKit.MK: ImageVector
    get() {
        if (_MK != null) {
            return _MK!!
        }
        _MK = ImageVector.Builder(
            name = "MK",
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
                        0f to Color(0xFFE81B26),
                        1f to Color(0xFFD00914)
                    ),
                    start = Offset(10.496f, -0.002f),
                    end = Offset(10.496f, 14.998f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(-0.004f, -0.002f)
                horizontalLineToRelative(21f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(-21f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFE94F),
                        1f to Color(0xFFFFE633)
                    ),
                    start = Offset(10.496f, 4.998f),
                    end = Offset(10.496f, 9.998f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.496f, 7.498f)
                moveToRelative(-2.5f, 0f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 5f, 0f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -5f, 0f)
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFE94F),
                        1f to Color(0xFFFFE633)
                    ),
                    start = Offset(10.496f, -0.002f),
                    end = Offset(10.496f, 14.998f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13.961f, 7.993f)
                lineTo(20.996f, 8.998f)
                lineTo(20.996f, 5.998f)
                lineTo(13.961f, 7.003f)
                curveTo(13.984f, 7.165f, 13.996f, 7.33f, 13.996f, 7.498f)
                curveTo(13.996f, 7.666f, 13.984f, 7.831f, 13.961f, 7.993f)
                close()
                moveTo(7.031f, 7.003f)
                lineTo(-0.004f, 5.998f)
                lineTo(-0.004f, 8.998f)
                lineTo(7.031f, 7.993f)
                curveTo(7.008f, 7.831f, 6.996f, 7.666f, 6.996f, 7.498f)
                curveTo(6.996f, 7.33f, 7.008f, 7.165f, 7.031f, 7.003f)
                close()
                moveTo(11.183f, 4.065f)
                lineTo(11.996f, -0.002f)
                lineTo(8.996f, -0.002f)
                lineTo(9.81f, 4.065f)
                curveTo(10.032f, 4.021f, 10.261f, 3.998f, 10.496f, 3.998f)
                curveTo(10.731f, 3.998f, 10.961f, 4.021f, 11.183f, 4.065f)
                close()
                moveTo(9.81f, 10.931f)
                lineTo(8.996f, 14.998f)
                lineTo(11.996f, 14.998f)
                lineTo(11.183f, 10.931f)
                curveTo(10.961f, 10.975f, 10.731f, 10.998f, 10.496f, 10.998f)
                curveTo(10.261f, 10.998f, 10.032f, 10.975f, 9.81f, 10.931f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFE94F),
                        1f to Color(0xFFFFE633)
                    ),
                    start = Offset(10.496f, -2.65f),
                    end = Offset(10.496f, 17.646f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.652f, 9.539f)
                lineTo(-0.54f, 15.417f)
                lineTo(1.467f, 17.646f)
                lineTo(8.17f, 10.113f)
                curveTo(7.977f, 9.941f, 7.803f, 9.749f, 7.652f, 9.539f)
                close()
                moveTo(13.34f, 5.457f)
                lineTo(21.532f, -0.421f)
                lineTo(19.525f, -2.65f)
                lineTo(12.823f, 4.883f)
                curveTo(13.015f, 5.055f, 13.189f, 5.247f, 13.34f, 5.457f)
                close()
                moveTo(12.823f, 10.113f)
                lineTo(19.525f, 17.646f)
                lineTo(21.532f, 15.417f)
                lineTo(13.34f, 9.539f)
                curveTo(13.189f, 9.749f, 13.015f, 9.941f, 12.823f, 10.113f)
                close()
                moveTo(8.17f, 4.883f)
                lineTo(1.467f, -2.65f)
                lineTo(-0.54f, -0.421f)
                lineTo(7.652f, 5.457f)
                curveTo(7.803f, 5.247f, 7.977f, 5.055f, 8.17f, 4.883f)
                close()
            }
        }.build()

        return _MK!!
    }

@Suppress("ObjectPropertyName")
private var _MK: ImageVector? = null
