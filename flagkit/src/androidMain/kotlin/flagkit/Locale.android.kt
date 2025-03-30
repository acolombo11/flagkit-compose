package flagkit

import java.util.Locale

actual fun getISOCountries() = Locale.getISOCountries().toList()