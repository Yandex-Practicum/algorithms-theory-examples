// Заполняем массив нулями, так как длина НОВП в худшем случае равна нулю.
// Большую оценку без просмотра последовательностей мы не можем получить.
val dp = Array(n + 1) { IntArray(m + 1) }
for (i in 1..n) {
    for (j in 1..m) {
        if (A[i - 1] == B[j - 1]) {
            var maxLen = 0
            for (iPrev in 1 until i) {
                if (A[iPrev - 1] >= A[i - 1]) {
                    continue
                }
                for (jPrev in 1 until j) {
                    maxLen = maxOf(maxLen, dp[iPrev][jPrev])
                }
            }
            dp[i][j] = maxLen + 1
        }
    }
}

// Надо перебрать все пары концов НОВП, чтобы найти оптимальный ответ.
var answer = 0
for (i in 0..n) {
    for (j in 0..m) {
        answer = maxOf(answer, dp[i][j])
    }
}
