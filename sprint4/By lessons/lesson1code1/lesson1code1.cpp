#include <iostream>
#include <map>
#include <string>

using namespace std;

int main() {
    map<string, string> countryByCity = {
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
    string country = countryByCity["Tula"];
    cout << "Tula is located in " << country << endl;

    return 0;
}
