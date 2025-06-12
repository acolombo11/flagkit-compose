package flagkit

expect object Locale {
    val language: String?
    val countryCode: String?
    val regionCode: String?
    fun getISOCountries() : List<String>
}