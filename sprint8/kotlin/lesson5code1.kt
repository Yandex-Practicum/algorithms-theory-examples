val N = s.length
// Создадим массив π, состоящий из N нулей.
val π = IntArray(N) { 0 }

for (i in 1 until N) {
    // i -- длина подстроки-префикса.
    val substring = s.substring(0, i)
    // Проверяем, перекрывается ли подстрока substring с собой по k символам.
    for (k in (i - 1) downTo 0) {
        // Для этого сравним префикс и суффикс соответствующих длин.
        val prefix = substring.substring(0, k)
        val suffix = substring.substring(i - k, i)
        if (prefix == suffix) {
            π[i - 1] = k  // Запишем значение π-функции.
            break         // Дальше не проверяем -- k идёт в порядке уменьшения.
        }
    }
}
