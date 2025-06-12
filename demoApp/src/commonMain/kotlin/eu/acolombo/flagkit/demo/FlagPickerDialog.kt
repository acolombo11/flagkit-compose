@file:OptIn(ExperimentalMaterial3Api::class)

package eu.acolombo.flagkit.demo

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ManageSearch
import androidx.compose.material.icons.filled.ArrowUpward
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.BasicAlertDialog
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FilledIconButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.SearchBar
import androidx.compose.material3.SearchBarDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import flagkit.Flag
import flagkit.FlagKit
import flagkit_compose.demoapp.generated.resources.Res
import flagkit_compose.demoapp.generated.resources.button_dismiss
import flagkit_compose.demoapp.generated.resources.button_return_to_top
import flagkit_compose.demoapp.generated.resources.label_search_flag
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import org.jetbrains.compose.resources.stringResource

@Composable
internal fun FlagPickerDialog(
    selectedFlag: FlagKit.Flag?,
    onSelectFlag: (FlagKit.Flag) -> Unit,
    hidePicker: () -> Unit,
    onSearchError: () -> Unit = { },
    modifier: Modifier = Modifier,
    lazyState: LazyListState = rememberLazyListState(),
) {
    BasicAlertDialog(
        modifier = modifier,
        onDismissRequest = { hidePicker() },
    ) {
        FlagSearchBar(
            flags = FlagKit.Flag.entries,
            selectedFlag = selectedFlag,
            lazyState = lazyState,
            onDismiss = hidePicker,
            onSelection = { flag ->
                hidePicker()
                onSelectFlag(flag)
            },
            onSearchError = {
                hidePicker()
                onSearchError()
            },
        )
    }
}

@Composable
private fun FlagSearchBar(
    flags: List<FlagKit.Flag>,
    selectedFlag: FlagKit.Flag?,
    onSelection: (FlagKit.Flag) -> Unit,
    onDismiss: () -> Unit,
    onSearchError: () -> Unit,
    modifier: Modifier = Modifier,
    lazyState: LazyListState = rememberLazyListState(),
) {
    var query by remember { mutableStateOf("") }

    val filteredFlags = flags.filter { flag ->
        flag.toString().contains(
            other = query,
            ignoreCase = true,
        )
    }

    val expanded = true
    val onExpandedChange: (Boolean) -> Unit = { }

    Box(modifier = modifier) { // Box to avoid SearchBar InputField to take up all height
        SearchBar(
            inputField = {
                SearchBarDefaults.InputField(
                    modifier = Modifier.fillMaxWidth(),
                    query = query,
                    onQueryChange = { query = it },
                    onSearch = {
                        filteredFlags.singleOrNull()?.let {
                            onSelection(it)
                        } ?: onSearchError()
                    },
                    expanded = expanded,
                    onExpandedChange = onExpandedChange,
                    placeholder = {
                        Text(stringResource(Res.string.label_search_flag))
                    },
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.AutoMirrored.Default.ManageSearch,
                            contentDescription = null, // Placeholder is enough
                        )
                    },
                    trailingIcon = {
                        IconButton(
                            onClick = onDismiss,
                            content = {
                                Icon(
                                    imageVector = Icons.Default.Close,
                                    contentDescription = stringResource(Res.string.button_dismiss),
                                )
                            },
                        )
                    },
                )
            },
            expanded = expanded,
            onExpandedChange = onExpandedChange,
        ) {
            FlagsList(
                flags = filteredFlags,
                selectedFlag = selectedFlag,
                lazyState = lazyState,
                onSelection = onSelection,
            )
        }
    }
}

@Composable
private fun FlagsList(
    flags: List<FlagKit.Flag>,
    selectedFlag: FlagKit.Flag?,
    lazyState: LazyListState,
    onSelection: (FlagKit.Flag) -> Unit,
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier,
        contentAlignment = Alignment.BottomEnd,
    ) {
        LazyColumn(
            state = lazyState,
        ) {
            itemsIndexed(
                items = flags,
            ) { index, flag ->
                FlagItem(
                    flag = flag,
                    selected = selectedFlag == flag,
                    variant = index % 2 != 0,
                    onSelection = onSelection,
                )
            }
        }
        ReturnToTopButton(
            modifier = Modifier.padding(16.dp),
            lazyState = lazyState,
        )
    }
}

@Composable
private fun FlagItem(
    flag: FlagKit.Flag,
    selected: Boolean,
    variant: Boolean,
    onSelection: (FlagKit.Flag) -> Unit,
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(
                color = when {
                    selected -> MaterialTheme.colorScheme.primary
                    variant -> MaterialTheme.colorScheme.surfaceVariant
                    else -> MaterialTheme.colorScheme.surface
                },
            )
            .clickable {
                onSelection(flag)
            }
            .padding(16.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        val color = if (selected) {
            MaterialTheme.colorScheme.onPrimary
        } else {
            MaterialTheme.colorScheme.onSurface
        }
        Text(
            text = flag.region,
            color = color,
            overflow = TextOverflow.Ellipsis,
            maxLines = 1,
        )
        Text(
            modifier = Modifier
                .alpha(.5f)
                .weight(1f),
            text = flag.name,
            color = color,
        )
        Flag(
            flag = flag,
        )
    }

}

@Composable
fun ReturnToTopButton(
    lazyState: LazyListState,
    modifier: Modifier = Modifier,
    visibleAfterItems: Int = 10,
    coroutineScope: CoroutineScope = rememberCoroutineScope(),
    icon: ImageVector = Icons.Default.ArrowUpward,
    contentDescription: String = stringResource(Res.string.button_return_to_top),
) {
    AnimatedVisibility(lazyState.firstVisibleItemIndex > visibleAfterItems) {
        FilledIconButton(
            modifier = modifier,
            onClick = {
                coroutineScope.launch {
                    lazyState.animateScrollToItem(0)
                }
            },
        ) {
            Icon(
                imageVector = icon,
                contentDescription = contentDescription,
            )
        }
    }
}
