import Foundation

// Ввод числа с клавиатуры
if let input = readLine(), let n = Int(input) {
    // Вычисление и вывод результата
    let result = 42 * n + 15
    print(result)
} else {
    print("Некорректный ввод")
}