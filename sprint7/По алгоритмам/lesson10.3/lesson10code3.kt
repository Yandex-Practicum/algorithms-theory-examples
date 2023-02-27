val dp = Array(n + 1) { Array(m + 1) { 0 } }
for (i in 1..n) {
    var maxVal = 0
    for (j in 1..m) {
        dp[i][j] = dp[i - 1][j]
        if (A[i - 1] == B[j - 1]) {
            dp[i][j] = maxOf(dp[i][j], maxVal + 1)
        }
        if (B[j - 1] < A[i - 1]) {
            maxVal = maxOf(maxVal, dp[i - 1][j])
        }
    }
}
