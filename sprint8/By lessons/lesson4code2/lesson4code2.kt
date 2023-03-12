fun findAll(text: String, pattern: String): List<Int> {
    val occurrences = mutableListOf<Int>()
    var start = 0 // Начнём поиск с начала строки.
    // Найдём первое вхождение, если оно есть.
    while (true) {
        val pos = find(text, pattern, start)
        if (pos == -1) {
            break
        }
        // Сохраним вхождение в список.
        occurrences.add(pos)
        // И продолжим поиск, начиная с позиции, следующей за только что найденной.
        start = pos + 1
    }
    return occurrences
}
