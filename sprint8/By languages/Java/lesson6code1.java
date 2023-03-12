public static List<Integer> search(String p, String text) {
    // Функция возвращает все позиции вхождения шаблона в тексте.
    List<Integer> result = new ArrayList<>();
    String s = p + "#" + text;
    int[] π = new int[p.length()];  // Массив длины |p|.
    Arrays.fill(π, 0);
    int π_prev = 0;
    for (int i = 1; i < s.length(); i++) {
        int k = π_prev;
        while (k > 0 && s.charAt(k) != s.charAt(i)) {
            k = π[k - 1];
        }
        if (s.charAt(k) == s.charAt(i)) {
            k++;
        }
        // Запоминаем только первые |p| значений π-функции.
        if (i < p.length()) {
            π[i] = k;
        }
        // Запоминаем последнее значение π-функции.
        π_prev = k;
        // Если значение π-функции равно длине шаблона, то вхождение найдено.
        if (k == p.length()) {
            // i - это позиция конца вхождения шаблона.
            // Дважды отнимаем от него длину шаблона, чтобы получить позицию начала:
            //  - чтобы «переместиться» на начало найденного шаблона,
            //  - чтобы не учитывать добавленное "pattern#".
            result.add(i - 2 * p.length());
        }
    }
    return result;
}
