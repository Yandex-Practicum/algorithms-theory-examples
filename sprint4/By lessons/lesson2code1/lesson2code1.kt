// функция bucket вычисляет номер корзины для указанного фрукта
fun bucket(fruit: String): Int {
    return when (fruit) {
        "яблоко" -> 0
        "слива"  -> 1
        "груша"  -> 2
        else -> throw IllegalArgumentException("Неизвестный фрукт")
    }
}
