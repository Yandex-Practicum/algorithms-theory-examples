#include <string>

// функция bucket вычисляет номер корзины для указанного фрукта
int bucket(std::string fruit) {
    if (fruit == "яблоко") {
        return 0;
    }
    if (fruit == "слива") {
        return 1;
    }
    if (fruit == "груша") {
        return 2;
    }
    throw "Unknown fruit";
}