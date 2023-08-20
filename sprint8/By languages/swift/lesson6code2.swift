func prefixFunction(s: String) -> [Int] {
    // Функция возвращает массив длины |s|
    var π = [Int](repeating: 0, count: s.count)
    let sChars = Array(s)
    
    for i in 1..<s.count {
        var k = π[i-1]
        while k > 0 && sChars[k] != sChars[i] {
            k = π[k-1]
        }
        if sChars[k] == sChars[i] {
            k += 1
        }
        π[i] = k
    }
    return π
}
