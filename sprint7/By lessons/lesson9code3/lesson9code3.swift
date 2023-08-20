var dp = Array(repeating: Array(repeating: 0, count: m + 1), count: n + 1)

for i in 1...n {
    var max_val = 0
    for j in 1...m {
        dp[i][j] = dp[i - 1][j]
        if A[i - 1] == B[j - 1] {
            dp[i][j] = max(dp[i][j], max_val + 1)
        }
        if B[j - 1] < A[i - 1] {
            max_val = max(max_val, dp[i - 1][j])
        }
    }
}
