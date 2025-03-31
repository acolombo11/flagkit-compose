package eu.acolombo.flagkit.demo

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import flagkit.Flag

@Composable
fun DemoApp() {
    MaterialTheme(
        colorScheme = MaterialTheme.colorScheme.copy(
            background = Color(0xFFDF91BE),
            onBackground = Color.Black,
        )
    ) {
        Scaffold { padding ->
            Column(
                modifier = Modifier
                    .padding(padding)
                    .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                Flag("it")
                Flag("it", style = flagkit.FlagStyle.Circle)
                Flag("it", size = DpSize(84.dp, 60.dp))
                Flag("it", style = flagkit.FlagStyle.Circle, size = DpSize(60.dp, 60.dp))
            }
        }
    }
}