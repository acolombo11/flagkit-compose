package flagkit.flags

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import flagkit.FlagKit

val FlagKit.ZM: ImageVector
    get() {
        if (_ZM != null) {
            return _ZM!!
        }
        _ZM = ImageVector.Builder(
            name = "ZM",
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
                        0f to Color(0xFF2A8815),
                        1f to Color(0xFF35A51D)
                    ),
                    start = Offset(10.5f, 15f),
                    end = Offset(10.5f, 0f)
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
                        0f to Color(0xFFEF8A34),
                        1f to Color(0xFFEC7E21)
                    ),
                    start = Offset(16.574f, 1.425f),
                    end = Offset(16.574f, 4.638f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(16.196f, 3.624f)
                curveTo(16.196f, 3.624f, 15.793f, 3.777f, 15.362f, 3.624f)
                curveTo(15.02f, 3.502f, 14.675f, 3.09f, 14.392f, 2.947f)
                curveTo(14.228f, 2.864f, 14.533f, 2.469f, 14.208f, 2.576f)
                curveTo(13.883f, 2.682f, 13.353f, 2.187f, 13.353f, 2.187f)
                curveTo(13.353f, 2.187f, 12.805f, 1.519f, 13.612f, 1.519f)
                curveTo(14.419f, 1.519f, 16.122f, 2.099f, 16.122f, 2.099f)
                curveTo(16.122f, 2.099f, 16.185f, 1.799f, 16.324f, 1.661f)
                curveTo(16.463f, 1.523f, 16.566f, 1.396f, 16.793f, 1.431f)
                curveTo(17.021f, 1.465f, 17.147f, 1.786f, 17.147f, 1.786f)
                lineTo(16.793f, 1.921f)
                lineTo(16.793f, 2.187f)
                curveTo(16.793f, 2.187f, 19.155f, 1.463f, 19.713f, 1.519f)
                curveTo(20.271f, 1.575f, 19.822f, 2.188f, 19.485f, 2.576f)
                curveTo(19.355f, 2.726f, 18.929f, 3.032f, 18.67f, 2.787f)
                curveTo(18.411f, 2.541f, 18.507f, 3.052f, 18.239f, 3.217f)
                curveTo(17.802f, 3.485f, 17.638f, 3.732f, 17.487f, 3.803f)
                curveTo(17.337f, 3.875f, 17.008f, 3.803f, 17.008f, 3.803f)
                lineTo(17.104f, 4.05f)
                curveTo(17.104f, 4.05f, 17.131f, 4.346f, 17.008f, 4.464f)
                curveTo(16.885f, 4.582f, 16.8f, 4.666f, 16.5f, 4.63f)
                curveTo(16.2f, 4.595f, 16.059f, 4.67f, 15.959f, 4.341f)
                curveTo(15.859f, 4.011f, 16.196f, 3.624f, 16.196f, 3.624f)
                close()
                moveTo(16.443f, 3.282f)
                lineTo(16.443f, 4.054f)
                lineTo(16.782f, 3.77f)
                lineTo(16.443f, 3.282f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFF48D36),
                        1f to Color(0xFFEC7E21)
                    ),
                    start = Offset(19.5f, 6f),
                    end = Offset(19.5f, 15f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(18f, 6f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(-3f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF262626),
                        1f to Color(0xFF0D0D0D)
                    ),
                    start = Offset(16.5f, 6f),
                    end = Offset(16.5f, 15f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(15f, 6f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(-3f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFEC322B),
                        1f to Color(0xFFDB261F)
                    ),
                    start = Offset(13.5f, 6f),
                    end = Offset(13.5f, 15f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 6f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(-3f)
                close()
            }
        }.build()

        return _ZM!!
    }

@Suppress("ObjectPropertyName")
private var _ZM: ImageVector? = null
