func prefixFunction(s string) []int {
    // Функция возвращает массив длины |s|
    π := make([]int, len(s))
    for i := 1; i < len(s); i++ {
        k := π[i-1]
        for k > 0 && s[k] != s[i] {
            k = π[k-1]
        }
        if s[k] == s[i] {
            k++
        }
        π[i] = k
    }
    return π
}
