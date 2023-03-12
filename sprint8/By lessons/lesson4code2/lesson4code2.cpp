std::vector<int> find_all(const std::string& text, const std::string& pattern) {
    std::vector<int> occurrences;
    int start = 0; // Начнём поиск с начала строки.
    // Найдём первое вхождение, если оно есть.
    int pos;
    while ((pos = find(text, pattern, start)) != -1) {
        occurrences.push_back(pos); // Сохраним вхождение в список.
        start = pos + 1;       // И продолжим поиск, начиная с позиции, 
                               // следующей за только что найденной.
    }
    return occurrences;
}
