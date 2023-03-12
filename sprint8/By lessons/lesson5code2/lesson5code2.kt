fun prefix_function(s: String): IntArray {
    // Функция возвращает массив длины |s|
    val π = IntArray(s.length) { 0 }
    for (i in 1 until s.length) {
        var k = π[i - 1]
        while (k > 0 && s[k] != s[i]) {
            k = π[k - 1]
        }
        if (s[k] == s[i]) {
            k++
        }
        π[i] = k
    }
    return π
}
