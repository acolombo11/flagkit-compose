package flagkit

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp

@Composable
fun Flag(
    flag: FlagKit.Flag,
    modifier: Modifier = Modifier,
    shape: Shape = DefaultFlagShape,
    size: DpSize = DefaultFlagSize,
    contentScale: ContentScale = ContentScale.FillWidth,
) {
    Image(
        modifier = modifier
            .size(size)
            .clip(shape),
        imageVector = flag.image,
        contentDescription = listOfNotNull("Flag", flag.region).joinToString(" "),
        contentScale = contentScale,
    )
}

@Composable
fun Flag(
    code: String,
    shape: Shape,
    size: DpSize,
    modifier: Modifier = Modifier,
    contentScale: ContentScale = ContentScale.FillWidth,
    placeholder: @Composable () -> Unit = {
        FlagPlaceholder(modifier = modifier, shape = shape, size = size)
    },
) {
    FlagKit.Flag.entries.find { it.name == code.uppercase() }?.let {
        Flag(
            modifier = modifier,
            flag = it,
            shape = shape,
            size = size,
            contentScale = contentScale,
        )
    } ?: placeholder()
}

private val DefaultFlagShape = RoundedCornerShape(2.dp)
private val DefaultFlagSize = DpSize(28.dp, 20.dp)