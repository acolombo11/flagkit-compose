package flagkit.flags

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import flagkit.FlagKit

val FlagKit.EU: ImageVector
    get() {
        if (_EU != null) {
            return _EU!!
        }
        _EU = ImageVector.Builder(
            name = "EU",
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
                        0f to Color(0xFF043CAE),
                        1f to Color(0xFF00339A)
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
                        0f to Color(0xFFFFD429),
                        1f to Color(0xFFFFCC00)
                    ),
                    start = Offset(10.5f, 1.793f),
                    end = Offset(10.5f, 13.207f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.5f, 3f)
                lineTo(9.793f, 3.207f)
                lineTo(10f, 2.5f)
                lineTo(9.793f, 1.793f)
                lineTo(10.5f, 2f)
                lineTo(11.207f, 1.793f)
                lineTo(11f, 2.5f)
                lineTo(11.207f, 3.207f)
                lineTo(10.5f, 3f)
                close()
                moveTo(10.5f, 13f)
                lineTo(9.793f, 13.207f)
                lineTo(10f, 12.5f)
                lineTo(9.793f, 11.793f)
                lineTo(10.5f, 12f)
                lineTo(11.207f, 11.793f)
                lineTo(11f, 12.5f)
                lineTo(11.207f, 13.207f)
                lineTo(10.5f, 13f)
                close()
                moveTo(15.5f, 8f)
                lineTo(14.793f, 8.207f)
                lineTo(15f, 7.5f)
                lineTo(14.793f, 6.793f)
                lineTo(15.5f, 7f)
                lineTo(16.207f, 6.793f)
                lineTo(16f, 7.5f)
                lineTo(16.207f, 8.207f)
                lineTo(15.5f, 8f)
                close()
                moveTo(5.5f, 8f)
                lineTo(4.793f, 8.207f)
                lineTo(5f, 7.5f)
                lineTo(4.793f, 6.793f)
                lineTo(5.5f, 7f)
                lineTo(6.207f, 6.793f)
                lineTo(6f, 7.5f)
                lineTo(6.207f, 8.207f)
                lineTo(5.5f, 8f)
                close()
                moveTo(14.83f, 5.5f)
                lineTo(14.123f, 5.707f)
                lineTo(14.33f, 5f)
                lineTo(14.123f, 4.293f)
                lineTo(14.83f, 4.5f)
                lineTo(15.537f, 4.293f)
                lineTo(15.33f, 5f)
                lineTo(15.537f, 5.707f)
                lineTo(14.83f, 5.5f)
                close()
                moveTo(6.17f, 10.5f)
                lineTo(5.463f, 10.707f)
                lineTo(5.67f, 10f)
                lineTo(5.463f, 9.293f)
                lineTo(6.17f, 9.5f)
                lineTo(6.877f, 9.293f)
                lineTo(6.67f, 10f)
                lineTo(6.877f, 10.707f)
                lineTo(6.17f, 10.5f)
                close()
                moveTo(13f, 3.67f)
                lineTo(12.293f, 3.877f)
                lineTo(12.5f, 3.17f)
                lineTo(12.293f, 2.463f)
                lineTo(13f, 2.67f)
                lineTo(13.707f, 2.463f)
                lineTo(13.5f, 3.17f)
                lineTo(13.707f, 3.877f)
                lineTo(13f, 3.67f)
                close()
                moveTo(8f, 12.33f)
                lineTo(7.293f, 12.537f)
                lineTo(7.5f, 11.83f)
                lineTo(7.293f, 11.123f)
                lineTo(8f, 11.33f)
                lineTo(8.707f, 11.123f)
                lineTo(8.5f, 11.83f)
                lineTo(8.707f, 12.537f)
                lineTo(8f, 12.33f)
                close()
                moveTo(14.83f, 10.5f)
                lineTo(14.123f, 10.707f)
                lineTo(14.33f, 10f)
                lineTo(14.123f, 9.293f)
                lineTo(14.83f, 9.5f)
                lineTo(15.537f, 9.293f)
                lineTo(15.33f, 10f)
                lineTo(15.537f, 10.707f)
                lineTo(14.83f, 10.5f)
                close()
                moveTo(6.17f, 5.5f)
                lineTo(5.463f, 5.707f)
                lineTo(5.67f, 5f)
                lineTo(5.463f, 4.293f)
                lineTo(6.17f, 4.5f)
                lineTo(6.877f, 4.293f)
                lineTo(6.67f, 5f)
                lineTo(6.877f, 5.707f)
                lineTo(6.17f, 5.5f)
                close()
                moveTo(13f, 12.33f)
                lineTo(12.293f, 12.537f)
                lineTo(12.5f, 11.83f)
                lineTo(12.293f, 11.123f)
                lineTo(13f, 11.33f)
                lineTo(13.707f, 11.123f)
                lineTo(13.5f, 11.83f)
                lineTo(13.707f, 12.537f)
                lineTo(13f, 12.33f)
                close()
                moveTo(8f, 3.67f)
                lineTo(7.293f, 3.877f)
                lineTo(7.5f, 3.17f)
                lineTo(7.293f, 2.463f)
                lineTo(8f, 2.67f)
                lineTo(8.707f, 2.463f)
                lineTo(8.5f, 3.17f)
                lineTo(8.707f, 3.877f)
                lineTo(8f, 3.67f)
                close()
            }
        }.build()

        return _EU!!
    }

@Suppress("ObjectPropertyName")
private var _EU: ImageVector? = null
