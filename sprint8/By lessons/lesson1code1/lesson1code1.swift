func insert(string: String, index: Int, substring: String) -> String {
    var modifiedString = string
    let length = string.count
    let shift = substring.count
    
    if index > length {
        // index == length - край строки
        fatalError("Нет такой позиции")
    }
    
    modifiedString = modifiedString.padding(toLength: length + shift, withPad: " ", startingAt: 0)
    
    if length > 0 {
        // Если length == 0, делать сдвиг нет смысла.
        // Кроме того, не следует в вычислениях писать (length - 1),
        // не проверив, что индекс не ноль.
        // В некоторых языках длина представляется беззнаковым целым числом,
        // в таком случае (length - 1) будет равен не -1, а числу MAX_INT,
        // и цикл станет некорректным. Мы этого избегаем.
        for i in stride(from: length - 1, to: index - 1, by: -1) {
            modifiedString.insert(modifiedString[i], at: modifiedString.index(modifiedString.startIndex, offsetBy: i + shift))
        }
    }
    
    for i in 0..<shift {
        let insertionIndex = modifiedString.index(modifiedString.startIndex, offsetBy: index + i)
        modifiedString.insert(contentsOf: substring[i...i], at: insertionIndex)
    }
    
    return modifiedString
}
