// Функция bucket вычисляет номер корзины для указанного фрукта
func bucket(fruit string) int {
    switch fruit {
    case "яблоко":
        return 0
    case "слива":
        return 1
    case "груша":
        return 2
    default:
        panic("Неизвестный фрукт")
    }
}
