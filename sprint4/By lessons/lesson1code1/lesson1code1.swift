var countryByCity = [
    "Moscow": "Russia",
    "Tula": "Russia",
    "London": "UK",
    "Paris": "France",
    "Leon": "France",
    "San Francisco": "USA",
    "New York": "USA"
]

// присвоить значение по ключу
countryByCity["Saint Petersburg"] = "Russia"

// получить значение по ключу
let country = countryByCity["Tula"] 
print("Tula is located in \(country)")
