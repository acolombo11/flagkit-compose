package eu.acolombo.flagkit.demo.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext

actual val dynamicColorScheme: ColorScheme?
    @Composable
    get() {
        val context = LocalContext.current
        val dynamic = Build.VERSION.SDK_INT >= Build.VERSION_CODES.S
        return when {
            isSystemInDarkTheme() && dynamic -> dynamicDarkColorScheme(context)
            isSystemInDarkTheme() -> darkColorScheme()
            dynamic -> dynamicLightColorScheme(context)
            else -> lightColorScheme()
        }
    }
