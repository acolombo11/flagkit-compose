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

val FlagKit.AS: ImageVector
    get() {
        if (_AS != null) {
            return _AS!!
        }
        _AS = ImageVector.Builder(
            name = "AS",
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
                        0f to Color(0xFF071585),
                        1f to Color(0xFF000B64)
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
                        0f to Color(0xFFD32636),
                        1f to Color(0xFFBA1827)
                    ),
                    start = Offset(11f, -0.5f),
                    end = Offset(11f, 15.5f)
                ),
                strokeLineWidth = 1f
            ) {
                moveTo(22f, 15.5f)
                lineToRelative(-22f, -8f)
                lineToRelative(22f, -8f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFFFFF),
                        1f to Color(0xFFF0F0F0)
                    ),
                    start = Offset(11.963f, 0.928f),
                    end = Offset(11.963f, 14.072f)
                ),
                strokeLineWidth = 1f
            ) {
                moveTo(21f, 0.928f)
                lineToRelative(-18.074f, 6.572f)
                lineToRelative(18.074f, 6.572f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFAB5423),
                        1f to Color(0xFF5A3719)
                    ),
                    start = Offset(16.504f, 3f),
                    end = Offset(15.772f, 7.902f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(16f, 7.038f)
                curveTo(15.882f, 6.92f, 15.194f, 7.194f, 15.194f, 7.194f)
                lineTo(14f, 6f)
                curveTo(14f, 6f, 13.938f, 5.337f, 14.5f, 5f)
                curveTo(14.925f, 4.745f, 15.72f, 4.84f, 16.499f, 4.5f)
                curveTo(17.746f, 3.956f, 19f, 3f, 19f, 3f)
                lineTo(18.198f, 5.206f)
                curveTo(18.198f, 5.206f, 19.117f, 5.679f, 19f, 6f)
                curveTo(18.966f, 6.093f, 18.069f, 6.385f, 18f, 6.5f)
                curveTo(17.868f, 6.719f, 18.524f, 6.786f, 18.32f, 7.038f)
                curveTo(17.733f, 7.765f, 17f, 8.5f, 17f, 8.5f)
                lineTo(16f, 8f)
                curveTo(16f, 8f, 16.15f, 7.189f, 16f, 7.038f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFFC322)),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13.5f, 7.5f)
                moveToRelative(-1f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 0f)
            }
            path(
                fill = SolidColor(Color(0xFFFFC322)),
                strokeLineWidth = 1f
            ) {
                moveTo(12.5f, 9f)
                lineTo(17.5f, 9f)
                curveTo(17.776f, 9f, 18f, 8.776f, 18f, 8.5f)
                curveTo(18f, 8.224f, 17.776f, 8f, 17.5f, 8f)
                lineTo(12.5f, 8f)
                curveTo(12.224f, 8f, 12f, 8.224f, 12f, 8.5f)
                curveTo(12f, 8.776f, 12.224f, 9f, 12.5f, 9f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFFC322)),
                strokeLineWidth = 1f
            ) {
                moveTo(14.197f, 10.46f)
                lineTo(17.697f, 8.96f)
                curveTo(17.951f, 8.851f, 18.068f, 8.557f, 17.96f, 8.303f)
                curveTo(17.851f, 8.049f, 17.557f, 7.932f, 17.303f, 8.04f)
                lineTo(13.803f, 9.54f)
                curveTo(13.549f, 9.649f, 13.432f, 9.943f, 13.54f, 10.197f)
                curveTo(13.649f, 10.451f, 13.943f, 10.568f, 14.197f, 10.46f)
                close()
            }
        }.build()

        return _AS!!
    }

@Suppress("ObjectPropertyName")
private var _AS: ImageVector? = null
