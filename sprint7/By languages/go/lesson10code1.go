// Заполняем массив нулями, так как длина НОВП в худшем случае равна нулю.
// Большую оценку без просмотра последовательностей мы не можем получить.
dp := make([][]int, n+1)
for i := range dp {
    dp[i] = make([]int, m+1)
}
for i := 1; i <= n; i++ {
    for j := 1; j <= m; j++ {
        if A[i-1] == B[j-1] {
            maxLen := 0
            for iPrev := 1; iPrev < i; iPrev++ {
                if A[iPrev-1] >= A[i-1] {
                    continue
                }
                for jPrev := 1; jPrev < j; jPrev++ {
                    maxLen = max(maxLen, dp[iPrev][jPrev])
                }
            }
            dp[i][j] = maxLen + 1
        }
    }
}
// Надо перебрать все пары концов НОВП, чтобы найти оптимальный ответ.
answer := 0
for i := 0; i <= n; i++ {
    for j := 0; j <= m; j++ {
        answer = max(answer, dp[i][j])
    }
}
