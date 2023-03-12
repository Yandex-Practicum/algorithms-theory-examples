// Словарь "страна по городу"
val countryByCity = mapOf(
    "Moscow" to "Russia",
    "Tula" to "Russia",
    "London" to "UK",
    "Paris" to "France",
    "Leon" to "France",
    "San Francisco" to "USA",
    "New York" to "USA"
)

// Присвоить значение по ключу
countryByCity["Saint Petersburg"] = "Russia"
// Получить значение по ключу
val country = countryByCity["Tula"]
println("Tula is located in $country")
