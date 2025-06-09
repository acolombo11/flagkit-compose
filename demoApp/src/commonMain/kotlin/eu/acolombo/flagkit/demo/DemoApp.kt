package eu.acolombo.flagkit.demo

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
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
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import eu.acolombo.flagkit.demo.theme.Browse
import eu.acolombo.flagkit.demo.theme.DemoAppTheme
import eu.acolombo.flagkit.demo.theme.Icons
import flagkit.Flag
import flagkit.FlagKit
import flagkit_compose.demoapp.generated.resources.Res
import flagkit_compose.demoapp.generated.resources.app_title
import flagkit_compose.demoapp.generated.resources.title_flag
import flagkit_compose.demoapp.generated.resources.title_rounding
import flagkit_compose.demoapp.generated.resources.title_size
import flagkit_compose.demoapp.generated.resources.title_style
import org.jetbrains.compose.resources.stringResource

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DemoApp() {
    var showFlagPicker by remember { mutableStateOf(false) }
    val flagPickerState = rememberLazyListState()

    var flag by remember { mutableStateOf(FlagKit.Flag.US) }
    var height by remember { mutableFloatStateOf(92f) }
    var rounding by remember { mutableFloatStateOf(8f) }

    DemoAppTheme {
        Scaffold(
            topBar = {
                CenterAlignedTopAppBar(
                    title = { Text(stringResource(Res.string.app_title)) },
                )
            }
        ) { padding ->
            if (showFlagPicker) {
                FlagPickerDialog(
                    modifier = Modifier
                        .fillMaxHeight(.9f)
                        .clip(MaterialTheme.shapes.extraLarge),
                    lazyState = flagPickerState,
                    selectedFlag = flag,
                    onSelectFlag = { flag = it },
                    hidePicker = { showFlagPicker = false },
                )
            }
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
                            flag = flag,
                            size = DpSize((height * 1.4).dp, height.dp),
                            shape = RoundedCornerShape(rounding.dp),
                        )
                    }
                }
                item {
                    TitleItem(stringResource(Res.string.title_flag))
                }
                item {
                    SelectedFlagItem(flag = flag, onClick = { showFlagPicker = true })
                }
                item {
                    TitleItem(stringResource(Res.string.title_style))
                }
                item {
                    SizeItem(
                        title = stringResource(Res.string.title_size),
                        size = height,
                        minimumSize = 15f,
                        maximumSize = 160f,
                        onSizeChange = { height = it },
                    )
                }
                item {
                    SizeItem(
                        title = stringResource(Res.string.title_rounding),
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
fun SelectedFlagItem(
    flag: FlagKit.Flag,
    onClick: () -> Unit,
    height: Dp = 52.dp,
    shape: Shape = RoundedCornerShape(12.dp),
) {
    val interactionSource = remember { MutableInteractionSource() }
    Row(
        modifier = Modifier
            .clip(shape)
            .fillMaxWidth()
            .clickable(interactionSource = interactionSource, indication = null, onClick = onClick),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Box(
            modifier = Modifier
                .clip(shape)
                .size(height)
                .background(MaterialTheme.colorScheme.surfaceContainer)
                .clickable(interactionSource, indication = ripple(), onClick = onClick),
            contentAlignment = Alignment.Center,
        ) {
            Icon(
                imageVector = Icons.Browse,
                contentDescription = null,
            )
        }
        Column(
            modifier = Modifier
                .weight(1f)
                .clip(shape)
                .clickable(interactionSource, indication = ripple(), onClick = onClick),
        ) {
            Text(
                text = flag.region,
            )
            Text(
                modifier = Modifier.alpha(.5f),
                text = flag.name,
            )
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
            Row {
                Text(
                    modifier = Modifier.weight(1f),
                    text = title,
                )
                Text(
                    modifier = Modifier.alpha(.5f),
                    text = "${size.toInt()} dp",
                    style = MaterialTheme.typography.labelLarge
                )
            }
            Slider(
                value = size,
                valueRange = minimumSize..maximumSize,
                onValueChange = onSizeChange,
            )
        }
    }
}