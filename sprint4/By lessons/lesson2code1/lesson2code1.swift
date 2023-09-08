// Функция bucket вычисляет номер корзины для указанного фрукта
func bucket(fruit: String) -> Int {
    switch fruit {
    case "яблоко":
        return 0
    case "слива":
        return 1
    case "груша":
        return 2
    default:
        fatalError("Неизвестный фрукт")
    }
}
