package main

import "fmt"

func main() {
    countryByCity := map[string]string{
        "Moscow":        "Russia",
        "Tula":          "Russia",
        "London":        "UK",
        "Paris":         "France",
        "Leon":          "France",
        "San Francisco": "USA",
        "New York":      "USA",
    }

    // Присвоить значение по ключу
    countryByCity["Saint Petersburg"] = "Russia"

    // Получить значение по ключу
    country := countryByCity["Tula"]
    fmt.Printf("Tula is located in %s\n", country)
}
