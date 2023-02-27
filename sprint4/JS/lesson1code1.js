const countryByCity = new Map([
    ["Moscow", "Russia"],
    ["Tula", "Russia"],
    ["London", "UK"],
    ["Paris", "France"],
    ["Leon", "France"],
    ["San Francisco", "USA"],
    ["New York", "USA"]
]);

// Присвоить значение по ключу
countryByCity.set("Saint Petersburg", "Russia");

// Получить значение по ключу
const country = countryByCity.get("Tula");
console.log(`Tula is located in ${country}`);
