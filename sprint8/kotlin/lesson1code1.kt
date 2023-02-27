// Вставить строку substring в строку string перед позицией index.
fun insert(string: StringBuilder, index: Int, substring: String) {
    val length = string.length
    val shift = substring.length
    if (index > length) { // index == length - край строки
        throw IllegalArgumentException("Нет такой позиции")
    }
    string.ensureCapacity(length + shift)
    if (length > 0) {
        // Если length == 0, делать сдвиг нет смысла.
        // Кроме того, не следует в вычислениях писать (length - 1),
        //   не проверив, что индекс не ноль.
        // В некоторых языках длина представляется беззнаковым целым числом,
        //   в таком случае (length - 1) будет равен не -1, а числу MAX_INT,
        //   и цикл станет некорректным. Мы этого избегаем.
        for (i in length - 1 downTo index) {
            string.setCharAt(shift + i, string[i])
        }
    }
    for (i in 0 until shift) {
        string.setCharAt(index + i, substring[i])
    }
}
