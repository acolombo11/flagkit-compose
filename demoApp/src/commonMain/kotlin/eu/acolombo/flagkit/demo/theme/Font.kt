package eu.acolombo.flagkit.demo.theme

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontVariation
import androidx.compose.ui.text.font.FontWeight
import flagkit_compose.demoapp.generated.resources.PlusJakartaSans_Variable
import flagkit_compose.demoapp.generated.resources.Res
import org.jetbrains.compose.resources.Font

internal val PlusJakartaSans
    @Composable
    get() = FontFamily(
        Font(
            resource = Res.font.PlusJakartaSans_Variable,
            weight = FontWeight.Medium,
            variationSettings = FontVariation.Settings(
                weight = FontWeight.Medium,
                style = FontStyle.Normal,
            ),
        ),
        Font(
            resource = Res.font.PlusJakartaSans_Variable,
            weight = FontWeight.ExtraBold,
            variationSettings = FontVariation.Settings(
                weight = FontWeight.ExtraBold,
                style = FontStyle.Normal,
            ),
        ),
    )