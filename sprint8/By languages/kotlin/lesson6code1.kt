fun Search(p: String, text: String): List<Int> {
    // Функция возвращает все позиции вхождения шаблона в тексте.
    val result = mutableListOf<Int>()
    val s = "$p#$text"
    val pi = Array(p.length) { 0 } // Массив длины |p|.
    var piPrev = 0
    for (i in s.indices) {
        var k = piPrev
        while (k > 0 && s[k] != s[i]) {
            k = pi[k - 1]
        }
        if (s[k] == s[i]) {
            k++
        }
        // Запоминаем только первые |p| значений π-функции.
        if (i < p.length) {
            pi[i] = k
        }
        // Запоминаем последнее значение π-функции.
        piPrev = k
        // Если значение π-функции равно длине шаблона, то вхождение найдено.
        if (k == p.length) {
            // i - это позиция конца вхождения шаблона.
            // Дважды отнимаем от него длину шаблона, чтобы получить позицию начала:
            //  - чтобы «переместиться» на начало найденного шаблона,
            //  - чтобы не учитывать добавленное "pattern#".
            result.add(i - 2 * p.length)
        }
    }
    return result
}
