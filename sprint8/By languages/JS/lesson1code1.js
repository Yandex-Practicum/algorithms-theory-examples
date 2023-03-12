// Вставить строку substring в строку string перед позицией index.
function insert(string, index, substring) {
    let length = string.length;
    let shift = substring.length;
    if (index > length) {
        // index == length - край строки
        throw new Error("Нет такой позиции");
    }
    string = string.padEnd(length + shift);
    if (length > 0) {
        // Если length == 0, делать сдвиг нет смысла.
        // Кроме того, не следует в вычислениях писать (length - 1),
        // не проверив, что индекс не ноль.
        // В некоторых языках длина представляется беззнаковым целым числом,
        // в таком случае (length - 1) будет равен не -1, а числу MAX_INT,
        // и цикл станет некорректным. Мы этого избегаем.
        for (let i = length - 1; i >= index; i--) {
            string = string.substring(0, i + shift) + string.charAt(i) + string.substring(i + shift + 1);
        }
    }
    for (let i = 0; i < shift; i++) {
        string = string.substring(0, index + i) + substring.charAt(i) + string.substring(index + i + 1);
    }
    return string;
}
