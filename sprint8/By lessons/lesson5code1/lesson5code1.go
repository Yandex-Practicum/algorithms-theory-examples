N := len(s)
// Создадим массив π, состоящий из N нулей.
π := make([]int, N)

for i := 1; i < N; i++ {
    // i -- длина подстроки-префикса.
    substring := s[0:i]
    // Проверяем, перекрывается ли подстрока substring с собой по k символам.
    for k := i - 1; k >= 0; k-- {
        // Для этого сравним префикс и суффикс соответствующих длин.
        prefix := substring[0:k]
        suffix := substring[i-k:i]
        if prefix == suffix {
            // Запишем значение π-функции.
            π[i-1] = k
            // Дальше не проверяем -- k идёт в порядке уменьшения.
            break
        }
    }
}
