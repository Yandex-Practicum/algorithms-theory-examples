country_by_city = {
    "Moscow": "Russia",
    "Tula": "Russia",
    "London": "UK",
    "Paris": "France",
    "Leon": "France",
    "San Francisco": "USA",
    "New York": "USA",
}

# присвоить значение по ключу
country_by_city["Saint Petersburg"] = "Russia"
# получить значение по ключу
country = country_by_city["Tula"]
print(f"Tula is located in {country}")