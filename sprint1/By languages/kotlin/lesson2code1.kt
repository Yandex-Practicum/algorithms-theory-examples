fun findElement(numbers: List<Int>, x: Int): Int {
    for (i in numbers.indices) { // проходим по всем элементам массива
        if (numbers[i] == x) { // сравниваем их с иксом
            return i  // если нашли - возвращаем индекс
        }
    }
    return -1  // если не нашли - возвращаем -1
}