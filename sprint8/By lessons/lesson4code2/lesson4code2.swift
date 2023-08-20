func findAll(text: String, pattern: String) -> [Int] {
    var occurrences = [Int]()
    var start = 0 // Начнём поиск с начала строки.
    // Найдём первое вхождение, если оно есть.
    while true {
        let pos = find(text: text, pattern: pattern, start: start)
        if pos == -1 {
            break
        }
        occurrences.append(pos) // Сохраним вхождение в список.
        start = pos + 1       // И продолжим поиск, начиная с позиции,
                              // следующей за только что найденной.
    }
    return occurrences
}
