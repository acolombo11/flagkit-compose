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

val FlagKit.ME: ImageVector
    get() {
        if (_ME != null) {
            return _ME!!
        }
        _ME = ImageVector.Builder(
            name = "ME",
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
                        0f to Color(0xFFE6BE53),
                        1f to Color(0xFFD3AD46)
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
                        0f to Color(0xFFE01826),
                        1f to Color(0xFFC30A17)
                    ),
                    start = Offset(10.5f, 1f),
                    end = Offset(10.5f, 14f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(1.75f, 1f)
                lineTo(19.25f, 1f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 1.75f)
                lineTo(20f, 13.25f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.25f, 14f)
                lineTo(1.75f, 14f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 13.25f)
                lineTo(1f, 1.75f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.75f, 1f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFE6BE53),
                        1f to Color(0xFFD3AD46)
                    ),
                    start = Offset(10.5f, 2.592f),
                    end = Offset(10.5f, 12.84f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.147f, 5.147f)
                curveTo(10.342f, 5.342f, 10.658f, 5.342f, 10.853f, 5.147f)
                lineTo(10.647f, 5.353f)
                lineTo(11.65f, 4.35f)
                curveTo(11.843f, 4.157f, 12.193f, 4.096f, 12.453f, 4.227f)
                lineTo(12.547f, 4.273f)
                curveTo(12.797f, 4.399f, 12.842f, 4.658f, 12.647f, 4.853f)
                lineTo(12.853f, 4.647f)
                lineTo(11.85f, 5.65f)
                curveTo(11.657f, 5.843f, 11.596f, 6.193f, 11.727f, 6.453f)
                lineTo(11.773f, 6.547f)
                curveTo(11.899f, 6.797f, 12f, 7.227f, 12f, 7.5f)
                lineTo(12f, 7f)
                curveTo(12f, 7.276f, 12.193f, 7.404f, 12.453f, 7.273f)
                lineTo(12.547f, 7.227f)
                curveTo(12.797f, 7.101f, 12.842f, 6.842f, 12.647f, 6.647f)
                lineTo(12.853f, 6.853f)
                curveTo(12.658f, 6.658f, 12.658f, 6.342f, 12.853f, 6.147f)
                lineTo(12.647f, 6.353f)
                curveTo(12.842f, 6.158f, 13.096f, 5.807f, 13.227f, 5.547f)
                lineTo(13.273f, 5.453f)
                curveTo(13.399f, 5.203f, 13.554f, 4.786f, 13.621f, 4.516f)
                lineTo(13.879f, 3.484f)
                curveTo(13.946f, 3.217f, 14.138f, 3.185f, 14.304f, 3.405f)
                lineTo(15.196f, 4.595f)
                curveTo(15.364f, 4.819f, 15.5f, 5.214f, 15.5f, 5.505f)
                lineTo(15.5f, 6.495f)
                curveTo(15.5f, 6.774f, 15.404f, 7.193f, 15.273f, 7.453f)
                lineTo(15.227f, 7.547f)
                curveTo(15.101f, 7.797f, 14.844f, 8.156f, 14.65f, 8.35f)
                lineTo(14.35f, 8.65f)
                curveTo(14.157f, 8.843f, 13.807f, 9.096f, 13.547f, 9.227f)
                lineTo(13.453f, 9.273f)
                curveTo(13.203f, 9.399f, 12.768f, 9.5f, 12.5f, 9.5f)
                curveTo(12.224f, 9.5f, 12.193f, 9.596f, 12.453f, 9.727f)
                lineTo(12.547f, 9.773f)
                curveTo(12.797f, 9.899f, 13.158f, 10.158f, 13.353f, 10.353f)
                lineTo(13.147f, 10.147f)
                curveTo(13.342f, 10.342f, 13.658f, 10.342f, 13.853f, 10.147f)
                lineTo(13.647f, 10.353f)
                curveTo(13.842f, 10.158f, 14.158f, 10.158f, 14.353f, 10.353f)
                lineTo(14.147f, 10.147f)
                curveTo(14.342f, 10.342f, 14.404f, 10.693f, 14.273f, 10.953f)
                lineTo(14.227f, 11.047f)
                curveTo(14.101f, 11.297f, 13.768f, 11.5f, 13.5f, 11.5f)
                curveTo(13.224f, 11.5f, 12.807f, 11.404f, 12.547f, 11.273f)
                lineTo(12.453f, 11.227f)
                curveTo(12.203f, 11.101f, 11.904f, 10.807f, 11.773f, 10.547f)
                lineTo(11.727f, 10.453f)
                curveTo(11.601f, 10.203f, 11.342f, 10.158f, 11.147f, 10.353f)
                lineTo(11.353f, 10.147f)
                curveTo(11.158f, 10.342f, 11.123f, 10.684f, 11.273f, 10.91f)
                lineTo(11.727f, 11.59f)
                curveTo(11.878f, 11.816f, 11.816f, 12.123f, 11.59f, 12.273f)
                lineTo(10.91f, 12.727f)
                curveTo(10.684f, 12.878f, 10.316f, 12.877f, 10.09f, 12.727f)
                lineTo(9.41f, 12.273f)
                curveTo(9.184f, 12.122f, 9.123f, 11.816f, 9.273f, 11.59f)
                lineTo(9.727f, 10.91f)
                curveTo(9.878f, 10.684f, 9.842f, 10.342f, 9.647f, 10.147f)
                lineTo(9.853f, 10.353f)
                curveTo(9.658f, 10.158f, 9.404f, 10.193f, 9.273f, 10.453f)
                lineTo(9.227f, 10.547f)
                curveTo(9.101f, 10.797f, 8.807f, 11.096f, 8.547f, 11.227f)
                lineTo(8.453f, 11.273f)
                curveTo(8.203f, 11.399f, 7.768f, 11.5f, 7.5f, 11.5f)
                curveTo(7.224f, 11.5f, 6.904f, 11.307f, 6.773f, 11.047f)
                lineTo(6.727f, 10.953f)
                curveTo(6.601f, 10.703f, 6.658f, 10.342f, 6.853f, 10.147f)
                lineTo(6.647f, 10.353f)
                curveTo(6.842f, 10.158f, 7.158f, 10.158f, 7.353f, 10.353f)
                lineTo(7.147f, 10.147f)
                curveTo(7.342f, 10.342f, 7.658f, 10.342f, 7.853f, 10.147f)
                lineTo(7.647f, 10.353f)
                curveTo(7.842f, 10.158f, 8.193f, 9.904f, 8.453f, 9.773f)
                lineTo(8.547f, 9.727f)
                curveTo(8.797f, 9.601f, 8.768f, 9.5f, 8.5f, 9.5f)
                curveTo(8.224f, 9.5f, 7.807f, 9.404f, 7.547f, 9.273f)
                lineTo(7.453f, 9.227f)
                curveTo(7.203f, 9.101f, 6.844f, 8.844f, 6.65f, 8.65f)
                lineTo(6.35f, 8.35f)
                curveTo(6.157f, 8.157f, 5.904f, 7.807f, 5.773f, 7.547f)
                lineTo(5.727f, 7.453f)
                curveTo(5.601f, 7.203f, 5.5f, 6.786f, 5.5f, 6.495f)
                lineTo(5.5f, 5.505f)
                curveTo(5.5f, 5.226f, 5.638f, 4.815f, 5.804f, 4.595f)
                lineTo(6.696f, 3.405f)
                curveTo(6.864f, 3.181f, 7.054f, 3.214f, 7.121f, 3.484f)
                lineTo(7.379f, 4.516f)
                curveTo(7.446f, 4.783f, 7.596f, 5.193f, 7.727f, 5.453f)
                lineTo(7.773f, 5.547f)
                curveTo(7.899f, 5.797f, 8.158f, 6.158f, 8.353f, 6.353f)
                lineTo(8.147f, 6.147f)
                curveTo(8.342f, 6.342f, 8.342f, 6.658f, 8.147f, 6.853f)
                lineTo(8.353f, 6.647f)
                curveTo(8.158f, 6.842f, 8.193f, 7.096f, 8.453f, 7.227f)
                lineTo(8.547f, 7.273f)
                curveTo(8.797f, 7.399f, 9f, 7.273f, 9f, 7f)
                lineTo(9f, 7.5f)
                curveTo(9f, 7.224f, 9.096f, 6.807f, 9.227f, 6.547f)
                lineTo(9.273f, 6.453f)
                curveTo(9.399f, 6.203f, 9.344f, 5.844f, 9.15f, 5.65f)
                lineTo(8.147f, 4.647f)
                lineTo(8.353f, 4.853f)
                curveTo(8.158f, 4.658f, 8.193f, 4.404f, 8.453f, 4.273f)
                lineTo(8.547f, 4.227f)
                curveTo(8.797f, 4.101f, 9.156f, 4.156f, 9.35f, 4.35f)
                lineTo(10.353f, 5.353f)
                lineTo(10.147f, 5.147f)
                close()
                moveTo(9.35f, 3.35f)
                curveTo(9.157f, 3.157f, 9.209f, 2.93f, 9.475f, 2.842f)
                lineTo(10.025f, 2.658f)
                curveTo(10.288f, 2.571f, 10.709f, 2.57f, 10.975f, 2.658f)
                lineTo(11.525f, 2.842f)
                curveTo(11.788f, 2.929f, 11.844f, 3.156f, 11.65f, 3.35f)
                lineTo(11.35f, 3.65f)
                curveTo(11.157f, 3.843f, 10.768f, 4f, 10.5f, 4f)
                curveTo(10.224f, 4f, 9.844f, 3.844f, 9.65f, 3.65f)
                lineTo(9.35f, 3.35f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF215F90)),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9.5f, 9.006f)
                curveTo(9.5f, 9.279f, 9.576f, 9.291f, 9.685f, 9.025f)
                curveTo(9.685f, 9.025f, 10f, 8f, 10.5f, 8f)
                curveTo(11f, 8f, 11.323f, 9.042f, 11.323f, 9.042f)
                curveTo(11.421f, 9.295f, 11.5f, 9.278f, 11.5f, 8.995f)
                lineTo(11.5f, 8.5f)
                curveTo(11.5f, 7.672f, 11.052f, 7f, 10.5f, 7f)
                curveTo(9.948f, 7f, 9.5f, 7.672f, 9.5f, 8.5f)
                lineTo(9.5f, 9.006f)
                close()
            }
        }.build()

        return _ME!!
    }

@Suppress("ObjectPropertyName")
private var _ME: ImageVector? = null
