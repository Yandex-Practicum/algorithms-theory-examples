func findElement(in numbers: [Int], x: Int) -> Int {
    for i in 0..<numbers.count { // Проходим по всем элементам массива
        if numbers[i] == x { // Сравниваем элемент с x
            return i // Если нашли, возвращаем индекс
        }
    }
    return -1 // Если не нашли, возвращаем -1
}
