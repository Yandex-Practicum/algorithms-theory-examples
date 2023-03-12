func findElement(numbers []int, x int) int {
    for i := 0; i < len(numbers); i++ {  // проходим по всем элементам массива
        if numbers[i] == x {  // сравниваем их с иксом
            return i  // если нашли - возвращаем индекс
        }
    }
    return -1  // если не нашли - возвращаем -1
}