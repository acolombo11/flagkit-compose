package flagkit

import platform.Foundation.ISOCountryCodes
import platform.Foundation.NSLocale

@Suppress("UNCHECKED_CAST")
actual fun getISOCountries() = NSLocale.ISOCountryCodes as List<String>