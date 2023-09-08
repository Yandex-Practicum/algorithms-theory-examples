// Функция bucket вычисляет номер корзины для указанного фрукта
int bucket(std::string fruit) {
    if (fruit == "яблоко") {
        return 0;
    } else if (fruit == "слива") {
        return 1;
    } else if (fruit == "груша") {
        return 2;
    } else {
        throw std::invalid_argument("Неизвестный фрукт");
    }
}
