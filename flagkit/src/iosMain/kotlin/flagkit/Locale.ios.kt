package flagkit

import platform.Foundation.ISOCountryCodes
import platform.Foundation.NSLocale
import platform.Foundation.countryCode
import platform.Foundation.currentLocale
import platform.Foundation.languageCode
import platform.Foundation.regionCode

actual object Locale {
    actual val language: String?
        get() = NSLocale.currentLocale.languageCode
    actual val countryCode: String?
        get() = NSLocale.currentLocale.countryCode // or regionCode

    actual fun getISOCountries(): List<String> = NSLocale.ISOCountryCodes as List<String>
}