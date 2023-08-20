let N = s.count
// Создадим массив π, состоящий из N нулей.
var π = [Int](repeating: 0, count: N)

for i in 1..<N {
    // i -- длина подстроки-префикса.
    let substring = String(s.prefix(i))
    // Проверяем, перекрывается ли подстрока substring с собой по k символам.
    for k in stride(from: i - 1, through: 0, by: -1) {
        // Для этого сравним префикс и суффикс соответствующих длин.
        let prefix = String(substring.prefix(k))
        let suffix = String(substring.suffix(i - k))
        if prefix == suffix {
            // Запишем значение π-функции.
            π[i-1] = k
            // Дальше не проверяем -- k идёт в порядке уменьшения.
            break
        }
    }
}
