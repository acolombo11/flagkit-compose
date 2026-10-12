package flagkit

import java.util.Locale

actual object Locale {
    actual val language: String?
        get() = Locale.getDefault().language
    actual val countryCode: String?
        get() = Locale.getDefault().country

    actual fun getISOCountries(): List<String> = Locale.getISOCountries().toList()
}