package flagkit

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp

sealed class FlagStyle(val size: Size) {
    data object None : FlagStyle(Size.Big)
    data class RoundedRect(val cornerRadius: Dp = 2.dp) : FlagStyle(Size.Big)
    data object Square : FlagStyle(Size.Small)
    data object Circle : FlagStyle(Size.Small)

    enum class Size(val width: Dp, val height: Dp) {
        Small(width = 15.dp, height = 15.dp),
        Big(width = 21.dp, height = 15.dp),
    }
}

@Composable
@Deprecated(
    "1:1 Implementation of FlagKit iOS Api." +
            "Usage is discouraged as the compose api is better."
)
fun Flag(
    countryCode: String,
    modifier: Modifier = Modifier,
    style: FlagStyle = FlagStyle.None,
    size: DpSize = DpSize(style.size.width, style.size.height),
) {
    val shape = when (style) {
        FlagStyle.None, FlagStyle.Square -> RectangleShape
        is FlagStyle.RoundedRect -> RoundedCornerShape(style.cornerRadius)
        FlagStyle.Circle -> CircleShape
    }
    Flag(
        modifier = modifier,
        size = size,
        code = countryCode,
        contentScale = when (style) {
            FlagStyle.None, is FlagStyle.RoundedRect -> ContentScale.FillWidth
            FlagStyle.Circle, FlagStyle.Square -> ContentScale.Crop
        },
        shape = shape,
    )
}