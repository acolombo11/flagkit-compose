package eu.acolombo.flagkit.demo

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Slider
import androidx.compose.material3.Text
import androidx.compose.material3.ripple
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import eu.acolombo.flagkit.demo.theme.Browse
import eu.acolombo.flagkit.demo.theme.Icons
import eu.acolombo.flagkit.demo.theme.PlusJakartaSans
import flagkit.Flag

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DemoApp() {
    MaterialTheme(
        colorScheme = MaterialTheme.colorScheme.copy(
        ),
        typography = MaterialTheme.typography.copy(
            titleLarge = MaterialTheme.typography.titleLarge.copy(
                fontFamily = PlusJakartaSans,
                fontWeight = FontWeight.ExtraBold
            ),
            headlineSmall = MaterialTheme.typography.headlineSmall.copy(
                fontFamily = PlusJakartaSans,
                fontWeight = FontWeight.ExtraBold
            ),
            bodyLarge = MaterialTheme.typography.bodyLarge.copy(
                fontFamily = PlusJakartaSans,
                fontWeight = FontWeight.Medium
            ),
        )
    ) {
        Scaffold(
            topBar = {
                CenterAlignedTopAppBar(
                    title = { Text("FlagKit Compose") }
                )
            }
        ) { padding ->
            var height by remember { mutableFloatStateOf(92f) }
            var rounding by remember { mutableFloatStateOf(8f) }

            LazyColumn(
                contentPadding = padding,
                modifier = Modifier
                    .padding(horizontal = 16.dp)
                    .fillMaxWidth(),
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                item {
                    Box(
                        modifier = Modifier
                            .clip(RoundedCornerShape(24.dp))
                            .fillMaxWidth()
                            .height(200.dp)
                            .background(MaterialTheme.colorScheme.surfaceContainer),
                        contentAlignment = Alignment.Center,
                    ) {
                        Flag(
                            countryCode = "us",
                            size = DpSize((height * 1.4).dp, height.dp),
                            shape = RoundedCornerShape(rounding.dp),
                        )
                    }
                }

                item {
                    TitleItem("Locale")
                }
                item {
                    LocaleItem()
                }
                item {
                    TitleItem("Style")
                }
                item {
                    SizeItem(
                        title = "Size",
                        size = height,
                        minimumSize = 15f,
                        maximumSize = 160f,
                        onSizeChange = { height = it },
                    )
                }
                item {
                    SizeItem(
                        title = "Rounding",
                        size = rounding,
                        minimumSize = 0f,
                        maximumSize = height / 2,
                        onSizeChange = { rounding = it },
                    )
                }
            }
//                Flag("it", style = flagkit.FlagStyle.Circle)
//                Flag("it", size = DpSize(84.dp, 60.dp))
//                Flag("it", style = flagkit.FlagStyle.Circle, size = DpSize(60.dp, 60.dp))
        }
    }
}

@Composable
fun TitleItem(title: String) {
    Text(
        text = title,
        style = MaterialTheme.typography.headlineSmall,
        modifier = Modifier.padding(top = 16.dp)
    )
}

@Composable
fun LocaleItem(
    height: Dp = 52.dp,
    shape: Shape = RoundedCornerShape(12.dp),
) {
    val interactionSource = remember { MutableInteractionSource() }
    Row(
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .clip(shape)
            .fillMaxWidth()
            .clickable(interactionSource = interactionSource, indication = null) { },
    ) {
        Box(
            modifier = Modifier
                .clip(shape)
                .size(height)
                .background(MaterialTheme.colorScheme.surfaceContainer)
                .clickable(interactionSource, indication = ripple()) { },
            contentAlignment = Alignment.Center,
        ) {
            Icon(imageVector = Icons.Browse, contentDescription = null)
        }
        Column(
            modifier = Modifier
                .weight(1f)
                .clip(shape)
                .clickable(interactionSource, indication = ripple()) { },
        ) {
            Text("English (United States)")
            Text("en-US", modifier = Modifier.alpha(.5f))
        }
    }
}

@Composable
fun SizeItem(
    title: String,
    size: Float,
    minimumSize: Float,
    maximumSize: Float,
    onSizeChange: (Float) -> Unit,
) {
    Column {
        Column {
            Text("$title: ${size.toInt()} dp")
            Slider(
                value = size,
                valueRange = minimumSize..maximumSize,
                onValueChange = onSizeChange,
            )
        }
    }
}