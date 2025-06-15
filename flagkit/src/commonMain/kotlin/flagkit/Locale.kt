package flagkit

expect object Locale {
    val language: String?
    val countryCode: String?
    fun getISOCountries() : List<String>
}