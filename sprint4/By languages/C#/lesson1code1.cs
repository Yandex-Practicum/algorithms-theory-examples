using System;
using System.Collections.Generic;

class Program
{
    static void Main()
    {
        Dictionary<string, string> countryByCity = new Dictionary<string, string>()
        {
            {"Moscow", "Russia"},
            {"Tula", "Russia"},
            {"London", "UK"},
            {"Paris", "France"},
            {"Leon", "France"},
            {"San Francisco", "USA"},
            {"New York", "USA"}
        };

        // Присвоить значение по ключу
        countryByCity["Saint Petersburg"] = "Russia";

        // Получить значение по ключу
        string country;
        countryByCity.TryGetValue("Tula", out country);
        Console.WriteLine("Tula is located in " + country);
    }
}
