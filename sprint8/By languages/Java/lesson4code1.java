// Найти первое вхождение подстроки pattern в строке text,
//   находящееся на позиции не раньше start.
public static int find(String text, String pattern, int start) {
    if (text.length() < pattern.length()) {
        return -1;  // Длинный шаблон не может содержаться в короткой строке.
    }
    for (int pos = start; pos <= text.length() - pattern.length(); pos++) {
        // Проверяем, не совпадёт ли шаблон, сдвинутый на позицию pos,
        //   с соответствующим участком строки.
        boolean match = true;
        for (int offset = 0; offset < pattern.length(); offset++) {
            if (text.charAt(pos + offset) != pattern.charAt(offset)) {
                // Одного несовпадения достаточно, чтобы не проверять
                //   дальше текущее расположение шаблона.
                match = false;
                break;
            }
        }
        // Как только нашлось совпадение шаблона, возвращаем его.
        // Это первое вхождение шаблона в строку.
        if (match == true) {
            return pos;
        }
        // Если совпадение не нашлось, цикл перейдёт к проверке следующей позиции.
    }
    // Числом -1 часто маркируют, что подстрока не была найдена,
    //   поскольку в строке нет позиции -1.
    // В качестве альтернативы можно возвращать null.
    return -1;
}
