package flagkit

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.DpSize

@Composable
fun FlagPlaceholder(
    shape: Shape,
    size: DpSize,
    modifier: Modifier = Modifier,
    color: Color = Color.Gray,
    textColor: Color = Color.DarkGray,
    textStyle: TextStyle = TextStyle.Default,
) {
    Box(
        modifier = modifier
            .size(size)
            .background(color, shape),
        contentAlignment = Alignment.Center,
    ) {
        BasicText(
            modifier = Modifier.fillMaxWidth(),
            text = "?",
            style = textStyle.copy(
                color = textColor,
                textAlign = TextAlign.Center,
            ),
        )
    }
}

@Composable
fun Flag(
    countryCode: String,
    shape: Shape,
    size: DpSize,
    placeholderColor: Color,
    placeholderTextColor: Color,
    placeholderTextStyle: TextStyle,
    modifier: Modifier = Modifier,
) {
    Flag(
        countryCode = countryCode,
        shape = shape,
        size = size,
        modifier = modifier,
        placeholder = {
            FlagPlaceholder(
                modifier = modifier,
                shape = shape,
                size = size,
                color = placeholderColor,
                textColor = placeholderTextColor,
                textStyle = placeholderTextStyle,
            )
        }
    )
}