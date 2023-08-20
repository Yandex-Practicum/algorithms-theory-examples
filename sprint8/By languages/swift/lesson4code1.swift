func find(text: String, pattern: String, start: Int = 0) -> Int {
    if text.count < pattern.count {
        return -1  // Длинный шаблон не может содержаться в короткой строке.
    }
    for pos in start..<(text.count - pattern.count + 1) {
        // Проверяем, не совпадёт ли шаблон, сдвинутый на позицию pos,
        //   с соответствующим участком строки.
        var match = true
        for offset in 0..<pattern.count {
            if text[text.index(text.startIndex, offsetBy: pos + offset)] != pattern[pattern.index(pattern.startIndex, offsetBy: offset)] {
                // Одного несовпадения достаточно, чтобы не проверять
                //   дальше текущее расположение шаблона.
                match = false
                break
            }
        }
        // Как только нашлось совпадение шаблона, возвращаем его.
        // Это первое вхождение шаблона в строку.
        if match == true {
            return pos
        }
        // Если совпадение не нашлось, цикл перейдёт к проверке следующей позиции.
    }
    // Числом -1 часто маркируют, что подстрока не была найдена,
    //   поскольку в строке нет позиции -1.
    // В качестве альтернативы можно возвращать nil.
    return -1
}
