public static List<Integer> findAll(String text, String pattern) {
    List<Integer> occurrences = new ArrayList<>();
    int start = 0; // Начнём поиск с начала строки.
    // Найдём первое вхождение, если оно есть.
    while (true) {
        int pos = find(text, pattern, start);
        if (pos == -1) {
            break;
        }
        occurrences.add(pos); // Сохраним вхождение в список.
        start = pos + 1;       // И продолжим поиск, начиная с позиции, 
                               // следующей за только что найденной.
    }
    return occurrences;
}
