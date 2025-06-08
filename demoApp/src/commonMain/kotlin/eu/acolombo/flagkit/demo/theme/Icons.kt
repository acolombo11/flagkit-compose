package eu.acolombo.flagkit.demo.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.ui.tooling.preview.Preview

object Icons

val Icons.Browse: ImageVector
    get() = Builder(
        name = "Browse",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(
            fill = SolidColor(Color.Transparent),
            stroke = SolidColor(Color.Black),
            strokeLineWidth = 2.0f,
            strokeLineCap = StrokeCap.Companion.Round,
            strokeLineJoin = StrokeJoin.Companion.Round,
            strokeLineMiter = 4.0f,
            pathFillType = PathFillType.Companion.NonZero,
        ) {
            moveTo(21.0f, 12.0f)
            horizontalLineTo(3.0f)
            moveTo(12.0f, 21.0f)
            curveTo(10.22f, 21.0f, 8.48f, 20.472f, 7.0f, 19.483f)
            curveTo(5.52f, 18.494f, 4.366f, 17.089f, 3.685f, 15.444f)
            curveTo(3.004f, 13.8f, 2.826f, 11.99f, 3.173f, 10.244f)
            curveTo(3.52f, 8.498f, 4.377f, 6.895f, 5.636f, 5.636f)
            curveTo(6.895f, 4.377f, 8.498f, 3.52f, 10.244f, 3.173f)
            curveTo(11.99f, 2.826f, 13.8f, 3.004f, 15.444f, 3.685f)
            curveTo(17.089f, 4.366f, 18.494f, 5.52f, 19.483f, 7.0f)
            curveTo(20.472f, 8.48f, 21.0f, 10.22f, 21.0f, 12.0f)
            curveTo(21.0f, 14.387f, 20.052f, 16.676f, 18.364f, 18.364f)
            curveTo(16.676f, 20.052f, 14.387f, 21.0f, 12.0f, 21.0f)
            verticalLineTo(21.0f)
            close()
            moveTo(16.0f, 12.0f)
            curveTo(16.0f, 7.0f, 14.21f, 3.0f, 12.0f, 3.0f)
            curveTo(9.79f, 3.0f, 8.0f, 7.0f, 8.0f, 12.0f)
            curveTo(8.0f, 17.0f, 9.79f, 21.0f, 12.0f, 21.0f)
            curveTo(14.21f, 21.0f, 16.0f, 17.0f, 16.0f, 12.0f)
            close()
        }
    }.build()

@Preview
@Composable
private fun Preview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = Icons.Browse, contentDescription = "")
    }
}
