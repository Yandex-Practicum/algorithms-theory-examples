// Словарь "страна по городу"
Map<String, String> countryByCity = Map.of(
    "Moscow", "Russia",
    "Tula", "Russia",
    "London", "UK",
    "Paris", "France",
    "Leon", "France",
    "San Francisco", "USA",
    "New York", "USA"
);

// Присвоить значение по ключу
countryByCity.put("Saint Petersburg", "Russia");
// Получить значение по ключу
String country = countryByCity.get("Tula");
System.out.println("Tula is located in " + country);
