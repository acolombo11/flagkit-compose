package eu.acolombo.flagkit.demo.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontWeight

@Composable
fun DemoAppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit,
) {
    MaterialTheme(
        colorScheme = dynamicColorScheme
            ?: if (darkTheme) darkColorScheme() else lightColorScheme(),
        typography = MaterialTheme.typography.copy(
            titleLarge = MaterialTheme.typography.titleLarge.copy(
                fontFamily = PlusJakartaSans,
                fontWeight = FontWeight.ExtraBold,
            ),
            headlineSmall = MaterialTheme.typography.headlineSmall.copy(
                fontFamily = PlusJakartaSans,
                fontWeight = FontWeight.ExtraBold,
            ),
            bodyLarge = MaterialTheme.typography.bodyLarge.copy(
                fontFamily = PlusJakartaSans,
                fontWeight = FontWeight.Medium,
            ),
            labelLarge = MaterialTheme.typography.bodyLarge.copy(
                fontFamily = PlusJakartaSans,
                fontWeight = FontWeight.ExtraBold,
            ),
        ),
        content = content,
    )
}