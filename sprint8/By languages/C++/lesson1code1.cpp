#include <string>
#include <stdexcept>

// Вставить строку substring в строку string перед позицией index.
std::string insert(std::string string, int index, std::string substring) {
    int length = string.length();
    int shift = substring.length();
    if (index > length) {
        // index == length - край строки
        throw std::invalid_argument("Нет такой позиции");
    }
    string.resize(length + shift, ' ');
    if (length > 0) {
        // Если length == 0, делать сдвиг нет смысла.
        // Кроме того, не следует в вычислениях писать (length - 1),
        // не проверив, что индекс не ноль.
        // В некоторых языках длина представляется беззнаковым целым числом,
        // в таком случае (length - 1) будет равен не -1, а числу MAX_INT,
        // и цикл станет некорректным. Мы этого избегаем.
        for (int i = length - 1; i >= index; i--) {
            string[i + shift] = string[i];
        }
    }
    for (int i = 0; i < shift; i++) {
        string[index + i] = substring[i];
    }
    return string;
}
