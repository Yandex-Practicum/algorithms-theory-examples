// функция bucket вычисляет номер корзины для указанного фрукта
public int bucket(String fruit) {
    switch (fruit) {
        case "яблоко":
            return 0;
        case "слива":
            return 1;
        case "груша":
            return 2;
        default:
            throw new IllegalArgumentException("Unknown fruit");
    }
}