package flagkit.flags

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import flagkit.FlagKit

val FlagKit.IM: ImageVector
    get() {
        if (_IM != null) {
            return _IM!!
        }
        _IM = ImageVector.Builder(
            name = "IM",
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
                        0f to Color(0xFFE52D42),
                        1f to Color(0xFFCB1D31)
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
                    start = Offset(10.602f, 2.322f),
                    end = Offset(10.602f, 13.917f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(16.5f, 3f)
                lineTo(14.5f, 3f)
                lineTo(13f, 6.5f)
                lineTo(11.5f, 5.5f)
                curveTo(11.5f, 5.5f, 10.411f, 2.911f, 10f, 2.5f)
                curveTo(9.589f, 2.089f, 9.172f, 2.469f, 7.87f, 2.849f)
                curveTo(6.569f, 3.228f, 6.518f, 3.664f, 6.009f, 3.664f)
                curveTo(5.803f, 3.664f, 5.148f, 2.904f, 4.782f, 2.677f)
                curveTo(4.244f, 2.344f, 4.051f, 2.5f, 4.18f, 3f)
                curveTo(4.236f, 3.216f, 4.663f, 3.483f, 4.934f, 3.871f)
                curveTo(5.289f, 4.38f, 5.5f, 5f, 5.5f, 5f)
                curveTo(5.5f, 5f, 5.988f, 4.544f, 6.25f, 4.469f)
                curveTo(6.648f, 4.356f, 7.096f, 4.551f, 7.622f, 4.469f)
                curveTo(8.289f, 4.366f, 9f, 4f, 9f, 4f)
                lineTo(9.174f, 5.907f)
                curveTo(9.174f, 5.907f, 6.795f, 8.117f, 7f, 9f)
                curveTo(7.205f, 9.883f, 9.469f, 10.966f, 10f, 11.74f)
                curveTo(10.531f, 12.513f, 9.684f, 12.801f, 9.684f, 13.173f)
                curveTo(9.684f, 13.544f, 9.596f, 14.039f, 10f, 13.89f)
                curveTo(10.404f, 13.742f, 10.453f, 13.098f, 10.823f, 12.513f)
                curveTo(11.078f, 12.111f, 11.283f, 11.899f, 11.319f, 11.74f)
                curveTo(11.405f, 11.35f, 10.291f, 10.325f, 9.684f, 9.599f)
                curveTo(9.395f, 9.254f, 8.813f, 8.785f, 8.813f, 8.785f)
                lineTo(10.531f, 7.5f)
                curveTo(10.531f, 7.5f, 13.497f, 8.725f, 14.166f, 8.317f)
                curveTo(14.835f, 7.909f, 15f, 4f, 15f, 4f)
                lineTo(17.062f, 3.5f)
                lineTo(16.5f, 3f)
                lineTo(16.5f, 3f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFF8DD4E),
                        1f to Color(0xFFF9DA38)
                    ),
                    start = Offset(9.5f, 2.5f),
                    end = Offset(9.5f, 11.5f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11.5f, 11.5f)
                curveTo(11.224f, 11.5f, 11f, 11.276f, 11f, 11f)
                curveTo(11f, 10.724f, 11.224f, 10.5f, 11.5f, 10.5f)
                curveTo(11.776f, 10.5f, 12f, 10.724f, 12f, 11f)
                curveTo(12f, 11.276f, 11.776f, 11.5f, 11.5f, 11.5f)
                close()
                moveTo(13.5f, 3.5f)
                curveTo(13.224f, 3.5f, 13f, 3.276f, 13f, 3f)
                curveTo(13f, 2.724f, 13.224f, 2.5f, 13.5f, 2.5f)
                curveTo(13.776f, 2.5f, 14f, 2.724f, 14f, 3f)
                curveTo(14f, 3.276f, 13.776f, 3.5f, 13.5f, 3.5f)
                close()
                moveTo(13.5f, 7.5f)
                curveTo(13.224f, 7.5f, 13f, 7.276f, 13f, 7f)
                curveTo(13f, 6.724f, 13.224f, 6.5f, 13.5f, 6.5f)
                curveTo(13.776f, 6.5f, 14f, 6.724f, 14f, 7f)
                curveTo(14f, 7.276f, 13.776f, 7.5f, 13.5f, 7.5f)
                close()
                moveTo(7.5f, 9.5f)
                curveTo(7.224f, 9.5f, 7f, 9.276f, 7f, 9f)
                curveTo(7f, 8.724f, 7.224f, 8.5f, 7.5f, 8.5f)
                curveTo(7.776f, 8.5f, 8f, 8.724f, 8f, 9f)
                curveTo(8f, 9.276f, 7.776f, 9.5f, 7.5f, 9.5f)
                close()
                moveTo(9.5f, 3.5f)
                curveTo(9.224f, 3.5f, 9f, 3.276f, 9f, 3f)
                curveTo(9f, 2.724f, 9.224f, 2.5f, 9.5f, 2.5f)
                curveTo(9.776f, 2.5f, 10f, 2.724f, 10f, 3f)
                curveTo(10f, 3.276f, 9.776f, 3.5f, 9.5f, 3.5f)
                close()
                moveTo(10.5f, 7.5f)
                curveTo(10.224f, 7.5f, 10f, 7.052f, 10f, 6.5f)
                curveTo(10f, 5.948f, 10.224f, 5.5f, 10.5f, 5.5f)
                curveTo(10.776f, 5.5f, 11f, 5.948f, 11f, 6.5f)
                curveTo(11f, 7.052f, 10.776f, 7.5f, 10.5f, 7.5f)
                close()
                moveTo(5.5f, 5.5f)
                curveTo(5.224f, 5.5f, 5f, 5.276f, 5f, 5f)
                curveTo(5f, 4.724f, 5.224f, 4.5f, 5.5f, 4.5f)
                curveTo(5.776f, 4.5f, 6f, 4.724f, 6f, 5f)
                curveTo(6f, 5.276f, 5.776f, 5.5f, 5.5f, 5.5f)
                close()
            }
        }.build()

        return _IM!!
    }

@Suppress("ObjectPropertyName")
private var _IM: ImageVector? = null
