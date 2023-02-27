function find_all(text, pattern) {
    let occurrences = [];
    let start = 0; // Начнём поиск с начала строки.
    // Найдём первое вхождение, если оно есть.
    while ((pos = find(text, pattern, start)) !== -1) {
        occurrences.push(pos); // Сохраним вхождение в список.
        start = pos + 1;       // И продолжим поиск, начиная с позиции,
                               // следующей за только что найденной.
    }
    return occurrences;
}
