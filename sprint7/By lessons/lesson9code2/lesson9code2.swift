var dp = Array(repeating: Array(repeating: 0, count: m + 1), count: n + 1)

for i in 1...n {
    for j in 1...m {
        // Сначала обновляем состояние согласно второму варианту,
        // когда A[i-1] не входит в НОВП.
        dp[i][j] = dp[i - 1][j]
        
        // Если A[i-1] == B[j-1], то можно сделать обновление dp[i][j] по первому
        // варианту, когда A[i-1] включается в НОВП.
        if A[i - 1] == B[j - 1] {
            var max_val = 0
            for j_prev in 1..<j {
                if B[j_prev - 1] < B[j - 1] {
                    max_val = max(max_val, dp[i - 1][j_prev])
                }
            }
            dp[i][j] = max(dp[i][j], 1 + max_val)
        }
    }
}

// Ответ находится в последней строке таблицы,
// но необязательно в клетке dp[n][m].
var ans = 0
for j in 0...m {
    ans = max(ans, dp[n][j])
}

print(ans)
